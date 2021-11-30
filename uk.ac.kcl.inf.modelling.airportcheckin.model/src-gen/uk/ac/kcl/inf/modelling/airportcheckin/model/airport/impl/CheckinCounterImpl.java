/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
	 * The cached value of the '{@link #getQueues() <em>Queues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueues()
	 * @generated
	 * @ordered
	 */
	protected PassengerQueue queues;

	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected Passenger passenger;

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
	public PassengerQueue getQueues() {
		if (queues != null && queues.eIsProxy()) {
			InternalEObject oldQueues = (InternalEObject) queues;
			queues = (PassengerQueue) eResolveProxy(oldQueues);
			if (queues != oldQueues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirportPackage.CHECKIN_COUNTER__QUEUES,
							oldQueues, queues));
			}
		}
		return queues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerQueue basicGetQueues() {
		return queues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueues(PassengerQueue newQueues, NotificationChain msgs) {
		PassengerQueue oldQueues = queues;
		queues = newQueues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AirportPackage.CHECKIN_COUNTER__QUEUES, oldQueues, newQueues);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueues(PassengerQueue newQueues) {
		if (newQueues != queues) {
			NotificationChain msgs = null;
			if (queues != null)
				msgs = ((InternalEObject) queues).eInverseRemove(this, AirportPackage.PASSENGER_QUEUE__FEEDS_INTO,
						PassengerQueue.class, msgs);
			if (newQueues != null)
				msgs = ((InternalEObject) newQueues).eInverseAdd(this, AirportPackage.PASSENGER_QUEUE__FEEDS_INTO,
						PassengerQueue.class, msgs);
			msgs = basicSetQueues(newQueues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.CHECKIN_COUNTER__QUEUES, newQueues,
					newQueues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassenger(Passenger newPassenger, NotificationChain msgs) {
		Passenger oldPassenger = passenger;
		passenger = newPassenger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AirportPackage.CHECKIN_COUNTER__PASSENGER, oldPassenger, newPassenger);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassenger(Passenger newPassenger) {
		if (newPassenger != passenger) {
			NotificationChain msgs = null;
			if (passenger != null)
				msgs = ((InternalEObject) passenger).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AirportPackage.CHECKIN_COUNTER__PASSENGER, null, msgs);
			if (newPassenger != null)
				msgs = ((InternalEObject) newPassenger).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AirportPackage.CHECKIN_COUNTER__PASSENGER, null, msgs);
			msgs = basicSetPassenger(newPassenger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.CHECKIN_COUNTER__PASSENGER,
					newPassenger, newPassenger));
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
			if (queues != null)
				msgs = ((InternalEObject) queues).eInverseRemove(this, AirportPackage.PASSENGER_QUEUE__FEEDS_INTO,
						PassengerQueue.class, msgs);
			return basicSetQueues((PassengerQueue) otherEnd, msgs);
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
			return basicSetQueues(null, msgs);
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			return basicSetPassenger(null, msgs);
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
			if (resolve)
				return getQueues();
			return basicGetQueues();
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
			setQueues((PassengerQueue) newValue);
			return;
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			setPassenger((Passenger) newValue);
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
			setQueues((PassengerQueue) null);
			return;
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			setPassenger((Passenger) null);
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
			return queues != null;
		case AirportPackage.CHECKIN_COUNTER__PASSENGER:
			return passenger != null;
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
