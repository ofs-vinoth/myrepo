package bean;

import database.Database;

public class UpdateBal {
	public static int upEmp(EmployeeBean ae){
		try {
			String queryString ="update emptwo set gp="+ae.getGross()+",deduc="+ae.getDeduc()+",np="+ae.getNp()+" where eid = "+ae.getId()+"";
			System.out.println(queryString);
			Database.getStatement().executeQuery(queryString);
			return 1;
		}
		catch (Exception e) {
			// TODO: handle exception
			return 0;
		}

	}
}
