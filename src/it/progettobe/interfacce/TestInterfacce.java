package it.progettobe.interfacce;

public class TestInterfacce {
	
	public static void effettuaStampe(InterfacciaUno uno, InterfacciaDue due)
	{
		uno.stampaInfoUno();
		due.stampaInfoDue();
	}

	public static void main(String[] args) {
		/* sfruttare il polimorfismo per creare oggetti che implementano le interfacce */
		InterfacciaUno interfacciaUno = new InterfacciaUnoImpl();
		InterfacciaDue interfacciaDue = new InterfacciaDueImpl();
		
//		interfacciaUno.stampaInfoUno();
//		interfacciaDue.stampaInfoDue();
		
		/* test di una classe che implementa piu' di un'interfaccia */
		InterfacciaUnoDueImpl unoDue = new InterfacciaUnoDueImpl();
//		unoDue.stampaInfoUno();
//		unoDue.stampaInfoDue();
		
		/* ancora un test sul polimorfismo */
//		effettuaStampe(unoDue, unoDue);
		
//		EstensioneClass estensione = new EstensioneClass();
//		estensione.stampaCombo();
		
		
		/*cast esplicito */
		InterfacciaUno[] listaInterfacce = new InterfacciaUno[2];
		listaInterfacce[0] = interfacciaUno;
		listaInterfacce[1] = unoDue;
		
		for(InterfacciaUno intf : listaInterfacce)
		{
			if(intf instanceof InterfacciaUnoImpl)
			{
				System.out.print("1x - ");
				intf.stampaInfoUno();
			}
			
			else
			{
				System.out.print("12 - ");
				InterfacciaUnoDueImpl temp = (InterfacciaUnoDueImpl)intf;
				temp.stampaInfoDue();
			}
		}
		

	}

}
