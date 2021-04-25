package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanDecorator extends PizzaDecorator{
    public PanDecorator(Pizza p) {
        super(p);
    }

    @Override
    public String getName() {
        return super.getName() + "(pan pizza)";
    }

    @Override
    public Float getPrice() {
        return super.getPrice() *1.15f;
    }
}
