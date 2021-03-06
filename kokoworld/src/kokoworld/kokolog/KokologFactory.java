/**
 */
package kokoworld.kokolog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kokoworld.kokolog.KokologPackage
 * @generated
 */
public interface KokologFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KokologFactory eINSTANCE = kokoworld.kokolog.impl.KokologFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Document</em>'.
	 * @generated
	 */
	LogDocument createLogDocument();

	/**
	 * Returns a new object of class '<em>Base Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Entity</em>'.
	 * @generated
	 */
	BaseEntity createBaseEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KokologPackage getKokologPackage();

} //KokologFactory
