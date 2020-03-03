import java.util.ArrayList;

//Wannes, Leen, Birte
public class Zone 
{
	private String zid;
	private ArrayList<String> azone;
	
	public Zone()
	{
		this.setZid("Ongeldig");
		azone = new ArrayList<String>();
	}
	public Zone(String id, ArrayList<String> zones)
	{
		this.setZid(id);
		azone = new ArrayList<String>(zones.size());
		azone = zones;
	}
	public Zone(String id)
	{
		this.setZid(id);
		azone = new ArrayList<String>();
	}
	public String getZid()
	{
		return zid;
	}
	public void setZid(String id)
	{
		zid = id;
	}
	public ArrayList<String> getAzone()
	{
		return azone;
	}
	public void setAzone(ArrayList<String> zones)
	{
		azone = zones;
	}
	public void addAzone(String zone)
	{
		azone.add(zone);
	}
}
