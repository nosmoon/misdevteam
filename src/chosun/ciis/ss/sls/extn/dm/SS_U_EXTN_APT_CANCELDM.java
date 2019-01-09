/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���־���Ʈ���� �������ó��
* �ۼ����� : 2009-05-19
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
 * ���־���Ʈ���� �������ó��
 */

public class SS_U_EXTN_APT_CANCELDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String aptcd;

	public SS_U_EXTN_APT_CANCELDM(){}
	public SS_U_EXTN_APT_CANCELDM(String uid, String aptcd){
		this.uid = uid;
		this.aptcd = aptcd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setAptcd(String aptcd){
		this.aptcd = aptcd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getAptcd(){
		return this.aptcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_EXTN_APT_CANCEL( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_EXTN_APT_CANCELDM dm = (SS_U_EXTN_APT_CANCELDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.aptcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_EXTN_APT_CANCELDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String aptcd = req.getParameter("aptcd");
if( aptcd == null){
	System.out.println(this.toString+" : aptcd is null" );
}else{
	System.out.println(this.toString+" : aptcd is "+aptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String uid = Util.checkString(req.getParameter("uid"));
String aptcd = Util.checkString(req.getParameter("aptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String aptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setUid(uid);
dm.setAptcd(aptcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 19 16:29:26 KST 2009 */