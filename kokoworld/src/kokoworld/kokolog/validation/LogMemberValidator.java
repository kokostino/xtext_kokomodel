/**
 *
 * $Id$
 */
package kokoworld.kokolog.validation;

import kokoworld.kokolog.LogDocument;

/**
 * A sample validator interface for {@link kokoworld.kokolog.LogMember}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogMemberValidator {
	boolean validate();

	boolean validateLogdocument(LogDocument value);
	boolean validateName(String value);
}