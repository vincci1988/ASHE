package agent;

public class Fold extends ActionBase {

	public Fold(int playerID) {
		super(playerID);
	}

	public String toString() {
		return "Player[" + playerID + "]: Fold";
	}

	String compress() {
		return "f";
	}

}
