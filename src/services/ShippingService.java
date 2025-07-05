package services;

import Products_pac.ShippapleProduct;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ShippingService {
    public void ship(ArrayList<ShippapleProduct> items)
    {
        System.out.println("** Shipment notice **");

        Map<String, Integer> conuntHash = new LinkedHashMap<>();
        Map<String, Double> weightHash = new LinkedHashMap<>();
        double totalWeight = 0.0;

        for(ShippapleProduct item: items)
        {
            double weight = item.getWeight();
            conuntHash.put(item.getName(), conuntHash.getOrDefault(item.getName(), 0) +1);
            weightHash.put(item.getName(), weight);
            totalWeight += weight;
        }

        for(String label: conuntHash.keySet())
        {
            int quantity = conuntHash.get(label);
            double singleWeight = weightHash.get(label);
            System.out.printf("%d X %s \t %.2f KG \n", quantity, label, singleWeight*quantity);

        }

        System.out.printf("Total package weight %.2f \n", totalWeight);

        System.out.println();
    }
}
