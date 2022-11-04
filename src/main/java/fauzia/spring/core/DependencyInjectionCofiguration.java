package fauzia.spring.core;

import fauzia.spring.core.data.Bar;
import fauzia.spring.core.data.Foo;
import fauzia.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

public class DependencyInjectionCofiguration {

    @Primary
    public Foo fooFirst(){
        return new Foo();
    }

    public Foo fooSecond(){
        return new Foo();
    }

    public Bar bar(){
        return new Bar();
    }

    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
