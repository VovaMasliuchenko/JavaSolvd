import Classes.*;
import Enums.SizeChart;
import Enums.TypeOfProduct;
import Exceptions.ReviewException;
import Exceptions.SecurityException;
import Exceptions.WarehouseException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class MainProgram {

    private static final Logger LOGGER = Logger.getLogger(MainProgram.class);

    public static void main(String[] args) throws WarehouseException, SecurityException, ReviewException {

        ArrayList<String> products = new ArrayList<String>();
        Warehouse Warehouse1 = new Warehouse("Warehouse", products);

         List<Client> clientList = List.of(
                new Client("Volodymyr", "+380964490990", "Chernivtsi", "Poletaeva", 18, "male"),
                new Client("Oleh", "+380966654367", "Kyiv", "Kyivska 20", 16, "male"),
                new Client("Dennis", "+38096234546", "Lviv", "Lvivska 26", 23, "male")
        );
        Stream<Client> clientStream = clientList.stream();

         List<Consultant> consultantList = List.of(
                 new Consultant("Ivan","+38096256566",2,"Consultant","male"),
                 new Consultant("Den","+380962563456",1,"Consultant","male"),
                 new Consultant("Zhenya","+38096256566",5,"Consultant","female")
         );
        Stream<Consultant> consultantStream = consultantList.stream();

        List<Seller> sellerList = List.of(
                new Seller("Bohdan","+38096987565",1,"Seller","male"),
                new Seller("Clark","+38096989365",2,"Seller","male"),
                new Seller("Vita","+38096946565",3,"Seller","female")
        );
        Stream<Seller> sellerStream = sellerList.stream();

        List<Security> securityList = List.of(
                new Security("Ivan","+38096256566",2,"Security", "male"),
                new Security("Valentin","+38012356566",1,"Security", "male"),
                new Security("Evpatiy","+38096256123",4,"Security", "male")
        );
        Stream<Security> securityStream = securityList.stream();

        List<Purchases> purchasesList = List.of(
                new Purchases(TypeOfProduct.PANTS, "Blue", SizeChart.L, 2022, 1, 450),
                new Purchases(TypeOfProduct.SOCKS, "Blue", SizeChart.M, 2022, 1, 150),
                new Purchases(TypeOfProduct.SWEATSHIRT, "Blue", SizeChart.L, 2021, 1, 750)
        );
        Stream<Purchases> purchasesStream = purchasesList.stream();

        Refund refund1 = new Refund("Not my size", 2022);
        Review review1 = new Review("Volodymyr", "Really like your shop, very good quality!", 5);

        System.out.println("\n--------------Clients----------------\n");

        clientStream.forEach(client -> LOGGER.info(client));

        System.out.println("\n--------------Security----------------\n");

        securityStream.forEach(security -> LOGGER.info(security));

        System.out.println("\n--------------Consultant----------------\n");

        consultantStream.forEach(consultant -> LOGGER.info(consultant));

        System.out.println("\n--------------Sellers----------------\n");

        sellerStream.forEach(seller -> LOGGER.info(seller));

        System.out.println("\n--------------Purchases----------------\n");

        purchasesStream.forEach(purchases -> LOGGER.info(purchases));

        System.out.println("\n--------------Warehouse----------------\n");

        Warehouse1.addToWarehouse("Shirt");
        Warehouse1.addToWarehouse("Cap");
        Warehouse1.addToWarehouse("Shorts");
        Warehouse1.addToWarehouse("Pants");
        Warehouse1.addToWarehouse("Hat");
        Warehouse1.deleteLastFromWarehouse("Shirt");
        Warehouse1.getIndexOf("Hat");
        LOGGER.info(Warehouse1);

        System.out.println("\n--------------Salary of some guys----------------\n");

        consultantList.get(2).lambdaReturn();
        securityList.get(1).lambdaReturn();
        sellerList.get(1).lambdaReturn();

        System.out.println("\n-------------------------------------------------\n");

        Warehouse1.makeRandomDiscount();

    }
}
