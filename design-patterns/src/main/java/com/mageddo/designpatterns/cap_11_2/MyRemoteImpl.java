package com.mageddo.designpatterns.cap_11_2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	public MyRemoteImpl() throws RemoteException {
		
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() throws RemoteException {
		return "O servidor disse, oi";
	}

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
