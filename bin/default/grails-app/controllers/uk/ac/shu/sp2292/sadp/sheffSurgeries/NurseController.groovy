package uk.ac.shu.sp2292.sadp.sheffSurgeries

class NurseController
{
    def scaffold = Nurse

    def index()
    {
        if (session.receptionist)
        {
            [nurseList: Nurse.findAllBySurgery(session.receptionist.surgery)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def show()
    {
        if (session.receptionist)
        {
            [nurse: Nurse.findByIdAndSurgery(params.id, session.receptionist.surgery)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def create()
    {
        if (session.receptionist)
        {
            [nurse: new Nurse(), surgery: session.receptionist.surgery]
        }
        else
        {
            response.sendError(401)
        }
    }

    def edit()
    {
        response.sendError(401)
    }

    def update()
    {
        response.sendError(401)
    }

    def delete()
    {
        response.sendError(401)
    }
}