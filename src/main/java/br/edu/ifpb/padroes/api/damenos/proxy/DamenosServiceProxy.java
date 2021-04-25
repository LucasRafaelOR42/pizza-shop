package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.domain.Pizza;

import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
    private DamenosService service;
    private List<DamenosPizza> pizzas;

    public DamenosServiceProxy(DamenosService s)
    {
        this.service = s;
        this.pizzas = s.getPizzas();
    }

    @Override
    public List<DamenosPizza> getPizzas() {
        return this.pizzas;
    }
}
