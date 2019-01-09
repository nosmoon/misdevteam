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


public class AS_LEAS_1401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_yy;

	public AS_LEAS_1401_LDM(){}
	public AS_LEAS_1401_LDM(String cmpy_cd, String basi_yy){
		this.cmpy_cd = cmpy_cd;
		this.basi_yy = basi_yy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1401_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1401_LDM dm = (AS_LEAS_1401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.basi_yy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1401_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_yy = [" + getBasi_yy() + "]");
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
String basi_yy = req.getParameter("basi_yy");
if( basi_yy == null){
	System.out.println(this.toString+" : basi_yy is null" );
}else{
	System.out.println(this.toString+" : basi_yy is "+basi_yy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_yy = Util.checkString(req.getParameter("basi_yy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_yy(basi_yy);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat May 09 12:20:21 KST 2009 */