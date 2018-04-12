package com.alenasoft.urbanager.resources.NumeroPrimo;

import io.dropwizard.hibernate.UnitOfWork;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path ("NumeroPrimo")
public class NumeroPrimoResource {
    @Inject
    private NumeroPrimoService service;

    @GET
    @UnitOfWork
    @Path("EsPrimo/{num1}")
    public Boolean isPrime(@PathParam("num1") int num1){
        return this.service.IsPrime(num1);
    }

    @GET
    @UnitOfWork
    @Path("/CuantosPrimos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<java.lang.String> firstPrimeNumbers(@QueryParam("num1") int num1){
        return this.service.firstNPrimeNumbers(num1);
    }

}
