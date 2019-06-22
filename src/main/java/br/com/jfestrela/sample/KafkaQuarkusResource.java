package br.com.jfestrela.sample;
import io.smallrye.reactive.messaging.annotations.Stream;
import org.reactivestreams.Publisher;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class KafkaQuarkusResource {

    @Inject
    @Stream("my-data-stream") Publisher<Double> prices; 
    
    @Inject
    @Stream("generated-id-name") Publisher<String> greentings;  

    @GET
    @Path("greentings")
    @Produces(MediaType.TEXT_PLAIN)
    public Publisher<String>  hello() {
        return greentings;
    }

    @GET
    @Path("prices")
    @Produces(MediaType.SERVER_SENT_EVENTS)             
    public Publisher<Double> stream() {                 
        return prices;
    }
}