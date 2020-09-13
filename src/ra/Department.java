/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Department#getName <em>Name</em>}</li>
 *   <li>{@link ra.Department#getProgrammes <em>Programmes</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see ra.RaPackage#getDepartment_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

} // Department
