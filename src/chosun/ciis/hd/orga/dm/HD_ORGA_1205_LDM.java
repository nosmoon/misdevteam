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


package chosun.ciis.hd.orga.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.ds.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1205_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String supr_dept_cd;

	public HD_ORGA_1205_LDM(){}
	public HD_ORGA_1205_LDM(String cmpy_cd, String supr_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_ORGA_1205_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_ORGA_1205_LDM dm = (HD_ORGA_1205_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.supr_dept_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.orga.ds.HD_ORGA_1205_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
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
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSupr_dept_cd(supr_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 26 16:11:33 KST 2009 */