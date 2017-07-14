package acs;

mport org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class Dbser {
public Connection provide(){

	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.44.66.20:1521:PGDEV","FPS","FPS");  
//USE THE DB CONN HERE

return con; 
  }
 catch(Exception e){
	 System.out.println(e);
return null;	 
 }

}
}  

