public class Cookie implements BakedGoods{
	
	private String price;
	private String cookieDescription;
	private String cookieSellByDate;
	
	
	public Cookie(String price, String cookieDescription, String cookieSellByDate) {
		
		this.price = price;
		this.cookieDescription = cookieDescription;
		this.cookieSellByDate = cookieSellByDate;
	}
	
	
	public String getPrice() {
		
		return price;
	}

	public String getDescription() {
		
		
		return cookieDescription;
	}

	public String getSellByDate() {
		
		
		return cookieSellByDate;
	}
	
	

}