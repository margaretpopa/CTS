package ro.ase.cts.memento.clase;

public class OriginatorMeciJucat {

	private int  nrSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int nrJandarmi;
	private int nrBileteVandute;
	
	public OriginatorMeciJucat(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int nrJandarmi,
			int nrBileteVandute) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrJandarmi = nrJandarmi;
		this.nrBileteVandute = nrBileteVandute;
	}
	
	public Memento creareMemento()
	{
		return new Memento(nrSpectatori,numeEchipaGazda,numeEchipaOaspeti);
	}
	
	
	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}

	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}

	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}

	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}

	public int getNrJandarmi() {
		return nrJandarmi;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	public int getNrBileteVandute() {
		return nrBileteVandute;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setMemento(Memento memento)
	{
		this.nrSpectatori= memento.getNrSpectatori();
		this.numeEchipaGazda=memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti=memento.getNumeEchipaOaspeti();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OriginatorMeciJucat [nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
