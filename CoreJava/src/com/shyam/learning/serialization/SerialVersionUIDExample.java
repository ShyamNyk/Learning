package com.shyam.learning.serialization;

/*The serialization process at runtime associates an id with each Serializable class 
which is known as SerialVersionUID. It is used to verify the sender and receiver 
of the serialized object. The sender and receiver must be the same. To verify it, 
SerialVersionUID is used. The sender and receiver must have the same SerialVersionUID, 
otherwise, InvalidClassException will be thrown when you deserialize the object. 
We can also declare our own SerialVersionUID in the Serializable class. 
To do so, you need to create a field SerialVersionUID and assign a value to it. 
It must be of the long type with static and final. It is suggested to explicitly 
declare the serialVersionUID field in the class and have it private also. */

// Why so we use SerialVersionUID : SerialVersionUID is used to ensure that during 
// deserialization the same class (that was used during serialize process) is loaded.

public class SerialVersionUIDExample {
	
	private static final long serialVersionUID=1L;

}
