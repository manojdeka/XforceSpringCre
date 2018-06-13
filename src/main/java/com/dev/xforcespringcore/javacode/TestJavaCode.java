package com.dev.xforcespringcore.javacode;


public class TestJavaCode {
	public static void main(String[] args) {
		Person p = new Person();
		p.setEmail("somthing@gmail.com");
		p.setName("Blake");
		SoftwareDeveloper sd = new SoftwareDeveloper();
		p.setJob(sd);
		p.getJob().doJob();
	}
}