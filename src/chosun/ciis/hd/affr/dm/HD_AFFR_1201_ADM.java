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


public class HD_AFFR_1201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String preng_condo_nm_1;
	public String preng_condo_cd_1;
	public String preng_condo_area_cd_1;
	public String use_frdt;
	public String use_todt;
	public String use_dds;
	public String guest_room_cnt;
	public String cmpy_sply_use_yn;
	public String preng_no;
	public String use_pay_amt;
	public String slf_burd_amt;
	public String cmpy_sply_amt;
	public String slf_drbk_amt;
	public String guest_room_fee_tot_amt;
	public String remk;
	public String seq;
	public String occr_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_AFFR_1201_ADM(){}
	public HD_AFFR_1201_ADM(String mode, String cmpy_cd, String emp_no, String preng_condo_nm_1, String preng_condo_cd_1, String preng_condo_area_cd_1, String use_frdt, String use_todt, String use_dds, String guest_room_cnt, String cmpy_sply_use_yn, String preng_no, String use_pay_amt, String slf_burd_amt, String cmpy_sply_amt, String slf_drbk_amt, String guest_room_fee_tot_amt, String remk, String seq, String occr_dt, String incmg_pers, String incmg_pers_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.preng_condo_nm_1 = preng_condo_nm_1;
		this.preng_condo_cd_1 = preng_condo_cd_1;
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
		this.use_frdt = use_frdt;
		this.use_todt = use_todt;
		this.use_dds = use_dds;
		this.guest_room_cnt = guest_room_cnt;
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
		this.preng_no = preng_no;
		this.use_pay_amt = use_pay_amt;
		this.slf_burd_amt = slf_burd_amt;
		this.cmpy_sply_amt = cmpy_sply_amt;
		this.slf_drbk_amt = slf_drbk_amt;
		this.guest_room_fee_tot_amt = guest_room_fee_tot_amt;
		this.remk = remk;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public void setPreng_condo_nm_1(String preng_condo_nm_1){
		this.preng_condo_nm_1 = preng_condo_nm_1;
	}

	public void setPreng_condo_cd_1(String preng_condo_cd_1){
		this.preng_condo_cd_1 = preng_condo_cd_1;
	}

	public void setPreng_condo_area_cd_1(String preng_condo_area_cd_1){
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
	}

	public void setUse_frdt(String use_frdt){
		this.use_frdt = use_frdt;
	}

	public void setUse_todt(String use_todt){
		this.use_todt = use_todt;
	}

	public void setUse_dds(String use_dds){
		this.use_dds = use_dds;
	}

	public void setGuest_room_cnt(String guest_room_cnt){
		this.guest_room_cnt = guest_room_cnt;
	}

	public void setCmpy_sply_use_yn(String cmpy_sply_use_yn){
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
	}

	public void setPreng_no(String preng_no){
		this.preng_no = preng_no;
	}

	public void setUse_pay_amt(String use_pay_amt){
		this.use_pay_amt = use_pay_amt;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setCmpy_sply_amt(String cmpy_sply_amt){
		this.cmpy_sply_amt = cmpy_sply_amt;
	}

	public void setSlf_drbk_amt(String slf_drbk_amt){
		this.slf_drbk_amt = slf_drbk_amt;
	}

	public void setGuest_room_fee_tot_amt(String guest_room_fee_tot_amt){
		this.guest_room_fee_tot_amt = guest_room_fee_tot_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public String getPreng_condo_nm_1(){
		return this.preng_condo_nm_1;
	}

	public String getPreng_condo_cd_1(){
		return this.preng_condo_cd_1;
	}

	public String getPreng_condo_area_cd_1(){
		return this.preng_condo_area_cd_1;
	}

	public String getUse_frdt(){
		return this.use_frdt;
	}

	public String getUse_todt(){
		return this.use_todt;
	}

	public String getUse_dds(){
		return this.use_dds;
	}

	public String getGuest_room_cnt(){
		return this.guest_room_cnt;
	}

	public String getCmpy_sply_use_yn(){
		return this.cmpy_sply_use_yn;
	}

	public String getPreng_no(){
		return this.preng_no;
	}

	public String getUse_pay_amt(){
		return this.use_pay_amt;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getCmpy_sply_amt(){
		return this.cmpy_sply_amt;
	}

	public String getSlf_drbk_amt(){
		return this.slf_drbk_amt;
	}

	public String getGuest_room_fee_tot_amt(){
		return this.guest_room_fee_tot_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1201_ADM dm = (HD_AFFR_1201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.preng_condo_nm_1);
		cstmt.setString(7, dm.preng_condo_cd_1);
		cstmt.setString(8, dm.preng_condo_area_cd_1);
		cstmt.setString(9, dm.use_frdt);
		cstmt.setString(10, dm.use_todt);
		cstmt.setString(11, dm.use_dds);
		cstmt.setString(12, dm.guest_room_cnt);
		cstmt.setString(13, dm.cmpy_sply_use_yn);
		cstmt.setString(14, dm.preng_no);
		cstmt.setString(15, dm.use_pay_amt);
		cstmt.setString(16, dm.slf_burd_amt);
		cstmt.setString(17, dm.cmpy_sply_amt);
		cstmt.setString(18, dm.slf_drbk_amt);
		cstmt.setString(19, dm.guest_room_fee_tot_amt);
		cstmt.setString(20, dm.remk);
		cstmt.setString(21, dm.seq);
		cstmt.setString(22, dm.occr_dt);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("preng_condo_nm_1 = [" + getPreng_condo_nm_1() + "]");
		System.out.println("preng_condo_cd_1 = [" + getPreng_condo_cd_1() + "]");
		System.out.println("preng_condo_area_cd_1 = [" + getPreng_condo_area_cd_1() + "]");
		System.out.println("use_frdt = [" + getUse_frdt() + "]");
		System.out.println("use_todt = [" + getUse_todt() + "]");
		System.out.println("use_dds = [" + getUse_dds() + "]");
		System.out.println("guest_room_cnt = [" + getGuest_room_cnt() + "]");
		System.out.println("cmpy_sply_use_yn = [" + getCmpy_sply_use_yn() + "]");
		System.out.println("preng_no = [" + getPreng_no() + "]");
		System.out.println("use_pay_amt = [" + getUse_pay_amt() + "]");
		System.out.println("slf_burd_amt = [" + getSlf_burd_amt() + "]");
		System.out.println("cmpy_sply_amt = [" + getCmpy_sply_amt() + "]");
		System.out.println("slf_drbk_amt = [" + getSlf_drbk_amt() + "]");
		System.out.println("guest_room_fee_tot_amt = [" + getGuest_room_fee_tot_amt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String preng_condo_nm_1 = req.getParameter("preng_condo_nm_1");
if( preng_condo_nm_1 == null){
	System.out.println(this.toString+" : preng_condo_nm_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_nm_1 is "+preng_condo_nm_1 );
}
String preng_condo_cd_1 = req.getParameter("preng_condo_cd_1");
if( preng_condo_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_cd_1 is "+preng_condo_cd_1 );
}
String preng_condo_area_cd_1 = req.getParameter("preng_condo_area_cd_1");
if( preng_condo_area_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_1 is "+preng_condo_area_cd_1 );
}
String use_frdt = req.getParameter("use_frdt");
if( use_frdt == null){
	System.out.println(this.toString+" : use_frdt is null" );
}else{
	System.out.println(this.toString+" : use_frdt is "+use_frdt );
}
String use_todt = req.getParameter("use_todt");
if( use_todt == null){
	System.out.println(this.toString+" : use_todt is null" );
}else{
	System.out.println(this.toString+" : use_todt is "+use_todt );
}
String use_dds = req.getParameter("use_dds");
if( use_dds == null){
	System.out.println(this.toString+" : use_dds is null" );
}else{
	System.out.println(this.toString+" : use_dds is "+use_dds );
}
String guest_room_cnt = req.getParameter("guest_room_cnt");
if( guest_room_cnt == null){
	System.out.println(this.toString+" : guest_room_cnt is null" );
}else{
	System.out.println(this.toString+" : guest_room_cnt is "+guest_room_cnt );
}
String cmpy_sply_use_yn = req.getParameter("cmpy_sply_use_yn");
if( cmpy_sply_use_yn == null){
	System.out.println(this.toString+" : cmpy_sply_use_yn is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_use_yn is "+cmpy_sply_use_yn );
}
String preng_no = req.getParameter("preng_no");
if( preng_no == null){
	System.out.println(this.toString+" : preng_no is null" );
}else{
	System.out.println(this.toString+" : preng_no is "+preng_no );
}
String use_pay_amt = req.getParameter("use_pay_amt");
if( use_pay_amt == null){
	System.out.println(this.toString+" : use_pay_amt is null" );
}else{
	System.out.println(this.toString+" : use_pay_amt is "+use_pay_amt );
}
String slf_burd_amt = req.getParameter("slf_burd_amt");
if( slf_burd_amt == null){
	System.out.println(this.toString+" : slf_burd_amt is null" );
}else{
	System.out.println(this.toString+" : slf_burd_amt is "+slf_burd_amt );
}
String cmpy_sply_amt = req.getParameter("cmpy_sply_amt");
if( cmpy_sply_amt == null){
	System.out.println(this.toString+" : cmpy_sply_amt is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_amt is "+cmpy_sply_amt );
}
String slf_drbk_amt = req.getParameter("slf_drbk_amt");
if( slf_drbk_amt == null){
	System.out.println(this.toString+" : slf_drbk_amt is null" );
}else{
	System.out.println(this.toString+" : slf_drbk_amt is "+slf_drbk_amt );
}
String guest_room_fee_tot_amt = req.getParameter("guest_room_fee_tot_amt");
if( guest_room_fee_tot_amt == null){
	System.out.println(this.toString+" : guest_room_fee_tot_amt is null" );
}else{
	System.out.println(this.toString+" : guest_room_fee_tot_amt is "+guest_room_fee_tot_amt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String preng_condo_nm_1 = Util.checkString(req.getParameter("preng_condo_nm_1"));
String preng_condo_cd_1 = Util.checkString(req.getParameter("preng_condo_cd_1"));
String preng_condo_area_cd_1 = Util.checkString(req.getParameter("preng_condo_area_cd_1"));
String use_frdt = Util.checkString(req.getParameter("use_frdt"));
String use_todt = Util.checkString(req.getParameter("use_todt"));
String use_dds = Util.checkString(req.getParameter("use_dds"));
String guest_room_cnt = Util.checkString(req.getParameter("guest_room_cnt"));
String cmpy_sply_use_yn = Util.checkString(req.getParameter("cmpy_sply_use_yn"));
String preng_no = Util.checkString(req.getParameter("preng_no"));
String use_pay_amt = Util.checkString(req.getParameter("use_pay_amt"));
String slf_burd_amt = Util.checkString(req.getParameter("slf_burd_amt"));
String cmpy_sply_amt = Util.checkString(req.getParameter("cmpy_sply_amt"));
String slf_drbk_amt = Util.checkString(req.getParameter("slf_drbk_amt"));
String guest_room_fee_tot_amt = Util.checkString(req.getParameter("guest_room_fee_tot_amt"));
String remk = Util.checkString(req.getParameter("remk"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String preng_condo_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_nm_1")));
String preng_condo_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_cd_1")));
String preng_condo_area_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_1")));
String use_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_frdt")));
String use_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_todt")));
String use_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dds")));
String guest_room_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("guest_room_cnt")));
String cmpy_sply_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_use_yn")));
String preng_no = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_no")));
String use_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pay_amt")));
String slf_burd_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("slf_burd_amt")));
String cmpy_sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_amt")));
String slf_drbk_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("slf_drbk_amt")));
String guest_room_fee_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("guest_room_fee_tot_amt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPreng_condo_nm_1(preng_condo_nm_1);
dm.setPreng_condo_cd_1(preng_condo_cd_1);
dm.setPreng_condo_area_cd_1(preng_condo_area_cd_1);
dm.setUse_frdt(use_frdt);
dm.setUse_todt(use_todt);
dm.setUse_dds(use_dds);
dm.setGuest_room_cnt(guest_room_cnt);
dm.setCmpy_sply_use_yn(cmpy_sply_use_yn);
dm.setPreng_no(preng_no);
dm.setUse_pay_amt(use_pay_amt);
dm.setSlf_burd_amt(slf_burd_amt);
dm.setCmpy_sply_amt(cmpy_sply_amt);
dm.setSlf_drbk_amt(slf_drbk_amt);
dm.setGuest_room_fee_tot_amt(guest_room_fee_tot_amt);
dm.setRemk(remk);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 09 14:16:56 KST 2009 */