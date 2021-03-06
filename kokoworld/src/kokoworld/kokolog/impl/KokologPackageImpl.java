/**
 */
package kokoworld.kokolog.impl;

import kokoworld.kokolog.BaseEntity;
import kokoworld.kokolog.KokologFactory;
import kokoworld.kokolog.KokologPackage;
import kokoworld.kokolog.LogDocument;
import kokoworld.kokoworld.KokoworldPackage;

import kokoworld.kokoworld.impl.KokoworldPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KokologPackageImpl extends EPackageImpl implements KokologPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEntityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kokoworld.kokolog.KokologPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KokologPackageImpl() {
		super(eNS_URI, KokologFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link KokologPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KokologPackage init() {
		if (isInited) return (KokologPackage)EPackage.Registry.INSTANCE.getEPackage(KokologPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKokologPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KokologPackageImpl theKokologPackage = registeredKokologPackage instanceof KokologPackageImpl ? (KokologPackageImpl)registeredKokologPackage : new KokologPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KokoworldPackage.eNS_URI);
		KokoworldPackageImpl theKokoworldPackage = (KokoworldPackageImpl)(registeredPackage instanceof KokoworldPackageImpl ? registeredPackage : KokoworldPackage.eINSTANCE);

		// Create package meta-data objects
		theKokologPackage.createPackageContents();
		theKokoworldPackage.createPackageContents();

		// Initialize created meta-data
		theKokologPackage.initializePackageContents();
		theKokoworldPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKokologPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KokologPackage.eNS_URI, theKokologPackage);
		return theKokologPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogDocument() {
		return logDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogDocument_Baseentities() {
		return (EReference)logDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseEntity() {
		return baseEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseEntity_Logdocument() {
		return (EReference)baseEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseEntity_Name() {
		return (EAttribute)baseEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KokologFactory getKokologFactory() {
		return (KokologFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		logDocumentEClass = createEClass(LOG_DOCUMENT);
		createEReference(logDocumentEClass, LOG_DOCUMENT__BASEENTITIES);

		baseEntityEClass = createEClass(BASE_ENTITY);
		createEReference(baseEntityEClass, BASE_ENTITY__LOGDOCUMENT);
		createEAttribute(baseEntityEClass, BASE_ENTITY__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KokoworldPackage theKokoworldPackage = (KokoworldPackage)EPackage.Registry.INSTANCE.getEPackage(KokoworldPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logDocumentEClass.getESuperTypes().add(theKokoworldPackage.getDocument());

		// Initialize classes, features, and operations; add parameters
		initEClass(logDocumentEClass, LogDocument.class, "LogDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogDocument_Baseentities(), this.getBaseEntity(), this.getBaseEntity_Logdocument(), "baseentities", null, 0, -1, LogDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEntityEClass, BaseEntity.class, "BaseEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseEntity_Logdocument(), this.getLogDocument(), this.getLogDocument_Baseentities(), "logdocument", null, 0, 1, BaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KokologPackageImpl
