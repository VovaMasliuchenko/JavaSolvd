package Interfaces;

import Exceptions.WarehouseException;

public interface IArrayListAction {

    void addToWarehouse(String item) throws WarehouseException;
    void deleteLastFromWarehouse(String item) throws WarehouseException;
    void removeAll();
    void makeRandomDiscount();
    void getIndexOf(String item);
}
