package Printer;

public enum Type {
    Laser_LED("Лазерный и светодиодный"),
    Inkjet("Струйный"),
    Sublimation("Сублимационный"),
    Thermal("Термопечать");
    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
