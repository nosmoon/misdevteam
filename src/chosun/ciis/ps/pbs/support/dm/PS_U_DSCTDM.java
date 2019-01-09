/***************************************************************************************************
 * 파일명   : SP_PS_U_DSCT.java
 * 기능     : 불편관리-불편처리 지사배정
 * 작성일자 : 2004-12-08
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편관리-불편처리 지사배정
 */

public class PS_U_DSCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdrbocd;
	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String boproccont;
	public String boprocyn;
	public String procpers;
	public String incmgpers;

	public PS_U_DSCTDM(){}
	public PS_U_DSCTDM(String regdt, String regno, String rdrbocd, String rdr_no, String medicd, String termsubsno, String boproccont, String boprocyn, String procpers, String incmgpers){
		this.regdt = regdt;
		this.regno = regno;
		this.rdrbocd = rdrbocd;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.boproccont = boproccont;
		this.boprocyn = boprocyn;
		this.procpers = procpers;
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdrbocd(String rdrbocd){
		this.rdrbocd = rdrbocd;
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

	public void setBoproccont(String boproccont){
		this.boproccont = boproccont;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdrbocd(){
		return this.rdrbocd;
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

	public String getBoproccont(){
		return this.boproccont;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_DSCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_DSCTDM dm = (PS_U_DSCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.regdt);
		cstmt.setString(4, dm.regno);
		cstmt.setString(5, dm.rdrbocd);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.termsubsno);
		cstmt.setString(9, dm.boproccont);
		cstmt.setString(10, dm.boprocyn);
		cstmt.setString(11, dm.procpers);
		cstmt.setString(12, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_U_DSCTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String rdrbocd = req.getParameter("rdrbocd");
if( rdrbocd == null){
	System.out.println(this.toString+" : rdrbocd is null" );
}else{
	System.out.println(this.toString+" : rdrbocd is "+rdrbocd );
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
String boproccont = req.getParameter("boproccont");
if( boproccont == null){
	System.out.println(this.toString+" : boproccont is null" );
}else{
	System.out.println(this.toString+" : boproccont is "+boproccont );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String procpers = req.getParameter("procpers");
if( procpers == null){
	System.out.println(this.toString+" : procpers is null" );
}else{
	System.out.println(this.toString+" : procpers is "+procpers );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rdrbocd = Util.checkString(req.getParameter("rdrbocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String boproccont = Util.checkString(req.getParameter("boproccont"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String procpers = Util.checkString(req.getParameter("procpers"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rdrbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrbocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String boproccont = Util.Uni2Ksc(Util.checkString(req.getParameter("boproccont")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRdrbocd(rdrbocd);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setTermsubsno(termsubsno);
dm.setBoproccont(boproccont);
dm.setBoprocyn(boprocyn);
dm.setProcpers(procpers);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 09 19:36:12 KST 2004 */