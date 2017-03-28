//import java.time.Month;

import javax.swing.JOptionPane;

public class EnumTest {
	enum month{January,Febary,March,April,May,June,July,August,September,October,November,December}
	public static void main(String[]args){
		
		month [] selectMonth = {month.January,month.Febary,month.March,month.April,month.May,month.June,month.July,month.August,month.September,month.October,month.November,month.December};
		
		month selected = (month)JOptionPane.showInputDialog(null, "Select a month", "Selected Month",JOptionPane.QUESTION_MESSAGE,null, selectMonth,selectMonth[2]);
		
		switch(selected){
		
		         case December:case January:case Febary:
					JOptionPane.showMessageDialog(null,"Make a snowman in "+ selected );
					break;
		         case March:case April:case May:
						JOptionPane.showMessageDialog(null,"Happy spring days in "+ selected);
						break;
		         case June:case July:case August:
						JOptionPane.showMessageDialog(null,"It is summer time in "+ selected);
						break;
		         case September:case October:case November:
						JOptionPane.showMessageDialog(null,"Welcome to the foliage season in "+ selected);
						break;
		}
		
	}

}
