package com.javaspringprofessional.desafio01.entities;

public class Ordem {

    //ATRIBUTOS
    private final Integer codigo;
    private final Double valorBasico;
    private final Double porcentDesconto;


    //CONSTRUTOR
    public Ordem(Integer codigo, Double valorBasico, Double porcentDesconto) {
        this.codigo = codigo;
        this.valorBasico = valorBasico;
        this.porcentDesconto = porcentDesconto;
    }

    //MÉTODOS
    @Override
    public String toString() {
        return  "Pedido código " + getCodigo() +
                "\nValor total: R$ %.2f";
    }

    //GETTER
    public Integer getCodigo() {
        return codigo;
    }

    public Double getValorBasico() {
        return valorBasico;
    }

    public Double getPorcentDesconto() {
        return porcentDesconto;
    }
}
