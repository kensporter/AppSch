create table Appointment (
	MRN int Foreign Key REFERENCES Patient(MRN),
	APDate date Primary Key,
	Provider text,
	Location text,
	);