/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-확장관리-사원확장통계
* 작성일자 : 2012-3-15
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EXTN_RDR_STATSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String officd;
	public String deptcd;
	public String empnm;
	public String fromtogb;
	public String frdt;
	public String todt;
	public String fixdt;
	public String extnqty;
	public String bo_headcnfmyn;
	public String searchflag;

	public SS_L_EXTN_RDR_STATSDM(){}
	public SS_L_EXTN_RDR_STATSDM(String cmpycd, String officd, String deptcd, String empnm, String fromtogb, String frdt, String todt, String fixdt, String extnqty, String bo_headcnfmyn, String searchflag){
		this.cmpycd = cmpycd;
		this.officd = officd;
		this.deptcd = deptcd;
		this.empnm = empnm;
		this.fromtogb = fromtogb;
		this.frdt = frdt;
		this.todt = todt;
		this.fixdt = fixdt;
		this.extnqty = extnqty;
		this.bo_headcnfmyn = bo_headcnfmyn;
		this.searchflag = searchflag;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setOfficd(String officd){
		this.officd = officd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setFromtogb(String fromtogb){
		this.fromtogb = fromtogb;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setFixdt(String fixdt){
		this.fixdt = fixdt;
	}

	public void setExtnqty(String extnqty){
		this.extnqty = extnqty;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSearchflag(String searchflag){
		this.searchflag = searchflag;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getOfficd(){
		return this.officd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getFromtogb(){
		return this.fromtogb;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getFixdt(){
		return this.fixdt;
	}

	public String getExtnqty(){
		return this.extnqty;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSearchflag(){
		return this.searchflag;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_EXTN_RDR_STATS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_RDR_STATSDM dm = (SS_L_EXTN_RDR_STATSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.officd);
		cstmt.setString(5, dm.deptcd);
		cstmt.setString(6, dm.empnm);
		cstmt.setString(7, dm.fromtogb);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.fixdt);
		cstmt.setString(11, dm.extnqty);
		cstmt.setString(12, dm.bo_headcnfmyn);
		cstmt.setString(13, dm.searchflag);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_RDR_STATSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("officd = [" + getOfficd() + "]");
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("empnm = [" + getEmpnm() + "]");
		System.out.println("fromtogb = [" + getFromtogb() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("fixdt = [" + getFixdt() + "]");
		System.out.println("extnqty = [" + getExtnqty() + "]");
		System.out.println("bo_headcnfmyn = [" + getBo_headcnfmyn() + "]");
		System.out.println("searchflag = [" + getSearchflag() + "]");
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
String officd = req.getParameter("officd");
if( officd == null){
	System.out.println(this.toString+" : officd is null" );
}else{
	System.out.println(this.toString+" : officd is "+officd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String empnm = req.getParameter("empnm");
if( empnm == null){
	System.out.println(this.toString+" : empnm is null" );
}else{
	System.out.println(this.toString+" : empnm is "+empnm );
}
String fromtogb = req.getParameter("fromtogb");
if( fromtogb == null){
	System.out.println(this.toString+" : fromtogb is null" );
}else{
	System.out.println(this.toString+" : fromtogb is "+fromtogb );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String fixdt = req.getParameter("fixdt");
if( fixdt == null){
	System.out.println(this.toString+" : fixdt is null" );
}else{
	System.out.println(this.toString+" : fixdt is "+fixdt );
}
String extnqty = req.getParameter("extnqty");
if( extnqty == null){
	System.out.println(this.toString+" : extnqty is null" );
}else{
	System.out.println(this.toString+" : extnqty is "+extnqty );
}
String bo_headcnfmyn = req.getParameter("bo_headcnfmyn");
if( bo_headcnfmyn == null){
	System.out.println(this.toString+" : bo_headcnfmyn is null" );
}else{
	System.out.println(this.toString+" : bo_headcnfmyn is "+bo_headcnfmyn );
}
String searchflag = req.getParameter("searchflag");
if( searchflag == null){
	System.out.println(this.toString+" : searchflag is null" );
}else{
	System.out.println(this.toString+" : searchflag is "+searchflag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String officd = Util.checkString(req.getParameter("officd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String empnm = Util.checkString(req.getParameter("empnm"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String fixdt = Util.checkString(req.getParameter("fixdt"));
String extnqty = Util.checkString(req.getParameter("extnqty"));
String bo_headcnfmyn = Util.checkString(req.getParameter("bo_headcnfmyn"));
String searchflag = Util.checkString(req.getParameter("searchflag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String officd = Util.Uni2Ksc(Util.checkString(req.getParameter("officd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String fixdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fixdt")));
String extnqty = Util.Uni2Ksc(Util.checkString(req.getParameter("extnqty")));
String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
String searchflag = Util.Uni2Ksc(Util.checkString(req.getParameter("searchflag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setOfficd(officd);
dm.setDeptcd(deptcd);
dm.setEmpnm(empnm);
dm.setFromtogb(fromtogb);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setFixdt(fixdt);
dm.setExtnqty(extnqty);
dm.setBo_headcnfmyn(bo_headcnfmyn);
dm.setSearchflag(searchflag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 15 11:43:54 KST 2012 */