public class Name {
    private int year;
    private String sex;
    private String ethic;
    private String firstName;
    private int count;
    private int rank;

    public Name(int year, String sex, String ethic, String firstName, int count, int rank) {
        this.year = year;
        this.sex = sex;
        this.ethic = ethic;
        this.firstName = firstName;
        this.count = count;
        this.rank = rank;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    public String getEthic() {
        return ethic;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getCount() {
        return count;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Name{" +
                "year=" + year +
                ", sex='" + sex + '\'' +
                ", ethic='" + ethic + '\'' +
                ", firstName='" + firstName + '\'' +
                ", count=" + count +
                ", rank=" + rank +
                '}';
    }
}
