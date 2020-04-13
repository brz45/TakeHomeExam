import java.util.ArrayList;
public class ExamQ3Abstract {
    public static void main(String[] args) {
    	
         ArrayList<SpaceShip> list = new ArrayList<SpaceShip> ();
         
         StarWarsShips sw = new StarWarsShips( 50,"StarWarsShips"," Star Wars\n");
         StarTrekShips st = new StarTrekShips( 100,"StarTrekShips","Star Trek\n");
         OtherSciFiSpaceShips osp= new OtherSciFiSpaceShips( 150,"OtherSciFiSpaceShips","Firefly\n");
         
         list.add(sw);
         list.add(st);
         list.add(osp);
         
  
         for(int i=0;i<list.size();i++) {
        	 
             SpaceShip space_ship = list.get(i);
             System.out.println("Tonnage: "+ space_ship.getTonnage());
             System.out.println("Name: "+ space_ship.getName());
             System.out.println("getFranchise: "+space_ship.getFranchise());
         		
         }
    }
}