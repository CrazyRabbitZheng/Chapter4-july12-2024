/**
 * This class plays with Student class
 * @author--Zheng Wang
 */

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jane Mary",75.00);
        Student student2 = new Student("Harry Potter",85.00);

        System.out.printf("%s's grade is %c%n",student1.getName(),student1.getLetterGrade());
        System.out.printf("%s's grade is %c",student2.getName(),student2.getLetterGrade());

    }
}
