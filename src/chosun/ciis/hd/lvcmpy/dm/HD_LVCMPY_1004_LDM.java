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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String lvcmpy_tm_dt;
	public String ov_avg_tm_dt;
	public String lvcmpy_dt;
	public String emp_no;

	public HD_LVCMPY_1004_LDM(){}
	public HD_LVCMPY_1004_LDM(String cmpy_cd, String lvcmpy_tm_dt, String ov_avg_tm_dt, String lvcmpy_dt, String emp_no){
		this.cmpy_cd = cmpy_cd;
		this.lvcmpy_tm_dt = lvcmpy_tm_dt;
		this.ov_avg_tm_dt = ov_avg_tm_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLvcmpy_tm_dt(String lvcmpy_tm_dt){
		this.lvcmpy_tm_dt = lvcmpy_tm_dt;
	}

	public void setOv_avg_tm_dt(String ov_avg_tm_dt){
		this.ov_avg_tm_dt = ov_avg_tm_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLvcmpy_tm_dt(){
		return this.lvcmpy_tm_dt;
	}

	public String getOv_avg_tm_dt(){
		return this.ov_avg_tm_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1004_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1004_LDM dm = (HD_LVCMPY_1004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.lvcmpy_tm_dt);
		cstmt.setString(5, dm.ov_avg_tm_dt);
		cstmt.setString(6, dm.lvcmpy_dt);
		cstmt.setString(7, dm.emp_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1004_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("lvcmpy_tm_dt = [" + getLvcmpy_tm_dt() + "]");
		System.out.println("ov_avg_tm_dt = [" + getOv_avg_tm_dt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
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
String lvcmpy_tm_dt = req.getParameter("lvcmpy_tm_dt");
if( lvcmpy_tm_dt == null){
	System.out.println(this.toString+" : lvcmpy_tm_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_tm_dt is "+lvcmpy_tm_dt );
}
String ov_avg_tm_dt = req.getParameter("ov_avg_tm_dt");
if( ov_avg_tm_dt == null){
	System.out.println(this.toString+" : ov_avg_tm_dt is null" );
}else{
	System.out.println(this.toString+" : ov_avg_tm_dt is "+ov_avg_tm_dt );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String lvcmpy_tm_dt = Util.checkString(req.getParameter("lvcmpy_tm_dt"));
String ov_avg_tm_dt = Util.checkString(req.getParameter("ov_avg_tm_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String lvcmpy_tm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_tm_dt")));
String ov_avg_tm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ov_avg_tm_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setLvcmpy_tm_dt(lvcmpy_tm_dt);
dm.setOv_avg_tm_dt(ov_avg_tm_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setEmp_no(emp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 30 17:18:23 KST 2017 */