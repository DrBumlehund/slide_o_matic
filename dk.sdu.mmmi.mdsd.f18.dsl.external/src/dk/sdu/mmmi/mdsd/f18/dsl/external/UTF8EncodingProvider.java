package dk.sdu.mmmi.mdsd.f18.dsl.external;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.parser.IEncodingProvider;

public class UTF8EncodingProvider implements IEncodingProvider {

	@Override
	public String getEncoding(URI uri) {
		return "UTF-8";
	}

}
