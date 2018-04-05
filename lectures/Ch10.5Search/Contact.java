//********************************************************************
//  Contact.java       Author: Lewis/Loftus
//
//  Represents a phone contact.
//********************************************************************

public class Contact implements Comparable<Object>
{
   private String firstName, lastName, phone;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this contact with the specified data.
   //-----------------------------------------------------------------
   public Contact (String first, String last, String telephone)
   {
      firstName = first;
      lastName = last;
      phone = telephone;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this contact as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return lastName + ", " + firstName + "\t" + phone;
   }

   //-----------------------------------------------------------------
   //  Returns if object and object passed are equal
   //-----------------------------------------------------------------
   public boolean equals (Object other)
   {
      return (lastName.equals(((Contact)other).getLastName()) &&
              firstName.equals(((Contact)other).getFirstName()));
   }

   //-----------------------------------------------------------------
   //  Uses both last and first names to determine ordering.
   //-----------------------------------------------------------------
   public int compareTo (Object other)
   {
      int result;

      // Convert the Object class type passed as the parameter to a Contact class type 
      // and get first and last names
      String otherFirst = ((Contact)other).getFirstName();
      String otherLast = ((Contact)other).getLastName();

      // Note below how we first determine if names are equal using the equals method
      // then we compare the names using the compareTo method
      
      // If the last names are the same, compare the first names
      if (lastName.equals(otherLast))
         result = firstName.compareTo(otherFirst);
      // Else compare the last names
      else
         result = lastName.compareTo(otherLast);

      return result;
   }

   //-----------------------------------------------------------------
   //  First name accessor.
   //-----------------------------------------------------------------
   public String getFirstName ()
   {
      return firstName;
   }

   //-----------------------------------------------------------------
   //  Last name accessor.
   //-----------------------------------------------------------------
   public String getLastName ()
   {
      return lastName;
   }
}
