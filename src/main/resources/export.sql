--------------------------------------------------------
--  File created - Friday-March-23-2018
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table JS_RK_SZ_DAY
--------------------------------------------------------

  CREATE TABLE "RSPUB"."JS_RK_SZ_DAY"
   (	"NF" CHAR(8 BYTE),
	"RKRQ" CHAR(20 BYTE),
	"SWJG_DM" CHAR(22 BYTE),
	"GDSLX_DM" CHAR(2 BYTE),
	"ZSXM_DM" VARCHAR2(10 BYTE),
	"ZSXMMC" VARCHAR2(150 BYTE),
	"RKJE" NUMBER(16,2)
   ) SEGMENT CREATION IMMEDIATE
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TS_USERDATA" ;


   COMMENT ON COLUMN "RSPUB"."JS_RK_SZ_DAY"."NF" IS '11';

   COMMENT ON TABLE "RSPUB"."JS_RK_SZ_DAY"  IS '111';
REM INSERTING into RSPUB.JS_RK_SZ_DAY
SET DEFINE OFF;
Insert into RSPUB.JS_RK_SZ_DAY (NF,RKRQ,SWJG_DM,GDSLX_DM,ZSXM_DM,ZSXMMC,RKJE) values ('0001    ','0001                ','0001                  ','1 ','0001','0001',1000.16);
Insert into RSPUB.JS_RK_SZ_DAY (NF,RKRQ,SWJG_DM,GDSLX_DM,ZSXM_DM,ZSXMMC,RKJE) values ('0002    ','0002                ','0002                  ','2 ','0002','0002',2000.16);
Insert into RSPUB.JS_RK_SZ_DAY (NF,RKRQ,SWJG_DM,GDSLX_DM,ZSXM_DM,ZSXMMC,RKJE) values ('0003    ','0003                ','0003                  ','3 ','0003','0003',3000.16);
Insert into RSPUB.JS_RK_SZ_DAY (NF,RKRQ,SWJG_DM,GDSLX_DM,ZSXM_DM,ZSXMMC,RKJE) values ('0004    ','0004                ','0004                  ','4 ','0004','0004',4000.16);
