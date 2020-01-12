package LaboratoriumEnums;

public enum Directions {
    NORTH("Północ", "North", "N"),
    EAST("Wschód", "East", "E"),
    WEST("Zachód", "West", "W"),
    SOUTH("Południe", "South", "S"),
    NORTHEAST("Północny-Wschód", "North East", "NE"),
    SOUTHEAST("Południowy-Wschód", "South East", "SE"),
    NORTHWEST("Północny-Zachód", "North West", "NW"),
    SOUTHWEST("Południowy-Zachód", "South West", "SW");

    private String polishname;
    private String englishname;
    private String shortform;

    Directions(String polishname, String englishname, String shortform) {
        this.polishname = polishname;
        this.englishname = englishname;
        this.shortform = shortform;
    }

    public String getPolishname() {
        return polishname;
    }

    public String getEnglishname() {
        return englishname;
    }

    public String getShortform() {
        return shortform;
    }
}
