package by.matmux.controller.command;

public interface Command<T, K, P> {
    public T execute(K k, P p);
}
