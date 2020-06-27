package service;

import data.CompressedEntity;
import router.Router;

/**
 * Service of sub-T
 * Here the service is updatable - checks if the package needs to be updated
 * The service is also compressible - T is compressed and returned
 * Route is in the service state
 */
public class UpdatableCompressibleEntityService<T extends data.Data> implements Compressible<T>, UpdatableService<T> {

    private Router route_;

    public UpdatableCompressibleEntityService(Router r) {
        this.route_ = r;
    }

    @Override
    public CompressedEntity<T> pack(T t) {
        return new CompressedEntity<>(t);
    }

    @Override
    public boolean updateNeeded(T t) {
        return false;
    }

    @Override
    public T read() {
        return route_.route();
    }
}
