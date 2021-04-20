package ro.ase.cts.state.clase;

public class Rezervata implements StareMasa{

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method
		if(masa.getStareMasa() instanceof Liber)
		{
			masa.setStareMasa(this);
		}
	}

}
