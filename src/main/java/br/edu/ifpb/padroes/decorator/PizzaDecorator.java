package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaDecorator implements Pizza {
    private Pizza wrappee;

    public PizzaDecorator(Pizza p)
    {
        this.wrappee = p;
    }

    @Override
    public Float getPrice() {
        return this.wrappee.getPrice();
    }

    @Override
    public String getName() {
        return this.wrappee.getName();
    }
}
