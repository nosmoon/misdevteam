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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String nm_korn;

	public MT_ETCCAR_9004_LDM(){}
	public MT_ETCCAR_9004_LDM(String cmpy_cd, String nm_korn){
		this.cmpy_cd = cmpy_cd;
		this.nm_korn = nm_korn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9004_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9004_LDM dm = (MT_ETCCAR_9004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.nm_korn);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9004_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
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
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setNm_korn(nm_korn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 20 18:43:26 KST 2012 */