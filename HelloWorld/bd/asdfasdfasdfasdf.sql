
CREATE OR REPLACE VIEW cal_alum_mat_view AS
SELECT a.nombre, a.apellido_paterno, a.apellido_materno, m.nombre_materia, cp.calificacion_parcial, cp.periodo
	FROM calificacion_parcial cp
	JOIN alumno a ON cp.alumno_id = a.id
	JOIN materia m ON cp.materia_id = m.id;

SELECT * FROM cal_alum_mat_view
	WHERE nombre_materia = 'Matemáticas';

SELECT * FROM cal_alum_mat_matview
	WHERE nombre_materia = 'Matemáticas';

REFRESH MATERIALIZED VIEW cal_alum_mat_matview;
CREATE MATERIALIZED VIEW IF NOT EXISTS cal_alum_mat_matview AS
	SELECT a.nombre, a.apellido_paterno, a.apellido_materno, m.nombre_materia, cp.calificacion_parcial, cp.periodo
	FROM calificacion_parcial cp
	JOIN alumno a ON cp.alumno_id = a.id
	JOIN materia m ON cp.materia_id = m.id
	WITH DATA;

SELECT * FROM calificacion_parcial;




CREATE OR REPLACE VIEW cali_parc_alum_mat_view AS
SELECT a.nombre, a.apellido_paterno, a.apellido_materno, m.nombre_materia, cp.calificacion_parcial,
	cp.periodo, cp.nombre_parcial
	FROM calificacion_parcial cp
	JOIN alumno a ON cp.alumno_id = a.id
	JOIN materia m ON cp.materia_id = m.id;


CREATE MATERIALIZED VIEW IF NOT EXISTS cali_parc_alum_mat_matview AS 
SELECT a.nombre, a.apellido_paterno, a.apellido_materno, m.nombre_materia, cp.calificacion_parcial,
	cp.periodo, cp.nombre_parcial
	FROM calificacion_parcial cp
	JOIN alumno a ON cp.alumno_id = a.id
	JOIN materia m ON cp.materia_id = m.id
WITH DATA;

UPDATE calificacion_parcial
	SET calificacion_parcial = calificacion_parcial - 0.5
	WHERE calificacion_parcial > 8
	and 
	or;

REFRESH MATERIALIZED VIEW cali_parc_alum_mat_matview;
SELECT * FROM cali_parc_alum_mat_matview;

SELECT * FROM cali_parc_alum_mat_view;

SELECT AVG(calificacion_parcial), nombre_materia FROM cali_parc_alum_mat_view
	GROUP BY nombre_materia
	HAVING nombre_materia = 'Matemáticas';

--DROP TABLE calificacion_final;
--DROP VIEW cali_parc_alum_mat_view;
--DROP MATERIALIZED VIEW cali_parc_alum_mat_matview;