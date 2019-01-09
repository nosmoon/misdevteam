/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-�μ�����-��û(����)-����
* �ۼ����� : 2009-07-21
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * �����濵-�μ�����-��û(����)-����
 */

public class SS_U_QTYAPLC_CLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String aplcdt;
	public String prvissudt;
	public String issudt;
	public String mediinfo;
	public String closyn;
	public String incmgpers;

	public SS_U_QTYAPLC_CLOSDM(){}
	public SS_U_QTYAPLC_CLOSDM(String bocd, String aplcdt, String prvissudt, String issudt, String mediinfo, String closyn, String incmgpers){
		this.bocd = bocd;
		this.aplcdt = aplcdt;
		this.prvissudt = prvissudt;
		this.issudt = issudt;
		this.mediinfo = mediinfo;
		this.closyn = closyn;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setPrvissudt(String prvissudt){
		this.prvissudt = prvissudt;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setMediinfo(String mediinfo){
		this.mediinfo = mediinfo;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
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

	public String getPrvissudt(){
		return this.prvissudt;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public String getMediinfo(){
		return this.mediinfo;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_QTYAPLC_CLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_QTYAPLC_CLOSDM dm = (SS_U_QTYAPLC_CLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.aplcdt);
		cstmt.setString(5, dm.prvissudt);
		cstmt.setString(6, dm.issudt);
		cstmt.setString(7, dm.mediinfo);
		cstmt.setString(8, dm.closyn);
		cstmt.setString(9, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_U_QTYAPLC_CLOSDataSet();
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
String prvissudt = req.getParameter("prvissudt");
if( prvissudt == null){
	System.out.println(this.toString+" : prvissudt is null" );
}else{
	System.out.println(this.toString+" : prvissudt is "+prvissudt );
}
String issudt = req.getParameter("issudt");
if( issudt == null){
	System.out.println(this.toString+" : issudt is null" );
}else{
	System.out.println(this.toString+" : issudt is "+issudt );
}
String mediinfo = req.getParameter("mediinfo");
if( mediinfo == null){
	System.out.println(this.toString+" : mediinfo is null" );
}else{
	System.out.println(this.toString+" : mediinfo is "+mediinfo );
}
String closyn = req.getParameter("closyn");
if( closyn == null){
	System.out.println(this.toString+" : closyn is null" );
}else{
	System.out.println(this.toString+" : closyn is "+closyn );
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
String prvissudt = Util.checkString(req.getParameter("prvissudt"));
String issudt = Util.checkString(req.getParameter("issudt"));
String mediinfo = Util.checkString(req.getParameter("mediinfo"));
String closyn = Util.checkString(req.getParameter("closyn"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String prvissudt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvissudt")));
String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));
String mediinfo = Util.Uni2Ksc(Util.checkString(req.getParameter("mediinfo")));
String closyn = Util.Uni2Ksc(Util.checkString(req.getParameter("closyn")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setAplcdt(aplcdt);
dm.setPrvissudt(prvissudt);
dm.setIssudt(issudt);
dm.setMediinfo(mediinfo);
dm.setClosyn(closyn);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 20 21:03:46 KST 2009 */