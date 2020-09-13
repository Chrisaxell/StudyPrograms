/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Programme#getName <em>Name</em>}</li>
 *   <li>{@link ra.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link ra.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link ra.Programme#getSpesialisations <em>Spesialisations</em>}</li>
 *   <li>{@link ra.Programme#getCourseLists <em>Course Lists</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ra.RaPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ra.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see ra.RaPackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link ra.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see ra.RaPackage#getProgramme_Semesters()
	 * @model containment="true" lower="4" upper="8"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Spesialisations</b></em>' containment reference list.
	 * The list contents are of type {@link ra.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spesialisations</em>' containment reference list.
	 * @see ra.RaPackage#getProgramme_Spesialisations()
	 * @model containment="true" lower="4" upper="8"
	 * @generated
	 */
	EList<Specialisation> getSpesialisations();

	/**
	 * Returns the value of the '<em><b>Course Lists</b></em>' containment reference list.
	 * The list contents are of type {@link ra.CourseList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Lists</em>' containment reference list.
	 * @see ra.RaPackage#getProgramme_CourseLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseList> getCourseLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model NameUnique="false" NameOrdered="false"
	 * @generated
	 */
	void Programme(String Name, String Code);

} // Programme
