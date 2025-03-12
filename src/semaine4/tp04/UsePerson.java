package semaine4.tp04;

public class UsePerson {
	public static void main(String[] args) {
		Person alice = new Person("Alice", "A");
		Person bruno = new Person("Bruno", "B");
		Person autre = alice;
		boolean testsOK = true;
		// test des getters
		if(!alice.getForename().equals("Alice") || !alice.getName().equals("A") || !bruno.getForename().equals("Bruno") || !bruno.getName().equals("B") || !autre.getForename().equals("Alice") || !autre.getName().equals("A")) {
			System.out.println("Erreur de méthodes GET");
			testsOK = false;
		}
		// test des setters
		alice.setForename("Anatole");
		bruno.setName("BB");
		if(!alice.getForename().equals("Anatole") || !alice.getName().equals("A") || !bruno.getForename().equals("Bruno") || !bruno.getName().equals("BB") || !autre.getForename().equals("Anatole") || !autre.getName().equals("A")) {
			System.out.println("Erreur de méthodes SET");
			testsOK = false;
		}
		// test du equals
		if(alice.equals(bruno) || !alice.equals(autre)) {
			System.out.println("Erreur de méthode equals");
			testsOK = false;
		}
		if(testsOK) System.out.println("Tests de UsePerson réussis !");
	}
}