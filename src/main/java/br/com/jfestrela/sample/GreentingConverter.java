package br.com.jfestrela.sample;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.smallrye.reactive.messaging.annotations.Broadcast;

@ApplicationScoped
public class GreentingConverter {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	private static final String MY_NAME_IS = "My name is ";

    @Incoming("greentings")                                
    @Outgoing("generated-id-name")                          
    @Broadcast                                          
    public String process(String name) {
        return MY_NAME_IS.concat("Fernando estrela de "+name);
    }

}
