package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This represents a Year of a calendar, and uses the Month, Week, Day, and Event classes to model 
 * a year.
 */
public class Year implements java.io.Serializable{
	
	private static final long serialVersionUID = 1;
	private Map<String, Month> months = new HashMap<String, Month>();
	private Map<Integer, String> monthNames = new HashMap<Integer, String>();

		/**
		 * This is the constructor for the year, takes in the int year 
		 * and the view which will observe the Year object. 
		 * @param year The integer year
		 * This method creates the months map with all of the year's months as
		 * well as adds the months' observers in the map to the view. 
		 */
		public Year(int year) {
			fillMonthNames();
			months.put("January", new Month("January", year));
			months.put("February", new Month("February", year));
			months.put("March", new Month("March", year));
			months.put("April", new Month("April", year));
			months.put("May", new Month("May", year));
			months.put("June", new Month("June", year));
			months.put("July", new Month("July", year));
			months.put("August", new Month("August", year));
			months.put("September", new Month("September", year));
			months.put("October", new Month("October", year));
			months.put("November", new Month("November", year));
			months.put("December", new Month("December", year));
		}
		
		/**
		 * This method takes in a year as well as a list of months and does the same
		 * thing as the above constructor using fillMonthNames() and a loop.
		 * @param year The int year
		 * @param months The list of months to put in the year object
		 * This method uses the fillMonthNames() method to fill the Year object's monthNames map, and
		 * then uses a loop to fill the months map. 		 * 
		 */
		public Year(int year, List<Month> months) {
			fillMonthNames();
			for (Month month : months) {
				this.months.put(month.getName(), month);
			}
		}

		
		/**
		 * This method fills the monthNames map for the Year which 
		 * is a map of the month int to the String name of the month. 
		 */
		private void fillMonthNames() {
			monthNames.put(1, "January");
			monthNames.put(2, "February");
			monthNames.put(3, "March");
			monthNames.put(4, "April");
			monthNames.put(5, "May");
			monthNames.put(6, "June");
			monthNames.put(7, "July");
			monthNames.put(8, "August");
			monthNames.put(9, "September");
			monthNames.put(10, "October");
			monthNames.put(11, "November");
			monthNames.put(12, "December");
		}
		
		/**
		 * This method is a getter for the Year's months, taking in the 
		 * month number to grab and returning the month object. 
		 * @param monthNum The int month number to grab 
		 * @return Month the grabbed month object
		 * This method is a simple getter that uses the monthNames map to grab the String name,
		 * which is then used with the months map to grab the Year's month object
		 */
		public Month getMonth(int monthNum) {
			return months.get(monthNames.get(monthNum));
		}
		
		/**
		 * This method is a getter for the Year's months, taking in the 
		 * month name to grab and returning the month object. 
		 * @param monthName The name of the month to grab 
		 * @return Month the grabbed month object
		 * This method is a simple getter that uses the months map to grab the 
		 * correct Month object to return.
		 */
		public Month getMonth(String monthName) {
			return months.get(monthName);
		}
		
}
