package au.com.noojee.universe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 * This class is a visual component. The entry point for class execution
 * is the constructor.
 */
public class ViewNav extends java.awt.Component
{
	private static final long serialVersionUID = 1L;
	private final Cursor POSX;
	private final Cursor POSY;
	private final Cursor POSZ;
	private final Cursor POSZOOM;
	private final Cursor NEGX;
	private final Cursor NEGY;
	private final Cursor NEGZ;
	private final Cursor NEGZOOM;

	private Cursor m_curAxis = new Cursor(Cursor.DEFAULT_CURSOR);

	private final int  m_nDeadZoneThreshold = 6;
	private boolean m_bMouseDown = false;
	private int m_x = 0;
	private int m_y = 0;
	private Point m_pntOffset = null;
	private ImageIcon m_bmpMarker = null;
	private ImageIcon m_bmpNavView = null;
	private Point m_pntMouse = null;
	private Point m_pntMarkerSize = null;
	private Point m_pntMarkerHalfSize = null;
	private Point m_pntNavViewSize = null;
	private Point m_pntNavViewHalfSize = null;
	private Graphics m_grphSurface = null; 
	private String m_strRule = null;
	
	// Create instance of delegate
	private NavEventHandler m_NavEvent = null;

	public ViewNav()
	{
		super();
		
//		MessageBox.show("ViewNav", com.ms.wfc.io.File.getCurrentDirectory(), MessageBox.ICONHAND);
		// Load the cursors
		// We load them here so that the NavView will work correctly at design time.
		// There is a problem with the paths at design time.
/*		POSX = new Cursor("res\\posx.cur");
		POSY = new Cursor("res\\posy.cur");
		POSZ = new Cursor("res\\posz.cur");
		POSZOOM = new Cursor("res\\poszoom.cur");
		NEGX = new Cursor("res\\negx.cur");
		NEGY = new Cursor("res\\negy.cur");
		NEGZ = new Cursor("res\\negz.cur");
		NEGZOOM = new Cursor("res\\negzoom.cur");
*/
		POSX = null;
		POSY = null;
		POSZ = null;
		POSZOOM = null;
		NEGX = null;
		NEGY = null;
		NEGZ = null;
		NEGZOOM = null;

		try
		{

			// Required for Visual J++ Form Designer support
			//
			initForm();

//			IResourceManager resources = new ResourceManager(this, "ViewNav");
			// m_bmpNavView = (ImageIcon)resources.getObject("m_bmpNavView_image");
			m_bmpNavView = new ImageIcon("res\\navview.bmp");
			m_pntNavViewSize = new Point(m_bmpNavView.getIconWidth(), m_bmpNavView.getIconHeight());
			m_pntNavViewHalfSize = new Point(m_pntNavViewSize.x/2, m_pntNavViewSize.y/2);

			// m_bmpMarker = (ImageIcon)resources.getObject("m_picMarker_image");
			m_bmpMarker = new ImageIcon("res\\marker.bmp");
			// SBS m_bmpMarker.setTransparent(true);
			// SBS m_bmpMarker.setTransparentColor(new Color(255,255,255));
			m_pntMarkerSize = new Point(m_bmpMarker.getIconWidth(), m_bmpMarker.getIconHeight());
			m_pntMarkerHalfSize = new Point(m_pntMarkerSize.x/2, m_pntMarkerSize.y/2);
			m_pntOffset = new Point(m_pntMarkerHalfSize);
		
			// Get a grapics device and set its co-ordinate system
			// to that of a standard catisian plane.
			//
			
			/** TODO:
			m_grphSurface = createGraphics();
			m_grphSurface.setCoordinateSystem(CoordinateSystem.ISOTROPIC);
			Point pntOrigin = new Point(-m_pntNavViewHalfSize.x, m_pntNavViewHalfSize.y);
			// Origin is at the centre of the nav view.
			m_grphSurface.setCoordinateOrigin(pntOrigin, new Point(0,0));
			// +ve y is up the screen (as per cartisian plane).
			m_grphSurface.setCoordinateScale(new Point(1,-1), new Point(1,1));
			
			*/
			
		}
		catch (Exception e)
		{
			ShowException(e, "Construction of NavView failed");
		}
	}

	// Call delegate's combine method to add binding to invocation list
	public final void addOnNavEvent(NavEventHandler handler)
	{
// TODO		m_NavEvent = (NavEventHandler)Delegate.combine(m_NavEvent, handler);
	}

	public final void removeOnNavEvent(NavEventHandler handler)
	{
// TODO:		m_NavEvent = (NavEventHandler)Delegate.remove(m_NavEvent, handler);
	}

