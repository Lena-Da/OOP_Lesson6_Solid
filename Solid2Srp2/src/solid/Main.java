package solid;

import solid.srp.models.InputConsole;
import solid.srp.models.Order;
import solid.srp.models.PersisterOrderFile;

public class Main {
    public static void main(String[] args) {
        PersisterOrderFile persisterOrderFile = new PersisterOrderFile("Solid2Srp2\\order.json");
        System.out.println("Введите заказ:");
        Order order = (new InputConsole()).inputFromConsole();
        persisterOrderFile.saveToJson(order);
    }
}
