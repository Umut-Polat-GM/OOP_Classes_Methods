public class ProductManager {
    public  void name(Product product){

        System.out.println("Urunun adı:"+ product.getName());
    }
    public void id(Product product){
        System.out.println("Urunun id:"+product.getId());
    }
    public void price(Product product){
        System.out.println("Urunun fiyati:"+product.getPrice());
    }
}
