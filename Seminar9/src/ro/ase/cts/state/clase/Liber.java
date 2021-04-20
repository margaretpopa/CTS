package ro.ase.cts.state.clase;

public class Liber implements StareMasa{

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStareMasa() instanceof Liber))
		{
			masa.setStareMasa(this);
		}
	}

}
