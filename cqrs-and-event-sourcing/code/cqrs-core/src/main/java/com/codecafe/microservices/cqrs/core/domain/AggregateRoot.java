package com.codecafe.microservices.cqrs.core.domain;

import com.codecafe.microservices.cqrs.core.events.BaseEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public abstract class AggregateRoot {

  protected String id;
  private int version = -1;

  private final List<BaseEvent> changes = new ArrayList<>();

  public String getId() {
    return id;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public List<BaseEvent> getUncommittedChanges() {
    return changes;
  }

  public void markChangesAsCommitted() {
    changes.clear();
  }

  protected void applyChange(BaseEvent event, boolean isNewEvent) {
    try {
      var method = getClass().getDeclaredMethod("apply", event.getClass());
      method.setAccessible(true);
      method.invoke(this, event);
    } catch (NoSuchMethodException ex) {
      log.error("The apply method was not found in the aggregate for {}", event.getClass().getName());
    } catch (Exception e) {
      log.error("Error applying event to aggregate");
    } finally {
      if (isNewEvent) {
        changes.add(event);
      }
    }
  }

  public void raiseEvent(BaseEvent event) {
    applyChange(event, true);
  }

  public void replayEvents(Iterable<BaseEvent> events) {
    events.forEach(event -> applyChange(event, false));
  }

}