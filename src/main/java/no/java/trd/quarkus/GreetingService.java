package no.java.trd.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class GreetingService {

  @ConfigProperty(name = "greeting.message")
  String message;

  @ConfigProperty(name = "greeting.prefix")
  String prefix;

  @ConfigProperty(name = "greeting.suffix", defaultValue = "!")
  String suffix;

  public String greeting(String name) {
    return String.format("%s %s %s %s", prefix, name, suffix, message);
  }
}
