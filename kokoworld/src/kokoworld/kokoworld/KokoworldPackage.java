/**
 */
package kokoworld.kokoworld;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kokoworld.kokoworld.KokoworldFactory
 * @model kind="package"
 * @generated
 */
public interface KokoworldPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kokoworld";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/kokoworld";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kokoworld";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KokoworldPackage eINSTANCE = kokoworld.kokoworld.impl.KokoworldPackageImpl.init();

	/**
	 * The meta object id for the '{@link kokoworld.kokoworld.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kokoworld.kokoworld.impl.DocumentImpl
	 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Importcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IMPORTCONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link kokoworld.kokoworld.INamedElement <em>INamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kokoworld.kokoworld.INamedElement
	 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getINamedElement()
	 * @generated
	 */
	int INAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kokoworld.kokoworld.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kokoworld.kokoworld.impl.MemberImpl
	 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DESCRIPTION = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kokoworld.kokoworld.impl.ImportContainerImpl <em>Import Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kokoworld.kokoworld.impl.ImportContainerImpl
	 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getImportContainer()
	 * @generated
	 */
	int IMPORT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER__DOCUMENT = 1;

	/**
	 * The number of structural features of the '<em>Import Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kokoworld.kokoworld.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kokoworld.kokoworld.impl.ImportImpl
	 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 4;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Importcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTCONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kokoworld.kokoworld.IDescribable <em>IDescribable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kokoworld.kokoworld.IDescribable
	 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getIDescribable()
	 * @generated
	 */
	int IDESCRIBABLE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIBABLE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>IDescribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIBABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IDescribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIBABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link kokoworld.kokoworld.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see kokoworld.kokoworld.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link kokoworld.kokoworld.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kokoworld.kokoworld.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kokoworld.kokoworld.Document#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see kokoworld.kokoworld.Document#getMembers()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Members();

	/**
	 * Returns the meta object for the containment reference '{@link kokoworld.kokoworld.Document#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Importcontainer</em>'.
	 * @see kokoworld.kokoworld.Document#getImportcontainer()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Importcontainer();

	/**
	 * Returns the meta object for class '{@link kokoworld.kokoworld.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see kokoworld.kokoworld.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for class '{@link kokoworld.kokoworld.INamedElement <em>INamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamed Element</em>'.
	 * @see kokoworld.kokoworld.INamedElement
	 * @generated
	 */
	EClass getINamedElement();

	/**
	 * Returns the meta object for the attribute '{@link kokoworld.kokoworld.INamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kokoworld.kokoworld.INamedElement#getName()
	 * @see #getINamedElement()
	 * @generated
	 */
	EAttribute getINamedElement_Name();

	/**
	 * Returns the meta object for class '{@link kokoworld.kokoworld.ImportContainer <em>Import Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Container</em>'.
	 * @see kokoworld.kokoworld.ImportContainer
	 * @generated
	 */
	EClass getImportContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link kokoworld.kokoworld.ImportContainer#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see kokoworld.kokoworld.ImportContainer#getImports()
	 * @see #getImportContainer()
	 * @generated
	 */
	EReference getImportContainer_Imports();

	/**
	 * Returns the meta object for the container reference '{@link kokoworld.kokoworld.ImportContainer#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see kokoworld.kokoworld.ImportContainer#getDocument()
	 * @see #getImportContainer()
	 * @generated
	 */
	EReference getImportContainer_Document();

	/**
	 * Returns the meta object for class '{@link kokoworld.kokoworld.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see kokoworld.kokoworld.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link kokoworld.kokoworld.Import#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see kokoworld.kokoworld.Import#getItem()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Item();

	/**
	 * Returns the meta object for the container reference '{@link kokoworld.kokoworld.Import#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importcontainer</em>'.
	 * @see kokoworld.kokoworld.Import#getImportcontainer()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Importcontainer();

	/**
	 * Returns the meta object for class '{@link kokoworld.kokoworld.IDescribable <em>IDescribable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDescribable</em>'.
	 * @see kokoworld.kokoworld.IDescribable
	 * @generated
	 */
	EClass getIDescribable();

	/**
	 * Returns the meta object for the attribute '{@link kokoworld.kokoworld.IDescribable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see kokoworld.kokoworld.IDescribable#getDescription()
	 * @see #getIDescribable()
	 * @generated
	 */
	EAttribute getIDescribable_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KokoworldFactory getKokoworldFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kokoworld.kokoworld.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kokoworld.kokoworld.impl.DocumentImpl
		 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__MEMBERS = eINSTANCE.getDocument_Members();

		/**
		 * The meta object literal for the '<em><b>Importcontainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__IMPORTCONTAINER = eINSTANCE.getDocument_Importcontainer();

		/**
		 * The meta object literal for the '{@link kokoworld.kokoworld.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kokoworld.kokoworld.impl.MemberImpl
		 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '{@link kokoworld.kokoworld.INamedElement <em>INamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kokoworld.kokoworld.INamedElement
		 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getINamedElement()
		 * @generated
		 */
		EClass INAMED_ELEMENT = eINSTANCE.getINamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INAMED_ELEMENT__NAME = eINSTANCE.getINamedElement_Name();

		/**
		 * The meta object literal for the '{@link kokoworld.kokoworld.impl.ImportContainerImpl <em>Import Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kokoworld.kokoworld.impl.ImportContainerImpl
		 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getImportContainer()
		 * @generated
		 */
		EClass IMPORT_CONTAINER = eINSTANCE.getImportContainer();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_CONTAINER__IMPORTS = eINSTANCE.getImportContainer_Imports();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_CONTAINER__DOCUMENT = eINSTANCE.getImportContainer_Document();

		/**
		 * The meta object literal for the '{@link kokoworld.kokoworld.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kokoworld.kokoworld.impl.ImportImpl
		 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ITEM = eINSTANCE.getImport_Item();

		/**
		 * The meta object literal for the '<em><b>Importcontainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTCONTAINER = eINSTANCE.getImport_Importcontainer();

		/**
		 * The meta object literal for the '{@link kokoworld.kokoworld.IDescribable <em>IDescribable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kokoworld.kokoworld.IDescribable
		 * @see kokoworld.kokoworld.impl.KokoworldPackageImpl#getIDescribable()
		 * @generated
		 */
		EClass IDESCRIBABLE = eINSTANCE.getIDescribable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDESCRIBABLE__DESCRIPTION = eINSTANCE.getIDescribable_Description();

	}

} //KokoworldPackage
