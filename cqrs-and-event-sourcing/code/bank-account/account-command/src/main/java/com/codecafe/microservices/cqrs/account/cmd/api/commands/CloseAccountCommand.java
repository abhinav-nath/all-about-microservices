package com.codecafe.microservices.cqrs.account.cmd.api.commands;

import com.codecafe.microservices.cqrs.core.commands.BaseCommand;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CloseAccountCommand extends BaseCommand {

  public CloseAccountCommand(String id) {
    super(id);
  }

}