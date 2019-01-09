/***************************************************************************************************
* ���ϸ� : SS_A_QTYAPLC_VEXCDM.java
* ��� : �����濵-�μ�������û����- ������ ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * �����濵-�μ�������û����- ������ ���� DM
 */

public class SS_A_QTYAPLC_VEXCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String aplcdt;
	public String aplcno;
	public String medicd;
	public String basidt;
	public String issudt;
	public String basiqty;
	public String boaplcicdcqty;
	public String sendqty;
	public String incmgpers;

	public SS_A_QTYAPLC_VEXCDM(){}
	public SS_A_QTYAPLC_VEXCDM(String bocd, String aplcdt, String aplcno, String medicd, String basidt, String issudt, String basiqty, String boaplcicdcqty, String sendqty, String incmgpers){
		this.bocd = bocd;
		this.aplcdt = aplcdt;
		this.aplcno = aplcno;
		this.medicd = medicd;
		this.basidt = basidt;
		this.issudt = issudt;
		this.basiqty = basiqty;
		this.boaplcicdcqty = boaplcicdcqty;
		this.sendqty = sendqty;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setBasiqty(String basiqty){
		this.basiqty = basiqty;
	}

	public void setBoaplcicdcqty(String boaplcicdcqty){
		this.boaplcicdcqty = boaplcicdcqty;
	}

	public void setSendqty(String sendqty){
		this.sendqty = sendqty;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public String getBasiqty(){
		return this.basiqty;
	}

	public String getBoaplcicdcqty(){
		return this.boaplcicdcqty;
	}

	public String getSendqty(){
		return this.sendqty;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_QTYAPLC_VEXC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_QTYAPLC_VEXCDM dm = (SS_A_QTYAPLC_VEXCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.aplcdt);
		cstmt.setString(5, dm.aplcno);
		cstmt.setString(6, dm.medicd);
		cstmt.setString(7, dm.basidt);
		cstmt.setString(8, dm.issudt);
		cstmt.setString(9, dm.basiqty);
		cstmt.setString(10, dm.boaplcicdcqty);
		cstmt.setString(11, dm.sendqty);
		cstmt.setString(12, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_A_QTYAPLC_VEXCDataSet();
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
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String issudt = req.getParameter("issudt");
if( issudt == null){
	System.out.println(this.toString+" : issudt is null" );
}else{
	System.out.println(this.toString+" : issudt is "+issudt );
}
String basiqty = req.getParameter("basiqty");
if( basiqty == null){
	System.out.println(this.toString+" : basiqty is null" );
}else{
	System.out.println(this.toString+" : basiqty is "+basiqty );
}
String boaplcicdcqty = req.getParameter("boaplcicdcqty");
if( boaplcicdcqty == null){
	System.out.println(this.toString+" : boaplcicdcqty is null" );
}else{
	System.out.println(this.toString+" : boaplcicdcqty is "+boaplcicdcqty );
}
String sendqty = req.getParameter("sendqty");
if( sendqty == null){
	System.out.println(this.toString+" : sendqty is null" );
}else{
	System.out.println(this.toString+" : sendqty is "+sendqty );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String medicd = Util.checkString(req.getParameter("medicd"));
String basidt = Util.checkString(req.getParameter("basidt"));
String issudt = Util.checkString(req.getParameter("issudt"));
String basiqty = Util.checkString(req.getParameter("basiqty"));
String boaplcicdcqty = Util.checkString(req.getParameter("boaplcicdcqty"));
String sendqty = Util.checkString(req.getParameter("sendqty"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));
String basiqty = Util.Uni2Ksc(Util.checkString(req.getParameter("basiqty")));
String boaplcicdcqty = Util.Uni2Ksc(Util.checkString(req.getParameter("boaplcicdcqty")));
String sendqty = Util.Uni2Ksc(Util.checkString(req.getParameter("sendqty")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setAplcdt(aplcdt);
dm.setAplcno(aplcno);
dm.setMedicd(medicd);
dm.setBasidt(basidt);
dm.setIssudt(issudt);
dm.setBasiqty(basiqty);
dm.setBoaplcicdcqty(boaplcicdcqty);
dm.setSendqty(sendqty);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 28 10:59:25 KST 2004 */