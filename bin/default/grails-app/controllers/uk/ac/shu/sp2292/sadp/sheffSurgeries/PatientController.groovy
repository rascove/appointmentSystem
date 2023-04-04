package uk.ac.shu.sp2292.sadp.sheffSurgeries

class PatientController
{
    def scaffold = Patient

    def results(String query)
    {
        query = '%' + query + '%'
        [patientList: Patient.findAllByPatientNameIlikeOrPatientIdIlikeOrPatientResidenceIlike(query, query, query)]
    }

    def index()
    {
        if (session.receptionist)
        {
            [patientList: Patient.findAllBySurgery(session.receptionist.surgery)]
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
            [patient: Patient.findByIdAndSurgery(params.id, session.receptionist.surgery)]
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
            [patient: new Patient(), surgery: session.receptionist.surgery]
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