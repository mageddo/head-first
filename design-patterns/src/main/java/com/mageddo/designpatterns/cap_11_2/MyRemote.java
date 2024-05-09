package com.mageddo.designpatterns.cap_11_2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	String sayHello() throws RemoteException;
}
