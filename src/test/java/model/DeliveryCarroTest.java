package model;

import factory.DeliveryFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryCarroTest {

    @Test
    void executarEntrega(){

        IDelivery delivery = DeliveryFactory.solicitarDelivery("Moto");
        assertEquals("Realizar entrega", delivery.executar());
    }

    @Test
    void cancelarEntrega(){

        IDelivery delivery = DeliveryFactory.solicitarDelivery("Moto");
        assertEquals("Entrega cancelada", delivery.cancelar());
    }

}