/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.tadstack;

public class StackArray<E> implements Stack<E> {

    private E[] storage;
    private int size;
    private final static int MAX = 500;

    public StackArray(int capacity) {
        storage = (E[]) new Object[capacity];
        size = 0;
    }

    public StackArray() {
        this(MAX);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public E peek() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void push(E elem) throws FullStackException {
        if (size == storage.length) {
            throw new FullStackException();
        }
        storage[size++] = elem;
    }

    @Override
    public E pop() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet.");

    }
}
