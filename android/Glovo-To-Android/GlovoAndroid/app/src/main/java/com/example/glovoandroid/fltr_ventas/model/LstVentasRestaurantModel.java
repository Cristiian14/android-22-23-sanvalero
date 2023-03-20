package com.example.glovoandroid.fltr_ventas.model;

import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_ventas.LstVentasRestaurantContract;
import com.example.glovoandroid.lst_restaurantes.LstRestaurantContract;
import com.example.glovoandroid.utils.ApiClient;
import com.example.glovoandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LstVentasRestaurantModel implements LstVentasRestaurantContract.Model {
    @Override
    public void lstVentasRestaurantWS(Restaurante restaurante, onLstVentasRestaurantListener onLstVentasRestaurantListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Restaurante>> call = apiService.getVentas();
        call.enqueue(new Callback<ArrayList<Restaurante>>() {
            @Override
            public void onResponse(Call<ArrayList<Restaurante>> call, Response<ArrayList<Restaurante>> response) {
                ArrayList<Restaurante> listaRestaurante = response.body();
                onLstVentasRestaurantListener.onSuccess(listaRestaurante);
            }

            @Override
            public void onFailure(Call<ArrayList<Restaurante>> call, Throwable t) {
                    onLstVentasRestaurantListener.onFailure(t.getMessage());
            }
        });

    }

}
