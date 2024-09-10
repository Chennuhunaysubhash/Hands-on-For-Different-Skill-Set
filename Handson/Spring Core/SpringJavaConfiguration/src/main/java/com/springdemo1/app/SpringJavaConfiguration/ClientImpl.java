package com.springdemo1.app.SpringJavaConfiguration;



public class ClientImpl implements Client {
	 
    private Service service;
    
    public ClientImpl(Service b) {
        this.service = b;
    }

	public void doSomething(String str) {
		// TODO Auto-generated method stub
		String info = service.getInfo(str);
        System.out.println(info);
	}
 
}
