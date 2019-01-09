/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String outside_flnm;

	public HD_AFFR_9101_LDM(){}
	public HD_AFFR_9101_LDM(String cmpy_cd, String outside_flnm){
		this.cmpy_cd = cmpy_cd;
		this.outside_flnm = outside_flnm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOutside_flnm(String outside_flnm){
		this.outside_flnm = outside_flnm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOutside_flnm(){
		return this.outside_flnm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9101_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9101_LDM dm = (HD_AFFR_9101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.outside_flnm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("outside_flnm = [" + getOutside_flnm() + "]");
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
String outside_flnm = req.getParameter("outside_flnm");
if( outside_flnm == null){
	System.out.println(this.toString+" : outside_flnm is null" );
}else{
	System.out.println(this.toString+" : outside_flnm is "+outside_flnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String outside_flnm = Util.checkString(req.getParameter("outside_flnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String outside_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("outside_flnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOutside_flnm(outside_flnm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 11 19:29:45 KST 2016 */