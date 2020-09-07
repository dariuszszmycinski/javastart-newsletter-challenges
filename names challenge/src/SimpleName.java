import java.util.Objects;

public class SimpleName {
    private String name;
    private String sex;
    private int count;

    public SimpleName(String name, String sex, int count) {
        this.name = name;
        this.sex = sex;
        this.count = count;
    }

    public SimpleName(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleName that = (SimpleName) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex);
    }

    @Override
    public String toString() {
        return "SimpleName{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", count=" + count +
                '}';
    }
}
