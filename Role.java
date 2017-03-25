import javax.swing.JOptionPane;
public class Role {
public static void main(String[]args){
	
	  String role ;
	  int count = 0;
		  
       do{	   
	  
					   String strRole = null;
					   role = JOptionPane.showInputDialog(null,"Enter the role here");
					   
	   
					   switch(role){
					    case "Administration":
					    	strRole = "Administration";
					    	break;
					    case "Faculty":
					    	strRole = "Faculty";
					    	break;
					    case "Staff":
					    	strRole = "Staff";
					    	break;
					    case "Student":
					    	strRole = "Student";
					    	break;
					    case "Guest":
					    	strRole = "Guest";
					    	break;
					   
					   }
					   count +=1;
					   JOptionPane.showMessageDialog(null,"Welcom, "+ strRole+"." );  
					   count +=1;

      }while (count<3);
   }
}
