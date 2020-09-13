/**
 */
package ra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ra.RaFactory
 * @model kind="package"
 * @generated
 */
public interface RaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform/resource/StudyPrograms/model/ra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RaPackage eINSTANCE = ra.impl.RaPackageImpl.init();

	/**
	 * The meta object id for the '{@link ra.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.DepartmentImpl
	 * @see ra.impl.RaPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMMES = 1;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.ProgrammeImpl
	 * @see ra.impl.RaPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Spesialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPESIALISATIONS = 3;

	/**
	 * The feature id for the '<em><b>Course Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__COURSE_LISTS = 4;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Programme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME___PROGRAMME__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ra.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.SpecialisationImpl
	 * @see ra.impl.RaPackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 2;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTERS = 0;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.CourseListImpl <em>Course List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.CourseListImpl
	 * @see ra.impl.RaPackageImpl#getCourseList()
	 * @generated
	 */
	int COURSE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LIST__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LIST__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Course List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.SemesterImpl
	 * @see ra.impl.RaPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__CREDITS = 1;

	/**
	 * The feature id for the '<em><b>Semester Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_COURSES = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.SemesterCourseListImpl <em>Semester Course List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.SemesterCourseListImpl
	 * @see ra.impl.RaPackageImpl#getSemesterCourseList()
	 * @generated
	 */
	int SEMESTER_COURSE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Obligatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_LIST__OBLIGATORY = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_LIST__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_LIST__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Course Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_LIST__COURSE_LISTS = 3;

	/**
	 * The number of structural features of the '<em>Semester Course List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_LIST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Semester Course List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ra.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ra.impl.CourseImpl
	 * @see ra.impl.RaPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ra.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see ra.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link ra.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ra.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Department#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see ra.Department#getProgrammes()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programmes();

	/**
	 * Returns the meta object for class '{@link ra.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see ra.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link ra.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ra.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link ra.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ra.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see ra.Programme#getSemesters()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Semesters();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Programme#getSpesialisations <em>Spesialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spesialisations</em>'.
	 * @see ra.Programme#getSpesialisations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Spesialisations();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Programme#getCourseLists <em>Course Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Lists</em>'.
	 * @see ra.Programme#getCourseLists()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_CourseLists();

	/**
	 * Returns the meta object for the '{@link ra.Programme#Programme(java.lang.String, java.lang.String) <em>Programme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Programme</em>' operation.
	 * @see ra.Programme#Programme(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getProgramme__Programme__String_String();

	/**
	 * Returns the meta object for class '{@link ra.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see ra.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the reference list '{@link ra.Specialisation#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semesters</em>'.
	 * @see ra.Specialisation#getSemesters()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Semesters();

	/**
	 * Returns the meta object for class '{@link ra.CourseList <em>Course List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course List</em>'.
	 * @see ra.CourseList
	 * @generated
	 */
	EClass getCourseList();

	/**
	 * Returns the meta object for the attribute '{@link ra.CourseList#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ra.CourseList#getLevel()
	 * @see #getCourseList()
	 * @generated
	 */
	EAttribute getCourseList_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.CourseList#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see ra.CourseList#getCourses()
	 * @see #getCourseList()
	 * @generated
	 */
	EReference getCourseList_Courses();

	/**
	 * Returns the meta object for class '{@link ra.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see ra.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link ra.Semester#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see ra.Semester#getNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Number();

	/**
	 * Returns the meta object for the attribute '{@link ra.Semester#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see ra.Semester#getCredits()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Credits();

	/**
	 * Returns the meta object for the containment reference list '{@link ra.Semester#getSemesterCourses <em>Semester Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester Courses</em>'.
	 * @see ra.Semester#getSemesterCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_SemesterCourses();

	/**
	 * Returns the meta object for class '{@link ra.SemesterCourseList <em>Semester Course List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Course List</em>'.
	 * @see ra.SemesterCourseList
	 * @generated
	 */
	EClass getSemesterCourseList();

	/**
	 * Returns the meta object for the attribute '{@link ra.SemesterCourseList#isObligatory <em>Obligatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obligatory</em>'.
	 * @see ra.SemesterCourseList#isObligatory()
	 * @see #getSemesterCourseList()
	 * @generated
	 */
	EAttribute getSemesterCourseList_Obligatory();

	/**
	 * Returns the meta object for the container reference '{@link ra.SemesterCourseList#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see ra.SemesterCourseList#getSemester()
	 * @see #getSemesterCourseList()
	 * @generated
	 */
	EReference getSemesterCourseList_Semester();

	/**
	 * Returns the meta object for the reference list '{@link ra.SemesterCourseList#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see ra.SemesterCourseList#getCourses()
	 * @see #getSemesterCourseList()
	 * @generated
	 */
	EReference getSemesterCourseList_Courses();

	/**
	 * Returns the meta object for the reference list '{@link ra.SemesterCourseList#getCourseLists <em>Course Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course Lists</em>'.
	 * @see ra.SemesterCourseList#getCourseLists()
	 * @see #getSemesterCourseList()
	 * @generated
	 */
	EReference getSemesterCourseList_CourseLists();

	/**
	 * Returns the meta object for class '{@link ra.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see ra.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link ra.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see ra.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link ra.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ra.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link ra.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see ra.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RaFactory getRaFactory();

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
		 * The meta object literal for the '{@link ra.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.DepartmentImpl
		 * @see ra.impl.RaPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMMES = eINSTANCE.getDepartment_Programmes();

		/**
		 * The meta object literal for the '{@link ra.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.ProgrammeImpl
		 * @see ra.impl.RaPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SEMESTERS = eINSTANCE.getProgramme_Semesters();

		/**
		 * The meta object literal for the '<em><b>Spesialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPESIALISATIONS = eINSTANCE.getProgramme_Spesialisations();

		/**
		 * The meta object literal for the '<em><b>Course Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__COURSE_LISTS = eINSTANCE.getProgramme_CourseLists();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMME___PROGRAMME__STRING_STRING = eINSTANCE.getProgramme__Programme__String_String();

		/**
		 * The meta object literal for the '{@link ra.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.SpecialisationImpl
		 * @see ra.impl.RaPackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTERS = eINSTANCE.getSpecialisation_Semesters();

		/**
		 * The meta object literal for the '{@link ra.impl.CourseListImpl <em>Course List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.CourseListImpl
		 * @see ra.impl.RaPackageImpl#getCourseList()
		 * @generated
		 */
		EClass COURSE_LIST = eINSTANCE.getCourseList();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_LIST__LEVEL = eINSTANCE.getCourseList_Level();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_LIST__COURSES = eINSTANCE.getCourseList_Courses();

		/**
		 * The meta object literal for the '{@link ra.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.SemesterImpl
		 * @see ra.impl.RaPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NUMBER = eINSTANCE.getSemester_Number();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__CREDITS = eINSTANCE.getSemester_Credits();

		/**
		 * The meta object literal for the '<em><b>Semester Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SEMESTER_COURSES = eINSTANCE.getSemester_SemesterCourses();

		/**
		 * The meta object literal for the '{@link ra.impl.SemesterCourseListImpl <em>Semester Course List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.SemesterCourseListImpl
		 * @see ra.impl.RaPackageImpl#getSemesterCourseList()
		 * @generated
		 */
		EClass SEMESTER_COURSE_LIST = eINSTANCE.getSemesterCourseList();

		/**
		 * The meta object literal for the '<em><b>Obligatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_COURSE_LIST__OBLIGATORY = eINSTANCE.getSemesterCourseList_Obligatory();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE_LIST__SEMESTER = eINSTANCE.getSemesterCourseList_Semester();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE_LIST__COURSES = eINSTANCE.getSemesterCourseList_Courses();

		/**
		 * The meta object literal for the '<em><b>Course Lists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE_LIST__COURSE_LISTS = eINSTANCE.getSemesterCourseList_CourseLists();

		/**
		 * The meta object literal for the '{@link ra.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ra.impl.CourseImpl
		 * @see ra.impl.RaPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

	}

} //RaPackage
