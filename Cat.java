//************************************************
//  Author: Steven Smail
//
//  Cat.java
//
//  Represents a cat.
//************************************************
import java.util.Calendar;

public class Cat extends Animal
{
    // Instance variables
    private String breed;
    private String preferred_catfood;

    //-----------------------------------------------------
    // Constructor - Initializes instance variables.
    //-----------------------------------------------------
    public Cat(String name, String owner_name, Calendar dob,
               String breed, String preferred_catfood)
    {
        super("Cat", name, owner_name, dob);
        this.breed = breed;
        this.preferred_catfood = preferred_catfood;
    }

    public String toString()
    {
        return super.toString() +
               " Breed:" + breed +
               " Preferred catfood:" + preferred_catfood;
    }

    //------------------------------------------------------
    // Accessor methods
    //------------------------------------------------------
    public String Breed() { return breed; }
    public String Preferred_catfood() { return preferred_catfood; }
}