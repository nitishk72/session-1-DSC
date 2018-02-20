package com.companyname.ashar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1,e2;
        Button b;

        b   =   findViewById(R.id.button);
        e1  =   findViewById(R.id.a);
        e2  =   findViewById(R.id.b);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a1,b1,c;

                a1  = Integer.parseInt(e1.getText().toString());
                b1  = Integer.parseInt(e2.getText().toString());
                c = a1+b1;
                String res;
                res= String.valueOf(c);
                Toast.makeText(getApplicationContext(), ""+res, Toast.LENGTH_LONG).show();
            }
        });




    }
}
