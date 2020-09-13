/**
 */
package ra.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ra.Course;
import ra.CourseList;
import ra.Department;
import ra.Programme;
import ra.RaFactory;
import ra.RaPackage;
import ra.Semester;
import ra.SemesterCourseList;
import ra.Specialisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RaPackageImpl extends EPackageImpl implements RaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterCourseListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

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
	 * @see ra.RaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RaPackageImpl() {
		super(eNS_URI, RaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RaPackage init() {
		if (isInited) return (RaPackage)EPackage.Registry.INSTANCE.getEPackage(RaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RaPackageImpl theRaPackage = registeredRaPackage instanceof RaPackageImpl ? (RaPackageImpl)registeredRaPackage : new RaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRaPackage.createPackageContents();

		// Initialize created meta-data
		theRaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RaPackage.eNS_URI, theRaPackage);
		return theRaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Programmes() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Name() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgramme_Code() {
		return (EAttribute)programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Semesters() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_Spesialisations() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgramme_CourseLists() {
		return (EReference)programmeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProgramme__Programme__String_String() {
		return programmeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialisation() {
		return specialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialisation_Semesters() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseList() {
		return courseListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseList_Level() {
		return (EAttribute)courseListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseList_Courses() {
		return (EReference)courseListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_Number() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_Credits() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemester_SemesterCourses() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemesterCourseList() {
		return semesterCourseListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemesterCourseList_Obligatory() {
		return (EAttribute)semesterCourseListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemesterCourseList_Semester() {
		return (EReference)semesterCourseListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemesterCourseList_Courses() {
		return (EReference)semesterCourseListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSemesterCourseList_CourseLists() {
		return (EReference)semesterCourseListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaFactory getRaFactory() {
		return (RaFactory)getEFactoryInstance();
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
		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEReference(departmentEClass, DEPARTMENT__PROGRAMMES);

		programmeEClass = createEClass(PROGRAMME);
		createEAttribute(programmeEClass, PROGRAMME__NAME);
		createEAttribute(programmeEClass, PROGRAMME__CODE);
		createEReference(programmeEClass, PROGRAMME__SEMESTERS);
		createEReference(programmeEClass, PROGRAMME__SPESIALISATIONS);
		createEReference(programmeEClass, PROGRAMME__COURSE_LISTS);
		createEOperation(programmeEClass, PROGRAMME___PROGRAMME__STRING_STRING);

		specialisationEClass = createEClass(SPECIALISATION);
		createEReference(specialisationEClass, SPECIALISATION__SEMESTERS);

		courseListEClass = createEClass(COURSE_LIST);
		createEAttribute(courseListEClass, COURSE_LIST__LEVEL);
		createEReference(courseListEClass, COURSE_LIST__COURSES);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__NUMBER);
		createEAttribute(semesterEClass, SEMESTER__CREDITS);
		createEReference(semesterEClass, SEMESTER__SEMESTER_COURSES);

		semesterCourseListEClass = createEClass(SEMESTER_COURSE_LIST);
		createEAttribute(semesterCourseListEClass, SEMESTER_COURSE_LIST__OBLIGATORY);
		createEReference(semesterCourseListEClass, SEMESTER_COURSE_LIST__SEMESTER);
		createEReference(semesterCourseListEClass, SEMESTER_COURSE_LIST__COURSES);
		createEReference(semesterCourseListEClass, SEMESTER_COURSE_LIST__COURSE_LISTS);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CREDITS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Programmes(), this.getProgramme(), null, "programmes", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramme_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramme_Code(), ecorePackage.getEString(), "code", null, 0, 1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Semesters(), this.getSemester(), null, "semesters", null, 4, 8, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Spesialisations(), this.getSpecialisation(), null, "spesialisations", null, 4, 8, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_CourseLists(), this.getCourseList(), null, "courseLists", null, 0, -1, Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProgramme__Programme__String_String(), null, "Programme", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Name", 0, 1, !IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Code", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(specialisationEClass, Specialisation.class, "Specialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialisation_Semesters(), this.getSemester(), null, "semesters", null, 2, 6, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseListEClass, CourseList.class, "CourseList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseList_Level(), ecorePackage.getEInt(), "level", null, 0, 1, CourseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseList_Courses(), this.getCourse(), null, "courses", null, 1, -1, CourseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_Credits(), ecorePackage.getEInt(), "credits", "30", 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_SemesterCourses(), this.getSemesterCourseList(), this.getSemesterCourseList_Semester(), "semesterCourses", null, 1, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterCourseListEClass, SemesterCourseList.class, "SemesterCourseList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemesterCourseList_Obligatory(), ecorePackage.getEBoolean(), "Obligatory", null, 0, 1, SemesterCourseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterCourseList_Semester(), this.getSemester(), this.getSemester_SemesterCourses(), "semester", null, 1, 1, SemesterCourseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterCourseList_Courses(), this.getCourse(), null, "courses", null, 0, -1, SemesterCourseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemesterCourseList_CourseLists(), this.getCourseList(), null, "courseLists", null, 0, -1, SemesterCourseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), ecorePackage.getEDouble(), "credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RaPackageImpl
