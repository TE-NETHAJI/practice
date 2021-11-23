package com.te.singleton.structuraldp;

public class RealInterntAcess implements OfficeInternet {
	
	private String employeeName;
	
	public  RealInterntAcess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void getInternetAcess() {
		grantInternetAcess();
		
	}
	
	public void grantInternetAcess() {
		System.out.println("internet acess is provided for "+employeeName);
	}
	
	

}
