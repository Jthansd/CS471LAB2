
import java.util.ArrayList;
import java.util.List;

public class brandCriteria implements Criteria{
    @Override
    public List<Product> meetCriteria(List<Product> products){
        List<Product> brandList = new ArrayList<Product>(); 
        for(Product product : products){
            if(product.getBrand().equals("Foundation Education")){
                brandList.add(product);                
            }
        }
        return brandList;
    }

}