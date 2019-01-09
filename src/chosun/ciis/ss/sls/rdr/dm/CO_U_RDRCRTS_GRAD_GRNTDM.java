/***************************************************************************************************
* 파일명 : CO_U_RDRCRTS_GRAD_GRNTDM.java
* 기능 : 독자현황-독자등급부여
* 작성일자 : 2005-02-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급부여
 */


public class CO_U_RDRCRTS_GRAD_GRNTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String incmgpers;
	public String callpgclsf;
	public String onlmembseqarr;
	public String regdtarr;
	public String regnoarr;
	public String bocdarr;
	public String medicdarr;
	public String rdr_noarr;
	public String rdrgradarr;
	public String dtlsprocstatarr;
	public String errresncdarr;
	public String chkseqarr;

	public CO_U_RDRCRTS_GRAD_GRNTDM(){}
	public CO_U_RDRCRTS_GRAD_GRNTDM(String cmpycd, String bocd, String incmgpers, String callpgclsf, String onlmembseqarr, String regdtarr, String regnoarr, String bocdarr, String medicdarr, String rdr_noarr, String rdrgradarr, String dtlsprocstatarr, String errresncdarr, String chkseqarr){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.callpgclsf = callpgclsf;
		this.onlmembseqarr = onlmembseqarr;
		this.regdtarr = regdtarr;
		this.regnoarr = regnoarr;
		this.bocdarr = bocdarr;
		this.medicdarr = medicdarr;
		this.rdr_noarr = rdr_noarr;
		this.rdrgradarr = rdrgradarr;
		this.dtlsprocstatarr = dtlsprocstatarr;
		this.errresncdarr = errresncdarr;
		this.chkseqarr = chkseqarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCallpgclsf(String callpgclsf){
		this.callpgclsf = callpgclsf;
	}

	public void setOnlmembseqarr(String onlmembseqarr){
		this.onlmembseqarr = onlmembseqarr;
	}

	public void setRegdtarr(String regdtarr){
		this.regdtarr = regdtarr;
	}

	public void setRegnoarr(String regnoarr){
		this.regnoarr = regnoarr;
	}

	public void setBocdarr(String bocdarr){
		this.bocdarr = bocdarr;
	}

	public void setMedicdarr(String medicdarr){
		this.medicdarr = medicdarr;
	}

	public void setRdr_noarr(String rdr_noarr){
		this.rdr_noarr = rdr_noarr;
	}

	public void setRdrgradarr(String rdrgradarr){
		this.rdrgradarr = rdrgradarr;
	}

	public void setDtlsprocstatarr(String dtlsprocstatarr){
		this.dtlsprocstatarr = dtlsprocstatarr;
	}

	public void setErrresncdarr(String errresncdarr){
		this.errresncdarr = errresncdarr;
	}

	public void setChkseqarr(String chkseqarr){
		this.chkseqarr = chkseqarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCallpgclsf(){
		return this.callpgclsf;
	}

	public String getOnlmembseqarr(){
		return this.onlmembseqarr;
	}

	public String getRegdtarr(){
		return this.regdtarr;
	}

	public String getRegnoarr(){
		return this.regnoarr;
	}

	public String getBocdarr(){
		return this.bocdarr;
	}

	public String getMedicdarr(){
		return this.medicdarr;
	}

	public String getRdr_noarr(){
		return this.rdr_noarr;
	}

	public String getRdrgradarr(){
		return this.rdrgradarr;
	}

	public String getDtlsprocstatarr(){
		return this.dtlsprocstatarr;
	}

	public String getErrresncdarr(){
		return this.errresncdarr;
	}

	public String getChkseqarr(){
		return this.chkseqarr;
	}

	public String getSQL(){
		 return "{ call SP_CO_U_RDRCRTS_GRAD_GRNT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_U_RDRCRTS_GRAD_GRNTDM dm = (CO_U_RDRCRTS_GRAD_GRNTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.incmgpers);
		cstmt.setString(6, dm.callpgclsf);
		cstmt.setString(7, dm.onlmembseqarr);
		cstmt.setString(8, dm.regdtarr);
		cstmt.setString(9, dm.regnoarr);
		cstmt.setString(10, dm.bocdarr);
		cstmt.setString(11, dm.medicdarr);
		cstmt.setString(12, dm.rdr_noarr);
		cstmt.setString(13, dm.rdrgradarr);
		cstmt.setString(14, dm.dtlsprocstatarr);
		cstmt.setString(15, dm.errresncdarr);
		cstmt.setString(16, dm.chkseqarr);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.CO_U_RDRCRTS_GRAD_GRNTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String callpgclsf = req.getParameter("callpgclsf");
if( callpgclsf == null){
	System.out.println(this.toString+" : callpgclsf is null" );
}else{
	System.out.println(this.toString+" : callpgclsf is "+callpgclsf );
}
String onlmembseqarr = req.getParameter("onlmembseqarr");
if( onlmembseqarr == null){
	System.out.println(this.toString+" : onlmembseqarr is null" );
}else{
	System.out.println(this.toString+" : onlmembseqarr is "+onlmembseqarr );
}
String regdtarr = req.getParameter("regdtarr");
if( regdtarr == null){
	System.out.println(this.toString+" : regdtarr is null" );
}else{
	System.out.println(this.toString+" : regdtarr is "+regdtarr );
}
String regnoarr = req.getParameter("regnoarr");
if( regnoarr == null){
	System.out.println(this.toString+" : regnoarr is null" );
}else{
	System.out.println(this.toString+" : regnoarr is "+regnoarr );
}
String bocdarr = req.getParameter("bocdarr");
if( bocdarr == null){
	System.out.println(this.toString+" : bocdarr is null" );
}else{
	System.out.println(this.toString+" : bocdarr is "+bocdarr );
}
String medicdarr = req.getParameter("medicdarr");
if( medicdarr == null){
	System.out.println(this.toString+" : medicdarr is null" );
}else{
	System.out.println(this.toString+" : medicdarr is "+medicdarr );
}
String rdr_noarr = req.getParameter("rdr_noarr");
if( rdr_noarr == null){
	System.out.println(this.toString+" : rdr_noarr is null" );
}else{
	System.out.println(this.toString+" : rdr_noarr is "+rdr_noarr );
}
String rdrgradarr = req.getParameter("rdrgradarr");
if( rdrgradarr == null){
	System.out.println(this.toString+" : rdrgradarr is null" );
}else{
	System.out.println(this.toString+" : rdrgradarr is "+rdrgradarr );
}
String dtlsprocstatarr = req.getParameter("dtlsprocstatarr");
if( dtlsprocstatarr == null){
	System.out.println(this.toString+" : dtlsprocstatarr is null" );
}else{
	System.out.println(this.toString+" : dtlsprocstatarr is "+dtlsprocstatarr );
}
String errresncdarr = req.getParameter("errresncdarr");
if( errresncdarr == null){
	System.out.println(this.toString+" : errresncdarr is null" );
}else{
	System.out.println(this.toString+" : errresncdarr is "+errresncdarr );
}
String chkseqarr = req.getParameter("chkseqarr");
if( chkseqarr == null){
	System.out.println(this.toString+" : chkseqarr is null" );
}else{
	System.out.println(this.toString+" : chkseqarr is "+chkseqarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String callpgclsf = Util.checkString(req.getParameter("callpgclsf"));
String onlmembseqarr = Util.checkString(req.getParameter("onlmembseqarr"));
String regdtarr = Util.checkString(req.getParameter("regdtarr"));
String regnoarr = Util.checkString(req.getParameter("regnoarr"));
String bocdarr = Util.checkString(req.getParameter("bocdarr"));
String medicdarr = Util.checkString(req.getParameter("medicdarr"));
String rdr_noarr = Util.checkString(req.getParameter("rdr_noarr"));
String rdrgradarr = Util.checkString(req.getParameter("rdrgradarr"));
String dtlsprocstatarr = Util.checkString(req.getParameter("dtlsprocstatarr"));
String errresncdarr = Util.checkString(req.getParameter("errresncdarr"));
String chkseqarr = Util.checkString(req.getParameter("chkseqarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String callpgclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("callpgclsf")));
String onlmembseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("onlmembseqarr")));
String regdtarr = Util.Uni2Ksc(Util.checkString(req.getParameter("regdtarr")));
String regnoarr = Util.Uni2Ksc(Util.checkString(req.getParameter("regnoarr")));
String bocdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdarr")));
String medicdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("medicdarr")));
String rdr_noarr = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_noarr")));
String rdrgradarr = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrgradarr")));
String dtlsprocstatarr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsprocstatarr")));
String errresncdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("errresncdarr")));
String chkseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("chkseqarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setCallpgclsf(callpgclsf);
dm.setOnlmembseqarr(onlmembseqarr);
dm.setRegdtarr(regdtarr);
dm.setRegnoarr(regnoarr);
dm.setBocdarr(bocdarr);
dm.setMedicdarr(medicdarr);
dm.setRdr_noarr(rdr_noarr);
dm.setRdrgradarr(rdrgradarr);
dm.setDtlsprocstatarr(dtlsprocstatarr);
dm.setErrresncdarr(errresncdarr);
dm.setChkseqarr(chkseqarr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 22 10:22:58 KST 2005 */