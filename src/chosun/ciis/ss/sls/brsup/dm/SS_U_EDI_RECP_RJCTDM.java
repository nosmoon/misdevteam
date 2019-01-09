/***************************************************************************************************
* 파일명 : SS_U_EDI_RECP_RJCTDM.java
* 기능 : 지로EDI Reject보정
* 작성일자 : 2004-03-18
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지로EDI Reject보정
 *
 */


public class SS_U_EDI_RECP_RJCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String acqdt;
	public String acqno;
	public String girono;
	public String seq;
	public String custbrwsno;

	public SS_U_EDI_RECP_RJCTDM(){}
	public SS_U_EDI_RECP_RJCTDM(String incmgpers, String acqdt, String acqno, String girono, String seq, String custbrwsno){
		this.incmgpers = incmgpers;
		this.acqdt = acqdt;
		this.acqno = acqno;
		this.girono = girono;
		this.seq = seq;
		this.custbrwsno = custbrwsno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCustbrwsno(String custbrwsno){
		this.custbrwsno = custbrwsno;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAcqno(){
		return this.acqno;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCustbrwsno(){
		return this.custbrwsno;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_EDI_RECP_RJCT( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EDI_RECP_RJCTDM dm = (SS_U_EDI_RECP_RJCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.acqdt);
		cstmt.setString(5, dm.acqno);
		cstmt.setString(6, dm.girono);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.custbrwsno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_EDI_RECP_RJCTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
}
String acqno = req.getParameter("acqno");
if( acqno == null){
	System.out.println(this.toString+" : acqno is null" );
}else{
	System.out.println(this.toString+" : acqno is "+acqno );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String custbrwsno = req.getParameter("custbrwsno");
if( custbrwsno == null){
	System.out.println(this.toString+" : custbrwsno is null" );
}else{
	System.out.println(this.toString+" : custbrwsno is "+custbrwsno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String acqdt = Util.checkString(req.getParameter("acqdt"));
String acqno = Util.checkString(req.getParameter("acqno"));
String girono = Util.checkString(req.getParameter("girono"));
String seq = Util.checkString(req.getParameter("seq"));
String custbrwsno = Util.checkString(req.getParameter("custbrwsno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String acqno = Util.Uni2Ksc(Util.checkString(req.getParameter("acqno")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String custbrwsno = Util.Uni2Ksc(Util.checkString(req.getParameter("custbrwsno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAcqdt(acqdt);
dm.setAcqno(acqno);
dm.setGirono(girono);
dm.setSeq(seq);
dm.setCustbrwsno(custbrwsno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 18 15:30:03 KST 2004 */