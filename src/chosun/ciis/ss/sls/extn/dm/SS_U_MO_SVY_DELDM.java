/***************************************************************************************************
* ���ϸ� : SS_U_MO_SVY_DELDM.java
* ��� : Ȯ�����-�������˵��ڰ���-�������-������(������� ���ڼ��� �ϰ�����)
* �ۼ����� : 2016.03.08
* �ۼ��� : 	�弱��
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


public class SS_U_MO_SVY_DELDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String campid;
	public String svyid;
	public String uid;

	public SS_U_MO_SVY_DELDM(){}
	public SS_U_MO_SVY_DELDM(String campid, String svyid, String uid){
		this.campid = campid;
		this.svyid = svyid;
		this.uid = uid;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getUid(){
		return this.uid;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_MO_SVY_DEL( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_MO_SVY_DELDM dm = (SS_U_MO_SVY_DELDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.campid);
		cstmt.setString(4, dm.svyid);
		cstmt.setString(5, dm.uid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_MO_SVY_DELDataSet();
	}



    public void print(){
        System.out.println("campid = " + getCampid());
        System.out.println("svyid = " + getSvyid());
        System.out.println("uid = " + getUid());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
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

String campid = Util.checkString(req.getParameter("campid"));
String svyid = Util.checkString(req.getParameter("svyid"));
String uid = Util.checkString(req.getParameter("uid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCampid(campid);
dm.setSvyid(svyid);
dm.setUid(uid);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 18 15:28:59 KST 2016 */