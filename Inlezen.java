import java.io.*;
import java.util.ArrayList;

//Wannes, Leen, Birte
public class Inlezen 
{
	private ArrayList<Auto> autos;
	private ArrayList<Reservatie> reservaties;
	private ArrayList<Zone> zones;
	
	public Inlezen()
	{
		String filenaam = "100_5_14_25.csv";
        BufferedReader reader = null;
        String regel = "";
        
        try 
        {
        	reader = new BufferedReader(new FileReader(filenaam));
            //Starten met het bestand in te lezen
        	while ((regel = reader.readLine()) != null) 
            {
        		//Deel 1: de aanvragen van auto;s
            	if(regel.contains("+Requests"))
            	{
            		//Inlezen van het getal
            		String[] aanvragen = regel.split(" ");
            		int aantalAanvragen = Integer.parseInt(aanvragen[1]);
            		//Verwerken van het getal*regels
            		String[] nieuweAanvraag;
            		String nid;
            		Zone nzone;
            		int ndag,nstTijd,ndtijd,pen1,pen2;
            		ArrayList<Auto> nautos;
            		for(int i=0;i<aantalAanvragen;i++)
            		{
            			//Aanvraag regel inlezen en verwerken
            			regel = reader.readLine();
            			nieuweAanvraag = regel.split(";");
            			nid = nieuweAanvraag[0];
            			nzone = new Zone(nieuweAanvraag[1]);
            			ndag = Integer.parseInt(nieuweAanvraag[2]);
            			nstTijd = Integer.parseInt(nieuweAanvraag[3]);
            			ndtijd = Integer.parseInt(nieuweAanvraag[4]);
            			String autos = nieuweAanvraag[5];
            			String[] nieuweAutos = autos.split(",");
            			for(int j=0;j<nieuweAutos.length;j++)
            			{
            				
            			}
            			
            			
            		}
            	}
            	
            }

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (reader != null) 
            {
                try 
                {
                    reader.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
	}
	}
	
	public ArrayList<Auto> getAutos()
	{
		return autos;
	}
	public void setAutos()
	{
		
	}
	public ArrayList<Reservatie> getReservaties()
	{
		return reservaties;
	}
	public ArrayList<Zone> getZones()
	{
		return zones;
	}
}
