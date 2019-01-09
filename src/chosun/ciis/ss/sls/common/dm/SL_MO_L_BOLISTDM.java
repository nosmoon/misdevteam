/***************************************************************************************************
* ���ϸ� : SL_MO_L_BOLISTDM.java
* ��� : �����ڵ�-���͸���Ʈ��ȸ
* �ۼ����� : 2016-12-14
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;
/**
 *
 */


public class SL_MO_L_BOLISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String areacd;
	public String uid;

	public SL_MO_L_BOLISTDM(){}
	public SL_MO_L_BOLISTDM(String areacd, String uid){
		this.areacd = areacd;
		this.uid = uid;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getSQL(){
		 return "{ call SP_SL_MO_L_BOLIST( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_MO_L_BOLISTDM dm = (SL_MO_L_BOLISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.areacd);
		cstmt.setString(4, dm.uid);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SL_MO_L_BOLISTDataSet();
	}



    public void print(){
        System.out.println("areacd = " + getAreacd());
        System.out.println("uid = " + getUid());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
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

String areacd = Util.checkString(req.getParameter("areacd"));
String uid = Util.checkString(req.getParameter("uid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAreacd(areacd);
dm.setUid(uid);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 15 14:11:16 KST 2016 */