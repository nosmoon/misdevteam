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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */

 
public class AD_PUB_3130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt;
	public String chcode;
	public String cuscode;
	public String blndcode;
	public String orgcode;
	public String frdate;
	public String todate;
	public String rcvgrp;
	public String chgcode;
	public String stdmonth;
	public String dtlseq;
	public long rcvamt;
	public String vatcode;
	public String agentcode;
	public long agentfee;
	public String agentcode2;
	public long agentfee2;
	public String salecode;
	public String saleemp;
	public String deptcode;
	public String deptname;
	public String zpcode;
	public String zpname;
	public long stdamt;
	public long divamt;
	public long divvatamt;
	public long agentstdamt;
	public long agentdivamt;
	public long agentdivvatamt;
	public long agentstdamt2;
	public long agentdivamt2;
	public long agentdivvatamt2;
	public String pre_medi_cd;
	public String pre_pubc_occr_dt;
	public String pre_pubc_occr_seq;
	public String acct_yn_1;
	public String agent_branch_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String medialeb_yn;
	public String xchngadvt_yn;
	public String event_cd;
	public String rslt_dept;
	public long trst_rate;
	public long trst_fee;
	public long trst_vat;
	public long div_trst_fee_ex;
	public long div_trst_vat;
	public long div_trst_fee;
	public String mst_yn;
	public String dtl_yn;
	public String mst_medi_cd;
	public String mst_occr_dt;
	public String mst_occr_seq;
	public String mst_slip_no;

	public AD_PUB_3130_ADM(){}
	public AD_PUB_3130_ADM(String cmpy_cd, String clos_dt, String chcode, String cuscode, String blndcode, String orgcode, String frdate, String todate, String rcvgrp, String chgcode, String stdmonth, String dtlseq, long rcvamt, String vatcode, String agentcode, long agentfee, String agentcode2, long agentfee2, String salecode, String saleemp, String deptcode, String deptname, String zpcode, String zpname, long stdamt, long divamt, long divvatamt, long agentstdamt, long agentdivamt, long agentdivvatamt, long agentstdamt2, long agentdivamt2, long agentdivvatamt2, String pre_medi_cd, String pre_pubc_occr_dt, String pre_pubc_occr_seq, String acct_yn_1, String agent_branch_yn, String incmg_pers_ip, String incmg_pers, String medialeb_yn, String xchngadvt_yn, String event_cd, String rslt_dept, long trst_rate, long trst_fee, long trst_vat, long div_trst_fee_ex, long div_trst_vat, long div_trst_fee, String mst_yn, String dtl_yn,String mst_medi_cd,String mst_occr_dt, String mst_occr_seq, String mst_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt = clos_dt;
		this.chcode = chcode;
		this.cuscode = cuscode;
		this.blndcode = blndcode;
		this.orgcode = orgcode;
		this.frdate = frdate;
		this.todate = todate;
		this.rcvgrp = rcvgrp;
		this.chgcode = chgcode;
		this.stdmonth = stdmonth;
		this.dtlseq = dtlseq;
		this.rcvamt = rcvamt;
		this.vatcode = vatcode;
		this.agentcode = agentcode;
		this.agentfee = agentfee;
		this.agentcode2 = agentcode2;
		this.agentfee2 = agentfee2;
		this.salecode = salecode;
		this.saleemp = saleemp;
		this.deptcode = deptcode;
		this.deptname = deptname;
		this.zpcode = zpcode;
		this.zpname = zpname;
		this.stdamt = stdamt;
		this.divamt = divamt;
		this.divvatamt = divvatamt;
		this.agentstdamt = agentstdamt;
		this.agentdivamt = agentdivamt;
		this.agentdivvatamt = agentdivvatamt;
		this.agentstdamt2 = agentstdamt2;
		this.agentdivamt2 = agentdivamt2;
		this.agentdivvatamt2 = agentdivvatamt2;
		this.pre_medi_cd = pre_medi_cd;
		this.pre_pubc_occr_dt = pre_pubc_occr_dt;
		this.pre_pubc_occr_seq = pre_pubc_occr_seq;
		this.acct_yn_1 = acct_yn_1;
		this.agent_branch_yn = agent_branch_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.medialeb_yn = medialeb_yn;
		this.xchngadvt_yn = xchngadvt_yn;
		this.event_cd = event_cd;
		this.rslt_dept = rslt_dept;		
		this.trst_rate = trst_rate;
		this.trst_fee = trst_fee;
		this.trst_vat = trst_vat;
		this.div_trst_fee_ex = div_trst_fee_ex;
		this.div_trst_vat = div_trst_vat;
		this.div_trst_fee = div_trst_fee;
		this.mst_yn = mst_yn;
		this.dtl_yn = dtl_yn;
		this.mst_medi_cd = mst_medi_cd;
		this.mst_occr_dt = mst_occr_dt;
		this.mst_occr_seq = mst_occr_seq;
		this.mst_slip_no = mst_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setBlndcode(String blndcode){
		this.blndcode = blndcode;
	}

	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}

	public void setFrdate(String frdate){
		this.frdate = frdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
	}

	public void setRcvgrp(String rcvgrp){
		this.rcvgrp = rcvgrp;
	}

	public void setChgcode(String chgcode){
		this.chgcode = chgcode;
	}

	public void setStdmonth(String stdmonth){
		this.stdmonth = stdmonth;
	}

	public void setDtlseq(String dtlseq){
		this.dtlseq = dtlseq;
	}

	public void setRcvamt(long rcvamt){
		this.rcvamt = rcvamt;
	}

	public void setVatcode(String vatcode){
		this.vatcode = vatcode;
	}

	public void setAgentcode(String agentcode){
		this.agentcode = agentcode;
	}

	public void setAgentfee(long agentfee){
		this.agentfee = agentfee;
	}

	public void setAgentcode2(String agentcode2){
		this.agentcode2 = agentcode2;
	}

	public void setAgentfee2(long agentfee2){
		this.agentfee2 = agentfee2;
	}

	public void setSalecode(String salecode){
		this.salecode = salecode;
	}

	public void setSaleemp(String saleemp){
		this.saleemp = saleemp;
	}

	public void setDeptcode(String deptcode){
		this.deptcode = deptcode;
	}

	public void setDeptname(String deptname){
		this.deptname = deptname;
	}

	public void setZpcode(String zpcode){
		this.zpcode = zpcode;
	}

	public void setZpname(String zpname){
		this.zpname = zpname;
	}

	public void setStdamt(long stdamt){
		this.stdamt = stdamt;
	}

	public void setDivamt(long divamt){
		this.divamt = divamt;
	}

	public void setDivvatamt(long divvatamt){
		this.divvatamt = divvatamt;
	}

	public void setAgentstdamt(long agentstdamt){
		this.agentstdamt = agentstdamt;
	}

	public void setAgentdivamt(long agentdivamt){
		this.agentdivamt = agentdivamt;
	}

	public void setAgentdivvatamt(long agentdivvatamt){
		this.agentdivvatamt = agentdivvatamt;
	}

	public void setAgentstdamt2(long agentstdamt2){
		this.agentstdamt2 = agentstdamt2;
	}

	public void setAgentdivamt2(long agentdivamt2){
		this.agentdivamt2 = agentdivamt2;
	}

	public void setAgentdivvatamt2(long agentdivvatamt2){
		this.agentdivvatamt2 = agentdivvatamt2;
	}

	public void setPre_medi_cd(String pre_medi_cd){
		this.pre_medi_cd = pre_medi_cd;
	}

	public void setPre_pubc_occr_dt(String pre_pubc_occr_dt){
		this.pre_pubc_occr_dt = pre_pubc_occr_dt;
	}

	public void setPre_pubc_occr_seq(String pre_pubc_occr_seq){
		this.pre_pubc_occr_seq = pre_pubc_occr_seq;
	}

	public void setAcct_yn_1(String acct_yn_1){
		this.acct_yn_1 = acct_yn_1;
	}

	public void setAgent_branch_yn(String agent_branch_yn){
		this.agent_branch_yn = agent_branch_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMedialeb_yn(String medialeb_yn){
		this.medialeb_yn = medialeb_yn;
	}

	public void setXchngadvt_yn(String xchngadvt_yn){
		this.xchngadvt_yn = xchngadvt_yn;
	}

	public void setEvent_cd(String event_cd){
		this.event_cd = event_cd;
	}
	public void setRslt_dept(String rslt_dept){
		this.rslt_dept = rslt_dept;
	}
	public void setTrst_rate(long trst_rate){
		this.trst_rate = trst_rate;
	}

	public void setTrst_fee(long trst_fee){
		this.trst_fee = trst_fee;
	}

	public void setTrst_vat(long trst_vat){
		this.trst_vat = trst_vat;
	}
	
	public void setDiv_trst_fee_ex(long div_trst_fee_ex){
		this.div_trst_fee_ex = div_trst_fee_ex;
	}

	public void setDiv_trst_vat(long div_trst_vat){
		this.div_trst_vat = div_trst_vat;
	}

	public void setDiv_trst_fee(long div_trst_fee){
		this.div_trst_fee = div_trst_fee;
	}

	public void setMst_yn(String mst_yn){
		this.mst_yn = mst_yn;
	}

	public void setDtl_yn(String dtl_yn){
		this.dtl_yn = dtl_yn;
	}
	public void setMst_medi_cd(String mst_medi_cd){
		this.mst_medi_cd = mst_medi_cd;
	}

	public void setMst_occr_dt(String mst_occr_dt){
		this.mst_occr_dt = mst_occr_dt;
	}

	public void setMst_occr_seq(String mst_occr_seq){
		this.mst_occr_seq = mst_occr_seq;
	}
	public void setMst_slip_no(String mst_slip_no){
		this.mst_slip_no = mst_slip_no;
	}
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getBlndcode(){
		return this.blndcode;
	}

	public String getOrgcode(){
		return this.orgcode;
	}

	public String getFrdate(){
		return this.frdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getRcvgrp(){
		return this.rcvgrp;
	}

	public String getChgcode(){
		return this.chgcode;
	}

	public String getStdmonth(){
		return this.stdmonth;
	}

	public String getDtlseq(){
		return this.dtlseq;
	}

	public long getRcvamt(){
		return this.rcvamt;
	}

	public String getVatcode(){
		return this.vatcode;
	}

	public String getAgentcode(){
		return this.agentcode;
	}

	public long getAgentfee(){
		return this.agentfee;
	}

	public String getAgentcode2(){
		return this.agentcode2;
	}

	public long getAgentfee2(){
		return this.agentfee2;
	}

	public String getSalecode(){
		return this.salecode;
	}

	public String getSaleemp(){
		return this.saleemp;
	}

	public String getDeptcode(){
		return this.deptcode;
	}

	public String getDeptname(){
		return this.deptname;
	}

	public String getZpcode(){
		return this.zpcode;
	}

	public String getZpname(){
		return this.zpname;
	}

	public long getStdamt(){
		return this.stdamt;
	}

	public long getDivamt(){
		return this.divamt;
	}

	public long getDivvatamt(){
		return this.divvatamt;
	}

	public long getAgentstdamt(){
		return this.agentstdamt;
	}

	public long getAgentdivamt(){
		return this.agentdivamt;
	}

	public long getAgentdivvatamt(){
		return this.agentdivvatamt;
	}

	public long getAgentstdamt2(){
		return this.agentstdamt2;
	}

	public long getAgentdivamt2(){
		return this.agentdivamt2;
	}

	public long getAgentdivvatamt2(){
		return this.agentdivvatamt2;
	}

	public String getPre_medi_cd(){
		return this.pre_medi_cd;
	}

	public String getPre_pubc_occr_dt(){
		return this.pre_pubc_occr_dt;
	}

	public String getPre_pubc_occr_seq(){
		return this.pre_pubc_occr_seq;
	}

	public String getAcct_yn_1(){
		return this.acct_yn_1;
	}

	public String getAgent_branch_yn(){
		return this.agent_branch_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMedialeb_yn(){
		return this.medialeb_yn;
	}

	public String getXchngadvt_yn(){
		return this.xchngadvt_yn;
	}

	public String getEvent_cd(){
		return this.event_cd;
	}
	public String getRslt_dept(){
		return this.rslt_dept;
	}
	public long getTrst_rate(){
		return this.trst_rate;
	}

	public long getTrst_fee(){
		return this.trst_fee;
	}
	
	public long getTrst_vat(){
		return this.trst_vat;
	}
	
	public long getDiv_trst_fee_ex(){
		return this.div_trst_fee_ex;
	}

	public long getDiv_trst_vat(){
		return this.div_trst_vat;
	}

	public long getDiv_trst_fee(){
		return this.div_trst_fee;
	}

	public String getMst_yn(){
		return this.mst_yn;
	}

	public String getDtl_yn(){
		return this.dtl_yn;
	}
	public String getMst_medi_cd(){
		return this.mst_medi_cd;
	}

	public String getMst_occr_dt(){
		return this.mst_occr_dt;
	}

	public String getMst_occr_seq(){
		return this.mst_occr_seq;
	}
	public String getMst_slip_no(){
		return this.mst_slip_no;
	}
	
	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3130_A(?,?,?,?,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3130_ADM dm = (AD_PUB_3130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt);
		cstmt.setString(5, dm.chcode);
		cstmt.setString(6, dm.cuscode);
		cstmt.setString(7, dm.blndcode);
		cstmt.setString(8, dm.orgcode);
		cstmt.setString(9, dm.frdate);
		cstmt.setString(10, dm.todate);
		cstmt.setString(11, dm.rcvgrp);
		cstmt.setString(12, dm.chgcode);
		cstmt.setString(13, dm.stdmonth);
		cstmt.setString(14, dm.dtlseq);
		cstmt.setLong(15, dm.rcvamt);
		cstmt.setString(16, dm.vatcode);
		cstmt.setString(17, dm.agentcode);
		cstmt.setLong(18, dm.agentfee);
		cstmt.setString(19, dm.agentcode2);
		cstmt.setLong(20, dm.agentfee2);
		cstmt.setString(21, dm.salecode);
		cstmt.setString(22, dm.saleemp);
		cstmt.setString(23, dm.deptcode);
		cstmt.setString(24, dm.deptname);
		cstmt.setString(25, dm.zpcode);
		cstmt.setString(26, dm.zpname);
		cstmt.setLong(27, dm.stdamt);
		cstmt.setLong(28, dm.divamt);
		cstmt.setLong(29, dm.divvatamt);
		cstmt.setLong(30, dm.agentstdamt);
		cstmt.setLong(31, dm.agentdivamt);
		cstmt.setLong(32, dm.agentdivvatamt);
		cstmt.setLong(33, dm.agentstdamt2);
		cstmt.setLong(34, dm.agentdivamt2);
		cstmt.setLong(35, dm.agentdivvatamt2);
		cstmt.setString(36, dm.pre_medi_cd);
		cstmt.setString(37, dm.pre_pubc_occr_dt);
		cstmt.setString(38, dm.pre_pubc_occr_seq);
		cstmt.setString(39, dm.acct_yn_1);
		cstmt.setString(40, dm.agent_branch_yn);
		cstmt.setString(41, dm.incmg_pers_ip);
		cstmt.setString(42, dm.incmg_pers);
		cstmt.setString(43, dm.medialeb_yn);
		cstmt.setString(44, dm.xchngadvt_yn);
		cstmt.setString(45, dm.event_cd);
		cstmt.setString(46, dm.rslt_dept);
		cstmt.setLong(47, dm.trst_rate);
		cstmt.setLong(48, dm.trst_fee);
		cstmt.setLong(49, dm.trst_vat);
		cstmt.setLong(50, dm.div_trst_fee_ex);
		cstmt.setLong(51, dm.div_trst_vat);
		cstmt.setLong(52, dm.div_trst_fee);
		cstmt.setString(53, dm.mst_yn);
		cstmt.setString(54, dm.dtl_yn);
		cstmt.setString(55, dm.mst_medi_cd);
		cstmt.setString(56, dm.mst_occr_dt);
		cstmt.setString(57, dm.mst_occr_seq);
		cstmt.setString(58, dm.mst_slip_no);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
		cstmt.registerOutParameter(61, Types.VARCHAR);
		cstmt.registerOutParameter(62, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3130_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
		System.out.println("cuscode = [" + getCuscode() + "]");
		System.out.println("blndcode = [" + getBlndcode() + "]");
		System.out.println("orgcode = [" + getOrgcode() + "]");
		System.out.println("frdate = [" + getFrdate() + "]");
		System.out.println("todate = [" + getTodate() + "]");
		System.out.println("rcvgrp = [" + getRcvgrp() + "]");
		System.out.println("chgcode = [" + getChgcode() + "]");
		System.out.println("stdmonth = [" + getStdmonth() + "]");
		System.out.println("dtlseq = [" + getDtlseq() + "]");
		System.out.println("rcvamt = [" + getRcvamt() + "]");
		System.out.println("vatcode = [" + getVatcode() + "]");
		System.out.println("agentcode = [" + getAgentcode() + "]");
		System.out.println("agentfee = [" + getAgentfee() + "]");
		System.out.println("agentcode2 = [" + getAgentcode2() + "]");
		System.out.println("agentfee2 = [" + getAgentfee2() + "]");
		System.out.println("salecode = [" + getSalecode() + "]");
		System.out.println("saleemp = [" + getSaleemp() + "]");
		System.out.println("deptcode = [" + getDeptcode() + "]");
		System.out.println("deptname = [" + getDeptname() + "]");
		System.out.println("zpcode = [" + getZpcode() + "]");
		System.out.println("zpname = [" + getZpname() + "]");
		System.out.println("stdamt = [" + getStdamt() + "]");
		System.out.println("divamt = [" + getDivamt() + "]");
		System.out.println("divvatamt = [" + getDivvatamt() + "]");
		System.out.println("agentstdamt = [" + getAgentstdamt() + "]");
		System.out.println("agentdivamt = [" + getAgentdivamt() + "]");
		System.out.println("agentdivvatamt = [" + getAgentdivvatamt() + "]");
		System.out.println("agentstdamt2 = [" + getAgentstdamt2() + "]");
		System.out.println("agentdivamt2 = [" + getAgentdivamt2() + "]");
		System.out.println("agentdivvatamt2 = [" + getAgentdivvatamt2() + "]");
		System.out.println("pre_medi_cd = [" + getPre_medi_cd() + "]");
		System.out.println("pre_pubc_occr_dt = [" + getPre_pubc_occr_dt() + "]");
		System.out.println("pre_pubc_occr_seq = [" + getPre_pubc_occr_seq() + "]");
		System.out.println("acct_yn_1 = [" + getAcct_yn_1() + "]");
		System.out.println("agent_branch_yn = [" + getAgent_branch_yn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("medialeb_yn = [" + getMedialeb_yn() + "]");
		System.out.println("xchngadvt_yn = [" + getXchngadvt_yn() + "]");
		System.out.println("event_cd = [" + getEvent_cd() + "]");
		System.out.println("trst_rate = [" + getTrst_rate() + "]");
		System.out.println("trst_fee = [" + getTrst_fee() + "]");
		System.out.println("trst_vat = [" + getTrst_vat() + "]");
		System.out.println("div_trst_fee_ex = [" + getDiv_trst_fee_ex() + "]");
		System.out.println("div_trst_vat = [" + getDiv_trst_vat() + "]");
		System.out.println("div_trst_fee = [" + getDiv_trst_fee() + "]");
		System.out.println("mst_yn = [" + getMst_yn() + "]");
		System.out.println("dtl_yn = [" + getDtl_yn() + "]");
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
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
String cuscode = req.getParameter("cuscode");
if( cuscode == null){
	System.out.println(this.toString+" : cuscode is null" );
}else{
	System.out.println(this.toString+" : cuscode is "+cuscode );
}
String blndcode = req.getParameter("blndcode");
if( blndcode == null){
	System.out.println(this.toString+" : blndcode is null" );
}else{
	System.out.println(this.toString+" : blndcode is "+blndcode );
}
String orgcode = req.getParameter("orgcode");
if( orgcode == null){
	System.out.println(this.toString+" : orgcode is null" );
}else{
	System.out.println(this.toString+" : orgcode is "+orgcode );
}
String frdate = req.getParameter("frdate");
if( frdate == null){
	System.out.println(this.toString+" : frdate is null" );
}else{
	System.out.println(this.toString+" : frdate is "+frdate );
}
String todate = req.getParameter("todate");
if( todate == null){
	System.out.println(this.toString+" : todate is null" );
}else{
	System.out.println(this.toString+" : todate is "+todate );
}
String rcvgrp = req.getParameter("rcvgrp");
if( rcvgrp == null){
	System.out.println(this.toString+" : rcvgrp is null" );
}else{
	System.out.println(this.toString+" : rcvgrp is "+rcvgrp );
}
String chgcode = req.getParameter("chgcode");
if( chgcode == null){
	System.out.println(this.toString+" : chgcode is null" );
}else{
	System.out.println(this.toString+" : chgcode is "+chgcode );
}
String stdmonth = req.getParameter("stdmonth");
if( stdmonth == null){
	System.out.println(this.toString+" : stdmonth is null" );
}else{
	System.out.println(this.toString+" : stdmonth is "+stdmonth );
}
String dtlseq = req.getParameter("dtlseq");
if( dtlseq == null){
	System.out.println(this.toString+" : dtlseq is null" );
}else{
	System.out.println(this.toString+" : dtlseq is "+dtlseq );
}
String rcvamt = req.getParameter("rcvamt");
if( rcvamt == null){
	System.out.println(this.toString+" : rcvamt is null" );
}else{
	System.out.println(this.toString+" : rcvamt is "+rcvamt );
}
String vatcode = req.getParameter("vatcode");
if( vatcode == null){
	System.out.println(this.toString+" : vatcode is null" );
}else{
	System.out.println(this.toString+" : vatcode is "+vatcode );
}
String agentcode = req.getParameter("agentcode");
if( agentcode == null){
	System.out.println(this.toString+" : agentcode is null" );
}else{
	System.out.println(this.toString+" : agentcode is "+agentcode );
}
String agentfee = req.getParameter("agentfee");
if( agentfee == null){
	System.out.println(this.toString+" : agentfee is null" );
}else{
	System.out.println(this.toString+" : agentfee is "+agentfee );
}
String agentcode2 = req.getParameter("agentcode2");
if( agentcode2 == null){
	System.out.println(this.toString+" : agentcode2 is null" );
}else{
	System.out.println(this.toString+" : agentcode2 is "+agentcode2 );
}
String agentfee2 = req.getParameter("agentfee2");
if( agentfee2 == null){
	System.out.println(this.toString+" : agentfee2 is null" );
}else{
	System.out.println(this.toString+" : agentfee2 is "+agentfee2 );
}
String salecode = req.getParameter("salecode");
if( salecode == null){
	System.out.println(this.toString+" : salecode is null" );
}else{
	System.out.println(this.toString+" : salecode is "+salecode );
}
String saleemp = req.getParameter("saleemp");
if( saleemp == null){
	System.out.println(this.toString+" : saleemp is null" );
}else{
	System.out.println(this.toString+" : saleemp is "+saleemp );
}
String deptcode = req.getParameter("deptcode");
if( deptcode == null){
	System.out.println(this.toString+" : deptcode is null" );
}else{
	System.out.println(this.toString+" : deptcode is "+deptcode );
}
String deptname = req.getParameter("deptname");
if( deptname == null){
	System.out.println(this.toString+" : deptname is null" );
}else{
	System.out.println(this.toString+" : deptname is "+deptname );
}
String zpcode = req.getParameter("zpcode");
if( zpcode == null){
	System.out.println(this.toString+" : zpcode is null" );
}else{
	System.out.println(this.toString+" : zpcode is "+zpcode );
}
String zpname = req.getParameter("zpname");
if( zpname == null){
	System.out.println(this.toString+" : zpname is null" );
}else{
	System.out.println(this.toString+" : zpname is "+zpname );
}
String stdamt = req.getParameter("stdamt");
if( stdamt == null){
	System.out.println(this.toString+" : stdamt is null" );
}else{
	System.out.println(this.toString+" : stdamt is "+stdamt );
}
String divamt = req.getParameter("divamt");
if( divamt == null){
	System.out.println(this.toString+" : divamt is null" );
}else{
	System.out.println(this.toString+" : divamt is "+divamt );
}
String divvatamt = req.getParameter("divvatamt");
if( divvatamt == null){
	System.out.println(this.toString+" : divvatamt is null" );
}else{
	System.out.println(this.toString+" : divvatamt is "+divvatamt );
}
String agentstdamt = req.getParameter("agentstdamt");
if( agentstdamt == null){
	System.out.println(this.toString+" : agentstdamt is null" );
}else{
	System.out.println(this.toString+" : agentstdamt is "+agentstdamt );
}
String agentdivamt = req.getParameter("agentdivamt");
if( agentdivamt == null){
	System.out.println(this.toString+" : agentdivamt is null" );
}else{
	System.out.println(this.toString+" : agentdivamt is "+agentdivamt );
}
String agentdivvatamt = req.getParameter("agentdivvatamt");
if( agentdivvatamt == null){
	System.out.println(this.toString+" : agentdivvatamt is null" );
}else{
	System.out.println(this.toString+" : agentdivvatamt is "+agentdivvatamt );
}
String agentstdamt2 = req.getParameter("agentstdamt2");
if( agentstdamt2 == null){
	System.out.println(this.toString+" : agentstdamt2 is null" );
}else{
	System.out.println(this.toString+" : agentstdamt2 is "+agentstdamt2 );
}
String agentdivamt2 = req.getParameter("agentdivamt2");
if( agentdivamt2 == null){
	System.out.println(this.toString+" : agentdivamt2 is null" );
}else{
	System.out.println(this.toString+" : agentdivamt2 is "+agentdivamt2 );
}
String agentdivvatamt2 = req.getParameter("agentdivvatamt2");
if( agentdivvatamt2 == null){
	System.out.println(this.toString+" : agentdivvatamt2 is null" );
}else{
	System.out.println(this.toString+" : agentdivvatamt2 is "+agentdivvatamt2 );
}
String pre_medi_cd = req.getParameter("pre_medi_cd");
if( pre_medi_cd == null){
	System.out.println(this.toString+" : pre_medi_cd is null" );
}else{
	System.out.println(this.toString+" : pre_medi_cd is "+pre_medi_cd );
}
String pre_pubc_occr_dt = req.getParameter("pre_pubc_occr_dt");
if( pre_pubc_occr_dt == null){
	System.out.println(this.toString+" : pre_pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pre_pubc_occr_dt is "+pre_pubc_occr_dt );
}
String pre_pubc_occr_seq = req.getParameter("pre_pubc_occr_seq");
if( pre_pubc_occr_seq == null){
	System.out.println(this.toString+" : pre_pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : pre_pubc_occr_seq is "+pre_pubc_occr_seq );
}
String acct_yn_1 = req.getParameter("acct_yn_1");
if( acct_yn_1 == null){
	System.out.println(this.toString+" : acct_yn_1 is null" );
}else{
	System.out.println(this.toString+" : acct_yn_1 is "+acct_yn_1 );
}
String agent_branch_yn = req.getParameter("agent_branch_yn");
if( agent_branch_yn == null){
	System.out.println(this.toString+" : agent_branch_yn is null" );
}else{
	System.out.println(this.toString+" : agent_branch_yn is "+agent_branch_yn );
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
String medialeb_yn = req.getParameter("medialeb_yn");
if( medialeb_yn == null){
	System.out.println(this.toString+" : medialeb_yn is null" );
}else{
	System.out.println(this.toString+" : medialeb_yn is "+medialeb_yn );
}
String xchngadvt_yn = req.getParameter("xchngadvt_yn");
if( xchngadvt_yn == null){
	System.out.println(this.toString+" : xchngadvt_yn is null" );
}else{
	System.out.println(this.toString+" : xchngadvt_yn is "+xchngadvt_yn );
}
String event_cd = req.getParameter("event_cd");
if( event_cd == null){
	System.out.println(this.toString+" : event_cd is null" );
}else{
	System.out.println(this.toString+" : event_cd is "+event_cd );
}
String trst_rate = req.getParameter("trst_rate");
if( trst_rate == null){
	System.out.println(this.toString+" : trst_rate is null" );
}else{
	System.out.println(this.toString+" : trst_rate is "+trst_rate );
}
String trst_fee = req.getParameter("trst_fee");
if( trst_fee == null){
	System.out.println(this.toString+" : trst_fee is null" );
}else{
	System.out.println(this.toString+" : trst_fee is "+trst_fee );
}
String div_trst_fee_ex = req.getParameter("div_trst_fee_ex");
if( div_trst_fee_ex == null){
	System.out.println(this.toString+" : div_trst_fee_ex is null" );
}else{
	System.out.println(this.toString+" : div_trst_fee_ex is "+div_trst_fee_ex );
}
String div_trst_vat = req.getParameter("div_trst_vat");
if( div_trst_vat == null){
	System.out.println(this.toString+" : div_trst_vat is null" );
}else{
	System.out.println(this.toString+" : div_trst_vat is "+div_trst_vat );
}
String div_trst_fee = req.getParameter("div_trst_fee");
if( div_trst_fee == null){
	System.out.println(this.toString+" : div_trst_fee is null" );
}else{
	System.out.println(this.toString+" : div_trst_fee is "+div_trst_fee );
}
String mst_yn = req.getParameter("mst_yn");
if( mst_yn == null){
	System.out.println(this.toString+" : mst_yn is null" );
}else{
	System.out.println(this.toString+" : mst_yn is "+mst_yn );
}
String dtl_yn = req.getParameter("dtl_yn");
if( dtl_yn == null){
	System.out.println(this.toString+" : dtl_yn is null" );
}else{
	System.out.println(this.toString+" : dtl_yn is "+dtl_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String chcode = Util.checkString(req.getParameter("chcode"));
String cuscode = Util.checkString(req.getParameter("cuscode"));
String blndcode = Util.checkString(req.getParameter("blndcode"));
String orgcode = Util.checkString(req.getParameter("orgcode"));
String frdate = Util.checkString(req.getParameter("frdate"));
String todate = Util.checkString(req.getParameter("todate"));
String rcvgrp = Util.checkString(req.getParameter("rcvgrp"));
String chgcode = Util.checkString(req.getParameter("chgcode"));
String stdmonth = Util.checkString(req.getParameter("stdmonth"));
String dtlseq = Util.checkString(req.getParameter("dtlseq"));
String rcvamt = Util.checkString(req.getParameter("rcvamt"));
String vatcode = Util.checkString(req.getParameter("vatcode"));
String agentcode = Util.checkString(req.getParameter("agentcode"));
String agentfee = Util.checkString(req.getParameter("agentfee"));
String agentcode2 = Util.checkString(req.getParameter("agentcode2"));
String agentfee2 = Util.checkString(req.getParameter("agentfee2"));
String salecode = Util.checkString(req.getParameter("salecode"));
String saleemp = Util.checkString(req.getParameter("saleemp"));
String deptcode = Util.checkString(req.getParameter("deptcode"));
String deptname = Util.checkString(req.getParameter("deptname"));
String zpcode = Util.checkString(req.getParameter("zpcode"));
String zpname = Util.checkString(req.getParameter("zpname"));
String stdamt = Util.checkString(req.getParameter("stdamt"));
String divamt = Util.checkString(req.getParameter("divamt"));
String divvatamt = Util.checkString(req.getParameter("divvatamt"));
String agentstdamt = Util.checkString(req.getParameter("agentstdamt"));
String agentdivamt = Util.checkString(req.getParameter("agentdivamt"));
String agentdivvatamt = Util.checkString(req.getParameter("agentdivvatamt"));
String agentstdamt2 = Util.checkString(req.getParameter("agentstdamt2"));
String agentdivamt2 = Util.checkString(req.getParameter("agentdivamt2"));
String agentdivvatamt2 = Util.checkString(req.getParameter("agentdivvatamt2"));
String pre_medi_cd = Util.checkString(req.getParameter("pre_medi_cd"));
String pre_pubc_occr_dt = Util.checkString(req.getParameter("pre_pubc_occr_dt"));
String pre_pubc_occr_seq = Util.checkString(req.getParameter("pre_pubc_occr_seq"));
String acct_yn_1 = Util.checkString(req.getParameter("acct_yn_1"));
String agent_branch_yn = Util.checkString(req.getParameter("agent_branch_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String medialeb_yn = Util.checkString(req.getParameter("medialeb_yn"));
String xchngadvt_yn = Util.checkString(req.getParameter("xchngadvt_yn"));
String event_cd = Util.checkString(req.getParameter("event_cd"));
String trst_rate = Util.checkString(req.getParameter("trst_rate"));
String trst_fee = Util.checkString(req.getParameter("trst_fee"));
String div_trst_fee_ex = Util.checkString(req.getParameter("div_trst_fee_ex"));
String div_trst_vat = Util.checkString(req.getParameter("div_trst_vat"));
String div_trst_fee = Util.checkString(req.getParameter("div_trst_fee"));
String mst_yn = Util.checkString(req.getParameter("mst_yn"));
String dtl_yn = Util.checkString(req.getParameter("dtl_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
String cuscode = Util.Uni2Ksc(Util.checkString(req.getParameter("cuscode")));
String blndcode = Util.Uni2Ksc(Util.checkString(req.getParameter("blndcode")));
String orgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("orgcode")));
String frdate = Util.Uni2Ksc(Util.checkString(req.getParameter("frdate")));
String todate = Util.Uni2Ksc(Util.checkString(req.getParameter("todate")));
String rcvgrp = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvgrp")));
String chgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chgcode")));
String stdmonth = Util.Uni2Ksc(Util.checkString(req.getParameter("stdmonth")));
String dtlseq = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlseq")));
String rcvamt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvamt")));
String vatcode = Util.Uni2Ksc(Util.checkString(req.getParameter("vatcode")));
String agentcode = Util.Uni2Ksc(Util.checkString(req.getParameter("agentcode")));
String agentfee = Util.Uni2Ksc(Util.checkString(req.getParameter("agentfee")));
String agentcode2 = Util.Uni2Ksc(Util.checkString(req.getParameter("agentcode2")));
String agentfee2 = Util.Uni2Ksc(Util.checkString(req.getParameter("agentfee2")));
String salecode = Util.Uni2Ksc(Util.checkString(req.getParameter("salecode")));
String saleemp = Util.Uni2Ksc(Util.checkString(req.getParameter("saleemp")));
String deptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcode")));
String deptname = Util.Uni2Ksc(Util.checkString(req.getParameter("deptname")));
String zpcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zpcode")));
String zpname = Util.Uni2Ksc(Util.checkString(req.getParameter("zpname")));
String stdamt = Util.Uni2Ksc(Util.checkString(req.getParameter("stdamt")));
String divamt = Util.Uni2Ksc(Util.checkString(req.getParameter("divamt")));
String divvatamt = Util.Uni2Ksc(Util.checkString(req.getParameter("divvatamt")));
String agentstdamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agentstdamt")));
String agentdivamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agentdivamt")));
String agentdivvatamt = Util.Uni2Ksc(Util.checkString(req.getParameter("agentdivvatamt")));
String agentstdamt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("agentstdamt2")));
String agentdivamt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("agentdivamt2")));
String agentdivvatamt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("agentdivvatamt2")));
String pre_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_medi_cd")));
String pre_pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_pubc_occr_dt")));
String pre_pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_pubc_occr_seq")));
String acct_yn_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_yn_1")));
String agent_branch_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("agent_branch_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String medialeb_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("medialeb_yn")));
String xchngadvt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("xchngadvt_yn")));
String event_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("event_cd")));
String trst_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("trst_rate")));
String trst_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("trst_fee")));
String div_trst_fee_ex = Util.Uni2Ksc(Util.checkString(req.getParameter("div_trst_fee_ex")));
String div_trst_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("div_trst_vat")));
String div_trst_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("div_trst_fee")));
String mst_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_yn")));
String dtl_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dtl_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt(clos_dt);
dm.setChcode(chcode);
dm.setCuscode(cuscode);
dm.setBlndcode(blndcode);
dm.setOrgcode(orgcode);
dm.setFrdate(frdate);
dm.setTodate(todate);
dm.setRcvgrp(rcvgrp);
dm.setChgcode(chgcode);
dm.setStdmonth(stdmonth);
dm.setDtlseq(dtlseq);
dm.setRcvamt(rcvamt);
dm.setVatcode(vatcode);
dm.setAgentcode(agentcode);
dm.setAgentfee(agentfee);
dm.setAgentcode2(agentcode2);
dm.setAgentfee2(agentfee2);
dm.setSalecode(salecode);
dm.setSaleemp(saleemp);
dm.setDeptcode(deptcode);
dm.setDeptname(deptname);
dm.setZpcode(zpcode);
dm.setZpname(zpname);
dm.setStdamt(stdamt);
dm.setDivamt(divamt);
dm.setDivvatamt(divvatamt);
dm.setAgentstdamt(agentstdamt);
dm.setAgentdivamt(agentdivamt);
dm.setAgentdivvatamt(agentdivvatamt);
dm.setAgentstdamt2(agentstdamt2);
dm.setAgentdivamt2(agentdivamt2);
dm.setAgentdivvatamt2(agentdivvatamt2);
dm.setPre_medi_cd(pre_medi_cd);
dm.setPre_pubc_occr_dt(pre_pubc_occr_dt);
dm.setPre_pubc_occr_seq(pre_pubc_occr_seq);
dm.setAcct_yn_1(acct_yn_1);
dm.setAgent_branch_yn(agent_branch_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMedialeb_yn(medialeb_yn);
dm.setXchngadvt_yn(xchngadvt_yn);
dm.setEvent_cd(event_cd);
dm.setTrst_rate(trst_rate);
dm.setTrst_fee(trst_fee);
dm.setDiv_trst_fee_ex(div_trst_fee_ex);
dm.setDiv_trst_vat(div_trst_vat);
dm.setDiv_trst_fee(div_trst_fee);
dm.setMst_yn(mst_yn);
dm.setDtl_yn(dtl_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 23 19:07:16 KST 2014 */