/***************************************************************************************************
 * ���ϸ�   : PS_U_EXTN_BO_ASINDM.java
 * ���     : ����-�������ó�� ����
 * �ۼ����� : 2004-03-03
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * ����-�������ó�� ����
 */

public class PS_U_EXTN_BO_ASINDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String extnboasinarr;

	public PS_U_EXTN_BO_ASINDM(){}
	public PS_U_EXTN_BO_ASINDM(String cmpycd, String incmgpers, String extnboasinarr){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.extnboasinarr = extnboasinarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setExtnboasinarr(String extnboasinarr){
		this.extnboasinarr = extnboasinarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getExtnboasinarr(){
		return this.extnboasinarr;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_EXTN_BO_ASIN( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_EXTN_BO_ASINDM dm = (PS_U_EXTN_BO_ASINDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.extnboasinarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_U_EXTN_BO_ASINDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String extnboasinarr = req.getParameter("extnboasinarr");
if( extnboasinarr == null){
	System.out.println(this.toString+" : extnboasinarr is null" );
}else{
	System.out.println(this.toString+" : extnboasinarr is "+extnboasinarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String extnboasinarr = Util.checkString(req.getParameter("extnboasinarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String extnboasinarr = Util.Uni2Ksc(Util.checkString(req.getParameter("extnboasinarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setExtnboasinarr(extnboasinarr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 03 19:20:33 KST 2004 */