import java.util.ArrayList;

//Wannes, Leen, Birte
public class Zone 
{
	private String zid;
	private ArrayList<Zone> azone;
	
	public Zone()
	{
		this.setZid("Ongeldig");
		azone = new ArrayList<Zone>();
	}
	public Zone(String id, ArrayList<Zone> zones)
	{
		this.setZid(id);
		azone = new ArrayList<Zone>(zones.size());
		azone = zones;
	}
	public Zone(String id)
	{
		this.setZid(id);
		azone = new ArrayList<Zone>();
	}
	public String getZid()
	{
		return zid;
	}
	public void setZid(String id)
	{
		zid = id;
	}
	public ArrayList<Zone> getAzone()
	{
		return azone;
	}
	public void setAzone(ArrayList<Zone> zones)
	{
		azone = zones;
	}
	public void addAzone(Zone zone)
	{
		azone.add(zone);
	}
}
