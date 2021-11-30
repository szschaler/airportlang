/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getQueues <em>Queues</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getCounters <em>Counters</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Airport#getFloatingPassengers <em>Floating Passengers</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getAirport()
 * @model
 * @generated
 */
public interface Airport extends EObject {
	/**
	 * Returns the value of the '<em><b>Queues</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queues</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getAirport_Queues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassengerQueue> getQueues();

	/**
	 * Returns the value of the '<em><b>Counters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counters</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getAirport_Counters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckinCounter> getCounters();

	/**
	 * Returns the value of the '<em><b>Floating Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Passengers</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getAirport_FloatingPassengers()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<Passenger> getFloatingPassengers();

} // Airport
