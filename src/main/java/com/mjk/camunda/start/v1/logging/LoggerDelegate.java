package com.mjk.camunda.start.v1.logging;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class LoggerDelegate implements JavaDelegate {

	private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("--------- Logger called!!!!! ---------");
		LOGGER.info("Logging from " + execution.getCurrentActivityName());
	}

}
