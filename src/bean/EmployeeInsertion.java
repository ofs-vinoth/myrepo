package bean;

import database.Database;

public class EmployeeInsertion {

		public static int addEmp(EmployeeBean ae){
			try {
				String queryString ="insert into empone values" +
						"('"+ae.getName()+"',"+ae.getId()+",'"+ae.getDept()+"')";
				Database.getStatement().executeQuery(queryString);
				System.out.println("created");
				return 1;
			}
			catch (Exception e) {
				// TODO: handle exception
				return 0;
			}

		}
}
