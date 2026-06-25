package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        int targetId = 102;

        products.add(new Product(101, "phone", "electronics"));

        products.add(new Product(111, "chair", "furniture"));

        products.add(new Product(105, "desk", "furniture"));

        products.add(new Product(102, "watch", "electronics"));


        System.out.println("----- Linear search -----");
        //linear search
        int i=0;
        boolean found = false;
        for(Product product : products){
            i++;
            if(product.getProductId() == targetId){
                System.out.println("product found: name: "+product.getProductName()+" , category : "+product.getCategory());
                found = true;
                break;
            }
            
        }

        if(!found){
            System.out.println("not found");
        }

        System.out.println("total iterations : "+i);


        System.out.println("----- Binary Search ----");
        //binary search

        //sorting the list
        products.sort((product1, product2) -> Integer.compare(product1.getProductId(), product2.getProductId()));

        int low = 0;
        int high =  products.size() -1;
        i=0;
        found = false;

        while(low <= high){
            i++;
            int mid = low + (high - low)/2;

            Product curr = products.get(mid);
            if(curr.getProductId() < targetId){
                low = mid+1;
            }
            else if(curr.getProductId() > targetId){
                high = mid-1;
            }
            else{
                System.out.println("found : , name: "+curr.getProductName()+" , category : "+curr.getCategory());
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("not found ");
        }

        System.out.println("total iterations: "+i);
        

        //Time complexity analysis

        // Linear Search:
        // Best Case: O(1)
        // Average Case: O(n)
        // Worst Case: O(n)
        
        // Binary Search:
        // Best Case: O(1)
        // Average Case: O(log n)
        // Worst Case: O(log n)
    
    }
}
