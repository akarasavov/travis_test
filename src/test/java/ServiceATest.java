import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceATest {

    ServiceA serviceA = mock(ServiceA.class);


    @Test
    public void should_send_data() {
        when(serviceA.send()).thenReturn("Test");

        Assert.assertEquals(serviceA.send(), "Test");
    }
}