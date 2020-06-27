import org.junit.Assert;
import org.junit.Test;
import presentation.Controller;

public class TestFlow {
    @Test
    public void assertFirstName(){
        Assert.assertNotNull(new Controller().getAddress().getFirstName());
        Assert.assertEquals("f1", new Controller().getAddress().getFirstName());

    }
}
