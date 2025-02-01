package Com.tka.Task1;

import java.util.ArrayList;
import java.util.List;

public class ProductOperation {
	
	List<Product>list=new ArrayList<Product>();
	
	public String addProduct(Product product) {
		
	for (Product dpproduct : list) {
		if((dpproduct.getProductName()).equalsIgnoreCase(product.getProductName())) {
			return "Product alredy exit...";
		}
		
	}	
		
		list.add(product);
		return "Product Added Successfully !";
		
	}
    
	public Object getAllProduct() {
		try {
			if(list.isEmpty()) {
				return "Product nit exists in list";
			} else {
				return list;
				
			}
		} catch (Exception e) {
			return list;
			
		}
		
	}
}

		
		
	   
	
	
		
	


