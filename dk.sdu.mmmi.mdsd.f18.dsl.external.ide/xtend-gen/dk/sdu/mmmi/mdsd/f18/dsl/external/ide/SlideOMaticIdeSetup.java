/**
 * generated by Xtext 2.12.0
 */
package dk.sdu.mmmi.mdsd.f18.dsl.external.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMaticRuntimeModule;
import dk.sdu.mmmi.mdsd.f18.dsl.external.SlideOMaticStandaloneSetup;
import dk.sdu.mmmi.mdsd.f18.dsl.external.ide.SlideOMaticIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class SlideOMaticIdeSetup extends SlideOMaticStandaloneSetup {
  @Override
  public Injector createInjector() {
    SlideOMaticRuntimeModule _slideOMaticRuntimeModule = new SlideOMaticRuntimeModule();
    SlideOMaticIdeModule _slideOMaticIdeModule = new SlideOMaticIdeModule();
    return Guice.createInjector(Modules2.mixin(_slideOMaticRuntimeModule, _slideOMaticIdeModule));
  }
}
