// Default access modifier in Java is package-private

// Float vs double
	// Float
		// Occupies 4 byte
		// 6 bits of precision
		// float weight = 70.645f;
	// Double
		// Occupies 8 byte
		// 9 bits of precision
		// double weight = 70.645d;

// HashMap and HashTable
	// HashMap and Hashtable classes store key and value pairs in a hash table.
	// After storing a key-value pair:
		// The key is hashed and the resulting hash code is used as the index at which the value is stored
		// Due to generics, the value can be of any form
	// HashMap
		// Not thread safe (fast performance)
		// Allows null key and null value

// LinkedHashMap
	// LinkedHashMap Class = HashMap + elements can be accessed in their insertion order
	// Implements Map interface and extends HashMap class
		// public class LinkedHashMap<K,​V> extends HashMap<K,​V> implements Map<K,​V>
	// Contains only unique elements
	// May have one null key and multiple null values
	// Not thread safe
	// Implementation of the LinkedHashMap is very similar to a doubly-linked list
	// Each node of the LinkedHashMap is represented as:
		// Before || Key || Value || After
			// Next: As LinkedHashMap stores the insertion order, it contains the address to the next node of the LinkedHashMap
			// Before: This parameter contains the address to the previous node of the LinkedHashMap

// Types of Inheritance
	// Single Inheritance
		// Child extends Parent
	// Multi level inheritance
		// Parent extends Grand Parent, Child extends Parent
	// Hierarchical Inheritance
		// Multiple child extend single Parent
	// Hybrid Inheritance
		// Mixing all of the above

// Final, Finally, Finalize
	// final
		// final is an access modifier
		// A variable declared final, can't be modified
	// finally
		// finally is the block in Exception Handling
		// try-catch-finally
		// finally block always gets executed after try-catch block
	// finalize
		// Method of the Object class that is used to perform cleanup activity before destroying any object
		// It is called by Garbage collector before destroying the objects from memory
		// Called by default for every object before its deletion

// Static Binding vs. Dynamic Binding
	// Static Binding
		// When the type of object is determined at compile time
		// Private, final and static methods and variables are determined by static binding
		// Overloaded methods are resolved (deciding which method to be called when there are multiple methods with the same name) using static binding
	// Dynamic Binding
		// When the type of object is determined at run time
		// Virtual methods (In Java methods are virtual by default) are determined by dynamic binding
		// Overridden methods are resolved (deciding which method to be called when same method is implemented in child, parent class) using dynamic binding

// throw vs throws
	// throws
		// public static void writeToFile() throws Exception
	// throw
		/*
        	try
        	{
            	throw new NullPointerException("demo");
        	}
        	catch(NullPointerException e)
        	{
            	System.out.println("Caught inside fun().");
            	throw e; // rethrowing the exception
        	} 
 		*/


		