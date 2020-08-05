package com.iopts.main;

public class BatchMain {
	public static void main(String[] args) {

		Thread th = new Thread(new DaemonThread());
		th.start();
	}

}
