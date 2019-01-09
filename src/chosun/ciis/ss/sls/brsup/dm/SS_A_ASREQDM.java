/**************************************************************************************************
* 파일명    : .java
* 기능      : 판매국-지국지원-컴퓨터AS
* 작성일자  : 2004-03-12
* 작성자    : 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */

public class SS_A_ASREQDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String bocd;
	public String eqpno;
	public String regno;
	public String regdt;
	public String req_rmk;
	public String as_stat;

	public SS_A_ASREQDM(){}
	public SS_A_ASREQDM(String accflag, String incmgpers, String bocd, String eqpno, String regno, String regdt, String req_rmk, String as_stat){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.eqpno = eqpno;
		this.regno = regno;
		this.regdt = regdt;
		this.req_rmk = req_rmk;
		this.as_stat = as_stat;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setEqpno(String eqpno){
		this.eqpno = eqpno;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setReq_rmk(String req_rmk){
		this.req_rmk = req_rmk;
	}

	public void setAs_stat(String as_stat){
		this.as_stat = as_stat;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getEqpno(){
		return this.eqpno;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getReq_rmk(){
		return this.req_rmk;
	}

	public String getAs_stat(){
		return this.as_stat;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_ASREQ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_ASREQDM dm = (SS_A_ASREQDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.eqpno);
		cstmt.setString(7, dm.regno);
		cstmt.setString(8, dm.regdt);
		cstmt.setString(9, dm.req_rmk);
		cstmt.setString(10, dm.as_stat);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_A_ASREQDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String eqpno = req.getParameter("eqpno");
if( eqpno == null){
	System.out.println(this.toString+" : eqpno is null" );
}else{
	System.out.println(this.toString+" : eqpno is "+eqpno );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String req_rmk = req.getParameter("req_rmk");
if( req_rmk == null){
	System.out.println(this.toString+" : req_rmk is null" );
}else{
	System.out.println(this.toString+" : req_rmk is "+req_rmk );
}
String as_stat = req.getParameter("as_stat");
if( as_stat == null){
	System.out.println(this.toString+" : as_stat is null" );
}else{
	System.out.println(this.toString+" : as_stat is "+as_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String eqpno = Util.checkString(req.getParameter("eqpno"));
String regno = Util.checkString(req.getParameter("regno"));
String regdt = Util.checkString(req.getParameter("regdt"));
String req_rmk = Util.checkString(req.getParameter("req_rmk"));
String as_stat = Util.checkString(req.getParameter("as_stat"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String eqpno = Util.Uni2Ksc(Util.checkString(req.getParameter("eqpno")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String req_rmk = Util.Uni2Ksc(Util.checkString(req.getParameter("req_rmk")));
String as_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("as_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setEqpno(eqpno);
dm.setRegno(regno);
dm.setRegdt(regdt);
dm.setReq_rmk(req_rmk);
dm.setAs_stat(as_stat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 12 16:23:52 KST 2004 */