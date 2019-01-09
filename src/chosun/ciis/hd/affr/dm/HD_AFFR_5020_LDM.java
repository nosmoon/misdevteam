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


public class HD_AFFR_5020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String st_aplc_dt;
	public String en_aplc_dt;

	public HD_AFFR_5020_LDM(){}
	public HD_AFFR_5020_LDM(String cmpy_cd, String emp_no, String st_aplc_dt, String en_aplc_dt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.st_aplc_dt = st_aplc_dt;
		this.en_aplc_dt = en_aplc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSt_aplc_dt(String st_aplc_dt){
		this.st_aplc_dt = st_aplc_dt;
	}

	public void setEn_aplc_dt(String en_aplc_dt){
		this.en_aplc_dt = en_aplc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSt_aplc_dt(){
		return this.st_aplc_dt;
	}

	public String getEn_aplc_dt(){
		return this.en_aplc_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_5020_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_5020_LDM dm = (HD_AFFR_5020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.st_aplc_dt);
		cstmt.setString(6, dm.en_aplc_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_5020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("st_aplc_dt = [" + getSt_aplc_dt() + "]");
		System.out.println("en_aplc_dt = [" + getEn_aplc_dt() + "]");
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
String st_aplc_dt = req.getParameter("st_aplc_dt");
if( st_aplc_dt == null){
	System.out.println(this.toString+" : st_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : st_aplc_dt is "+st_aplc_dt );
}
String en_aplc_dt = req.getParameter("en_aplc_dt");
if( en_aplc_dt == null){
	System.out.println(this.toString+" : en_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : en_aplc_dt is "+en_aplc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String st_aplc_dt = Util.checkString(req.getParameter("st_aplc_dt"));
String en_aplc_dt = Util.checkString(req.getParameter("en_aplc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String st_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_aplc_dt")));
String en_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("en_aplc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSt_aplc_dt(st_aplc_dt);
dm.setEn_aplc_dt(en_aplc_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jun 21 14:28:20 KST 2009 */