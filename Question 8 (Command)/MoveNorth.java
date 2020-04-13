public class MoveNorth implements CommandInterface{

	
	private Player player;
	
	public MoveNorth(Player player) {
		
		this.player = player;
	}
	
	
	
	public void execute() {
		
		player.moveNorth();
	}

	public boolean undo() {
		
		return false;
	}

	
}