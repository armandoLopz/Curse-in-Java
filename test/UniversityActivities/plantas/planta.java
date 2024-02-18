package test.UniversityActivities.plantas;

public class planta {

    private String name, clima;
    private double heigth;
    private boolean hojas;

    public planta(){

        //Constructor vacio para iniciar el objeto sin darle los valores
        
    }

    public planta(String name, String clima, double heigth, boolean hojas){

        //Constructor con la instanciacion de los atributos 
        this.name = name;
        this.clima = clima;
        this.heigth = heigth;
        this.hojas = hojas;
        
    }

    //Getters 

    public String GetName(){

        return name;
    }

    public String GetClima(){

        return clima;
    }

    public double GetHeigth(){

        return heigth;
    }

    public boolean GetHojas(){

        return hojas;
    }

    //Setters 

    public void SetName(String name){

        this.name = name;
    }

    public void setClima(String clima){

        this.clima = clima;
    }

    public void setHeigth(double heigth){

        this.heigth = heigth;
    }

    public void setHojas(boolean hojas){

        this.hojas = hojas;
    }
    
    
}
