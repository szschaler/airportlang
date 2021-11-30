/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage
 * @generated
 */
public interface AirportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirportFactory eINSTANCE = uk.ac.kcl.inf.modelling.airportcheckin.model.airport.impl.AirportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Airport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Airport</em>'.
	 * @generated
	 */
	Airport createAirport();

	/**
	 * Returns a new object of class '<em>Passenger Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Queue</em>'.
	 * @generated
	 */
	PassengerQueue createPassengerQueue();

	/**
	 * Returns a new object of class '<em>Checkin Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkin Counter</em>'.
	 * @generated
	 */
	CheckinCounter createCheckinCounter();

	/**
	 * Returns a new object of class '<em>Passenger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger</em>'.
	 * @generated
	 */
	Passenger createPassenger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AirportPackage getAirportPackage();

} //AirportFactory
