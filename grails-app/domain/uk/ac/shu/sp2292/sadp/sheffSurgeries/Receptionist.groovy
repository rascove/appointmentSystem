package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Receptionist
{
    String recepName, recepEmail, recepUsername, recepPassword, recepPhone

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
