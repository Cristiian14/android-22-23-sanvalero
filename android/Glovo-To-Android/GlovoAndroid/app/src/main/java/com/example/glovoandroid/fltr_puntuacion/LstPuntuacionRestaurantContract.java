package com.example.glovoandroid.fltr_puntuacion;

import com.example.glovoandroid.entities.Restaurante;

import java.util.ArrayList;

public interface LstPuntuacionRestaurantContract {
    public interface View{
        void onSuccessLstPuntuacionRestaurant(ArrayList<Restaurante> lstPuntuacionRestaurant);
        void onFailureLstPuntuacionRestaurant(String err);
    }
   public interface Presenter{
        //Listado de los restaurantes por puntuacion.
        void lstPuntuacionRestaurant(Restaurante restaurante);
   }
   public interface Model{
        interface onLstPuntuacionRestaurantListener{
            void onSuccess(ArrayList<Restaurante> lstPuntuacionRestaurante);
            void onFailure(String err);
        }
    void lstPuntuacionRestaurantWS(Restaurante restaurante, onLstPuntuacionRestaurantListener onLstPuntuacionRestaurantListener);
   }
}
