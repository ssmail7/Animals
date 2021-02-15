//************************************************
//  Author: Steven Smail
//
//  Bird.java
//
//  Represents a bird.
//************************************************
import java.util.Calendar;

public class Bird extends Animal
{
    // Instance variables
    private String species;
    private double wingspan;

    //-----------------------------------------------------
    // Constructor - Initializes instance variables.
    //-----------------------------------------------------
    public Bird(String name, String owner_name, Calendar dob,
                String species, double wingspan)
    {
        super("Bird", name, owner_name, dob);
        this.species = species;
        this.wingspan = wingspan;
    }

    public String toString()
    {
        return super.toString() +
               " Species:" + species +
               " Wingspan:" + wingspan;
    }

    //------------------------------------------------------
    // Accessor methods
    //------------------------------------------------------
    public String Species() { return species; }
    public double Wingspan() { return wingspan; }
}