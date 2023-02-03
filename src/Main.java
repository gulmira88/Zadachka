public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ayzat";
        student.age = 20;
        student.group = "java 9";

        Student student1 = new Student();
        student1.name = "Akylai";
        student1.age = 23;
        student1.group = "JS";

        Student student2 = new Student();
        student2.name = "Maksat";
        student2.age = 18;
        student2.group = "JS";

        Student student3 = new Student();
        student3.name = "Jyldyz";
        student3.age = 28;
        student3.group = "java 9";

        Student student4 = new Student();
        student4.name = "Samat";
        student4.age = 30;
        student4.group = "java 9";

        Student[] students ={student,student1, student2,student3,student4};
        int counter = 0;
        int counter1 = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].group.equals("java 9")) {
              counter++;
            }else if(students[i].group.equals("JS")) {
                counter1++;

            }
        }
        System.out.println("java 9:"+counter);
        System.out.println("JS:"+counter1);

        System.out.println((student.age+student1.age+student2.age+student3.age+student4.age)/5d);



        }

        }

