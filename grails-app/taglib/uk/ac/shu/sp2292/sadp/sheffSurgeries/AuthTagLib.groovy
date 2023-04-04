package uk.ac.shu.sp2292.sadp.sheffSurgeries

class AuthTagLib
{
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def navToggle =
    {
        if (session.receptionist)
        {
            out << '<li class="nav-item">' << g.link(controller: "doctor", class: "nav-link link-dark px-2", "Doctors") << '</li>'
                << '<li class="nav-item">' << g.link(controller: "nurse", class: "nav-link link-dark px-2", "Nurses") << '</li>'
                << '<li class="nav-item">' << g.link(controller: "receptionist", class: "nav-link link-dark px-2", "Receptionists") << '</li>'
                << '<li class="nav-item">' << g.link(controller: "patient", class: "nav-link link-dark px-2", "Patients") << '</li>'
                << '<li class="nav-item">' << g.link(controller: "appointment", class: "nav-link link-dark px-2", "Appointments") << '</li>'
        }
        else if (session.doctor)
        {
            out << '<li class="nav-item">' << g.link(controller: "appointment", class: "nav-link link-dark px-2", "Appointments") << '</li>'
                << '<li class="nav-item">' << g.link(controller: "prescription", class: "nav-link link-dark px-2", "Prescriptions") << '</li>'
        }
    }

    def userToggle =
    {
        if (session.receptionist)
        {
            out << '<li class="nav-item">' << g.link(controller: "auth", action: "logout", class: "nav-link link-dark px-2", session.receptionist.recepName + " (Logout)") << '</li>'
        }
        else if (session.doctor)
        {
            out << '<li class="nav-item">' << g.link(controller: "auth", action: "logout", class: "nav-link link-dark px-2", session.doctor.doctorName + " (Logout)") << '</li>'
        }
        else
        {
            out << '<li class="nav-item">' << g.link(controller: "auth", class: "nav-link link-dark px-2", "Login") << '</li>'
        }
    }
}