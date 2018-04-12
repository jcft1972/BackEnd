package com.alenasoft.urbanager.resources.NumeroPrimo;
import com.alenasoft.urbanager.api.NumeroPrimo;

import java.util.List;

public interface NumeroPrimoService {
    Boolean IsPrime(int number);
    int nextPrimeNumber();
    List<String> firstNPrimeNumbers(int number);
}
