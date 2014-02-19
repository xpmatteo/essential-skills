package esad.chapter01.exercise08;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class FoodDB {
	// find all foods whose names contain both the keywords. returns
	// an iterator on these foods.
	public Iterator srchFood(String cName, String eName) {
		// it contains all the foods to be returned.
		Map foodTree = new TreeMap();
		Iterator foodList;
		Food food;
		foodList = getAllRecords();
		while (foodList.hasNext()) {
			food = (Food) foodList.next();
			// do its names contain both keywords?
			if ((cName == null || // null or "" means no key is specified
				cName.equals("") || 
				food.getCName().indexOf(cName) != -1) 
				&& 
				(eName == null || // null or "" means no key is specified
				eName.equals("") || food.getEName().indexOf(eName) != -1)) {
				foodTree.put(food.getFoodKey(), food);
			}
		}
		return foodTree.values().iterator();
	}

	private Iterator getAllRecords() {
		throw new RuntimeException("Not yet implemented!");
	}
}
