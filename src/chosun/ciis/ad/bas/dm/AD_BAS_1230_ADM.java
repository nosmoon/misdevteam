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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1230_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String dlco_no;
	public String cntr_seq;
	public String dlco_nm;
	public String cntr_dt;
	public String colt_amt;
	public String mm_avg_pubc_amt;
	public String colt_ratio;
	public String avg_due_dd;
	public String remk;
	public String slcrg_pers;
	public String slcrg_opn;
	public String mchrg_pers;
	public String mchrg_opn;
	public String taem_chf_opn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_1230_ADM(){}
	public AD_BAS_1230_ADM(String flag, String cmpy_cd, String dlco_no, String cntr_seq, String dlco_nm, String cntr_dt, String colt_amt, String mm_avg_pubc_amt, String colt_ratio, String avg_due_dd, String remk, String slcrg_pers, String slcrg_opn, String mchrg_pers, String mchrg_opn, String taem_chf_opn, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.cntr_seq = cntr_seq;
		this.dlco_nm = dlco_nm;
		this.cntr_dt = cntr_dt;
		this.colt_amt = colt_amt;
		this.mm_avg_pubc_amt = mm_avg_pubc_amt;
		this.colt_ratio = colt_ratio;
		this.avg_due_dd = avg_due_dd;
		this.remk = remk;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_opn = slcrg_opn;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_opn = mchrg_opn;
		this.taem_chf_opn = taem_chf_opn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setColt_amt(String colt_amt){
		this.colt_amt = colt_amt;
	}

	public void setMm_avg_pubc_amt(String mm_avg_pubc_amt){
		this.mm_avg_pubc_amt = mm_avg_pubc_amt;
	}

	public void setColt_ratio(String colt_ratio){
		this.colt_ratio = colt_ratio;
	}

	public void setAvg_due_dd(String avg_due_dd){
		this.avg_due_dd = avg_due_dd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_opn(String slcrg_opn){
		this.slcrg_opn = slcrg_opn;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_opn(String mchrg_opn){
		this.mchrg_opn = mchrg_opn;
	}

	public void setTaem_chf_opn(String taem_chf_opn){
		this.taem_chf_opn = taem_chf_opn;
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

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getColt_amt(){
		return this.colt_amt;
	}

	public String getMm_avg_pubc_amt(){
		return this.mm_avg_pubc_amt;
	}

	public String getColt_ratio(){
		return this.colt_ratio;
	}

	public String getAvg_due_dd(){
		return this.avg_due_dd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_opn(){
		return this.slcrg_opn;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_opn(){
		return this.mchrg_opn;
	}

	public String getTaem_chf_opn(){
		return this.taem_chf_opn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1230_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1230_ADM dm = (AD_BAS_1230_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.cntr_seq);
		cstmt.setString(7, dm.dlco_nm);
		cstmt.setString(8, dm.cntr_dt);
		cstmt.setString(9, dm.colt_amt);
		cstmt.setString(10, dm.mm_avg_pubc_amt);
		cstmt.setString(11, dm.colt_ratio);
		cstmt.setString(12, dm.avg_due_dd);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.slcrg_pers);
		cstmt.setString(15, dm.slcrg_opn);
		cstmt.setString(16, dm.mchrg_pers);
		cstmt.setString(17, dm.mchrg_opn);
		cstmt.setString(18, dm.taem_chf_opn);
		cstmt.setString(19, dm.incmg_pers_ip);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1230_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("cntr_dt = [" + getCntr_dt() + "]");
		System.out.println("colt_amt = [" + getColt_amt() + "]");
		System.out.println("mm_avg_pubc_amt = [" + getMm_avg_pubc_amt() + "]");
		System.out.println("colt_ratio = [" + getColt_ratio() + "]");
		System.out.println("avg_due_dd = [" + getAvg_due_dd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("slcrg_opn = [" + getSlcrg_opn() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("mchrg_opn = [" + getMchrg_opn() + "]");
		System.out.println("taem_chf_opn = [" + getTaem_chf_opn() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String cntr_seq = req.getParameter("cntr_seq");
if( cntr_seq == null){
	System.out.println(this.toString+" : cntr_seq is null" );
}else{
	System.out.println(this.toString+" : cntr_seq is "+cntr_seq );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String cntr_dt = req.getParameter("cntr_dt");
if( cntr_dt == null){
	System.out.println(this.toString+" : cntr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_dt is "+cntr_dt );
}
String colt_amt = req.getParameter("colt_amt");
if( colt_amt == null){
	System.out.println(this.toString+" : colt_amt is null" );
}else{
	System.out.println(this.toString+" : colt_amt is "+colt_amt );
}
String mm_avg_pubc_amt = req.getParameter("mm_avg_pubc_amt");
if( mm_avg_pubc_amt == null){
	System.out.println(this.toString+" : mm_avg_pubc_amt is null" );
}else{
	System.out.println(this.toString+" : mm_avg_pubc_amt is "+mm_avg_pubc_amt );
}
String colt_ratio = req.getParameter("colt_ratio");
if( colt_ratio == null){
	System.out.println(this.toString+" : colt_ratio is null" );
}else{
	System.out.println(this.toString+" : colt_ratio is "+colt_ratio );
}
String avg_due_dd = req.getParameter("avg_due_dd");
if( avg_due_dd == null){
	System.out.println(this.toString+" : avg_due_dd is null" );
}else{
	System.out.println(this.toString+" : avg_due_dd is "+avg_due_dd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String slcrg_opn = req.getParameter("slcrg_opn");
if( slcrg_opn == null){
	System.out.println(this.toString+" : slcrg_opn is null" );
}else{
	System.out.println(this.toString+" : slcrg_opn is "+slcrg_opn );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String mchrg_opn = req.getParameter("mchrg_opn");
if( mchrg_opn == null){
	System.out.println(this.toString+" : mchrg_opn is null" );
}else{
	System.out.println(this.toString+" : mchrg_opn is "+mchrg_opn );
}
String taem_chf_opn = req.getParameter("taem_chf_opn");
if( taem_chf_opn == null){
	System.out.println(this.toString+" : taem_chf_opn is null" );
}else{
	System.out.println(this.toString+" : taem_chf_opn is "+taem_chf_opn );
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
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
String colt_amt = Util.checkString(req.getParameter("colt_amt"));
String mm_avg_pubc_amt = Util.checkString(req.getParameter("mm_avg_pubc_amt"));
String colt_ratio = Util.checkString(req.getParameter("colt_ratio"));
String avg_due_dd = Util.checkString(req.getParameter("avg_due_dd"));
String remk = Util.checkString(req.getParameter("remk"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String slcrg_opn = Util.checkString(req.getParameter("slcrg_opn"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String mchrg_opn = Util.checkString(req.getParameter("mchrg_opn"));
String taem_chf_opn = Util.checkString(req.getParameter("taem_chf_opn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt")));
String colt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_amt")));
String mm_avg_pubc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_avg_pubc_amt")));
String colt_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("colt_ratio")));
String avg_due_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_due_dd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String slcrg_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_opn")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String mchrg_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_opn")));
String taem_chf_opn = Util.Uni2Ksc(Util.checkString(req.getParameter("taem_chf_opn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setCntr_seq(cntr_seq);
dm.setDlco_nm(dlco_nm);
dm.setCntr_dt(cntr_dt);
dm.setColt_amt(colt_amt);
dm.setMm_avg_pubc_amt(mm_avg_pubc_amt);
dm.setColt_ratio(colt_ratio);
dm.setAvg_due_dd(avg_due_dd);
dm.setRemk(remk);
dm.setSlcrg_pers(slcrg_pers);
dm.setSlcrg_opn(slcrg_opn);
dm.setMchrg_pers(mchrg_pers);
dm.setMchrg_opn(mchrg_opn);
dm.setTaem_chf_opn(taem_chf_opn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 11:18:01 KST 2009 */