/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Specialisation#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link ra.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see ra.RaPackage#getSpecialisation_Semesters()
	 * @model lower="2" upper="6"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialisation
