package Soal2;

public class Country {
    private String name;
    private String leadershipType;
    private String leaderName;
    private int independenceDate;
    private int independenceMonth;
    private int independenceYear;

    public Country(String name, String leadershipType, String leaderName, int independenceDate, int independenceMonth, int independenceYear) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String name, String leadershipType, String leaderName) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public String getName() {
        return name;
    }

    public String getLeadershipType() {
        return leadershipType;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public int getIndependenceDate() {
        return independenceDate;
    }

    public int getIndependenceMonth() {
        return independenceMonth;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }
}