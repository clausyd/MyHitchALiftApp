package ie.wit.HitchALift;

import java.util.ArrayList;

/**
 * Created by clausyd on 06/02/18.
 */

public class Customer {

    String fname;
    String surname;
    String emial;
    String password;
    ArrayList<Customer> customer = new ArrayList<>();

    public Customer(String fname, String surname, String email, String password)
    {
        this.fname = fname;
        this.surname = surname;
        this.emial = email;
        this.password = password;

        customer.add(this);


    }


}
