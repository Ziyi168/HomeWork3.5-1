import javax.swing.JOptionPane;
public class Role {
public static void main(String[]args){
	
	   int role;
	   String strRole = null;
	   role = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the role here"));
	   
				   switch (role){
				 
				   case 1:
					   strRole = "Administration";
					   break;
				   case 2:
					   strRole = "Faculty";
					   break;
				   case 3:
					   strRole = "Staff";
					   break;   
				   case 4:
					   strRole = "Student";
					   break;
				   case 5:
					   strRole = "Guest";
					   break; 
		   
	   }
	   
	   JOptionPane.showMessageDialog(null,"Welcom, "+ strRole );  
	   
   }
}
