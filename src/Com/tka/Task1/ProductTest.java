package Com.tka.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Com.tka.Task1.Product;
import Com.tka.Task1.ProductOperation;

public class ProductTest {

	public static void main(String[] args) {
	
		ProductOperation operation = new ProductOperation();
		
		Product product = ProductUtility.prepareProduct();
		
		String msg = operation.addProduct(product);
		
		System.out.println(msg);
		
		
		
		
	    }

}
