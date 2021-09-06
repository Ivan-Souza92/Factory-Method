package factory;

import model.IDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryFactoryTest {

    @Test
    void TesteDeliveryInexistente(){

        try{

            IDelivery delivery = DeliveryFactory.solicitarDelivery("Avião");
            fail();

        }catch (IllegalArgumentException e){

            assertEquals("Delivery Inexistente", e.getMessage());
        }
    }

}