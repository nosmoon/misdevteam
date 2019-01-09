/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SL_U_EXTNCLOS_JM_ISSUPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;
	public String chgid;

	public SL_U_EXTNCLOS_JM_ISSUPDM(){}
	public SL_U_EXTNCLOS_JM_ISSUPDM(String closmm, String chgid){
		this.closmm = closmm;
		this.chgid = chgid;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setChgid(String chgid){
		this.chgid = chgid;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getChgid(){
		return this.chgid;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_U_EXTNCLOS_JM_ISSUP(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_U_EXTNCLOS_JM_ISSUPDM dm = (SL_U_EXTNCLOS_JM_ISSUPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.setString(4, dm.chgid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_U_EXTNCLOS_JM_ISSUPDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
		System.out.println("chgid = [" + getChgid() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
String chgid = req.getParameter("chgid");
if( chgid == null){
	System.out.println(this.toString+" : chgid is null" );
}else{
	System.out.println(this.toString+" : chgid is "+chgid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String closmm = Util.checkString(req.getParameter("closmm"));
String chgid = Util.checkString(req.getParameter("chgid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
String chgid = Util.Uni2Ksc(Util.checkString(req.getParameter("chgid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setClosmm(closmm);
dm.setChgid(chgid);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Mar 01 15:20:16 KST 2015 */