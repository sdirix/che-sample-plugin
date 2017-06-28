/*******************************************************************************
 * Copyright (c) 2012-2017
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package my.plugin.ide.inject;

import com.google.gwt.inject.client.AbstractGinModule;

import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import my.plugin.ide.IconResource;
import org.eclipse.che.ide.api.extension.ExtensionGinModule;
import org.eclipse.che.ide.api.filetypes.FileType;


/**
 * @author Vitalii Parfonov
 */
@ExtensionGinModule
public class SampleMenuGinModule extends AbstractGinModule {

    /** {@inheritDoc} */
    @Override
    protected void configure() {
    }

    @Provides
    @Singleton
    @Named("EcoreFileType")
    protected FileType provideEcoreFile(IconResource res) {
        return new FileType(res.icon(), "ecore");
    }
}
