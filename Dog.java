//************************************************
//  Author: Steven Smail
//
//  Dog.java
//
//  Represents a dog.
//************************************************
import java.util.Calendar;

public class Dog extends Animal
{
    // Instance variables
    private String breed;
    private String favorite_treat;

    //-----------------------------------------------------
    // Constructor - Initializes instance variables.
    //-----------------------------------------------------
    public Dog(String name, String owner_name, Calendar dob,
               String breed, String favorite_treat)
    {
        super("Dog", name, owner_name, dob);
        this.breed = breed;
        this.favorite_treat = favorite_treat;
    }

    public String toString()
    {
        return super.toString() +
               " Breed:" + breed +
               " Favorite treat:" + favorite_treat;
    }

    //------------------------------------------------------
    // Accessor methods
    //------------------------------------------------------
    public String Breed() { return breed; }
    public String Favorite_treat() { return favorite_treat; }
}