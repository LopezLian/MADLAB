package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    Integer num1,num2,res;
    TextView txt1;
    View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        et1 = findViewById(R.id.ed1);
        et2 = findViewById(R.id.ed2);
        button=findViewById(R.id.bt1);

        button.setOnClickListener(this);


        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });
    }

    @Override
    public void onClick(View v) {
       num1= Integer.parseInt(et1.getText().toString());
       num2= Integer.parseInt(et2.getText().toString());
       res =num1+num2;



       Toast toast = Toast.makeText(getApplicationContext(), "Answer is " + res, Toast.LENGTH_LONG);
      toast.show();
    }
}
