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
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerQueueImpl#getFeedsInto <em>Feeds Into</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerQueueImpl#getQueuedPassengers <em>Queued Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerQueueImpl extends MinimalEObjectImpl.Container implements PassengerQueue {
	/**
	 * The cached value of the '{@link #getFeedsInto() <em>Feeds Into</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedsInto()
	 * @generated
	 * @ordered
	 */
	protected CheckinCounter feedsInto;

	/**
	 * The cached value of the '{@link #getQueuedPassengers() <em>Queued Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuedPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> queuedPassengers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.PASSENGER_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckinCounter getFeedsInto() {
		if (feedsInto != null && feedsInto.eIsProxy()) {
			InternalEObject oldFeedsInto = (InternalEObject) feedsInto;
			feedsInto = (CheckinCounter) eResolveProxy(oldFeedsInto);
			if (feedsInto != oldFeedsInto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AirportPackage.PASSENGER_QUEUE__FEEDS_INTO, oldFeedsInto, feedsInto));
			}
		}
		return feedsInto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckinCounter basicGetFeedsInto() {
		return feedsInto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedsInto(CheckinCounter newFeedsInto, NotificationChain msgs) {
		CheckinCounter oldFeedsInto = feedsInto;
		feedsInto = newFeedsInto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AirportPackage.PASSENGER_QUEUE__FEEDS_INTO, oldFeedsInto, newFeedsInto);
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
	public void setFeedsInto(CheckinCounter newFeedsInto) {
		if (newFeedsInto != feedsInto) {
			NotificationChain msgs = null;
			if (feedsInto != null)
				msgs = ((InternalEObject) feedsInto).eInverseRemove(this, AirportPackage.CHECKIN_COUNTER__QUEUES,
						CheckinCounter.class, msgs);
			if (newFeedsInto != null)
				msgs = ((InternalEObject) newFeedsInto).eInverseAdd(this, AirportPackage.CHECKIN_COUNTER__QUEUES,
						CheckinCounter.class, msgs);
			msgs = basicSetFeedsInto(newFeedsInto, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.PASSENGER_QUEUE__FEEDS_INTO,
					newFeedsInto, newFeedsInto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Passenger> getQueuedPassengers() {
		if (queuedPassengers == null) {
			queuedPassengers = new EObjectContainmentEList<Passenger>(Passenger.class, this,
					AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS);
		}
		return queuedPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			if (feedsInto != null)
				msgs = ((InternalEObject) feedsInto).eInverseRemove(this, AirportPackage.CHECKIN_COUNTER__QUEUES,
						CheckinCounter.class, msgs);
			return basicSetFeedsInto((CheckinCounter) otherEnd, msgs);
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
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			return basicSetFeedsInto(null, msgs);
		case AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS:
			return ((InternalEList<?>) getQueuedPassengers()).basicRemove(otherEnd, msgs);
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
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			if (resolve)
				return getFeedsInto();
			return basicGetFeedsInto();
		case AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS:
			return getQueuedPassengers();
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
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			setFeedsInto((CheckinCounter) newValue);
			return;
		case AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS:
			getQueuedPassengers().clear();
			getQueuedPassengers().addAll((Collection<? extends Passenger>) newValue);
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
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			setFeedsInto((CheckinCounter) null);
			return;
		case AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS:
			getQueuedPassengers().clear();
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
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			return feedsInto != null;
		case AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS:
			return queuedPassengers != null && !queuedPassengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PassengerQueueImpl
