/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1080_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String bo_cd;
	public String bo_seq;
	public String mode_ar;
	public String gurt_pers_flnm_ar;
	public String prn_ar;
	public String zip_ar;
	public String addr_ar;
	public String dtls_addr_ar;
	public String tel_no_1_ar;
	public String tel_no_2_ar;
	public String tel_no_3_ar;
	public String ptph_no_1_ar;
	public String ptph_no_2_ar;
	public String ptph_no_3_ar;
	public String gurt_dt_ar;
	public String reg_resn_ar;
	public String add_bogurt_amt;
	public String mort_amt;
	public String insr_clsf;
	public String insr_cmpy;
	public String insr_no;
	public String insr_rmk;
	public String insr_amt;
	public String insr_prem;
	public String insr_fr_dt;
	public String insr_to_dt;
	public String insr_seq;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_1080_ADM(){}
	public SE_BOI_1080_ADM(String accflag, String cmpy_cd, String bo_cd, String bo_seq, String mode_ar, String gurt_pers_flnm_ar, String prn_ar, String zip_ar, String addr_ar, String dtls_addr_ar, String tel_no_1_ar, String tel_no_2_ar, String tel_no_3_ar, String ptph_no_1_ar, String ptph_no_2_ar, String ptph_no_3_ar, String gurt_dt_ar, String reg_resn_ar, String add_bogurt_amt, String mort_amt, String insr_clsf, String insr_cmpy, String insr_no, String insr_rmk, String insr_amt, String insr_prem, String insr_fr_dt, String insr_to_dt, String insr_seq, String incmg_pers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.mode_ar = mode_ar;
		this.gurt_pers_flnm_ar = gurt_pers_flnm_ar;
		this.prn_ar = prn_ar;
		this.zip_ar = zip_ar;
		this.addr_ar = addr_ar;
		this.dtls_addr_ar = dtls_addr_ar;
		this.tel_no_1_ar = tel_no_1_ar;
		this.tel_no_2_ar = tel_no_2_ar;
		this.tel_no_3_ar = tel_no_3_ar;
		this.ptph_no_1_ar = ptph_no_1_ar;
		this.ptph_no_2_ar = ptph_no_2_ar;
		this.ptph_no_3_ar = ptph_no_3_ar;
		this.gurt_dt_ar = gurt_dt_ar;
		this.reg_resn_ar = reg_resn_ar;
		this.add_bogurt_amt = add_bogurt_amt;
		this.mort_amt = mort_amt;
		this.insr_clsf = insr_clsf;
		this.insr_cmpy = insr_cmpy;
		this.insr_no = insr_no;
		this.insr_rmk = insr_rmk;
		this.insr_amt = insr_amt;
		this.insr_prem = insr_prem;
		this.insr_fr_dt = insr_fr_dt;
		this.insr_to_dt = insr_to_dt;
		this.insr_seq = insr_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setGurt_pers_flnm_ar(String gurt_pers_flnm_ar){
		this.gurt_pers_flnm_ar = gurt_pers_flnm_ar;
	}

	public void setPrn_ar(String prn_ar){
		this.prn_ar = prn_ar;
	}

	public void setZip_ar(String zip_ar){
		this.zip_ar = zip_ar;
	}

	public void setAddr_ar(String addr_ar){
		this.addr_ar = addr_ar;
	}

	public void setDtls_addr_ar(String dtls_addr_ar){
		this.dtls_addr_ar = dtls_addr_ar;
	}

	public void setTel_no_1_ar(String tel_no_1_ar){
		this.tel_no_1_ar = tel_no_1_ar;
	}

	public void setTel_no_2_ar(String tel_no_2_ar){
		this.tel_no_2_ar = tel_no_2_ar;
	}

	public void setTel_no_3_ar(String tel_no_3_ar){
		this.tel_no_3_ar = tel_no_3_ar;
	}

	public void setPtph_no_1_ar(String ptph_no_1_ar){
		this.ptph_no_1_ar = ptph_no_1_ar;
	}

	public void setPtph_no_2_ar(String ptph_no_2_ar){
		this.ptph_no_2_ar = ptph_no_2_ar;
	}

	public void setPtph_no_3_ar(String ptph_no_3_ar){
		this.ptph_no_3_ar = ptph_no_3_ar;
	}

	public void setGurt_dt_ar(String gurt_dt_ar){
		this.gurt_dt_ar = gurt_dt_ar;
	}

	public void setReg_resn_ar(String reg_resn_ar){
		this.reg_resn_ar = reg_resn_ar;
	}

	public void setAdd_bogurt_amt(String add_bogurt_amt){
		this.add_bogurt_amt = add_bogurt_amt;
	}

	public void setMort_amt(String mort_amt){
		this.mort_amt = mort_amt;
	}

	public void setInsr_clsf(String insr_clsf){
		this.insr_clsf = insr_clsf;
	}

	public void setInsr_cmpy(String insr_cmpy){
		this.insr_cmpy = insr_cmpy;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setInsr_rmk(String insr_rmk){
		this.insr_rmk = insr_rmk;
	}

	public void setInsr_amt(String insr_amt){
		this.insr_amt = insr_amt;
	}

	public void setInsr_prem(String insr_prem){
		this.insr_prem = insr_prem;
	}

	public void setInsr_fr_dt(String insr_fr_dt){
		this.insr_fr_dt = insr_fr_dt;
	}

	public void setInsr_to_dt(String insr_to_dt){
		this.insr_to_dt = insr_to_dt;
	}

	public void setInsr_seq(String insr_seq){
		this.insr_seq = insr_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getGurt_pers_flnm_ar(){
		return this.gurt_pers_flnm_ar;
	}

	public String getPrn_ar(){
		return this.prn_ar;
	}

	public String getZip_ar(){
		return this.zip_ar;
	}

	public String getAddr_ar(){
		return this.addr_ar;
	}

	public String getDtls_addr_ar(){
		return this.dtls_addr_ar;
	}

	public String getTel_no_1_ar(){
		return this.tel_no_1_ar;
	}

	public String getTel_no_2_ar(){
		return this.tel_no_2_ar;
	}

	public String getTel_no_3_ar(){
		return this.tel_no_3_ar;
	}

	public String getPtph_no_1_ar(){
		return this.ptph_no_1_ar;
	}

	public String getPtph_no_2_ar(){
		return this.ptph_no_2_ar;
	}

	public String getPtph_no_3_ar(){
		return this.ptph_no_3_ar;
	}

	public String getGurt_dt_ar(){
		return this.gurt_dt_ar;
	}

	public String getReg_resn_ar(){
		return this.reg_resn_ar;
	}

	public String getAdd_bogurt_amt(){
		return this.add_bogurt_amt;
	}

	public String getMort_amt(){
		return this.mort_amt;
	}

	public String getInsr_clsf(){
		return this.insr_clsf;
	}

	public String getInsr_cmpy(){
		return this.insr_cmpy;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getInsr_rmk(){
		return this.insr_rmk;
	}

	public String getInsr_amt(){
		return this.insr_amt;
	}

	public String getInsr_prem(){
		return this.insr_prem;
	}

	public String getInsr_fr_dt(){
		return this.insr_fr_dt;
	}

	public String getInsr_to_dt(){
		return this.insr_to_dt;
	}

	public String getInsr_seq(){
		return this.insr_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1080_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1080_ADM dm = (SE_BOI_1080_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bo_cd);
		cstmt.setString(6, dm.bo_seq);
		cstmt.setString(7, dm.mode_ar);
		cstmt.setString(8, dm.gurt_pers_flnm_ar);
		cstmt.setString(9, dm.prn_ar);
		cstmt.setString(10, dm.zip_ar);
		cstmt.setString(11, dm.addr_ar);
		cstmt.setString(12, dm.dtls_addr_ar);
		cstmt.setString(13, dm.tel_no_1_ar);
		cstmt.setString(14, dm.tel_no_2_ar);
		cstmt.setString(15, dm.tel_no_3_ar);
		cstmt.setString(16, dm.ptph_no_1_ar);
		cstmt.setString(17, dm.ptph_no_2_ar);
		cstmt.setString(18, dm.ptph_no_3_ar);
		cstmt.setString(19, dm.gurt_dt_ar);
		cstmt.setString(20, dm.reg_resn_ar);
		cstmt.setString(21, dm.add_bogurt_amt);
		cstmt.setString(22, dm.mort_amt);
		cstmt.setString(23, dm.insr_clsf);
		cstmt.setString(24, dm.insr_cmpy);
		cstmt.setString(25, dm.insr_no);
		cstmt.setString(26, dm.insr_rmk);
		cstmt.setString(27, dm.insr_amt);
		cstmt.setString(28, dm.insr_prem);
		cstmt.setString(29, dm.insr_fr_dt);
		cstmt.setString(30, dm.insr_to_dt);
		cstmt.setString(31, dm.insr_seq);
		cstmt.setString(32, dm.incmg_pers);
		cstmt.setString(33, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1080_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("mode_ar = [" + getMode_ar() + "]");
		System.out.println("gurt_pers_flnm_ar = [" + getGurt_pers_flnm_ar() + "]");
		System.out.println("prn_ar = [" + getPrn_ar() + "]");
		System.out.println("zip_ar = [" + getZip_ar() + "]");
		System.out.println("addr_ar = [" + getAddr_ar() + "]");
		System.out.println("dtls_addr_ar = [" + getDtls_addr_ar() + "]");
		System.out.println("tel_no_1_ar = [" + getTel_no_1_ar() + "]");
		System.out.println("tel_no_2_ar = [" + getTel_no_2_ar() + "]");
		System.out.println("tel_no_3_ar = [" + getTel_no_3_ar() + "]");
		System.out.println("ptph_no_1_ar = [" + getPtph_no_1_ar() + "]");
		System.out.println("ptph_no_2_ar = [" + getPtph_no_2_ar() + "]");
		System.out.println("ptph_no_3_ar = [" + getPtph_no_3_ar() + "]");
		System.out.println("gurt_dt_ar = [" + getGurt_dt_ar() + "]");
		System.out.println("reg_resn_ar = [" + getReg_resn_ar() + "]");
		System.out.println("add_bogurt_amt = [" + getAdd_bogurt_amt() + "]");
		System.out.println("mort_amt = [" + getMort_amt() + "]");
		System.out.println("insr_clsf = [" + getInsr_clsf() + "]");
		System.out.println("insr_cmpy = [" + getInsr_cmpy() + "]");
		System.out.println("insr_no = [" + getInsr_no() + "]");
		System.out.println("insr_rmk = [" + getInsr_rmk() + "]");
		System.out.println("insr_amt = [" + getInsr_amt() + "]");
		System.out.println("insr_prem = [" + getInsr_prem() + "]");
		System.out.println("insr_fr_dt = [" + getInsr_fr_dt() + "]");
		System.out.println("insr_to_dt = [" + getInsr_to_dt() + "]");
		System.out.println("insr_seq = [" + getInsr_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String gurt_pers_flnm_ar = req.getParameter("gurt_pers_flnm_ar");
if( gurt_pers_flnm_ar == null){
	System.out.println(this.toString+" : gurt_pers_flnm_ar is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_flnm_ar is "+gurt_pers_flnm_ar );
}
String prn_ar = req.getParameter("prn_ar");
if( prn_ar == null){
	System.out.println(this.toString+" : prn_ar is null" );
}else{
	System.out.println(this.toString+" : prn_ar is "+prn_ar );
}
String zip_ar = req.getParameter("zip_ar");
if( zip_ar == null){
	System.out.println(this.toString+" : zip_ar is null" );
}else{
	System.out.println(this.toString+" : zip_ar is "+zip_ar );
}
String addr_ar = req.getParameter("addr_ar");
if( addr_ar == null){
	System.out.println(this.toString+" : addr_ar is null" );
}else{
	System.out.println(this.toString+" : addr_ar is "+addr_ar );
}
String dtls_addr_ar = req.getParameter("dtls_addr_ar");
if( dtls_addr_ar == null){
	System.out.println(this.toString+" : dtls_addr_ar is null" );
}else{
	System.out.println(this.toString+" : dtls_addr_ar is "+dtls_addr_ar );
}
String tel_no_1_ar = req.getParameter("tel_no_1_ar");
if( tel_no_1_ar == null){
	System.out.println(this.toString+" : tel_no_1_ar is null" );
}else{
	System.out.println(this.toString+" : tel_no_1_ar is "+tel_no_1_ar );
}
String tel_no_2_ar = req.getParameter("tel_no_2_ar");
if( tel_no_2_ar == null){
	System.out.println(this.toString+" : tel_no_2_ar is null" );
}else{
	System.out.println(this.toString+" : tel_no_2_ar is "+tel_no_2_ar );
}
String tel_no_3_ar = req.getParameter("tel_no_3_ar");
if( tel_no_3_ar == null){
	System.out.println(this.toString+" : tel_no_3_ar is null" );
}else{
	System.out.println(this.toString+" : tel_no_3_ar is "+tel_no_3_ar );
}
String ptph_no_1_ar = req.getParameter("ptph_no_1_ar");
if( ptph_no_1_ar == null){
	System.out.println(this.toString+" : ptph_no_1_ar is null" );
}else{
	System.out.println(this.toString+" : ptph_no_1_ar is "+ptph_no_1_ar );
}
String ptph_no_2_ar = req.getParameter("ptph_no_2_ar");
if( ptph_no_2_ar == null){
	System.out.println(this.toString+" : ptph_no_2_ar is null" );
}else{
	System.out.println(this.toString+" : ptph_no_2_ar is "+ptph_no_2_ar );
}
String ptph_no_3_ar = req.getParameter("ptph_no_3_ar");
if( ptph_no_3_ar == null){
	System.out.println(this.toString+" : ptph_no_3_ar is null" );
}else{
	System.out.println(this.toString+" : ptph_no_3_ar is "+ptph_no_3_ar );
}
String gurt_dt_ar = req.getParameter("gurt_dt_ar");
if( gurt_dt_ar == null){
	System.out.println(this.toString+" : gurt_dt_ar is null" );
}else{
	System.out.println(this.toString+" : gurt_dt_ar is "+gurt_dt_ar );
}
String reg_resn_ar = req.getParameter("reg_resn_ar");
if( reg_resn_ar == null){
	System.out.println(this.toString+" : reg_resn_ar is null" );
}else{
	System.out.println(this.toString+" : reg_resn_ar is "+reg_resn_ar );
}
String add_bogurt_amt = req.getParameter("add_bogurt_amt");
if( add_bogurt_amt == null){
	System.out.println(this.toString+" : add_bogurt_amt is null" );
}else{
	System.out.println(this.toString+" : add_bogurt_amt is "+add_bogurt_amt );
}
String mort_amt = req.getParameter("mort_amt");
if( mort_amt == null){
	System.out.println(this.toString+" : mort_amt is null" );
}else{
	System.out.println(this.toString+" : mort_amt is "+mort_amt );
}
String insr_clsf = req.getParameter("insr_clsf");
if( insr_clsf == null){
	System.out.println(this.toString+" : insr_clsf is null" );
}else{
	System.out.println(this.toString+" : insr_clsf is "+insr_clsf );
}
String insr_cmpy = req.getParameter("insr_cmpy");
if( insr_cmpy == null){
	System.out.println(this.toString+" : insr_cmpy is null" );
}else{
	System.out.println(this.toString+" : insr_cmpy is "+insr_cmpy );
}
String insr_no = req.getParameter("insr_no");
if( insr_no == null){
	System.out.println(this.toString+" : insr_no is null" );
}else{
	System.out.println(this.toString+" : insr_no is "+insr_no );
}
String insr_rmk = req.getParameter("insr_rmk");
if( insr_rmk == null){
	System.out.println(this.toString+" : insr_rmk is null" );
}else{
	System.out.println(this.toString+" : insr_rmk is "+insr_rmk );
}
String insr_amt = req.getParameter("insr_amt");
if( insr_amt == null){
	System.out.println(this.toString+" : insr_amt is null" );
}else{
	System.out.println(this.toString+" : insr_amt is "+insr_amt );
}
String insr_prem = req.getParameter("insr_prem");
if( insr_prem == null){
	System.out.println(this.toString+" : insr_prem is null" );
}else{
	System.out.println(this.toString+" : insr_prem is "+insr_prem );
}
String insr_fr_dt = req.getParameter("insr_fr_dt");
if( insr_fr_dt == null){
	System.out.println(this.toString+" : insr_fr_dt is null" );
}else{
	System.out.println(this.toString+" : insr_fr_dt is "+insr_fr_dt );
}
String insr_to_dt = req.getParameter("insr_to_dt");
if( insr_to_dt == null){
	System.out.println(this.toString+" : insr_to_dt is null" );
}else{
	System.out.println(this.toString+" : insr_to_dt is "+insr_to_dt );
}
String insr_seq = req.getParameter("insr_seq");
if( insr_seq == null){
	System.out.println(this.toString+" : insr_seq is null" );
}else{
	System.out.println(this.toString+" : insr_seq is "+insr_seq );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String gurt_pers_flnm_ar = Util.checkString(req.getParameter("gurt_pers_flnm_ar"));
String prn_ar = Util.checkString(req.getParameter("prn_ar"));
String zip_ar = Util.checkString(req.getParameter("zip_ar"));
String addr_ar = Util.checkString(req.getParameter("addr_ar"));
String dtls_addr_ar = Util.checkString(req.getParameter("dtls_addr_ar"));
String tel_no_1_ar = Util.checkString(req.getParameter("tel_no_1_ar"));
String tel_no_2_ar = Util.checkString(req.getParameter("tel_no_2_ar"));
String tel_no_3_ar = Util.checkString(req.getParameter("tel_no_3_ar"));
String ptph_no_1_ar = Util.checkString(req.getParameter("ptph_no_1_ar"));
String ptph_no_2_ar = Util.checkString(req.getParameter("ptph_no_2_ar"));
String ptph_no_3_ar = Util.checkString(req.getParameter("ptph_no_3_ar"));
String gurt_dt_ar = Util.checkString(req.getParameter("gurt_dt_ar"));
String reg_resn_ar = Util.checkString(req.getParameter("reg_resn_ar"));
String add_bogurt_amt = Util.checkString(req.getParameter("add_bogurt_amt"));
String mort_amt = Util.checkString(req.getParameter("mort_amt"));
String insr_clsf = Util.checkString(req.getParameter("insr_clsf"));
String insr_cmpy = Util.checkString(req.getParameter("insr_cmpy"));
String insr_no = Util.checkString(req.getParameter("insr_no"));
String insr_rmk = Util.checkString(req.getParameter("insr_rmk"));
String insr_amt = Util.checkString(req.getParameter("insr_amt"));
String insr_prem = Util.checkString(req.getParameter("insr_prem"));
String insr_fr_dt = Util.checkString(req.getParameter("insr_fr_dt"));
String insr_to_dt = Util.checkString(req.getParameter("insr_to_dt"));
String insr_seq = Util.checkString(req.getParameter("insr_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String gurt_pers_flnm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_flnm_ar")));
String prn_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("prn_ar")));
String zip_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_ar")));
String addr_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("addr_ar")));
String dtls_addr_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr_ar")));
String tel_no_1_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1_ar")));
String tel_no_2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2_ar")));
String tel_no_3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_3_ar")));
String ptph_no_1_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_1_ar")));
String ptph_no_2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_2_ar")));
String ptph_no_3_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_3_ar")));
String gurt_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_dt_ar")));
String reg_resn_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_resn_ar")));
String add_bogurt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("add_bogurt_amt")));
String mort_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mort_amt")));
String insr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_clsf")));
String insr_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_cmpy")));
String insr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_no")));
String insr_rmk = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_rmk")));
String insr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_amt")));
String insr_prem = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_prem")));
String insr_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_fr_dt")));
String insr_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_to_dt")));
String insr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setMode_ar(mode_ar);
dm.setGurt_pers_flnm_ar(gurt_pers_flnm_ar);
dm.setPrn_ar(prn_ar);
dm.setZip_ar(zip_ar);
dm.setAddr_ar(addr_ar);
dm.setDtls_addr_ar(dtls_addr_ar);
dm.setTel_no_1_ar(tel_no_1_ar);
dm.setTel_no_2_ar(tel_no_2_ar);
dm.setTel_no_3_ar(tel_no_3_ar);
dm.setPtph_no_1_ar(ptph_no_1_ar);
dm.setPtph_no_2_ar(ptph_no_2_ar);
dm.setPtph_no_3_ar(ptph_no_3_ar);
dm.setGurt_dt_ar(gurt_dt_ar);
dm.setReg_resn_ar(reg_resn_ar);
dm.setAdd_bogurt_amt(add_bogurt_amt);
dm.setMort_amt(mort_amt);
dm.setInsr_clsf(insr_clsf);
dm.setInsr_cmpy(insr_cmpy);
dm.setInsr_no(insr_no);
dm.setInsr_rmk(insr_rmk);
dm.setInsr_amt(insr_amt);
dm.setInsr_prem(insr_prem);
dm.setInsr_fr_dt(insr_fr_dt);
dm.setInsr_to_dt(insr_to_dt);
dm.setInsr_seq(insr_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 31 14:18:10 KST 2016 */