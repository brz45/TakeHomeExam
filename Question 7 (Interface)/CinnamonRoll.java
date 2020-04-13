public class CinnamonRoll  implements BakedGoods{

	
	private String price;
	private String cinnamonDescription;
	private String cinnamonSellByDate;
	
	public CinnamonRoll(String price,String cinnamonDes,String cinnamonSellByDate ) {
		
		this.price = price;
		this.cinnamonDescription =cinnamonDes;
		this.cinnamonSellByDate =cinnamonSellByDate;
		
	}
	
	@Override
	public String getPrice() {
		
		return price;
	}

	@Override
	public String getDescription() {
		
		
		return cinnamonDescription;
	}

	@Override
	public String getSellByDate() {
		
		return cinnamonSellByDate;
	}

}
