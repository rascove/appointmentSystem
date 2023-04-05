package uk.ac.shu.sp2292.sadp.sheffSurgeries

class NurseController
{
    def scaffold = Nurse

    def index()
    {
        if (session.user instanceof Receptionist)
        {
            [nurseList: Nurse.findAllBySurgery(session.user.surgery)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def show()
    {
        if (session.user instanceof Receptionist)
        {
            [nurse: Nurse.findByIdAndSurgery(params.id, session.user.surgery)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def create()
    {
        if (session.user instanceof Receptionist)
        {
            [nurse: new Nurse(), surgery: session.user.surgery]
        }
        else
        {
            response.sendError(404)
        }
    }

    def edit()
    {
        response.sendError(404)
    }

    def update()
    {
        response.sendError(404)
    }

    def delete()
    {
        response.sendError(404)
    }
}