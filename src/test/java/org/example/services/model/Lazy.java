package org.example.services.model;

import java.util.function.Supplier;

public class Lazy<T> implements Supplier<T> {

    private Supplier<T> supplier;
    private volatile T value;

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public T get() {
        if (value == null) {
            value = supplier.get();
        }

        return value;
    }
}
