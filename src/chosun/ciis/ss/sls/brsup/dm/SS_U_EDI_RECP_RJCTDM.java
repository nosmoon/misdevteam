/***************************************************************************************************
* ���ϸ� : SS_U_EDI_RECP_RJCTDM.java
* ��� : ����EDI Reject����
* �ۼ����� : 2004-03-18
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ����EDI Reject����
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
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String acqdt = Util.checkString(req.getParameter("acqdt"));
String acqno = Util.checkString(req.getParameter("acqno"));
String girono = Util.checkString(req.getParameter("girono"));
String seq = Util.checkString(req.getParameter("seq"));
String custbrwsno = Util.checkString(req.getParameter("custbrwsno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String acqno = Util.Uni2Ksc(Util.checkString(req.getParameter("acqno")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String custbrwsno = Util.Uni2Ksc(Util.checkString(req.getParameter("custbrwsno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setAcqdt(acqdt);
dm.setAcqno(acqno);
dm.setGirono(girono);
dm.setSeq(seq);
dm.setCustbrwsno(custbrwsno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 18 15:30:03 KST 2004 */