/***************************************************************************************************
 * ���ϸ�   : SS_A_CYBALON_BOCLAMCNFMDM.java
 * ���     : ���̹�����-���̹�����û�� ����
 * �ۼ����� : 2005-06-21
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * ���̹�����-���̹�����û�� ����
 */

public class SS_A_CYBALON_BOCLAMCNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String listcnt;
	public String closyymm;
	public String bocdarr;
	public String clamtarr;
	public String hdqtcnfmynarr;

	public SS_A_CYBALON_BOCLAMCNFMDM(){}
	public SS_A_CYBALON_BOCLAMCNFMDM(String incmgpers, String listcnt, String closyymm, String bocdarr, String clamtarr, String hdqtcnfmynarr){
		this.incmgpers = incmgpers;
		this.listcnt = listcnt;
		this.closyymm = closyymm;
		this.bocdarr = bocdarr;
		this.clamtarr = clamtarr;
		this.hdqtcnfmynarr = hdqtcnfmynarr;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setListcnt(String listcnt){
		this.listcnt = listcnt;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setBocdarr(String bocdarr){
		this.bocdarr = bocdarr;
	}

	public void setClamtarr(String clamtarr){
		this.clamtarr = clamtarr;
	}

	public void setHdqtcnfmynarr(String hdqtcnfmynarr){
		this.hdqtcnfmynarr = hdqtcnfmynarr;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getListcnt(){
		return this.listcnt;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getBocdarr(){
		return this.bocdarr;
	}

	public String getClamtarr(){
		return this.clamtarr;
	}

	public String getHdqtcnfmynarr(){
		return this.hdqtcnfmynarr;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_CYBALON_BOCLAMCNFM( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_CYBALON_BOCLAMCNFMDM dm = (SS_A_CYBALON_BOCLAMCNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.listcnt);
		cstmt.setString(5, dm.closyymm);
		cstmt.setString(6, dm.bocdarr);
		cstmt.setString(7, dm.clamtarr);
		cstmt.setString(8, dm.hdqtcnfmynarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_A_CYBALON_BOCLAMCNFMDataSet();
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
String listcnt = req.getParameter("listcnt");
if( listcnt == null){
	System.out.println(this.toString+" : listcnt is null" );
}else{
	System.out.println(this.toString+" : listcnt is "+listcnt );
}
String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
String bocdarr = req.getParameter("bocdarr");
if( bocdarr == null){
	System.out.println(this.toString+" : bocdarr is null" );
}else{
	System.out.println(this.toString+" : bocdarr is "+bocdarr );
}
String clamtarr = req.getParameter("clamtarr");
if( clamtarr == null){
	System.out.println(this.toString+" : clamtarr is null" );
}else{
	System.out.println(this.toString+" : clamtarr is "+clamtarr );
}
String hdqtcnfmynarr = req.getParameter("hdqtcnfmynarr");
if( hdqtcnfmynarr == null){
	System.out.println(this.toString+" : hdqtcnfmynarr is null" );
}else{
	System.out.println(this.toString+" : hdqtcnfmynarr is "+hdqtcnfmynarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String listcnt = Util.checkString(req.getParameter("listcnt"));
String closyymm = Util.checkString(req.getParameter("closyymm"));
String bocdarr = Util.checkString(req.getParameter("bocdarr"));
String clamtarr = Util.checkString(req.getParameter("clamtarr"));
String hdqtcnfmynarr = Util.checkString(req.getParameter("hdqtcnfmynarr"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String listcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("listcnt")));
String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
String bocdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdarr")));
String clamtarr = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtarr")));
String hdqtcnfmynarr = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqtcnfmynarr")));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setListcnt(listcnt);
dm.setClosyymm(closyymm);
dm.setBocdarr(bocdarr);
dm.setClamtarr(clamtarr);
dm.setHdqtcnfmynarr(hdqtcnfmynarr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 21 21:50:58 KST 2005 */