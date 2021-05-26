package OopProject1;

public abstract class Documents implements School {
    //Total teacher + assistant teacher in the school
    public int teacher(int a, int b) {
        int total = a + b;
        return total;
    }

    // total teacher + assistant teacher + part-time teacher in the school
    public int teacher(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    //total student of section A and B
    public int student(int x, int y) {
        int total = x + y;
        return total;
    }

    // total maintenance cost
    public int maintenance(int x, int other) {
        int total = x + other;
        return total;
    }
//
    public static class StudentInfo {
        private String name;
        private int roll;

        public void setName(String name) {
            this.name = name;
        }

        public void setRolls(int roll) {
            this.roll = roll;
        }

        public int getRoll() {
            return roll;
        }

        public String getName() {
            return name;
        }


    }
}
