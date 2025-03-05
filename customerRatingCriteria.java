
import java.util.ArrayList;
import java.util.List;

public class customerRatingCriteria implements Criteria{
    @Override
    public List<Product> meetCriteria(List<Product> products){
        List<Product> customerRatingList = new ArrayList<Product>(); 
        for(Product product : products){
            if(product.getCustomerRating() >= 4.0){
               customerRatingList.add(product);                
            }
        }
        return customerRatingList;
    }

}