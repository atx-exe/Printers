package Printer;

public enum PrintType {
    Printer("Принтер"),
    mfd("МФУ");
    private String printType;

    PrintType(String printType) {
        this.printType = printType;
    }

    public String getPrintType() {
        return printType;
    }
}
