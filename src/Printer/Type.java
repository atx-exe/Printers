package Printer;

public enum Type {
    Printer("Принтер"),
    mfd("МФУ");
    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
