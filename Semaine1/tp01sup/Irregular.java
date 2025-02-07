class Irregular {
    private final int[][] data;

    public Irregular(int[] lineSize) {
        data = new int[lineSize.length][];
        for (int i = 0; i < lineSize.length; i++) {
            data[i] = new int[lineSize[i]];
        }
    }

    public void randomFilling() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public String display() {
        String result = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result += data[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean isCommon(int element) {
        for (int i = 0; i < data.length; i++) {
            boolean found = false;
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == element) {
                    found = true;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public boolean existCommon() {
        for (int i = 0; i < data[0].length; i++) {
            int element = data[0][i];
            if (isCommon(element)) {
                return true;
            }
        }
        return false;
    }
}