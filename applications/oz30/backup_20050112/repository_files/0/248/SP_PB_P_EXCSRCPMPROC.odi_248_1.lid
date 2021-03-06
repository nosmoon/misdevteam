ODI    OZ Document File<?xml version="1.0" encoding="UTF-8"?>

<OZDATAINFO>
  <OZDATAMODULE NAME="[OZ DATA Tree]" INCLUDE="" VERSION="1.0" PARAMETERFLAG="#" IGNORENULLDATA="true" SCRIPTBCE="false">
    <OZPARAMETERSTORE NAME="paramstore">
      <OZPARAMETERSET NAME="OZParam" INCLUDE="" MASTERSET="" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">
	<PARAMFIELD NAME="iv_bocd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="b0105" />
	<PARAMFIELD NAME="iv_subsyy" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="2004" />
	<PARAMFIELD NAME="iv_procyn" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="020" />
	<PARAMFIELD NAME="iv_procdtbgn" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_procdtend" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
      </OZPARAMETERSET>
    </OZPARAMETERSTORE>
    <OZFILESTORE NAME="FILESTORE" INCLUDE="" />
    <OZHTTPSTORE NAME="HTTPSTORE" INCLUDE="" />
    <OZUDSTORE NAME="CLASS_SP_PB_P_EXCSRCPMPROC" INCLUDE="" CLASSNAME="oz.uds.procedure.ProcedureUDS" UDFIELDUSED="false" ISUSERACTIONSTORE="false">
      <OZUDSET NAME="SET_SP_PB_P_EXCSRCPMPROC" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_EXCSRCPMPROC" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">call  SP_PB_P_EXCSRCPMPROC( @OV_ERRCODE.VARCHAR2, @OV_ERRMSG.VARCHAR2,'#OZParam.iv_bocd#','#OZParam.iv_subsyy#','#OZParam.iv_procyn#','#OZParam.iv_procdtbgn#','#OZParam.iv_procdtend#',@OV_curcommlist.CURSOR);
	<DATAFIELD NAME="OV_ERRCODE" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="OV_ERRMSG" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
      <OZUDSET NAME="SET_OV_curcommlist" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_EXCSRCPMPROC" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">open OV_curcommlist
	<DATAFIELD NAME="RDR_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="RDRNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="MEDINM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PROCCLSF" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PROCCLSFNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SEQ" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PROCYN" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PROCAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="REALSELLAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="EXCSRCPMAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PROCDT" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUBSFRSER_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUBSTOSER_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="EXSTSUBSSCTN" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CHGSUBSSCTN" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
    </OZUDSTORE>
    <OZINCLUDESTORE NAME="includestore">
      <OZINCLUDESET NAME="includeSet" INCLUDE="" />
    </OZINCLUDESTORE>
    <OZQUERYDESIGNERINFO />
  </OZDATAMODULE>
</OZDATAINFO>

