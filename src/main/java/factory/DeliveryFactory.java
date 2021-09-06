package factory;

import model.IDelivery;

public class DeliveryFactory {

    public static IDelivery solicitarDelivery(String delivery){

        Class classe = null;
        Object objeto = null;

        try{

            classe = Class.forName("model.Delivery" + delivery);
            objeto = classe.newInstance();

        }catch (Exception ex){

            throw new IllegalArgumentException("Delivery Inexistente");
        }

        if(!(objeto instanceof IDelivery)){

            throw new IllegalArgumentException("Delivery Inválido");
        }

        return (IDelivery) objeto;
    }
}
