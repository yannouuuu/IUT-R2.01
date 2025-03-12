package semaine2.tp02;
public class UseCompetitor2 {
	public static void main(String[] args) {
		Competitor alice = new Competitor(1, 45, 15, 20);
		Competitor bruno = new Competitor(1, 45, 15, 20);
		Competitor clement = new Competitor(2, 32, 12, 45);
		Competitor dora = new Competitor(2, 34, 12, 45);
		System.out.println("Alice:" + alice + " Bruno:" + bruno + "->" + alice.equals(bruno));
		System.out.println("Alice:" + alice + " null:" + null + "->" + alice.equals(null));
		System.out.println("Alice:" + alice + " Alice:" + alice + "->" + alice.equals(alice));
		System.out.println("Alice:" + alice + " Clement:" + clement + "->" + alice.equals(clement));
		System.out.println("Clement:" + clement + " Dora:" + dora + "->" + clement.equals(dora));
	}
}