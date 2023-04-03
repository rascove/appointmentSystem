package uk.ac.shu.sp2292.sadp.sheffSurgeries

class PatientController
{
    def scaffold = Patient

    def results(String query)
    {
        query = '%' + query + '%'
        [patientList: Patient.findAllByPatientNameIlikeOrPatientIdIlikeOrPatientResidenceIlike(query, query, query)]
    }
}