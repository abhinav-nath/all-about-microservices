package com.codecafe.microservices.cqrs.commands;

import com.codecafe.microservices.cqrs.dto.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpenAccountCommand extends BaseCommand {

  private String accountHolder;
  private AccountType accountType;
  private double openingBalance;

}