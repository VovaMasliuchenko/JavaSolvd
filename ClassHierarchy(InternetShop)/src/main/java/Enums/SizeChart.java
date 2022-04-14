package Enums;

public enum SizeChart {

    S("S-size"),
    M("M-size"),
    L("L-size"),
    XL("XL-size"),
    XXL("XXL-size");

    private final String value;

    SizeChart(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


