/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ-����Ȯ��- ��������� ����
* �ۼ����� : 2009-06-09
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-����Ȯ��- ��������� ����  
 */

public class SS_I_EXTN_HDQT_ALERTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String valmm;
	public String uid;

	public SS_I_EXTN_HDQT_ALERTDM(){}
	public SS_I_EXTN_HDQT_ALERTDM(String valmm, String uid){
		this.valmm = valmm;
		this.uid = uid;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getUid(){
		return this.uid;
	}

	public String getSQL(){
		 return "{ call SP_SS_I_EXTN_HDQT_ALERT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_EXTN_HDQT_ALERTDM dm = (SS_I_EXTN_HDQT_ALERTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.valmm);
		cstmt.setString(4, dm.uid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_EXTN_HDQT_ALERTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String valmm = Util.checkString(req.getParameter("valmm"));
String uid = Util.checkString(req.getParameter("uid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setValmm(valmm);
dm.setUid(uid);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 12 10:04:50 KST 2009 */