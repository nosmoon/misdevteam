ODI    OZ Document File<?xml version="1.0" encoding="UTF-8"?>

<OZDATAINFO>
  <OZDATAMODULE NAME="[OZ DATA Tree]" INCLUDE="" VERSION="1.0" PARAMETERFLAG="#" IGNORENULLDATA="true" SCRIPTBCE="false">
    <OZPARAMETERSTORE NAME="paramstore">
      <OZPARAMETERSET NAME="OZParam" INCLUDE="" MASTERSET="" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">
	<PARAMFIELD NAME="bocd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="b0105" />
	<PARAMFIELD NAME="incmgpers" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="medicd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="210" />
	<PARAMFIELD NAME="mediser_no" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="1815" />
	<PARAMFIELD NAME="sendynprocdtfr" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="20040701" />
	<PARAMFIELD NAME="sendynprocdtto" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="20040708" />
      </OZPARAMETERSET>
    </OZPARAMETERSTORE>
    <OZFILESTORE NAME="FILESTORE" INCLUDE="" />
    <OZHTTPSTORE NAME="HTTPSTORE" INCLUDE="" />
    <OZUDSTORE NAME="CLASS_SP_PB_P_UN_SEND_MEDI_PCOND" INCLUDE="" CLASSNAME="oz.uds.procedure.ProcedureUDS" UDFIELDUSED="false" ISUSERACTIONSTORE="false">
      <OZUDSET NAME="SET_SP_PB_P_UN_SEND_MEDI_PCOND" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_UN_SEND_MEDI_PCOND" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">call SP_PB_P_UN_SEND_MEDI_PCOND(@ov_errcode.VARCHAR2,@ov_errmsg.VARCHAR2,'#OZParam.bocd#','#OZParam.incmgpers#','#OZParam.medicd#','#OZParam.mediser_no#','#OZParam.sendynprocdtfr#','#OZParam.sendynprocdtto#',@ov_medinm.VARCHAR2,@ov_unsendmedicur.CURSOR);
	<DATAFIELD NAME="ov_errcode" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ov_errmsg" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ov_medinm" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
      <OZUDSET NAME="SET_ov_unsendmedicur" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_UN_SEND_MEDI_PCOND" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">open ov_unsendmedicur
	<DATAFIELD NAME="RDR_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="MEDICD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="TERMSUBSNO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="RDR_NO_ALL" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ACQNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUBSFRSER_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUBSTOSER_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUBS_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SENDYNPROCDT" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="APLCDT" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="MEDISER_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="UNSENDSER_NO" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="UPRC" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="AGG" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
    </OZUDSTORE>
    <OZINCLUDESTORE NAME="includestore">
      <OZINCLUDESET NAME="includeSet" INCLUDE="" />
    </OZINCLUDESTORE>
    <OZQUERYDESIGNERINFO />
  </OZDATAMODULE>
</OZDATAINFO>

