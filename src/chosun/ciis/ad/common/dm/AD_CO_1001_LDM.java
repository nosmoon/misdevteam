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


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String major;

	public AD_CO_1001_LDM(){}
	public AD_CO_1001_LDM(String cmpy_cd, String major){
		this.cmpy_cd = cmpy_cd;
		this.major = major;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMajor(String major){
		this.major = major;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMajor(){
		return this.major;
	}

	public String getSQL(){
		 return "{ call SP_AD_CO_1001_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1001_LDM dm = (AD_CO_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.major);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_1001_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("major = " + getMajor());
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
String major = req.getParameter("major");
if( major == null){
	System.out.println(this.toString+" : major is null" );
}else{
	System.out.println(this.toString+" : major is "+major );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String major = Util.checkString(req.getParameter("major"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String major = Util.Uni2Ksc(Util.checkString(req.getParameter("major")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMajor(major);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 02 14:55:10 KST 2009 */