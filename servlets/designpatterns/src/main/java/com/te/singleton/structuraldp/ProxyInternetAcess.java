package com.te.singleton.structuraldp;

public class ProxyInternetAcess implements OfficeInternet{
	
	private String employeeName;
	
	private RealInterntAcess internetAcess;
	
	public ProxyInternetAcess(String employeeName) {
		this.employeeName =employeeName;
		
	}

	@Override
	public void getInternetAcess() {
	if(getLevel() > 5) {
		internetAcess = new RealInterntAcess(employeeName);
		internetAcess.getInternetAcess();
	}else {
		System.out.println("level is below 5");
	}
		
	}
	
	public long getLevel() {
		return Math.round(Math.random()*10);
		
	}

}
