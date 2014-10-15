package MoneyCalculator;

public class Currency {

    private final int code;
    private final String symbol;
    private final String name;

    public Currency(int code, String symbol, String name) {
        this.code = code;
        this.symbol = symbol;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
