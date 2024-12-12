package com.javaspringprofessional.desafio01.services;

import com.javaspringprofessional.desafio01.entities.Ordem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorTotal {

    @Autowired
    ValorTransporte valorTransporte;
    public double total(Ordem ordem){

        //CALCULO VALOR TOTAL: VALOR BASE MENOS DESCONTO, MAIS VALOR DO FRETE
        return ordem.getValorBasico() - (ordem.getValorBasico() * (ordem.getPorcentDesconto()) / 100)
                + valorTransporte.frete(ordem);
    }

}
