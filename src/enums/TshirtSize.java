package enums;

public enum TshirtSize {
    S(48,71,36),
    M(52,74,38),
    L(56,76,41),
    XL(61,79,41);

    private int chestWidth;
    private int shirtLenght;
    private int sleeveLength;

    TshirtSize(int chestWidth, int shirtLenght, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLenght = shirtLenght;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLenght() {
        return shirtLenght;
    }

    public int getSleeveLenght() {
        return sleeveLength;
    }
}
