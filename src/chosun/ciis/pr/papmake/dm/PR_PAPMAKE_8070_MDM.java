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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_8070_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_cd_1;

	public PR_PAPMAKE_8070_MDM(){}
	public PR_PAPMAKE_8070_MDM(String cmpy_cd, String mang_cd_1){
		this.cmpy_cd = cmpy_cd;
		this.mang_cd_1 = mang_cd_1;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_8070_M(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_8070_MDM dm = (PR_PAPMAKE_8070_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_cd_1);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_8070_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_cd_1 = [" + getMang_cd_1() + "]");
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
String mang_cd_1 = req.getParameter("mang_cd_1");
if( mang_cd_1 == null){
	System.out.println(this.toString+" : mang_cd_1 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_1 is "+mang_cd_1 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_1")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_cd_1(mang_cd_1);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 10 18:37:36 KST 2016 */