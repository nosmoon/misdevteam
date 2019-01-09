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


public class HD_AFFR_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String use_frdt;
	public String use_todt;
	public String use_dds;
	public String preng_condo_area_cd_1;
	public String preng_condo_cd_1;
	public String preng_condo_nm_1;
	public String preng_condo_area_cd_2;
	public String preng_condo_cd_2;
	public String preng_condo_nm_2;
	public String cmpy_sply_use_yn;
	public String tel_no;
	public String ptph_no;
	public String email_addr;
	public String remk;
	public String guest_room_cnt;
	public String emp_clsf;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String occr_dt;
	public String aplc_amt;

	public HD_AFFR_1003_ADM(){}
	public HD_AFFR_1003_ADM(String mode, String cmpy_cd, String emp_no, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String use_frdt, String use_todt, String use_dds, String preng_condo_area_cd_1, String preng_condo_cd_1, String preng_condo_nm_1, String preng_condo_area_cd_2, String preng_condo_cd_2, String preng_condo_nm_2, String cmpy_sply_use_yn, String tel_no, String ptph_no, String email_addr, String remk, String guest_room_cnt, String emp_clsf, String incmg_pers, String incmg_pers_ipadd, String occr_dt, String aplc_amt){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.use_frdt = use_frdt;
		this.use_todt = use_todt;
		this.use_dds = use_dds;
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
		this.preng_condo_cd_1 = preng_condo_cd_1;
		this.preng_condo_nm_1 = preng_condo_nm_1;
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
		this.preng_condo_cd_2 = preng_condo_cd_2;
		this.preng_condo_nm_2 = preng_condo_nm_2;
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
		this.tel_no = tel_no;
		this.ptph_no = ptph_no;
		this.email_addr = email_addr;
		this.remk = remk;
		this.guest_room_cnt = guest_room_cnt;
		this.emp_clsf = emp_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.occr_dt = occr_dt;
		this.aplc_amt = aplc_amt;
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

	public void setUse_frdt(String use_frdt){
		this.use_frdt = use_frdt;
	}

	public void setUse_todt(String use_todt){
		this.use_todt = use_todt;
	}

	public void setUse_dds(String use_dds){
		this.use_dds = use_dds;
	}

	public void setPreng_condo_area_cd_1(String preng_condo_area_cd_1){
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
	}

	public void setPreng_condo_cd_1(String preng_condo_cd_1){
		this.preng_condo_cd_1 = preng_condo_cd_1;
	}

	public void setPreng_condo_nm_1(String preng_condo_nm_1){
		this.preng_condo_nm_1 = preng_condo_nm_1;
	}

	public void setPreng_condo_area_cd_2(String preng_condo_area_cd_2){
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
	}

	public void setPreng_condo_cd_2(String preng_condo_cd_2){
		this.preng_condo_cd_2 = preng_condo_cd_2;
	}

	public void setPreng_condo_nm_2(String preng_condo_nm_2){
		this.preng_condo_nm_2 = preng_condo_nm_2;
	}

	public void setCmpy_sply_use_yn(String cmpy_sply_use_yn){
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_addr(String email_addr){
		this.email_addr = email_addr;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setGuest_room_cnt(String guest_room_cnt){
		this.guest_room_cnt = guest_room_cnt;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setAplc_amt(String aplc_amt){
		this.aplc_amt = aplc_amt;
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

	public String getUse_frdt(){
		return this.use_frdt;
	}

	public String getUse_todt(){
		return this.use_todt;
	}

	public String getUse_dds(){
		return this.use_dds;
	}

	public String getPreng_condo_area_cd_1(){
		return this.preng_condo_area_cd_1;
	}

	public String getPreng_condo_cd_1(){
		return this.preng_condo_cd_1;
	}

	public String getPreng_condo_nm_1(){
		return this.preng_condo_nm_1;
	}

	public String getPreng_condo_area_cd_2(){
		return this.preng_condo_area_cd_2;
	}

	public String getPreng_condo_cd_2(){
		return this.preng_condo_cd_2;
	}

	public String getPreng_condo_nm_2(){
		return this.preng_condo_nm_2;
	}

	public String getCmpy_sply_use_yn(){
		return this.cmpy_sply_use_yn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_addr(){
		return this.email_addr;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getGuest_room_cnt(){
		return this.guest_room_cnt;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getAplc_amt(){
		return this.aplc_amt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1003_ADM dm = (HD_AFFR_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.dty_cd);
		cstmt.setString(10, dm.posi_cd);
		cstmt.setString(11, dm.use_frdt);
		cstmt.setString(12, dm.use_todt);
		cstmt.setString(13, dm.use_dds);
		cstmt.setString(14, dm.preng_condo_area_cd_1);
		cstmt.setString(15, dm.preng_condo_cd_1);
		cstmt.setString(16, dm.preng_condo_nm_1);
		cstmt.setString(17, dm.preng_condo_area_cd_2);
		cstmt.setString(18, dm.preng_condo_cd_2);
		cstmt.setString(19, dm.preng_condo_nm_2);
		cstmt.setString(20, dm.cmpy_sply_use_yn);
		cstmt.setString(21, dm.tel_no);
		cstmt.setString(22, dm.ptph_no);
		cstmt.setString(23, dm.email_addr);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.guest_room_cnt);
		cstmt.setString(26, dm.emp_clsf);
		cstmt.setString(27, dm.incmg_pers);
		cstmt.setString(28, dm.incmg_pers_ipadd);
		cstmt.setString(29, dm.occr_dt);
		cstmt.setString(30, dm.aplc_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("use_frdt = [" + getUse_frdt() + "]");
		System.out.println("use_todt = [" + getUse_todt() + "]");
		System.out.println("use_dds = [" + getUse_dds() + "]");
		System.out.println("preng_condo_area_cd_1 = [" + getPreng_condo_area_cd_1() + "]");
		System.out.println("preng_condo_cd_1 = [" + getPreng_condo_cd_1() + "]");
		System.out.println("preng_condo_nm_1 = [" + getPreng_condo_nm_1() + "]");
		System.out.println("preng_condo_area_cd_2 = [" + getPreng_condo_area_cd_2() + "]");
		System.out.println("preng_condo_cd_2 = [" + getPreng_condo_cd_2() + "]");
		System.out.println("preng_condo_nm_2 = [" + getPreng_condo_nm_2() + "]");
		System.out.println("cmpy_sply_use_yn = [" + getCmpy_sply_use_yn() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("ptph_no = [" + getPtph_no() + "]");
		System.out.println("email_addr = [" + getEmail_addr() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("guest_room_cnt = [" + getGuest_room_cnt() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("aplc_amt = [" + getAplc_amt() + "]");
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
String preng_condo_area_cd_1 = req.getParameter("preng_condo_area_cd_1");
if( preng_condo_area_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_1 is "+preng_condo_area_cd_1 );
}
String preng_condo_cd_1 = req.getParameter("preng_condo_cd_1");
if( preng_condo_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_cd_1 is "+preng_condo_cd_1 );
}
String preng_condo_nm_1 = req.getParameter("preng_condo_nm_1");
if( preng_condo_nm_1 == null){
	System.out.println(this.toString+" : preng_condo_nm_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_nm_1 is "+preng_condo_nm_1 );
}
String preng_condo_area_cd_2 = req.getParameter("preng_condo_area_cd_2");
if( preng_condo_area_cd_2 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_2 is "+preng_condo_area_cd_2 );
}
String preng_condo_cd_2 = req.getParameter("preng_condo_cd_2");
if( preng_condo_cd_2 == null){
	System.out.println(this.toString+" : preng_condo_cd_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_cd_2 is "+preng_condo_cd_2 );
}
String preng_condo_nm_2 = req.getParameter("preng_condo_nm_2");
if( preng_condo_nm_2 == null){
	System.out.println(this.toString+" : preng_condo_nm_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_nm_2 is "+preng_condo_nm_2 );
}
String cmpy_sply_use_yn = req.getParameter("cmpy_sply_use_yn");
if( cmpy_sply_use_yn == null){
	System.out.println(this.toString+" : cmpy_sply_use_yn is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_use_yn is "+cmpy_sply_use_yn );
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
String email_addr = req.getParameter("email_addr");
if( email_addr == null){
	System.out.println(this.toString+" : email_addr is null" );
}else{
	System.out.println(this.toString+" : email_addr is "+email_addr );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String guest_room_cnt = req.getParameter("guest_room_cnt");
if( guest_room_cnt == null){
	System.out.println(this.toString+" : guest_room_cnt is null" );
}else{
	System.out.println(this.toString+" : guest_room_cnt is "+guest_room_cnt );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String aplc_amt = req.getParameter("aplc_amt");
if( aplc_amt == null){
	System.out.println(this.toString+" : aplc_amt is null" );
}else{
	System.out.println(this.toString+" : aplc_amt is "+aplc_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String use_frdt = Util.checkString(req.getParameter("use_frdt"));
String use_todt = Util.checkString(req.getParameter("use_todt"));
String use_dds = Util.checkString(req.getParameter("use_dds"));
String preng_condo_area_cd_1 = Util.checkString(req.getParameter("preng_condo_area_cd_1"));
String preng_condo_cd_1 = Util.checkString(req.getParameter("preng_condo_cd_1"));
String preng_condo_nm_1 = Util.checkString(req.getParameter("preng_condo_nm_1"));
String preng_condo_area_cd_2 = Util.checkString(req.getParameter("preng_condo_area_cd_2"));
String preng_condo_cd_2 = Util.checkString(req.getParameter("preng_condo_cd_2"));
String preng_condo_nm_2 = Util.checkString(req.getParameter("preng_condo_nm_2"));
String cmpy_sply_use_yn = Util.checkString(req.getParameter("cmpy_sply_use_yn"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String ptph_no = Util.checkString(req.getParameter("ptph_no"));
String email_addr = Util.checkString(req.getParameter("email_addr"));
String remk = Util.checkString(req.getParameter("remk"));
String guest_room_cnt = Util.checkString(req.getParameter("guest_room_cnt"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String aplc_amt = Util.checkString(req.getParameter("aplc_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String use_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_frdt")));
String use_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_todt")));
String use_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dds")));
String preng_condo_area_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_1")));
String preng_condo_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_cd_1")));
String preng_condo_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_nm_1")));
String preng_condo_area_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_2")));
String preng_condo_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_cd_2")));
String preng_condo_nm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_nm_2")));
String cmpy_sply_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_use_yn")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no")));
String email_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("email_addr")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String guest_room_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("guest_room_cnt")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String aplc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setUse_frdt(use_frdt);
dm.setUse_todt(use_todt);
dm.setUse_dds(use_dds);
dm.setPreng_condo_area_cd_1(preng_condo_area_cd_1);
dm.setPreng_condo_cd_1(preng_condo_cd_1);
dm.setPreng_condo_nm_1(preng_condo_nm_1);
dm.setPreng_condo_area_cd_2(preng_condo_area_cd_2);
dm.setPreng_condo_cd_2(preng_condo_cd_2);
dm.setPreng_condo_nm_2(preng_condo_nm_2);
dm.setCmpy_sply_use_yn(cmpy_sply_use_yn);
dm.setTel_no(tel_no);
dm.setPtph_no(ptph_no);
dm.setEmail_addr(email_addr);
dm.setRemk(remk);
dm.setGuest_room_cnt(guest_room_cnt);
dm.setEmp_clsf(emp_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setOccr_dt(occr_dt);
dm.setAplc_amt(aplc_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 18 14:00:19 KST 2012 */