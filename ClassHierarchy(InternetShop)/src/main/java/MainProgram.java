import Classes.Client;
import Classes.Consultant;
import Classes.Security;
import Classes.Seller;
import Classes.Purchases;
import Classes.Refund;
import Classes.Warehouse;
import Classes.Review;
import Enums.TypeOfProduct;
import Exceptions.ReviewException;
import Exceptions.SecurityException;
import Exceptions.WarehouseException;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MainProgram {

    private static final Logger LOGGER = Logger.getLogger(MainProgram.class);

    public static void main(String[] args) throws WarehouseException, SecurityException, ReviewException {

        ArrayList<String> products = new ArrayList<String>();

        final Client client1 = new Client("Volodymyr", "+380964490990", "Chernivtsi", "Poletaeva", 18, "male");
        final Client client2 = new Client("Oleh", "+380966654367", "Kyiv", "Kyivska 20", 16, "male");
        final Client client3 = new Client("Dennis", "+38096234546", "Lviv", "Lvivska 26", 23, "male");

        Consultant consultant1 = new Consultant("Ivan","+38096256566","2","Consultant","male");
        Seller seller1 = new Seller("Bohdan","+38096987565","1","Seller","male");
        Security security1 = new Security("Ivan","+38096256566",2,"Security", "male");

        Purchases purchases1 = new Purchases("T-shirt", "Blue", "M", 2022, 1, 250);
        Refund refund1 = new Refund("Not my size", 2022);

        Review review1 = new Review("Volodymyr", "", 5);
        review1.setReviewText("Really like your shop, very good quality!");

        System.out.println("----------------------------");
        LOGGER.info(client1);
        System.out.println("----------------------------");
        LOGGER.info(client2);
        System.out.println("----------------------------");
        LOGGER.info(client3);
        System.out.println("----------------------------");
        LOGGER.info(consultant1);
        System.out.println("----------------------------");
        LOGGER.info(seller1);
        System.out.println("----------------------------");
        LOGGER.info(security1);
        System.out.println("----------------------------");
        LOGGER.info(purchases1);
        System.out.println("----------------------------");
        LOGGER.info(refund1);
        System.out.println("----------------------------");
        LOGGER.info(review1);
        System.out.println("----------------------------");

        Warehouse Warehouse1 = new Warehouse("Warehouse", products);
        Warehouse1.addToWarehouse("Shirt");
        Warehouse1.addToWarehouse("Cap");
        Warehouse1.addToWarehouse("Shorts");
        Warehouse1.addToWarehouse("Pants");
        Warehouse1.addToWarehouse("Hat");
        Warehouse1.deleteLastFromWarehouse("Shirt");
        Warehouse1.getIndexOf("Hat");
        LOGGER.info(Warehouse1);

        TypeOfProduct product = TypeOfProduct.PANTS;
        LOGGER.info(product.getValue());
    }
}
