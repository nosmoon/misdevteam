/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
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


public class HD_SALY_3330_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String saly_yy;
	public String saly_no;
	public String saly_pay_dt;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String base_saly;
	public String posi_saly;
	public String vgl_fee;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon;
	public String prvmm_mstk_saly;
	public String prvmm_mstk_alon;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String adjm_deci_incm_tax;
	public String adjm_deci_res_tax;
	public String np_slf_ctrb_amt;
	public String hlth_insr_fee;
	public String emp_insr_fee;
	public String cal_pay_amt;
	public String tot_pay_saly;
	public String saly_dduc_stot;
	public String incmg_pers_ipadd;

	public HD_SALY_3330_ADM(){}
	public HD_SALY_3330_ADM(String mode, String cmpy_cd, String saly_yy, String saly_no, String saly_pay_dt, String emp_no, String flnm, String dept_cd, String base_saly, String posi_saly, String vgl_fee, String week_hody_base_alon, String week_hody_cmpn_alon, String prvmm_mstk_saly, String prvmm_mstk_alon, String deci_incm_tax, String deci_res_tax,  String adjm_deci_incm_tax, String adjm_deci_res_tax, String np_slf_ctrb_amt, String hlth_insr_fee, String emp_insr_fee, String cal_pay_amt, String tot_pay_saly, String saly_dduc_stot, String incmg_pers_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.saly_pay_dt = saly_pay_dt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.base_saly = base_saly;
		this.posi_saly = posi_saly;
		this.vgl_fee = vgl_fee;
		this.week_hody_base_alon = week_hody_base_alon;
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
		this.prvmm_mstk_saly = prvmm_mstk_saly;
		this.prvmm_mstk_alon = prvmm_mstk_alon;
		this.deci_incm_tax = deci_incm_tax;
		this.deci_res_tax = deci_res_tax;
		this.adjm_deci_incm_tax = adjm_deci_incm_tax;
		this.adjm_deci_res_tax = adjm_deci_res_tax;
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
		this.hlth_insr_fee = hlth_insr_fee;
		this.emp_insr_fee = emp_insr_fee;
		this.cal_pay_amt = cal_pay_amt;
		this.tot_pay_saly = tot_pay_saly;
		this.saly_dduc_stot = saly_dduc_stot;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setSaly_pay_dt(String saly_pay_dt){
		this.saly_pay_dt = saly_pay_dt;
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

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosi_saly(String posi_saly){
		this.posi_saly = posi_saly;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setWeek_hody_base_alon(String week_hody_base_alon){
		this.week_hody_base_alon = week_hody_base_alon;
	}

	public void setWeek_hody_cmpn_alon(String week_hody_cmpn_alon){
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
	}

	public void setPrvmm_mstk_saly(String prvmm_mstk_saly){
		this.prvmm_mstk_saly = prvmm_mstk_saly;
	}

	public void setPrvmm_mstk_alon(String prvmm_mstk_alon){
		this.prvmm_mstk_alon = prvmm_mstk_alon;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}
	
	public void setAdjm_deci_incm_tax(String adjm_deci_incm_tax){
		this.adjm_deci_incm_tax = adjm_deci_incm_tax;
	}

	public void setAdjm_deci_res_tax(String adjm_deci_res_tax){
		this.adjm_deci_res_tax = adjm_deci_res_tax;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setTot_pay_saly(String tot_pay_saly){
		this.tot_pay_saly = tot_pay_saly;
	}

	public void setSaly_dduc_stot(String saly_dduc_stot){
		this.saly_dduc_stot = saly_dduc_stot;
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

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getSaly_pay_dt(){
		return this.saly_pay_dt;
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

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosi_saly(){
		return this.posi_saly;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getWeek_hody_base_alon(){
		return this.week_hody_base_alon;
	}

	public String getWeek_hody_cmpn_alon(){
		return this.week_hody_cmpn_alon;
	}

	public String getPrvmm_mstk_saly(){
		return this.prvmm_mstk_saly;
	}

	public String getPrvmm_mstk_alon(){
		return this.prvmm_mstk_alon;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getTot_pay_saly(){
		return this.tot_pay_saly;
	}

	public String getSaly_dduc_stot(){
		return this.saly_dduc_stot;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_3330_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_3330_ADM dm = (HD_SALY_3330_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.saly_yy);
		cstmt.setString(6, dm.saly_no);
		cstmt.setString(7, dm.saly_pay_dt);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.base_saly);
		cstmt.setString(12, dm.posi_saly);
		cstmt.setString(13, dm.vgl_fee);
		cstmt.setString(14, dm.week_hody_base_alon);
		cstmt.setString(15, dm.week_hody_cmpn_alon);
		cstmt.setString(16, dm.prvmm_mstk_saly);
		cstmt.setString(17, dm.prvmm_mstk_alon);
		cstmt.setString(18, dm.deci_incm_tax);
		cstmt.setString(19, dm.deci_res_tax);
		cstmt.setString(20, dm.np_slf_ctrb_amt);
		cstmt.setString(21, dm.hlth_insr_fee);
		cstmt.setString(22, dm.emp_insr_fee);
		cstmt.setString(23, dm.cal_pay_amt);
		cstmt.setString(24, dm.tot_pay_saly);
		cstmt.setString(25, dm.saly_dduc_stot);
		cstmt.setString(26, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_3330_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("saly_pay_dt = [" + getSaly_pay_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("base_saly = [" + getBase_saly() + "]");
		System.out.println("posi_saly = [" + getPosi_saly() + "]");
		System.out.println("vgl_fee = [" + getVgl_fee() + "]");
		System.out.println("week_hody_base_alon = [" + getWeek_hody_base_alon() + "]");
		System.out.println("week_hody_cmpn_alon = [" + getWeek_hody_cmpn_alon() + "]");
		System.out.println("prvmm_mstk_saly = [" + getPrvmm_mstk_saly() + "]");
		System.out.println("prvmm_mstk_alon = [" + getPrvmm_mstk_alon() + "]");
		System.out.println("deci_incm_tax = [" + getDeci_incm_tax() + "]");
		System.out.println("deci_res_tax = [" + getDeci_res_tax() + "]");
		System.out.println("np_slf_ctrb_amt = [" + getNp_slf_ctrb_amt() + "]");
		System.out.println("hlth_insr_fee = [" + getHlth_insr_fee() + "]");
		System.out.println("emp_insr_fee = [" + getEmp_insr_fee() + "]");
		System.out.println("cal_pay_amt = [" + getCal_pay_amt() + "]");
		System.out.println("tot_pay_saly = [" + getTot_pay_saly() + "]");
		System.out.println("saly_dduc_stot = [" + getSaly_dduc_stot() + "]");
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
String saly_pay_dt = req.getParameter("saly_pay_dt");
if( saly_pay_dt == null){
	System.out.println(this.toString+" : saly_pay_dt is null" );
}else{
	System.out.println(this.toString+" : saly_pay_dt is "+saly_pay_dt );
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
String base_saly = req.getParameter("base_saly");
if( base_saly == null){
	System.out.println(this.toString+" : base_saly is null" );
}else{
	System.out.println(this.toString+" : base_saly is "+base_saly );
}
String posi_saly = req.getParameter("posi_saly");
if( posi_saly == null){
	System.out.println(this.toString+" : posi_saly is null" );
}else{
	System.out.println(this.toString+" : posi_saly is "+posi_saly );
}
String vgl_fee = req.getParameter("vgl_fee");
if( vgl_fee == null){
	System.out.println(this.toString+" : vgl_fee is null" );
}else{
	System.out.println(this.toString+" : vgl_fee is "+vgl_fee );
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
String prvmm_mstk_saly = req.getParameter("prvmm_mstk_saly");
if( prvmm_mstk_saly == null){
	System.out.println(this.toString+" : prvmm_mstk_saly is null" );
}else{
	System.out.println(this.toString+" : prvmm_mstk_saly is "+prvmm_mstk_saly );
}
String prvmm_mstk_alon = req.getParameter("prvmm_mstk_alon");
if( prvmm_mstk_alon == null){
	System.out.println(this.toString+" : prvmm_mstk_alon is null" );
}else{
	System.out.println(this.toString+" : prvmm_mstk_alon is "+prvmm_mstk_alon );
}
String deci_incm_tax = req.getParameter("deci_incm_tax");
if( deci_incm_tax == null){
	System.out.println(this.toString+" : deci_incm_tax is null" );
}else{
	System.out.println(this.toString+" : deci_incm_tax is "+deci_incm_tax );
}
String deci_res_tax = req.getParameter("deci_res_tax");
if( deci_res_tax == null){
	System.out.println(this.toString+" : deci_res_tax is null" );
}else{
	System.out.println(this.toString+" : deci_res_tax is "+deci_res_tax );
}
String np_slf_ctrb_amt = req.getParameter("np_slf_ctrb_amt");
if( np_slf_ctrb_amt == null){
	System.out.println(this.toString+" : np_slf_ctrb_amt is null" );
}else{
	System.out.println(this.toString+" : np_slf_ctrb_amt is "+np_slf_ctrb_amt );
}
String hlth_insr_fee = req.getParameter("hlth_insr_fee");
if( hlth_insr_fee == null){
	System.out.println(this.toString+" : hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_fee is "+hlth_insr_fee );
}
String emp_insr_fee = req.getParameter("emp_insr_fee");
if( emp_insr_fee == null){
	System.out.println(this.toString+" : emp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : emp_insr_fee is "+emp_insr_fee );
}
String cal_pay_amt = req.getParameter("cal_pay_amt");
if( cal_pay_amt == null){
	System.out.println(this.toString+" : cal_pay_amt is null" );
}else{
	System.out.println(this.toString+" : cal_pay_amt is "+cal_pay_amt );
}
String tot_pay_saly = req.getParameter("tot_pay_saly");
if( tot_pay_saly == null){
	System.out.println(this.toString+" : tot_pay_saly is null" );
}else{
	System.out.println(this.toString+" : tot_pay_saly is "+tot_pay_saly );
}
String saly_dduc_stot = req.getParameter("saly_dduc_stot");
if( saly_dduc_stot == null){
	System.out.println(this.toString+" : saly_dduc_stot is null" );
}else{
	System.out.println(this.toString+" : saly_dduc_stot is "+saly_dduc_stot );
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
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String base_saly = Util.checkString(req.getParameter("base_saly"));
String posi_saly = Util.checkString(req.getParameter("posi_saly"));
String vgl_fee = Util.checkString(req.getParameter("vgl_fee"));
String week_hody_base_alon = Util.checkString(req.getParameter("week_hody_base_alon"));
String week_hody_cmpn_alon = Util.checkString(req.getParameter("week_hody_cmpn_alon"));
String prvmm_mstk_saly = Util.checkString(req.getParameter("prvmm_mstk_saly"));
String prvmm_mstk_alon = Util.checkString(req.getParameter("prvmm_mstk_alon"));
String deci_incm_tax = Util.checkString(req.getParameter("deci_incm_tax"));
String deci_res_tax = Util.checkString(req.getParameter("deci_res_tax"));
String np_slf_ctrb_amt = Util.checkString(req.getParameter("np_slf_ctrb_amt"));
String hlth_insr_fee = Util.checkString(req.getParameter("hlth_insr_fee"));
String emp_insr_fee = Util.checkString(req.getParameter("emp_insr_fee"));
String cal_pay_amt = Util.checkString(req.getParameter("cal_pay_amt"));
String tot_pay_saly = Util.checkString(req.getParameter("tot_pay_saly"));
String saly_dduc_stot = Util.checkString(req.getParameter("saly_dduc_stot"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String saly_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_pay_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String base_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("base_saly")));
String posi_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_saly")));
String vgl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("vgl_fee")));
String week_hody_base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("week_hody_base_alon")));
String week_hody_cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("week_hody_cmpn_alon")));
String prvmm_mstk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_mstk_saly")));
String prvmm_mstk_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_mstk_alon")));
String deci_incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_incm_tax")));
String deci_res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_res_tax")));
String np_slf_ctrb_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_slf_ctrb_amt")));
String hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_fee")));
String emp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_fee")));
String cal_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cal_pay_amt")));
String tot_pay_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_pay_saly")));
String saly_dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_dduc_stot")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setSaly_pay_dt(saly_pay_dt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setBase_saly(base_saly);
dm.setPosi_saly(posi_saly);
dm.setVgl_fee(vgl_fee);
dm.setWeek_hody_base_alon(week_hody_base_alon);
dm.setWeek_hody_cmpn_alon(week_hody_cmpn_alon);
dm.setPrvmm_mstk_saly(prvmm_mstk_saly);
dm.setPrvmm_mstk_alon(prvmm_mstk_alon);
dm.setDeci_incm_tax(deci_incm_tax);
dm.setDeci_res_tax(deci_res_tax);
dm.setNp_slf_ctrb_amt(np_slf_ctrb_amt);
dm.setHlth_insr_fee(hlth_insr_fee);
dm.setEmp_insr_fee(emp_insr_fee);
dm.setCal_pay_amt(cal_pay_amt);
dm.setTot_pay_saly(tot_pay_saly);
dm.setSaly_dduc_stot(saly_dduc_stot);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 15 21:16:39 KST 2011 */