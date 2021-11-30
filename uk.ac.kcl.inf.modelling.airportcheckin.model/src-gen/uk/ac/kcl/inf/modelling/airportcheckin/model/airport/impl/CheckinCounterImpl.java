/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkin Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl#getQueues <em>Queues</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl#getPassenger <em>Passenger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckinCounterImpl extends MinimalEObjectImpl.Container implements CheckinCounter {
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
	 * The cached value of the '{@link #getQueues() <em>Queues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueues()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerQueue> queues;

	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passenger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckinCounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.CHECKIN_COUNTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.CHECKIN_COUNTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassengerQueue> getQueues() {
		if (queues == null) {
			queues = new EObjectWithInverseResolvingEList<PassengerQueue>(PassengerQueue.class, this,
					AirportPackage.CHECKIN_COUNTER__QUEUES, AirportPackage.PASSENGER_QUEUE__FEEDS_INTO);
		}
		return queues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Passenger> getPassenger() {
		if (passenger == null) {
			passenger = new EObjectContainmentEList<Passenger>(Passenger.class, this,
					AirportPackage.CHECKIN_COUNTER__PASSENGER);
		}
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AirportPackage.CHECKIN_COUNTER__QUEUES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQueues()).basicAdd(otherEnd, msgs);
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
		case AirportPackage.CHECKIN_COUNTER__QUEUES:
			return ((InternalEList<?>) getQueues()).basicRemove(otherEnd, msgs);
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			return ((InternalEList<?>) getPassenger()).basicRemove(otherEnd, msgs);
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
		case AirportPackage.CHECKIN_COUNTER__NAME:
			return getName();
		case AirportPackage.CHECKIN_COUNTER__QUEUES:
			return getQueues();
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			return getPassenger();
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
		case AirportPackage.CHECKIN_COUNTER__NAME:
			setName((String) newValue);
			return;
		case AirportPackage.CHECKIN_COUNTER__QUEUES:
			getQueues().clear();
			getQueues().addAll((Collection<? extends PassengerQueue>) newValue);
			return;
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			getPassenger().clear();
			getPassenger().addAll((Collection<? extends Passenger>) newValue);
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
		case AirportPackage.CHECKIN_COUNTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AirportPackage.CHECKIN_COUNTER__QUEUES:
			getQueues().clear();
			return;
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			getPassenger().clear();
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
		case AirportPackage.CHECKIN_COUNTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AirportPackage.CHECKIN_COUNTER__QUEUES:
			return queues != null && !queues.isEmpty();
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			return passenger != null && !passenger.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CheckinCounterImpl
