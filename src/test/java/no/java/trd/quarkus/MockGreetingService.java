package no.java.trd.quarkus;

import io.quarkus.test.Mock;

@Mock
public class MockGreetingService extends GreetingService {

  @Override
  public String greeting(String name) {
    return "HELLO TEST";
  }
}
