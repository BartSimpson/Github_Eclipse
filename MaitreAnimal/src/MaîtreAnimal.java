
public class Ma�treAnimal {

	
	private static final String Type = null;
	public static void main(String[] args) {
		String r�actionAnimal;
		String Type;
		AnimalFamilier monAnimal = new AnimalFamilier();
		monAnimal.manger();
		r�actionAnimal = monAnimal.dire("Cui !! Cui !!");
		System.out.println(r�actionAnimal);
		monAnimal.dormir();
	}
}
