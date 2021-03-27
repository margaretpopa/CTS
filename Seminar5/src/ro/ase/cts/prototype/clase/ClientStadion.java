package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype{
      private String denumire;
      private int varsta;
	public ClientStadion(String denumire, int varsta) {
		super();
		this.denumire = denumire;
		//validare varsta - persoana trebuie sa aiba o varsta minima
		this.varsta = varsta;
	}
	
	private ClientStadion() {
		super();
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [denumire=");
		builder.append(denumire);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	//ori pun setteri si pun validari in setteri sau nu folosesc setteri

	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		ClientStadion clona=new ClientStadion();
		clona.denumire = this.denumire;
		clona.varsta=this.varsta;
		return clona;
	}
      
	
      
}
