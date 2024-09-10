package com.myspring.app.SpringXmlSetterDependency;

public class ClientA implements Client{
	Service service;
	public ClientA() {
        
    }
	public void doSomething(String str) {
		// TODO Auto-generated method stub
		String info = service.getInfo(str);
		System.out.println(info);
	}
	public void setService(Service service) {
        this.service = service;
    }
	
}
