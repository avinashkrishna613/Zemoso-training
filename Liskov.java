Class Animal {
	public void feedsOn() {
		System.out.println("Eats other animals");
	}
}

class Tiger extends Animal {
	public void feedsOn() {
		System.out.println("Tiger eats other animals");
	}
}



Class CarnivoresAnimal {
	public void feedsOn() {
		System.out.println("Eats other animals");
	}
}
Class HerbivoresAnimal {
	public void feedsOn() {
		System.out.println("Eats plants");
	}
}


class Cow extends HerbivoresAnimal {
	public void feedsOn() {
		System.out.println("Eats plants");
	}
}

class Tiger extends CarnivoresAnimal {
	public void feedsOn() {
		System.out.println("Tiger eats other animals");
	}
}
