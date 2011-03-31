package net.bioclipse.igv.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.part.EditorPart;

public class IgvEditor extends EditorPart {
    private Label contents;
    
    public void createPartControl(Composite parent) {
       contents = new Label(parent, SWT.NONE);
       contents.setText("Minimal Editor");
    }
    public void init(IEditorSite site, IEditorInput input) {
       setSite(site);
       setInput(input);
    }
    public void setFocus() {
       if (contents != null)
          contents.setFocus();
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
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}


}
