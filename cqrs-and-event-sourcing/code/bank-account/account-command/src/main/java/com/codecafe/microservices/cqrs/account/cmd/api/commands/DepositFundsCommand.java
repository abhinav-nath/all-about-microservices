package com.codecafe.microservices.cqrs.account.cmd.api.commands;

import com.codecafe.microservices.cqrs.core.commands.BaseCommand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepositFundsCommand extends BaseCommand {

  private double amount;

}