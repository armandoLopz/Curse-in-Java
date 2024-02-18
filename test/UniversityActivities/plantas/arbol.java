package test.UniversityActivities.plantas;

public class arbol extends planta{

    private String typeTronco, colorArbol, typeSeeds;
    private double radioTronco;


    public arbol(){

        super();
    }
    
    public arbol(String name, String clima, double heigth, boolean hojas, String typeTronco, double radioTronco, String colorArbol, String typeSeeds){

        super(name, clima, heigth, hojas);

        this.typeSeeds = typeSeeds;
        this.typeTronco = typeTronco;
        this.colorArbol = colorArbol;
        this.radioTronco = radioTronco;
    }

    //GETTERS 

    public String getTypeSeedString(){

        return typeSeeds;
    }

    public String getColorArbol(){

        return colorArbol;
    }

    public String typeTronco(){

        return typeTronco;

    }

    public double getRadioTronco(){

        return radioTronco;
    }

    //Setters 

    public void setTypeSeedS(String typeSeeds){

        this.typeSeeds = typeSeeds;
    }

    public void setRadioTronco(double radioTronco){

        this.radioTronco = radioTronco;
    }

    public void setTypeTronco(String typeTronco){

        this.typeTronco = typeTronco;
    }

    public void setColorArbol(String typeTronco){

        this.typeTronco = typeTronco;
    }
}
