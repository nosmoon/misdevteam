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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String acpn_yy;
	public String acpn_seq;
	public String acpn_dt;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String now_seiz_clsf;
	public String fst_seiz_clsf;
	public String seiz_deci_dt;
	public String seiz_clsf_chg_dt;
	public String crdtor;
	public String seiz_clam_amt;
	public String seiz_dduc_ratio;
	public String seiz_bgn_saly_yy;
	public String seiz_bgn_saly_no;
	public String dduc_amt_agg;
	public String repay_amt_agg;
	public String psdo_seiz_rels_dt;
	public String dduc_end_yn;
	public String dduc_end_dt;
	public String repay_end_yn;
	public String repay_end_dt;
	public String u_ipadd;
	public String u_id;

	public HD_SALY_4302_ADM(){}
	public HD_SALY_4302_ADM(String mode, String cmpy_cd, String acpn_yy, String acpn_seq, String acpn_dt, String emp_no, String flnm, String dept_cd, String now_seiz_clsf, String fst_seiz_clsf, String seiz_deci_dt, String seiz_clsf_chg_dt, String crdtor, String seiz_clam_amt, String seiz_dduc_ratio, String seiz_bgn_saly_yy, String seiz_bgn_saly_no, String dduc_amt_agg, String repay_amt_agg, String psdo_seiz_rels_dt, String dduc_end_yn, String dduc_end_dt, String repay_end_yn, String repay_end_dt, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.acpn_yy = acpn_yy;
		this.acpn_seq = acpn_seq;
		this.acpn_dt = acpn_dt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.now_seiz_clsf = now_seiz_clsf;
		this.fst_seiz_clsf = fst_seiz_clsf;
		this.seiz_deci_dt = seiz_deci_dt;
		this.seiz_clsf_chg_dt = seiz_clsf_chg_dt;
		this.crdtor = crdtor;
		this.seiz_clam_amt = seiz_clam_amt;
		this.seiz_dduc_ratio = seiz_dduc_ratio;
		this.seiz_bgn_saly_yy = seiz_bgn_saly_yy;
		this.seiz_bgn_saly_no = seiz_bgn_saly_no;
		this.dduc_amt_agg = dduc_amt_agg;
		this.repay_amt_agg = repay_amt_agg;
		this.psdo_seiz_rels_dt = psdo_seiz_rels_dt;
		this.dduc_end_yn = dduc_end_yn;
		this.dduc_end_dt = dduc_end_dt;
		this.repay_end_yn = repay_end_yn;
		this.repay_end_dt = repay_end_dt;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_yy(String acpn_yy){
		this.acpn_yy = acpn_yy;
	}

	public void setAcpn_seq(String acpn_seq){
		this.acpn_seq = acpn_seq;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setNow_seiz_clsf(String now_seiz_clsf){
		this.now_seiz_clsf = now_seiz_clsf;
	}

	public void setFst_seiz_clsf(String fst_seiz_clsf){
		this.fst_seiz_clsf = fst_seiz_clsf;
	}

	public void setSeiz_deci_dt(String seiz_deci_dt){
		this.seiz_deci_dt = seiz_deci_dt;
	}

	public void setSeiz_clsf_chg_dt(String seiz_clsf_chg_dt){
		this.seiz_clsf_chg_dt = seiz_clsf_chg_dt;
	}

	public void setCrdtor(String crdtor){
		this.crdtor = crdtor;
	}

	public void setSeiz_clam_amt(String seiz_clam_amt){
		this.seiz_clam_amt = seiz_clam_amt;
	}

	public void setSeiz_dduc_ratio(String seiz_dduc_ratio){
		this.seiz_dduc_ratio = seiz_dduc_ratio;
	}

	public void setSeiz_bgn_saly_yy(String seiz_bgn_saly_yy){
		this.seiz_bgn_saly_yy = seiz_bgn_saly_yy;
	}

	public void setSeiz_bgn_saly_no(String seiz_bgn_saly_no){
		this.seiz_bgn_saly_no = seiz_bgn_saly_no;
	}

	public void setDduc_amt_agg(String dduc_amt_agg){
		this.dduc_amt_agg = dduc_amt_agg;
	}

	public void setRepay_amt_agg(String repay_amt_agg){
		this.repay_amt_agg = repay_amt_agg;
	}

	public void setPsdo_seiz_rels_dt(String psdo_seiz_rels_dt){
		this.psdo_seiz_rels_dt = psdo_seiz_rels_dt;
	}

	public void setDduc_end_yn(String dduc_end_yn){
		this.dduc_end_yn = dduc_end_yn;
	}

	public void setDduc_end_dt(String dduc_end_dt){
		this.dduc_end_dt = dduc_end_dt;
	}

	public void setRepay_end_yn(String repay_end_yn){
		this.repay_end_yn = repay_end_yn;
	}

	public void setRepay_end_dt(String repay_end_dt){
		this.repay_end_dt = repay_end_dt;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_yy(){
		return this.acpn_yy;
	}

	public String getAcpn_seq(){
		return this.acpn_seq;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getNow_seiz_clsf(){
		return this.now_seiz_clsf;
	}

	public String getFst_seiz_clsf(){
		return this.fst_seiz_clsf;
	}

	public String getSeiz_deci_dt(){
		return this.seiz_deci_dt;
	}

	public String getSeiz_clsf_chg_dt(){
		return this.seiz_clsf_chg_dt;
	}

	public String getCrdtor(){
		return this.crdtor;
	}

	public String getSeiz_clam_amt(){
		return this.seiz_clam_amt;
	}

	public String getSeiz_dduc_ratio(){
		return this.seiz_dduc_ratio;
	}

	public String getSeiz_bgn_saly_yy(){
		return this.seiz_bgn_saly_yy;
	}

	public String getSeiz_bgn_saly_no(){
		return this.seiz_bgn_saly_no;
	}

	public String getDduc_amt_agg(){
		return this.dduc_amt_agg;
	}

	public String getRepay_amt_agg(){
		return this.repay_amt_agg;
	}

	public String getPsdo_seiz_rels_dt(){
		return this.psdo_seiz_rels_dt;
	}

	public String getDduc_end_yn(){
		return this.dduc_end_yn;
	}

	public String getDduc_end_dt(){
		return this.dduc_end_dt;
	}

	public String getRepay_end_yn(){
		return this.repay_end_yn;
	}

	public String getRepay_end_dt(){
		return this.repay_end_dt;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4302_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4302_ADM dm = (HD_SALY_4302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.acpn_yy);
		cstmt.setString(6, dm.acpn_seq);
		cstmt.setString(7, dm.acpn_dt);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.now_seiz_clsf);
		cstmt.setString(12, dm.fst_seiz_clsf);
		cstmt.setString(13, dm.seiz_deci_dt);
		cstmt.setString(14, dm.seiz_clsf_chg_dt);
		cstmt.setString(15, dm.crdtor);
		cstmt.setString(16, dm.seiz_clam_amt);
		cstmt.setString(17, dm.seiz_dduc_ratio);
		cstmt.setString(18, dm.seiz_bgn_saly_yy);
		cstmt.setString(19, dm.seiz_bgn_saly_no);
		cstmt.setString(20, dm.dduc_amt_agg);
		cstmt.setString(21, dm.repay_amt_agg);
		cstmt.setString(22, dm.psdo_seiz_rels_dt);
		cstmt.setString(23, dm.dduc_end_yn);
		cstmt.setString(24, dm.dduc_end_dt);
		cstmt.setString(25, dm.repay_end_yn);
		cstmt.setString(26, dm.repay_end_dt);
		cstmt.setString(27, dm.u_ipadd);
		cstmt.setString(28, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4302_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_yy = [" + getAcpn_yy() + "]");
		System.out.println("acpn_seq = [" + getAcpn_seq() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("now_seiz_clsf = [" + getNow_seiz_clsf() + "]");
		System.out.println("fst_seiz_clsf = [" + getFst_seiz_clsf() + "]");
		System.out.println("seiz_deci_dt = [" + getSeiz_deci_dt() + "]");
		System.out.println("seiz_clsf_chg_dt = [" + getSeiz_clsf_chg_dt() + "]");
		System.out.println("crdtor = [" + getCrdtor() + "]");
		System.out.println("seiz_clam_amt = [" + getSeiz_clam_amt() + "]");
		System.out.println("seiz_dduc_ratio = [" + getSeiz_dduc_ratio() + "]");
		System.out.println("seiz_bgn_saly_yy = [" + getSeiz_bgn_saly_yy() + "]");
		System.out.println("seiz_bgn_saly_no = [" + getSeiz_bgn_saly_no() + "]");
		System.out.println("dduc_amt_agg = [" + getDduc_amt_agg() + "]");
		System.out.println("repay_amt_agg = [" + getRepay_amt_agg() + "]");
		System.out.println("psdo_seiz_rels_dt = [" + getPsdo_seiz_rels_dt() + "]");
		System.out.println("dduc_end_yn = [" + getDduc_end_yn() + "]");
		System.out.println("dduc_end_dt = [" + getDduc_end_dt() + "]");
		System.out.println("repay_end_yn = [" + getRepay_end_yn() + "]");
		System.out.println("repay_end_dt = [" + getRepay_end_dt() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String acpn_yy = req.getParameter("acpn_yy");
if( acpn_yy == null){
	System.out.println(this.toString+" : acpn_yy is null" );
}else{
	System.out.println(this.toString+" : acpn_yy is "+acpn_yy );
}
String acpn_seq = req.getParameter("acpn_seq");
if( acpn_seq == null){
	System.out.println(this.toString+" : acpn_seq is null" );
}else{
	System.out.println(this.toString+" : acpn_seq is "+acpn_seq );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String now_seiz_clsf = req.getParameter("now_seiz_clsf");
if( now_seiz_clsf == null){
	System.out.println(this.toString+" : now_seiz_clsf is null" );
}else{
	System.out.println(this.toString+" : now_seiz_clsf is "+now_seiz_clsf );
}
String fst_seiz_clsf = req.getParameter("fst_seiz_clsf");
if( fst_seiz_clsf == null){
	System.out.println(this.toString+" : fst_seiz_clsf is null" );
}else{
	System.out.println(this.toString+" : fst_seiz_clsf is "+fst_seiz_clsf );
}
String seiz_deci_dt = req.getParameter("seiz_deci_dt");
if( seiz_deci_dt == null){
	System.out.println(this.toString+" : seiz_deci_dt is null" );
}else{
	System.out.println(this.toString+" : seiz_deci_dt is "+seiz_deci_dt );
}
String seiz_clsf_chg_dt = req.getParameter("seiz_clsf_chg_dt");
if( seiz_clsf_chg_dt == null){
	System.out.println(this.toString+" : seiz_clsf_chg_dt is null" );
}else{
	System.out.println(this.toString+" : seiz_clsf_chg_dt is "+seiz_clsf_chg_dt );
}
String crdtor = req.getParameter("crdtor");
if( crdtor == null){
	System.out.println(this.toString+" : crdtor is null" );
}else{
	System.out.println(this.toString+" : crdtor is "+crdtor );
}
String seiz_clam_amt = req.getParameter("seiz_clam_amt");
if( seiz_clam_amt == null){
	System.out.println(this.toString+" : seiz_clam_amt is null" );
}else{
	System.out.println(this.toString+" : seiz_clam_amt is "+seiz_clam_amt );
}
String seiz_dduc_ratio = req.getParameter("seiz_dduc_ratio");
if( seiz_dduc_ratio == null){
	System.out.println(this.toString+" : seiz_dduc_ratio is null" );
}else{
	System.out.println(this.toString+" : seiz_dduc_ratio is "+seiz_dduc_ratio );
}
String seiz_bgn_saly_yy = req.getParameter("seiz_bgn_saly_yy");
if( seiz_bgn_saly_yy == null){
	System.out.println(this.toString+" : seiz_bgn_saly_yy is null" );
}else{
	System.out.println(this.toString+" : seiz_bgn_saly_yy is "+seiz_bgn_saly_yy );
}
String seiz_bgn_saly_no = req.getParameter("seiz_bgn_saly_no");
if( seiz_bgn_saly_no == null){
	System.out.println(this.toString+" : seiz_bgn_saly_no is null" );
}else{
	System.out.println(this.toString+" : seiz_bgn_saly_no is "+seiz_bgn_saly_no );
}
String dduc_amt_agg = req.getParameter("dduc_amt_agg");
if( dduc_amt_agg == null){
	System.out.println(this.toString+" : dduc_amt_agg is null" );
}else{
	System.out.println(this.toString+" : dduc_amt_agg is "+dduc_amt_agg );
}
String repay_amt_agg = req.getParameter("repay_amt_agg");
if( repay_amt_agg == null){
	System.out.println(this.toString+" : repay_amt_agg is null" );
}else{
	System.out.println(this.toString+" : repay_amt_agg is "+repay_amt_agg );
}
String psdo_seiz_rels_dt = req.getParameter("psdo_seiz_rels_dt");
if( psdo_seiz_rels_dt == null){
	System.out.println(this.toString+" : psdo_seiz_rels_dt is null" );
}else{
	System.out.println(this.toString+" : psdo_seiz_rels_dt is "+psdo_seiz_rels_dt );
}
String dduc_end_yn = req.getParameter("dduc_end_yn");
if( dduc_end_yn == null){
	System.out.println(this.toString+" : dduc_end_yn is null" );
}else{
	System.out.println(this.toString+" : dduc_end_yn is "+dduc_end_yn );
}
String dduc_end_dt = req.getParameter("dduc_end_dt");
if( dduc_end_dt == null){
	System.out.println(this.toString+" : dduc_end_dt is null" );
}else{
	System.out.println(this.toString+" : dduc_end_dt is "+dduc_end_dt );
}
String repay_end_yn = req.getParameter("repay_end_yn");
if( repay_end_yn == null){
	System.out.println(this.toString+" : repay_end_yn is null" );
}else{
	System.out.println(this.toString+" : repay_end_yn is "+repay_end_yn );
}
String repay_end_dt = req.getParameter("repay_end_dt");
if( repay_end_dt == null){
	System.out.println(this.toString+" : repay_end_dt is null" );
}else{
	System.out.println(this.toString+" : repay_end_dt is "+repay_end_dt );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acpn_yy = Util.checkString(req.getParameter("acpn_yy"));
String acpn_seq = Util.checkString(req.getParameter("acpn_seq"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String now_seiz_clsf = Util.checkString(req.getParameter("now_seiz_clsf"));
String fst_seiz_clsf = Util.checkString(req.getParameter("fst_seiz_clsf"));
String seiz_deci_dt = Util.checkString(req.getParameter("seiz_deci_dt"));
String seiz_clsf_chg_dt = Util.checkString(req.getParameter("seiz_clsf_chg_dt"));
String crdtor = Util.checkString(req.getParameter("crdtor"));
String seiz_clam_amt = Util.checkString(req.getParameter("seiz_clam_amt"));
String seiz_dduc_ratio = Util.checkString(req.getParameter("seiz_dduc_ratio"));
String seiz_bgn_saly_yy = Util.checkString(req.getParameter("seiz_bgn_saly_yy"));
String seiz_bgn_saly_no = Util.checkString(req.getParameter("seiz_bgn_saly_no"));
String dduc_amt_agg = Util.checkString(req.getParameter("dduc_amt_agg"));
String repay_amt_agg = Util.checkString(req.getParameter("repay_amt_agg"));
String psdo_seiz_rels_dt = Util.checkString(req.getParameter("psdo_seiz_rels_dt"));
String dduc_end_yn = Util.checkString(req.getParameter("dduc_end_yn"));
String dduc_end_dt = Util.checkString(req.getParameter("dduc_end_dt"));
String repay_end_yn = Util.checkString(req.getParameter("repay_end_yn"));
String repay_end_dt = Util.checkString(req.getParameter("repay_end_dt"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_yy")));
String acpn_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_seq")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String now_seiz_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("now_seiz_clsf")));
String fst_seiz_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fst_seiz_clsf")));
String seiz_deci_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_deci_dt")));
String seiz_clsf_chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_clsf_chg_dt")));
String crdtor = Util.Uni2Ksc(Util.checkString(req.getParameter("crdtor")));
String seiz_clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_clam_amt")));
String seiz_dduc_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_dduc_ratio")));
String seiz_bgn_saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_bgn_saly_yy")));
String seiz_bgn_saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("seiz_bgn_saly_no")));
String dduc_amt_agg = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_amt_agg")));
String repay_amt_agg = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_amt_agg")));
String psdo_seiz_rels_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("psdo_seiz_rels_dt")));
String dduc_end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_end_yn")));
String dduc_end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_end_dt")));
String repay_end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_end_yn")));
String repay_end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_end_dt")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_yy(acpn_yy);
dm.setAcpn_seq(acpn_seq);
dm.setAcpn_dt(acpn_dt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setNow_seiz_clsf(now_seiz_clsf);
dm.setFst_seiz_clsf(fst_seiz_clsf);
dm.setSeiz_deci_dt(seiz_deci_dt);
dm.setSeiz_clsf_chg_dt(seiz_clsf_chg_dt);
dm.setCrdtor(crdtor);
dm.setSeiz_clam_amt(seiz_clam_amt);
dm.setSeiz_dduc_ratio(seiz_dduc_ratio);
dm.setSeiz_bgn_saly_yy(seiz_bgn_saly_yy);
dm.setSeiz_bgn_saly_no(seiz_bgn_saly_no);
dm.setDduc_amt_agg(dduc_amt_agg);
dm.setRepay_amt_agg(repay_amt_agg);
dm.setPsdo_seiz_rels_dt(psdo_seiz_rels_dt);
dm.setDduc_end_yn(dduc_end_yn);
dm.setDduc_end_dt(dduc_end_dt);
dm.setRepay_end_yn(repay_end_yn);
dm.setRepay_end_dt(repay_end_dt);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 10:39:18 KST 2009 */