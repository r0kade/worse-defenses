package wdef.content;

import mindustry.type.*;
import arc.graphics.*;

public class WDItems {
	public static Item bronze;
	public static void load(){
		bronze = new Item("bronze", Color.red){{
			hardness = 2;
			cost = 0.82f;
		}};
	}
}