	/**
	 * Just fowards the NavEvent to the list of event handlers.
	 */
	protected void onNavEvent(NavEvent event)
	{
/* TODO		if(m_NavEvent != null){
			m_NavEvent.invoke(this, event);
 		}
*/
	}
	
	private void ShowException(Exception e, String strContext)
	{
		JOptionPane.showConfirmDialog(this, e.getClass().getName() + " : " + e.getMessage(), strContext, JOptionPane.OK_OPTION);
	}

	public void onMouseDown(Object source, MouseEvent e)
	{
		/** TODO: 
		Point pntMouse = m_grphSurface.getLogicalPoint(e.getX(), e.getY());
		// Determine if the click was on the marker
		Rectangle rectMarker = new Rectangle(-m_pntMarkerHalfSize.x , -m_pntMarkerHalfSize.y
											 , m_pntMarkerSize.x, m_pntMarkerSize.y);
		if (rectMarker.contains(pntMouse))
		{
			// User clicked on marker.
			
			// Set the offset so the mouse cursor is always 'attached' to
			// the marker at the same point as the user clicked.
			m_pntOffset = pntMouse;
		}
		else 
			// user didn't click on the marker so set the offset to the center.
			m_pntOffset = new Point( m_pntMarkerHalfSize.x,  m_pntMarkerHalfSize.y);
			
		m_bMouseDown = true;
		// Move the marker to the mouse cursor.
		MoveMarker(pntMouse);
		onNavEvent(new NavEvent(cursorToAxis(m_curAxis)
			, distance(m_x, m_y)
			, m_bMouseDown));
		 */
	}

	public void onMouseUp(Object source, MouseEvent e)
	{
		ResetMarker();
		m_bMouseDown = false;
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		onNavEvent(new NavEvent(0, 0, false));
	}

	public void onMouseMove(Object source, MouseEvent e)
	{
		/* TODO 
		Point pntMouse = m_grphSurface.getLogicalPoint(e.x, e.y);
		m_pntMouse = pntMouse;
		
		MoveMarker(pntMouse);
		setCursor(m_curAxis);		
		onNavEvent(new NavEvent(cursorToAxis(m_curAxis)
			, distance(m_x, m_y)
			, m_bMouseDown));
		 */
	}
	
	private void ResetMarker()
	{
		m_pntOffset = new Point(m_pntMarkerHalfSize.x, m_pntMarkerHalfSize.y);
		MoveMarker(new Point(0, 0));
	}

	/**
	 * Returns the rectangle which describes the markers current location.
	 */
	public Rectangle getMarkerRect()
	{
		return new Rectangle
			( m_x - m_pntMarkerHalfSize.x
			, m_y - m_pntMarkerHalfSize.y
			, m_pntMarkerSize.x
			, m_pntMarkerSize.y);
	}
	
	/**
	 * Returns the top left co-ordinate of the marker
	 */
	private Point getMarkerTopLeft()
	{
		return new Point
			( m_x - m_pntMarkerHalfSize.x 
			, m_y - m_pntMarkerHalfSize.y);
	}

	private void drawMarker()
	{
		m_grphSurface.drawImage(m_bmpMarker.getImage(), getMarkerTopLeft().x, getMarkerTopLeft().y, null);
	}

	/**
	 * Restrict the marker to the nav view area.
	 */
	private void restrictMarker(Point pntMarker)
	{
		// If the cursor is outside the navview then set
		// it back to the default cursor.
		if (pntMarker.x < -m_pntNavViewHalfSize.x - m_pntMarkerHalfSize.x
			|| pntMarker.x > m_pntNavViewHalfSize.x - m_pntMarkerHalfSize.x
			|| pntMarker.y < -m_pntNavViewHalfSize.y - m_pntMarkerHalfSize.y
			|| pntMarker.y > m_pntNavViewHalfSize.y - m_pntMarkerHalfSize.y)
		{
			m_curAxis = new Cursor(Cursor.DEFAULT_CURSOR);
		}
		
		pntMarker.x = Math.max(-m_pntNavViewHalfSize.x + m_pntMarkerHalfSize.x, Math.min(pntMarker.x, m_pntNavViewHalfSize.x - m_pntMarkerHalfSize.x ));
		pntMarker.y = Math.max(-m_pntNavViewHalfSize.y + m_pntMarkerHalfSize.y, Math.min(pntMarker.y, m_pntNavViewHalfSize.y - m_pntMarkerHalfSize.y ));
		
		// We also define a dead zone in the centre of the view. This stops the
		// user accidently registering on the wrong axis when they start moving
		// the marker. When the reach the given threshold the marker starts
		// moving.
		if (distance(pntMarker.x, pntMarker.y) < m_nDeadZoneThreshold)
		{
			pntMarker.x = 0;
			pntMarker.y = 0;
			m_curAxis = new Cursor(Cursor.DEFAULT_CURSOR);
		}
	}
	
