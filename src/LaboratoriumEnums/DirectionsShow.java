package LaboratoriumEnums;

public class DirectionsShow {

    private Directions direction;

    public DirectionsShow(Directions direction) {
        this.direction = direction;
    }

    public static void main(String[] args) {

        DirectionsShow direction1 = new DirectionsShow(Directions.EAST);
        DirectionsShow direction2 = new DirectionsShow(Directions.WEST);
        DirectionsShow direction3 = new DirectionsShow(Directions.NORTHWEST);


        System.out.println("Polska nazwa kierunku świata to: " + direction1.direction.getPolishname());
        System.out.println("Angielska nazwa kierunku świata to: " + direction2.direction.getEnglishname());
        System.out.println("Skrót kierunku świata to: " + direction3.direction.getShortform());

        System.out.println(".............................");

        System.out.println("Polska nazwa kierunku świata to: " + Directions.EAST.getPolishname());
        System.out.println("Angielska nazwa kierunku świata to: " + Directions.NORTH.getEnglishname());
        System.out.println("Skrót północnego wschodu to: " + Directions.NORTHWEST.getShortform());

        System.out.println();
    }
}

