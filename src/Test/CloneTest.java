package Test;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/28-21:45
 * @Since:jdk1.8
 * @Description:TODO
 */

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();

        Study study = new Study();
        study.setChinese("100");
        study.setMath("120");


        student.setAge(12);
        student.setName("chy");
        student.setStudy(study);

        Student student2 = (Student) student.clone();
        student2.setAge(13);


        student.getStudy().setMath("1000c");
        student2.getStudy().setChinese("copy");
        student2.setName("yhc");

        System.out.println("student.getAge() = " + student.getAge());
        System.out.println("student2.getAge() = " + student2.getAge());
        System.out.println("==============");
        System.out.println("student.getStudy() = " + student.getStudy());
        System.out.println("student2.getStudy() = " + student2.getStudy());
        System.out.println("==============");
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student2.getName() = " + student2.getName());
    }
}