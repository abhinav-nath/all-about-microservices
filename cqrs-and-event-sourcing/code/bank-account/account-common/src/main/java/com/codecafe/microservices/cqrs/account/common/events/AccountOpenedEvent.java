package com.codecafe.microservices.cqrs.account.common.events;

import com.codecafe.microservices.cqrs.account.common.dto.AccountType;
import com.codecafe.microservices.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AccountOpenedEvent extends BaseEvent {

  private String accountHolder;
  private AccountType accountType;
  private Date createdDate;
  private double openingBalance;

}