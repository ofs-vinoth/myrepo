package bean;

import java.sql.ResultSet;
import java.util.ArrayList;

import database.Database;

public class GetAll {
	public static ResultSet getEmp(){
		ResultSet result=null;
		try {
			String queryString ="select a.eid,name,dept,basic,hra,dp,pi " +
					"from empone a,emptwo b where a.eid=b.eid";
			 result = Database.getStatement().executeQuery(queryString);



			return result;
		}
		catch (Exception e) {
			// TODO: handle exception
			return result;
		}
}
}
