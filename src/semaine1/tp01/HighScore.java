package semaine1.tp01;
public class HighScore {
    private Score[] top;
    
    public HighScore() {
        this.top = new Score[100];
    }
    
    public HighScore(int size) {
        this.top = new Score[size];
    }
    
    public int getNbFreeSlot() {
        int freeSlots = 0;
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                freeSlots++;
            }
        }
        return freeSlots;
    }
    
    public boolean addFirstFreeSlot(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        String result = "TOP SCORE:\n";
        for (int i = 0; i < top.length; i++) {
            if (top[i] != null) {
                result = result + top[i].toString() + "\n";
            }
        }
        result = result + "**" + getNbFreeSlot() + " free slots**";
        return result;
    }

    public void shifting(int idx) {
        for (int i = idx; i < top.length - 1; i++) {
            top[i] = top[i + 1];
        }
        top[top.length - 1] = null;
    }

    public boolean addHighestFirst(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            } else if (top[i].score < newScore.score) {
                shifting(i);
                top[i] = newScore;
                return true;
            }
        }
        if (top[top.length - 1] != null && top[top.length - 1].score < newScore.score) {
            top[top.length - 1] = newScore;
            return true;
        }
        return false;
    }

    public boolean addOneSlotPerPlayer(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            } else if (top[i].isSamePlayer(newScore)) {
                if (top[i].score < newScore.score) {
                    shifting(i);
                    top[i] = newScore;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}