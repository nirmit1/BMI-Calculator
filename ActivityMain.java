package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText h,w,ans,comm;
    Button calc;
    ConstraintLayout p1;
    double d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h=findViewById(R.id.editTextNumberDecimal);
        w=findViewById(R.id.editTextNumberDecimal2);
        ans=findViewById(R.id.editTextNumberDecimal3);
        comm=findViewById(R.id.editTextTextPersonName);
        calc=findViewById(R.id.button);
        p1= findViewById(R.id.cl);



        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = (Double.parseDouble(w.getText().toString()))*2.20462;
                double b = Double.parseDouble(h.getText().toString());
                double c = (a/(b*b))*703;
                ans.setText("Your BMI is "+c);

                if (c<=18.4)
                {
                    comm.setText("Under-weight");
                    p1.setBackgroundResource(R.color.teal_700);
                }
                if (c>=18.4 && c<=24.9)
                {
                    comm.setText("Normal");
                    p1.setBackgroundResource(R.color.green);
                }
                if (c>=24.9 && c<=39.9)
                {
                    comm.setText("Over-weight");
                    p1.setBackgroundResource(R.color.orange);
                }
                if (c>=40)
                {
                    comm.setText("Obese");
                    p1.setBackgroundResource(R.color.red);
                }
            }
        });



    }
}
