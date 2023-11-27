package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.PrimaryData;
import bean.SecondaryData;

public class Dbservice {

	public static Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:mysql://localhost:3306/Ecart";
			String dbName = "root";
			String dbPass = "PNSVnnsr20@";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, dbName, dbPass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static List<PrimaryData> getPrimaryData() {
		List<PrimaryData> list = new ArrayList<>();

		try {
			Connection con = Dbservice.getConnection();
			String query = "select * from PrimaryData";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				PrimaryData p = new PrimaryData();
				p.setId(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPname(rs.getString(3));
				list.add(p);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static List<SecondaryData> getSecondaryData() {
		List<SecondaryData> list2 = new ArrayList<>();

		try {
			Connection con = Dbservice.getConnection();
			String query = "select * from SecondaryData";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SecondaryData s = new SecondaryData();
				s.setId(rs.getInt(1));
				s.setSmobile(rs.getString(2));
				s.setSaddress(rs.getString(3));
				list2.add(s);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2;
	}

	public static int insertPrimary(PrimaryData p) {
		int rows = 0;
		try {
			Connection con = Dbservice.getConnection();
			String Query = "insert into PrimaryData(pname,pmobile) values(?,?)";
			PreparedStatement pst = con.prepareStatement(Query);

			pst.setString(1, p.getPname());
			pst.setString(2, p.getPmobile());

			rows = pst.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}

	public static int insertSecondary(SecondaryData s) {
		int rows = 0;
		try {
			Connection con = Dbservice.getConnection();
			String Query = "insert into  SecondaryData(smobile,saddress) values(?,?)";
			PreparedStatement pst = con.prepareStatement(Query);

			pst.setString(1, s.getSmobile());
			pst.setString(2, s.getSaddress());
			rows = pst.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}

	public static List<PrimaryData> getAllDatas() {
		
		List<PrimaryData> list=new ArrayList<PrimaryData>();
		

		try {
			Connection con = Dbservice.getConnection();
			String query = "select * from PrimaryData";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				PrimaryData p=new PrimaryData();
				p.setId(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPmobile(rs.getString(3));
				list.add(p);
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
public static List<SecondaryData> getAllSecondaryDatas() {
		
		
		List<SecondaryData> list2=new ArrayList<SecondaryData>();

		try {
			Connection con = Dbservice.getConnection();
			String query = "select * from SecondaryData";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				SecondaryData s=new SecondaryData();
				s.setId(rs.getInt(1));
				s.setSmobile(rs.getString(2));
				s.setSaddress(rs.getString(3));
				list2.add(s);
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list2;
	}



public static int updatePrimary(PrimaryData p) {
    int status1 = 0;
    
    try {
        Connection con = Dbservice.getConnection();
        String query = "update PrimaryData set pname=?, pmobile=? where id=?";
        
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, p.getPname());
        ps.setString(2, p.getPmobile());
        ps.setInt(3, p.getId());
        
        status1 = ps.executeUpdate();
        
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return status1;
}

public static int updateSecondary(SecondaryData s) {
    int status2 = 0;
    
    try {
        Connection con = Dbservice.getConnection();
        String query2 = "update SecondaryData set saddress=? where id=?";
        
        PreparedStatement ps2 = con.prepareStatement(query2);
        ps2.setString(1, s.getSaddress());
        ps2.setInt(2, s.getId());
        
        status2 = ps2.executeUpdate();
        
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return status2;
}






//public static int updatePrimary() {
//	int status1 = 0;
//	
//try {
//	Map<String, PrimaryData> listmap = new HashMap<String, PrimaryData>();
//	
//	
//	
//	List<PrimaryData> list1 = Dbservice.getAllDatas();
//	
//	if (!list1.isEmpty()) {
//		for (PrimaryData p1 : list1) {
//			listmap.put(p1.getPmobile(), p1);
//
//		}
//	}
//
//	List<SecondaryData> list2 = Dbservice.getAllSecondaryDatas();
//	Connection con = Dbservice.getConnection();
//	String query = "update PrimaryData set pname=?,pmobile=? where id=?";
//	String query2 = "update SecondaryData set saddress=? where id=?";
//	if (!list2.isEmpty()) {
//		
//		for (SecondaryData s1 : list2) {
//PrimaryData pmap=listmap.get(s1.getSmobile());
//
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setString(1,pmap.getPname());
//		ps.setString(2,pmap.getPmobile());
//		ps.setInt(3,pmap.getId());
//		status1 = ps.executeUpdate();
//
//		
//	PreparedStatement ps2 = con.prepareStatement(query2);
//	ps2.setString(1,s1.getSaddress());	
//	ps2.setInt(2,s1.getId());
//	status1 = ps2.executeUpdate();
//		
//		con.close();
//		}
//		}
//	
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return status1;
//}
//public static int updateSecondary(SecondaryData s) {
//	int status = 0;
//	
//	
//	try {
//		Connection con = Dbservice.getConnection();
//		
//		String query2 = "update SecondaryData set saddress=? where id=?";
//		
//		
//		
//		PreparedStatement ps2 = con.prepareStatement(query2);
//		ps2.setString(1,s.getSaddress());
//		ps2.setInt(2,s.getId());
//		status = ps2.executeUpdate();
//		con.close();
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return status;
//}
//public static Map<String, PrimaryData> getEmployeeById() {
//    Map<String, PrimaryData> listmap = new HashMap<String, PrimaryData>();
//    
//    try {
//        List<PrimaryData> list1 = Dbservice.getAllDatas();  
//
//        if (!list1.isEmpty()) {
//            for (PrimaryData p1 : list1) {
//                listmap.put(p1.getPmobile(), p1);
//            }
//        }
//
//        List<SecondaryData> list2 = Dbservice.getAllSecondaryDatas();
//
//        if (!list2.isEmpty()) {
//            for (SecondaryData s1 : list2) {
//                PrimaryData pmap = listmap.get(s1.getSmobile());
//
//                
//                   
//                    
//                    
//                
//            }
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    return listmap;
//}
//public static  getEmployeeById(int id) {
//	
////	Map<PrimaryData,SecondaryData> listMap=new HashMap<>();
////	PrimaryData p=new PrimaryData();
////	SecondaryData s=new SecondaryData();
//	Map<String, PrimaryData> listmap = new HashMap<String, PrimaryData>();
//	
//	try {
//		
//		
//		
//		List<PrimaryData> list1 = Dbservice.getAllDatas();
//		
//		if (!list1.isEmpty()) {
//			for (PrimaryData p1 : list1) {
//				listmap.put(p1.getPmobile(), p1);
//
//			}
//		}
//
//		List<SecondaryData> list2 = Dbservice.getAllSecondaryDatas();
//		Connection con = Dbservice.getConnection();
//		String query = "select * from PrimaryData where id=?";
//		String query2 = "select * from SecondaryData where id=?";
//		if (!list2.isEmpty()) {
//			
//			for (SecondaryData s1 : list2) {
//	PrimaryData pmap=listmap.get(s1.getSmobile());
//
////		Connection con = Dbservice.getConnection();
////		String query = "select * from PrimaryData where id=?";
//		
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setInt(1, id);	
//		ResultSet rs =ps.executeQuery();
//		
//		if(rs.next()) {
//			pmap.setId(rs.getInt(1));
//			pmap.setPname(rs.getString(2));
//			pmap.setPmobile(rs.getString(3));
//			
//		}
////String query2 = "select * from SecondaryData where id=?";
//		
//		PreparedStatement ps2 = con.prepareStatement(query2);
//		ps2.setInt(1, id);	
//		ResultSet rst =ps2.executeQuery();
//		
//		if(rst.next()) {
//			s1.setId(rs.getInt(1));
//			s1.setSaddress(rst.getString(3));
//			
//		}
//		}
//			}
//		con.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//return listmap;
//}
//public static SecondaryData getEmployeeById2(int id) {
//	
//	SecondaryData s=new SecondaryData();
//	
//	try {
//		Connection con = Dbservice.getConnection();
//		
//		String query2 = "select * from SecondaryData where id=?";
//		
//		PreparedStatement ps = con.prepareStatement(query2);
//		ps.setInt(1, id);	
//		ResultSet rst =ps.executeQuery();
//		
//		while(rst.next()) {
//			s.setSaddress(rst.getString(3));
//		}
//		con.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//return s;
//}
//





}
