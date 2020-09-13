/**
 */
package ra.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ra.CourseList;
import ra.Programme;
import ra.RaPackage;
import ra.Semester;
import ra.Specialisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ra.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ra.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ra.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link ra.impl.ProgrammeImpl#getSpesialisations <em>Spesialisations</em>}</li>
 *   <li>{@link ra.impl.ProgrammeImpl#getCourseLists <em>Course Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getSpesialisations() <em>Spesialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpesialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> spesialisations;

	/**
	 * The cached value of the '{@link #getCourseLists() <em>Course Lists</em>}' containment reference list.
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
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, RaPackage.PROGRAMME__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpesialisations() {
		if (spesialisations == null) {
			spesialisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, RaPackage.PROGRAMME__SPESIALISATIONS);
		}
		return spesialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseList> getCourseLists() {
		if (courseLists == null) {
			courseLists = new EObjectContainmentEList<CourseList>(CourseList.class, this, RaPackage.PROGRAMME__COURSE_LISTS);
		}
		return courseLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void Programme(String Name, String Code) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case RaPackage.PROGRAMME__SPESIALISATIONS:
				return ((InternalEList<?>)getSpesialisations()).basicRemove(otherEnd, msgs);
			case RaPackage.PROGRAMME__COURSE_LISTS:
				return ((InternalEList<?>)getCourseLists()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaPackage.PROGRAMME__NAME:
				return getName();
			case RaPackage.PROGRAMME__CODE:
				return getCode();
			case RaPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case RaPackage.PROGRAMME__SPESIALISATIONS:
				return getSpesialisations();
			case RaPackage.PROGRAMME__COURSE_LISTS:
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
			case RaPackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case RaPackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case RaPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case RaPackage.PROGRAMME__SPESIALISATIONS:
				getSpesialisations().clear();
				getSpesialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case RaPackage.PROGRAMME__COURSE_LISTS:
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
			case RaPackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RaPackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case RaPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case RaPackage.PROGRAMME__SPESIALISATIONS:
				getSpesialisations().clear();
				return;
			case RaPackage.PROGRAMME__COURSE_LISTS:
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
			case RaPackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RaPackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case RaPackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case RaPackage.PROGRAMME__SPESIALISATIONS:
				return spesialisations != null && !spesialisations.isEmpty();
			case RaPackage.PROGRAMME__COURSE_LISTS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RaPackage.PROGRAMME___PROGRAMME__STRING_STRING:
				Programme((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
