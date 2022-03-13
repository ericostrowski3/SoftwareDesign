
	interface Animal {
		public void speak();
	}
	class Pig implements Animal {
		int weight;
		public void speak(){
			System.out.println("Oink!");
		}
	}
	class Cow implements Animal {
		int weight;
		public void speak(){
			System.out.println("Moo!");
		}
	}
	class Chicken implements Animal {
		int weight;
		public void speak(){
			System.out.println("Cluck!");
		}
	}

	class Song {
	public static void sing(Animal[] x) {
		System.out.println("Old MacDonald had a farm ...");
		int n = x.length;
		for (int i = 0; i < n; i=i+1) {
			x[i].speak();
		}
	}
}

class Macdonald {
	public static void main(String[] args) {
		Song.sing(new Animal[]{new Pig(), new Cow(), new Chicken()});
	}
}
