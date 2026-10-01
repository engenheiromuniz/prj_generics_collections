package com.amztecnologia.cap_02_generics._01_cofre_generico;

public class Cofre<T> {
    private T item;

    public void guardar(T item) {
        if (this.item != null) {
            throw new IllegalStateException("Cofre ocupado");
        }
        this.item = item;
    }

    public T retirar() {
        if (this.item == null) {
            throw new IllegalStateException("Cofre vazio");
        }
        T retirado = this.item;
        this.item = null;
        return retirado;
    }

    public boolean estaVazio() {
        return item == null;
    }
}