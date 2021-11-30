/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The cached value of the '{@link #getFeedsInto() <em>Feeds Into</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedsInto()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckinCounter> feedsInto;

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
	public EList<CheckinCounter> getFeedsInto() {
		if (feedsInto == null) {
			feedsInto = new EObjectWithInverseResolvingEList<CheckinCounter>(CheckinCounter.class, this,
					AirportPackage.PASSENGER_QUEUE__FEEDS_INTO, AirportPackage.CHECKIN_COUNTER__QUEUES);
		}
		return feedsInto;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AirportPackage.PASSENGER_QUEUE__FEEDS_INTO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFeedsInto()).basicAdd(otherEnd, msgs);
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
			return ((InternalEList<?>) getFeedsInto()).basicRemove(otherEnd, msgs);
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
			return getFeedsInto();
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
			getFeedsInto().clear();
			getFeedsInto().addAll((Collection<? extends CheckinCounter>) newValue);
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
			getFeedsInto().clear();
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
			return feedsInto != null && !feedsInto.isEmpty();
		case AirportPackage.PASSENGER_QUEUE__QUEUED_PASSENGERS:
			return queuedPassengers != null && !queuedPassengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PassengerQueueImpl
