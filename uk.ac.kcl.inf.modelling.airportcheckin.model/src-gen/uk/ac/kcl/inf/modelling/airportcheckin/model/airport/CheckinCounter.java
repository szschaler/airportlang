/**
 */
package uk.ac.kcl.inf.modelling.airportcheckin.model.airport;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Queues</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue}.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto <em>Feeds Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queues</em>' reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getCheckinCounter_Queues()
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.PassengerQueue#getFeedsInto
	 * @model opposite="feedsInto"
	 * @generated
	 */
	EList<PassengerQueue> getQueues();

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.airportcheckin.model.airport.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.airportcheckin.model.airport.AirportPackage#getCheckinCounter_Passenger()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<Passenger> getPassenger();

} // CheckinCounter
