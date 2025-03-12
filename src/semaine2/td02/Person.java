package semaine2.td02;
class Person {
    String name = "";
    int age = -1;

    Person() {};
    Person(String aName, int value) {
        this.name = aName;
        this.age = value;
    }
    Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    public String toString() {return this.name + "(" + this.age + ")";}

    void changeMe(Person aName) {this.name = aName.name; this.age = aName.age;}
    void changeYou(Person aName) {aName.name = this.name; aName.age = this.age;}
    void changeComplete(Person aName) {aName = this;}

    Person getMe() {return this;}
    Person getLikeMe() {return new Person(this);}

    void changeMyAge(int aValue) {this.age = aValue;}
    // void changeYourAge(int aValue) {aValue = this.age;}
    // void changeAName(String aName) {aName = this.name;}
    void changeAnotherName(String aName) {this.name = aName;}
    String changeYourName(/*String aName*/) {return this.name;}

    public static void main(String args[]){
        Person alice = new Person();
        Person bruno = new Person("alice", 42);
        Person clement = new Person(bruno);

        System.out.println(alice);
        bruno.changeYou(clement);
        clement.changeMe(alice);
        alice.changeComplete(bruno);

        System.out.println(alice + "\t" + bruno + "\t" + clement);
        bruno.age = 404;
        bruno.name = "bruno";
        System.out.println(alice + "\t" + bruno + "\t" + clement);

        System.out.println(alice + "\t" + bruno + "\t" + clement);
        bruno.changeYou(clement);
        clement.changeMe(alice);
        alice.changeComplete(bruno);
        bruno.name = "grincheux";
        System.out.println(alice + "\t" + bruno + "\t" + clement);

        System.out.println(alice + "\t" + bruno + "\t" + clement);
        alice = bruno.getMe();
        clement = bruno.getLikeMe();
        bruno.name = "grincheux";
        System.out.println(alice + "\t" + bruno + "\t" + clement);

        int otherAge = 404; String otherName = "grincheux";
        System.out.println(alice + "\t" + bruno + "\t" + clement);
        alice.changeMyAge(otherAge);
        // alice.changeAName(otherName);
        // bruno.changeYourAge(otherAge);
        alice.changeAnotherName(otherName);
        System.out.println(alice + "\t" + bruno + "\t" + clement + "\t" + otherAge+otherName);
        // otherName = bruno.changeYourName(otherName);
        System.out.println(alice + "\t" + bruno + "\t" + clement + "\t" + otherAge+otherName);
    }
}