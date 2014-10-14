package bean;

import java.sql.ResultSet;
import java.util.ArrayList;

import database.Database;

public class GetDetails {

	public static ArrayList<EmployeeBean> getEmp(EmployeeBean ae){
		ArrayList<EmployeeBean> ale = new ArrayList<EmployeeBean>();
		try {
			String queryString ="select a.eid,name,dept,basic,hra,dp,pi " +
					"from empone a,emptwo b where a.eid =" +ae.getId()+"";
			ResultSet result = Database.getStatement().executeQuery(queryString);
			EmployeeBean eb = new EmployeeBean();

			while(result.next()){
				eb.setId(result.getString(1));
				eb.setName(result.getString(2));
				eb.setDept(result.getString(3));
				eb.setBasic(result.getString(4));
				eb.setHra(result.getString(5));
				eb.setDa(result.getString(6));
				eb.setPi(result.getString(7));
				ale.add(eb);
			}

			return ale;
		}
		catch (Exception e) {
			// TODO: handle exception
			return ale;
		}

	}
}
