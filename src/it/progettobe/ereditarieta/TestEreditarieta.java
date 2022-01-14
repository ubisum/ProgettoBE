package it.progettobe.ereditarieta;

public class TestEreditarieta {

	public static void main(String[] args) {
//		Cavallo cavallo = new Cavallo("nitrito", 4, "cavallo", "marrone", 170);
//		cavallo.stampaInfo();
		
//		Persona persona = new Persona();
		Insegnante insegnante = new Insegnante("Paolo", "Rossi", "CDVHERUGHV84R834", 30, "367362746H");
//		insegnante.stampaInfo();
//		insegnante.stampaDatiAggiuntivi();
		
		Alunno alunno = new Alunno("Daisy", "Duck", "DSYDCKGU7876", 15, 1, 5);
//		alunno.stampaDatiAggiuntivi();
		
		Persona[] listaPersone = new Persona[2];
		listaPersone[0] = insegnante;
		listaPersone[1] = alunno;
		
//		for(Persona persona : listaPersone)
//		{
//			if(persona instanceof Insegnante)
//			{
//				System.out.println("Insegnante di nome " + persona.getNome());
//				Insegnante ins = (Insegnante)persona;
//				System.out.println("Matricola: " + ins.getMatricola() + "\n");
//			}
//			
//			else
//			{
//				System.out.println("Alunno di nome " + persona.getNome());
//				Alunno al = (Alunno)persona;
//				System.out.println("Posizione: (" + al.getPosizionePostoFila() + ", " + al.getPosizionePostoColonna() + ")\n");
//			}
//		}
		
		Animale animale = new Cavallo("nitrito", 4, "cavallo", "nero", 170);   //new Animale("Miagolio", 4, "cavallo");
		Cavallo cav = (Cavallo)animale;
		
		System.out.println(cav.getColoreManto());
		

	}

}
