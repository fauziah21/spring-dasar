package fauzia.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "fauzia.spring.core.service"
})
public class ComponentConfiguration {
}
