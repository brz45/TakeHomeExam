public class MoveEast implements CommandInterface {

	private Player player;
	
	public MoveEast(Player player) {
		
		this.player = player;
	}
	
	
	public void execute() {

		player.moveEast();
		
	}

	public boolean undo() {
		
		
		
		return false;
	}

}