package enumeracao_composicao.exemplo01.application;

import enumeracao_composicao.exemplo01.models.Order;
import enumeracao_composicao.exemplo01.models.OrderStatus;

import java.time.LocalDate;

public class App {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();

        Order order = new Order(111, date, OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
