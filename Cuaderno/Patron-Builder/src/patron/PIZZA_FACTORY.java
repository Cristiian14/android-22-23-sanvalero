
package patron;

import patron.abstract_builder.PizzaBuilder;
import patron.concrete_builder.HawaiPizzaBuilder;
import patron.concrete_builder.PicantePizzaBuilder;

/*
    PREPARAR UN ENUM
    BACKEND
        * STATE
        * STRATEGY -> REACT
        * ADAPTER
        * DAO
*/
/*
    JSON
        * PUBLICAR EN WEBSERVICE REST
*/
/*

        ANDROID
        * ITERATOR
        * FACADE
        * PATRON OBSERVER

*/

public class PIZZA_FACTORY {
    public final static int HAWAII_PIZZA = 1;
    public final static int PICANTE_PIZZA = 2;
    
    
    public static PizzaBuilder getInstance(int pizzaSelected){
        PizzaBuilder pizza = null;
        switch(pizzaSelected){
            case HAWAII_PIZZA:
                pizza = new HawaiPizzaBuilder();
                break;
            case PICANTE_PIZZA:
                pizza = new PicantePizzaBuilder();
                break;    
            // default o varios CASE
        }
        return pizza;
    }
    
}
