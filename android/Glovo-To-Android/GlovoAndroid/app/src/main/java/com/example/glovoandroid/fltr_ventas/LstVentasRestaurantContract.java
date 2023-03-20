package com.example.glovoandroid.fltr_ventas;

import com.example.glovoandroid.entities.Restaurante;

import java.util.ArrayList;

public interface LstVentasRestaurantContract {
    public interface View{
        void onSuccessLstVentasRestaurant(ArrayList<Restaurante> lstVentasRestaurant);
        void onFailureLstVentasRestaurant(String err);
    }
   public interface Presenter{
        //Listado de los restaurantes por ventas.
        void lstVentasRestaurant(Restaurante restaurante);
   }
   public interface Model{
        interface onLstVentasRestaurantListener{
            void onSuccess(ArrayList<Restaurante> lstVentasRestaurante);
            void onFailure(String err);
        }
    void lstVentasRestaurantWS(Restaurante restaurante, onLstVentasRestaurantListener onLstVentasRestaurantListener);
   }
}
