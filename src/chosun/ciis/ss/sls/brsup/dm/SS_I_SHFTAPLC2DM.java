/***************************************************************************************************
* ���ϸ� : SS_I_SHFTAPLC2DM.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�ڵ���ü�ű�/������û
* �ۼ����� : 2004-04-09
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
 * ������������-Billing�ڵ���ü-�����ڰ���-�ڵ���ü�ű�/������û
 *
 */


public class SS_I_SHFTAPLC2DM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String pymtseq;
	public String rdr_no;
	public String medicd;
	public String accflag;

	public SS_I_SHFTAPLC2DM(){}
	public SS_I_SHFTAPLC2DM(String incmgpers, String pymtseq, String rdr_no, String medicd, String accflag){
		this.incmgpers = incmgpers;
		this.pymtseq = pymtseq;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_SHFTAPLC2( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_SHFTAPLC2DM dm = (SS_I_SHFTAPLC2DM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.pymtseq);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.accflag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_I_SHFTAPLC2DataSet();
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
String pymtseq = req.getParameter("pymtseq");
if( pymtseq == null){
	System.out.println(this.toString+" : pymtseq is null" );
}else{
	System.out.println(this.toString+" : pymtseq is "+pymtseq );
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String pymtseq = Util.checkString(req.getParameter("pymtseq"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String accflag = Util.checkString(req.getParameter("accflag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String pymtseq = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtseq")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setPymtseq(pymtseq);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setAccflag(accflag);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 09 16:55:25 KST 2004 */