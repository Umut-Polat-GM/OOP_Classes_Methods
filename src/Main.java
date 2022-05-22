public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();   //Product class icine urunun niteliklerini yazdık.
        Product product2 = new Product();


        product1.setName("Leptop");
        product1.setId(1234);
        product1.setPrice(5000);
        product2.setName("Mause");
        product2.setId(1598);
        product2.setPrice(4200);

        ProductManager productManager = new ProductManager(); //ProductManager ile prodcut class icinde operasyon yapacagız.

        productManager.name(product1);  //Burada bir class ın icine yazdıgımız nitelikleri baska bir class ile cagırdık.
        productManager.id(product1); //ProductManager class icine productManager ile gidip bir method çagırdık.
                                    // ProductManager icesindeki method Product class icinden niteliğe ulaşıyor.
        productManager.price(product1);
        productManager.name(product2);
        productManager.id(product2);
        productManager.price(product2);
    }
}
