package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
public void createTeam(Team team) throws SQLException, ClassNotFoundException {
	Connection con=ConnectionManager.getConnection();
	
	String sql="INSERT INTO TEAM(NAME,COACH,CITY)VALUES(?,?,?)";
	PreparedStatement st=con.prepareStatement(sql);
	
	st.setString(1, team.getName());
	st.setString(2,team.getCoach());
	st.setString(3,team.getCity().getCityName());
		st.executeUpdate();
		con.close();
		System.out.println("Team has been created");
	}
}
