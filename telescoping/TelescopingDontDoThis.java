package telescoping;

/*
 * Dont do this.
 * It's garbage. Use builder pattern
 */

public class TelescopingDontDoThis {
    private int i1;
    private int i2;
    private String s1;
    private String s2;
    private String s3;

    public TelescopingDontDoThis(int i1, int i2) {
        setI1(i1);
        setI2(i2);
        setS1("default");
        setS2("default");
        setS3("default");
    }

    public TelescopingDontDoThis(int i2, String s1) {
        setI1(1);
        setI2(i2);
        setS1(s1);
        setS2("default");
        setS3("default");
    }


    public TelescopingDontDoThis(String s1, String s2, String s3) {
        setI1(2);
        setI2(3);
        setS1(s1);
        setS2(s2);
        setS3(s3);
    }

    public TelescopingDontDoThis(int i1, int i2, String s1, String s2, String s3) {
        setI1(i1);
        setI2(i2);
        setS1(s1);
        setS2(s2);
        setS3(s3);
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }
}
