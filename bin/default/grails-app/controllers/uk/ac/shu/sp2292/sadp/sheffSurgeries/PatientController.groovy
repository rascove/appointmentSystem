package uk.ac.shu.sp2292.sadp.sheffSurgeries

class PatientController
{
    def scaffold = Patient

    def results(String query)
    {
        query = '%' + query + '%'
        [patientList: Patient.findAllByNameIlikeOrPatientIdIlikeOrResidenceIlike(query, query, query)]
    }

    def index()
    {
        if (session.user instanceof Receptionist)
        {
            [patientList: Patient.findAllBySurgery(session.user.surgery)]
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
            [patient: Patient.findByIdAndSurgery(params.id, session.user.surgery)]
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
            [patient: new Patient(), surgery: session.user.surgery]
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