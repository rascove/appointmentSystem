package uk.ac.shu.sp2292.sadp.sheffSurgeries

class AuthController
{
    static defaultAction = "login"

    def login()
    {
        if (session.user)
        {
            redirect(uri: "/")
        }
    }

    def validate()
    {
        def receptionist = Receptionist.findByUsernameAndPassword(params.username, params.password)

        if (receptionist)
        {
            session.user = receptionist
            redirect(uri: "/")
        }
        else
        {
            def doctor = Doctor.findByEmailAndPassword(params.username, params.password)

            if (doctor)
            {
                session.user = doctor
                redirect(uri: "/")
            }
            else
            {
                flash.message = "Invalid username and password."
                render view: 'login'
            }
        }
    }

    def logout =
    {
        session.user = null
        
        session.invalidate()
        redirect(uri: '/')
    }
}