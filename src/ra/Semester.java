/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link ra.Semester#getCredits <em>Credits</em>}</li>
 *   <li>{@link ra.Semester#getSemesterCourses <em>Semester Courses</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see ra.RaPackage#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link ra.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see ra.RaPackage#getSemester_Credits()
	 * @model default="30"
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link ra.Semester#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Semester Courses</b></em>' containment reference list.
	 * The list contents are of type {@link ra.SemesterCourseList}.
	 * It is bidirectional and its opposite is '{@link ra.SemesterCourseList#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Courses</em>' containment reference list.
	 * @see ra.RaPackage#getSemester_SemesterCourses()
	 * @see ra.SemesterCourseList#getSemester
	 * @model opposite="semester" containment="true" required="true"
	 * @generated
	 */
	EList<SemesterCourseList> getSemesterCourses();

} // Semester
