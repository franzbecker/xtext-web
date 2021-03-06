/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.example.entities.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.web.example.entities.EntitiesRuntimeModule;
import org.eclipse.xtext.web.example.entities.EntitiesStandaloneSetup;
import org.eclipse.xtext.web.example.entities.ide.EntitiesIdeModule;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EntitiesIdeSetup extends EntitiesStandaloneSetup {
  @Override
  public Injector createInjector() {
    EntitiesRuntimeModule _entitiesRuntimeModule = new EntitiesRuntimeModule();
    EntitiesIdeModule _entitiesIdeModule = new EntitiesIdeModule();
    return Guice.createInjector(_entitiesRuntimeModule, _entitiesIdeModule);
  }
}
