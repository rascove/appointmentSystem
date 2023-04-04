package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Receptionist
{
    String recepName, recepEmail, recepUsername, recepPassword, recepPhone

	String toString()
	{
		return recepName
	}

    static mapping =
    {
        surgery(lazy: false)
    }

    static constraints =
    {
        recepName()
        recepEmail()
        recepUsername()
        recepPassword()
        recepPhone()
    }

    static hasOne = [surgery: Surgery]
}