package com.example.glovoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.glovoandroid.fltr_ficha.view.FiltrFichaDescriptivaActivity;
import com.example.glovoandroid.fltr_puntuacion.view.LstPuntuacionRestaurantActivity;
import com.example.glovoandroid.fltr_usuario.view.FiltrUsuActivity;
import com.example.glovoandroid.fltr_ventas.view.LstVentasRestaurantActivity;
import com.example.glovoandroid.lst_restaurantes.view.LstRestaurantActivity;

public class MainActivity extends AppCompatActivity{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.VerTodo);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        LstRestaurantActivity.class
                );
                startActivity(screenChanger);
            }
        });


        btn2 = (Button) findViewById(R.id.verPuntuados);

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        LstPuntuacionRestaurantActivity.class
                );
                startActivity(screenChanger);
            }
        });

        btn3 = (Button) findViewById(R.id.verVentas);

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        LstVentasRestaurantActivity.class
                );
                startActivity(screenChanger);
            }
        });

        btn4 = (Button) findViewById(R.id.filtrar);

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        FiltrUsuActivity.class
                );
                startActivity(screenChanger);
            }
        });
    }

}