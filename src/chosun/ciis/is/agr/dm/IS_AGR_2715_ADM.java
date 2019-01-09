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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2715_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String make_ask_reg_dt;
	public String make_ask_reg_seq;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String dlco_chrg_pers_nm;
	public String dlco_chrg_pers_cntc_plac;
	public String dlco_chrg_pers_email;
	public String dlvs_dt;
	public String work_clsf;
	public String dlvs_plac_addr;
	public String clr_cd;
	public String prt_paper_cd;
	public String incmp_design_yn;
	public String advcs_make_yn;
	public String pcnt_clsf;
	public String yy;
	public String prt_plan_dt;
	public String prz_rate_clsf;
	public String prz_amt;
	public String prz_phb_saly_boks;
	public String remk;
	public String proc_stat;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_AGR_2715_ADM(){}
	public IS_AGR_2715_ADM(String flag, String cmpy_cd, String make_ask_reg_dt, String make_ask_reg_seq, String acwr_reg_dt, String acwr_reg_seq, String dlco_chrg_pers_nm, String dlco_chrg_pers_cntc_plac, String dlco_chrg_pers_email, String dlvs_dt, String work_clsf, String dlvs_plac_addr, String clr_cd, String prt_paper_cd, String incmp_design_yn, String advcs_make_yn, String pcnt_clsf, String yy, String prt_plan_dt, String prz_rate_clsf, String prz_amt, String prz_phb_saly_boks, String remk, String proc_stat, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.make_ask_reg_dt = make_ask_reg_dt;
		this.make_ask_reg_seq = make_ask_reg_seq;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
		this.dlco_chrg_pers_email = dlco_chrg_pers_email;
		this.dlvs_dt = dlvs_dt;
		this.work_clsf = work_clsf;
		this.dlvs_plac_addr = dlvs_plac_addr;
		this.clr_cd = clr_cd;
		this.prt_paper_cd = prt_paper_cd;
		this.incmp_design_yn = incmp_design_yn;
		this.advcs_make_yn = advcs_make_yn;
		this.pcnt_clsf = pcnt_clsf;
		this.yy = yy;
		this.prt_plan_dt = prt_plan_dt;
		this.prz_rate_clsf = prz_rate_clsf;
		this.prz_amt = prz_amt;
		this.prz_phb_saly_boks = prz_phb_saly_boks;
		this.remk = remk;
		this.proc_stat = proc_stat;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMake_ask_reg_dt(String make_ask_reg_dt){
		this.make_ask_reg_dt = make_ask_reg_dt;
	}

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setDlco_chrg_pers_nm(String dlco_chrg_pers_nm){
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
	}

	public void setDlco_chrg_pers_cntc_plac(String dlco_chrg_pers_cntc_plac){
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
	}

	public void setDlco_chrg_pers_email(String dlco_chrg_pers_email){
		this.dlco_chrg_pers_email = dlco_chrg_pers_email;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setDlvs_plac_addr(String dlvs_plac_addr){
		this.dlvs_plac_addr = dlvs_plac_addr;
	}

	public void setClr_cd(String clr_cd){
		this.clr_cd = clr_cd;
	}

	public void setPrt_paper_cd(String prt_paper_cd){
		this.prt_paper_cd = prt_paper_cd;
	}

	public void setIncmp_design_yn(String incmp_design_yn){
		this.incmp_design_yn = incmp_design_yn;
	}

	public void setAdvcs_make_yn(String advcs_make_yn){
		this.advcs_make_yn = advcs_make_yn;
	}

	public void setPcnt_clsf(String pcnt_clsf){
		this.pcnt_clsf = pcnt_clsf;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setPrt_plan_dt(String prt_plan_dt){
		this.prt_plan_dt = prt_plan_dt;
	}

	public void setPrz_rate_clsf(String prz_rate_clsf){
		this.prz_rate_clsf = prz_rate_clsf;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setPrz_phb_saly_boks(String prz_phb_saly_boks){
		this.prz_phb_saly_boks = prz_phb_saly_boks;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMake_ask_reg_dt(){
		return this.make_ask_reg_dt;
	}

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getDlco_chrg_pers_nm(){
		return this.dlco_chrg_pers_nm;
	}

	public String getDlco_chrg_pers_cntc_plac(){
		return this.dlco_chrg_pers_cntc_plac;
	}

	public String getDlco_chrg_pers_email(){
		return this.dlco_chrg_pers_email;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getDlvs_plac_addr(){
		return this.dlvs_plac_addr;
	}

	public String getClr_cd(){
		return this.clr_cd;
	}

	public String getPrt_paper_cd(){
		return this.prt_paper_cd;
	}

	public String getIncmp_design_yn(){
		return this.incmp_design_yn;
	}

	public String getAdvcs_make_yn(){
		return this.advcs_make_yn;
	}

	public String getPcnt_clsf(){
		return this.pcnt_clsf;
	}

	public String getYy(){
		return this.yy;
	}

	public String getPrt_plan_dt(){
		return this.prt_plan_dt;
	}

	public String getPrz_rate_clsf(){
		return this.prz_rate_clsf;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getPrz_phb_saly_boks(){
		return this.prz_phb_saly_boks;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_2715_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_2715_ADM dm = (IS_AGR_2715_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.make_ask_reg_dt);
		cstmt.setString(6, dm.make_ask_reg_seq);
		cstmt.setString(7, dm.acwr_reg_dt);
		cstmt.setString(8, dm.acwr_reg_seq);
		cstmt.setString(9, dm.dlco_chrg_pers_nm);
		cstmt.setString(10, dm.dlco_chrg_pers_cntc_plac);
		cstmt.setString(11, dm.dlco_chrg_pers_email);
		cstmt.setString(12, dm.dlvs_dt);
		cstmt.setString(13, dm.work_clsf);
		cstmt.setString(14, dm.dlvs_plac_addr);
		cstmt.setString(15, dm.clr_cd);
		cstmt.setString(16, dm.prt_paper_cd);
		cstmt.setString(17, dm.incmp_design_yn);
		cstmt.setString(18, dm.advcs_make_yn);
		cstmt.setString(19, dm.pcnt_clsf);
		cstmt.setString(20, dm.yy);
		cstmt.setString(21, dm.prt_plan_dt);
		cstmt.setString(22, dm.prz_rate_clsf);
		cstmt.setString(23, dm.prz_amt);
		cstmt.setString(24, dm.prz_phb_saly_boks);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.proc_stat);
		cstmt.setString(27, dm.incmg_pers_ip);
		cstmt.setString(28, dm.incmg_pers);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_2715_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("make_ask_reg_dt = [" + getMake_ask_reg_dt() + "]");
		System.out.println("make_ask_reg_seq = [" + getMake_ask_reg_seq() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("dlco_chrg_pers_nm = [" + getDlco_chrg_pers_nm() + "]");
		System.out.println("dlco_chrg_pers_cntc_plac = [" + getDlco_chrg_pers_cntc_plac() + "]");
		System.out.println("dlco_chrg_pers_email = [" + getDlco_chrg_pers_email() + "]");
		System.out.println("dlvs_dt = [" + getDlvs_dt() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("dlvs_plac_addr = [" + getDlvs_plac_addr() + "]");
		System.out.println("clr_cd = [" + getClr_cd() + "]");
		System.out.println("prt_paper_cd = [" + getPrt_paper_cd() + "]");
		System.out.println("incmp_design_yn = [" + getIncmp_design_yn() + "]");
		System.out.println("advcs_make_yn = [" + getAdvcs_make_yn() + "]");
		System.out.println("pcnt_clsf = [" + getPcnt_clsf() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("prt_plan_dt = [" + getPrt_plan_dt() + "]");
		System.out.println("prz_rate_clsf = [" + getPrz_rate_clsf() + "]");
		System.out.println("prz_amt = [" + getPrz_amt() + "]");
		System.out.println("prz_phb_saly_boks = [" + getPrz_phb_saly_boks() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String make_ask_reg_dt = req.getParameter("make_ask_reg_dt");
if( make_ask_reg_dt == null){
	System.out.println(this.toString+" : make_ask_reg_dt is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_dt is "+make_ask_reg_dt );
}
String make_ask_reg_seq = req.getParameter("make_ask_reg_seq");
if( make_ask_reg_seq == null){
	System.out.println(this.toString+" : make_ask_reg_seq is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_seq is "+make_ask_reg_seq );
}
String acwr_reg_dt = req.getParameter("acwr_reg_dt");
if( acwr_reg_dt == null){
	System.out.println(this.toString+" : acwr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_dt is "+acwr_reg_dt );
}
String acwr_reg_seq = req.getParameter("acwr_reg_seq");
if( acwr_reg_seq == null){
	System.out.println(this.toString+" : acwr_reg_seq is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_seq is "+acwr_reg_seq );
}
String dlco_chrg_pers_nm = req.getParameter("dlco_chrg_pers_nm");
if( dlco_chrg_pers_nm == null){
	System.out.println(this.toString+" : dlco_chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_chrg_pers_nm is "+dlco_chrg_pers_nm );
}
String dlco_chrg_pers_cntc_plac = req.getParameter("dlco_chrg_pers_cntc_plac");
if( dlco_chrg_pers_cntc_plac == null){
	System.out.println(this.toString+" : dlco_chrg_pers_cntc_plac is null" );
}else{
	System.out.println(this.toString+" : dlco_chrg_pers_cntc_plac is "+dlco_chrg_pers_cntc_plac );
}
String dlco_chrg_pers_email = req.getParameter("dlco_chrg_pers_email");
if( dlco_chrg_pers_email == null){
	System.out.println(this.toString+" : dlco_chrg_pers_email is null" );
}else{
	System.out.println(this.toString+" : dlco_chrg_pers_email is "+dlco_chrg_pers_email );
}
String dlvs_dt = req.getParameter("dlvs_dt");
if( dlvs_dt == null){
	System.out.println(this.toString+" : dlvs_dt is null" );
}else{
	System.out.println(this.toString+" : dlvs_dt is "+dlvs_dt );
}
String work_clsf = req.getParameter("work_clsf");
if( work_clsf == null){
	System.out.println(this.toString+" : work_clsf is null" );
}else{
	System.out.println(this.toString+" : work_clsf is "+work_clsf );
}
String dlvs_plac_addr = req.getParameter("dlvs_plac_addr");
if( dlvs_plac_addr == null){
	System.out.println(this.toString+" : dlvs_plac_addr is null" );
}else{
	System.out.println(this.toString+" : dlvs_plac_addr is "+dlvs_plac_addr );
}
String clr_cd = req.getParameter("clr_cd");
if( clr_cd == null){
	System.out.println(this.toString+" : clr_cd is null" );
}else{
	System.out.println(this.toString+" : clr_cd is "+clr_cd );
}
String prt_paper_cd = req.getParameter("prt_paper_cd");
if( prt_paper_cd == null){
	System.out.println(this.toString+" : prt_paper_cd is null" );
}else{
	System.out.println(this.toString+" : prt_paper_cd is "+prt_paper_cd );
}
String incmp_design_yn = req.getParameter("incmp_design_yn");
if( incmp_design_yn == null){
	System.out.println(this.toString+" : incmp_design_yn is null" );
}else{
	System.out.println(this.toString+" : incmp_design_yn is "+incmp_design_yn );
}
String advcs_make_yn = req.getParameter("advcs_make_yn");
if( advcs_make_yn == null){
	System.out.println(this.toString+" : advcs_make_yn is null" );
}else{
	System.out.println(this.toString+" : advcs_make_yn is "+advcs_make_yn );
}
String pcnt_clsf = req.getParameter("pcnt_clsf");
if( pcnt_clsf == null){
	System.out.println(this.toString+" : pcnt_clsf is null" );
}else{
	System.out.println(this.toString+" : pcnt_clsf is "+pcnt_clsf );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String prt_plan_dt = req.getParameter("prt_plan_dt");
if( prt_plan_dt == null){
	System.out.println(this.toString+" : prt_plan_dt is null" );
}else{
	System.out.println(this.toString+" : prt_plan_dt is "+prt_plan_dt );
}
String prz_rate_clsf = req.getParameter("prz_rate_clsf");
if( prz_rate_clsf == null){
	System.out.println(this.toString+" : prz_rate_clsf is null" );
}else{
	System.out.println(this.toString+" : prz_rate_clsf is "+prz_rate_clsf );
}
String prz_amt = req.getParameter("prz_amt");
if( prz_amt == null){
	System.out.println(this.toString+" : prz_amt is null" );
}else{
	System.out.println(this.toString+" : prz_amt is "+prz_amt );
}
String prz_phb_saly_boks = req.getParameter("prz_phb_saly_boks");
if( prz_phb_saly_boks == null){
	System.out.println(this.toString+" : prz_phb_saly_boks is null" );
}else{
	System.out.println(this.toString+" : prz_phb_saly_boks is "+prz_phb_saly_boks );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
String make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String dlco_chrg_pers_nm = Util.checkString(req.getParameter("dlco_chrg_pers_nm"));
String dlco_chrg_pers_cntc_plac = Util.checkString(req.getParameter("dlco_chrg_pers_cntc_plac"));
String dlco_chrg_pers_email = Util.checkString(req.getParameter("dlco_chrg_pers_email"));
String dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String dlvs_plac_addr = Util.checkString(req.getParameter("dlvs_plac_addr"));
String clr_cd = Util.checkString(req.getParameter("clr_cd"));
String prt_paper_cd = Util.checkString(req.getParameter("prt_paper_cd"));
String incmp_design_yn = Util.checkString(req.getParameter("incmp_design_yn"));
String advcs_make_yn = Util.checkString(req.getParameter("advcs_make_yn"));
String pcnt_clsf = Util.checkString(req.getParameter("pcnt_clsf"));
String yy = Util.checkString(req.getParameter("yy"));
String prt_plan_dt = Util.checkString(req.getParameter("prt_plan_dt"));
String prz_rate_clsf = Util.checkString(req.getParameter("prz_rate_clsf"));
String prz_amt = Util.checkString(req.getParameter("prz_amt"));
String prz_phb_saly_boks = Util.checkString(req.getParameter("prz_phb_saly_boks"));
String remk = Util.checkString(req.getParameter("remk"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String make_ask_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_dt")));
String make_ask_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_seq")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String dlco_chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_chrg_pers_nm")));
String dlco_chrg_pers_cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_chrg_pers_cntc_plac")));
String dlco_chrg_pers_email = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_chrg_pers_email")));
String dlvs_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String dlvs_plac_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_plac_addr")));
String clr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_cd")));
String prt_paper_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_paper_cd")));
String incmp_design_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("incmp_design_yn")));
String advcs_make_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_make_yn")));
String pcnt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt_clsf")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String prt_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plan_dt")));
String prz_rate_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_rate_clsf")));
String prz_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_amt")));
String prz_phb_saly_boks = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_phb_saly_boks")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMake_ask_reg_dt(make_ask_reg_dt);
dm.setMake_ask_reg_seq(make_ask_reg_seq);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setDlco_chrg_pers_nm(dlco_chrg_pers_nm);
dm.setDlco_chrg_pers_cntc_plac(dlco_chrg_pers_cntc_plac);
dm.setDlco_chrg_pers_email(dlco_chrg_pers_email);
dm.setDlvs_dt(dlvs_dt);
dm.setWork_clsf(work_clsf);
dm.setDlvs_plac_addr(dlvs_plac_addr);
dm.setClr_cd(clr_cd);
dm.setPrt_paper_cd(prt_paper_cd);
dm.setIncmp_design_yn(incmp_design_yn);
dm.setAdvcs_make_yn(advcs_make_yn);
dm.setPcnt_clsf(pcnt_clsf);
dm.setYy(yy);
dm.setPrt_plan_dt(prt_plan_dt);
dm.setPrz_rate_clsf(prz_rate_clsf);
dm.setPrz_amt(prz_amt);
dm.setPrz_phb_saly_boks(prz_phb_saly_boks);
dm.setRemk(remk);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 06 12:56:44 KST 2012 */