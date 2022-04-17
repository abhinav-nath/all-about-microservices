package com.codecafe.microservices.cqrs.commands;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CloseAccountCommand extends BaseCommand {

  CloseAccountCommand(String id) {
    super(id);
  }

}