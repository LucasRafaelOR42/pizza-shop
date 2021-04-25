package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.decorator.DiscountDecorator;
import br.edu.ifpb.padroes.decorator.PanDecorator;
import br.edu.ifpb.padroes.decorator.StuffedCrustDecorator;
import br.edu.ifpb.padroes.decorator.XtraCheeseDecorator;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        // TODO - implementar adapter para juntar as pizzas da PizzaHot e Damenos em um único conjunto
        for (Pizza pizza : pizzaShopService.getPizzas()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }



        // TODO - implementar padrão decorator para só precisar passar o objeto pizza
        Pizza pizza = new DiscountDecorator(
                new XtraCheeseDecorator(
                        new PanDecorator(
                                new StuffedCrustDecorator(
                                        new PizzaShopPizza("pepperoni", 55.0f)
                                )
                        )
                )
        );

        pizzaShopService.orderPizza(pizza);

    }

}
