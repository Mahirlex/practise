package newfile.gitlab;

public class Example {

	private int pens;
	private String name;
	private int price;
	private long serial;
	
	public int getPens() {
		return pens;
	}
	public void setPens(int pens) {
		this.pens=pens;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public long getSerial() {
		return serial;
	}
	public void setSerial(long serial) {
		this.serial=serial;
	}
	@Override
	public String toString() {
		return "Example[pens="+pens +",name="+name +",price="+price +",serial="+serial +"]";
	}
}
