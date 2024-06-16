
public class Ceramic {
	
	private String brand;
	private String name;
	private int height;
	private int width;
	private Type type;
	private int quality;
	private int price;
	private int realStock;
	
	public int getRealStock() {
		return realStock;
	}

	public void setRealStock(int realStock) {
		this.realStock = realStock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuality() {
		return quality;
	}
	
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name=name;		
	}
	
	public String getBrand() {
		return brand;
	}

	private void setBrand(String brand) {
		this.brand=brand;
	}

	public Ceramic(String brand, String name, int height, int width, Type type, int quality, int price, int realStock) {
		this.setBrand(brand);
		this.setName(name);
		this.setHeight(height);
		this.setWidth(width);
		this.setType(type);
		this.setQuality(quality);
		this.setPrice(price);
		this.setRealStock(realStock);
	}
	

}
