//************************************************
//  Author: Steven Smail
//
//  Animal.java
//
//  Represents an animal.
//************************************************
import java.util.Calendar;

public class Animal
{    
    // Instance variables
    private String kind_of_animal;
    private String name;
    private String owner_name;
    private Calendar date_of_birth; 
    
    //-----------------------------------------------------
    // Constructor - Initializes instance variables.
    //-----------------------------------------------------
    public Animal(String kind_of_animal, String name,
                  String owner_name, Calendar dob)
    {
        this.kind_of_animal = kind_of_animal;
        this.name = name;
        this.owner_name = owner_name;
        this.date_of_birth = dob;
    }

    //------------------------------------------------------
    // Returns a string representation of an animal.
    //------------------------------------------------------
    public String toString()
    {
        int month = date_of_birth.get(Calendar.MONTH) + 1;
        int date = date_of_birth.get(Calendar.DATE);
        int year = date_of_birth.get(Calendar.YEAR);

        return kind_of_animal +
               " Name:" + name +
               " Owner:" + owner_name +
               " Date of Birth:" + month +
                              "/" + date +
                              "/" + year;
    }

    //------------------------------------------------------
    // Accessor methods
    //------------------------------------------------------
    public String Kind_of_animal() { return kind_of_animal; }
    public String Name() { return name; }
    public String Owner_name() { return owner_name; }
    public Calendar Date_of_Birth() { return date_of_birth; }
}