package dao;

import data.Data;

import java.util.List;


public interface Dao<T extends Data> {
    T find();
    List<T> list();
}
