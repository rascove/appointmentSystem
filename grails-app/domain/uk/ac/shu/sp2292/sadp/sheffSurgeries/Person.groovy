package uk.ac.shu.sp2292.sadp.sheffSurgeries

abstract class Person
{
    String name, phone

	String toString()
	{
		return name
	}

    static mapping =
    {
        tablePerHierarchy(false)
    }

    static constraints =
    {
        name()
        phone()
    }
}