CREATE SEQUENCE seq_proveedor START WITH 1 INCREMENT BY 1;
CREATE TABLE "Proveedor"
(
    "ProveedorID" NUMBER PRIMARY KEY,
    "Nombre"      VARCHAR2(255),
    "Direccion"   VARCHAR2(255),
    "Telefono"    VARCHAR2(20)
);
CREATE OR REPLACE TRIGGER trg_proveedor_id
    BEFORE INSERT
    ON "Proveedor"
    FOR EACH ROW
BEGIN
    SELECT seq_proveedor.nextval INTO :new."ProveedorID" FROM dual;
END;


CREATE SEQUENCE seq_portafolio START WITH 1 INCREMENT BY 1;
CREATE TABLE "Portafolio"
(
    "PortafolioID"     NUMBER PRIMARY KEY,
    "ProveedorID"      NUMBER,
    "NombrePortafolio" VARCHAR2(255),
    "Descripcion"      CLOB,
    FOREIGN KEY ("ProveedorID") REFERENCES "Proveedor" ("ProveedorID")
);
CREATE OR REPLACE TRIGGER trg_portafolio_id
    BEFORE INSERT
    ON "Portafolio"
    FOR EACH ROW
BEGIN
    SELECT seq_portafolio.nextval INTO :new."PortafolioID" FROM dual;
END;


CREATE SEQUENCE seq_mip START WITH 1 INCREMENT BY 1;
CREATE TABLE "MIP"
(
    "MIPID"          NUMBER PRIMARY KEY,
    "Tipo"           VARCHAR2(20),
    "NombreMIP"      VARCHAR2(255),
    "DescripcionMIP" CLOB
);
CREATE OR REPLACE TRIGGER trg_mip_id
    BEFORE INSERT
    ON "MIP"
    FOR EACH ROW
BEGIN
    SELECT seq_mip.nextval INTO :new."MIPID" FROM dual;
END;

CREATE TABLE "Portafolio_MIP"
(
    "PortafolioID" NUMBER,
    "MIPID"        NUMBER,
    FOREIGN KEY ("PortafolioID") REFERENCES "Portafolio" ("PortafolioID"),
    FOREIGN KEY ("MIPID") REFERENCES "MIP" ("MIPID")
);

ALTER TABLE "MIP"
    ADD CONSTRAINT "chk_tipo" CHECK ("Tipo" IN ('Medicamento', 'Insumo', 'Procedimiento'));
