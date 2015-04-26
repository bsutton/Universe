package au.com.noojee.universe;

import java.awt.Event;

public class NavEvent extends Event
{
	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT = 0;
	public static final int POSX = 1;
	public static final int POSY = 2;
	public static final int POSZ = 3;
	public static final int POSZOOM = 4;
	public static final int NEGX = 5;
	public static final int NEGY = 6;
	public static final int NEGZ = 7;
	public static final int NEGZOOM = 8;
	
	public final int m_nAxis;		// The axis the mouse was over when the event was
									// generated.
	public final int m_nOffset;		// The distance the pointer is from the centre
									// of the nav view.
	public final boolean m_bMouseDown;
									// If true then the mouse was down when the event
									// was generated.
	public NavEvent( int nAxis, int nOffset, boolean bMouseDown)
	{
		super(null, 0, null);	// TODO: ?????
		m_nAxis = nAxis;
		m_nOffset   = nOffset;
		m_bMouseDown = bMouseDown;
	}
	
}
