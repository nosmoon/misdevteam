ODI    OZ Document File<?xml version="1.0" encoding="UTF-8"?>

<OZDATAINFO>
  <OZDATAMODULE NAME="[OZ DATA Tree]" INCLUDE="" VERSION="1.0" PARAMETERFLAG="#" IGNORENULLDATA="true" SCRIPTBCE="false">
    <OZPARAMETERSTORE NAME="paramstore">
      <OZPARAMETERSET NAME="OZParam" INCLUDE="" MASTERSET="" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">
	<PARAMFIELD NAME="iv_bocd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_incmgpers" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_print_dt1" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_print_dt2" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
      </OZPARAMETERSET>
    </OZPARAMETERSTORE>
    <OZFILESTORE NAME="FILESTORE" INCLUDE="" />
    <OZHTTPSTORE NAME="HTTPSTORE" INCLUDE="" />
    <OZUDSTORE NAME="CLASS_SP_PB_P_UN_RECP_AMT_PCOND" INCLUDE="" CLASSNAME="oz.uds.procedure.ProcedureUDS" UDFIELDUSED="false" ISUSERACTIONSTORE="false">
      <OZUDSET NAME="SET_SP_PB_P_UN_RECP_AMT_PCOND" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_UN_RECP_AMT_PCOND" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">call SP_PB_P_UN_RECP_AMT_PCOND(@ov_errcode.VARCHAR2, @ov_errmsg.VARCHAR2, '#OZParam.iv_bocd#', '#OZParam.iv_incmgpers#', '#OZParam.iv_print_dt1#', '#OZParam.iv_print_dt2#', @ov_unrecpamtcur.CURSOR);
	<DATAFIELD NAME="ov_errcode" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ov_errmsg" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
      <OZUDSET NAME="SET_ov_unrecpamtcur" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_UN_RECP_AMT_PCOND" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">open ov_unrecpamtcur
	<DATAFIELD NAME="BOCD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="MEDICD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="MEDINM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="BASIDT" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PRVDDUN_RECPAGG" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SALEAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="RETNGOD_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="REPLINAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="REPLOUTAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="RE_PROD_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CRDT_CARDAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CURDD_CLAMTAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CURDDUN_RECPAGG" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
    </OZUDSTORE>
    <OZINCLUDESTORE NAME="includestore">
      <OZINCLUDESET NAME="includeSet" INCLUDE="" />
    </OZINCLUDESTORE>
    <OZQUERYDESIGNERINFO />
  </OZDATAMODULE>
</OZDATAINFO>

