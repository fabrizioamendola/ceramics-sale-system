
public class Ceramic {
	
	private String brand;
	private String name;
	private double height;
	private double width;
	private Type type;
	private int quality;
	private int price;
	private int realStock;
	private double amountPerBox;
	
	public double getAmountPerBox() {
		return amountPerBox;
	}
	
	public void setAmountPerBox(double amount) {
		this.amountPerBox = amount;
	}
	
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
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

	public Ceramic(String brand, String name, double height, double width, Type type, int quality, int price, int realStock, double amount) {
		this.setBrand(brand);
		this.setName(name);
		this.setHeight(height);
		this.setWidth(width);
		this.setType(type);
		this.setQuality(quality);
		this.setPrice(price);
		this.setRealStock(realStock);
		this.setAmountPerBox(amount);
	}

	public Double tilesPerBox() {
		return (this.getAmountPerBox() / (this.getHeight() * this.getWidth()));
	}

	public void addStock(int stock) {
		this.setRealStock(this.getRealStock() + stock);
	}

	public void removeStock(int stock) {
		this.setRealStock(this.getRealStock() - stock);	
	}

}
