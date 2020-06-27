package data;

/**
 * compressed T instance
 * here T is any entity that the service can provide
 */
public class CompressedEntity<T> {
    private T t;
    public CompressedEntity(T t) {
        this.t = t;
    }
}
