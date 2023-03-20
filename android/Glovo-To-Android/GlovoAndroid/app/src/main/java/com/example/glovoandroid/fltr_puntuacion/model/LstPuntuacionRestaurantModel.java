package com.example.glovoandroid.fltr_puntuacion.model;

import com.example.glovoandroid.entities.Restaurante;
import com.example.glovoandroid.fltr_puntuacion.LstPuntuacionRestaurantContract;
import com.example.glovoandroid.fltr_ventas.LstVentasRestaurantContract;
import com.example.glovoandroid.utils.ApiClient;
import com.example.glovoandroid.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LstPuntuacionRestaurantModel implements LstPuntuacionRestaurantContract.Model {
    @Override
    public void lstPuntuacionRestaurantWS(Restaurante restaurante, onLstPuntuacionRestaurantListener onLstPuntuacionRestaurantListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ArrayList<Restaurante>> call = apiService.getPuntuacion();
        call.enqueue(new Callback<ArrayList<Restaurante>>() {
            @Override
            public void onResponse(Call<ArrayList<Restaurante>> call, Response<ArrayList<Restaurante>> response) {
                ArrayList<Restaurante> listaRestaurante = response.body();
                onLstPuntuacionRestaurantListener.onSuccess(listaRestaurante);
            }

            @Override
            public void onFailure(Call<ArrayList<Restaurante>> call, Throwable t) {
                    onLstPuntuacionRestaurantListener.onFailure(t.getMessage());
            }
        });

    }

}
