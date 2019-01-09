/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_4001_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_cd_3;

	public MT_PAPORD_4001_MDM(){}
	public MT_PAPORD_4001_MDM(String cmpy_cd, String mang_cd_3){
		this.cmpy_cd = cmpy_cd;
		this.mang_cd_3 = mang_cd_3;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_4001_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_4001_MDM dm = (MT_PAPORD_4001_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_cd_3);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_4001_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_cd_3 = [" + getMang_cd_3() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mang_cd_3 = req.getParameter("mang_cd_3");
if( mang_cd_3 == null){
	System.out.println(this.toString+" : mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_3 is "+mang_cd_3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_cd_3(mang_cd_3);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 09 14:17:09 KST 2009 */