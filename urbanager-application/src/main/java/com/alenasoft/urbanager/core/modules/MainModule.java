package com.alenasoft.urbanager.core.modules;

import com.alenasoft.urbanager.UrbanagerConf;
import com.alenasoft.urbanager.resources.NumeroPrimo.NumeroPrimoService;
import com.alenasoft.urbanager.resources.NumeroPrimo.NumeroPrimoServiceImpl;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import com.alenasoft.urbanager.resources.hello.HelloService;
import com.alenasoft.urbanager.resources.hello.HelloServiceImpl;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

/**
 * This class should define the main bindings for dependency injection.
 *
 * @author Luis Roberto Perez
 * @since 20-05-17
 */
public class MainModule extends DropwizardAwareModule<UrbanagerConf> {
  @Override
  protected void configure() {
    bind(ExampleService.class).to(ExampleServiceImpl.class);
    bind(HelloService.class).to(HelloServiceImpl.class);
    bind(NumeroPrimoService.class).to(NumeroPrimoServiceImpl.class);
  }
}
