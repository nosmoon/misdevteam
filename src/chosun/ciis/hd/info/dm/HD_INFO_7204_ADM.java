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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7204_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String frlc_no;
	public String cmpy_cd;
	public String clos_yn;
	public String duty_dds;
	public String duty_tms;
	public String pay_cycl;
	public String servcost;
	public String pay_amt;
	public String etc_pay_cond;
	public String etc_amt;
	public String tot_amt;
	public String occr_dt;
	public String seq;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public HD_INFO_7204_ADM(){}
	public HD_INFO_7204_ADM(String mode, String frlc_no, String cmpy_cd, String clos_yn, String duty_dds, String duty_tms, String pay_cycl, String servcost, String pay_amt, String etc_pay_cond, String etc_amt, String tot_amt, String occr_dt, String seq, String incmg_pers_ipaddr, String incmg_pers){
		this.mode = mode;
		this.frlc_no = frlc_no;
		this.cmpy_cd = cmpy_cd;
		this.clos_yn = clos_yn;
		this.duty_dds = duty_dds;
		this.duty_tms = duty_tms;
		this.pay_cycl = pay_cycl;
		this.servcost = servcost;
		this.pay_amt = pay_amt;
		this.etc_pay_cond = etc_pay_cond;
		this.etc_amt = etc_amt;
		this.tot_amt = tot_amt;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setDuty_tms(String duty_tms){
		this.duty_tms = duty_tms;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setEtc_pay_cond(String etc_pay_cond){
		this.etc_pay_cond = etc_pay_cond;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getDuty_tms(){
		return this.duty_tms;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getEtc_pay_cond(){
		return this.etc_pay_cond;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7204_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7204_ADM dm = (HD_INFO_7204_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.frlc_no);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.clos_yn);
		cstmt.setString(7, dm.duty_dds);
		cstmt.setString(8, dm.duty_tms);
		cstmt.setString(9, dm.pay_cycl);
		cstmt.setString(10, dm.servcost);
		cstmt.setString(11, dm.pay_amt);
		cstmt.setString(12, dm.etc_pay_cond);
		cstmt.setString(13, dm.etc_amt);
		cstmt.setString(14, dm.tot_amt);
		cstmt.setString(15, dm.occr_dt);
		cstmt.setString(16, dm.seq);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7204_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("frlc_no = [" + getFrlc_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("duty_dds = [" + getDuty_dds() + "]");
		System.out.println("duty_tms = [" + getDuty_tms() + "]");
		System.out.println("pay_cycl = [" + getPay_cycl() + "]");
		System.out.println("servcost = [" + getServcost() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("etc_pay_cond = [" + getEtc_pay_cond() + "]");
		System.out.println("etc_amt = [" + getEtc_amt() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String frlc_no = req.getParameter("frlc_no");
if( frlc_no == null){
	System.out.println(this.toString+" : frlc_no is null" );
}else{
	System.out.println(this.toString+" : frlc_no is "+frlc_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String duty_dds = req.getParameter("duty_dds");
if( duty_dds == null){
	System.out.println(this.toString+" : duty_dds is null" );
}else{
	System.out.println(this.toString+" : duty_dds is "+duty_dds );
}
String duty_tms = req.getParameter("duty_tms");
if( duty_tms == null){
	System.out.println(this.toString+" : duty_tms is null" );
}else{
	System.out.println(this.toString+" : duty_tms is "+duty_tms );
}
String pay_cycl = req.getParameter("pay_cycl");
if( pay_cycl == null){
	System.out.println(this.toString+" : pay_cycl is null" );
}else{
	System.out.println(this.toString+" : pay_cycl is "+pay_cycl );
}
String servcost = req.getParameter("servcost");
if( servcost == null){
	System.out.println(this.toString+" : servcost is null" );
}else{
	System.out.println(this.toString+" : servcost is "+servcost );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String etc_pay_cond = req.getParameter("etc_pay_cond");
if( etc_pay_cond == null){
	System.out.println(this.toString+" : etc_pay_cond is null" );
}else{
	System.out.println(this.toString+" : etc_pay_cond is "+etc_pay_cond );
}
String etc_amt = req.getParameter("etc_amt");
if( etc_amt == null){
	System.out.println(this.toString+" : etc_amt is null" );
}else{
	System.out.println(this.toString+" : etc_amt is "+etc_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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

String mode = Util.checkString(req.getParameter("mode"));
String frlc_no = Util.checkString(req.getParameter("frlc_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String duty_dds = Util.checkString(req.getParameter("duty_dds"));
String duty_tms = Util.checkString(req.getParameter("duty_tms"));
String pay_cycl = Util.checkString(req.getParameter("pay_cycl"));
String servcost = Util.checkString(req.getParameter("servcost"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String etc_pay_cond = Util.checkString(req.getParameter("etc_pay_cond"));
String etc_amt = Util.checkString(req.getParameter("etc_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String frlc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("frlc_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String duty_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dds")));
String duty_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_tms")));
String pay_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cycl")));
String servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String etc_pay_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_pay_cond")));
String etc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setFrlc_no(frlc_no);
dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setDuty_dds(duty_dds);
dm.setDuty_tms(duty_tms);
dm.setPay_cycl(pay_cycl);
dm.setServcost(servcost);
dm.setPay_amt(pay_amt);
dm.setEtc_pay_cond(etc_pay_cond);
dm.setEtc_amt(etc_amt);
dm.setTot_amt(tot_amt);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 03 15:59:55 KST 2013 */