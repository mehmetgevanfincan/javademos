public class ProductManager {
    public void add(Product product){
        ProductValidator productValidator =new ProductValidator();
        if(ProductValidator.isValid(product)){
            System.out.println("ADD");
        }else {
            System.out.println("not enough product information");
        }
    }
}
