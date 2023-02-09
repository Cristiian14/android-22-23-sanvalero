
import patron.PIZZA_FACTORY;
import patron.abstract_builder.PizzaBuilder;
import patron.concrete_builder.HawaiPizzaBuilder;
import patron.concrete_builder.PicantePizzaBuilder;
import patron.director.Cocina;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A10-PC119
 */
public class PatronBuilder {
    
    public static void main(String[] args) {
        Cocina cocina = Cocina.getInstance();//Director
        
        //PizzaBuilder hawaiPizza = new HawaiPizzaBuilder();
        //PizzaBuilder picantePizza = new PicantePizzaBuilder();
        
        PizzaBuilder hawaianPizza = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.HAWAII_PIZZA);
        PizzaBuilder picantePizza = PIZZA_FACTORY.getInstance(PIZZA_FACTORY.PICANTE_PIZZA);
        
        
        cocina.setPizzaBuilder(hawaianPizza);
        cocina.construirPizza();
        
        cocina.setPizzaBuilder(picantePizza);
        cocina.construirPizza();        
        
    }
    
}
