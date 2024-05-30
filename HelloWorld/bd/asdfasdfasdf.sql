-- Crear la extensión para UUIDs si no está ya instalada
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE alumno (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    matricula VARCHAR(20) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50),
    fecha_nacimiento DATE NOT NULL,
    tipo_sangre VARCHAR(3),
    curp VARCHAR(18) UNIQUE,
    genero VARCHAR(10),
    fecha_alta TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    activo BOOLEAN DEFAULT TRUE,
    fecha_baja TIMESTAMP
);


INSERT INTO alumno (id,matricula,nombre,apellido_paterno,apellido_materno,fecha_nacimiento,tipo_sangre,curp,genero,fecha_alta,activo,fecha_baja)
	VALUES
	(
        uuid_generate_v4(),
        'A2013001',
        'Juan',
        'Pérez',
        'López',
        '2013-05-10',
        'O+',
        'PEJX131010HDFLRN09',
        'Masculino',
        CURRENT_TIMESTAMP,
        TRUE,
        NULL
    ),
	(
        uuid_generate_v4(),
        'A2013002',
        'María',
        'García',
        'Hernández',
        '2013-08-15',
        'A-',
        'GAHM131015MDFLRN01',
        'Femenino',
        CURRENT_TIMESTAMP,
        TRUE,
        NULL
    ),
    (
        uuid_generate_v4(),
        'A2013003',
        'Carlos',
        'Martínez',
        'Rodríguez',
        '2013-12-22',
        'B+',
        'MARC131222HDFLRN02',
        'Masculino',
        CURRENT_TIMESTAMP,
        TRUE,
        NULL
    ),
    (
        uuid_generate_v4(),
        'A2013004',
        'Lucía',
        'Sánchez',
        'Fernández',
        '2013-02-03',
        'AB+',
        'SALF130203MDFLRN03',
        'Femenino',
        CURRENT_TIMESTAMP,
        TRUE,
        NULL
    ),
    (
        uuid_generate_v4(),
        'A2013005',
        'Pedro',
        'Ramírez',
        'Gómez',
        '2013-07-18',
        'O-',
        'RAGP130718HDFLRN04',
        'Masculino',
        CURRENT_TIMESTAMP,
        TRUE,
        NULL
    );

SELECT * FROM alumno;

SELECT id "Identificador del alumno", matricula "Matrícula",nombre "Nombre",apellido_paterno "Apellido Paterno", apellido_materno "Apellido Materno" FROM alumno;

SELECT id,matricula,nombre,apellido_paterno, apellido_materno, genero, fecha_nacimiento FROM alumno
	WHERE genero = 'Femenino'
	OR fecha_nacimiento BETWEEN '2013-12-01' AND '2013-12-31';

SELECT id,matricula,nombre,apellido_paterno, apellido_materno, genero, fecha_nacimiento FROM alumno
	WHERE apellido_materno ILIKE '_e%';

SELECT id,matricula,nombre,apellido_paterno, apellido_materno, genero, fecha_nacimiento, activo FROM alumno
	WHERE activo = TRUE
	AND genero = 'Femenino';

-- Crear tabla de materias
CREATE TABLE materia (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    clave_materia VARCHAR(20) NOT NULL,
    nombre_materia VARCHAR(100) NOT NULL,
    descripcion_materia TEXT,
    nivel_escolaridad VARCHAR(20) NOT NULL CHECK (nivel_escolaridad IN ('preescolar', 'primaria', 'secundaria', 'preparatoria')),
    grado_escolaridad VARCHAR(20) NOT NULL
);
select * from materia;
INSERT INTO materia (id, clave_materia, nombre_materia, descripcion_materia, nivel_escolaridad, grado_escolaridad)
VALUES
    (
        uuid_generate_v4(),
        CONCAT(SUBSTRING('Matemáticas 4' FROM 1 FOR 4), '-', SUBSTRING('primaria' FROM 1 FOR 3), '-', '4'),
        'Matemáticas',
        'Esta materia es para explicar las bases aritmeticas con divisiones de 2 digitos notaciones desarrolladas complejas',
        'primaria',
        '4'
    ),
    (
        uuid_generate_v4(),
        CONCAT(SUBSTRING('Ciencias 4' FROM 1 FOR 4), '-', SUBSTRING('primaria' FROM 1 FOR 3), '-', '4'),
        'Ciencias',
        'En ciencias de la vida, se ve la clasificación de seres vivos',
        'primaria',
        '4'
    ),
    (
        uuid_generate_v4(),
        CONCAT(SUBSTRING('Historia 4' FROM 1 FOR 4), '-', SUBSTRING('primaria' FROM 1 FOR 3), '-', '4'),
        'Historia',
        'En esta materia y periodo se ve el primer detalle de la historia de México',
        'primaria',
        '4'
    );
INSERT INTO materia (id, clave_materia, nombre_materia, descripcion_materia, nivel_escolaridad, grado_escolaridad)
VALUES
    (
        uuid_generate_v4(),
        CONCAT(SUBSTRING('Español' FROM 1 FOR 4), '-', SUBSTRING('primaria' FROM 1 FOR 3), '-', '4'),
        'Español',
        'En esta materia se practicarán la gramática y ortografía de español.',
        'primaria',
        '4'
    ),
    (
        uuid_generate_v4(),
        CONCAT(SUBSTRING('Geografía' FROM 1 FOR 4), '-', SUBSTRING('primaria' FROM 1 FOR 3), '-', '4'),
        'Geografía',
        'Se estudia el territorio mexicano, ecosistemas, ',
        'primaria',
        '4'
    ),
    (
        uuid_generate_v4(),
        CONCAT(SUBSTRING('Biología' FROM 1 FOR 4), '-', SUBSTRING('primaria' FROM 1 FOR 3), '-', '4'),
        'Biología',
        NULL,
        'primaria',
        '4'
    );

