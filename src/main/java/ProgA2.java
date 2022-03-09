public class ProgA2 {

	public static void main(String arg[])
	{
		Hero hr = new Hero("工太", 100);
		Cleric clr = new Cleric("ホーリー",15, 15);
		Slime slm = new Slime('A');
		hr.attack(slm);
		clr.attack(slm);
		slm.attack(hr);
		slm.attack(clr);
		slm.run();
		clr.run();
	}

}

