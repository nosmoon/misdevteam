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


public class HD_SALY_1001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String saly_yy;
	public String saly_no;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon;
	public String lgl_hody_alon;
	public String nissu_dd_alon;
	public String ovt_alon;
	public String erl_prsnt_alon;
	public String extra_alon;
	public String vgl_fee;
	public String etc_duty_alon;
	public String prvmm_mstk_alon;
	public String non_regu_alon_stot;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String etc_alon_saly;
	public String bns_saly;
	public String hody_duty_alon;
	public String congr_fee;
	public String welfare_fee;
	public String adpay_amt;

	public HD_SALY_1001_ADM(){}
	public HD_SALY_1001_ADM(String cmpy_cd, String mode, String saly_yy, String saly_no, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String week_hody_base_alon, String week_hody_cmpn_alon, String lgl_hody_alon, String nissu_dd_alon, String ovt_alon, String erl_prsnt_alon, String extra_alon, String vgl_fee, String etc_duty_alon, String prvmm_mstk_alon, String non_regu_alon_stot, String incmg_pers_ipadd, String incmg_pers, String etc_alon_saly, String bns_saly, String hody_duty_alon, String congr_fee, String welfare_fee, String adpay_amt){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.week_hody_base_alon = week_hody_base_alon;
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
		this.lgl_hody_alon = lgl_hody_alon;
		this.nissu_dd_alon = nissu_dd_alon;
		this.ovt_alon = ovt_alon;
		this.erl_prsnt_alon = erl_prsnt_alon;
		this.extra_alon = extra_alon;
		this.vgl_fee = vgl_fee;
		this.etc_duty_alon = etc_duty_alon;
		this.prvmm_mstk_alon = prvmm_mstk_alon;
		this.non_regu_alon_stot = non_regu_alon_stot;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.etc_alon_saly = etc_alon_saly;
		this.bns_saly = bns_saly;
		this.hody_duty_alon = hody_duty_alon;
		this.congr_fee = congr_fee;
		this.welfare_fee = welfare_fee;
		this.adpay_amt = adpay_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
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

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setWeek_hody_base_alon(String week_hody_base_alon){
		this.week_hody_base_alon = week_hody_base_alon;
	}

	public void setWeek_hody_cmpn_alon(String week_hody_cmpn_alon){
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
	}

	public void setLgl_hody_alon(String lgl_hody_alon){
		this.lgl_hody_alon = lgl_hody_alon;
	}

	public void setNissu_dd_alon(String nissu_dd_alon){
		this.nissu_dd_alon = nissu_dd_alon;
	}

	public void setOvt_alon(String ovt_alon){
		this.ovt_alon = ovt_alon;
	}

	public void setErl_prsnt_alon(String erl_prsnt_alon){
		this.erl_prsnt_alon = erl_prsnt_alon;
	}

	public void setExtra_alon(String extra_alon){
		this.extra_alon = extra_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setEtc_duty_alon(String etc_duty_alon){
		this.etc_duty_alon = etc_duty_alon;
	}

	public void setPrvmm_mstk_alon(String prvmm_mstk_alon){
		this.prvmm_mstk_alon = prvmm_mstk_alon;
	}

	public void setNon_regu_alon_stot(String non_regu_alon_stot){
		this.non_regu_alon_stot = non_regu_alon_stot;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setEtc_alon_saly(String etc_alon_saly){
		this.etc_alon_saly = etc_alon_saly;
	}

	public void setBns_saly(String bns_saly){
		this.bns_saly = bns_saly;
	}

	public void setHody_duty_alon(String hody_duty_alon){
		this.hody_duty_alon = hody_duty_alon;
	}

	public void setCongr_fee(String congr_fee){
		this.congr_fee = congr_fee;
	}

	public void setWelfare_fee(String welfare_fee){
		this.welfare_fee = welfare_fee;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
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

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getWeek_hody_base_alon(){
		return this.week_hody_base_alon;
	}

	public String getWeek_hody_cmpn_alon(){
		return this.week_hody_cmpn_alon;
	}

	public String getLgl_hody_alon(){
		return this.lgl_hody_alon;
	}

	public String getNissu_dd_alon(){
		return this.nissu_dd_alon;
	}

	public String getOvt_alon(){
		return this.ovt_alon;
	}

	public String getErl_prsnt_alon(){
		return this.erl_prsnt_alon;
	}

	public String getExtra_alon(){
		return this.extra_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getEtc_duty_alon(){
		return this.etc_duty_alon;
	}

	public String getPrvmm_mstk_alon(){
		return this.prvmm_mstk_alon;
	}

	public String getNon_regu_alon_stot(){
		return this.non_regu_alon_stot;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getEtc_alon_saly(){
		return this.etc_alon_saly;
	}

	public String getBns_saly(){
		return this.bns_saly;
	}

	public String getHody_duty_alon(){
		return this.hody_duty_alon;
	}

	public String getCongr_fee(){
		return this.congr_fee;
	}

	public String getWelfare_fee(){
		return this.welfare_fee;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1001_ADM dm = (HD_SALY_1001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.saly_yy);
		cstmt.setString(6, dm.saly_no);
		cstmt.setString(7, dm.emp_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.week_hody_base_alon);
		cstmt.setString(13, dm.week_hody_cmpn_alon);
		cstmt.setString(14, dm.lgl_hody_alon);
		cstmt.setString(15, dm.nissu_dd_alon);
		cstmt.setString(16, dm.ovt_alon);
		cstmt.setString(17, dm.erl_prsnt_alon);
		cstmt.setString(18, dm.extra_alon);
		cstmt.setString(19, dm.vgl_fee);
		cstmt.setString(20, dm.etc_duty_alon);
		cstmt.setString(21, dm.prvmm_mstk_alon);
		cstmt.setString(22, dm.non_regu_alon_stot);
		cstmt.setString(23, dm.incmg_pers_ipadd);
		cstmt.setString(24, dm.incmg_pers);
		cstmt.setString(25, dm.etc_alon_saly);
		cstmt.setString(26, dm.bns_saly);
		cstmt.setString(27, dm.hody_duty_alon);
		cstmt.setString(28, dm.congr_fee);
		cstmt.setString(29, dm.welfare_fee);
		cstmt.setString(30, dm.adpay_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_1001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("week_hody_base_alon = [" + getWeek_hody_base_alon() + "]");
		System.out.println("week_hody_cmpn_alon = [" + getWeek_hody_cmpn_alon() + "]");
		System.out.println("lgl_hody_alon = [" + getLgl_hody_alon() + "]");
		System.out.println("nissu_dd_alon = [" + getNissu_dd_alon() + "]");
		System.out.println("ovt_alon = [" + getOvt_alon() + "]");
		System.out.println("erl_prsnt_alon = [" + getErl_prsnt_alon() + "]");
		System.out.println("extra_alon = [" + getExtra_alon() + "]");
		System.out.println("vgl_fee = [" + getVgl_fee() + "]");
		System.out.println("etc_duty_alon = [" + getEtc_duty_alon() + "]");
		System.out.println("prvmm_mstk_alon = [" + getPrvmm_mstk_alon() + "]");
		System.out.println("non_regu_alon_stot = [" + getNon_regu_alon_stot() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("etc_alon_saly = [" + getEtc_alon_saly() + "]");
		System.out.println("bns_saly = [" + getBns_saly() + "]");
		System.out.println("hody_duty_alon = [" + getHody_duty_alon() + "]");
		System.out.println("congr_fee = [" + getCongr_fee() + "]");
		System.out.println("welfare_fee = [" + getWelfare_fee() + "]");
		System.out.println("adpay_amt = [" + getAdpay_amt() + "]");
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
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
String week_hody_base_alon = req.getParameter("week_hody_base_alon");
if( week_hody_base_alon == null){
	System.out.println(this.toString+" : week_hody_base_alon is null" );
}else{
	System.out.println(this.toString+" : week_hody_base_alon is "+week_hody_base_alon );
}
String week_hody_cmpn_alon = req.getParameter("week_hody_cmpn_alon");
if( week_hody_cmpn_alon == null){
	System.out.println(this.toString+" : week_hody_cmpn_alon is null" );
}else{
	System.out.println(this.toString+" : week_hody_cmpn_alon is "+week_hody_cmpn_alon );
}
String lgl_hody_alon = req.getParameter("lgl_hody_alon");
if( lgl_hody_alon == null){
	System.out.println(this.toString+" : lgl_hody_alon is null" );
}else{
	System.out.println(this.toString+" : lgl_hody_alon is "+lgl_hody_alon );
}
String nissu_dd_alon = req.getParameter("nissu_dd_alon");
if( nissu_dd_alon == null){
	System.out.println(this.toString+" : nissu_dd_alon is null" );
}else{
	System.out.println(this.toString+" : nissu_dd_alon is "+nissu_dd_alon );
}
String ovt_alon = req.getParameter("ovt_alon");
if( ovt_alon == null){
	System.out.println(this.toString+" : ovt_alon is null" );
}else{
	System.out.println(this.toString+" : ovt_alon is "+ovt_alon );
}
String erl_prsnt_alon = req.getParameter("erl_prsnt_alon");
if( erl_prsnt_alon == null){
	System.out.println(this.toString+" : erl_prsnt_alon is null" );
}else{
	System.out.println(this.toString+" : erl_prsnt_alon is "+erl_prsnt_alon );
}
String extra_alon = req.getParameter("extra_alon");
if( extra_alon == null){
	System.out.println(this.toString+" : extra_alon is null" );
}else{
	System.out.println(this.toString+" : extra_alon is "+extra_alon );
}
String vgl_fee = req.getParameter("vgl_fee");
if( vgl_fee == null){
	System.out.println(this.toString+" : vgl_fee is null" );
}else{
	System.out.println(this.toString+" : vgl_fee is "+vgl_fee );
}
String etc_duty_alon = req.getParameter("etc_duty_alon");
if( etc_duty_alon == null){
	System.out.println(this.toString+" : etc_duty_alon is null" );
}else{
	System.out.println(this.toString+" : etc_duty_alon is "+etc_duty_alon );
}
String prvmm_mstk_alon = req.getParameter("prvmm_mstk_alon");
if( prvmm_mstk_alon == null){
	System.out.println(this.toString+" : prvmm_mstk_alon is null" );
}else{
	System.out.println(this.toString+" : prvmm_mstk_alon is "+prvmm_mstk_alon );
}
String non_regu_alon_stot = req.getParameter("non_regu_alon_stot");
if( non_regu_alon_stot == null){
	System.out.println(this.toString+" : non_regu_alon_stot is null" );
}else{
	System.out.println(this.toString+" : non_regu_alon_stot is "+non_regu_alon_stot );
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
String etc_alon_saly = req.getParameter("etc_alon_saly");
if( etc_alon_saly == null){
	System.out.println(this.toString+" : etc_alon_saly is null" );
}else{
	System.out.println(this.toString+" : etc_alon_saly is "+etc_alon_saly );
}
String bns_saly = req.getParameter("bns_saly");
if( bns_saly == null){
	System.out.println(this.toString+" : bns_saly is null" );
}else{
	System.out.println(this.toString+" : bns_saly is "+bns_saly );
}
String hody_duty_alon = req.getParameter("hody_duty_alon");
if( hody_duty_alon == null){
	System.out.println(this.toString+" : hody_duty_alon is null" );
}else{
	System.out.println(this.toString+" : hody_duty_alon is "+hody_duty_alon );
}
String congr_fee = req.getParameter("congr_fee");
if( congr_fee == null){
	System.out.println(this.toString+" : congr_fee is null" );
}else{
	System.out.println(this.toString+" : congr_fee is "+congr_fee );
}
String welfare_fee = req.getParameter("welfare_fee");
if( welfare_fee == null){
	System.out.println(this.toString+" : welfare_fee is null" );
}else{
	System.out.println(this.toString+" : welfare_fee is "+welfare_fee );
}
String adpay_amt = req.getParameter("adpay_amt");
if( adpay_amt == null){
	System.out.println(this.toString+" : adpay_amt is null" );
}else{
	System.out.println(this.toString+" : adpay_amt is "+adpay_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String week_hody_base_alon = Util.checkString(req.getParameter("week_hody_base_alon"));
String week_hody_cmpn_alon = Util.checkString(req.getParameter("week_hody_cmpn_alon"));
String lgl_hody_alon = Util.checkString(req.getParameter("lgl_hody_alon"));
String nissu_dd_alon = Util.checkString(req.getParameter("nissu_dd_alon"));
String ovt_alon = Util.checkString(req.getParameter("ovt_alon"));
String erl_prsnt_alon = Util.checkString(req.getParameter("erl_prsnt_alon"));
String extra_alon = Util.checkString(req.getParameter("extra_alon"));
String vgl_fee = Util.checkString(req.getParameter("vgl_fee"));
String etc_duty_alon = Util.checkString(req.getParameter("etc_duty_alon"));
String prvmm_mstk_alon = Util.checkString(req.getParameter("prvmm_mstk_alon"));
String non_regu_alon_stot = Util.checkString(req.getParameter("non_regu_alon_stot"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String etc_alon_saly = Util.checkString(req.getParameter("etc_alon_saly"));
String bns_saly = Util.checkString(req.getParameter("bns_saly"));
String hody_duty_alon = Util.checkString(req.getParameter("hody_duty_alon"));
String congr_fee = Util.checkString(req.getParameter("congr_fee"));
String welfare_fee = Util.checkString(req.getParameter("welfare_fee"));
String adpay_amt = Util.checkString(req.getParameter("adpay_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String week_hody_base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("week_hody_base_alon")));
String week_hody_cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("week_hody_cmpn_alon")));
String lgl_hody_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_hody_alon")));
String nissu_dd_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("nissu_dd_alon")));
String ovt_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("ovt_alon")));
String erl_prsnt_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("erl_prsnt_alon")));
String extra_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("extra_alon")));
String vgl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("vgl_fee")));
String etc_duty_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_duty_alon")));
String prvmm_mstk_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_mstk_alon")));
String non_regu_alon_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("non_regu_alon_stot")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String etc_alon_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_alon_saly")));
String bns_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_saly")));
String hody_duty_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_duty_alon")));
String congr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_fee")));
String welfare_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("welfare_fee")));
String adpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setWeek_hody_base_alon(week_hody_base_alon);
dm.setWeek_hody_cmpn_alon(week_hody_cmpn_alon);
dm.setLgl_hody_alon(lgl_hody_alon);
dm.setNissu_dd_alon(nissu_dd_alon);
dm.setOvt_alon(ovt_alon);
dm.setErl_prsnt_alon(erl_prsnt_alon);
dm.setExtra_alon(extra_alon);
dm.setVgl_fee(vgl_fee);
dm.setEtc_duty_alon(etc_duty_alon);
dm.setPrvmm_mstk_alon(prvmm_mstk_alon);
dm.setNon_regu_alon_stot(non_regu_alon_stot);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setEtc_alon_saly(etc_alon_saly);
dm.setBns_saly(bns_saly);
dm.setHody_duty_alon(hody_duty_alon);
dm.setCongr_fee(congr_fee);
dm.setWelfare_fee(welfare_fee);
dm.setAdpay_amt(adpay_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 18 10:37:24 KST 2014 */