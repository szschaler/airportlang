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
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger;
import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl#getQueues <em>Queues</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl#getCounters <em>Counters</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl#getFloatingPassengers <em>Floating Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirportImpl extends MinimalEObjectImpl.Container implements Airport {
	/**
	 * The cached value of the '{@link #getQueues() <em>Queues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueues()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerQueue> queues;

	/**
	 * The cached value of the '{@link #getCounters() <em>Counters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounters()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckinCounter> counters;

	/**
	 * The cached value of the '{@link #getFloatingPassengers() <em>Floating Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> floatingPassengers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportPackage.Literals.AIRPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassengerQueue> getQueues() {
		if (queues == null) {
			queues = new EObjectContainmentEList<PassengerQueue>(PassengerQueue.class, this,
					AirportPackage.AIRPORT__QUEUES);
		}
		return queues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CheckinCounter> getCounters() {
		if (counters == null) {
			counters = new EObjectContainmentEList<CheckinCounter>(CheckinCounter.class, this,
					AirportPackage.AIRPORT__COUNTERS);
		}
		return counters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Passenger> getFloatingPassengers() {
		if (floatingPassengers == null) {
			floatingPassengers = new EObjectContainmentEList<Passenger>(Passenger.class, this,
					AirportPackage.AIRPORT__FLOATING_PASSENGERS);
		}
		return floatingPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AirportPackage.AIRPORT__QUEUES:
			return ((InternalEList<?>) getQueues()).basicRemove(otherEnd, msgs);
		case AirportPackage.AIRPORT__COUNTERS:
			return ((InternalEList<?>) getCounters()).basicRemove(otherEnd, msgs);
		case AirportPackage.AIRPORT__FLOATING_PASSENGERS:
			return ((InternalEList<?>) getFloatingPassengers()).basicRemove(otherEnd, msgs);
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
		case AirportPackage.AIRPORT__QUEUES:
			return getQueues();
		case AirportPackage.AIRPORT__COUNTERS:
			return getCounters();
		case AirportPackage.AIRPORT__FLOATING_PASSENGERS:
			return getFloatingPassengers();
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
		case AirportPackage.AIRPORT__QUEUES:
			getQueues().clear();
			getQueues().addAll((Collection<? extends PassengerQueue>) newValue);
			return;
		case AirportPackage.AIRPORT__COUNTERS:
			getCounters().clear();
			getCounters().addAll((Collection<? extends CheckinCounter>) newValue);
			return;
		case AirportPackage.AIRPORT__FLOATING_PASSENGERS:
			getFloatingPassengers().clear();
			getFloatingPassengers().addAll((Collection<? extends Passenger>) newValue);
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
		case AirportPackage.AIRPORT__QUEUES:
			getQueues().clear();
			return;
		case AirportPackage.AIRPORT__COUNTERS:
			getCounters().clear();
			return;
		case AirportPackage.AIRPORT__FLOATING_PASSENGERS:
			getFloatingPassengers().clear();
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
		case AirportPackage.AIRPORT__QUEUES:
			return queues != null && !queues.isEmpty();
		case AirportPackage.AIRPORT__COUNTERS:
			return counters != null && !counters.isEmpty();
		case AirportPackage.AIRPORT__FLOATING_PASSENGERS:
			return floatingPassengers != null && !floatingPassengers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AirportImpl
