package Printer;

public enum PrintType {
    Laser_LED("Лазерный и светодиодный"),
    Inkjet("Струйный"),
    Sublimation("Сублимационный"),
    Thermal("Термопечать");
    private final String printType;

    PrintType(String printType) {
        this.printType = printType;
    }

    public String getPrintType() {
        return printType;
    }
}
