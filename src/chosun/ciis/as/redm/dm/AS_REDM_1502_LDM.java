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


public class AS_REDM_1502_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String redm_yymm;

	public AS_REDM_1502_LDM(){}
	public AS_REDM_1502_LDM(String cmpy_cd, String redm_yymm){
		this.cmpy_cd = cmpy_cd;
		this.redm_yymm = redm_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRedm_yymm(String redm_yymm){
		this.redm_yymm = redm_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRedm_yymm(){
		return this.redm_yymm;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_REDM_1502_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_REDM_1502_LDM dm = (AS_REDM_1502_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.redm_yymm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.redm.ds.AS_REDM_1502_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("redm_dt = [" + getRedm_yymm() + "]");
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
String redm_dt = req.getParameter("redm_dt");
if( redm_dt == null){
	System.out.println(this.toString+" : redm_dt is null" );
}else{
	System.out.println(this.toString+" : redm_dt is "+redm_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String redm_dt = Util.checkString(req.getParameter("redm_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String redm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRedm_dt(redm_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 08 16:32:49 KST 2009 */