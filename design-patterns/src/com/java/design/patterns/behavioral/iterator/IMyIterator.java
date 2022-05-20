package com.java.design.patterns.behavioral.iterator;


public interface IMyIterator<T> {

    boolean hasNext();

    T getNext();
}
