package client;

import builder.Assembler;
import composite.PartComponent;


public class ClientProgram {

	public static void main(String[] args) {
		Assembler assembler = new Assembler();
		
		PartComponent TV = assembler.AssembleTV();	
		TV.Print();	
		
		PartComponent laptop = assembler.AssembleLaptop();
		laptop.Print();
	}
}
