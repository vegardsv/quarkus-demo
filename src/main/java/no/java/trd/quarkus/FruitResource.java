package no.java.trd.quarkus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

  private Set<Fruit> fruits =
      Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

  public FruitResource() {
    fruits.add(new Fruit("Apple", "Winter fruit"));
    fruits.add(new Fruit("Pineapple", "Tropical fruit"));
  }

  @GET
  public Set<Fruit> list() {
    return fruits;
  }

  @POST
  public Set<Fruit> add(Fruit fruit) {
    fruits.add(fruit);
    return fruits;
  }

  @DELETE
  public Set<Fruit> delete(Fruit fruit) {
    fruits.removeIf(existingFruit -> existingFruit.name.contentEquals(fruit.name));
    return fruits;
  }
}
