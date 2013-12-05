Create Database dbAlmacen;

Create Table Tipo_pantalon(
	Tip_codi_pant Int(2) Primary Key Not Null,
	 Tiptipo_pantalon Varchar(10) Not Null);

Create Table Tipo_persona(
	tip_perso Int(1) Primary Key Not Null,
        tipo_persona Varchar(10) Not Null);

Insert Into Tipo_persona Values(1,"Hombre");
Insert Into Tipo_persona Values(2,"Mujer");
Insert Into Tipo_persona Values(3,"Niño");
Insert Into Tipo_persona Values(4,"Niña");
Create Table Pantalon(
	 PantCodigo Varchar(10)  Not Null Primary Key,
	 PantColor Varchar(10) Not Null,
	 PantTalla Varchar(2) Not Null,
	 PantSexo Varchar(1)Not Null,
	 PantTipo_pant Int(2) Not Null,
	 PantItem Int(10) Not Null,
	 PantTipo_persona Int(1) Not Null,
	 Panvalor Int(10) Not Null,
PantNit_provedor Int(10) Not Null);

ALTER TABLE Pantalon Add Foreign Key(PantTipo_pant) References Tipo_pantalon(Tip_codi_pant);
ALTER TABLE Pantalon Add Foreign Key(PantTipo_persona) References Tipo_persona(tip_perso);


Create Table Tipo_camisa(
	 TipCodi_camis Int(2) Not Null Primary Key,
	tipo_pant Varchar(10) Not Null);


create Table Camisa(
	 CamCodigo Varchar(10) Not Null Primary Key,
	 CamColor Varchar(10) Not Null,
	 CamTalla Varchar(2) Not Null,
	 CamSexo Varchar(1) Not Null,
	 CamTipo_camis Int(2) Not Null,
	 CamItem Int(10) Not Null,
	 Tipo_persona Int(1) Not Null,
	 Camvalor Int(10) Not Null, 
         CamNit_provedor Int(10) Not Null);
ALTER TABLE Camisa ADD Foreign Key (CamTipo_camis) References Tipo_camisa(TipCodi_camis);
ALTER TABLE Camisa ADD Foreign key(Tipo_persona)References Tipo_persona(Tip_perso);

Create Table Tipo_Ropa_interior(
	 RopaCod_pant Int(2) Not Null Primary Key,
	 ropa_interior Varchar(10) Not Null);


create Table Ropa_interior(
	 RopCodigo Varchar(10) Not Null Primary Key,
	 RopColor Varchar(10) Not Null,
	RopTalla Varchar(2) Not Null,
	 RopSexo Varchar(1) Not Null,
	 RopTipo_pant Int(2) Not Null, 
	 RopItem Int(10) Not Null,
	 Tipo_persona Int(1) Not Null,
	 Ropvalor Int(10) Not Null, 
         RopNit_provedor Int(10) Not Null);

ALTER TABLE Ropa_interior Add Foreign Key (RopTipo_pant) References Tipo_Ropa_interior(RopaCod_pant); 
ALTER TABLE Ropa_interior Add Foreign key (Tipo_persona) References Tipo_persona(Tip_perso);

Create Table Tipo_calzado(
	TipCod_cal Int(1) Not Null Primary Key,
	Tipo_calzado Varchar(10)Not Null);


create Table Calzado(
	 CalCodigo Varchar(10) Primary Key Not Null,
	 CalColor Varchar(10) Not Null,
	 CalTalla Varchar(2) Not Null,
	 CalSexo Varchar(1) Not Null,
	 CalTipo_pant Int(2) Not Null, 
	 CalItem Int(10) Not Null,
	 Tipo_persona Int(1) Not Null,
	 Calvalor Int(10) Not Null, 
         CalNit_provedor Int(10) Not Null);

ALTER TABLE Calzado Add Foreign Key (CalTipo_pant) References Tipo_calzado(TipCod_cal); 
ALTER TABLE Calzado Add Foreign key (Tipo_persona) References Tipo_persona(Tip_perso);

Create Table Juguetes(
     JugCodigo  Varchar(10) Not Null Primary Key,
     Jugvalor Int(5)  Not Null,
      JugTipo_niño Varchar(4) Not Null,
      Jug_marca Varchar(10) Not Null,
      JugNit_prov Int(10) Not Null);

Create Table Factura(
	Fact_cod Int(10) ZEROFILL,
	FacCedula Int(10),
	FacNombre Varchar(10), 
	Facfecha_venta Date,
	Fact_Total Int(10) Not Null);
Primary Key 
Create table Item(
	 Enum Int(1) Not Null Primary Key,
	 Fact_cod Varchar(10) Not Null,
	 tipo_producto Varchar(10) Not Null,
	 nomb_prod Varchar(10) Not Null,
	 Cantidad int(2) Not Null,
	 costo int(6) Not Null,
	 total int(7) Not Null);
	

Insert into Tipo_pantalon Values(1,"Drill");
Insert into Tipo_pantalon Values(2,"Lino");
Insert into Tipo_pantalon Values(3,"BlueJeans");
Insert into Tipo_pantalon Values(4,"Pantaloneta");
Insert into Tipo_pantalon Values(5,"Capri");
Insert into Tipo_pantalon Values(6,"Shorts");
Insert into Tipo_pantalon Values(7,"Sudadera");
Insert into Tipo_pantalon Values(8,"Lewis");
Insert into Tipo_pantalon Values(9,"Licra");
	
Insert Into Tipo_camisa Values(1,"Camisa Manga Larga");
Insert Into Tipo_camisa Values(2,"Camisa Manga Corta");
Insert Into Tipo_camisa Values(3,"Buso Manga Larga");
Insert Into Tipo_camisa Values(4,"Buso Manga Corta");
Insert Into Tipo_camisa Values(5,"Camibuso tipo Polo");
Insert Into Tipo_camisa Values(6,"Camiseta Senc");
Insert Into Tipo_camisa Values(7,"Camis Senc Blan");
Insert Into Tipo_camisa Values(8,"Camisilla");
Insert Into Tipo_camisa Values(9,"Blusa Basica");
Insert Into Tipo_camisa Values(10,"Blusa");
Insert Into Tipo_camisa Values(11,"Bluson");

Insert Into Tipo_calzado Values(1,"Zapatilla");
Insert Into Tipo_calzado Values(2,"Zapato");
Insert Into Tipo_calzado Values(3,"Zapato Tela");
Insert Into Tipo_calzado Values(4,"Tipo Cross");
Insert Into Tipo_calzado Values(5,"Valeta");
Insert Into Tipo_calzado Values(6,"Zandalia");
Insert Into Tipo_calzado Values(7,"Chancla");

Insert Into Tipo_Ropa_interior Values(1,"Boxer");
Insert Into Tipo_Ropa_interior Values(2,"Calzonsillo");
Insert Into Tipo_Ropa_interior Values(3,"Interior");
Insert Into Tipo_Ropa_interior Values(4,"Brazilera");
Insert Into Tipo_Ropa_interior Values(5,"Calzonsillo");
Insert Into Tipo_Ropa_interior Values(6,"Calzon");
Insert Into Tipo_Ropa_interior Values(7,"Brasier");
Insert Into Tipo_Ropa_interior Values(8,"Top");

Insert Into Tipo_persona Values(1,"Hombre");
Insert Into Tipo_persona Values(2,"Mujer");
Insert Into Tipo_persona Values(3,"Niño");
Insert Into Tipo_persona Values(4,"Niña");


