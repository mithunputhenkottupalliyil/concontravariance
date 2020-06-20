package router;

import dao.AddressDao;
import dao.Dao;
import data.Address;
import data.Data;

import java.util.List;

public enum Router {
    getAddress {
        public List<? extends Data> route() {
            Dao<Address> addressDao = new AddressDao();
            return addressDao.list();
        }
    };
    public abstract List<? extends Data> route();
}
