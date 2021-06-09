
public class BatTest {
	public static void main(String[] args) {
        Mamal iDmamal = new Mamal();
		Bat iDbat = new Bat();
		Integer bEnergy = iDmamal.displayBatEnergy();
		Integer batAttack = iDbat.attackTown(3);
		Integer batEat = iDbat.eatHumans(2);
		Integer batFly = iDbat.fly(2);

		
	}
}