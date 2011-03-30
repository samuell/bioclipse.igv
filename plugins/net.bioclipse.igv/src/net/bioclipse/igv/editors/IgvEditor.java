package net.bioclipse.igv.editors;

import org.broad.igv.ui.IGVMainFrame;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class IgvEditor extends EditorPart {
      private Label contents;

      public void createPartControl(Composite parent) {
          /*
           * Set a Windows specific AWT property that prevents heavyweight
           * components from erasing their background. Note that this is a global
           * property and cannot be scoped. It might not be suitable for your
           * application.
           */
          try {
          	System.setProperty("sun.awt.noerasebackground", "true");
          } catch (NoSuchMethodError error) {
          }

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
          
          com.jidesoft.utils.Lm.verifyLicense("The Broad Institute, MIT", "Gene Pattern",
          "D.DQSR7z9m6fxL1IqWZ6svQFmE6vj3Q");

          IGVMainFrame igvMainFrame = IGVMainFrame.getInstance();
          
          awtFrame.add(igvMainFrame);
      }
      public void init(IEditorSite site, IEditorInput input) {
         setSite(site);
         setInput(input);
      }
      public void setFocus() {
         if (this.contents != null)
        	 this.contents.setFocus();
      }
      
	@Override
	public void doSave(IProgressMonitor arg0) {
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
