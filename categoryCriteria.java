
import java.util.ArrayList;
import java.util.List;

public class categoryCriteria implements Criteria{
    @Override
    public List<Product> meetCriteria(List<Product> products){
        List<Product> categoryList = new ArrayList<Product>(); 
        for(Product product : products){
            if(product.getCategory() == "Educational"){
                categoryList.add(product);                
            }
        }
        return categoryList;
    }

}