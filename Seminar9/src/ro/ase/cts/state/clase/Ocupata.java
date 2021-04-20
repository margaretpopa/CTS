package ro.ase.cts.state.clase;

public class Ocupata implements StareMasa{

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof Rezervata)
		{
			masa.setStareMasa(this);
		}
	}

}
