/***************************************************************************************************
* ���ϸ� : SS_U_APLCINFODM.java
* ��� : ������������-Billing�ڵ���ü-��û����-������(����)��������
* �ۼ����� : 2004-03-26
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
 * ������������-Billing�ڵ���ü-��û����-������(����)��������
 *
 */


public class SS_U_APLCINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String aplcno;
	public String shftclsf;
	public String aplcdt;
	public String pymtstrtdt;
	public String rdr_no;
	public String medicd;
	public String rdrnatvno;
	public String closyn;

	public SS_U_APLCINFODM(){}
	public SS_U_APLCINFODM(String bocd, String incmgpers, String aplcno, String shftclsf, String aplcdt, String pymtstrtdt, String rdr_no, String medicd, String rdrnatvno, String closyn){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.aplcno = aplcno;
		this.shftclsf = shftclsf;
		this.aplcdt = aplcdt;
		this.pymtstrtdt = pymtstrtdt;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.rdrnatvno = rdrnatvno;
		this.closyn = closyn;
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

	public void setRdrnatvno(String rdrnatvno){
		this.rdrnatvno = rdrnatvno;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
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

	public String getRdrnatvno(){
		return this.rdrnatvno;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_APLCINFO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_APLCINFODM dm = (SS_U_APLCINFODM)bdm;
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
		cstmt.setString(11, dm.rdrnatvno);
		cstmt.setString(12, dm.closyn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_APLCINFODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String pymtstrtdt = Util.checkString(req.getParameter("pymtstrtdt"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String pymtstrtdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtstrtdt")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAplcno(aplcno);
dm.setShftclsf(shftclsf);
dm.setAplcdt(aplcdt);
dm.setPymtstrtdt(pymtstrtdt);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 29 17:24:04 KST 2004 */