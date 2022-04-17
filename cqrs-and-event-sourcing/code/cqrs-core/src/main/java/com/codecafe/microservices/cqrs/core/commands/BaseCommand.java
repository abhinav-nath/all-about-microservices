package com.codecafe.microservices.cqrs.core.commands;

import com.codecafe.microservices.cqrs.core.messages.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public abstract class BaseCommand extends Message {

  public BaseCommand(String id) {
    super(id);
  }

}