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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_3620_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String rept_no;
	public String dlco_no;
	public String advt_cont;
	public String remk;
	public String tel_no;
	public String slcrg_pers;
	public String mchrg_pers;
	public String occr_caus_busn;
	public String occr_caus_mang;
	public String act_matt_busn;
	public String act_matt_mang;
	public String proc_plan_busn;
	public String proc_plan_mang;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_3620_ADM(){}
	public AD_DEP_3620_ADM(String flag, String cmpy_cd, String rept_no, String dlco_no, String advt_cont, String remk, String tel_no, String slcrg_pers, String mchrg_pers, String occr_caus_busn, String occr_caus_mang, String act_matt_busn, String act_matt_mang, String proc_plan_busn, String proc_plan_mang, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.rept_no = rept_no;
		this.dlco_no = dlco_no;
		this.advt_cont = advt_cont;
		this.remk = remk;
		this.tel_no = tel_no;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.occr_caus_busn = occr_caus_busn;
		this.occr_caus_mang = occr_caus_mang;
		this.act_matt_busn = act_matt_busn;
		this.act_matt_mang = act_matt_mang;
		this.proc_plan_busn = proc_plan_busn;
		this.proc_plan_mang = proc_plan_mang;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setOccr_caus_busn(String occr_caus_busn){
		this.occr_caus_busn = occr_caus_busn;
	}

	public void setOccr_caus_mang(String occr_caus_mang){
		this.occr_caus_mang = occr_caus_mang;
	}

	public void setAct_matt_busn(String act_matt_busn){
		this.act_matt_busn = act_matt_busn;
	}

	public void setAct_matt_mang(String act_matt_mang){
		this.act_matt_mang = act_matt_mang;
	}

	public void setProc_plan_busn(String proc_plan_busn){
		this.proc_plan_busn = proc_plan_busn;
	}

	public void setProc_plan_mang(String proc_plan_mang){
		this.proc_plan_mang = proc_plan_mang;
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

	public String getRept_no(){
		return this.rept_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getOccr_caus_busn(){
		return this.occr_caus_busn;
	}

	public String getOccr_caus_mang(){
		return this.occr_caus_mang;
	}

	public String getAct_matt_busn(){
		return this.act_matt_busn;
	}

	public String getAct_matt_mang(){
		return this.act_matt_mang;
	}

	public String getProc_plan_busn(){
		return this.proc_plan_busn;
	}

	public String getProc_plan_mang(){
		return this.proc_plan_mang;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_3620_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_3620_ADM dm = (AD_DEP_3620_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.rept_no);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.advt_cont);
		cstmt.setString(8, dm.remk);
		cstmt.setString(9, dm.tel_no);
		cstmt.setString(10, dm.slcrg_pers);
		cstmt.setString(11, dm.mchrg_pers);
		cstmt.setString(12, dm.occr_caus_busn);
		cstmt.setString(13, dm.occr_caus_mang);
		cstmt.setString(14, dm.act_matt_busn);
		cstmt.setString(15, dm.act_matt_mang);
		cstmt.setString(16, dm.proc_plan_busn);
		cstmt.setString(17, dm.proc_plan_mang);
		cstmt.setString(18, dm.incmg_pers_ip);
		cstmt.setString(19, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_3620_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("occr_caus_busn = [" + getOccr_caus_busn() + "]");
		System.out.println("occr_caus_mang = [" + getOccr_caus_mang() + "]");
		System.out.println("act_matt_busn = [" + getAct_matt_busn() + "]");
		System.out.println("act_matt_mang = [" + getAct_matt_mang() + "]");
		System.out.println("proc_plan_busn = [" + getProc_plan_busn() + "]");
		System.out.println("proc_plan_mang = [" + getProc_plan_mang() + "]");
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
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String occr_caus_busn = req.getParameter("occr_caus_busn");
if( occr_caus_busn == null){
	System.out.println(this.toString+" : occr_caus_busn is null" );
}else{
	System.out.println(this.toString+" : occr_caus_busn is "+occr_caus_busn );
}
String occr_caus_mang = req.getParameter("occr_caus_mang");
if( occr_caus_mang == null){
	System.out.println(this.toString+" : occr_caus_mang is null" );
}else{
	System.out.println(this.toString+" : occr_caus_mang is "+occr_caus_mang );
}
String act_matt_busn = req.getParameter("act_matt_busn");
if( act_matt_busn == null){
	System.out.println(this.toString+" : act_matt_busn is null" );
}else{
	System.out.println(this.toString+" : act_matt_busn is "+act_matt_busn );
}
String act_matt_mang = req.getParameter("act_matt_mang");
if( act_matt_mang == null){
	System.out.println(this.toString+" : act_matt_mang is null" );
}else{
	System.out.println(this.toString+" : act_matt_mang is "+act_matt_mang );
}
String proc_plan_busn = req.getParameter("proc_plan_busn");
if( proc_plan_busn == null){
	System.out.println(this.toString+" : proc_plan_busn is null" );
}else{
	System.out.println(this.toString+" : proc_plan_busn is "+proc_plan_busn );
}
String proc_plan_mang = req.getParameter("proc_plan_mang");
if( proc_plan_mang == null){
	System.out.println(this.toString+" : proc_plan_mang is null" );
}else{
	System.out.println(this.toString+" : proc_plan_mang is "+proc_plan_mang );
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
String rept_no = Util.checkString(req.getParameter("rept_no"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String remk = Util.checkString(req.getParameter("remk"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String occr_caus_busn = Util.checkString(req.getParameter("occr_caus_busn"));
String occr_caus_mang = Util.checkString(req.getParameter("occr_caus_mang"));
String act_matt_busn = Util.checkString(req.getParameter("act_matt_busn"));
String act_matt_mang = Util.checkString(req.getParameter("act_matt_mang"));
String proc_plan_busn = Util.checkString(req.getParameter("proc_plan_busn"));
String proc_plan_mang = Util.checkString(req.getParameter("proc_plan_mang"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String occr_caus_busn = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_caus_busn")));
String occr_caus_mang = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_caus_mang")));
String act_matt_busn = Util.Uni2Ksc(Util.checkString(req.getParameter("act_matt_busn")));
String act_matt_mang = Util.Uni2Ksc(Util.checkString(req.getParameter("act_matt_mang")));
String proc_plan_busn = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_plan_busn")));
String proc_plan_mang = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_plan_mang")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setRept_no(rept_no);
dm.setDlco_no(dlco_no);
dm.setAdvt_cont(advt_cont);
dm.setRemk(remk);
dm.setTel_no(tel_no);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setOccr_caus_busn(occr_caus_busn);
dm.setOccr_caus_mang(occr_caus_mang);
dm.setAct_matt_busn(act_matt_busn);
dm.setAct_matt_mang(act_matt_mang);
dm.setProc_plan_busn(proc_plan_busn);
dm.setProc_plan_mang(proc_plan_mang);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 14:56:17 KST 2009 */