-- Crear tabla de calificaciones parciales
CREATE TABLE calificacion_parcial (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    alumno_id UUID NOT NULL,
    materia_id UUID NOT NULL,
    calificacion_parcial DECIMAL(5,2) NOT NULL,
    periodo VARCHAR(20) NOT NULL,
    nombre_parcial VARCHAR(50) NOT NULL,
    fecha_parcial DATE NOT NULL,
    FOREIGN KEY (alumno_id) REFERENCES alumno(id) ON DELETE CASCADE,
    FOREIGN KEY (materia_id) REFERENCES materia(id) ON DELETE CASCADE
);

-- Crear tabla de calificaciones finales
CREATE TABLE calificacion_final (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    alumno_id UUID NOT NULL,
    materia_id UUID NOT NULL,
    calificacion DECIMAL(5,2) NOT NULL,
    periodo VARCHAR(20) NOT NULL,
    FOREIGN KEY (alumno_id) REFERENCES alumno(id) ON DELETE CASCADE,
    FOREIGN KEY (materia_id) REFERENCES materia(id) ON DELETE CASCADE
);

SELECT * FROM alumno;
SELECT * FROM materia;
SELECT a.nombre, a.apellido_paterno, a.apellido_materno, SUM(cp.calificacion_parcial), AVG(cp.calificacion_parcial)
	 FROM calificacion_parcial cp
	JOIN alumno a ON cp.alumno_id = a.id
	JOIN materia m ON cp.materia_id = m.id
	GROUP BY a.nombre, a.apellido_paterno, a.apellido_materno;
select * from calificacion_parcial;

SELECT a.nombre, a.apellido_paterno, a.apellido_materno, cp.periodo,
	AVG(cp.calificacion_parcial),
	SUM(cp.calificacion_parcial), 
	MIN(cp.calificacion_parcial),
	MAX(cp.calificacion_parcial), 
	COUNT(cp.calificacion_parcial) 
	FROM calificacion_parcial cp
	JOIN alumno a ON cp.alumno_id = a.id
	GROUP BY a.nombre, a.apellido_paterno, a.apellido_materno, cp.periodo
	HAVING AVG(cp.calificacion_parcial) > 8.3;

SELECT * FROM calificacion_final;

SELECT * 
--DELETE	
	FROM calificacion_final
	WHERE calificacion > 8.3;

UPDATE 
--SELECT * from
	calificacion_final
	SET
		calificacion = calificacion + 0.5,
		periodo      = '2024-2025'
	WHERE
		id in ( '8b8fdeb7-ccee-4e58-beb5-96209373c5b7',
				'749221a0-6092-4909-b29c-b7712e16378f',
				'f1da4803-6032-4642-a76e-174aa66f4c0b');

--TRUNCATE TABLE calificacion_final;

INSERT INTO calificacion_final
	(alumno_id,calificacion,periodo)
SELECT  cp.alumno_id, AVG(cp.calificacion_parcial), cp.periodo
	FROM calificacion_parcial cp
	GROUP BY cp.alumno_id, cp.periodo;

SELECT * FROM alumno;
SELECT * FROM materia;
select * from calificacion_parcial;

INSERT INTO calificacion_parcial (alumno_id,materia_id,calificacion_parcial,periodo,nombre_parcial,fecha_parcial)
	VALUES (
	'c5da05f5-bbb0-4b38-a645-ab50f9d2753d',
	'8044ed53-b6a4-4cc6-8638-cc13876c0cff',
	9.6,
	'2023-2024',
	'1er. Bimestre',
	'2023-10-05'
	),
    (
	'c5da05f5-bbb0-4b38-a645-ab50f9d2753d',
	'e41ca535-4e7f-43fa-a979-7a2ef8fa1c89',
	8.2,
	'2023-2024',
	'1er. Bimestre',
	'2023-10-05'
	),
	(
	'c5da05f5-bbb0-4b38-a645-ab50f9d2753d',
	'e580c552-68bb-4b0c-baea-66bd181ace5d',
	8.7,
	'2023-2024',
	'1er. Bimestre',
	'2023-10-05'
	),
	(
	'c5da05f5-bbb0-4b38-a645-ab50f9d2753d',
	'7eddec26-775a-44c7-add0-6daac71377eb',
	8.8,
	'2023-2024',
	'1er. Bimestre',
	'2023-10-05'
	),
    (
	'c5da05f5-bbb0-4b38-a645-ab50f9d2753d',
	'bf1f8ed0-342f-47b7-b014-8b98bd4741be',
	8.3,
	'2023-2024',
	'1er. Bimestre',
	'2023-10-05'
	),
	(
	'c5da05f5-bbb0-4b38-a645-ab50f9d2753d',
	'd3345880-4d44-4af4-bd07-180768abefa5',
	9.4,
	'2023-2024',
	'1er. Bimestre',
	'2023-10-05'
	);

SELECT * FROM calificacion_final;

TRUNCATE TABLE calificacion_final;

INSERT INTO calificacion_final
	(alumno_id,calificacion,periodo)
SELECT 
	cp.alumno_id, 
	AVG(cp.calificacion_parcial),
	cp.periodo 
	FROM calificacion_parcial cp
	GROUP BY cp.alumno_id, cp.periodo;

SELECT cp.alumno_id,
	AVG(cp.calificacion_parcial),
	SUM(cp.calificacion_parcial),
	MIN(cp.calificacion_parcial),
	MAX(cp.calificacion_parcial),
	COUNT(cp.calificacion_parcial),  
	cp.periodo FROM calificacion_parcial cp
	GROUP BY cp.alumno_id, cp.periodo
	HAVING AVG(cp.calificacion_parcial) >= 8.7;


