package model;

import factory.DeliveryFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryMotoTest {

    @Test
    void executarEntrega(){

        IDelivery delivery = DeliveryFactory.solicitarDelivery("Carro");
        assertEquals("Realizar entrega", delivery.executar());
    }

    @Test
    void cancelarEntrega(){

        IDelivery delivery = DeliveryFactory.solicitarDelivery("Carro");
        assertEquals("Entrega cancelada", delivery.cancelar());
    }

}