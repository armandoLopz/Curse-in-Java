package test.UniversityActivities.plantas;

public class flor extends planta {
    
    private String colorPetalos, colorPistillo, estacion;
    private double cantidadPromedioPetalos;

    public flor(){

        super();
    }

    public flor(String name, String clima, double heigth, boolean hojas, String colorPetalos,String colorPistillo,String estacion, double cantidadPromedioPetalos){

        super(name, clima, heigth, hojas);

        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPetalos = colorPetalos;
        this.colorPistillo = colorPistillo;
        this.estacion = estacion;

    }
}
