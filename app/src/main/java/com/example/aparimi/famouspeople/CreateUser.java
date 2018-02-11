package com.example.aparimi.famouspeople;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by aparimi on 2/10/2018.
 */

public class CreateUser extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText email;
    Button button;
    String TAG = "CreateUser";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
                                  {

                                      public void onClick(View view){
                                          // TODO: 2/10/2018 Save to Database
                                        Log.d(TAG, "onClick firstName: " + firstName.getText().toString() +
                                                        "onClick lastName: " + lastName.getText().toString() +
                                                        "onClick email: " + email.getText().toString());

                                      }
                                  });


    }
}
