package solid.srp.models;

import java.io.FileWriter;
import java.io.IOException;

public class PersisterOrderFile {
    String fileName = "order.json";
    
    public PersisterOrderFile(String fileName) {
        this.fileName = fileName;
    }

    public void saveToJson(Order order1) {
        
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order1.getClientName() + "\",\n");
            writer.write("\"product\":\""+order1.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order1.getQnt()+",\n");
            writer.write("\"price\":"+order1.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
