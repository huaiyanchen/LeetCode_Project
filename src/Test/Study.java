package Test;

/**
 * @Author：chy
 * @Version：1.0
 * @Date：2021/4/28-21:42
 * @Since:jdk1.8
 * @Description:TODO
 */


public class Study {

    private String chinese;
    private String math;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getChinese() {

        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Study{" +
                "chinese='" + chinese + '\'' +
                ", math='" + math + '\'' +
                '}';
    }
}