package com.mjk.camunda.start.v1.learn;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FirstServiceClass implements JavaDelegate {

	String name = "John Doe";
	long salary;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		// TODO Auto-generated method stub
		Random rand = new Random();
		salary = rand.longs(100, 200000).findFirst().getAsLong();
		System.out.println("--------- First service called!!!!! ---------" + "\n" + "Salary: " + this.salary );
		execution.setVariable("name", this.name);
		execution.setVariable("salary", this.salary);

	}

}