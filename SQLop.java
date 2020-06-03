package Secondhandmarket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

import javax.swing.JOptionPane;
public class SQLop {
	
	static PreparedStatement ps = null;
	static Connection ct = null;
	static ResultSet rs = null;

	public SQLop() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ct = DriverManager.getConnection(
					"jdbc:sqlserver://127.0.0.1:1433;DatabaseName=SecondHand_Market",
					"sa", "ybzawendy0821");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}




public Object[][] allGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}


public Object[][] allRGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where Gsort='日用'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] allYGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where Gsort='娱乐'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}


public Object[][] allCGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where Gsort='出行'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] allFGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where Gsort='服饰'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] allXGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where Gsort='学习'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] allSGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where Gsort='食品'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] allYNGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where YN='在售'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] YNGoods(Goods goods) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where YN='售出'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}



public ArrayList addGoodsJudgement() {
	ArrayList<String>strArray = new ArrayList<String>();
	ArrayList<String>strArray1 = new ArrayList<String>();
	try {
		String sql = "select GID FROM Goods";
		PreparedStatement ps = ct.prepareStatement(sql);
		// ps.setString(1, book.getNumber());
		rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			String s = rs.getString("GID");
			strArray.add(s);
			count++;
		}
		strArray.add(Integer.toString(count));
		for (; count>= 0; count--) {
			strArray1.add(strArray.get(count));
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return strArray1;
}

public void inputGoods(Goods goods) {
	ArrayList<String>strArray = new ArrayList<String>();
	try {
		String sql = "INSERT INTO Goods(GID,SID,BID,Gname,Gsort,YN,Price) VALUES (?,?,?,?,?,?,?);";
		PreparedStatement pts = ct.prepareStatement(sql);
		pts.setString(1, goods.getGID());
		pts.setString(2, goods.getSID());
		pts.setString(3, goods.getBID());
		pts.setString(4, goods.getGname());
		pts.setString(5, goods.getGsort());
		pts.setString(6, goods.getYN());
		pts.setFloat(7, goods.getPrice());
		pts.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
}

public Object[][] BIDGoods(Goods goods, String s1) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where BID='"+ s1+"'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public Object[][] SIDGoods(Goods goods, String s1) {
	Object[][] ob = new Object[60][7];
	int n = 0;
	try {
       
		String sql = "select * FROM Goods where SID='"+ s1+"'";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			ob[n][0] = rs.getString("GID");
			ob[n][1] = rs.getString("SID");
			ob[n][2] = rs.getString("BID");
			ob[n][3] = rs.getString("Gname");
			ob[n][4] = rs.getString("Gsort");
			ob[n][5] = rs.getString("YN");
			ob[n][6] = rs.getFloat("Price");
			n++;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return ob;
}

public int updateGoodscheck(String s) {
		try {
			Statement st;
			String sql = "select count(*) from Goods  where GID='"+"';";
			 st=ct.createStatement();
			    rs=st.executeQuery(sql);
			    rs.next();
			    int row=rs.getInt(1);
			if (row==1) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
}

public void updateGoods(Goods goods) {
	ArrayList<String>strArray = new ArrayList<String>();
	try {
		
		String sql = "update Goods set BID=?,YN=? where GID=?;";
		PreparedStatement pts = ct.prepareStatement(sql);
		pts.setString(1, goods.getBID());
		pts.setString(2, goods.getYN());
		pts.setString(3, goods.getGID());
		pts.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
}

public int deleteGoods(String s)
{
	try {
		String sql = "delete FROM Goods where GID='"+s+"';";
		PreparedStatement pts = ct.prepareStatement(sql);
		int count = pts.executeUpdate();
		if (count == 1) {
			return 1;
		} else {
			return 0;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return 0;
}

public int deleteGoodsCheck(String GID) {
	int i = 1;
try {
		String sql = "select *  FROM Goods where GID='"+GID+"';";
		PreparedStatement ps = ct.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			String s = rs.getString("YN");
			if( s.equals("售出")){
				i=0;
			}else {
				i=1;
			}
		}
}catch (Exception e) {
	System.out.println(e);
}
return i;
}
}