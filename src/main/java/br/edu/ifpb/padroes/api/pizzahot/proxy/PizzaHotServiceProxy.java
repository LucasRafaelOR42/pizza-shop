package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;

import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
    private PizzaHotService service;
    private List<PizzaHotPizza> pizzas;

    public PizzaHotServiceProxy(PizzaHotService s)
    {
        this.service = s;
        this.pizzas = s.getPizzas();
    }

    @Override
    public List<PizzaHotPizza> getPizzas() {
        return this.pizzas;
    }
}
