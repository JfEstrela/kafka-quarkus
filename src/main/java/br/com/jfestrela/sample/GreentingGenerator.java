package br.com.jfestrela.sample;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.reactivex.Flowable;

@ApplicationScoped
public class GreentingGenerator {
	
    @Outgoing("generated-greenting")                      
    public Flowable<String> generateName() {              
        return Flowable.interval(5, TimeUnit.SECONDS)
                .map(tick -> UUID.randomUUID().toString());
    }


}
