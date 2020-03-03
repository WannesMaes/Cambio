//Wannes, Leen, Birte
import java.util.ArrayList;


public class Reservatie {
	private String id;
	private Zone zone;
	private int dag;
	private int startTijd;
	private int duurTijd;
	private ArrayList<Auto> autos;
	private int penalty1;
	private int penalty2;
	public Reservatie(String nid, Zone nzone, int ndag, int nstTijd, int ndtijd, ArrayList<Auto> nautos, int pen1, int pen2) {
		id = nid;
		zone = nzone;
		dag = ndag;
		startTijd = nstTijd;
		duurTijd = ndtijd;
		autos = nautos;
		penalty1 = pen1;
		penalty2 = pen2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDag() {
		return dag;
	}
	public void setDag(int dag) {
		this.dag = dag;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public int getDuurTijd() {
		return duurTijd;
	}
	public void setDuurTijd(int duurTijd) {
		this.duurTijd = duurTijd;
	}
	public int getStartTijd() {
		return startTijd;
	}
	public void setStartTijd(int startTijd) {
		this.startTijd = startTijd;
	}
	public ArrayList<Auto> getAutos() {
		return autos;
	}
	public void setautos(ArrayList<Auto> Autos) {
		this.autos = Autos;
	}
	public int getPenalty1() {
		return penalty1;
	}
	public void setPenalty1(int penalty1) {
		this.penalty1 = penalty1;
	}
	public int getPenalty2() {
		return penalty2;
	}
	public void setPenalty2(int penalty2) {
		this.penalty2 = penalty2;
	}

}
