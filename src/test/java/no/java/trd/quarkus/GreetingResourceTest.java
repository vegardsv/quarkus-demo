package no.java.trd.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

  @Test
  public void testHelloEndpoint() {
    given().when().get("/hello").then().statusCode(200).body(is("HELLO TEST"));
  }
}
