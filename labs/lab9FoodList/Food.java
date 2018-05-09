package lab9Pack;

public class Food {

		// knows
		public String name;
		public String group;
		public int calorie;
		public double percent;

		// does
		// constructors
		public Food()
		{
			name = null;
			group = null;
			calorie = 0;
			percent = 0.0;
		}
		public Food(String foodName, String foodGroup, int foodCal, double foodPercent)
		{
			name = foodName;
			group = foodGroup;
			calorie = foodCal;
			percent = foodPercent;
		}
		
		// setters and getters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGroup() {
			return group;
		}
		public void setGroup(String group) {
			this.group = group;
		}
		public int getCalorie() {
			return calorie;
		}
		public void setCalorie(int calorie) {
			this.calorie = calorie;
		}
		public double getPercent() {
			return percent;
		}
		public void setPercent(double percent) {
			this.percent = percent;
		}
		
		// toStrings	
		public String toString() {
			String result = String.format("%-20s", name);
			result += String.format("%-20s", group);
			result += String.format("%-15s", calorie);
			result += String.format("%-15s", percent);
			//return "Food [name=" + name + ", group=" + group + ", calorie=" + calorie + ", percent=" + percent + "]";
			return result;
		}


}
