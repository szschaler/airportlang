/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto <em>Feeds Into</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getQueuedPassengers <em>Queued Passengers</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getPassengerQueue()
 * @model
 * @generated
 */
public interface PassengerQueue extends EObject {
	/**
	 * Returns the value of the '<em><b>Feeds Into</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter}.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feeds Into</em>' reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getPassengerQueue_FeedsInto()
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getQueues
	 * @model opposite="queues" required="true"
	 * @generated
	 */
	EList<CheckinCounter> getFeedsInto();

	/**
	 * Returns the value of the '<em><b>Queued Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queued Passengers</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getPassengerQueue_QueuedPassengers()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<Passenger> getQueuedPassengers();

} // PassengerQueue
