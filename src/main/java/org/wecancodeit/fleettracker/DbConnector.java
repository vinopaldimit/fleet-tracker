package org.wecancodeit.fleettracker;

import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class DbConnector {
//	public static void main (String [] args) throws Exception {
//		 
//        Connection conn = null;
//        Statement stmt = null;
// 
//        Class.forName("org.h2.Driver");
//        conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "", "");
//        stmt = conn.createStatement();
// 
//        stmt.execute("drop table if exists csvdata");
//        stmt.execute("create table csvdata (id Long primary key, tripNumber Long, date varchar(100), weekEnding varchar(100), origin Long,  destination Long, zipCode Long, milesQuantity varchar(100), vMr varchar(100),mileagePlus varchar(100),premiums varchar(100),fuel varchar(100),totalRate varchar(100),aMt varchar(100),packages Long,packageAmt Long,dropAndHook varchar(100),tolls varchar(100),flatRate varchar(10),dailyGrossAmount varchar(100), driverOne varchar(100),driverTwo varchar(100),calculatedTotalRate varchar(100),calculatedAMT varchar(100),calculatedDailyGrossAmount varchar(100))");
//        stmt.execute("insert into csvdata ( id, tripNumber, date, weekEnding, origin,destination,zipCode,milesQuantity,vMr, mileagePlus,premiums,fuel, totalRate,aMt,packages,packageAmt,dropAndHook,tolls,flatRate,dailyGrossAmount,driverOne,driverTwo,calculatedTotalRate,calculatedAMT,calculatedDailyGrossAmount)     select convert( \"id\",Long ), convert( \"tripNumber\", Long),convert( \"date\", LocalDate),convert( \"weekEnding\", LocaleDate),convert( \"origin\", Long),convert( \"destination\", Long),convert( \"zipCode\", Long),convert( \"milesQuantity\", BigDecimal),convert( \"vMr\", BigDecimal),convert( \"mileagePlus\", BigDecimal),convert( \"premiums\", BigDecimal),convert( \"fuel\", BigDecimal),convert( \"totalRate\", BigDecimal),convert( \"aMt\", BigDecimal),convert( \"packages\", Long),convert( \"packageAmt\", Long),convert( \"dropAndHook\", BigDecimal),convert( \"tolls\", BigDecimal),convert( \"flatRate\", BigDecimal),convert( \"dailyGrossAmount\", BigDecimal),\"driverOne\", \"driverTwo\",convert( \"calculatedTotalRate\", BigDecimal),convert( \"calculatedTotalRate\", BigDecimal),convert( \"calculatedAMT\", BigDecimal),convert( \"calculatedDailyGrossAmount\", BigDecimal)from CSVREAD"
//        		+ "( 'c:\\tmp\\sample.csv', 'id, tripNumber, date, weekEnding, origin,destination,zipCode,milesQuantity,vMr, mileagePlus,premiums,fuel, totalRate,aMt,packages,packageAmt,dropAndHook,tolls,flatRate,dailyGrossAmount,driverOne,driverTwo,calculatedTotalRate,calculatedAMT,calculatedDailyGrossAmount', null ) ");
//        ResultSet rs = stmt.executeQuery("select * from csvdata");
// 
//        while (rs.next()) {
//            System.out.println("id " + rs.getLong("id") + " tripNumber " + rs.getLong("tripNumber") + " zipCode " + rs.getLong("zipCode") );
//        }
//        stmt.close();
//    }
//
//}
