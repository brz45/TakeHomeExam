import java.util.ArrayList;

public class ExamQ3Interface {

	public static void main(String[] args) {

		ArrayList<BakedGoods> myList = new ArrayList<BakedGoods>();
		Cookie c = new Cookie("$2","Cookie: different flavors, fun to eat","05-05-2020\n");
		CinnamonRoll cr = new CinnamonRoll("$8","Cinnamon Roll: layered Cake rolls","05-01-2020\n");
		Brownie b = new Brownie("$5","Brownie: Delicious cake","05-10-2020");

		myList.add(c);
		myList.add(cr);
		myList.add(b);
		
		int counter = 1;
		for (int i = 0; i < myList.size(); i++) {

			System.out.println(counter+": " + myList.get(i).getDescription());
			System.out.println("Price: " + myList.get(i).getPrice());
			System.out.println("Sell By Date: " + myList.get(i).getSellByDate());
			counter++;
		}
	}
}