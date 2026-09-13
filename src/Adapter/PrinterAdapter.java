package Adapter;

public class PrinterAdapter implements Printer{

    private OldPrinter old;
    public  PrinterAdapter(OldPrinter old){
        this.old=old;
    }

    public void print(String txt){
        old.printChars(txt.toCharArray());
    }
}
