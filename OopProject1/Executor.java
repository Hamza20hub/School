package OopProject1;

public class Executor {
    public static void main(String[] args) {
        Information information = new Information();

        System.out.println("Student total of both sections: " + information.student(40, 50));
        System.out.println("Teacher+Assistant Teacher: " + information.teacher(10, 20));
        System.out.println("Teacher+Assistant Teacher+ Part-time Teacher: " + information.teacher(10, 20, 10));
        System.out.println("All Stuff Including teacher: " + information.stuff());
        System.out.println("Total weekly spending:$ " + information.maintenance(900, 100));
        int spending = information.maintenance(900, 200);
        if (spending > 1000) {
            System.out.println("Spending Limit Exceeded !!!"+spending);
        } else {
            System.out.println("Spending under Control ");
        }
        Documents.StudentInfo ds = new Documents.StudentInfo();
        ds.setName("john");
        ds.setRolls(101);
        System.out.println(ds.getName());
        System.out.println(ds.getRoll());

    Grade grade = new Grade();

        System.out.println(grade);

    }



}


