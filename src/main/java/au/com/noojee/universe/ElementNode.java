package au.com.noojee.universe;

import javax.swing.tree.TreeNode;

public class ElementNode implements TreeNode
{
	// int m_nType = m_nAtomNode;
	Element m_element = null;
		
	ElementNode(Element element)
	{
		//super(element.getName());
		m_element = element;
	}
	String getName()
	{
		return m_element.getName();
	}
	
	public int getIndex(javax.swing.tree.TreeNode treeNode)
	{
		return 0;
	}
	
	public javax.swing.tree.TreeNode getParent()
	{
		// TODO:
		return null;
	}
	
	public java.util.Enumeration<Element> children()
	{
		// TODO:
		return null;
	}
	
	public int getChildCount()
	{
		return 0;
	}
	
	public boolean getAllowsChildren()
	{
		return true;
	}
	
	public javax.swing.tree.TreeNode getChildAt(int param)
	{
		return null;
	}
	
	public boolean isLeaf()
	{
		return false;
	}
	
}
