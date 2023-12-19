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

        return "Nombre: " + name + "\n Apellido: " + lastName + "\nEmail: " + email + "\nDireccion: " + direction;
    }
}
