package com.cpl.util;

public class SendEmailThread extends Thread {
    public void run(){
    	int i=0;
       try {
    	   while(true){
			  Thread.sleep(10*1000);
			  System.out.println("sending" +" " + (++i) + " "+ "mail");
    	   }
    	   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
