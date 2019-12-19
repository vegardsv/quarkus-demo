package no.java.trd.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.Date;

@Path("/clock")
public class ClockResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String clock(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

}
