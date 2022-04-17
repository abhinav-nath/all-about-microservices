package com.codecafe.microservices.cqrs.account.common.events;

import com.codecafe.microservices.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FundsWithdrawnEvent extends BaseEvent {

  private double amount;

}