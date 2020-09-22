package Printer;

public enum PrintingTechnology {
    Laser("Лазерный"),
    Piezaelectric_inkjet("Пьезаэлектрическая струйная"),
    LED("Светодиодная"),
    Sublimation("Сублимационная"),
    Thermal_inkjet("Термическая струйная"),
    Thermal_printing("Термопечать");
    private final String printingTechnology;

    PrintingTechnology(String printingTechnology) {
        this.printingTechnology = printingTechnology;
    }

    public String getString() {
        return printingTechnology;
    }
}
