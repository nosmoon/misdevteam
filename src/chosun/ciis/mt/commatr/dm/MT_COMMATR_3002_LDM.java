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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_3002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_nm;
	public String dlco_cd;

	public MT_COMMATR_3002_LDM(){}
	public MT_COMMATR_3002_LDM(String cmpy_cd, String dlco_nm, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.dlco_nm = dlco_nm;
		this.dlco_cd = dlco_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_3002_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_3002_LDM dm = (MT_COMMATR_3002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_nm);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_3002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_nm(dlco_nm);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jul 11 13:16:00 KST 2009 */