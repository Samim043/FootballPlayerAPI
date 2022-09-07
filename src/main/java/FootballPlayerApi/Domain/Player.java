package FootballPlayerApi.Domain;

public class Player {
    private int id;
    private String name;
    private String team;
    private String country;
    private int jerseyNumber;

    public Player() {
    }

    public Player(int id, String name, String team, String country, int jerseyNumber) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.country = country;
        this.jerseyNumber = jerseyNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}