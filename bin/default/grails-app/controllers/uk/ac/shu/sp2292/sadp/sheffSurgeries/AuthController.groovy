package uk.ac.shu.sp2292.sadp.sheffSurgeries

class AuthController
{
    static defaultAction = "login"

    def login()
    {
        if (session.receptionist || session.doctor)
        {
            redirect(uri: "/")
        }
    }

    def validate()
    {
        def receptionist = Receptionist.findByRecepUsernameAndRecepPassword(params.username, params.password)

        if (receptionist)
        {
            session.receptionist = receptionist
            redirect(uri: "/")
        }
        else
        {
            def doctor = Doctor.findByDoctorEmailAndPassword(params.username, params.password)

            if (doctor)
            {
                session.doctor = doctor
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
        session.receptionist = null
        session.doctor = null
        
        session.invalidate()
        redirect(uri: '/')
    }
}