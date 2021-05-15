package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class MainTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpectatorAbstract spectator= new Spectator("Margaret");
		SpectatorAbstract spectatorVIP= new SpectatorVIP("VIP","loja 1");
	    spectator.intrarePeStadion();
	    spectatorVIP.intrarePeStadion();
	}

}
