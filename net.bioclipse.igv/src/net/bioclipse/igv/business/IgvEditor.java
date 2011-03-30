package net.bioclipse.igv.business;

import javax.swing.JScrollPane;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.part.MultiPageEditorPart;

public class IgvEditor extends MultiPageEditorPart implements ISelectionProvider {

	private IgvPanel igvPanel;

	@Override
	protected void createPages() {
        createPage0();
	}

	void createPage0() {
        setupStuffUntilAwtPanel();

        // IGV Specific stuff
        igvPanel = new IgvPanel(this);
        JScrollPane scrollPane = new JScrollPane(igvPanel);
        igvPanel.add(scrollPane);
	}

	private void setupStuffUntilAwtPanel() {
		Composite parent = new Composite(getContainer(), SWT.NONE);

        //Set the layout for parent
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        layout.verticalSpacing = 2;
        layout.marginWidth = 0;
        layout.marginHeight = 2;
        parent.setLayout(layout);

        GridData layoutData = new GridData();
        layoutData.grabExcessHorizontalSpace = true;
        layoutData.grabExcessVerticalSpace = true;
        parent.setLayoutData(layoutData);

        //Add the Jmol composite to the top
        Composite composite = new Composite( parent, SWT.NO_BACKGROUND 
                                                   | SWT.EMBEDDED
                                                   | SWT.DOUBLE_BUFFERED );
        layout = new GridLayout();
        composite.setLayout(layout);
        layoutData = new GridData(GridData.FILL_BOTH);
        composite.setLayoutData(layoutData);

        java.awt.Frame awtFrame = SWT_AWT.new_Frame(composite);
        java.awt.Panel awtPanel 
            = new java.awt.Panel(new java.awt.BorderLayout());
        awtFrame.add(awtPanel);
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelection(ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
