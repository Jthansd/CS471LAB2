
import java.util.ArrayList;
import java.util.List;

public class PriceCriteria implements Criteria{
    @Override
    public List<Product> meetCriteria(List<Product> products){
        List<Product> PriceList = new ArrayList<Product>(); 
        for(Product product : products){
            if(product.getPrice() <= 14.99){
                PriceList.add(product);                
            }
        }
        return PriceList;
    }

}