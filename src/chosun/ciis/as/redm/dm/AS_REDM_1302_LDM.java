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


package chosun.ciis.as.redm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.redm.ds.*;
import chosun.ciis.as.redm.rec.*;

/**
 * 
 */


public class AS_REDM_1302_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt;
	public String redm_mthd_cd;

	public AS_REDM_1302_LDM(){}
	public AS_REDM_1302_LDM(String cmpy_cd, String aply_dt, String redm_mthd_cd){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_REDM_1302_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_REDM_1302_LDM dm = (AS_REDM_1302_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt);
		cstmt.setString(5, dm.redm_mthd_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.redm.ds.AS_REDM_1302_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("redm_mthd_cd = [" + getRedm_mthd_cd() + "]");
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
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String redm_mthd_cd = req.getParameter("redm_mthd_cd");
if( redm_mthd_cd == null){
	System.out.println(this.toString+" : redm_mthd_cd is null" );
}else{
	System.out.println(this.toString+" : redm_mthd_cd is "+redm_mthd_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String redm_mthd_cd = Util.checkString(req.getParameter("redm_mthd_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String redm_mthd_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_mthd_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setRedm_mthd_cd(redm_mthd_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 07 10:00:06 KST 2009 */