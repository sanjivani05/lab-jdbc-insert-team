package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main{
	public static void main(String args[]) throws IOException, SQLException, ClassNotFoundException {
	
	TeamDAO teamdao=new TeamDAO();
	CityDAO citydao=new CityDAO();
	City city = new City();
	Team team = new Team();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter team name:");
	String tname=br.readLine();
	System.out.println("Enter coach name:");
	String cname=br.readLine();
	System.out.println("Enter city:");
	String cityname=br.readLine();
	
	team.setName(tname);
	team.setCoach(cname);
	city.setCityName(cityname);
	team.setCity(city);
	
	teamdao.createTeam(team);
	System.out.println("Enter City name:");
	String name=br.readLine();
	citydao.getCityByName(name);
}
}
