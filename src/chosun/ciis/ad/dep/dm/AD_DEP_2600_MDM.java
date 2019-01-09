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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_2600_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dealmedicd;

	public AD_DEP_2600_MDM(){}
	public AD_DEP_2600_MDM(String cmpy_cd, String dealmedicd){
		this.cmpy_cd = cmpy_cd;
		this.dealmedicd = dealmedicd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDealmedicd(String dealmedicd){
		this.dealmedicd = dealmedicd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDealmedicd(){
		return this.dealmedicd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_2600_M(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_2600_MDM dm = (AD_DEP_2600_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dealmedicd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_2600_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dealmedicd = [" + getDealmedicd() + "]");
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
String dealmedicd = req.getParameter("dealmedicd");
if( dealmedicd == null){
	System.out.println(this.toString+" : dealmedicd is null" );
}else{
	System.out.println(this.toString+" : dealmedicd is "+dealmedicd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dealmedicd = Util.checkString(req.getParameter("dealmedicd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dealmedicd = Util.Uni2Ksc(Util.checkString(req.getParameter("dealmedicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDealmedicd(dealmedicd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 08 09:27:44 KST 2009 */