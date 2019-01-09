/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ��ȣ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.pub.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_PUB_2210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dt;

	public AD_PUB_2210_LDM(){}
	public AD_PUB_2210_LDM(String cmpy_cd, String dt){
		this.cmpy_cd = cmpy_cd;
		this.dt = dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDt(){
		return this.dt;
	}

	public String getSQL(){
		 return "{ call SP_AD_PUB_2210_L( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2210_LDM dm = (AD_PUB_2210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2210_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dt = " + getDt());
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
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dt = Util.checkString(req.getParameter("dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDt(dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 09 18:24:11 KST 2009 */