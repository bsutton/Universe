package au.com.noojee.universe;


/**
 * This class can take a variable number of parameters on the command
 * line. Program execution begins with the main() method. The class
 * constructor is not invoked unless an object of type 'Filter'
 * created in the main() method.
 */
public class OldFilter extends javax.swing.JDialog
{
	/*
	public OldFilter()
	{
		super();

		// Required for Visual J++ Form Designer support
		initForm();		

		// TODO: Add any constructor code after initForm call
	}

	/**
	 * Filter overrides dispose so it can clean up the
	 * component list.
	 */
	public void dispose()
	{
		super.dispose();
		components.dispose();
	}

	private void onDragDrop(Object source, DragEvent e)
	{
		
      // If text is in the object, write it into the edit control.
      if (e.data.getDataPresent(ElementNode.class))
      {
         ElementNode node=(ElementNode)e.data.getData(ElementNode.class);
         m_edParticle.setText(node.getName());
      }
   
	}

	/**
	 * NOTE: The following code is required by the Visual J++ form
	 * designer.  It can be modified using the form editor.  Do not
	 * modify it using the code editor.
	 */
	Container components = new Container();
	Label label1 = new Label();
	Edit m_edParticle = new Edit();
	RadioButton radioButton1 = new RadioButton();
	RadioButton radioButton2 = new RadioButton();
	Button m_btnReset = new Button();
	Button m_btnApply = new Button();
	Button m_btnOK = new Button();
	Button m_btnCancel = new Button();
	RadioButton radioButton3 = new RadioButton();
	RadioButton radioButton4 = new RadioButton();

	private void initForm()
	{
		label1.setLocation(new Point(0, 16));
		label1.setSize(new Point(48, 16));
		label1.setTabIndex(0);
		label1.setTabStop(false);
		label1.setText("Particle:");

		m_edParticle.setAllowDrop(true);
		m_edParticle.setLocation(new Point(48, 16));
		m_edParticle.setSize(new Point(100, 20));
		m_edParticle.setTabIndex(1);
		m_edParticle.setText("edit1");
		m_edParticle.setAcceptsReturn(false);
		m_edParticle.addOnDragDrop(new DragEventHandler(this.onDragDrop));

		radioButton1.setLocation(new Point(8, 47));
		radioButton1.setSize(new Point(64, 23));
		radioButton1.setTabIndex(2);
		radioButton1.setText("Show");

		radioButton2.setLocation(new Point(8, 72));
		radioButton2.setSize(new Point(100, 23));
		radioButton2.setTabIndex(3);
		radioButton2.setText("Hide");

		m_btnReset.setLocation(new Point(272, 72));
		m_btnReset.setSize(new Point(75, 23));
		m_btnReset.setTabIndex(4);
		m_btnReset.setText("Reset");

		m_btnApply.setLocation(new Point(192, 104));
		m_btnApply.setSize(new Point(75, 23));
		m_btnApply.setTabIndex(6);
		m_btnApply.setText("Apply");

		m_btnOK.setLocation(new Point(112, 104));
		m_btnOK.setSize(new Point(75, 23));
		m_btnOK.setTabIndex(5);
		m_btnOK.setText("OK");
		m_btnOK.setDialogResult(DialogResult.OK);

		m_btnCancel.setLocation(new Point(272, 104));
		m_btnCancel.setSize(new Point(75, 23));
		m_btnCancel.setTabIndex(7);
		m_btnCancel.setText("Cancel");
		m_btnCancel.setDialogResult(DialogResult.CANCEL);

		this.setText("Filter");
		this.setAcceptButton(m_btnOK);
		this.setAutoScaleBaseSize(new Point(5, 13));
		this.setCancelButton(m_btnCancel);
		this.setClientSize(new Point(357, 132));
		this.setHelpButton(true);
		this.setMaximizeBox(false);
		this.setShowInTaskbar(false);
		this.setTopMost(true);

		radioButton3.setLocation(new Point(120, 72));
		radioButton3.setSize(new Point(144, 23));
		radioButton3.setTabIndex(9);
		radioButton3.setText("Apply to existing filter");

		radioButton4.setLocation(new Point(120, 48));
		radioButton4.setSize(new Point(144, 23));
		radioButton4.setTabIndex(8);
		radioButton4.setText("New Filter");

		this.setNewControls(new Control[] {
							radioButton4, 
							radioButton3, 
							m_btnCancel, 
							m_btnApply, 
							m_btnOK, 
							m_btnReset, 
							radioButton2, 
							radioButton1, 
							m_edParticle, 
							label1});
	}

	/**
	 * The main entry point for the application. 
	 *
	 * @param args Array of parameters passed to the application
	 * via the command line.
	 */
	public static void main(String args[])
	{
		Application.run(new Filter());
	}
	*/
}
