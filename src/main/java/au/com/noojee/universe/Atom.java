package au.com.noojee.universe;

public class Atom implements Element
{
	public Atom(String strName, String strSymbol, int nProtons) // , int nNeutrons)
	{
		m_strName = strName;
		m_strSymbol =strSymbol;
		m_nProtons = nProtons;
		// m_nNeutrons = nNeutrons;
	}
	
	public String getName()
	{
		return m_strName;
	}
	public String getSymbol()
	{
		return m_strSymbol;
	}
	public String getAtomicNumber()
	{
		return new String((new Integer(m_nProtons)).toString());
	}
	
	public String getNeutrons()
	{
		return "0";
	}
	
	private String m_strName;
	private String m_strSymbol;
	private int m_nProtons;
	// private int m_nNeutrons;
	
	private Point3d m_pntLocation;
}
