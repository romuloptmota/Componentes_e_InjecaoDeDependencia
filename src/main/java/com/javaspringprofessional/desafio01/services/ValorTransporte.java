package com.javaspringprofessional.desafio01.services;

import com.javaspringprofessional.desafio01.entities.Ordem;
import org.springframework.stereotype.Service;


@Service
public class ValorTransporte {

    public double frete(Ordem ordem){

        //CALCULO FRETE
        double valorFrete = 0;
        if(ordem.getValorBasico() < 100.00) valorFrete = 20.00;
        else if (ordem.getValorBasico() > 100.00 && ordem.getValorBasico() <= 200.00) valorFrete = 12.00;
        else valorFrete = 0.00;

        return valorFrete;
    }

}
