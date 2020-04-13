public class Brownie implements BakedGoods{
	private String price;
	private String brownieDescription;
	private String brownieSellByDate;
			
	public Brownie(String price,String brownieDescription,String brownieSellByDate ) {
		this.price = price;
		this.brownieDescription =brownieDescription;
		this.brownieSellByDate = brownieSellByDate;
		}
	public String getPrice() {
		return price;
	}

	public String getDescription() {
		return brownieDescription;
	}

	public String getSellByDate() {
		return brownieSellByDate;
	}

}
