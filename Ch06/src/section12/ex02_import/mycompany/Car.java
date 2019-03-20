package section12.ex02_import.mycompany;

import section12.ex02_import.hankook.SnowTire;
//import section12.ex02_import.hankook.*;
import section12.ex02_import.hyundai.Engine;
import section12.ex02_import.kumho.BigWidthTire;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	section12.ex02_import.hankook.Tire tire3 = new section12.ex02_import.hankook.Tire();
	section12.ex02_import.kumho.Tire tire4 = new section12.ex02_import.kumho.Tire();
}
