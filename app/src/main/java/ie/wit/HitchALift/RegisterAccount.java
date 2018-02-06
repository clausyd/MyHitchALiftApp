package ie.wit.HitchALift;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import ie.wit.home_page.R;

public class RegisterAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void creatUser(){

        EditText firstNameBox;
        EditText lastNameBox;
        EditText emailBox;
        EditText passwordBox;
        EditText rePasswordBox;

        firstNameBox = findViewById(R.id.fname);
        lastNameBox = findViewById(R.id.lname);
        emailBox = findViewById(R.id.email);
        passwordBox = findViewById(R.id.password);
        rePasswordBox = findViewById(R.id.retypePassword);

        String firstName = String.valueOf(firstNameBox.getText());
        String LastName = String.valueOf(lastNameBox.getText());
        String email = String.valueOf(emailBox.getText());
        String password = String.valueOf(passwordBox.getText());
        String retypePassword = String.valueOf(rePasswordBox.getText());


    }


}


