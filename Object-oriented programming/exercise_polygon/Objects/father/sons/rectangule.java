package exercise_polygon.Objects.father.sons;

import exercise_polygon.Objects.father.polygon;

public class rectangule extends polygon{

    private int sidebottom_top, siderigth_left;
    private final String cm;

    public rectangule(int sides_bottom_top, int sides_rigth_left ){

        super(sides_bottom_top, sides_rigth_left);

        sidebottom_top = sides_bottom_top;
        siderigth_left = sides_rigth_left;

        cm = "cm";

        // Ver si necesito instanciar el angulo desde esta clase 
        // Validar angulos

    }

    public String area(){

        double area_rectangule = sidebottom_top*siderigth_left;

        return area_rectangule + " " + cm;
    }
}
