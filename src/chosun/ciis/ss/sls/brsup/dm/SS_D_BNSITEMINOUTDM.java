/***************************************************************************************************
* ���ϸ� : .java
* ��� : �������������ý���-���˹������Ȳ-����ȸ ����
* �ۼ����� : 2009-05-13
* �ۼ��� : ����
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * �������������ý���-���˹������Ȳ-����ȸ ����
 */

public class SS_D_BNSITEMINOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;
	public String bns_itemcd;
	public String cmpycd;
	public String whcd;

	public SS_D_BNSITEMINOUTDM(){}
	public SS_D_BNSITEMINOUTDM(String seq, String bns_itemcd, String cmpycd, String whcd){
		this.seq = seq;
		this.bns_itemcd = bns_itemcd;
		this.cmpycd = cmpycd;
		this.whcd = whcd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setWhcd(String whcd){
		this.whcd = whcd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getWhcd(){
		return this.whcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_D_BNSITEMINOUT( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_D_BNSITEMINOUTDM dm = (SS_D_BNSITEMINOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
		cstmt.setString(4, dm.bns_itemcd);
		cstmt.setString(5, dm.cmpycd);
		cstmt.setString(6, dm.whcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_D_BNSITEMINOUTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String whcd = req.getParameter("whcd");
if( whcd == null){
	System.out.println(this.toString+" : whcd is null" );
}else{
	System.out.println(this.toString+" : whcd is "+whcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.checkString(req.getParameter("seq"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String whcd = Util.checkString(req.getParameter("whcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String whcd = Util.Uni2Ksc(Util.checkString(req.getParameter("whcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSeq(seq);
dm.setBns_itemcd(bns_itemcd);
dm.setCmpycd(cmpycd);
dm.setWhcd(whcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 13 11:29:47 PDT 2009 */