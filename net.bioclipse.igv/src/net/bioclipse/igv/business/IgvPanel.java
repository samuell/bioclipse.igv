/**
 * 
 */
package net.bioclipse.igv.business;

import javax.swing.JPanel;

import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * @author samuel
 *
 */
public class IgvPanel extends JPanel {

	private ISelectionProvider part;
	
    public IgvPanel(ISelectionProvider part) {
        this.part=part;
    }
	
}
