package Classes;

import Exceptions.WarehouseException;
import Interfaces.IActionArrayList;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Warehouse implements IActionArrayList {

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

    public void addToWarehouse(String item) throws WarehouseException {
        if (item.equals("")) {
            throw new WarehouseException("Cannot be empty name!");
        } else {
            products.add(item);
            LOGGER.info("Added element: " + item);
        }
    }

    public void deleteLastFromWarehouse(String item) throws WarehouseException {
        if (item.equals("")) {
            throw new WarehouseException("Dont have element to delete!");
        } else {
            products.remove(item);
            LOGGER.info("Deleted element: " + item);
        }
    }

    @Override
    public String toString() {
        return "Classes.Warehouse" +
                "\nItems: " + products;
    }

    @Override
    public void removeAll() {
        products.clear();
    }

    @Override
    public void getIndexOf(String item) {
        LOGGER.info(products.indexOf(item));
    }
}
