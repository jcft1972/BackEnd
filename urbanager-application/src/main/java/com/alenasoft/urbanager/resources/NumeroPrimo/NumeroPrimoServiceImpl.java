package com.alenasoft.urbanager.resources.NumeroPrimo;

import com.alenasoft.urbanager.api.NumeroPrimo;

import javax.inject.Inject;
import java.util.List;

public class NumeroPrimoServiceImpl implements NumeroPrimoService{

    private NumeroPrimo numeroPrimo;

    @Override
    public Boolean IsPrime(int number) {
        this.numeroPrimo = new NumeroPrimo(number);
        return numeroPrimo.getPrime();
    }

    @Override
    public int nextPrimeNumber() {
        return this.nextPrimeNumber();
    }

    @Override
    public List<String> firstNPrimeNumbers(int number) {
        this.numeroPrimo = new NumeroPrimo(1);
        return this.numeroPrimo.printPrimeNumbers(number);
    }


}
