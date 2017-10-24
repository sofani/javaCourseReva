package jaxB;

import java.io.Serializable;
/*Marshalling – the process of converting an object instance into a data format that describes it.
 * 
 *  // Sending an instance
 *  all instances share behaviors and properties but not state
 *  state : is the combination of values stored in the instance variable of an object
 *  behaviors are defined by the class the state must be copied
 *  // Serialization 
 *  is converting an object's state into a stream of bytes to be rebuilt later
 *  Serialized objects must implement serializable
 * Marker interface: is an interface with no methods(serves marker for the jvm)
 * Transient variable will not be serialized
 *    //Marshaling continue
 * Serializing to bytes streams assums the receiver can translate the message
 *       // Data interchange formats are used to send data universally
 * XML : eXtensive markup language
 * JSON: javascript Object Notation
 * XML:
 * uses tags like html to wrap elements
 * xml can use any tags , because the tags are just descriptions for their content
 * XML has strict grammer
 * All tags must be closed and closed in inside out order
 * XML documents must have only one top level or root element
 * JSON:
 * Describe objects and state as a series of key-value paires
 * Keys are strings, values have Javascript types
 * Light Weight and becoming increasingly popular
 *     // JAX-B (java Architecture for Xml binding)
 * used to marshal objects into XML
 *  @XmlRootElement (sets the class  as a root XML node) 
 *  @XmlElement (Sets a property as an XML element)
 *  @XmlAccessorType(AccessorType.FIELD)
 *  (allows private type to be annotated)
 *  @XMLTransient
 *  The annotated will not be marshaled    
 * JAX-B does not yet support marshalling to JSON
 * */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Person implements Serializable {

    private String firstName;
    private String lastName;
   
    private String email;
    private transient String ssn;
    
	@XmlElement
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlTransient
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
    public String toString() {
    	return "First Name : " + this.firstName + "\n" +
    		    "Last Name : " + this.lastName + "\n" +
    			"Email: " + this.email + "\n" + 
    			"Social Security Number : " + this.ssn + "\n";
    }

}
