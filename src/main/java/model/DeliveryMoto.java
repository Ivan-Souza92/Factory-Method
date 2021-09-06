package model;

public class DeliveryMoto implements IDelivery{
    @Override
    public String executar() {
        return "Realizar entrega";
    }

    @Override
    public String cancelar() {
        return "Entrega cancelada";
    }
}