	// We use pythagorus therom  a^2 + b^2 = c^2 to calculate
	// the distance the cursor is from the centre of the NavView.
	int distance(int nX, int nY)
	{
		return new Double(Math.sqrt(Math.pow(nX,2) +  Math.pow(nY,2))).intValue();
	}
	
	/**
	 * @param pntLocation - the position to move the maker to. It must be in 
	 * logical coordinates.
	 */
	private void MoveMarker(Point pntLocation)
	{
	
		if (m_bMouseDown)
		{
			// Clear the marker from its old position.
			// TODO: invalidate(getDeviceRectangle(getMarkerRect()));
			invalidate();
		}

		// Now force the location to be on one of the axis' 
		// The cutoff point  between each axis can be describe by the following equations.
		// x-z border:		x = 2y
		// z-y border:		x = 0.5y
		// y:scale border:	x = -0.5y
		// scale:x border:	x = -2y
		// Each axis can then be defined as a region between these cutoff points described as
		// x axis		: x >= 2y	  &&	x < -2y
		// y axis		: x <= 0.5y	  &&	x > -0.5y
		// z axis		: x <= 2y	  &&	x > 0.5y
		// scale axis	: x <= -0.5y  &&	x > -2y
			
		// Calculate the new marker position.
		Point pntMarker = pntLocation; //new Point(pntLocation.x - m_pntOffset.x, pntLocation.y - m_pntOffset.y);
		if ((pntMarker.x >= 0 && pntMarker.x >= 2*pntMarker.y && pntMarker.x >= -2*pntMarker.y)			// x-axis
		|| (pntMarker.x < 0 && pntMarker.x <= 2*pntMarker.y && pntMarker.x <= -2*pntMarker.y))
		{
			pntMarker.y = 0;
			if (pntMarker.x > 0)
				m_curAxis = POSX;
			else
				m_curAxis = NEGX;
		}
		else if ((pntMarker.y >= 0 && pntMarker.x <= 0.5*pntMarker.y && pntMarker.x >= -0.5*pntMarker.y)	// y-axis
		|| (pntMarker.y < 0 && pntMarker.x >= 0.5*pntMarker.y && pntMarker.x <= -0.5*pntMarker.y))
		{
			pntMarker.x = 0;
			if (pntMarker.y > 0)
				m_curAxis = POSY;
			else
				m_curAxis = NEGY;
		}
		else if ((pntMarker.x >= 0 && pntMarker.x <= 2*pntMarker.y && pntMarker.x >= 0.5*pntMarker.y)		// z-axis
		|| (pntMarker.x < 0 && pntMarker.x >= 2*pntMarker.y && pntMarker.x <= 0.5*pntMarker.y))
		{
			pntMarker.x = pntMarker.y;
			if (pntMarker.x > 0)
				m_curAxis = POSZ;
			else
				m_curAxis = NEGZ;
		}
		else if ((pntMarker.x < 0 && pntMarker.x <= -0.5*pntMarker.y && pntMarker.x >= -2*pntMarker.y)	// scale-axis
		|| (pntMarker.x >= 0 && pntMarker.x >= -0.5*pntMarker.y && pntMarker.x <= -2*pntMarker.y))
		{
			pntMarker.x = -pntMarker.y;
			if (pntMarker.x < 0)
				m_curAxis = POSZOOM;
			else
				m_curAxis = NEGZOOM;
		}
		else if (pntMarker.x == 0 && pntMarker.y == 0)
			m_curAxis = new Cursor(Cursor.DEFAULT_CURSOR); // null statement as no action required.
		else
			throw new RuntimeException("Should always go through one of the above if statements.");
		
		restrictMarker(pntMarker);
		
	
		if (m_bMouseDown)
		{
			// The marker only moves if the mouse is down.
			m_x = pntMarker.x;// - m_pntOffset.x;
			m_y = pntMarker.y;// - m_pntOffset.y;
			// And draw it at the new.
			// TODO invalidate(getDeviceRectangle(getMarkerRect()));
			invalidate();
			update(this.getGraphics());
			
		}
	}
	
