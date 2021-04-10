package inventoryProject;

import java.util.*;

public class Product {
	Scanner in = new Scanner(System.in);
//	@Override
//	public String toString() {
//		return "Item Number =" + number+ " \n" 
//					+ "Name =" + name + "\n"
//						+ "Quantity in stock =" + stock + "\n"
//								+ "Price =" + price + " \n"
//									+ "Stock Value = " + getInventoryValue() + "\n"
//										+ "Product Status = " + status + "";
//	}
	
	// instance field declaration
//	private String name;
//	private int number; 
//	private int stock;
//	private double price;
//	private boolean status; 
	
	int[] number = new int[50];
	String[] name = new String[100];
	int[] qty = new int[50];
	int[] price = new int[100];
	int[] status = new int[50];
	int maxSize;
	
	public Product() {
		
	}
	
	public void ZeroValue() {
		try {
		do {
			System.out.println("Input a number : ");
			maxSize = in.nextInt();
			
			if(maxSize <= 0) {
				System.out.println("Invalid Value Entered");
			} else {
				dataType();
			}
		} while (maxSize <= 0);
	} catch (Exception e) {
		System.out.println("Incorrect type entered!" + e);
	}
}
	// Only accessible in this class
	private void dataType() {
			for (int i = 0; i < maxSize; i++) {
				System.out.println("Input number : " + (i + 1));
				number[i] = i + 1;
				System.out.println("Input Name : " );
				name[i] = in.next();
				System.out.println("Input quantity in stock : ");
				qty[i] = in.nextInt();
				System.out.println("Input Price :");
				price[i] = in.nextInt();
				status[i] = qty[i] * price[i];
			}
	}
	
	public void show() {
		for(int i = 0; i < maxSize; i++) {
			System.out.println("Item Number : " + number[i]);
			System.out.println("Name : " + name[i]);
			System.out.println("Quantity in stock : " + qty[i]);
			System.out.println("Price : " + price[i]);
			System.out.println("Stock Value : " + status[i]);
		}
	}

//	public Product(String name, int number, int stock, double price, boolean status) {
//		this.name = name;
//		this.number = number;
//		this.stock = stock;
//		this.price = price;
//		this.status = status;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getNumber() {
//		return number;
//	}
//
//	public void setNumber(int number) {
//		this.number = number;
//	}
//
//	public int getStock() {
//		return stock;
//	}
//
//	public void setStock(int stock) {
//		this.stock = stock;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//	public void show() {
//		System.out.println("Item Number =" + this.getNumber() + 
//				"\n" + "Name =" + this.getName() + 
//				"\n" + "Quantity in stock = " + this.getStock()+ 
//				"\n" + "Price = " + this.getPrice() + 
//				"\n" + "Stock Value=" + this.getInventoryValue() +
//				"\n" + "Product Status = " + this.isStatus());
//	}
//
//	public boolean isStatus() {
//		return status;
//	}
//
//	public void setStatus(boolean status) {
//		this.status = status;
//	}
//	
//	public double getInventoryValue() {
//		double cek;
//		cek = this.getPrice() * this.getStock();
//		return cek;
//	}
}
