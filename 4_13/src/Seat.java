public class Seat {
	private String name = "---";
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void show() {
		System.out.print(this.name + " ");
	}
	
	public boolean isMatched(String checkName) {
		return this.name.equals(checkName);
	}
	
	public void cancel() {
		this.name = "---";
	}
}
