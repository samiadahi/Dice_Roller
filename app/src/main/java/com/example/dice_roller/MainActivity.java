package com.example.dice_roller;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.*;

import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button)findViewById(R.id.button);
        EditText text=(EditText)findViewById(R.id.face);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast toast = Toast.makeText(MainActivity.this, "Dé lancé!", Toast.LENGTH_SHORT);
                //toast.show();
                int min=1;
                // int max=6
                int max=Integer.parseInt(text.getText().toString());
                final TextView txt1=(TextView)findViewById(R.id.valeur1);
                //final TextView txt2=(TextView)findViewById(R.id.valeur2);
                Random random=new Random();
                final int nbr=random.nextInt(max-min+1)+min;
                //final int nbr2=random.nextInt(max-min+1)+min;
                final String str1= Integer.toString(nbr);
                //inal String str2= Integer.toString(nbr2);
                txt1.setText(str1);
                //txt2.setText(str2);



            }
        });

    }
}