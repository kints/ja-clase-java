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

-- Crear tabla de materias
CREATE TABLE materia (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    clave_materia VARCHAR(20) NOT NULL,
    nombre_materia VARCHAR(100) NOT NULL,
    descripcion_materia TEXT,
    nivel_escolaridad VARCHAR(20) NOT NULL CHECK (nivel_escolaridad IN ('preescolar', 'primaria', 'secundaria', 'preparatoria')),
    grado_escolaridad VARCHAR(20) NOT NULL
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

