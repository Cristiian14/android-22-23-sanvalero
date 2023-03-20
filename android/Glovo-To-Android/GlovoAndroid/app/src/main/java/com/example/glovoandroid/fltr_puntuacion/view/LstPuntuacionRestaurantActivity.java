package com.example.glovoandroid.fltr_puntuacion.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glovoandroid.R;
import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_puntuacion.LstPuntuacionRestaurantContract;
import com.example.glovoandroid.fltr_puntuacion.presenter.LstPuntuacionRestaurantPresenter;
import com.example.glovoandroid.fltr_ventas.LstVentasRestaurantContract;
import com.example.glovoandroid.fltr_ventas.presenter.LstVentasRestaurantPresenter;
import com.example.glovoandroid.fltr_ventas.view.LstVentasRestaurantAdapter;

import java.util.ArrayList;

public class LstPuntuacionRestaurantActivity extends AppCompatActivity implements LstPuntuacionRestaurantContract.View {
    private LstPuntuacionRestaurantAdapter lstRestaurantAdapter;
    private LstPuntuacionRestaurantPresenter lstPuntuacionRestaurantPresenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fltr_puntuacion_restaurant);
        initComponents();
        initPresenter();
        initData();

    }
    public void initComponents(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerV);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
    public void initPresenter(){
        lstPuntuacionRestaurantPresenter = new LstPuntuacionRestaurantPresenter(this);
    }
    public void initData(){
        lstPuntuacionRestaurantPresenter.lstPuntuacionRestaurant(null); //SELECT * FROM SIMPSON
    }

    @Override
    public void onSuccessLstPuntuacionRestaurant(ArrayList<Restaurante> lstPuntuacionRestaurant) {
        LstPuntuacionRestaurantAdapter adapter = new LstPuntuacionRestaurantAdapter(getBaseContext(),lstPuntuacionRestaurant);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onFailureLstPuntuacionRestaurant(String err) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }

}