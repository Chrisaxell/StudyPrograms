/**
 */
package ra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ra.Course;
import ra.CourseList;
import ra.RaPackage;
import ra.Semester;
import ra.SemesterCourseList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Course List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.SemesterCourseListImpl#isObligatory <em>Obligatory</em>}</li>
 *   <li>{@link ra.impl.SemesterCourseListImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link ra.impl.SemesterCourseListImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link ra.impl.SemesterCourseListImpl#getCourseLists <em>Course Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterCourseListImpl extends MinimalEObjectImpl.Container implements SemesterCourseList {
	/**
	 * The default value of the '{@link #isObligatory() <em>Obligatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObligatory() <em>Obligatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatory()
	 * @generated
	 * @ordered
	 */
	protected boolean obligatory = OBLIGATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getCourseLists() <em>Course Lists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseLists()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseList> courseLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.SEMESTER_COURSE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObligatory() {
		return obligatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObligatory(boolean newObligatory) {
		boolean oldObligatory = obligatory;
		obligatory = newObligatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.SEMESTER_COURSE_LIST__OBLIGATORY, oldObligatory, obligatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		if (eContainerFeatureID() != RaPackage.SEMESTER_COURSE_LIST__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, RaPackage.SEMESTER_COURSE_LIST__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != RaPackage.SEMESTER_COURSE_LIST__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, RaPackage.SEMESTER__SEMESTER_COURSES, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.SEMESTER_COURSE_LIST__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, RaPackage.SEMESTER_COURSE_LIST__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseList> getCourseLists() {
		if (courseLists == null) {
			courseLists = new EObjectResolvingEList<CourseList>(CourseList.class, this, RaPackage.SEMESTER_COURSE_LIST__COURSE_LISTS);
		}
		return courseLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				return basicSetSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				return eInternalContainer().eInverseRemove(this, RaPackage.SEMESTER__SEMESTER_COURSES, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaPackage.SEMESTER_COURSE_LIST__OBLIGATORY:
				return isObligatory();
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				return getSemester();
			case RaPackage.SEMESTER_COURSE_LIST__COURSES:
				return getCourses();
			case RaPackage.SEMESTER_COURSE_LIST__COURSE_LISTS:
				return getCourseLists();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaPackage.SEMESTER_COURSE_LIST__OBLIGATORY:
				setObligatory((Boolean)newValue);
				return;
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case RaPackage.SEMESTER_COURSE_LIST__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case RaPackage.SEMESTER_COURSE_LIST__COURSE_LISTS:
				getCourseLists().clear();
				getCourseLists().addAll((Collection<? extends CourseList>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RaPackage.SEMESTER_COURSE_LIST__OBLIGATORY:
				setObligatory(OBLIGATORY_EDEFAULT);
				return;
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				setSemester((Semester)null);
				return;
			case RaPackage.SEMESTER_COURSE_LIST__COURSES:
				getCourses().clear();
				return;
			case RaPackage.SEMESTER_COURSE_LIST__COURSE_LISTS:
				getCourseLists().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RaPackage.SEMESTER_COURSE_LIST__OBLIGATORY:
				return obligatory != OBLIGATORY_EDEFAULT;
			case RaPackage.SEMESTER_COURSE_LIST__SEMESTER:
				return getSemester() != null;
			case RaPackage.SEMESTER_COURSE_LIST__COURSES:
				return courses != null && !courses.isEmpty();
			case RaPackage.SEMESTER_COURSE_LIST__COURSE_LISTS:
				return courseLists != null && !courseLists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Obligatory: ");
		result.append(obligatory);
		result.append(')');
		return result.toString();
	}

} //SemesterCourseListImpl
