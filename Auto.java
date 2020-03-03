//Leen, Birte, Wannes
public class Auto 
{
	private String aid;
	private Zone zone;
	
	public Auto() {}
	public Auto(String auto, Zone z) 
	{
		aid = auto;
		zone = z;
	}
	
	public void setZone(Zone z) 
	{
		zone = z;
	}
	public void setAid(String auto) 
	{
		aid = auto;
	}
	
	public Zone getZone() 
	{
		return zone;
	}
	public String getAid() 
	{
		return aid;
	}
}
