/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.modelling.airportcheckin.model.airport.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirportFactoryImpl extends EFactoryImpl implements AirportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AirportFactory init() {
		try {
			AirportFactory theAirportFactory = (AirportFactory) EPackage.Registry.INSTANCE
					.getEFactory(AirportPackage.eNS_URI);
			if (theAirportFactory != null) {
				return theAirportFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AirportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AirportPackage.AIRPORT:
			return createAirport();
		case AirportPackage.PASSENGER_QUEUE:
			return createPassengerQueue();
		case AirportPackage.CHECKIN_COUNTER:
			return createCheckinCounter();
		case AirportPackage.PASSENGER:
			return createPassenger();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Airport createAirport() {
		AirportImpl airport = new AirportImpl();
		return airport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerQueue createPassengerQueue() {
		PassengerQueueImpl passengerQueue = new PassengerQueueImpl();
		return passengerQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckinCounter createCheckinCounter() {
		CheckinCounterImpl checkinCounter = new CheckinCounterImpl();
		return checkinCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Passenger createPassenger() {
		PassengerImpl passenger = new PassengerImpl();
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportPackage getAirportPackage() {
		return (AirportPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AirportPackage getPackage() {
		return AirportPackage.eINSTANCE;
	}

} //AirportFactoryImpl
