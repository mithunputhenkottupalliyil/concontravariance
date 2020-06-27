package router;


import dao.AddressDao;
import dao.Dao;
import dao.GenericDao;
import data.Address;
import data.Data;

/**
 * Work in progress
 * Single router that can route to different daos.
 * Database,API endpoints, Queue Polls
 */
public enum Router {
    getEntity {
        public <T extends Data> T route() {
            Dao<T> dao = new GenericDao<>();
            return dao.find();
        }
    },   getAddress {
        public Address route() {
            Dao<Address> dao = new AddressDao();
            return dao.find();
        }
    },   block {
        public Data route() {
           return null;
        }
    };

    public abstract <T extends Data> T route();
}
