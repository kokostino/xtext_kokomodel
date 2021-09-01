/**
 *
 * $Id$
 */
package kokoworld.kokoworld.validation;

import kokoworld.kokoworld.Document;
import kokoworld.kokoworld.Import;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link kokoworld.kokoworld.ImportContainer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImportContainerValidator {
	boolean validate();

	boolean validateImports(EList<Import> value);
	boolean validateDocument(Document value);
}