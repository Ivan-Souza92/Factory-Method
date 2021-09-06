package model;

public class DeliveryCarro implements IDelivery{

    @Override
    public String executar() {
        return "Realizar entrega";
    }

    @Override
    public String cancelar() {
        return "Entrega cancelada";
    }
}
