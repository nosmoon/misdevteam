/***************************************************************************************************
* 파일명 : .java
* 기능 : 회계관리
* 작성일자 : 2009-02-19
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 회계관리
 */


public class FC_ACCT_2842_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsf;
	public String cmpy_cd;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String rcpm_clsf;
	public String rcpm_shet_dlv_dt;
	public String dlver_emp_no;
	public String recp_pers_emp_no;
	public String rcpm_shet_stat;
	public String rcpm_indc_bgn_no;
	public String dept_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_2842_ADM(){}
	public FC_ACCT_2842_ADM(String clsf, String cmpy_cd, String rcpm_shet_kind, String rcpm_shet_no, String rcpm_clsf, String rcpm_shet_dlv_dt, String dlver_emp_no, String recp_pers_emp_no, String rcpm_shet_stat, String rcpm_indc_bgn_no, String dept_cd, String incmg_pers_ipadd, String incmg_pers){
		this.clsf = clsf;
		this.cmpy_cd = cmpy_cd;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.rcpm_clsf = rcpm_clsf;
		this.rcpm_shet_dlv_dt = rcpm_shet_dlv_dt;
		this.dlver_emp_no = dlver_emp_no;
		this.recp_pers_emp_no = recp_pers_emp_no;
		this.rcpm_shet_stat = rcpm_shet_stat;
		this.rcpm_indc_bgn_no = rcpm_indc_bgn_no;
		this.dept_cd = dept_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setRcpm_shet_dlv_dt(String rcpm_shet_dlv_dt){
		this.rcpm_shet_dlv_dt = rcpm_shet_dlv_dt;
	}

	public void setDlver_emp_no(String dlver_emp_no){
		this.dlver_emp_no = dlver_emp_no;
	}

	public void setRecp_pers_emp_no(String recp_pers_emp_no){
		this.recp_pers_emp_no = recp_pers_emp_no;
	}

	public void setRcpm_shet_stat(String rcpm_shet_stat){
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public void setRcpm_indc_bgn_no(String rcpm_indc_bgn_no){
		this.rcpm_indc_bgn_no = rcpm_indc_bgn_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getRcpm_shet_dlv_dt(){
		return this.rcpm_shet_dlv_dt;
	}

	public String getDlver_emp_no(){
		return this.dlver_emp_no;
	}

	public String getRecp_pers_emp_no(){
		return this.recp_pers_emp_no;
	}

	public String getRcpm_shet_stat(){
		return this.rcpm_shet_stat;
	}

	public String getRcpm_indc_bgn_no(){
		return this.rcpm_indc_bgn_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2842_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2842_ADM dm = (FC_ACCT_2842_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsf);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.rcpm_shet_kind);
		cstmt.setString(6, dm.rcpm_shet_no);
		cstmt.setString(7, dm.rcpm_clsf);
		cstmt.setString(8, dm.rcpm_shet_dlv_dt);
		cstmt.setString(9, dm.dlver_emp_no);
		cstmt.setString(10, dm.recp_pers_emp_no);
		cstmt.setString(11, dm.rcpm_shet_stat);
		cstmt.setString(12, dm.rcpm_indc_bgn_no);
		cstmt.setString(13, dm.dept_cd);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2842_ADataSet();
	}



    public void print(){
        System.out.println("clsf = " + getClsf());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("rcpm_shet_kind = " + getRcpm_shet_kind());
        System.out.println("rcpm_shet_no = " + getRcpm_shet_no());
        System.out.println("rcpm_clsf = " + getRcpm_clsf());
        System.out.println("rcpm_shet_dlv_dt = " + getRcpm_shet_dlv_dt());
        System.out.println("dlver_emp_no = " + getDlver_emp_no());
        System.out.println("recp_pers_emp_no = " + getRecp_pers_emp_no());
        System.out.println("rcpm_shet_stat = " + getRcpm_shet_stat());
        System.out.println("rcpm_indc_bgn_no = " + getRcpm_indc_bgn_no());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String rcpm_clsf = req.getParameter("rcpm_clsf");
if( rcpm_clsf == null){
	System.out.println(this.toString+" : rcpm_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_clsf is "+rcpm_clsf );
}
String rcpm_shet_dlv_dt = req.getParameter("rcpm_shet_dlv_dt");
if( rcpm_shet_dlv_dt == null){
	System.out.println(this.toString+" : rcpm_shet_dlv_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_dlv_dt is "+rcpm_shet_dlv_dt );
}
String dlver_emp_no = req.getParameter("dlver_emp_no");
if( dlver_emp_no == null){
	System.out.println(this.toString+" : dlver_emp_no is null" );
}else{
	System.out.println(this.toString+" : dlver_emp_no is "+dlver_emp_no );
}
String recp_pers_emp_no = req.getParameter("recp_pers_emp_no");
if( recp_pers_emp_no == null){
	System.out.println(this.toString+" : recp_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : recp_pers_emp_no is "+recp_pers_emp_no );
}
String rcpm_shet_stat = req.getParameter("rcpm_shet_stat");
if( rcpm_shet_stat == null){
	System.out.println(this.toString+" : rcpm_shet_stat is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_stat is "+rcpm_shet_stat );
}
String rcpm_indc_bgn_no = req.getParameter("rcpm_indc_bgn_no");
if( rcpm_indc_bgn_no == null){
	System.out.println(this.toString+" : rcpm_indc_bgn_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_indc_bgn_no is "+rcpm_indc_bgn_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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

String clsf = Util.checkString(req.getParameter("clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
String rcpm_shet_dlv_dt = Util.checkString(req.getParameter("rcpm_shet_dlv_dt"));
String dlver_emp_no = Util.checkString(req.getParameter("dlver_emp_no"));
String recp_pers_emp_no = Util.checkString(req.getParameter("recp_pers_emp_no"));
String rcpm_shet_stat = Util.checkString(req.getParameter("rcpm_shet_stat"));
String rcpm_indc_bgn_no = Util.checkString(req.getParameter("rcpm_indc_bgn_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String rcpm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_clsf")));
String rcpm_shet_dlv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_dlv_dt")));
String dlver_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlver_emp_no")));
String recp_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers_emp_no")));
String rcpm_shet_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_stat")));
String rcpm_indc_bgn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_indc_bgn_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsf(clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setRcpm_clsf(rcpm_clsf);
dm.setRcpm_shet_dlv_dt(rcpm_shet_dlv_dt);
dm.setDlver_emp_no(dlver_emp_no);
dm.setRecp_pers_emp_no(recp_pers_emp_no);
dm.setRcpm_shet_stat(rcpm_shet_stat);
dm.setRcpm_indc_bgn_no(rcpm_indc_bgn_no);
dm.setDept_cd(dept_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 20:38:33 KST 2009 */