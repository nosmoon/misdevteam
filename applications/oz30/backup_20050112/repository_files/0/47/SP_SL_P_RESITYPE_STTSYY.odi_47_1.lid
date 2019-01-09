ODI    OZ Document File<?xml version="1.0" encoding="UTF-8"?>

<OZDATAINFO>
  <OZDATAMODULE NAME="[OZ DATA Tree]" INCLUDE="" VERSION="1.0" PARAMETERFLAG="#" IGNORENULLDATA="true" SCRIPTBCE="false">
    <OZPARAMETERSTORE NAME="paramstore">
      <OZPARAMETERSET NAME="OZParam" INCLUDE="" MASTERSET="" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">
	<PARAMFIELD NAME="iv_bocd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="19110" />
	<PARAMFIELD NAME="iv_medicd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_frdst" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_todst" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_teamcd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_resitpcd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_basedt" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="" />
	<PARAMFIELD NAME="iv_sawol" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="200312" />
      </OZPARAMETERSET>
    </OZPARAMETERSTORE>
    <OZFILESTORE NAME="FILESTORE" INCLUDE="" />
    <OZHTTPSTORE NAME="HTTPSTORE" INCLUDE="" />
    <OZUDSTORE NAME="CLASS_SP_SL_P_RESITYPE_STTSYY" INCLUDE="" CLASSNAME="oz.uds.procedure.ProcedureUDS" UDFIELDUSED="false" ISUSERACTIONSTORE="false">
      <OZUDSET NAME="SET_STTSYY" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_SL_P_RESITYPE_STTSYY" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">call sp_sl_p_resitype_sttsyy(@ov_errcode.VARCHAR2,@ov_errmsg.VARCHAR2,'#OZParam.iv_bocd#','#OZParam.iv_medicd#','#OZParam.iv_frdst#','#OZParam.iv_todst#','#OZParam.iv_teamcd#','#OZParam.iv_resitpcd#','#OZParam.iv_basedt#','#OZParam.iv_sawol#',@ov_statlistcur.CURSOR,@ov_clamtlistcur.CURSOR);
	<DATAFIELD NAME="ov_errcode" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ov_errmsg" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
      <OZUDSET NAME="SET_List1" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_SL_P_RESITYPE_STTSYY" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">open ov_statlistcur
	<DATAFIELD NAME="월" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="독자수" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
      <OZUDSET NAME="SET_list2" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_SL_P_RESITYPE_STTSYY" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">open ov_clamtlistcur
	<DATAFIELD NAME="CICDNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
    </OZUDSTORE>
    <OZINCLUDESTORE NAME="includestore">
      <OZINCLUDESET NAME="includeSet" INCLUDE="" />
    </OZINCLUDESTORE>
    <OZQUERYDESIGNERINFO />
  </OZDATAMODULE>
</OZDATAINFO>

