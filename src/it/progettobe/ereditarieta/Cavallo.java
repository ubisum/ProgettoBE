package it.progettobe.ereditarieta;

public class Cavallo extends Animale{
	private String coloreManto;
	private int altezzaGarreseCm;
	
	public Cavallo(String verso, int numeroZampe, String nome, String coloreManto, int altezzaGarreseCm) {
		super(verso, numeroZampe, nome);
		
		this.coloreManto = coloreManto;
		this.altezzaGarreseCm = altezzaGarreseCm;
		
	}

	public String getColoreManto() {
		return coloreManto;
	}

	public void setColoreManto(String coloreManto) {
		this.coloreManto = coloreManto;
	}

	public int getAltezzaGarreseCm() {
		return altezzaGarreseCm;
	}

	public void setAltezzaGarreseCm(int altezzaGarreseCm) {
		this.altezzaGarreseCm = altezzaGarreseCm;
	}

	@Override
	public void stampaInfo() {
		// TODO Auto-generated method stub
		super.stampaInfo();
		System.out.println("\n\nStampa dettagli cavallo:\n\nColore manto: " + this.coloreManto + "\nAltezza garrese: " + this.altezzaGarreseCm);
	}
	
	
	
	
	
	
}
