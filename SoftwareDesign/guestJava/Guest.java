class Guest {
	private static void main(String[] args) {
		Guest g = new Guest("Eric");
		g.greet();
		}
	private String name;
	
	public Guest(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
	public void greet() {
		System.out.println("Hello, my name is " + this.name + ".");
	}
}
