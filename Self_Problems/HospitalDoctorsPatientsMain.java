import java.util.ArrayList;

// Patient class
class Patient {
    private String name;
    private ArrayList<Doctor> consultedDoctors;

    // Constructor to initialize patient details
    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    // Method to add a doctor to the patient's consulted list
    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    // Method to display the doctors the patient has consulted
    public void displayConsultedDoctors() {
        System.out.println("Patient: " + name);
        System.out.println("Consulted Doctors:");
        for (Doctor doctor : consultedDoctors) {
            System.out.println("  " + doctor.getName());
        }
    }

    // Get patient name
    public String getName() {
        return name;
    }
}

// Doctor class
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    // Constructor to initialize doctor details
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient (establishes a two-way association)
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Add the doctor to the patient's list
        }
        System.out.println("Consultation: Dr. " + name + " is consulting patient " + patient.getName());
    }

    // Method to display the patients the doctor has consulted
    public void displayConsultedPatients() {
        System.out.println("Doctor: " + name);
        System.out.println("Consulted Patients:");
        for (Patient patient : patients) {
            System.out.println("  " + patient.getName());
        }
    }

    // Get doctor name
    public String getName() {
        return name;
    }
}

// Hospital class
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor to initialize hospital details
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Display hospital details
    public void displayDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("  " + patient.getName());
        }
    }
}

public class HospitalDoctorsPatientsMain{
    public static void main(String[] args) {
        // Create Hospital object
        Hospital hospital = new Hospital("City Health Center");

        // Create Doctor objects
        Doctor doctor1 = new Doctor("Smith");
        Doctor doctor2 = new Doctor("Johnson");

        // Create Patient objects
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        Patient patient3 = new Patient("Charlie");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // Establish consultations (association)
        doctor1.consult(patient1); // Dr. Smith consults Alice
        doctor1.consult(patient2); // Dr. Smith consults Bob
        doctor2.consult(patient2); // Dr. Johnson consults Bob
        doctor2.consult(patient3); // Dr. Johnson consults Charlie

        // Display hospital details
        hospital.displayDetails();

        // Display consultations for each doctor
        doctor1.displayConsultedPatients();
        doctor2.displayConsultedPatients();

        // Display consultations for each patient
        patient1.displayConsultedDoctors();
        patient2.displayConsultedDoctors();
        patient3.displayConsultedDoctors();
    }
}
