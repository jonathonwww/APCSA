
public class Player extends Entity {
	private int goldCount = 0;
	private ArrayList<Item> stuff = new ArrayList<Item>;
	public Player(String name, String desc, int xPos, int yPos) {
		super(name, desc, xPos, yPos);
		goldCount = 0;

	}
	
	public void moveNorth() {
		moveTo(getX(), getY() - 1);
		
	}
	
	public void moveSouth() {
		moveTo(getX(), getY() + 1);
	}
	
	public void moveWest() {
		moveTo(getX() - 1, getY());
	}
	
	public void moveEast() {
		moveTo(getX() + 1, getY());
	}
	public  void throw() {
		for(Item o : stuff) {
			if(o instanceOf GoldFish)
				break;
			else
				stuff.remove(o.get());
			
		}
	}
	
	public void pickUpGoldFish(int amt) {
		numGold += amt;
	}
	
	public void pickUpItem(Item i) {
		items.add(i);
	}
	
	public int getGoldCount() {
		return goldCount;
	}
}
