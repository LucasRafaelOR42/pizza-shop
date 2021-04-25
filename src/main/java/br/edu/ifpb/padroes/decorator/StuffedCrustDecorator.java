package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator extends PizzaDecorator{
    public StuffedCrustDecorator(Pizza p) {
        super(p);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.20f;
    }

    @Override
    public String getName() {
        return super.getName() + "(stuffed crust)";
    }
}
