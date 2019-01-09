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


package chosun.ciis.hd.appmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.ds.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1103_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String save;
	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String addm_dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String appmt_cd;
	public String appmt_resn_cd;
	public String appmt_dt;
	public String appmt_cont;
	public String mtry_dt;
	public String emp_clsf_cd;
	public String emp_dtls_clsf;
	public String base_saly;
	public String posk_saly;
	public String dty_alon;
	public String posk_alon;
	public String care_alon;
	public String food_alon;
	public String tax_jrnst;
	public String auto_driv_alon;
	public String evngt_saly;
	public String saly_stot;
	public String seq;
	public String occr_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_APPMT_1103_UDM(){}
	public HD_APPMT_1103_UDM(String save, String mode, String cmpy_cd, String emp_no, String flnm, String dept_cd, String addm_dept_cd, String dty_cd, String posi_cd, String appmt_cd, String appmt_resn_cd, String appmt_dt, String appmt_cont, String mtry_dt, String emp_clsf_cd, String emp_dtls_clsf, String base_saly, String posk_saly, String dty_alon, String posk_alon, String care_alon, String food_alon, String tax_jrnst, String auto_driv_alon, String evngt_saly, String saly_stot, String seq, String occr_dt, String incmg_pers, String incmg_pers_ipadd){
		this.save = save;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.addm_dept_cd = addm_dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.appmt_cd = appmt_cd;
		this.appmt_resn_cd = appmt_resn_cd;
		this.appmt_dt = appmt_dt;
		this.appmt_cont = appmt_cont;
		this.mtry_dt = mtry_dt;
		this.emp_clsf_cd = emp_clsf_cd;
		this.emp_dtls_clsf = emp_dtls_clsf;
		this.base_saly = base_saly;
		this.posk_saly = posk_saly;
		this.dty_alon = dty_alon;
		this.posk_alon = posk_alon;
		this.care_alon = care_alon;
		this.food_alon = food_alon;
		this.tax_jrnst = tax_jrnst;
		this.auto_driv_alon = auto_driv_alon;
		this.evngt_saly = evngt_saly;
		this.saly_stot = saly_stot;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSave(String save){
		this.save = save;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAddm_dept_cd(String addm_dept_cd){
		this.addm_dept_cd = addm_dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setAppmt_resn_cd(String appmt_resn_cd){
		this.appmt_resn_cd = appmt_resn_cd;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}

	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}

	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}

	public void setFood_alon(String food_alon){
		this.food_alon = food_alon;
	}

	public void setTax_jrnst(String tax_jrnst){
		this.tax_jrnst = tax_jrnst;
	}

	public void setAuto_driv_alon(String auto_driv_alon){
		this.auto_driv_alon = auto_driv_alon;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public void setSaly_stot(String saly_stot){
		this.saly_stot = saly_stot;
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

	public String getSave(){
		return this.save;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAddm_dept_cd(){
		return this.addm_dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getAppmt_resn_cd(){
		return this.appmt_resn_cd;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getDty_alon(){
		return this.dty_alon;
	}

	public String getPosk_alon(){
		return this.posk_alon;
	}

	public String getCare_alon(){
		return this.care_alon;
	}

	public String getFood_alon(){
		return this.food_alon;
	}

	public String getTax_jrnst(){
		return this.tax_jrnst;
	}

	public String getAuto_driv_alon(){
		return this.auto_driv_alon;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getSaly_stot(){
		return this.saly_stot;
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
		 return "{ call MISHDL.SP_HD_APPMT_1103_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_APPMT_1103_UDM dm = (HD_APPMT_1103_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.save);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.addm_dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.appmt_cd);
		cstmt.setString(13, dm.appmt_resn_cd);
		cstmt.setString(14, dm.appmt_dt);
		cstmt.setString(15, dm.appmt_cont);
		cstmt.setString(16, dm.mtry_dt);
		cstmt.setString(17, dm.emp_clsf_cd);
		cstmt.setString(18, dm.emp_dtls_clsf);
		cstmt.setString(19, dm.base_saly);
		cstmt.setString(20, dm.posk_saly);
		cstmt.setString(21, dm.dty_alon);
		cstmt.setString(22, dm.posk_alon);
		cstmt.setString(23, dm.care_alon);
		cstmt.setString(24, dm.food_alon);
		cstmt.setString(25, dm.tax_jrnst);
		cstmt.setString(26, dm.auto_driv_alon);
		cstmt.setString(27, dm.evngt_saly);
		cstmt.setString(28, dm.saly_stot);
		cstmt.setString(29, dm.seq);
		cstmt.setString(30, dm.occr_dt);
		cstmt.setString(31, dm.incmg_pers);
		cstmt.setString(32, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.appmt.ds.HD_APPMT_1103_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("save = [" + getSave() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("addm_dept_cd = [" + getAddm_dept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("appmt_cd = [" + getAppmt_cd() + "]");
		System.out.println("appmt_resn_cd = [" + getAppmt_resn_cd() + "]");
		System.out.println("appmt_dt = [" + getAppmt_dt() + "]");
		System.out.println("appmt_cont = [" + getAppmt_cont() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("emp_clsf_cd = [" + getEmp_clsf_cd() + "]");
		System.out.println("emp_dtls_clsf = [" + getEmp_dtls_clsf() + "]");
		System.out.println("base_saly = [" + getBase_saly() + "]");
		System.out.println("posk_saly = [" + getPosk_saly() + "]");
		System.out.println("dty_alon = [" + getDty_alon() + "]");
		System.out.println("posk_alon = [" + getPosk_alon() + "]");
		System.out.println("care_alon = [" + getCare_alon() + "]");
		System.out.println("food_alon = [" + getFood_alon() + "]");
		System.out.println("tax_jrnst = [" + getTax_jrnst() + "]");
		System.out.println("auto_driv_alon = [" + getAuto_driv_alon() + "]");
		System.out.println("evngt_saly = [" + getEvngt_saly() + "]");
		System.out.println("saly_stot = [" + getSaly_stot() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String save = req.getParameter("save");
if( save == null){
	System.out.println(this.toString+" : save is null" );
}else{
	System.out.println(this.toString+" : save is "+save );
}
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
String addm_dept_cd = req.getParameter("addm_dept_cd");
if( addm_dept_cd == null){
	System.out.println(this.toString+" : addm_dept_cd is null" );
}else{
	System.out.println(this.toString+" : addm_dept_cd is "+addm_dept_cd );
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
String appmt_cd = req.getParameter("appmt_cd");
if( appmt_cd == null){
	System.out.println(this.toString+" : appmt_cd is null" );
}else{
	System.out.println(this.toString+" : appmt_cd is "+appmt_cd );
}
String appmt_resn_cd = req.getParameter("appmt_resn_cd");
if( appmt_resn_cd == null){
	System.out.println(this.toString+" : appmt_resn_cd is null" );
}else{
	System.out.println(this.toString+" : appmt_resn_cd is "+appmt_resn_cd );
}
String appmt_dt = req.getParameter("appmt_dt");
if( appmt_dt == null){
	System.out.println(this.toString+" : appmt_dt is null" );
}else{
	System.out.println(this.toString+" : appmt_dt is "+appmt_dt );
}
String appmt_cont = req.getParameter("appmt_cont");
if( appmt_cont == null){
	System.out.println(this.toString+" : appmt_cont is null" );
}else{
	System.out.println(this.toString+" : appmt_cont is "+appmt_cont );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String emp_clsf_cd = req.getParameter("emp_clsf_cd");
if( emp_clsf_cd == null){
	System.out.println(this.toString+" : emp_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : emp_clsf_cd is "+emp_clsf_cd );
}
String emp_dtls_clsf = req.getParameter("emp_dtls_clsf");
if( emp_dtls_clsf == null){
	System.out.println(this.toString+" : emp_dtls_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_dtls_clsf is "+emp_dtls_clsf );
}
String base_saly = req.getParameter("base_saly");
if( base_saly == null){
	System.out.println(this.toString+" : base_saly is null" );
}else{
	System.out.println(this.toString+" : base_saly is "+base_saly );
}
String posk_saly = req.getParameter("posk_saly");
if( posk_saly == null){
	System.out.println(this.toString+" : posk_saly is null" );
}else{
	System.out.println(this.toString+" : posk_saly is "+posk_saly );
}
String dty_alon = req.getParameter("dty_alon");
if( dty_alon == null){
	System.out.println(this.toString+" : dty_alon is null" );
}else{
	System.out.println(this.toString+" : dty_alon is "+dty_alon );
}
String posk_alon = req.getParameter("posk_alon");
if( posk_alon == null){
	System.out.println(this.toString+" : posk_alon is null" );
}else{
	System.out.println(this.toString+" : posk_alon is "+posk_alon );
}
String care_alon = req.getParameter("care_alon");
if( care_alon == null){
	System.out.println(this.toString+" : care_alon is null" );
}else{
	System.out.println(this.toString+" : care_alon is "+care_alon );
}
String food_alon = req.getParameter("food_alon");
if( food_alon == null){
	System.out.println(this.toString+" : food_alon is null" );
}else{
	System.out.println(this.toString+" : food_alon is "+food_alon );
}
String tax_jrnst = req.getParameter("tax_jrnst");
if( tax_jrnst == null){
	System.out.println(this.toString+" : tax_jrnst is null" );
}else{
	System.out.println(this.toString+" : tax_jrnst is "+tax_jrnst );
}
String auto_driv_alon = req.getParameter("auto_driv_alon");
if( auto_driv_alon == null){
	System.out.println(this.toString+" : auto_driv_alon is null" );
}else{
	System.out.println(this.toString+" : auto_driv_alon is "+auto_driv_alon );
}
String evngt_saly = req.getParameter("evngt_saly");
if( evngt_saly == null){
	System.out.println(this.toString+" : evngt_saly is null" );
}else{
	System.out.println(this.toString+" : evngt_saly is "+evngt_saly );
}
String saly_stot = req.getParameter("saly_stot");
if( saly_stot == null){
	System.out.println(this.toString+" : saly_stot is null" );
}else{
	System.out.println(this.toString+" : saly_stot is "+saly_stot );
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

String save = Util.checkString(req.getParameter("save"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String addm_dept_cd = Util.checkString(req.getParameter("addm_dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
String appmt_resn_cd = Util.checkString(req.getParameter("appmt_resn_cd"));
String appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
String appmt_cont = Util.checkString(req.getParameter("appmt_cont"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
String emp_dtls_clsf = Util.checkString(req.getParameter("emp_dtls_clsf"));
String base_saly = Util.checkString(req.getParameter("base_saly"));
String posk_saly = Util.checkString(req.getParameter("posk_saly"));
String dty_alon = Util.checkString(req.getParameter("dty_alon"));
String posk_alon = Util.checkString(req.getParameter("posk_alon"));
String care_alon = Util.checkString(req.getParameter("care_alon"));
String food_alon = Util.checkString(req.getParameter("food_alon"));
String tax_jrnst = Util.checkString(req.getParameter("tax_jrnst"));
String auto_driv_alon = Util.checkString(req.getParameter("auto_driv_alon"));
String evngt_saly = Util.checkString(req.getParameter("evngt_saly"));
String saly_stot = Util.checkString(req.getParameter("saly_stot"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String save = Util.Uni2Ksc(Util.checkString(req.getParameter("save")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String addm_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String appmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_cd")));
String appmt_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_resn_cd")));
String appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt")));
String appmt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_cont")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String emp_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf_cd")));
String emp_dtls_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_dtls_clsf")));
String base_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("base_saly")));
String posk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_saly")));
String dty_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_alon")));
String posk_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_alon")));
String care_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("care_alon")));
String food_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("food_alon")));
String tax_jrnst = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_jrnst")));
String auto_driv_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_driv_alon")));
String evngt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("evngt_saly")));
String saly_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_stot")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSave(save);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setAddm_dept_cd(addm_dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setAppmt_cd(appmt_cd);
dm.setAppmt_resn_cd(appmt_resn_cd);
dm.setAppmt_dt(appmt_dt);
dm.setAppmt_cont(appmt_cont);
dm.setMtry_dt(mtry_dt);
dm.setEmp_clsf_cd(emp_clsf_cd);
dm.setEmp_dtls_clsf(emp_dtls_clsf);
dm.setBase_saly(base_saly);
dm.setPosk_saly(posk_saly);
dm.setDty_alon(dty_alon);
dm.setPosk_alon(posk_alon);
dm.setCare_alon(care_alon);
dm.setFood_alon(food_alon);
dm.setTax_jrnst(tax_jrnst);
dm.setAuto_driv_alon(auto_driv_alon);
dm.setEvngt_saly(evngt_saly);
dm.setSaly_stot(saly_stot);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 17 14:38:12 KST 2014 */