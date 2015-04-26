package au.com.noojee.universe;

import java.util.*;
import java.util.NoSuchElementException;

public class PeriodicTableEnumerator implements Enumeration<Element>
{
	private int m_nPos = 0;
	private PeriodicTable m_table;

	public PeriodicTableEnumerator(PeriodicTable table)
	{
			m_table = table;
	}
	
	public boolean hasMoreElements()
	{
		return (m_nPos < m_table.length());
	}
	
	public Element nextElement() throws NoSuchElementException
	{
		if (m_nPos < m_table.length())
			return m_table.getElement(m_nPos++);
		else
			throw new NoSuchElementException();
	}
}
