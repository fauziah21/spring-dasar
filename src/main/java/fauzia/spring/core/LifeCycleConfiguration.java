package fauzia.spring.core;

import fauzia.spring.core.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {
    @Bean
    public Connection connection(){
        return new Connection();
    }

    @Bean //(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }
}
