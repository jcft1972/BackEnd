package com.alenasoft.urbanager.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


// POJO: Plain Old Java Object
@Entity
@Table(appliesTo = "NumeroPrimo")
public class NumeroPrimo {

    /**
     * Empty constructor, this is needed for Jackson parsing.
     */
    public NumeroPrimo(){
    }

    public NumeroPrimo(int number){
        this.number = number;
        this.isPrime = validaPrimo(this.number);
    }

    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @JsonProperty
    private int number;

    @JsonProperty
    private Boolean isPrime;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        this.isPrime = validaPrimo(this.number);
        if (!this.isPrime) this.number = 0;
    }

    public Boolean getPrime() {
        return isPrime;
    }

    private Boolean validaPrimo(int number){
        Boolean isPrime = Boolean.TRUE;
        int count = 2;

        if (number < 1) { isPrime = Boolean.FALSE; }

        while ((count < number) && (isPrime)) {
            if (number % count == 0) {
                isPrime = Boolean.FALSE;
            }
            else
            {
                ++count;
            }
        }
        return isPrime;
    }

    public int nextPrimeNumber() {
        Boolean nextNumber = Boolean.FALSE;
        int aux = this.number;
        while(!nextNumber){
            if(validaPrimo(aux + 1)) nextNumber = Boolean.TRUE;
            ++aux;
        }
        return aux;
    }

    public List<String> printPrimeNumbers(int number) {
        List<String> integers = new ArrayList();
        int aux = 1;
        String strAux;
        for (int count = 1; count <= number; ++count) {
            this.setNumber(aux);
            strAux = "" + aux;

            if (this.isPrime) integers.add(strAux);
            aux = this.nextPrimeNumber();
        }
        return integers;
    }



}
