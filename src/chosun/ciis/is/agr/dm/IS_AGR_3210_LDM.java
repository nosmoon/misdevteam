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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_3210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String make_ask_reg_dt_fr;
	public String make_ask_reg_dt_to;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlvs_dt_fr;
	public String dlvs_dt_to;
	public String work_kind;
	public String make_clsf;
	public String std_cd;
	public String clr_cd;
	public String dlco_nm;
	public String advt_nm;
	public String dlco_clsf_cd_seq;
	public String proc_stat;
	public String incmg_pers;

	public IS_AGR_3210_LDM(){}
	public IS_AGR_3210_LDM(String cmpy_cd, String make_ask_reg_dt_fr, String make_ask_reg_dt_to, String dept_cd, String sub_dept_cd, String chrg_pers, String dlvs_dt_fr, String dlvs_dt_to, String work_kind, String make_clsf, String std_cd, String clr_cd, String dlco_nm, String advt_nm, String dlco_clsf_cd_seq, String proc_stat, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.make_ask_reg_dt_fr = make_ask_reg_dt_fr;
		this.make_ask_reg_dt_to = make_ask_reg_dt_to;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlvs_dt_fr = dlvs_dt_fr;
		this.dlvs_dt_to = dlvs_dt_to;
		this.work_kind = work_kind;
		this.make_clsf = make_clsf;
		this.std_cd = std_cd;
		this.clr_cd = clr_cd;
		this.dlco_nm = dlco_nm;
		this.advt_nm = advt_nm;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.proc_stat = proc_stat;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMake_ask_reg_dt_fr(String make_ask_reg_dt_fr){
		this.make_ask_reg_dt_fr = make_ask_reg_dt_fr;
	}

	public void setMake_ask_reg_dt_to(String make_ask_reg_dt_to){
		this.make_ask_reg_dt_to = make_ask_reg_dt_to;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlvs_dt_fr(String dlvs_dt_fr){
		this.dlvs_dt_fr = dlvs_dt_fr;
	}

	public void setDlvs_dt_to(String dlvs_dt_to){
		this.dlvs_dt_to = dlvs_dt_to;
	}

	public void setWork_kind(String work_kind){
		this.work_kind = work_kind;
	}

	public void setMake_clsf(String make_clsf){
		this.make_clsf = make_clsf;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setClr_cd(String clr_cd){
		this.clr_cd = clr_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMake_ask_reg_dt_fr(){
		return this.make_ask_reg_dt_fr;
	}

	public String getMake_ask_reg_dt_to(){
		return this.make_ask_reg_dt_to;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlvs_dt_fr(){
		return this.dlvs_dt_fr;
	}

	public String getDlvs_dt_to(){
		return this.dlvs_dt_to;
	}

	public String getWork_kind(){
		return this.work_kind;
	}

	public String getMake_clsf(){
		return this.make_clsf;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getClr_cd(){
		return this.clr_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_3210_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_3210_LDM dm = (IS_AGR_3210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.make_ask_reg_dt_fr);
		cstmt.setString(5, dm.make_ask_reg_dt_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sub_dept_cd);
		cstmt.setString(8, dm.chrg_pers);
		cstmt.setString(9, dm.dlvs_dt_fr);
		cstmt.setString(10, dm.dlvs_dt_to);
		cstmt.setString(11, dm.work_kind);
		cstmt.setString(12, dm.make_clsf);
		cstmt.setString(13, dm.std_cd);
		cstmt.setString(14, dm.clr_cd);
		cstmt.setString(15, dm.dlco_nm);
		cstmt.setString(16, dm.advt_nm);
		cstmt.setString(17, dm.dlco_clsf_cd_seq);
		cstmt.setString(18, dm.proc_stat);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_3210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("make_ask_reg_dt_fr = [" + getMake_ask_reg_dt_fr() + "]");
		System.out.println("make_ask_reg_dt_to = [" + getMake_ask_reg_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlvs_dt_fr = [" + getDlvs_dt_fr() + "]");
		System.out.println("dlvs_dt_to = [" + getDlvs_dt_to() + "]");
		System.out.println("work_kind = [" + getWork_kind() + "]");
		System.out.println("make_clsf = [" + getMake_clsf() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("clr_cd = [" + getClr_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("advt_nm = [" + getAdvt_nm() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String make_ask_reg_dt_fr = req.getParameter("make_ask_reg_dt_fr");
if( make_ask_reg_dt_fr == null){
	System.out.println(this.toString+" : make_ask_reg_dt_fr is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_dt_fr is "+make_ask_reg_dt_fr );
}
String make_ask_reg_dt_to = req.getParameter("make_ask_reg_dt_to");
if( make_ask_reg_dt_to == null){
	System.out.println(this.toString+" : make_ask_reg_dt_to is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_dt_to is "+make_ask_reg_dt_to );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlvs_dt_fr = req.getParameter("dlvs_dt_fr");
if( dlvs_dt_fr == null){
	System.out.println(this.toString+" : dlvs_dt_fr is null" );
}else{
	System.out.println(this.toString+" : dlvs_dt_fr is "+dlvs_dt_fr );
}
String dlvs_dt_to = req.getParameter("dlvs_dt_to");
if( dlvs_dt_to == null){
	System.out.println(this.toString+" : dlvs_dt_to is null" );
}else{
	System.out.println(this.toString+" : dlvs_dt_to is "+dlvs_dt_to );
}
String work_kind = req.getParameter("work_kind");
if( work_kind == null){
	System.out.println(this.toString+" : work_kind is null" );
}else{
	System.out.println(this.toString+" : work_kind is "+work_kind );
}
String make_clsf = req.getParameter("make_clsf");
if( make_clsf == null){
	System.out.println(this.toString+" : make_clsf is null" );
}else{
	System.out.println(this.toString+" : make_clsf is "+make_clsf );
}
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String clr_cd = req.getParameter("clr_cd");
if( clr_cd == null){
	System.out.println(this.toString+" : clr_cd is null" );
}else{
	System.out.println(this.toString+" : clr_cd is "+clr_cd );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String advt_nm = req.getParameter("advt_nm");
if( advt_nm == null){
	System.out.println(this.toString+" : advt_nm is null" );
}else{
	System.out.println(this.toString+" : advt_nm is "+advt_nm );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String make_ask_reg_dt_fr = Util.checkString(req.getParameter("make_ask_reg_dt_fr"));
String make_ask_reg_dt_to = Util.checkString(req.getParameter("make_ask_reg_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlvs_dt_fr = Util.checkString(req.getParameter("dlvs_dt_fr"));
String dlvs_dt_to = Util.checkString(req.getParameter("dlvs_dt_to"));
String work_kind = Util.checkString(req.getParameter("work_kind"));
String make_clsf = Util.checkString(req.getParameter("make_clsf"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String clr_cd = Util.checkString(req.getParameter("clr_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String advt_nm = Util.checkString(req.getParameter("advt_nm"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String make_ask_reg_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_dt_fr")));
String make_ask_reg_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlvs_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt_fr")));
String dlvs_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt_to")));
String work_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("work_kind")));
String make_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("make_clsf")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String clr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String advt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_nm")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMake_ask_reg_dt_fr(make_ask_reg_dt_fr);
dm.setMake_ask_reg_dt_to(make_ask_reg_dt_to);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlvs_dt_fr(dlvs_dt_fr);
dm.setDlvs_dt_to(dlvs_dt_to);
dm.setWork_kind(work_kind);
dm.setMake_clsf(make_clsf);
dm.setStd_cd(std_cd);
dm.setClr_cd(clr_cd);
dm.setDlco_nm(dlco_nm);
dm.setAdvt_nm(advt_nm);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 07 16:40:01 KST 2012 */