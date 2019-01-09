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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1160_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String recp_pers;

	public MT_SUBMATRCLA_1160_LDM(){}
	public MT_SUBMATRCLA_1160_LDM(String cmpy_cd, String recp_pers){
		this.cmpy_cd = cmpy_cd;
		this.recp_pers = recp_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRecp_pers(String recp_pers){
		this.recp_pers = recp_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRecp_pers(){
		return this.recp_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_1160_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_1160_LDM dm = (MT_SUBMATRCLA_1160_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.recp_pers);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_1160_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("recp_pers = [" + getRecp_pers() + "]");
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
String recp_pers = req.getParameter("recp_pers");
if( recp_pers == null){
	System.out.println(this.toString+" : recp_pers is null" );
}else{
	System.out.println(this.toString+" : recp_pers is "+recp_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String recp_pers = Util.checkString(req.getParameter("recp_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String recp_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRecp_pers(recp_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 28 11:06:02 KST 2009 */