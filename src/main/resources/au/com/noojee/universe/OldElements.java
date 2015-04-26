package au.com.noojee.universe;
import java.util.*;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.Event;
import javax.swing.tree.TreeNode;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.*;

/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Elements'
 * created in the main() method.
 */
public class OldElements extends JPanel implements TreeSelectionListener
{
	
	private final int m_nAtomNode = 0;
	private final int m_nMoleculeNode = 1;
	TreeNode m_nFirstNode = null;
	
				  
	public OldElements()
	{
		super();

		// Required for Visual J++ Form Designer support
		initForm();		

		// Add atoms under the atom node.
		TreeNode nodeAtoms = m_treeElements.getNode(m_nAtomNode);
		JTree
		Enumeration e = PeriodicTable.elements();
		while (e.hasMoreElements()) 
		{
			//ElementNode node = new ElementNode((Element)e.nextElement());
			ElementNode node = new ElementNode((Element)e.nextElement());
//			TreeNode tnode = new TreeNode(node.getName());
//			if (m_nFirstNode == null)
//				m_nFirstNode = (TreeNode)node;
			nodeAtoms.addNode(node);
		}
		
		// Add molecules under the Molecule node
		TreeNode nodeMolecules = m_treeElements.getNode(m_nMoleculeNode);
		
	}

	/**
	 * Elements overrides dispose so it can clean up the
	 * component list.
	 */
	public void dispose()
	{
		super.dispose();
		components.dispose();
	}


	private void onClickTree(Object source, Event e)
	{
		TreeNode nodeAtoms = m_treeElements.getSelectedNode();
		
	}



	private void onFilter(Object source, Event e)
	{
		Filter filter = new Filter();
		filter.show();
	}


	private void onFileOpen(Object source, Event e)
	{
        // Create an Open File dialog box   
        OpenFileDialog ofd = new OpenFileDialog();
        // Set up filters and options
        ofd.setFilter("Simulations (*.bus)|*.bus|All Files (*.*)|*.*");
        ofd.setDefaultExt("bus");
        // Run the Open File dialog box
        int OK = ofd.showDialog();
        // Check result of dialog box after it closes
        if (OK == DialogResult.OK) {
            // Retrieve the filename entered 
            String fileName = ofd.getFileName();
            // Open a File stream on that filename 
       //     currentDoc = File.open(fileName); 
            // Retrieve the length of the file
//            int ilength = (int)currentDoc.getLength();
            // Read in ANSI characters to JTextField buffer
//            editbox.setText(currentDoc.readStringCharsAnsi(ilength));   
            // Close the file handle
//            currentDoc.close();
//            fileOpen=true;
            // Set the application's caption  
            this.setText(File.getName(fileName) + " - Universal Simulator");
        }
    }


	
	private void onMouseMove(Object source, MouseEvent e)
	{
		//if the left button is down, do the drag/drop
		if(this.getMouseButtons()==MouseButton.LEFT)
		{
			TreeNode node = (TreeNode)m_treeElements.getSelectedNode();
			if (node instanceof ElementNode)
			{
				m_treeElements.doDragDrop( node, DragDropEffect.COPY);
			}
		}                      
	}


	private void onNavEvent(Object source, NavEvent e)
	{
		m_Axis.setText(new Integer(e.m_nAxis).toString());
		m_Inc.setText(new Integer(e.m_nOffset).toString());
		m_Reset.setText(new Boolean(e.m_bMouseDown).toString());
	}


	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();
	JTree m_treeElements = new JTree();
	//ImageList m_imageList = new ImageList();
//	GroupBox groupBox1 = new GroupBox();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JTextField m_edName = new JTextField();
	JTextField m_edSymbol = new JTextField();
	JTextField m_edAtomicNumber = new JTextField();
	JTextField m_edNeutrons = new JTextField();
	JPopupMenu m_mnuFile = new JPopupMenu();
	JMenuItem menuItem1 = new JMenuItem();
	JMenuItem m_mnuFilter = new JMenuItem();
	JMenuItem menuItem2 = new JMenuItem();
	JMenuItem m_mnuFileNew = new JMenuItem();
	JMenuItem m_mnuFileOpen = new JMenuItem();
	JMenuItem m_mnuFileSave = new JMenuItem();
	JMenuItem m_mnuSaveAs = new JMenuItem();
	// sbs ImageList imageList1 = new ImageList();
	JLabel m_Axis = new JLabel();
	JLabel m_Inc = new JLabel();
	JLabel m_Reset = new JLabel();
	JLabel m_X = new JLabel();
	JLabel m_Y = new JLabel();
//	GroupBox groupBox2 = new GroupBox();

