package dao;


import data.Address;

import java.util.List;

public class AddressDao implements Dao<Address> {
    @Override
    public List<Address> list() {
        return null;
    }

    @Override
    public Address find() {
        return new Address("f1", "l1");
    }
}
