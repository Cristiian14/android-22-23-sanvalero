package com.example.glovoandroid.fltr_ficha;

import com.example.glovoandroid.entities.Restaurante;

import java.util.ArrayList;

public interface FiltroFechaDescriptivaContract {
    public interface View{
        void onSuccessLstFichaRestaurant(ArrayList<Restaurante> lstFichaRestaurant);
        void onFailureLstFichaRestaurant(String err);
    }
   public interface Presenter{
        //Listado de las fichas por las necesidades del cliente.
        void lstFichaRestaurant(String filtro);
   }
   public interface Model{
        interface onLstFichaRestaurantListener{
            void onSuccess(ArrayList<Restaurante> lstFichaRestaurante);
            void onFailure(String err);
        }
    void lstFichaRestaurantWS(String filtro, onLstFichaRestaurantListener onLstFichaRestaurantListener);
   }
}
