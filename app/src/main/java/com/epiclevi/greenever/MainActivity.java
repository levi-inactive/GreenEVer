package com.epiclevi.greenever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSignUp, btnSignIn;
    EditText edtUser, edtPassword;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignUp.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSignUp:

                intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);

                break;

            case R.id.btnSignIn:
                intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);

                break;
        }
    }
}
