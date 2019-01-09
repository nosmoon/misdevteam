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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_3212_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String oth_clsf;
	public String pubc_dt;

	public AD_BAS_3212_LDM(){}
	public AD_BAS_3212_LDM(String cmpy_cd, String oth_clsf, String pubc_dt){
		this.cmpy_cd = cmpy_cd;
		this.oth_clsf = oth_clsf;
		this.pubc_dt = pubc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOth_clsf(String oth_clsf){
		this.oth_clsf = oth_clsf;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOth_clsf(){
		return this.oth_clsf;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3212_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3212_LDM dm = (AD_BAS_3212_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.oth_clsf);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3212_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
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
String oth_clsf = req.getParameter("oth_clsf");
if( oth_clsf == null){
	System.out.println(this.toString+" : oth_clsf is null" );
}else{
	System.out.println(this.toString+" : oth_clsf is "+oth_clsf );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String oth_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_clsf")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOth_clsf(oth_clsf);
dm.setPubc_dt(pubc_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 17 17:45:39 KST 2009 */