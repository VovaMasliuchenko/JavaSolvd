package Classes;

import Exceptions.WarehouseException;
import Interfaces.IArrayListAction;

import java.util.ArrayList;
import org.apache.log4j.Logger;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class Warehouse extends Product implements IArrayListAction {

    private static  final Logger LOGGER = Logger.getLogger(Warehouse.class);

    private String name;
    private ArrayList<String> products = new ArrayList<String>();

    Warehouse() {
    }

    public Warehouse(String name, ArrayList<String> products) {
        this.name = name;
        this.products = products;
    }

    public void setName(String gender) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addToWarehouse(String item) throws WarehouseException {
        if (item.isEmpty()) {
            try {
                throw new WarehouseException("Cannot be empty name!");
            } catch (WarehouseException e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());
            }
        } else {
            products.add(item);
            LOGGER.info("Added element: " + item);
        }
    }

    @Override
    public void deleteLastFromWarehouse(String item) throws WarehouseException {
        if (item.isEmpty()) {
            try {
                throw new WarehouseException("Dont have element to delete!");
            } catch (WarehouseException e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());
            }
        } else {
            products.remove(item);
            LOGGER.info("Deleted element: " + item);
        }
    }

    @Override
    public String toString() {
        return "Warehouse" +
                "\nItems: " + products;
    }

    @Override
    public void removeAll() {
        products.clear();
    }

    @Override
    public void makeRandomDiscount() {
        int discountSize = nextInt(1, 10);
         LOGGER.info("Your random discount is: " + discountSize + "%");
         if (discountSize >= 7) {
             LOGGER.info("You are very lucky!");
         } else if (discountSize > 3 || discountSize < 6) {
             LOGGER.info("Good for you!");
         } else if (discountSize <= 2) {
             LOGGER.info("You will get lucky next time!");
         }
    }

    @Override
    public void getIndexOf(String item) {
        LOGGER.info(products.indexOf(item));
    }
}
