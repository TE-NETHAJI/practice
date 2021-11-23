package com.te.designpatterns.creational.factory;

import com.te.singleton.structuraldp.OfficeInternet;
import com.te.singleton.structuraldp.ProxyInternetAcess;

public class ProxyDPTest {

	public static void main(String[] args) {

		OfficeInternet internet = new ProxyInternetAcess("nethaji");
		internet.getInternetAcess();
	}

}
