public class StarWarsShips extends SpaceShip {
				
			private int Tonnage;
			private String Name;
			private String Franchise;
			
			public StarWarsShips(int Tonnage,String Name,String Franchise ) {
				
				this.Tonnage = Tonnage;
				this.Name =Name;
				this.Franchise = Franchise;
			}
			
			public int getTonnage() {
				return Tonnage;
			}

			public String getName() {
				return Name;
			}

			public String getFranchise() {
				return Franchise;
			}

		}
