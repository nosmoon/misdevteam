/***************************************************************************************************
* 파일명 : PS_U_APLCINFO.java
* 기능   : 자동이체신청 상세수정
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체신청 상세수정
 *
 */

public class PS_U_APLCINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String aplcno;
	public String shftclsf;
	public String aplcdt;
	public String pymtstrtdt;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String closyn;
	public String remk;

	public PS_U_APLCINFODM(){}
	public PS_U_APLCINFODM(String bocd, String incmgpers, String aplcno, String shftclsf, String aplcdt, String pymtstrtdt, String rdr_no, String medicd, String termsubsno, String closyn, String remk){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.aplcno = aplcno;
		this.shftclsf = shftclsf;
		this.aplcdt = aplcdt;
		this.pymtstrtdt = pymtstrtdt;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.closyn = closyn;
		this.remk = remk;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setPymtstrtdt(String pymtstrtdt){
		this.pymtstrtdt = pymtstrtdt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getPymtstrtdt(){
		return this.pymtstrtdt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_APLCINFO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_APLCINFODM dm = (PS_U_APLCINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.aplcno);
		cstmt.setString(6, dm.shftclsf);
		cstmt.setString(7, dm.aplcdt);
		cstmt.setString(8, dm.pymtstrtdt);
		cstmt.setString(9, dm.rdr_no);
		cstmt.setString(10, dm.medicd);
		cstmt.setString(11, dm.termsubsno);
		cstmt.setString(12, dm.closyn);
		cstmt.setString(13, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_U_APLCINFODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String pymtstrtdt = req.getParameter("pymtstrtdt");
if( pymtstrtdt == null){
	System.out.println(this.toString+" : pymtstrtdt is null" );
}else{
	System.out.println(this.toString+" : pymtstrtdt is "+pymtstrtdt );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
String closyn = req.getParameter("closyn");
if( closyn == null){
	System.out.println(this.toString+" : closyn is null" );
}else{
	System.out.println(this.toString+" : closyn is "+closyn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String pymtstrtdt = Util.checkString(req.getParameter("pymtstrtdt"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String closyn = Util.checkString(req.getParameter("closyn"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String pymtstrtdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtstrtdt")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAplcno(aplcno);
dm.setShftclsf(shftclsf);
dm.setAplcdt(aplcdt);
dm.setPymtstrtdt(pymtstrtdt);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setClosyn(closyn);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 21 18:19:55 KST 2006 */