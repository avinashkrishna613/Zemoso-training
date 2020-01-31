Interface Vegetables {
	public void removeRoots();
	public void eat();
}

class Carrot implements Vegetables {
	public void removeRoots() {
		System.out.println("remove roots for carrot");
	}
	public void eat() {
		System.out.println("can eat");
	}
}

//For Beans: ??

Interface RootVegetables {
	public void removeRoots();
	public void eat();
}

Interface NonRootVegetables {
	public void eat();
}


class Carrot implements RootVegetables {
	public void removeRoots() {
		System.out.println("remove roots for carrot");
	}
	public void eat() {
		System.out.println("can eat");
	}
}

class Beans implements NonRootVegetables {
	public void eat() {
		System.out.println("can eat");
	}
}