	/**
	 * Converts a rectangle in device coordinates to logical (page)
	 * coordinates.
	 * @param rect - rectangle in device coordinates.
	 * @return rectangle in logical coordinates.
	 */
	public Rectangle getLogicalRectangle(Rectangle rectDevice)
	{
/* TODO		Point pntTop = m_grphSurface.getDevicePoint(rectDevice.x, rectDevice.y);
		Point pntBottom = m_grphSurface.getDevicePoint(rectDevice.x + rectDevice.width
													   , rectDevice.y + rectDevice.height);
		if (pntTop.y > pntBottom.y)
		{
			int nTmp = pntTop.y;
			pntTop.y = pntBottom.y;
			pntBottom.y = nTmp;
		}
		Rectangle rectLogical =  new Rectangle(pntTop.x, pntTop.y
				, pntBottom.x - pntTop.x, pntBottom.y - pntTop.y);
		return rectLogical;
 */
		return new Rectangle(0, 0, 100, 100);
}
	
	/**
	 * Converts a rectangle in logical (page) coordinates to device
	 * coordinates.
	 * @param rect - rectangle in logical coordinates.
	 * @return rectangle in device coordinates.
	 */
	public Rectangle getDeviceRectangle(Rectangle rectLogical)
	{
		/* TODO
		Point pntTop = m_grphSurface.getDevicePoint(rectLogical.x, rectLogical.y);
		Point pntBottom = m_grphSurface.getDevicePoint(rectLogical.x + rectLogical.width
													   , rectLogical.y + rectLogical.height);
		if (pntTop.y > pntBottom.y)
		{
			int nTmp = pntTop.y;
			pntTop.y = pntBottom.y;
			pntBottom.y = nTmp;
		}
		Rectangle rectDevice =  new Rectangle(pntTop.x, pntTop.y
				, pntBottom.x - pntTop.x, pntBottom.y - pntTop.y);
		return rectDevice;
		 */
		return new Rectangle(0, 0, 100, 100);
	}
	
/** 
 *TODO: stop the background repainting.
 private void onEraseBackground(EraseBackgroundEvent event) 
	{
        event.handled = true;
    }
 */
    
	public void onPaint(Object source, PaintEvent e)
	{
/*		e.graphics.setCoordinateSystem(CoordinateSystem.ISOTROPIC);
		Point pntOrigin = new Point(-m_pntNavViewHalfSize.x, m_pntNavViewHalfSize.y);
		e.graphics.setCoordinateOrigin(pntOrigin, new Point(0,0));
		e.graphics.setCoordinateScale(new Point(1,-1), new Point(1,1));
*/
		// Draw the NavView, but only as much as needs to be (as defined by the clip rect).
		m_grphSurface.drawImage(m_bmpNavView.getImage(),  -m_pntNavViewHalfSize.x, -m_pntNavViewHalfSize.y, null);
		drawMarker();
	}



	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();

	private void initForm()
	{
		
		this.setSize(82, 76);
		/** TODO
		this.setText("ViewNav");
		this.addOnMouseDown(new MouseEventHandler(this.onMouseDown));
		this.addOnMouseMove(new MouseEventHandler(this.onMouseMove));
		this.addOnMouseUp(new MouseEventHandler(this.onMouseUp));
		this.addOnPaint(new PaintEventHandler(this.onPaint));
		 */
	}

	/** TODO: Replace with a bean info.
	public static class ClassInfo extends UserControl.ClassInfo
	{
		public static EventInfo navEvt 
			= new EventInfo(ViewNav.class
				, "navEvent", NavEventHandler.class);
		public void getEvents(IEvents events)
		{	
			super.getEvents(events);
			events.add(navEvt);
		}

		public void getProperties(IProperties props)
		{
			super.getProperties(props);
		}
	}
	*/
	public int cursorToAxis(Cursor curAxis)
	{
		int nCursor = NavEvent.DEFAULT;
		if (curAxis == POSX)
			nCursor = NavEvent.POSX;
		else if (curAxis == POSY)
			nCursor = NavEvent.POSY;
		else if (curAxis == POSZ)
			nCursor = NavEvent.POSZ;
		else if (curAxis == POSZOOM)
			nCursor = NavEvent.POSZOOM;
		else if (curAxis == NEGX)
			nCursor = NavEvent.NEGX;
		else if (curAxis == NEGY)
			nCursor = NavEvent.NEGY;
		else if (curAxis == NEGZ)
			nCursor = NavEvent.NEGZ;
		else if (curAxis == NEGZOOM)
			nCursor = NavEvent.NEGZOOM;
		return nCursor;
	}
}
