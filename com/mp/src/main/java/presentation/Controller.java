package  presentation;
import data.Address;
import router.Router;
import service.UpdatableCompressibleEntityService;

/**
 * Dummy Controller
 */
public class Controller {
    public Address getAddress() {
        return new UpdatableCompressibleEntityService<Address>(Router.getAddress).read();
    }
}
