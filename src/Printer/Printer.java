package Printer;

public class Printer {
    private String serialNumber;
    private Manufacture manufacture;
    private Type type;
    private PrintingTechnology printingTechnology;
    private PrintType printType;
    private boolean isColour;
    private PaperFormat maxPaperFormat;
    private boolean isFax;
    private boolean isPhone;
    private boolean isTwoSidePrint;
    private int numberOfConnectionFormats;
    private ConnectionInterface[] connectionInterface = new ConnectionInterface[numberOfConnectionFormats];
    private boolean isCISS;
    private boolean isNFC;

}
