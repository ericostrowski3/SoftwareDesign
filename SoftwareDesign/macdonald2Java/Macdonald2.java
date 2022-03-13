	class Animal {
                public void speak(){
		}
		int weight;
		public void eat(int food){
			weight = weight + food;
		}
		
		public int getWeight(){
			return weight;
		}
		
		 
        }
	class Pig extends Animal {
                public void speak(){
                        System.out.println("Oink!");
                }
        }
	class Cow extends Animal {
                public void speak(){
                        System.out.println("Moo!");
                }
        }
	class Chicken extends Animal {
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

class Macdonald2 {
        public static void main(String[] args) {
                Song.sing(new Animal[]{new Pig(), new Cow(), new Chicken()});
        }
}




