package com.example.glovoandroid.utils;

import com.example.glovoandroid.entities.Restaurante;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("api")
    Call<ArrayList<Restaurante>> getRestaurante();

    @GET("filtrVentas")
    Call<ArrayList<Restaurante>> getVentas();

    @GET("filtrPuntuacion")
    Call<ArrayList<Restaurante>> getPuntuacion();

    @GET("filtr_usu/filtr_usu/{tipo}")
    Call<ArrayList<Restaurante>> getFiltroRestaurante(@Path("tipo") String filtro);

    @GET("filtrFicha/filtrFicha/{nombre}")
    Call<ArrayList<Restaurante>> getFichaDesc(@Path("nombre")String filtro);



    /*@POST("filtr_usu")
    Call<ArrayList<Restaurante>> getFiltroRestaurante(@Query("filtr_usu") String filtro);
    */
    //login?username=""&password=""
    /*@GET("login")
    Call<ArrayList<Restaurante>> getTipoComida(
            @Query("tipo") String tipo
    );*/

    /*@GET("Controller")
    Call<ArrayList<Restaurante>> getFiltroRestaurante(@Query("RESTAURANTE") String filtro);*/

}
