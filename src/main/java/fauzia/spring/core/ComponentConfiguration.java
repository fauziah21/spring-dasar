package fauzia.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "fauzia.spring.core.repository",
        "fauzia.spring.core.service",
        "fauzia.spring.core.configuration",
})
public class ComponentConfiguration {
}
