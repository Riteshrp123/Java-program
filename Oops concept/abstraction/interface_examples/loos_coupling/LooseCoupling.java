package com.xworkz.corejava.abstraction.interface_examples.loos_coupling;

public class LooseCoupling {
	public static void main(String[] args) {
		
		Sony sony = new Sony();
		Epson epson = new Epson();
		Computer computer = new Computer();
		
		
		computer.slot(epson);
		computer.slot(sony);
	}

}
