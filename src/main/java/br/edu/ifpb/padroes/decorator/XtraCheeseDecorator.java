package br.edu.ifpb.padroes.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class XtraCheeseDecorator extends PizzaDecorator{
    public XtraCheeseDecorator(Pizza p) {
        super(p);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() *1.10f;
    }

    @Override
    public String getName() {
        return super.getName() + "(extra cheese)";
    }
}
