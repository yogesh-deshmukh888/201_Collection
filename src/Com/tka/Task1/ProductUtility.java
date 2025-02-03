package Com.tka.Task1;

import java.util.Scanner;

import Com.tka.Task1.Product;


public class ProductUtility {
	static Scanner scanner=new Scanner(System.in);
	public static Product prepareProduct() {

		System.out.println("Enter Product Id");
		int productid=scanner.nextInt();

		System.out.println("Enter The ProductName");
		String productname=scanner.next();

		System.out.println("Enter the ProductQty");
		int productQuentity=scanner.nextInt();

		System.out.println("Enter the ProductPrice");
		double productprice=scanner.nextDouble();

		System.out.println("Enter the Productdate");
		String productPrice=scanner.next();

		System.out.println("Enter The ProductExdate");
		String productExdate=scanner.next();

		Product product= new Product(productid, productname, productQuentity, productprice, productPrice, productExdate);
		return product;

	}
}











