package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountDecorator extends PizzaDecorator{

    public DiscountDecorator(Pizza p) {
        super(p);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 0.75f;
    }
}
