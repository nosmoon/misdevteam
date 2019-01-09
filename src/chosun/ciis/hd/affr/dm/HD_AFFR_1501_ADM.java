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


public class HD_AFFR_1501_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String scl_exps_clsf;
	public String frdt;
	public String todt;
	public String fix_rate_clsf;
	public String pay_ratio_emp;
	public String pay_ratio_ofcr;
	public String pay_amt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String seq_qq;
	public String mode_qq;
	public String scl_exps_clsf_qq;
	public String qq;
	public String occr_dt_qq;
	public String bgn_mmdd;
	public String end_mmdd;

	public HD_AFFR_1501_ADM(){}
	public HD_AFFR_1501_ADM(String mode, String cmpy_cd, String occr_dt, String seq, String scl_exps_clsf, String frdt, String todt, String fix_rate_clsf, String pay_ratio_emp, String pay_ratio_ofcr, String pay_amt, String incmg_pers_ipadd, String ss_emp_no, String seq_qq, String mode_qq, String scl_exps_clsf_qq, String qq, String occr_dt_qq, String bgn_mmdd, String end_mmdd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.scl_exps_clsf = scl_exps_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.fix_rate_clsf = fix_rate_clsf;
		this.pay_ratio_emp = pay_ratio_emp;
		this.pay_ratio_ofcr = pay_ratio_ofcr;
		this.pay_amt = pay_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.seq_qq = seq_qq;
		this.mode_qq = mode_qq;
		this.scl_exps_clsf_qq = scl_exps_clsf_qq;
		this.qq = qq;
		this.occr_dt_qq = occr_dt_qq;
		this.bgn_mmdd = bgn_mmdd;
		this.end_mmdd = end_mmdd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setScl_exps_clsf(String scl_exps_clsf){
		this.scl_exps_clsf = scl_exps_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setFix_rate_clsf(String fix_rate_clsf){
		this.fix_rate_clsf = fix_rate_clsf;
	}

	public void setPay_ratio_emp(String pay_ratio_emp){
		this.pay_ratio_emp = pay_ratio_emp;
	}

	public void setPay_ratio_ofcr(String pay_ratio_ofcr){
		this.pay_ratio_ofcr = pay_ratio_ofcr;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setSeq_qq(String seq_qq){
		this.seq_qq = seq_qq;
	}

	public void setMode_qq(String mode_qq){
		this.mode_qq = mode_qq;
	}

	public void setScl_exps_clsf_qq(String scl_exps_clsf_qq){
		this.scl_exps_clsf_qq = scl_exps_clsf_qq;
	}

	public void setQq(String qq){
		this.qq = qq;
	}

	public void setOccr_dt_qq(String occr_dt_qq){
		this.occr_dt_qq = occr_dt_qq;
	}

	public void setBgn_mmdd(String bgn_mmdd){
		this.bgn_mmdd = bgn_mmdd;
	}

	public void setEnd_mmdd(String end_mmdd){
		this.end_mmdd = end_mmdd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getScl_exps_clsf(){
		return this.scl_exps_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getFix_rate_clsf(){
		return this.fix_rate_clsf;
	}

	public String getPay_ratio_emp(){
		return this.pay_ratio_emp;
	}

	public String getPay_ratio_ofcr(){
		return this.pay_ratio_ofcr;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSeq_qq(){
		return this.seq_qq;
	}

	public String getMode_qq(){
		return this.mode_qq;
	}

	public String getScl_exps_clsf_qq(){
		return this.scl_exps_clsf_qq;
	}

	public String getQq(){
		return this.qq;
	}

	public String getOccr_dt_qq(){
		return this.occr_dt_qq;
	}

	public String getBgn_mmdd(){
		return this.bgn_mmdd;
	}

	public String getEnd_mmdd(){
		return this.end_mmdd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1501_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1501_ADM dm = (HD_AFFR_1501_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.scl_exps_clsf);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.fix_rate_clsf);
		cstmt.setString(11, dm.pay_ratio_emp);
		cstmt.setString(12, dm.pay_ratio_ofcr);
		cstmt.setString(13, dm.pay_amt);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.ss_emp_no);
		cstmt.setString(16, dm.seq_qq);
		cstmt.setString(17, dm.mode_qq);
		cstmt.setString(18, dm.scl_exps_clsf_qq);
		cstmt.setString(19, dm.qq);
		cstmt.setString(20, dm.occr_dt_qq);
		cstmt.setString(21, dm.bgn_mmdd);
		cstmt.setString(22, dm.end_mmdd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1501_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("scl_exps_clsf = " + getScl_exps_clsf());
        System.out.println("frdt = " + getFrdt());
        System.out.println("todt = " + getTodt());
        System.out.println("fix_rate_clsf = " + getFix_rate_clsf());
        System.out.println("pay_ratio_emp = " + getPay_ratio_emp());
        System.out.println("pay_ratio_ofcr = " + getPay_ratio_ofcr());
        System.out.println("pay_amt = " + getPay_amt());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("ss_emp_no = " + getSs_emp_no());
        System.out.println("seq_qq = " + getSeq_qq());
        System.out.println("mode_qq = " + getMode_qq());
        System.out.println("scl_exps_clsf_qq = " + getScl_exps_clsf_qq());
        System.out.println("qq = " + getQq());
        System.out.println("occr_dt_qq = " + getOccr_dt_qq());
        System.out.println("bgn_mmdd = " + getBgn_mmdd());
        System.out.println("end_mmdd = " + getEnd_mmdd());
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
String scl_exps_clsf = req.getParameter("scl_exps_clsf");
if( scl_exps_clsf == null){
	System.out.println(this.toString+" : scl_exps_clsf is null" );
}else{
	System.out.println(this.toString+" : scl_exps_clsf is "+scl_exps_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String fix_rate_clsf = req.getParameter("fix_rate_clsf");
if( fix_rate_clsf == null){
	System.out.println(this.toString+" : fix_rate_clsf is null" );
}else{
	System.out.println(this.toString+" : fix_rate_clsf is "+fix_rate_clsf );
}
String pay_ratio_emp = req.getParameter("pay_ratio_emp");
if( pay_ratio_emp == null){
	System.out.println(this.toString+" : pay_ratio_emp is null" );
}else{
	System.out.println(this.toString+" : pay_ratio_emp is "+pay_ratio_emp );
}
String pay_ratio_ofcr = req.getParameter("pay_ratio_ofcr");
if( pay_ratio_ofcr == null){
	System.out.println(this.toString+" : pay_ratio_ofcr is null" );
}else{
	System.out.println(this.toString+" : pay_ratio_ofcr is "+pay_ratio_ofcr );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
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
String seq_qq = req.getParameter("seq_qq");
if( seq_qq == null){
	System.out.println(this.toString+" : seq_qq is null" );
}else{
	System.out.println(this.toString+" : seq_qq is "+seq_qq );
}
String mode_qq = req.getParameter("mode_qq");
if( mode_qq == null){
	System.out.println(this.toString+" : mode_qq is null" );
}else{
	System.out.println(this.toString+" : mode_qq is "+mode_qq );
}
String scl_exps_clsf_qq = req.getParameter("scl_exps_clsf_qq");
if( scl_exps_clsf_qq == null){
	System.out.println(this.toString+" : scl_exps_clsf_qq is null" );
}else{
	System.out.println(this.toString+" : scl_exps_clsf_qq is "+scl_exps_clsf_qq );
}
String qq = req.getParameter("qq");
if( qq == null){
	System.out.println(this.toString+" : qq is null" );
}else{
	System.out.println(this.toString+" : qq is "+qq );
}
String occr_dt_qq = req.getParameter("occr_dt_qq");
if( occr_dt_qq == null){
	System.out.println(this.toString+" : occr_dt_qq is null" );
}else{
	System.out.println(this.toString+" : occr_dt_qq is "+occr_dt_qq );
}
String bgn_mmdd = req.getParameter("bgn_mmdd");
if( bgn_mmdd == null){
	System.out.println(this.toString+" : bgn_mmdd is null" );
}else{
	System.out.println(this.toString+" : bgn_mmdd is "+bgn_mmdd );
}
String end_mmdd = req.getParameter("end_mmdd");
if( end_mmdd == null){
	System.out.println(this.toString+" : end_mmdd is null" );
}else{
	System.out.println(this.toString+" : end_mmdd is "+end_mmdd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String scl_exps_clsf = Util.checkString(req.getParameter("scl_exps_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String fix_rate_clsf = Util.checkString(req.getParameter("fix_rate_clsf"));
String pay_ratio_emp = Util.checkString(req.getParameter("pay_ratio_emp"));
String pay_ratio_ofcr = Util.checkString(req.getParameter("pay_ratio_ofcr"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String seq_qq = Util.checkString(req.getParameter("seq_qq"));
String mode_qq = Util.checkString(req.getParameter("mode_qq"));
String scl_exps_clsf_qq = Util.checkString(req.getParameter("scl_exps_clsf_qq"));
String qq = Util.checkString(req.getParameter("qq"));
String occr_dt_qq = Util.checkString(req.getParameter("occr_dt_qq"));
String bgn_mmdd = Util.checkString(req.getParameter("bgn_mmdd"));
String end_mmdd = Util.checkString(req.getParameter("end_mmdd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String scl_exps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String fix_rate_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_rate_clsf")));
String pay_ratio_emp = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_ratio_emp")));
String pay_ratio_ofcr = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_ratio_ofcr")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String seq_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_qq")));
String mode_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_qq")));
String scl_exps_clsf_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_exps_clsf_qq")));
String qq = Util.Uni2Ksc(Util.checkString(req.getParameter("qq")));
String occr_dt_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_qq")));
String bgn_mmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_mmdd")));
String end_mmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("end_mmdd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setScl_exps_clsf(scl_exps_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setFix_rate_clsf(fix_rate_clsf);
dm.setPay_ratio_emp(pay_ratio_emp);
dm.setPay_ratio_ofcr(pay_ratio_ofcr);
dm.setPay_amt(pay_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setSeq_qq(seq_qq);
dm.setMode_qq(mode_qq);
dm.setScl_exps_clsf_qq(scl_exps_clsf_qq);
dm.setQq(qq);
dm.setOccr_dt_qq(occr_dt_qq);
dm.setBgn_mmdd(bgn_mmdd);
dm.setEnd_mmdd(end_mmdd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 09:16:22 KST 2009 */