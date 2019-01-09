/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������-�ϰ� �����ȣ ����ó��-��ȸ
* �ۼ����� : 2009-05-08
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�ϰ� �����ȣ ����ó��-��ȸ
 */

public class SS_L_BATZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String zipcode;
	public String areagubun;
	public String areaname;
	public String bocd;

	public SS_L_BATZIPCODEDM(){}
	public SS_L_BATZIPCODEDM(String uid, String zipcode, String areagubun, String areaname, String bocd){
		this.uid = uid;
		this.zipcode = zipcode;
		this.areagubun = areagubun;
		this.areaname = areaname;
		this.bocd = bocd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAreagubun(String areagubun){
		this.areagubun = areagubun;
	}

	public void setAreaname(String areaname){
		this.areaname = areaname;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAreagubun(){
		return this.areagubun;
	}

	public String getAreaname(){
		return this.areaname;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BATZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BATZIPCODEDM dm = (SS_L_BATZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.zipcode);
		cstmt.setString(5, dm.areagubun);
		cstmt.setString(6, dm.areaname);
		cstmt.setString(7, dm.bocd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_BATZIPCODEDataSet();
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
String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String areagubun = req.getParameter("areagubun");
if( areagubun == null){
	System.out.println(this.toString+" : areagubun is null" );
}else{
	System.out.println(this.toString+" : areagubun is "+areagubun );
}
String areaname = req.getParameter("areaname");
if( areaname == null){
	System.out.println(this.toString+" : areaname is null" );
}else{
	System.out.println(this.toString+" : areaname is "+areaname );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String uid = Util.checkString(req.getParameter("uid"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String areagubun = Util.checkString(req.getParameter("areagubun"));
String areaname = Util.checkString(req.getParameter("areaname"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String areagubun = Util.Uni2Ksc(Util.checkString(req.getParameter("areagubun")));
String areaname = Util.Uni2Ksc(Util.checkString(req.getParameter("areaname")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setUid(uid);
dm.setZipcode(zipcode);
dm.setAreagubun(areagubun);
dm.setAreaname(areaname);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 08 14:33:51 KST 2009 */