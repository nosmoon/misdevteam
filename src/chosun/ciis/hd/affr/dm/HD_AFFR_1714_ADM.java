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


public class HD_AFFR_1714_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String scl_exps_pay_yy;
	public String scl_exps_pay_qq;
	public String scl_exps_clsf;
	public String scl_exps_pay_plac_clsf;
	public String obj_pers_flnm;
	public String obj_pers_prn;
	public String scl_nm;
	public String grade;
	public String scl_part;
	public String aplc_amt;
	public String vdty_amt;
	public String pay_amt;
	public String remk;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_1714_ADM(){}
	public HD_AFFR_1714_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String scl_exps_pay_yy, String scl_exps_pay_qq, String scl_exps_clsf, String scl_exps_pay_plac_clsf, String obj_pers_flnm, String obj_pers_prn, String scl_nm, String grade, String scl_part, String aplc_amt, String vdty_amt, String pay_amt, String remk, String slip_proc_mang_dt, String slip_proc_mang_seq, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.scl_exps_pay_yy = scl_exps_pay_yy;
		this.scl_exps_pay_qq = scl_exps_pay_qq;
		this.scl_exps_clsf = scl_exps_clsf;
		this.scl_exps_pay_plac_clsf = scl_exps_pay_plac_clsf;
		this.obj_pers_flnm = obj_pers_flnm;
		this.obj_pers_prn = obj_pers_prn;
		this.scl_nm = scl_nm;
		this.grade = grade;
		this.scl_part = scl_part;
		this.aplc_amt = aplc_amt;
		this.vdty_amt = vdty_amt;
		this.pay_amt = pay_amt;
		this.remk = remk;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setScl_exps_pay_yy(String scl_exps_pay_yy){
		this.scl_exps_pay_yy = scl_exps_pay_yy;
	}

	public void setScl_exps_pay_qq(String scl_exps_pay_qq){
		this.scl_exps_pay_qq = scl_exps_pay_qq;
	}

	public void setScl_exps_clsf(String scl_exps_clsf){
		this.scl_exps_clsf = scl_exps_clsf;
	}

	public void setScl_exps_pay_plac_clsf(String scl_exps_pay_plac_clsf){
		this.scl_exps_pay_plac_clsf = scl_exps_pay_plac_clsf;
	}

	public void setObj_pers_flnm(String obj_pers_flnm){
		this.obj_pers_flnm = obj_pers_flnm;
	}

	public void setObj_pers_prn(String obj_pers_prn){
		this.obj_pers_prn = obj_pers_prn;
	}

	public void setScl_nm(String scl_nm){
		this.scl_nm = scl_nm;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}

	public void setScl_part(String scl_part){
		this.scl_part = scl_part;
	}

	public void setAplc_amt(String aplc_amt){
		this.aplc_amt = aplc_amt;
	}

	public void setVdty_amt(String vdty_amt){
		this.vdty_amt = vdty_amt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getScl_exps_pay_yy(){
		return this.scl_exps_pay_yy;
	}

	public String getScl_exps_pay_qq(){
		return this.scl_exps_pay_qq;
	}

	public String getScl_exps_clsf(){
		return this.scl_exps_clsf;
	}

	public String getScl_exps_pay_plac_clsf(){
		return this.scl_exps_pay_plac_clsf;
	}

	public String getObj_pers_flnm(){
		return this.obj_pers_flnm;
	}

	public String getObj_pers_prn(){
		return this.obj_pers_prn;
	}

	public String getScl_nm(){
		return this.scl_nm;
	}

	public String getGrade(){
		return this.grade;
	}

	public String getScl_part(){
		return this.scl_part;
	}

	public String getAplc_amt(){
		return this.aplc_amt;
	}

	public String getVdty_amt(){
		return this.vdty_amt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1714_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1714_ADM dm = (HD_AFFR_1714_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.scl_exps_pay_yy);
		cstmt.setString(13, dm.scl_exps_pay_qq);
		cstmt.setString(14, dm.scl_exps_clsf);
		cstmt.setString(15, dm.scl_exps_pay_plac_clsf);
		cstmt.setString(16, dm.obj_pers_flnm);
		cstmt.setString(17, dm.obj_pers_prn);
		cstmt.setString(18, dm.scl_nm);
		cstmt.setString(19, dm.grade);
		cstmt.setString(20, dm.scl_part);
		cstmt.setString(21, dm.aplc_amt);
		cstmt.setString(22, dm.vdty_amt);
		cstmt.setString(23, dm.pay_amt);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.slip_proc_mang_dt);
		cstmt.setString(26, dm.slip_proc_mang_seq);
		cstmt.setString(27, dm.incmg_pers_ipadd);
		cstmt.setString(28, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1714_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("flnm = " + getFlnm());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dty_cd = " + getDty_cd());
        System.out.println("posi_cd = " + getPosi_cd());
        System.out.println("scl_exps_pay_yy = " + getScl_exps_pay_yy());
        System.out.println("scl_exps_pay_qq = " + getScl_exps_pay_qq());
        System.out.println("scl_exps_clsf = " + getScl_exps_clsf());
        System.out.println("scl_exps_pay_plac_clsf = " + getScl_exps_pay_plac_clsf());
        System.out.println("obj_pers_flnm = " + getObj_pers_flnm());
        System.out.println("obj_pers_prn = " + getObj_pers_prn());
        System.out.println("scl_nm = " + getScl_nm());
        System.out.println("grade = " + getGrade());
        System.out.println("scl_part = " + getScl_part());
        System.out.println("aplc_amt = " + getAplc_amt());
        System.out.println("vdty_amt = " + getVdty_amt());
        System.out.println("pay_amt = " + getPay_amt());
        System.out.println("remk = " + getRemk());
        System.out.println("slip_proc_mang_dt = " + getSlip_proc_mang_dt());
        System.out.println("slip_proc_mang_seq = " + getSlip_proc_mang_seq());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("ss_emp_no = " + getSs_emp_no());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String scl_exps_pay_yy = req.getParameter("scl_exps_pay_yy");
if( scl_exps_pay_yy == null){
	System.out.println(this.toString+" : scl_exps_pay_yy is null" );
}else{
	System.out.println(this.toString+" : scl_exps_pay_yy is "+scl_exps_pay_yy );
}
String scl_exps_pay_qq = req.getParameter("scl_exps_pay_qq");
if( scl_exps_pay_qq == null){
	System.out.println(this.toString+" : scl_exps_pay_qq is null" );
}else{
	System.out.println(this.toString+" : scl_exps_pay_qq is "+scl_exps_pay_qq );
}
String scl_exps_clsf = req.getParameter("scl_exps_clsf");
if( scl_exps_clsf == null){
	System.out.println(this.toString+" : scl_exps_clsf is null" );
}else{
	System.out.println(this.toString+" : scl_exps_clsf is "+scl_exps_clsf );
}
String scl_exps_pay_plac_clsf = req.getParameter("scl_exps_pay_plac_clsf");
if( scl_exps_pay_plac_clsf == null){
	System.out.println(this.toString+" : scl_exps_pay_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : scl_exps_pay_plac_clsf is "+scl_exps_pay_plac_clsf );
}
String obj_pers_flnm = req.getParameter("obj_pers_flnm");
if( obj_pers_flnm == null){
	System.out.println(this.toString+" : obj_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : obj_pers_flnm is "+obj_pers_flnm );
}
String obj_pers_prn = req.getParameter("obj_pers_prn");
if( obj_pers_prn == null){
	System.out.println(this.toString+" : obj_pers_prn is null" );
}else{
	System.out.println(this.toString+" : obj_pers_prn is "+obj_pers_prn );
}
String scl_nm = req.getParameter("scl_nm");
if( scl_nm == null){
	System.out.println(this.toString+" : scl_nm is null" );
}else{
	System.out.println(this.toString+" : scl_nm is "+scl_nm );
}
String grade = req.getParameter("grade");
if( grade == null){
	System.out.println(this.toString+" : grade is null" );
}else{
	System.out.println(this.toString+" : grade is "+grade );
}
String scl_part = req.getParameter("scl_part");
if( scl_part == null){
	System.out.println(this.toString+" : scl_part is null" );
}else{
	System.out.println(this.toString+" : scl_part is "+scl_part );
}
String aplc_amt = req.getParameter("aplc_amt");
if( aplc_amt == null){
	System.out.println(this.toString+" : aplc_amt is null" );
}else{
	System.out.println(this.toString+" : aplc_amt is "+aplc_amt );
}
String vdty_amt = req.getParameter("vdty_amt");
if( vdty_amt == null){
	System.out.println(this.toString+" : vdty_amt is null" );
}else{
	System.out.println(this.toString+" : vdty_amt is "+vdty_amt );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String scl_exps_pay_yy = Util.checkString(req.getParameter("scl_exps_pay_yy"));
String scl_exps_pay_qq = Util.checkString(req.getParameter("scl_exps_pay_qq"));
String scl_exps_clsf = Util.checkString(req.getParameter("scl_exps_clsf"));
String scl_exps_pay_plac_clsf = Util.checkString(req.getParameter("scl_exps_pay_plac_clsf"));
String obj_pers_flnm = Util.checkString(req.getParameter("obj_pers_flnm"));
String obj_pers_prn = Util.checkString(req.getParameter("obj_pers_prn"));
String scl_nm = Util.checkString(req.getParameter("scl_nm"));
String grade = Util.checkString(req.getParameter("grade"));
String scl_part = Util.checkString(req.getParameter("scl_part"));
String aplc_amt = Util.checkString(req.getParameter("aplc_amt"));
String vdty_amt = Util.checkString(req.getParameter("vdty_amt"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String remk = Util.checkString(req.getParameter("remk"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String scl_exps_pay_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_pay_yy")));
String scl_exps_pay_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_pay_qq")));
String scl_exps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_clsf")));
String scl_exps_pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_pay_plac_clsf")));
String obj_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_pers_flnm")));
String obj_pers_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_pers_prn")));
String scl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_nm")));
String grade = Util.Uni2Ksc(Util.checkString(req.getParameter("grade")));
String scl_part = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_part")));
String aplc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_amt")));
String vdty_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vdty_amt")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setScl_exps_pay_yy(scl_exps_pay_yy);
dm.setScl_exps_pay_qq(scl_exps_pay_qq);
dm.setScl_exps_clsf(scl_exps_clsf);
dm.setScl_exps_pay_plac_clsf(scl_exps_pay_plac_clsf);
dm.setObj_pers_flnm(obj_pers_flnm);
dm.setObj_pers_prn(obj_pers_prn);
dm.setScl_nm(scl_nm);
dm.setGrade(grade);
dm.setScl_part(scl_part);
dm.setAplc_amt(aplc_amt);
dm.setVdty_amt(vdty_amt);
dm.setPay_amt(pay_amt);
dm.setRemk(remk);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 17:58:19 KST 2009 */