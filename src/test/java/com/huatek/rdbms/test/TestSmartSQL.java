package com.huatek.rdbms.test;

import java.sql.Connection;

public class TestSmartSQL {

	public static void main(String[] args) throws Exception {

		Class.forName("smallsql.database.SSDriver");
		Connection con = java.sql.DriverManager
				.getConnection("jdbc:smallsql:db1?create=true");
		con.close();
	}

}
