ODI    OZ Document File<?xml version="1.0" encoding="UTF-8"?>

<OZDATAINFO>
  <OZDATAMODULE NAME="[OZ DATA Tree]" INCLUDE="" VERSION="1.0" PARAMETERFLAG="#" IGNORENULLDATA="true" SCRIPTBCE="false">
    <OZPARAMETERSTORE NAME="paramstore">
      <OZPARAMETERSET NAME="OZParam" INCLUDE="" MASTERSET="" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">
	<PARAMFIELD NAME="bocd" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="b0105" />
	<PARAMFIELD NAME="closmm" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="200407" />
	<PARAMFIELD NAME="kubun" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" VALUE="HDQT" />
      </OZPARAMETERSET>
    </OZPARAMETERSTORE>
    <OZFILESTORE NAME="FILESTORE" INCLUDE="" />
    <OZHTTPSTORE NAME="HTTPSTORE" INCLUDE="" />
    <OZUDSTORE NAME="CLASS_SP_PB_P_SELL_COMS_PTCR" INCLUDE="" CLASSNAME="oz.uds.procedure.ProcedureUDS" UDFIELDUSED="false" ISUSERACTIONSTORE="false">
      <OZUDSET NAME="SET_SP_PB_P_SELL_COMS_PTCR" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_SELL_COMS_PTCR" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">call SP_PB_P_SELL_COMS_PTCR( @ov_errcode.VARCHAR2, @ov_errmsg.VARCHAR2, '#OZParam.bocd#', '#OZParam.closmm#', '#OZParam.kubun#', @ov_sysdate.VARCHAR2, @ov_sellcomscur.CURSOR );
	<DATAFIELD NAME="ov_errcode" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ov_errmsg" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ov_sysdate" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
      <OZUDSET NAME="SET_ov_sellcomscur" INCLUDE="" MASTERSET="" DBINFOID="CLASS_SP_PB_P_SELL_COMS_PTCR" SCRIPT="false" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false" INSERT_ROW_QUERY="" DELETE_ROW_QUERY="">open ov_sellcomscur
	<DATAFIELD NAME="BOEMP_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="BOEMP_NM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="AMNO_DEPTCD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="AMNO_DEPTNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WEEKJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTMT_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTFI_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WOOMJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_TEPS_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WVIL_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ENOBBLE_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_KHAN_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ECONOMY_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ETC_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_NOIT_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WEEKJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTMT_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTFI_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WOOMJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_TEPS_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WVIL_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ENOBBLE_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_KHAN_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ECONOMY_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ETC_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_NOIT_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WEEKJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTMT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTFI_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WOOMJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_TEPS_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WVIL_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ENOBBLE_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_KHAN_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ECONOMY_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ETC_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WEEKJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTMT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTFI_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WOOMJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_TEPS_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WVIL_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ENOBBLE_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_KHAN_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ECONOMY_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ETC_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="RSLTALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DCL_AMTALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SPCALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="POSIALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PRSNTALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CAMPALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CASHALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ADVNALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUM_ALON_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAYSELLAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUCSELLAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAYTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUCTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="REALPAY_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="INCM_TAX" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PRN_TAX" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ETC1" INCLUDE="" TYPE="1" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ETC2" INCLUDE="" TYPE="1" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ETC3" INCLUDE="" TYPE="1" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_SUM_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ALON_COMP_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZUDSET>
    </OZUDSTORE>
    <OZSHADOWDATAGROUP NAME="GROUP_sell" INCLUDE="" SUBJECTSET="SET_ov_sellcomscur">
      <OZSHADOWDATASET NAME="Shadow_key" INCLUDE="" DBINFOID="" CONSUMESUBJECTSETROW="false" MASTERSET="" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">true
	<DATAFIELD NAME="AMNO_DEPTCD" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="AMNO_DEPTNM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZSHADOWDATASET>
      <OZSHADOWDATASET NAME="Shadow_list" INCLUDE="" DBINFOID="" CONSUMESUBJECTSETROW="true" MASTERSET="Shadow_key" MAXROW="0" HIDDEN="false" LOADSFIELDINFODYNAMICALLY="false" SDMTYPE="0" SIGN="false" HIDEDESIGNTIME="false">#Shadow_key.AMNO_DEPTCD#==#AMNO_DEPTCD#
	<DATAFIELD NAME="BOEMP_NO" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="BOEMP_NM" INCLUDE="" TYPE="12" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WEEKJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTMT_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTFI_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WOOMJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_TEPS_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ETC_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_NOIT_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WEEKJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTMT_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTFI_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WOOMJO_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_TEPS_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ETC_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_NOIT_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WEEKJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTMT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_MONTFI_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WOOMJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_TEPS_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ETC_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WEEKJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTMT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_MONTFI_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WOOMJO_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_TEPS_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ETC_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_TOT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="RSLTALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DCL_AMTALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SPCALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="POSIALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PRSNTALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CAMPALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="CASHALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ADVNALONTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="SUM_ALON_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAYSELLAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUCSELLAMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAYTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUCTOT_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="REALPAY_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="INCM_TAX" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PRN_TAX" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ETC1" INCLUDE="" TYPE="1" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ETC2" INCLUDE="" TYPE="1" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ETC3" INCLUDE="" TYPE="1" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_SUM_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="ALON_COMP_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WVIL_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ENOBBLE_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_KHAN_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WVIL_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ENOBBLE_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_KHAN_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_WVIL_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ENOBBLE_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_KHAN_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_WVIL_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ENOBBLE_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_KHAN_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ECONOMY_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ECONOMY_NOIT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="PAY_ECONOMY_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
	<DATAFIELD NAME="DDUC_ECONOMY_AMT" INCLUDE="" TYPE="2" EDITFIELDTYPE="false" DESCRIPTION="" UPDATE_FIELD_QUERY="" />
      </OZSHADOWDATASET>
    </OZSHADOWDATAGROUP>
    <OZINCLUDESTORE NAME="includestore">
      <OZINCLUDESET NAME="includeSet" INCLUDE="" />
    </OZINCLUDESTORE>
    <OZQUERYDESIGNERINFO />
  </OZDATAMODULE>
</OZDATAINFO>

