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


public class AS_REDM_1201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String redm_yymm;

	public AS_REDM_1201_LDM(){}
	public AS_REDM_1201_LDM(String cmpy_cd, String redm_yymm){
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
		 return "{ call MISAST.SP_AS_REDM_1201_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_REDM_1201_LDM dm = (AS_REDM_1201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.redm_yymm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.redm.ds.AS_REDM_1201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("redm_yymm = [" + getRedm_yymm() + "]");
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
String redm_yymm = req.getParameter("redm_yymm");
if( redm_yymm == null){
	System.out.println(this.toString+" : redm_yymm is null" );
}else{
	System.out.println(this.toString+" : redm_yymm is "+redm_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String redm_yymm = Util.checkString(req.getParameter("redm_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String redm_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRedm_yymm(redm_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 12 16:11:35 KST 2009 */