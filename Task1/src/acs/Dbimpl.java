package acs;
import java.sql.*;  
import java.util.*;
public class Dbimpl {
	
public void insert(User1 user1)
{
try{
	Dbser ser=new Dbser();
	Connection con=ser.provide();
PreparedStatement stmt=con.prepareStatement("insert into emp1 values(?,?,?,?,?)");  
stmt.setString(1, user1.getName());
stmt.setInt(2, user1.getAge());
stmt.setString(3, user1.getPhoneno());
stmt.setInt(4,user1.getId());
stmt.setString(5,user1.getMailid());
stmt.executeQuery();  
con.close();
}
catch(Exception e){System.out.println(e);}
}
public void delete(User1 user1)
{
try{
	Dbser ser=new Dbser();
Connection con=ser.provide();
	PreparedStatement stmt=con.prepareStatement("delete from emp1 where id=?");
	stmt.setInt(1, user1.getId());
stmt.executeQuery();	
con.close();
}	
catch(Exception e)
{
	System.out.println(e);
}
}
public LinkedHashMap view(User1 user)
{
try{
	LinkedHashMap a=new LinkedHashMap();
		Dbser ser=new Dbser();
	Connection con=ser.provide();
		PreparedStatement stmt=con.prepareStatement("select * from emp1 where id=?");
		stmt.setInt(1, user.getId());
	ResultSet s=stmt.executeQuery();	
	while(s.next()){
		a.put("name",s.getString(1));
		a.put("age",s.getInt(2));
		a.put("phoneno",s.getString(3));
		a.put("id",s.getInt(4));
		a.put("mailid",s.getString(5));
}
con.close();
	return a;
}	
catch(Exception e)
{
	System.out.println(e);
	}

return null;	
}	
public void update_name(User1 user)
{
try{
	Dbser ser=new Dbser();
	Connection con=ser.provide();
		PreparedStatement stmt=con.prepareStatement("update emp1 set name=? where id=?");
	stmt.setString(1,user.getName());
	stmt.setInt(2, user.getId());
stmt.executeQuery();	
con.close();
}	
catch(Exception e)
{
	System.out.println(e);}
}

public void update_age(User1 user)
{
try{
	Dbser ser=new Dbser();
	Connection con=ser.provide();
		PreparedStatement stmt=con.prepareStatement("update emp1 set age=? where id=?");
	stmt.setInt(1,user.getAge());
	stmt.setInt(2, user.getId());
stmt.executeQuery();	
con.close();
}	
catch(Exception e)
{
	System.out.println(e);
}
}
public void update_phoneno(User1 user)
{
try{
	Dbser ser=new Dbser();
	Connection con=ser.provide();
		PreparedStatement stmt=con.prepareStatement("update emp1 set phoneno=? where id=?");
	stmt.setString(1,user.getPhoneno());
	stmt.setInt(2, user.getId());
stmt.executeQuery();	
con.close();
}	
catch(Exception e)
{
	System.out.println(e);
}
}
public void update_mail(User1 user)
{
try{
	Dbser ser=new Dbser();
	Connection con=ser.provide();
		PreparedStatement stmt=con.prepareStatement("update emp1 set mailid=? where id=?");
	stmt.setString(1,user.getMailid());
	stmt.setInt(2, user.getId());
stmt.executeQuery();	
con.close();
}	
catch(Exception e)
{
	System.out.println(e);
}
}

}

