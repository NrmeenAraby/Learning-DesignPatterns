package Adapter.PrinterExample;

//Adapter extends/implements the thing that is used in client code.
public class PrinterAdapter implements Printer{

    private OldPrinter old;
    public  PrinterAdapter(OldPrinter old){
        this.old=old;
    }

    public void print(String txt){  // the function the client code use
        old.printChars(txt.toCharArray());
    }
}
