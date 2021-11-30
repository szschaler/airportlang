/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportFactory
 * @model kind="package"
 * @generated
 */
public interface AirportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "airport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/airport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "airport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirportPackage eINSTANCE = uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl <em>Airport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getAirport()
	 * @generated
	 */
	int AIRPORT = 0;

	/**
	 * The feature id for the '<em><b>Queues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__QUEUES = 0;

	/**
	 * The feature id for the '<em><b>Counters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__COUNTERS = 1;

	/**
	 * The feature id for the '<em><b>Floating Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__FLOATING_PASSENGERS = 2;

	/**
	 * The number of structural features of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerQueueImpl <em>Passenger Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerQueueImpl
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getPassengerQueue()
	 * @generated
	 */
	int PASSENGER_QUEUE = 1;

	/**
	 * The feature id for the '<em><b>Feeds Into</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_QUEUE__FEEDS_INTO = 0;

	/**
	 * The feature id for the '<em><b>Queued Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_QUEUE__QUEUED_PASSENGERS = 1;

	/**
	 * The number of structural features of the '<em>Passenger Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_QUEUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Passenger Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_QUEUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl <em>Checkin Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getCheckinCounter()
	 * @generated
	 */
	int CHECKIN_COUNTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKIN_COUNTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Queues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKIN_COUNTER__QUEUES = 1;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKIN_COUNTER__PASSENGER = 2;

	/**
	 * The number of structural features of the '<em>Checkin Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKIN_COUNTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Checkin Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKIN_COUNTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerImpl
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 3;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airport</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport
	 * @generated
	 */
	EClass getAirport();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queues</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getQueues()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_Queues();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getCounters <em>Counters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Counters</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getCounters()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_Counters();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getFloatingPassengers <em>Floating Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floating Passengers</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getFloatingPassengers()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_FloatingPassengers();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue <em>Passenger Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Queue</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue
	 * @generated
	 */
	EClass getPassengerQueue();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto <em>Feeds Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feeds Into</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto()
	 * @see #getPassengerQueue()
	 * @generated
	 */
	EReference getPassengerQueue_FeedsInto();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getQueuedPassengers <em>Queued Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queued Passengers</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getQueuedPassengers()
	 * @see #getPassengerQueue()
	 * @generated
	 */
	EReference getPassengerQueue_QueuedPassengers();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter <em>Checkin Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkin Counter</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter
	 * @generated
	 */
	EClass getCheckinCounter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getName()
	 * @see #getCheckinCounter()
	 * @generated
	 */
	EAttribute getCheckinCounter_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queues</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getQueues()
	 * @see #getCheckinCounter()
	 * @generated
	 */
	EReference getCheckinCounter_Queues();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getPassenger()
	 * @see #getCheckinCounter()
	 * @generated
	 */
	EReference getCheckinCounter_Passenger();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AirportFactory getAirportFactory();

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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl <em>Airport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportImpl
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getAirport()
		 * @generated
		 */
		EClass AIRPORT = eINSTANCE.getAirport();

		/**
		 * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__QUEUES = eINSTANCE.getAirport_Queues();

		/**
		 * The meta object literal for the '<em><b>Counters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__COUNTERS = eINSTANCE.getAirport_Counters();

		/**
		 * The meta object literal for the '<em><b>Floating Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__FLOATING_PASSENGERS = eINSTANCE.getAirport_FloatingPassengers();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerQueueImpl <em>Passenger Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerQueueImpl
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getPassengerQueue()
		 * @generated
		 */
		EClass PASSENGER_QUEUE = eINSTANCE.getPassengerQueue();

		/**
		 * The meta object literal for the '<em><b>Feeds Into</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_QUEUE__FEEDS_INTO = eINSTANCE.getPassengerQueue_FeedsInto();

		/**
		 * The meta object literal for the '<em><b>Queued Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_QUEUE__QUEUED_PASSENGERS = eINSTANCE.getPassengerQueue_QueuedPassengers();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl <em>Checkin Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.CheckinCounterImpl
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getCheckinCounter()
		 * @generated
		 */
		EClass CHECKIN_COUNTER = eINSTANCE.getCheckinCounter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKIN_COUNTER__NAME = eINSTANCE.getCheckinCounter_Name();

		/**
		 * The meta object literal for the '<em><b>Queues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKIN_COUNTER__QUEUES = eINSTANCE.getCheckinCounter_Queues();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKIN_COUNTER__PASSENGER = eINSTANCE.getCheckinCounter_Passenger();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.PassengerImpl
		 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportPackageImpl#getPassenger()
		 * @generated
		 */
		EClass PASSENGER = eINSTANCE.getPassenger();

	}

} //AirportPackage
