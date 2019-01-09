/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class IS_AGR_2910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_dt_fr;
	public String rcpm_dt_to;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlvs_dt_fr;
	public String dlvs_dt_to;
	public String work_clsf;
	public String std_cd;
	public String clr_cd;
	public String dlco_no;
	public String advcs_cd;
	public String dlco_clsf_cd_seq;
	public String proc_stat;
	public String incmg_pers;

	public IS_AGR_2910_LDM(){}
	public IS_AGR_2910_LDM(String cmpy_cd, String rcpm_dt_fr, String rcpm_dt_to, String dept_cd, String sub_dept_cd, String chrg_pers, String dlvs_dt_fr, String dlvs_dt_to, String work_clsf, String std_cd, String clr_cd, String dlco_no, String advcs_cd, String dlco_clsf_cd_seq, String proc_stat, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_dt_fr = rcpm_dt_fr;
		this.rcpm_dt_to = rcpm_dt_to;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlvs_dt_fr = dlvs_dt_fr;
		this.dlvs_dt_to = dlvs_dt_to;
		this.work_clsf = work_clsf;
		this.std_cd = std_cd;
		this.clr_cd = clr_cd;
		this.dlco_no = dlco_no;
		this.advcs_cd = advcs_cd;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.proc_stat = proc_stat;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_dt_fr(String rcpm_dt_fr){
		this.rcpm_dt_fr = rcpm_dt_fr;
	}

	public void setRcpm_dt_to(String rcpm_dt_to){
		this.rcpm_dt_to = rcpm_dt_to;
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

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setClr_cd(String clr_cd){
		this.clr_cd = clr_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
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

	public String getRcpm_dt_fr(){
		return this.rcpm_dt_fr;
	}

	public String getRcpm_dt_to(){
		return this.rcpm_dt_to;
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

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getClr_cd(){
		return this.clr_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
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
		 return "{ call MISISP.SP_IS_AGR_2910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_2910_LDM dm = (IS_AGR_2910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_dt_fr);
		cstmt.setString(5, dm.rcpm_dt_to);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sub_dept_cd);
		cstmt.setString(8, dm.chrg_pers);
		cstmt.setString(9, dm.dlvs_dt_fr);
		cstmt.setString(10, dm.dlvs_dt_to);
		cstmt.setString(11, dm.work_clsf);
		cstmt.setString(12, dm.std_cd);
		cstmt.setString(13, dm.clr_cd);
		cstmt.setString(14, dm.dlco_no);
		cstmt.setString(15, dm.advcs_cd);
		cstmt.setString(16, dm.dlco_clsf_cd_seq);
		cstmt.setString(17, dm.proc_stat);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_2910_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_dt_fr = [" + getRcpm_dt_fr() + "]");
		System.out.println("rcpm_dt_to = [" + getRcpm_dt_to() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlvs_dt_fr = [" + getDlvs_dt_fr() + "]");
		System.out.println("dlvs_dt_to = [" + getDlvs_dt_to() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("clr_cd = [" + getClr_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("advcs_cd = [" + getAdvcs_cd() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String rcpm_dt_fr = req.getParameter("rcpm_dt_fr");
if( rcpm_dt_fr == null){
	System.out.println(this.toString+" : rcpm_dt_fr is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt_fr is "+rcpm_dt_fr );
}
String rcpm_dt_to = req.getParameter("rcpm_dt_to");
if( rcpm_dt_to == null){
	System.out.println(this.toString+" : rcpm_dt_to is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt_to is "+rcpm_dt_to );
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
String work_clsf = req.getParameter("work_clsf");
if( work_clsf == null){
	System.out.println(this.toString+" : work_clsf is null" );
}else{
	System.out.println(this.toString+" : work_clsf is "+work_clsf );
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
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
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_dt_fr = Util.checkString(req.getParameter("rcpm_dt_fr"));
String rcpm_dt_to = Util.checkString(req.getParameter("rcpm_dt_to"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlvs_dt_fr = Util.checkString(req.getParameter("dlvs_dt_fr"));
String dlvs_dt_to = Util.checkString(req.getParameter("dlvs_dt_to"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String clr_cd = Util.checkString(req.getParameter("clr_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt_fr")));
String rcpm_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt_to")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlvs_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt_fr")));
String dlvs_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt_to")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String clr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_dt_fr(rcpm_dt_fr);
dm.setRcpm_dt_to(rcpm_dt_to);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlvs_dt_fr(dlvs_dt_fr);
dm.setDlvs_dt_to(dlvs_dt_to);
dm.setWork_clsf(work_clsf);
dm.setStd_cd(std_cd);
dm.setClr_cd(clr_cd);
dm.setDlco_no(dlco_no);
dm.setAdvcs_cd(advcs_cd);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 10:25:53 KST 2012 */