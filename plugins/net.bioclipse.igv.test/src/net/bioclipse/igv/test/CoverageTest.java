/*******************************************************************************
 * Copyright (c) 2011  Samuel Lampa <samuel.lampa@gmail.com>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: Bioclipse Project <http://www.bioclipse.net>
 ******************************************************************************/
package net.bioclipse.igv.test;

import net.bioclipse.core.tests.coverage.AbstractCoverageTest;
import net.bioclipse.managers.business.IBioclipseManager;
import net.bioclipse.igv.business.IIgvManager;
import net.bioclipse.igv.business.IgvManager;

/**
 * JUnit tests for checking if the tested Manager is properly tested.
 */
public class CoverageTest extends AbstractCoverageTest {
    
    private static IgvManager manager = new IgvManager();

    @Override
    public IBioclipseManager getManager() {
        return manager;
    }

    @Override
    public Class<? extends IBioclipseManager> getManagerInterface() {
        return IIgvManager.class;
    }

}