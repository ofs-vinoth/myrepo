package bean;

import database.Database;

public class EmployeeUpdation1 {
	public static int addEmp(EmployeeBean ae){
		try {
			String queryString ="insert into emptwo(eid,basic,hra,dp,pi) values" +
					"("+ae.getId()+","+ae.getBasic()+","+ae.getHra()+"" +
							","+ae.getDa()+","+ae.getPi()+")";
			Database.getStatement().executeQuery(queryString);
			return 1;
		}
		catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}
}
