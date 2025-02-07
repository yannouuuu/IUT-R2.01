class Score {
    String name;
    int score;
    String timestamp;

    public Score(String name, int score, String timestamp) {
        this.name = name;
        this.score = score;
        this.timestamp = timestamp;
    }

    public String toString() {
        return "(" + this.timestamp + ") " + this.name + " = " + this.score;
    }

    public boolean isSamePlayer(Score other) {
        return this.name.equals(other.name);
    }

    public boolean isHigher(Score other) {
        return this.score > other.score;
    }
}