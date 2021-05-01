package Test;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/28-21:42
 * @Since:jdk1.8
 * @Description:TODO
 */

public class Student implements Cloneable {

    private String name;
    private int age;
    private Study study;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        Study study = new Study();

        study.setChinese(this.study.getChinese());
        study.setMath(this.study.getMath());

        student.setStudy(study);
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", study=" + study +
                '}';
    }
}