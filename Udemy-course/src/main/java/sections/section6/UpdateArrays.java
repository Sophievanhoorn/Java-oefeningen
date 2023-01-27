package sections.section6;

import java.util.Arrays;

public class UpdateArrays {

	public static void main(String[] args) {

		String[] menu = { "Coffee", "Muffin", "Tea", "Browny" };
		System.out.println(Arrays.toString(menu));

		menu[2] = "Latte";
		System.out.println(Arrays.toString(menu));

		String[] newMenu = new String[5];

		for (int i = 0; i < menu.length; i++) {
			newMenu[i] = menu[i];
		}
		updateMenu(newMenu, 4, "Hot Chocolate");
		
		System.out.println(Arrays.toString(newMenu));
	}

	
	//Niet de opdracht
	public static String[] updateMenu(String[] newMenu, int index, String item) {
		
		newMenu[index] = item;

		return newMenu;
	}

}
