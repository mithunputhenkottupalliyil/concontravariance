package dao;

import data.Data;

import java.util.List;

public class GenericDao<T extends Data> implements Dao<T> {
    @Override
    public T find() {
        return null;
    }

    @Override
    public List<T> list() {
        return null;
    }
}
