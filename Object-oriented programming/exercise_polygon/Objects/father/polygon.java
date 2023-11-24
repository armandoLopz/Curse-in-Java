package exercise_polygon.Objects.father;

public abstract class polygon {

    private int side1, side2, side3, side4 , angle , angle2, angle3;
    private final String grades;

    public polygon(int hipotenusa, int angle_hipotenusa , int cathetus_adjacent, int angle_cathetusadjacent, int cathetus_opposite, int angle_cathetusopposite ){
        
        this.side1 = hipotenusa;
        this.angle = angle_hipotenusa;

        this.side2 = cathetus_adjacent;
        this.angle2 = cathetus_adjacent;

        this.side3 = cathetus_opposite;
        this.angle3 = cathetus_opposite;
        grades = "°";
    }

    public polygon(int sides_bottom_top, int sides_left_rigth){

        this.side1 = sides_bottom_top;
        this.side4 = sides_bottom_top;

        this.side2 = sides_left_rigth;
        this.side3 = sides_left_rigth;
        
        angle = 90;
        grades = "°";
        
        
    }
         public abstract String area();
         // public abstract int perimeter(int side , int altura);
}
