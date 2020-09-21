package Printer;

public enum Manufacture {
    Brother("Brother"),
    Canon("Canon"),
    DNP("DNP"),
    Epson("Epson"),
    Fujifilm("Fujifilm"),
    HP("Hewlett-Packard"),
    Huawei("Huawei"),
    Kodak("Kodak"),
    Konica_Minolta("Konica Minolta"),
    Kyocera("Kyocera"),
    Lexmark("Lexmark"),
    Lifeprint("Lifeprint"),
    Mimaki("Mimaki"),
    Mitsubishi_Electric("Mitsubishi Electric"),
    OKI("OKI"),
    Panasonic("Panasonic"),
    Pantum("Pantum"),
    Polaroid("Polaroid"),
    Ricoh("Ricoh"),
    Roland("Roland"),
    ROWE("ROWE"),
    Samsung("Samsung"),
    Sharp("Sharp"),
    Tktbrainpower("Tktbrainpower"),
    Toshiba("Toshiba"),
    Xerox("Xerox"),
    Xiaomi("Xiaomi");
    private String manufacture;

    Manufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getString() {
        return manufacture;
    }
}
