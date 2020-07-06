package dip;

public class App {

	public static void main(String[] args) {
		
		HPColoredPrinter printer1 = new HPColoredPrinter();
		
		PrinterDesk pdf = new PrinterDesk(printer1);
		
		pdf.printFile();

	}

}
