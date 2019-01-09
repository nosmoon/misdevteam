/***************************************************************************************************
 * ���ϸ�   : CO_A_CYBALONCLOSDM.java
 * ���     : ���̹�����-���̹����縶�� ���������
 * �ۼ����� : 2005-07-27
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
 * ���̹�����-���̹����縶�� ���������
 */

public class CO_A_CYBALONCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String closyymm;

	public CO_A_CYBALONCLOSDM(){}
	public CO_A_CYBALONCLOSDM(String accflag, String closyymm){
		this.accflag = accflag;
		this.closyymm = closyymm;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_CYBALONCLOS( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_CYBALONCLOSDM dm = (CO_A_CYBALONCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.closyymm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.CO_A_CYBALONCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.checkString(req.getParameter("accflag"));
String closyymm = Util.checkString(req.getParameter("closyymm"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAccflag(accflag);
dm.setClosyymm(closyymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 27 17:23:13 KST 2005 */