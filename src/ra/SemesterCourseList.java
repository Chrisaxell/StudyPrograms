/**
 */
package ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ra.SemesterCourseList#isObligatory <em>Obligatory</em>}</li>
 *   <li>{@link ra.SemesterCourseList#getSemester <em>Semester</em>}</li>
 *   <li>{@link ra.SemesterCourseList#getCourses <em>Courses</em>}</li>
 *   <li>{@link ra.SemesterCourseList#getCourseLists <em>Course Lists</em>}</li>
 * </ul>
 *
 * @see ra.RaPackage#getSemesterCourseList()
 * @model
 * @generated
 */
public interface SemesterCourseList extends EObject {
	/**
	 * Returns the value of the '<em><b>Obligatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligatory</em>' attribute.
	 * @see #setObligatory(boolean)
	 * @see ra.RaPackage#getSemesterCourseList_Obligatory()
	 * @model
	 * @generated
	 */
	boolean isObligatory();

	/**
	 * Sets the value of the '{@link ra.SemesterCourseList#isObligatory <em>Obligatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligatory</em>' attribute.
	 * @see #isObligatory()
	 * @generated
	 */
	void setObligatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ra.Semester#getSemesterCourses <em>Semester Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see ra.RaPackage#getSemesterCourseList_Semester()
	 * @see ra.Semester#getSemesterCourses
	 * @model opposite="semesterCourses" required="true" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link ra.SemesterCourseList#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link ra.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see ra.RaPackage#getSemesterCourseList_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Course Lists</b></em>' reference list.
	 * The list contents are of type {@link ra.CourseList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Lists</em>' reference list.
	 * @see ra.RaPackage#getSemesterCourseList_CourseLists()
	 * @model
	 * @generated
	 */
	EList<CourseList> getCourseLists();

} // SemesterCourseList
