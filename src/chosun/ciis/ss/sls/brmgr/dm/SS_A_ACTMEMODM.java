/***************************************************************************************************
 * 파일명   : SS_A_ACTMEMODM.java
 * 기능     : 지국경영-아파트투입율-활동사항(조회,수정,삭제f)
 * 작성일자 : 2005/11/02
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  지국경영-아파트투입율-활동사항(조회,수정,삭제)
**/

public class SS_A_ACTMEMODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String invsgdt;
	public String invsgno;
	public String addrcd;
	public String dongno;
	public String actmemo;
	public String incmgpers;

	public SS_A_ACTMEMODM(){}
	public SS_A_ACTMEMODM(String accflag, String invsgdt, String invsgno, String addrcd, String dongno, String actmemo, String incmgpers){
		this.accflag = accflag;
		this.invsgdt = invsgdt;
		this.invsgno = invsgno;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.actmemo = actmemo;
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setActmemo(String actmemo){
		this.actmemo = actmemo;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getActmemo(){
		return this.actmemo;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_ACTMEMO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_ACTMEMODM dm = (SS_A_ACTMEMODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.invsgdt);
		cstmt.setString(5, dm.invsgno);
		cstmt.setString(6, dm.addrcd);
		cstmt.setString(7, dm.dongno);
		cstmt.setString(8, dm.actmemo);
		cstmt.setString(9, dm.incmgpers);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_A_ACTMEMODataSet();
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
String invsgdt = req.getParameter("invsgdt");
if( invsgdt == null){
	System.out.println(this.toString+" : invsgdt is null" );
}else{
	System.out.println(this.toString+" : invsgdt is "+invsgdt );
}
String invsgno = req.getParameter("invsgno");
if( invsgno == null){
	System.out.println(this.toString+" : invsgno is null" );
}else{
	System.out.println(this.toString+" : invsgno is "+invsgno );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
}
String actmemo = req.getParameter("actmemo");
if( actmemo == null){
	System.out.println(this.toString+" : actmemo is null" );
}else{
	System.out.println(this.toString+" : actmemo is "+actmemo );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String invsgno = Util.checkString(req.getParameter("invsgno"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String actmemo = Util.checkString(req.getParameter("actmemo"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String invsgno = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgno")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String actmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("actmemo")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setInvsgdt(invsgdt);
dm.setInvsgno(invsgno);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setActmemo(actmemo);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 02 14:06:03 KST 2005 */