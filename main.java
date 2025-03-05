
import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product("001", "Sci-Fi Book", 12.99, "Fantastic Books", "Entertainment", 4.5));
        products.add(new Product("002", "Notebook", 3.89, "Foundation Education", "Educational", 4.8));
        products.add(new Product("003", "Lunchbox", 19.99, "Snacks-a-lot", "Food/Cooking", 3.7));
        products.add(new Product("004", "Backpack", 12.99, "Foundation Education", "Educational", 4.5));
        products.add(new Product("005", "Portable Charger", 30.99, "Mango", "Tech", 4.9));

        Criteria EduCriteria = new categoryCriteria();
        Criteria CheapCriteria = new PriceCriteria();
        Criteria RatingCriteria = new customerRatingCriteria();
        Criteria FoundCriteria = new brandCriteria();

        printFilteredProducts("Educational Products: ", EduCriteria, products);
    }

    public static void printFilteredProducts(String filter, Criteria criteria, List<Product> products){
        System.out.println("\n" + filter);
        List<Product> filteredProducts = criteria.meetCriteria(products);
        for(Product p : filteredProducts){
            p.printProducts();
        }
    }
}