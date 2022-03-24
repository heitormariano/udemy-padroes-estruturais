package br.com.udemy.adapter.tvport.client;

import br.com.udemy.adapter.tvport.adapters.HDMIToOldMonitorAdapter;
import br.com.udemy.adapter.tvport.adapters.HDMIToVGAAdapter;
import br.com.udemy.adapter.tvport.devices.Computer;
import br.com.udemy.adapter.tvport.devices.OldMonitor;
import br.com.udemy.adapter.tvport.devices.TV;

public class Client {

	public static void main(String[] args) {

		System.out.println("------ Computer and TV ----------");
		Computer pc = new Computer();
		TV tv = new TV();

		pc.connectPort(tv);
		pc.sendImageAndSound("Person talking", "bla, bla, bla");
		System.out.println();

		System.out.println("----------- Old Monitor ------------");
		Computer pc2 = new Computer();
		OldMonitor oldMonitor = new OldMonitor();

		pc2.connectPort(new HDMIToVGAAdapter(oldMonitor));
		pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		System.out.println();

		System.out.println("------ Monitor Class Adapter ------");

		Computer pc3 = new Computer();
		pc3.connectPort(new HDMIToOldMonitorAdapter());
		pc3.sendImageAndSound("Person talking", "bla, bla, bla");
		System.out.println();
	}
}
