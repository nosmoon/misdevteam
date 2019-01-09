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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1640_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String seq;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String car_no;
	public String car_ownr_nm;
	public String prn;
	public String tel_no;
	public String ptph_no;
	public String fax_no;
	public String email;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String yy_styl;
	public String engn_dsplt;
	public String car_clsf;
	public String insr_entr_hope_yn;
	public String insr_rmtt_plan_dt;
	public String bank_nm;
	public String rcpm_pers_nm;
	public String proc_clsf;
	public String insr_cmpy_nm;
	public String reg_dt;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SP_SAL_1640_ADM(){}
	public SP_SAL_1640_ADM(String cmpy_cd, String mode, String seq, String dlco_clsf, String dlco_cd, String dlco_seq, String car_no, String car_ownr_nm, String prn, String tel_no, String ptph_no, String fax_no, String email, String zip_1, String zip_2, String addr, String dtls_addr, String yy_styl, String engn_dsplt, String car_clsf, String insr_entr_hope_yn, String insr_rmtt_plan_dt, String bank_nm, String rcpm_pers_nm, String proc_clsf, String insr_cmpy_nm, String reg_dt, String remk, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.seq = seq;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.car_no = car_no;
		this.car_ownr_nm = car_ownr_nm;
		this.prn = prn;
		this.tel_no = tel_no;
		this.ptph_no = ptph_no;
		this.fax_no = fax_no;
		this.email = email;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.yy_styl = yy_styl;
		this.engn_dsplt = engn_dsplt;
		this.car_clsf = car_clsf;
		this.insr_entr_hope_yn = insr_entr_hope_yn;
		this.insr_rmtt_plan_dt = insr_rmtt_plan_dt;
		this.bank_nm = bank_nm;
		this.rcpm_pers_nm = rcpm_pers_nm;
		this.proc_clsf = proc_clsf;
		this.insr_cmpy_nm = insr_cmpy_nm;
		this.reg_dt = reg_dt;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCar_ownr_nm(String car_ownr_nm){
		this.car_ownr_nm = car_ownr_nm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setYy_styl(String yy_styl){
		this.yy_styl = yy_styl;
	}

	public void setEngn_dsplt(String engn_dsplt){
		this.engn_dsplt = engn_dsplt;
	}

	public void setCar_clsf(String car_clsf){
		this.car_clsf = car_clsf;
	}

	public void setInsr_entr_hope_yn(String insr_entr_hope_yn){
		this.insr_entr_hope_yn = insr_entr_hope_yn;
	}

	public void setInsr_rmtt_plan_dt(String insr_rmtt_plan_dt){
		this.insr_rmtt_plan_dt = insr_rmtt_plan_dt;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setRcpm_pers_nm(String rcpm_pers_nm){
		this.rcpm_pers_nm = rcpm_pers_nm;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setInsr_cmpy_nm(String insr_cmpy_nm){
		this.insr_cmpy_nm = insr_cmpy_nm;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCar_ownr_nm(){
		return this.car_ownr_nm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getYy_styl(){
		return this.yy_styl;
	}

	public String getEngn_dsplt(){
		return this.engn_dsplt;
	}

	public String getCar_clsf(){
		return this.car_clsf;
	}

	public String getInsr_entr_hope_yn(){
		return this.insr_entr_hope_yn;
	}

	public String getInsr_rmtt_plan_dt(){
		return this.insr_rmtt_plan_dt;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getRcpm_pers_nm(){
		return this.rcpm_pers_nm;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getInsr_cmpy_nm(){
		return this.insr_cmpy_nm;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1640_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1640_ADM dm = (SP_SAL_1640_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.dlco_clsf);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.dlco_seq);
		cstmt.setString(9, dm.car_no);
		cstmt.setString(10, dm.car_ownr_nm);
		cstmt.setString(11, dm.prn);
		cstmt.setString(12, dm.tel_no);
		cstmt.setString(13, dm.ptph_no);
		cstmt.setString(14, dm.fax_no);
		cstmt.setString(15, dm.email);
		cstmt.setString(16, dm.zip_1);
		cstmt.setString(17, dm.zip_2);
		cstmt.setString(18, dm.addr);
		cstmt.setString(19, dm.dtls_addr);
		cstmt.setString(20, dm.yy_styl);
		cstmt.setString(21, dm.engn_dsplt);
		cstmt.setString(22, dm.car_clsf);
		cstmt.setString(23, dm.insr_entr_hope_yn);
		cstmt.setString(24, dm.insr_rmtt_plan_dt);
		cstmt.setString(25, dm.bank_nm);
		cstmt.setString(26, dm.rcpm_pers_nm);
		cstmt.setString(27, dm.proc_clsf);
		cstmt.setString(28, dm.insr_cmpy_nm);
		cstmt.setString(29, dm.reg_dt);
		cstmt.setString(30, dm.remk);
		cstmt.setString(31, dm.incmg_pers);
		cstmt.setString(32, dm.incmg_pers_ip);
		cstmt.registerOutParameter(33, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1640_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("car_ownr_nm = [" + getCar_ownr_nm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("ptph_no = [" + getPtph_no() + "]");
		System.out.println("fax_no = [" + getFax_no() + "]");
		System.out.println("email = [" + getEmail() + "]");
		System.out.println("zip_1 = [" + getZip_1() + "]");
		System.out.println("zip_2 = [" + getZip_2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("yy_styl = [" + getYy_styl() + "]");
		System.out.println("engn_dsplt = [" + getEngn_dsplt() + "]");
		System.out.println("car_clsf = [" + getCar_clsf() + "]");
		System.out.println("insr_entr_hope_yn = [" + getInsr_entr_hope_yn() + "]");
		System.out.println("insr_rmtt_plan_dt = [" + getInsr_rmtt_plan_dt() + "]");
		System.out.println("bank_nm = [" + getBank_nm() + "]");
		System.out.println("rcpm_pers_nm = [" + getRcpm_pers_nm() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("insr_cmpy_nm = [" + getInsr_cmpy_nm() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String car_ownr_nm = req.getParameter("car_ownr_nm");
if( car_ownr_nm == null){
	System.out.println(this.toString+" : car_ownr_nm is null" );
}else{
	System.out.println(this.toString+" : car_ownr_nm is "+car_ownr_nm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String ptph_no = req.getParameter("ptph_no");
if( ptph_no == null){
	System.out.println(this.toString+" : ptph_no is null" );
}else{
	System.out.println(this.toString+" : ptph_no is "+ptph_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String yy_styl = req.getParameter("yy_styl");
if( yy_styl == null){
	System.out.println(this.toString+" : yy_styl is null" );
}else{
	System.out.println(this.toString+" : yy_styl is "+yy_styl );
}
String engn_dsplt = req.getParameter("engn_dsplt");
if( engn_dsplt == null){
	System.out.println(this.toString+" : engn_dsplt is null" );
}else{
	System.out.println(this.toString+" : engn_dsplt is "+engn_dsplt );
}
String car_clsf = req.getParameter("car_clsf");
if( car_clsf == null){
	System.out.println(this.toString+" : car_clsf is null" );
}else{
	System.out.println(this.toString+" : car_clsf is "+car_clsf );
}
String insr_entr_hope_yn = req.getParameter("insr_entr_hope_yn");
if( insr_entr_hope_yn == null){
	System.out.println(this.toString+" : insr_entr_hope_yn is null" );
}else{
	System.out.println(this.toString+" : insr_entr_hope_yn is "+insr_entr_hope_yn );
}
String insr_rmtt_plan_dt = req.getParameter("insr_rmtt_plan_dt");
if( insr_rmtt_plan_dt == null){
	System.out.println(this.toString+" : insr_rmtt_plan_dt is null" );
}else{
	System.out.println(this.toString+" : insr_rmtt_plan_dt is "+insr_rmtt_plan_dt );
}
String bank_nm = req.getParameter("bank_nm");
if( bank_nm == null){
	System.out.println(this.toString+" : bank_nm is null" );
}else{
	System.out.println(this.toString+" : bank_nm is "+bank_nm );
}
String rcpm_pers_nm = req.getParameter("rcpm_pers_nm");
if( rcpm_pers_nm == null){
	System.out.println(this.toString+" : rcpm_pers_nm is null" );
}else{
	System.out.println(this.toString+" : rcpm_pers_nm is "+rcpm_pers_nm );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
String insr_cmpy_nm = req.getParameter("insr_cmpy_nm");
if( insr_cmpy_nm == null){
	System.out.println(this.toString+" : insr_cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : insr_cmpy_nm is "+insr_cmpy_nm );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String car_no = Util.checkString(req.getParameter("car_no"));
String car_ownr_nm = Util.checkString(req.getParameter("car_ownr_nm"));
String prn = Util.checkString(req.getParameter("prn"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String ptph_no = Util.checkString(req.getParameter("ptph_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String email = Util.checkString(req.getParameter("email"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String yy_styl = Util.checkString(req.getParameter("yy_styl"));
String engn_dsplt = Util.checkString(req.getParameter("engn_dsplt"));
String car_clsf = Util.checkString(req.getParameter("car_clsf"));
String insr_entr_hope_yn = Util.checkString(req.getParameter("insr_entr_hope_yn"));
String insr_rmtt_plan_dt = Util.checkString(req.getParameter("insr_rmtt_plan_dt"));
String bank_nm = Util.checkString(req.getParameter("bank_nm"));
String rcpm_pers_nm = Util.checkString(req.getParameter("rcpm_pers_nm"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String insr_cmpy_nm = Util.checkString(req.getParameter("insr_cmpy_nm"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String car_ownr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("car_ownr_nm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String yy_styl = Util.Uni2Ksc(Util.checkString(req.getParameter("yy_styl")));
String engn_dsplt = Util.Uni2Ksc(Util.checkString(req.getParameter("engn_dsplt")));
String car_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("car_clsf")));
String insr_entr_hope_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_entr_hope_yn")));
String insr_rmtt_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_rmtt_plan_dt")));
String bank_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_nm")));
String rcpm_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_pers_nm")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String insr_cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_cmpy_nm")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSeq(seq);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setCar_no(car_no);
dm.setCar_ownr_nm(car_ownr_nm);
dm.setPrn(prn);
dm.setTel_no(tel_no);
dm.setPtph_no(ptph_no);
dm.setFax_no(fax_no);
dm.setEmail(email);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setYy_styl(yy_styl);
dm.setEngn_dsplt(engn_dsplt);
dm.setCar_clsf(car_clsf);
dm.setInsr_entr_hope_yn(insr_entr_hope_yn);
dm.setInsr_rmtt_plan_dt(insr_rmtt_plan_dt);
dm.setBank_nm(bank_nm);
dm.setRcpm_pers_nm(rcpm_pers_nm);
dm.setProc_clsf(proc_clsf);
dm.setInsr_cmpy_nm(insr_cmpy_nm);
dm.setReg_dt(reg_dt);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 06 16:51:04 KST 2012 */