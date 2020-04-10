package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws SQLException, ClassNotFoundException {
		
		Connection con = ConnectionManager.getConnection();
		Statement stmt=  con.createStatement();
		ResultSet rs =stmt.executeQuery("SELECT * FROM TEAM");
		while(rs.next())
		{
			if(name.equals(rs.getString("CITY")))
			{
			System.out.println("Team Name : "+rs.getString(1));
			System.out.println("Coach Name : "+rs.getString(2));
			System.out.println("City Name : "+rs.getString(3));
			
			}
		}
		return null;
		
	}
}
