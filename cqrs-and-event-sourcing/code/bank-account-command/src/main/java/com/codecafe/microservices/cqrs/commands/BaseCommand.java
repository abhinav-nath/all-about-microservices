package com.codecafe.microservices.cqrs.commands;

import com.codecafe.microservices.cqrs.messages.Message;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BaseCommand extends Message {

  BaseCommand(String id) {
    super(id);
  }

}