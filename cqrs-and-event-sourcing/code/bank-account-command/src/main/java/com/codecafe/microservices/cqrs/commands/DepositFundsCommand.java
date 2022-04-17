package com.codecafe.microservices.cqrs.commands;

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