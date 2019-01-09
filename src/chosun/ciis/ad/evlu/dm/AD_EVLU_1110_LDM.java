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


package chosun.ciis.ad.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.evlu.ds.*;
import chosun.ciis.ad.evlu.rec.*;

/**
 * 
 */


public class AD_EVLU_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String pubc_yyyymmdd;
	public String scorecode;

	public AD_EVLU_1110_LDM(){}
	public AD_EVLU_1110_LDM(String cmpy_cd, String emp_no, String pubc_yyyymmdd, String scorecode){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.pubc_yyyymmdd = pubc_yyyymmdd;
		this.scorecode = scorecode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPubc_yyyymmdd(String pubc_yyyymmdd){
		this.pubc_yyyymmdd = pubc_yyyymmdd;
	}

	public void setScorecode(String scorecode){
		this.scorecode = scorecode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPubc_yyyymmdd(){
		return this.pubc_yyyymmdd;
	}

	public String getScorecode(){
		return this.scorecode;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_EVLU_1110_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_EVLU_1110_LDM dm = (AD_EVLU_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.pubc_yyyymmdd);
		cstmt.setString(6, dm.scorecode);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new AD_EVLU_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("pubc_yyyymmdd = [" + getPubc_yyyymmdd() + "]");
		System.out.println("scorecode = [" + getScorecode() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String pubc_yyyymmdd = req.getParameter("pubc_yyyymmdd");
if( pubc_yyyymmdd == null){
	System.out.println(this.toString+" : pubc_yyyymmdd is null" );
}else{
	System.out.println(this.toString+" : pubc_yyyymmdd is "+pubc_yyyymmdd );
}
String scorecode = req.getParameter("scorecode");
if( scorecode == null){
	System.out.println(this.toString+" : scorecode is null" );
}else{
	System.out.println(this.toString+" : scorecode is "+scorecode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String pubc_yyyymmdd = Util.checkString(req.getParameter("pubc_yyyymmdd"));
String scorecode = Util.checkString(req.getParameter("scorecode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String pubc_yyyymmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_yyyymmdd")));
String scorecode = Util.Uni2Ksc(Util.checkString(req.getParameter("scorecode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPubc_yyyymmdd(pubc_yyyymmdd);
dm.setScorecode(scorecode);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 19 13:26:23 KST 2010 */