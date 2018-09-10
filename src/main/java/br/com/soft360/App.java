package br.com.soft360;

import java.util.*;

public class App extends javax.ws.rs.core.Application {

    private Set<Class<?>> classes;

    public Set<Class<?>> getClasses() {
        if (classes == null) {
            classes = new HashSet<>();
            classes.add(StarWarsWS.class);
        }
        return classes;
    }

}

