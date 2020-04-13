public class MoveSouth implements CommandInterface{

	private Player player;
	
	public MoveSouth(Player player) {
		
		this.player = player;
	}
	
	
	public void execute() {
		
		player.moveSouth();
	}

	public boolean undo() {
		
		
		return false;
	}
	

}