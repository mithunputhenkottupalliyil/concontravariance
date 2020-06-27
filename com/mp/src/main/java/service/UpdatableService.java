package service;

/**
 * Service of T that can handle additional step of update checks
 * Interface segregation vs inheritance
 */
public interface UpdatableService<T> {
    boolean updateNeeded(T t);
    //invoked only when required
    T read();
}
