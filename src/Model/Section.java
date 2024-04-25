package Model;

import java.util.ArrayList;

public class Section {
	
	private int ID;
	private ArrayList<Product> products;
	private String name;
	private String description;
	
	public Section() {
		
	}
	
	public Section(int ID, String name, ArrayList<Product> products, String description) {
		this.ID = ID;
		this.name = name;
		this.products = products;
		this.description = description;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
