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


public class HD_AFFR_2310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt_ft;
	public String occr_dt_to;
	public String congr_condl_dt_ft;
	public String congr_condl_dt_to;
	public String congr_condl_cd;
	public String pay_plac_clsf;
	public String actu_slip_no;
	public String proc_stat;
	public String ss_emp_no;

	public HD_AFFR_2310_LDM(){}
	public HD_AFFR_2310_LDM(String cmpy_cd, String emp_no, String occr_dt_ft, String occr_dt_to, String congr_condl_dt_ft, String congr_condl_dt_to, String congr_condl_cd, String pay_plac_clsf, String actu_slip_no, String proc_stat, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt_ft = occr_dt_ft;
		this.occr_dt_to = occr_dt_to;
		this.congr_condl_dt_ft = congr_condl_dt_ft;
		this.congr_condl_dt_to = congr_condl_dt_to;
		this.congr_condl_cd = congr_condl_cd;
		this.pay_plac_clsf = pay_plac_clsf;
		this.actu_slip_no = actu_slip_no;
		this.proc_stat = proc_stat;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt_ft(String occr_dt_ft){
		this.occr_dt_ft = occr_dt_ft;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setCongr_condl_dt_ft(String congr_condl_dt_ft){
		this.congr_condl_dt_ft = congr_condl_dt_ft;
	}

	public void setCongr_condl_dt_to(String congr_condl_dt_to){
		this.congr_condl_dt_to = congr_condl_dt_to;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt_ft(){
		return this.occr_dt_ft;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getCongr_condl_dt_ft(){
		return this.congr_condl_dt_ft;
	}

	public String getCongr_condl_dt_to(){
		return this.congr_condl_dt_to;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2310_LDM dm = (HD_AFFR_2310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.occr_dt_ft);
		cstmt.setString(6, dm.occr_dt_to);
		cstmt.setString(7, dm.congr_condl_dt_ft);
		cstmt.setString(8, dm.congr_condl_dt_to);
		cstmt.setString(9, dm.congr_condl_cd);
		cstmt.setString(10, dm.pay_plac_clsf);
		cstmt.setString(11, dm.actu_slip_no);
		cstmt.setString(12, dm.proc_stat);
		cstmt.setString(13, dm.ss_emp_no);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt_ft = [" + getOccr_dt_ft() + "]");
		System.out.println("occr_dt_to = [" + getOccr_dt_to() + "]");
		System.out.println("congr_condl_dt_ft = [" + getCongr_condl_dt_ft() + "]");
		System.out.println("congr_condl_dt_to = [" + getCongr_condl_dt_to() + "]");
		System.out.println("congr_condl_cd = [" + getCongr_condl_cd() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String occr_dt_ft = req.getParameter("occr_dt_ft");
if( occr_dt_ft == null){
	System.out.println(this.toString+" : occr_dt_ft is null" );
}else{
	System.out.println(this.toString+" : occr_dt_ft is "+occr_dt_ft );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String congr_condl_dt_ft = req.getParameter("congr_condl_dt_ft");
if( congr_condl_dt_ft == null){
	System.out.println(this.toString+" : congr_condl_dt_ft is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt_ft is "+congr_condl_dt_ft );
}
String congr_condl_dt_to = req.getParameter("congr_condl_dt_to");
if( congr_condl_dt_to == null){
	System.out.println(this.toString+" : congr_condl_dt_to is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt_to is "+congr_condl_dt_to );
}
String congr_condl_cd = req.getParameter("congr_condl_cd");
if( congr_condl_cd == null){
	System.out.println(this.toString+" : congr_condl_cd is null" );
}else{
	System.out.println(this.toString+" : congr_condl_cd is "+congr_condl_cd );
}
String pay_plac_clsf = req.getParameter("pay_plac_clsf");
if( pay_plac_clsf == null){
	System.out.println(this.toString+" : pay_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_plac_clsf is "+pay_plac_clsf );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt_ft = Util.checkString(req.getParameter("occr_dt_ft"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String congr_condl_dt_ft = Util.checkString(req.getParameter("congr_condl_dt_ft"));
String congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));
String congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_ft")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String congr_condl_dt_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt_ft")));
String congr_condl_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt_to")));
String congr_condl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_cd")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt_ft(occr_dt_ft);
dm.setOccr_dt_to(occr_dt_to);
dm.setCongr_condl_dt_ft(congr_condl_dt_ft);
dm.setCongr_condl_dt_to(congr_condl_dt_to);
dm.setCongr_condl_cd(congr_condl_cd);
dm.setPay_plac_clsf(pay_plac_clsf);
dm.setActu_slip_no(actu_slip_no);
dm.setProc_stat(proc_stat);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 18 14:52:06 KST 2013 */