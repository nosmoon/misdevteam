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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1203_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dt;

	public AS_LEAS_1203_LDM(){}
	public AS_LEAS_1203_LDM(String cmpy_cd, String clam_dt){
		this.cmpy_cd = cmpy_cd;
		this.clam_dt = clam_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1203_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1203_LDM dm = (AS_LEAS_1203_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1203_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_dt = [" + getClam_dt() + "]");
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
String clam_dt = req.getParameter("clam_dt");
if( clam_dt == null){
	System.out.println(this.toString+" : clam_dt is null" );
}else{
	System.out.println(this.toString+" : clam_dt is "+clam_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dt = Util.checkString(req.getParameter("clam_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dt(clam_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 18 16:51:33 KST 2009 */