/***************************************************************************************************
* 파일명   : SP_PS_I_RETN_PTCR_LUMP.java
* 기능     : 반송관리 excelupload 일괄저장
* 작성일자 : 2008-08-13
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 반송내역 excelupload 일괄저장처리
 *
 */

public class PS_I_RETN_PTCR_LUMPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String retndt;
	public String retnclsf;
	public String retn_nmno;
	public String retnresncd;
	public String boprocyn;

	public PS_I_RETN_PTCR_LUMPDM(){}
	public PS_I_RETN_PTCR_LUMPDM(String bocd, String incmgpers, String rdr_no, String medicd, String termsubsno, String retndt, String retnclsf, String retn_nmno, String retnresncd, String boprocyn){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.retndt = retndt;
		this.retnclsf = retnclsf;
		this.retn_nmno = retn_nmno;
		this.retnresncd = retnresncd;
		this.boprocyn = boprocyn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
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

	public void setRetndt(String retndt){
		this.retndt = retndt;
	}

	public void setRetnclsf(String retnclsf){
		this.retnclsf = retnclsf;
	}

	public void setRetn_nmno(String retn_nmno){
		this.retn_nmno = retn_nmno;
	}

	public void setRetnresncd(String retnresncd){
		this.retnresncd = retnresncd;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
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

	public String getRetndt(){
		return this.retndt;
	}

	public String getRetnclsf(){
		return this.retnclsf;
	}

	public String getRetn_nmno(){
		return this.retn_nmno;
	}

	public String getRetnresncd(){
		return this.retnresncd;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_RETN_PTCR_LUMP( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_RETN_PTCR_LUMPDM dm = (PS_I_RETN_PTCR_LUMPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.termsubsno);
		cstmt.setString(8, dm.retndt);
		cstmt.setString(9, dm.retnclsf);
		cstmt.setString(10, dm.retn_nmno);
		cstmt.setString(11, dm.retnresncd);
		cstmt.setString(12, dm.boprocyn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_I_RETN_PTCR_LUMPDataSet();
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
String retndt = req.getParameter("retndt");
if( retndt == null){
	System.out.println(this.toString+" : retndt is null" );
}else{
	System.out.println(this.toString+" : retndt is "+retndt );
}
String retnclsf = req.getParameter("retnclsf");
if( retnclsf == null){
	System.out.println(this.toString+" : retnclsf is null" );
}else{
	System.out.println(this.toString+" : retnclsf is "+retnclsf );
}
String retn_nmno = req.getParameter("retn_nmno");
if( retn_nmno == null){
	System.out.println(this.toString+" : retn_nmno is null" );
}else{
	System.out.println(this.toString+" : retn_nmno is "+retn_nmno );
}
String retnresncd = req.getParameter("retnresncd");
if( retnresncd == null){
	System.out.println(this.toString+" : retnresncd is null" );
}else{
	System.out.println(this.toString+" : retnresncd is "+retnresncd );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String retndt = Util.checkString(req.getParameter("retndt"));
String retnclsf = Util.checkString(req.getParameter("retnclsf"));
String retn_nmno = Util.checkString(req.getParameter("retn_nmno"));
String retnresncd = Util.checkString(req.getParameter("retnresncd"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String retndt = Util.Uni2Ksc(Util.checkString(req.getParameter("retndt")));
String retnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("retnclsf")));
String retn_nmno = Util.Uni2Ksc(Util.checkString(req.getParameter("retn_nmno")));
String retnresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("retnresncd")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setRetndt(retndt);
dm.setRetnclsf(retnclsf);
dm.setRetn_nmno(retn_nmno);
dm.setRetnresncd(retnresncd);
dm.setBoprocyn(boprocyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 13 19:04:16 KST 2008 */