	private void initForm()
	{
		// NOTE:  This form is storing resource information in an
		// external file.  Do not modify the string parameter to any
		// resources.getObject() function call. For example, do not
		// modify "foo1_location" in the following line of code
		// even if the name of the Foo object changes: 
		//   foo1.setLocation((Point)resources.getObject("foo1_location"));

		IResourceManager resources = new ResourceManager(this, "Elements");
		// SBS m_imageList.setImageStream((ImageListStreamer)resources.getObject("m_imageList_imageStream"));
		/* @designTimeOnly m_imageList.setLocation(new Point(688, 600)); */

		m_treeElements.setAllowDrop(true);
		m_treeElements.setLocation(new Point(552, 16));
		m_treeElements.setSize(new Point(208, 208));
		m_treeElements.setTabIndex(0);
		m_treeElements.setText("treeView1");
		m_treeElements.setHideSelection(false);
		// SBS m_treeElements.setImageList(m_imageList);
		m_treeElements.setIndent(19);
		m_treeElements.setSorted(true);
		m_treeElements.setNodes(new TreeNode[] {
								new TreeNode("Atoms", 0, -1), 
								new TreeNode("Molecules", 1, 1)});
		m_treeElements.addOnClick(new EventHandler(this.onClickTree));
		m_treeElements.addOnMouseMove(new MouseEventHandler(this.onMouseMove));
		m_treeElements.addOnAfterSelect(new TreeViewEventHandler(this.onSelect));

/*		groupBox1.setLocation(new Point(552, 240));
		groupBox1.setSize(new Point(208, 120));
		groupBox1.setTabIndex(1);
		groupBox1.setTabStop(false);
		groupBox1.setText("Element");
		groupBox1.addOnEnter(new EventHandler(this.groupBox1_enter));
*/
		label1.setLocation(new Point(8, 16));
		label1.setSize(new Point(40, 16));
		label1.setTabIndex(0);
		label1.setTabStop(false);
		label1.setText("Name:");

		label2.setLocation(new Point(8, 40));
		label2.setSize(new Point(40, 16));
		label2.setTabIndex(1);
		label2.setTabStop(false);
		label2.setText("Symbol:");

		label3.setLocation(new Point(8, 64));
		label3.setSize(new Point(104, 16));
		label3.setTabIndex(3);
		label3.setTabStop(false);
		label3.setText("Atomic No. (protons):");

		label4.setLocation(new Point(8, 88));
		label4.setSize(new Point(80, 16));
		label4.setTabIndex(2);
		label4.setTabStop(false);
		label4.setText("Neutrons:");

		m_edName.setLocation(new Point(112, 16));
		m_edName.setSize(new Point(88, 20));
		m_edName.setTabIndex(7);
		m_edName.setText("edit1");
		m_edName.setReadOnly(true);

		m_edSymbol.setLocation(new Point(112, 40));
		m_edSymbol.setSize(new Point(88, 20));
		m_edSymbol.setTabIndex(6);
		m_edSymbol.setText("edit1");
		m_edSymbol.setReadOnly(true);

		m_edAtomicNumber.setLocation(new Point(112, 64));
		m_edAtomicNumber.setSize(new Point(88, 20));
		m_edAtomicNumber.setTabIndex(5);
		m_edAtomicNumber.setText("edit1");
		m_edAtomicNumber.setReadOnly(true);

		m_edNeutrons.setLocation(new Point(112, 88));
		m_edNeutrons.setSize(new Point(88, 20));
		m_edNeutrons.setTabIndex(4);
		m_edNeutrons.setText("edit1");
		m_edNeutrons.setReadOnly(true);

		m_mnuFilter.setText("Filter");
		m_mnuFilter.addOnClick(new EventHandler(this.onFilter));

		menuItem1.setMenuItems(new JMenuItem[] {
							   m_mnuFilter});
		menuItem1.setText("Options");

		m_mnuFileNew.setText("&New");

		m_mnuFileOpen.setText("&Open");
		m_mnuFileOpen.addOnClick(new EventHandler(this.onFileOpen));

		m_mnuFileSave.setText("&Save");

		m_mnuSaveAs.setText("Save &As");

		menuItem2.setMenuItems(new JMenuItem[] {
							   m_mnuFileNew, 
							   m_mnuFileOpen, 
							   m_mnuFileSave, 
							   m_mnuSaveAs});
		menuItem2.setText("File");

		m_mnuFile.setMenuItems(new JMenuItem[] {
							   menuItem2, 
							   menuItem1});
		/* @designTimeOnly m_mnuFile.setLocation(new Point(688, 544)); */

		this.setText("Elements");
		this.setAutoScaleBaseSize(new Point(5, 13));
		this.setClientSize(new Point(773, 636));
		this.setMenu(m_mnuFile);

		/* @designTimeOnly imageList1.setLocation(new Point(704, 576)); */

		m_Axis.setLocation(new Point(552, 496));
		m_Axis.setSize(new Point(100, 23));
		m_Axis.setTabIndex(2);
		m_Axis.setTabStop(false);
		m_Axis.setText("Axis");

		m_Inc.setLocation(new Point(552, 520));
		m_Inc.setSize(new Point(100, 23));
		m_Inc.setTabIndex(10);
		m_Inc.setTabStop(false);
		m_Inc.setText("Inc");

		m_Reset.setLocation(new Point(552, 552));
		m_Reset.setSize(new Point(100, 23));
		m_Reset.setTabIndex(9);
		m_Reset.setTabStop(false);
		m_Reset.setText("Reset");

		m_X.setLocation(new Point(552, 576));
		m_X.setSize(new Point(100, 23));
		m_X.setTabIndex(4);
		m_X.setTabStop(false);
		m_X.setText("X");

		m_Y.setLocation(new Point(552, 600));
		m_Y.setSize(new Point(100, 23));
		m_Y.setTabIndex(3);
		m_Y.setTabStop(false);
		m_Y.setText("Y");

/*		groupBox2.setLocation(new Point(8, 8));
		groupBox2.setSize(new Point(528, 616));
		groupBox2.setTabIndex(8);
		groupBox2.setTabStop(false);
		groupBox2.setText("groupBox2");
*/
		this.setNewControls(new Control[] {
//							groupBox2, 
							m_Y, 
							m_X, 
							m_Reset, 
							m_Inc, 
							m_Axis, 
							groupBox1, 
							m_treeElements});
/*		groupBox1.setNewControls(new Control[] {
								 m_edNeutrons, 
								 m_edAtomicNumber, 
								 m_edSymbol, 
								 m_edName, 
								 label4, 
								 label3, 
								 label2, 
								 label1});
*/	}

	/**
	 * The main entry point for the application. 
	 *
	 * @param args Array of parameters passed to the application
	 * via the command line.
	 */
	public static void main(String args[])
	{
		Application.run(new Elements());
	}
	
	public void valueChanged(javax.swing.event.TreeSelectionEvent e)
	{
		TreeNode node = (TreeNode)e.node;
		e.getClass();
		if (node != null)
		{
			if (node instanceof ElementNode)
			{
				ElementNode eNode = (ElementNode)node;
				m_edName.setText(eNode.getName());
				m_edSymbol.setText(((Atom)eNode.m_element).getSymbol());
				m_edAtomicNumber.setText(((Atom)eNode.m_element).getAtomicNumber());
				m_edNeutrons.setText(((Atom)eNode.m_element).getNeutrons());
				
			}
			else	
				m_edName.setText(node.getText());
		}
	}
	
}
