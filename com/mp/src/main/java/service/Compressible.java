package service;

import data.CompressedEntity;
import data.Data;

/**
 * Service of T that can handle additonal step of packing
 * Interface segregation vs inheritance
 */
public interface Compressible<T extends Data> {
    CompressedEntity<T> pack(T t);
}
