package com.codecafe.microservices.cqrs.core.events;

import com.codecafe.microservices.cqrs.core.messages.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class BaseEvent extends Message {

  private int version;

  public BaseEvent(String id, int version) {
    super(id);
    this.version = version;
  }

}