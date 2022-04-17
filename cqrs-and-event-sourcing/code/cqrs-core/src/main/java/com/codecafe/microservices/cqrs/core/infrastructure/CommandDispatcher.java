package com.codecafe.microservices.cqrs.core.infrastructure;

import com.codecafe.microservices.cqrs.core.commands.BaseCommand;
import com.codecafe.microservices.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

  <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handlerMethod);

  void send(BaseCommand baseCommand);

}