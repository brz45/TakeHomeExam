public class MoveWest implements CommandInterface {

	private Player player;
	
	public MoveWest(Player player) {
		
		this.player = player;
	}
	
	public void execute() {

		player.moveEast();
		
	}

	public boolean undo() {

		
		return false;
	}

}