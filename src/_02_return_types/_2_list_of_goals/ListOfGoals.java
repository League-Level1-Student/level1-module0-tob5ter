package _02_return_types._2_list_of_goals;



import javax.swing.JOptionPane;

public class ListOfGoals {
	static String listOfGoals ="";
	static int numberOfGoals = 0;
	
	public static void main(String[] args) {
		//1. Call the appropriate method to make your list of goals
		createListOfGoals();
		//2. Call the appropriate method to get your list of goals, 
		//   so you can use a pop-up to display them
		getListOfGoals();
		
		//3. Call the appropriate method to get the number of goals you entered,
		//   and using a pop-up display the number of goals
		int goals = getNumberOfGoals();
		JOptionPane.showMessageDialog(null, "You set yourself a goal of " + goals + " goals!");
		//4. Call the appropriate method to see if you put a lot of goals,
		//   if you did put a lot of goals use a pop-up to say "Wow that's a lot of goals! Awesome!"
		if(goals>4) {
			JOptionPane.showMessageDialog(null, "Now that's a lot of goals!");
		}
	}
	
	static void createListOfGoals() {
		String input = "";
		while(true) {
			input = JOptionPane.showInputDialog("Enter a goal you have\n(Or X to stop entering goals)");
			if( input.equalsIgnoreCase("X") ) {
				break;
			}
			listOfGoals += input+ "\n";
			numberOfGoals++;
		}
	}
	
	static String getListOfGoals() {
		return listOfGoals;
	}
	
	static int getNumberOfGoals() {
		return numberOfGoals;
	}
	
	static boolean isManyGoals() {
		if( getNumberOfGoals() > 5) {
			return true;
		}
		return false;
	}
	
}
