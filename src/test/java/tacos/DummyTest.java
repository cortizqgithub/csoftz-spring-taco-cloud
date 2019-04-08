package tacos;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class DummyTest {
    @Test
    public void shouldMap() {
        Order order = Order.builder()
                .id(1L)
                .placedAt(new Date())
                .deliveryName("Carlos")
                .deliveryStreet("My Street")
                .deliveryZip("myZip")
                .ccNumber("343")
                .ccExpiration("Myaa")
                .ccCVV(("CVV")).build();

        ObjectMapper objMapper = new ObjectMapper();
        Map<String, Object> values = objMapper.convertValue(order, Map.class);
        assertThat(values).isNotNull();



    }
}
