ODI    OZ Document File<?xml version="1.0" encoding="UTF-8"?>

<OZDATAINFO>
  <OZDATAMODULE NAME="[OZ DATA Tree]" INCLUDE="" VERSION="1.0" PARAMETERFLAG="#" IGNORENULLDATA="true" SCRIPTBCE="false">
    <OZPARAMETERSTORE NAME="paramstore">
      <OZPARAMETERSET NAME="OZParam" INCLUDE="" MASTERSET="" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">
	<PARAMFIELD NAME="iv_bocd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="01100" />
	<PARAMFIELD NAME="iv_medicd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_frdst" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="111" />
	<PARAMFIELD NAME="iv_todst" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="113" />
	<PARAMFIELD NAME="iv_frsubsamt" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="0" />
	<PARAMFIELD NAME="iv_tosubsamt" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="50000" />
	<PARAMFIELD NAME="iv_frextndt" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="20000101" />
	<PARAMFIELD NAME="iv_toextndt" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="20031231" />
	<PARAMFIELD NAME="iv_printtp" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
      </OZPARAMETERSET>
    </OZPARAMETERSTORE>
    <OZFILESTORE NAME="FILESTORE" INCLUDE="" />
    <OZHTTPSTORE NAME="HTTPSTORE" INCLUDE="" />
    <OZUDSTORE NAME="CLASS_SP_SL_P_RDRLIST_UNIT" INCLUDE="" CLASSNAME="oz.uds.procedure.ProcedureUDS" UDFIELDUSED="false" ISUSERACTIONSTORE="false">
      <OZUDSET NAME="SET_SP_SL_P_RDRLIST_VAR" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_SL_P_RDRLIST_UNIT" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">call SP_SL_P_RDRLIST_VAR(@ov_errcode.VARCHAR2, @ov_errmsg.VARCHAR2, '#OZParam.iv_bocd#', '#OZParam.iv_medicd#', '#OZParam.iv_frdst#', '#OZParam.iv_todst#', '#OZParam.iv_frsubsamt#', '#OZParam.iv_tosubsamt#', '#OZParam.iv_frextndt#', '#OZParam.iv_toextndt#', '#OZParam.iv_printtp#', @ov_rdrlistcur.CURSOR, @ov_medilistcur.CURSOR);
	<DATAFIELD NAME="ov_errcode" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="ov_errmsg" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
      </OZUDSET>
      <OZUDSET NAME="SET_ov_rdrlistcur" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_SL_P_RDRLIST_UNIT" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">open ov_rdrlistcur
	<DATAFIELD NAME="RDR_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="RDR_NUM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="MEDICD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="DLVADDR" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="RDRNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="DLVDSTCCD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="CICDYNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="VALMM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="RDR_EXTNTYPECD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="EXTNNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="TELNO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="RDR_EXTNDT" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="DSTCNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="SUBSUPRC" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="SUBSQTY" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="GR_KEY" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="MEDI_CNT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="DST_CNT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="TEAM_CNT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" />
      </OZUDSET>
      <OZUDSET NAME="SET_ov_medilistcur" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_SL_P_RDRLIST_UNIT" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">open ov_medilistcur
	<DATAFIELD NAME="RDR_EXTNTYPECD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="CICDNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="MEDI_CNT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" />
      </OZUDSET>
    </OZUDSTORE>
    <OZSHADOWDATAGROUP NAME="GROUP_RDRLIST" INCLUDE="" SUBJECTSET="SET_ov_rdrlistcur">
      <OZSHADOWDATASET NAME="MAST_CD" INCLUDE="" DBINFOID="" CONSUMESUBJECTSETROW="false" MASTERSET="" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">true
	<DATAFIELD NAME="GR_KEY" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
      </OZSHADOWDATASET>
      <OZSHADOWDATASET NAME="RDR_LIST" INCLUDE="" DBINFOID="" CONSUMESUBJECTSETROW="true" MASTERSET="MAST_CD" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">#MAST_CD.GR_KEY#==#GR_KEY#
	<DATAFIELD NAME="RDR_NUM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="DLVADDR" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="DLVDSTCCD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="VALMM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="EXTNNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="TELNO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="SUBSUPRC" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="SUBSQTY" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="RDR_EXTNDT" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
	<DATAFIELD NAME="GR_KEY" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" />
      </OZSHADOWDATASET>
    </OZSHADOWDATAGROUP>
    <OZINCLUDESTORE NAME="includestore">
      <OZINCLUDESET NAME="includeSet" INCLUDE="" />
    </OZINCLUDESTORE>
    <OZQUERYDESIGNERINFO />
  </OZDATAMODULE>
</OZDATAINFO>

