/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkin Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getQueues <em>Queues</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getPassenger <em>Passenger</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getCheckinCounter()
 * @model
 * @generated
 */
public interface CheckinCounter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getCheckinCounter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Queues</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto <em>Feeds Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queues</em>' reference.
	 * @see #setQueues(PassengerQueue)
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getCheckinCounter_Queues()
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto
	 * @model opposite="feedsInto" required="true"
	 * @generated
	 */
	PassengerQueue getQueues();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getQueues <em>Queues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queues</em>' reference.
	 * @see #getQueues()
	 * @generated
	 */
	void setQueues(PassengerQueue value);

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' containment reference.
	 * @see #setPassenger(Passenger)
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getCheckinCounter_Passenger()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	Passenger getPassenger();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.CheckinCounter#getPassenger <em>Passenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger</em>' containment reference.
	 * @see #getPassenger()
	 * @generated
	 */
	void setPassenger(Passenger value);

} // CheckinCounter
