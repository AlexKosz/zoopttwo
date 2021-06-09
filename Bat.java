public class Bat extends Mamal {
private Integer energy = 300;
public Integer fly(Integer num) {
    System.out.println("Flies " + num)
	this.energy -= (num * 50);
	return energy;
}

public Integer eatHumans(Integer num) {
	System.out.println("Eats " + num + " ppl" );
	this.energy += (25 * num);
	return energy;
}

public Integer attackTown(Integer num) {
	System.out.println("Destroyed " + num + " Town(s)");
	this.energy -= (num * 100);
	return energy;
}
}