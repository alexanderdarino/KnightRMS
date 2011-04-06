INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COP3223', 'Introduction to Programming in C', 'C Programming', 3, 3, 'NONE');



INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('CDA3103', 'Computer Logic and Organization', 'Data Pipelines, MIPS', 3, 3, 'COURSE(COP3223)');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('CIS3360', 'Security in Computing', 'viruses', 3, 3, 'COURSE(COP3502)');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COP3330', 'Introduction to Object-Oriented Programming', 'Java Programming', 3, 3, 'COURSE(COP3223)');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COP3402', 'Systems Software', 'Compilers', 3, 3, 'COURSE(COP3502)');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COP3502', 'Computer Science I', 'Basic Data Structures', 3, 3, 'COURSE(COP3223)');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COP3503', 'Computer Science II', 'Algorithm analysis and design', 3, 3, 'COURSE(COP3502)');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COT3100', 'Introduction to Discrete Structures', 'Logic and Proofs, Set Theory, Number Theory', 3, 3, 'NONE');

INSERT INTO COURSE(ID, NAME, DESCRIPTION, CREDITSMIN, CREDITSMAX, PREREQUISITES)
	VALUES('COT3960', 'CS Foundation Exam', 'Covers COP3223, COT3100', 3, 3, 'COURSE(COP3502) AND COURSE(COT3100)');