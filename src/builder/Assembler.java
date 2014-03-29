package builder;
import composite.GeneralPart;
import composite.PartComponent;
import composite.RawPart;


public class Assembler {
	public PartComponent AssembleTV(){
		PartComponent TV = new GeneralPart("P001", "TV");
		TV.Add(AssembleTube());
		TV.Add(AssembleScreen());
		return TV;
	}

	private PartComponent AssembleTube() {
		PartComponent tube = new GeneralPart("P010", "Tube");
		PartComponent capacitor = new RawPart("P011", "Capacitor", 3.00);
		PartComponent screw = new RawPart("P012", "Screw", 1.00);
		tube.Add(capacitor);
		tube.Add(screw);
		return tube;
	}
	
	private PartComponent AssembleScreen() {
		PartComponent screen = new GeneralPart("P020", "Screen");
		PartComponent glass = new RawPart("P021", "Glass", 10.00);
		PartComponent diode = new RawPart("P022", "Diode", 1.50);
		screen.Add(glass);
		screen.Add(diode);
		return screen;
	}
	
	public PartComponent AssembleLaptop() {
		PartComponent laptop = new GeneralPart("P002", "Laptop");
		laptop.Add(AssembleLaptopBase());
		laptop.Add(AssembleScreen());
		return laptop;
	}

	private PartComponent AssembleLaptopBase() {
		PartComponent laptopBase = new GeneralPart("P040", "Laptop Base");
		PartComponent keyboard = new RawPart("P041", "Keyboard", 5.00);
		PartComponent CPU = new RawPart("P043", "CPU", 50.00);
		laptopBase.Add(keyboard);
		laptopBase.Add(CPU);
		laptopBase.Add(AssembleMainBoard());
		return laptopBase;
	}

	private PartComponent AssembleMainBoard() {
		PartComponent mainBoard = new GeneralPart("P042", "Main Board");
		PartComponent USBPort = new RawPart("P051", "USBPort", 5.00);
		PartComponent HDMIPort = new RawPart("P052", "HDMIPort", 7.00);
		mainBoard.Add(USBPort);
		mainBoard.Add(HDMIPort);
		return mainBoard;
	}
}
