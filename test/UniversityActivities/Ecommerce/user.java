package test.UniversityActivities.Ecommerce;

public class user {
    
    private String name, lastName, email, direction; 
    //private int id;

    public user(String name, String lastName, String email, String direction){

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.direction = direction;

    }

    //METHODS 

    public String detailsUser(){

        return "Nombre: " + name + "\nApellido: " + lastName + "\nEmail: " + email + "\nDireccion: " + direction;
    }

    //GETTERS 

    public String getNameUser(){

        return name;
    }

    public String getLastName(){

        return lastName;
    }

    public String getEmailUser(){

        return email;
    }

    public String getDirectionUser(){

        return direction;
    }

    //Setters 

    public void setNameUser(String name){

        this.name = name;
    }

    public void setLastNameUser(String lastName){

        this.lastName = lastName;
    }

    public void setEmailUser(String email){

        this.email = email;
    }

    public void setDirectionUser(String direction){

        this.direction = direction;
    }

}
