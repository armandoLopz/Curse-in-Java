package exercise_polygon.Objects.father.sons;

import exercise_polygon.Objects.father.polygon;

public class triangle extends polygon {

    private int side1, side2, side3, angle , angle2, angle3;
    private final String cm;

    public triangle(int side_hipo, int angles_hipo, int side_ady, int angle_adya, int side_opp, int angle_opp){

        super(side_hipo, angles_hipo, side_ady, angle_adya, side_opp, angle_opp);

        side1 = side_hipo;
        angle = angles_hipo;

        side2 = side_ady;
        angle2 = angle_adya;

        side3 = side_opp;
        angle3 = angle_opp;

        if (angle+angle2+angle3 != 180) {

            System.out.println("La suma de los angulos debe ser igual a 180 grados" );
            
        }

        cm = "cm";

    }

    public String area(){

        double area_rectangule = (side2*side3)/2;
        return area_rectangule + " " + cm;
    }
}
