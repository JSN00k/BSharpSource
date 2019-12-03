/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.tests;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.TopLevelImport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Top Level Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopLevelImportTest extends ITheoryImportCacheProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TopLevelImportTest.class);
	}

	/**
	 * Constructs a new Top Level Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Top Level Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TopLevelImport getFixture() {
		return (TopLevelImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BSharpFactory.eINSTANCE.createTopLevelImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TopLevelImportTest
