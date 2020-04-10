package model;


public class Team{
	String name;
	String coach;
	City city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Team(String name, String coach, City city) {
		super();
		this.name = name;
		this.coach = coach;
		this.city = city;
	}
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	
}
