
public class MaîtreAnimal {

	
	private static final String Type = null;
	public static void main(String[] args) {
		String réactionAnimal;
		String Type;
		AnimalFamilier monAnimal = new AnimalFamilier();
		monAnimal.manger();
		réactionAnimal = monAnimal.dire("Cui !! Cui !!");
		System.out.println(réactionAnimal);
		monAnimal.dormir();
	}
}
