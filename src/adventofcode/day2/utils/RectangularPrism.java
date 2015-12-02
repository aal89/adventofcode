package adventofcode.day2.utils;

import java.util.Arrays;

public class RectangularPrism {
	
	private int l, w, h;
	private int[] products;
	
	public RectangularPrism(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
		this.products = new int[3];
		
		//we calculate all the sides
		products[0] = w * h;
		products[1] = l * w;
		products[2] = l * h;
		
		//sort the products so that the smallest side is always at index 0
		Arrays.sort(products);
	}
	
	/**
	 * Calculates the surface area of this rectangular prism.
	 * @return An int as the surface area.
	 */
	public int area() {
		
		return 2 * (products[0] + products[1] + products[2]);
	}
	
	public int smallestSide() {
		
		return products[0];
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

}
