-- Proveedores
INSERT INTO "Proveedor" ("ProveedorID", "Nombre", "Direccion", "Telefono") VALUES (1, 'Hospital del Norte', '123 Calle Norte, Ciudad, Estado', '111-111-1111');
INSERT INTO "Proveedor" ("ProveedorID", "Nombre", "Direccion", "Telefono") VALUES (2, 'Clinica del Sur', '456 Calle Sur, Ciudad, Estado', '222-222-2222');

-- Portafolios del Hospital del Norte
INSERT INTO "Portafolio" ("PortafolioID", "ProveedorID", "NombrePortafolio", "Descripcion") VALUES (1, 1, 'Portafolio General', 'Portafolio general del Hospital del Norte');
INSERT INTO "Portafolio" ("PortafolioID", "ProveedorID", "NombrePortafolio", "Descripcion") VALUES (2, 1, 'Portafolio Pediatria', 'Portafolio enfocado en pediatría del Hospital del Norte');
INSERT INTO "Portafolio" ("PortafolioID", "ProveedorID", "NombrePortafolio", "Descripcion") VALUES (3, 1, 'Portafolio Geriatria', 'Portafolio especializado en geriatría del Hospital del Norte');

-- Portafolios de la Clinica del Sur
INSERT INTO "Portafolio" ("PortafolioID", "ProveedorID", "NombrePortafolio", "Descripcion") VALUES (4, 2, 'Portafolio General', 'Portafolio general de la Clinica del Sur');
INSERT INTO "Portafolio" ("PortafolioID", "ProveedorID", "NombrePortafolio", "Descripcion") VALUES (5, 2, 'Portafolio Maternidad', 'Portafolio enfocado en maternidad de la Clinica del Sur');
INSERT INTO "Portafolio" ("PortafolioID", "ProveedorID", "NombrePortafolio", "Descripcion") VALUES (6, 2, 'Portafolio Cardiologia', 'Portafolio especializado en cardiología de la Clinica del Sur');

-- MIPs
INSERT INTO "MIP" ("MIPID", "Tipo", "NombreMIP", "DescripcionMIP") VALUES (1, 'Medicamento', 'Ibuprofeno', 'Medicamento antiinflamatorio y analgésico');
INSERT INTO "MIP" ("MIPID", "Tipo", "NombreMIP", "DescripcionMIP") VALUES (2, 'Medicamento', 'Amoxicilina', 'Antibiótico para tratar una variedad de infecciones bacterianas');
INSERT INTO "MIP" ("MIPID", "Tipo", "NombreMIP", "DescripcionMIP") VALUES (3, 'Insumo', 'Jeringa 10ml', 'Jeringa estéril para administrar medicamentos');
INSERT INTO "MIP" ("MIPID", "Tipo", "NombreMIP", "DescripcionMIP") VALUES (4, 'Insumo', 'Guantes Latex', 'Guantes de látex para uso médico');
INSERT INTO "MIP" ("MIPID", "Tipo", "NombreMIP", "DescripcionMIP") VALUES (5, 'Procedimiento', 'Electrocardiograma', 'Procedimiento para medir la actividad eléctrica del corazón');

-- Portafolio_MIP
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (1, 6);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (1, 7);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (1, 3);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (2, 7);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (2, 3);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (2, 4);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (3, 4);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (3, 5);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (4, 6);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (4, 5);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (5, 3);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (5, 4);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (6, 7);
INSERT INTO "Portafolio_MIP" ("PortafolioID", "MIPID") VALUES (6, 3);
