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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_5070_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String prt_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String prt_clsf;
	public String pap_std;
	public String issu_pcnt;
	public String bw_pcnt;
	public String clr_pcnt;
	public String slip_qty;
	public String is_cnt_ex_yn;
	public String is_qty_inc_yn;
	public String add_prt_seq;
	public String dual_out_clsf;
	public String duty_ovt_prt_yn;
	public String remk;
	public String gubun2;
	public String occr_dt2;
	public String seq2;
	public String issu_dt2;
	public String prt_dt2;
	public String fac_clsf2;
	public String medi_cd2;
	public String sect_cd2;
	public String prt_clsf2;
	public String pap_std2;
	public String issu_pcnt2;
	public String bw_pcnt2;
	public String clr_pcnt2;
	public String slip_qty2;
	public String is_cnt_ex_yn2;
	public String is_qty_inc_yn2;
	public String remk2;
	public String gubun3;
	public String occr_dt3;
	public String seq3;
	public String issu_dt3;
	public String prt_dt3;
	public String fac_clsf3;
	public String medi_cd3;
	public String sect_cd3;
	public String prt_clsf3;
	public String pap_std3;
	public String papcmpy_cd3;
	public String issu_pcnt3;
	public String bw_pcnt3;
	public String clr_pcnt3;
	public String slip_qty3;
	public String is_cnt_ex_yn3;
	public String is_qty_inc_yn3;
	public String add_prt_seq3;
	public String dual_out_clsf3;
	public String duty_ovt_prt_yn3;
	public String remk3;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTEXEC_5070_ADM(){}
	public PR_PRTEXEC_5070_ADM(String gubun, String cmpy_cd, String occr_dt, String seq, String issu_dt, String prt_dt, String fac_clsf, String medi_cd, String sect_cd, String prt_clsf, String pap_std, String issu_pcnt, String bw_pcnt, String clr_pcnt, String slip_qty, String is_cnt_ex_yn, String is_qty_inc_yn, String add_prt_seq, String dual_out_clsf, String duty_ovt_prt_yn, String remk, String gubun2, String occr_dt2, String seq2, String issu_dt2, String prt_dt2, String fac_clsf2, String medi_cd2, String sect_cd2, String prt_clsf2, String pap_std2, String issu_pcnt2, String bw_pcnt2, String clr_pcnt2, String slip_qty2, String is_cnt_ex_yn2, String is_qty_inc_yn2, String remk2, String gubun3, String occr_dt3, String seq3, String issu_dt3, String prt_dt3, String fac_clsf3, String medi_cd3, String sect_cd3, String prt_clsf3, String pap_std3, String papcmpy_cd3, String issu_pcnt3, String bw_pcnt3, String clr_pcnt3, String slip_qty3, String is_cnt_ex_yn3, String is_qty_inc_yn3, String add_prt_seq3, String dual_out_clsf3, String duty_ovt_prt_yn3, String remk3, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.issu_dt = issu_dt;
		this.prt_dt = prt_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.prt_clsf = prt_clsf;
		this.pap_std = pap_std;
		this.issu_pcnt = issu_pcnt;
		this.bw_pcnt = bw_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.slip_qty = slip_qty;
		this.is_cnt_ex_yn = is_cnt_ex_yn;
		this.is_qty_inc_yn = is_qty_inc_yn;
		this.add_prt_seq = add_prt_seq;
		this.dual_out_clsf = dual_out_clsf;
		this.duty_ovt_prt_yn = duty_ovt_prt_yn;
		this.remk = remk;
		this.gubun2 = gubun2;
		this.occr_dt2 = occr_dt2;
		this.seq2 = seq2;
		this.issu_dt2 = issu_dt2;
		this.prt_dt2 = prt_dt2;
		this.fac_clsf2 = fac_clsf2;
		this.medi_cd2 = medi_cd2;
		this.sect_cd2 = sect_cd2;
		this.prt_clsf2 = prt_clsf2;
		this.pap_std2 = pap_std2;
		this.issu_pcnt2 = issu_pcnt2;
		this.bw_pcnt2 = bw_pcnt2;
		this.clr_pcnt2 = clr_pcnt2;
		this.slip_qty2 = slip_qty2;
		this.is_cnt_ex_yn2 = is_cnt_ex_yn2;
		this.is_qty_inc_yn2 = is_qty_inc_yn2;
		this.remk2 = remk2;
		this.gubun3 = gubun3;
		this.occr_dt3 = occr_dt3;
		this.seq3 = seq3;
		this.issu_dt3 = issu_dt3;
		this.prt_dt3 = prt_dt3;
		this.fac_clsf3 = fac_clsf3;
		this.medi_cd3 = medi_cd3;
		this.sect_cd3 = sect_cd3;
		this.prt_clsf3 = prt_clsf3;
		this.pap_std3 = pap_std3;
		this.papcmpy_cd3 = papcmpy_cd3;
		this.issu_pcnt3 = issu_pcnt3;
		this.bw_pcnt3 = bw_pcnt3;
		this.clr_pcnt3 = clr_pcnt3;
		this.slip_qty3 = slip_qty3;
		this.is_cnt_ex_yn3 = is_cnt_ex_yn3;
		this.is_qty_inc_yn3 = is_qty_inc_yn3;
		this.add_prt_seq3 = add_prt_seq3;
		this.dual_out_clsf3 = dual_out_clsf3;
		this.duty_ovt_prt_yn3 = duty_ovt_prt_yn3;
		this.remk3 = remk3;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setIs_cnt_ex_yn(String is_cnt_ex_yn){
		this.is_cnt_ex_yn = is_cnt_ex_yn;
	}

	public void setIs_qty_inc_yn(String is_qty_inc_yn){
		this.is_qty_inc_yn = is_qty_inc_yn;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setDuty_ovt_prt_yn(String duty_ovt_prt_yn){
		this.duty_ovt_prt_yn = duty_ovt_prt_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setGubun2(String gubun2){
		this.gubun2 = gubun2;
	}

	public void setOccr_dt2(String occr_dt2){
		this.occr_dt2 = occr_dt2;
	}

	public void setSeq2(String seq2){
		this.seq2 = seq2;
	}

	public void setIssu_dt2(String issu_dt2){
		this.issu_dt2 = issu_dt2;
	}

	public void setPrt_dt2(String prt_dt2){
		this.prt_dt2 = prt_dt2;
	}

	public void setFac_clsf2(String fac_clsf2){
		this.fac_clsf2 = fac_clsf2;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setSect_cd2(String sect_cd2){
		this.sect_cd2 = sect_cd2;
	}

	public void setPrt_clsf2(String prt_clsf2){
		this.prt_clsf2 = prt_clsf2;
	}

	public void setPap_std2(String pap_std2){
		this.pap_std2 = pap_std2;
	}

	public void setIssu_pcnt2(String issu_pcnt2){
		this.issu_pcnt2 = issu_pcnt2;
	}

	public void setBw_pcnt2(String bw_pcnt2){
		this.bw_pcnt2 = bw_pcnt2;
	}

	public void setClr_pcnt2(String clr_pcnt2){
		this.clr_pcnt2 = clr_pcnt2;
	}

	public void setSlip_qty2(String slip_qty2){
		this.slip_qty2 = slip_qty2;
	}

	public void setIs_cnt_ex_yn2(String is_cnt_ex_yn2){
		this.is_cnt_ex_yn2 = is_cnt_ex_yn2;
	}

	public void setIs_qty_inc_yn2(String is_qty_inc_yn2){
		this.is_qty_inc_yn2 = is_qty_inc_yn2;
	}

	public void setRemk2(String remk2){
		this.remk2 = remk2;
	}

	public void setGubun3(String gubun3){
		this.gubun3 = gubun3;
	}

	public void setOccr_dt3(String occr_dt3){
		this.occr_dt3 = occr_dt3;
	}

	public void setSeq3(String seq3){
		this.seq3 = seq3;
	}

	public void setIssu_dt3(String issu_dt3){
		this.issu_dt3 = issu_dt3;
	}

	public void setPrt_dt3(String prt_dt3){
		this.prt_dt3 = prt_dt3;
	}

	public void setFac_clsf3(String fac_clsf3){
		this.fac_clsf3 = fac_clsf3;
	}

	public void setMedi_cd3(String medi_cd3){
		this.medi_cd3 = medi_cd3;
	}

	public void setSect_cd3(String sect_cd3){
		this.sect_cd3 = sect_cd3;
	}

	public void setPrt_clsf3(String prt_clsf3){
		this.prt_clsf3 = prt_clsf3;
	}

	public void setPap_std3(String pap_std3){
		this.pap_std3 = pap_std3;
	}

	public void setPapcmpy_cd3(String papcmpy_cd3){
		this.papcmpy_cd3 = papcmpy_cd3;
	}

	public void setIssu_pcnt3(String issu_pcnt3){
		this.issu_pcnt3 = issu_pcnt3;
	}

	public void setBw_pcnt3(String bw_pcnt3){
		this.bw_pcnt3 = bw_pcnt3;
	}

	public void setClr_pcnt3(String clr_pcnt3){
		this.clr_pcnt3 = clr_pcnt3;
	}

	public void setSlip_qty3(String slip_qty3){
		this.slip_qty3 = slip_qty3;
	}

	public void setIs_cnt_ex_yn3(String is_cnt_ex_yn3){
		this.is_cnt_ex_yn3 = is_cnt_ex_yn3;
	}

	public void setIs_qty_inc_yn3(String is_qty_inc_yn3){
		this.is_qty_inc_yn3 = is_qty_inc_yn3;
	}

	public void setAdd_prt_seq3(String add_prt_seq3){
		this.add_prt_seq3 = add_prt_seq3;
	}

	public void setDual_out_clsf3(String dual_out_clsf3){
		this.dual_out_clsf3 = dual_out_clsf3;
	}

	public void setDuty_ovt_prt_yn3(String duty_ovt_prt_yn3){
		this.duty_ovt_prt_yn3 = duty_ovt_prt_yn3;
	}

	public void setRemk3(String remk3){
		this.remk3 = remk3;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getIs_cnt_ex_yn(){
		return this.is_cnt_ex_yn;
	}

	public String getIs_qty_inc_yn(){
		return this.is_qty_inc_yn;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getDuty_ovt_prt_yn(){
		return this.duty_ovt_prt_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getGubun2(){
		return this.gubun2;
	}

	public String getOccr_dt2(){
		return this.occr_dt2;
	}

	public String getSeq2(){
		return this.seq2;
	}

	public String getIssu_dt2(){
		return this.issu_dt2;
	}

	public String getPrt_dt2(){
		return this.prt_dt2;
	}

	public String getFac_clsf2(){
		return this.fac_clsf2;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getSect_cd2(){
		return this.sect_cd2;
	}

	public String getPrt_clsf2(){
		return this.prt_clsf2;
	}

	public String getPap_std2(){
		return this.pap_std2;
	}

	public String getIssu_pcnt2(){
		return this.issu_pcnt2;
	}

	public String getBw_pcnt2(){
		return this.bw_pcnt2;
	}

	public String getClr_pcnt2(){
		return this.clr_pcnt2;
	}

	public String getSlip_qty2(){
		return this.slip_qty2;
	}

	public String getIs_cnt_ex_yn2(){
		return this.is_cnt_ex_yn2;
	}

	public String getIs_qty_inc_yn2(){
		return this.is_qty_inc_yn2;
	}

	public String getRemk2(){
		return this.remk2;
	}

	public String getGubun3(){
		return this.gubun3;
	}

	public String getOccr_dt3(){
		return this.occr_dt3;
	}

	public String getSeq3(){
		return this.seq3;
	}

	public String getIssu_dt3(){
		return this.issu_dt3;
	}

	public String getPrt_dt3(){
		return this.prt_dt3;
	}

	public String getFac_clsf3(){
		return this.fac_clsf3;
	}

	public String getMedi_cd3(){
		return this.medi_cd3;
	}

	public String getSect_cd3(){
		return this.sect_cd3;
	}

	public String getPrt_clsf3(){
		return this.prt_clsf3;
	}

	public String getPap_std3(){
		return this.pap_std3;
	}

	public String getPapcmpy_cd3(){
		return this.papcmpy_cd3;
	}

	public String getIssu_pcnt3(){
		return this.issu_pcnt3;
	}

	public String getBw_pcnt3(){
		return this.bw_pcnt3;
	}

	public String getClr_pcnt3(){
		return this.clr_pcnt3;
	}

	public String getSlip_qty3(){
		return this.slip_qty3;
	}

	public String getIs_cnt_ex_yn3(){
		return this.is_cnt_ex_yn3;
	}

	public String getIs_qty_inc_yn3(){
		return this.is_qty_inc_yn3;
	}

	public String getAdd_prt_seq3(){
		return this.add_prt_seq3;
	}

	public String getDual_out_clsf3(){
		return this.dual_out_clsf3;
	}

	public String getDuty_ovt_prt_yn3(){
		return this.duty_ovt_prt_yn3;
	}

	public String getRemk3(){
		return this.remk3;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_5070_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_5070_ADM dm = (PR_PRTEXEC_5070_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.prt_dt);
		cstmt.setString(9, dm.fac_clsf);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.sect_cd);
		cstmt.setString(12, dm.prt_clsf);
		cstmt.setString(13, dm.pap_std);
		cstmt.setString(14, dm.issu_pcnt);
		cstmt.setString(15, dm.bw_pcnt);
		cstmt.setString(16, dm.clr_pcnt);
		cstmt.setString(17, dm.slip_qty);
		cstmt.setString(18, dm.is_cnt_ex_yn);
		cstmt.setString(19, dm.is_qty_inc_yn);
		cstmt.setString(20, dm.add_prt_seq);
		cstmt.setString(21, dm.dual_out_clsf);
		cstmt.setString(22, dm.duty_ovt_prt_yn);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.gubun2);
		cstmt.setString(25, dm.occr_dt2);
		cstmt.setString(26, dm.seq2);
		cstmt.setString(27, dm.issu_dt2);
		cstmt.setString(28, dm.prt_dt2);
		cstmt.setString(29, dm.fac_clsf2);
		cstmt.setString(30, dm.medi_cd2);
		cstmt.setString(31, dm.sect_cd2);
		cstmt.setString(32, dm.prt_clsf2);
		cstmt.setString(33, dm.pap_std2);
		cstmt.setString(34, dm.issu_pcnt2);
		cstmt.setString(35, dm.bw_pcnt2);
		cstmt.setString(36, dm.clr_pcnt2);
		cstmt.setString(37, dm.slip_qty2);
		cstmt.setString(38, dm.is_cnt_ex_yn2);
		cstmt.setString(39, dm.is_qty_inc_yn2);
		cstmt.setString(40, dm.remk2);
		cstmt.setString(41, dm.gubun3);
		cstmt.setString(42, dm.occr_dt3);
		cstmt.setString(43, dm.seq3);
		cstmt.setString(44, dm.issu_dt3);
		cstmt.setString(45, dm.prt_dt3);
		cstmt.setString(46, dm.fac_clsf3);
		cstmt.setString(47, dm.medi_cd3);
		cstmt.setString(48, dm.sect_cd3);
		cstmt.setString(49, dm.prt_clsf3);
		cstmt.setString(50, dm.pap_std3);
		cstmt.setString(51, dm.papcmpy_cd3);
		cstmt.setString(52, dm.issu_pcnt3);
		cstmt.setString(53, dm.bw_pcnt3);
		cstmt.setString(54, dm.clr_pcnt3);
		cstmt.setString(55, dm.slip_qty3);
		cstmt.setString(56, dm.is_cnt_ex_yn3);
		cstmt.setString(57, dm.is_qty_inc_yn3);
		cstmt.setString(58, dm.add_prt_seq3);
		cstmt.setString(59, dm.dual_out_clsf3);
		cstmt.setString(60, dm.duty_ovt_prt_yn3);
		cstmt.setString(61, dm.remk3);
		cstmt.setString(62, dm.incmg_pers_ipaddr);
		cstmt.setString(63, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_5070_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("prt_clsf = [" + getPrt_clsf() + "]");
		System.out.println("pap_std = [" + getPap_std() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("bw_pcnt = [" + getBw_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("slip_qty = [" + getSlip_qty() + "]");
		System.out.println("is_cnt_ex_yn = [" + getIs_cnt_ex_yn() + "]");
		System.out.println("is_qty_inc_yn = [" + getIs_qty_inc_yn() + "]");
		System.out.println("add_prt_seq = [" + getAdd_prt_seq() + "]");
		System.out.println("dual_out_clsf = [" + getDual_out_clsf() + "]");
		System.out.println("duty_ovt_prt_yn = [" + getDuty_ovt_prt_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("gubun2 = [" + getGubun2() + "]");
		System.out.println("occr_dt2 = [" + getOccr_dt2() + "]");
		System.out.println("seq2 = [" + getSeq2() + "]");
		System.out.println("issu_dt2 = [" + getIssu_dt2() + "]");
		System.out.println("prt_dt2 = [" + getPrt_dt2() + "]");
		System.out.println("fac_clsf2 = [" + getFac_clsf2() + "]");
		System.out.println("medi_cd2 = [" + getMedi_cd2() + "]");
		System.out.println("sect_cd2 = [" + getSect_cd2() + "]");
		System.out.println("prt_clsf2 = [" + getPrt_clsf2() + "]");
		System.out.println("pap_std2 = [" + getPap_std2() + "]");
		System.out.println("issu_pcnt2 = [" + getIssu_pcnt2() + "]");
		System.out.println("bw_pcnt2 = [" + getBw_pcnt2() + "]");
		System.out.println("clr_pcnt2 = [" + getClr_pcnt2() + "]");
		System.out.println("slip_qty2 = [" + getSlip_qty2() + "]");
		System.out.println("is_cnt_ex_yn2 = [" + getIs_cnt_ex_yn2() + "]");
		System.out.println("is_qty_inc_yn2 = [" + getIs_qty_inc_yn2() + "]");
		System.out.println("remk2 = [" + getRemk2() + "]");
		System.out.println("gubun3 = [" + getGubun3() + "]");
		System.out.println("occr_dt3 = [" + getOccr_dt3() + "]");
		System.out.println("seq3 = [" + getSeq3() + "]");
		System.out.println("issu_dt3 = [" + getIssu_dt3() + "]");
		System.out.println("prt_dt3 = [" + getPrt_dt3() + "]");
		System.out.println("fac_clsf3 = [" + getFac_clsf3() + "]");
		System.out.println("medi_cd3 = [" + getMedi_cd3() + "]");
		System.out.println("sect_cd3 = [" + getSect_cd3() + "]");
		System.out.println("prt_clsf3 = [" + getPrt_clsf3() + "]");
		System.out.println("pap_std3 = [" + getPap_std3() + "]");
		System.out.println("papcmpy_cd3 = [" + getPapcmpy_cd3() + "]");
		System.out.println("issu_pcnt3 = [" + getIssu_pcnt3() + "]");
		System.out.println("bw_pcnt3 = [" + getBw_pcnt3() + "]");
		System.out.println("clr_pcnt3 = [" + getClr_pcnt3() + "]");
		System.out.println("slip_qty3 = [" + getSlip_qty3() + "]");
		System.out.println("is_cnt_ex_yn3 = [" + getIs_cnt_ex_yn3() + "]");
		System.out.println("is_qty_inc_yn3 = [" + getIs_qty_inc_yn3() + "]");
		System.out.println("add_prt_seq3 = [" + getAdd_prt_seq3() + "]");
		System.out.println("dual_out_clsf3 = [" + getDual_out_clsf3() + "]");
		System.out.println("duty_ovt_prt_yn3 = [" + getDuty_ovt_prt_yn3() + "]");
		System.out.println("remk3 = [" + getRemk3() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String prt_clsf = req.getParameter("prt_clsf");
if( prt_clsf == null){
	System.out.println(this.toString+" : prt_clsf is null" );
}else{
	System.out.println(this.toString+" : prt_clsf is "+prt_clsf );
}
String pap_std = req.getParameter("pap_std");
if( pap_std == null){
	System.out.println(this.toString+" : pap_std is null" );
}else{
	System.out.println(this.toString+" : pap_std is "+pap_std );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String bw_pcnt = req.getParameter("bw_pcnt");
if( bw_pcnt == null){
	System.out.println(this.toString+" : bw_pcnt is null" );
}else{
	System.out.println(this.toString+" : bw_pcnt is "+bw_pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
String slip_qty = req.getParameter("slip_qty");
if( slip_qty == null){
	System.out.println(this.toString+" : slip_qty is null" );
}else{
	System.out.println(this.toString+" : slip_qty is "+slip_qty );
}
String is_cnt_ex_yn = req.getParameter("is_cnt_ex_yn");
if( is_cnt_ex_yn == null){
	System.out.println(this.toString+" : is_cnt_ex_yn is null" );
}else{
	System.out.println(this.toString+" : is_cnt_ex_yn is "+is_cnt_ex_yn );
}
String is_qty_inc_yn = req.getParameter("is_qty_inc_yn");
if( is_qty_inc_yn == null){
	System.out.println(this.toString+" : is_qty_inc_yn is null" );
}else{
	System.out.println(this.toString+" : is_qty_inc_yn is "+is_qty_inc_yn );
}
String add_prt_seq = req.getParameter("add_prt_seq");
if( add_prt_seq == null){
	System.out.println(this.toString+" : add_prt_seq is null" );
}else{
	System.out.println(this.toString+" : add_prt_seq is "+add_prt_seq );
}
String dual_out_clsf = req.getParameter("dual_out_clsf");
if( dual_out_clsf == null){
	System.out.println(this.toString+" : dual_out_clsf is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf is "+dual_out_clsf );
}
String duty_ovt_prt_yn = req.getParameter("duty_ovt_prt_yn");
if( duty_ovt_prt_yn == null){
	System.out.println(this.toString+" : duty_ovt_prt_yn is null" );
}else{
	System.out.println(this.toString+" : duty_ovt_prt_yn is "+duty_ovt_prt_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String gubun2 = req.getParameter("gubun2");
if( gubun2 == null){
	System.out.println(this.toString+" : gubun2 is null" );
}else{
	System.out.println(this.toString+" : gubun2 is "+gubun2 );
}
String occr_dt2 = req.getParameter("occr_dt2");
if( occr_dt2 == null){
	System.out.println(this.toString+" : occr_dt2 is null" );
}else{
	System.out.println(this.toString+" : occr_dt2 is "+occr_dt2 );
}
String seq2 = req.getParameter("seq2");
if( seq2 == null){
	System.out.println(this.toString+" : seq2 is null" );
}else{
	System.out.println(this.toString+" : seq2 is "+seq2 );
}
String issu_dt2 = req.getParameter("issu_dt2");
if( issu_dt2 == null){
	System.out.println(this.toString+" : issu_dt2 is null" );
}else{
	System.out.println(this.toString+" : issu_dt2 is "+issu_dt2 );
}
String prt_dt2 = req.getParameter("prt_dt2");
if( prt_dt2 == null){
	System.out.println(this.toString+" : prt_dt2 is null" );
}else{
	System.out.println(this.toString+" : prt_dt2 is "+prt_dt2 );
}
String fac_clsf2 = req.getParameter("fac_clsf2");
if( fac_clsf2 == null){
	System.out.println(this.toString+" : fac_clsf2 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf2 is "+fac_clsf2 );
}
String medi_cd2 = req.getParameter("medi_cd2");
if( medi_cd2 == null){
	System.out.println(this.toString+" : medi_cd2 is null" );
}else{
	System.out.println(this.toString+" : medi_cd2 is "+medi_cd2 );
}
String sect_cd2 = req.getParameter("sect_cd2");
if( sect_cd2 == null){
	System.out.println(this.toString+" : sect_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_cd2 is "+sect_cd2 );
}
String prt_clsf2 = req.getParameter("prt_clsf2");
if( prt_clsf2 == null){
	System.out.println(this.toString+" : prt_clsf2 is null" );
}else{
	System.out.println(this.toString+" : prt_clsf2 is "+prt_clsf2 );
}
String pap_std2 = req.getParameter("pap_std2");
if( pap_std2 == null){
	System.out.println(this.toString+" : pap_std2 is null" );
}else{
	System.out.println(this.toString+" : pap_std2 is "+pap_std2 );
}
String issu_pcnt2 = req.getParameter("issu_pcnt2");
if( issu_pcnt2 == null){
	System.out.println(this.toString+" : issu_pcnt2 is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt2 is "+issu_pcnt2 );
}
String bw_pcnt2 = req.getParameter("bw_pcnt2");
if( bw_pcnt2 == null){
	System.out.println(this.toString+" : bw_pcnt2 is null" );
}else{
	System.out.println(this.toString+" : bw_pcnt2 is "+bw_pcnt2 );
}
String clr_pcnt2 = req.getParameter("clr_pcnt2");
if( clr_pcnt2 == null){
	System.out.println(this.toString+" : clr_pcnt2 is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt2 is "+clr_pcnt2 );
}
String slip_qty2 = req.getParameter("slip_qty2");
if( slip_qty2 == null){
	System.out.println(this.toString+" : slip_qty2 is null" );
}else{
	System.out.println(this.toString+" : slip_qty2 is "+slip_qty2 );
}
String is_cnt_ex_yn2 = req.getParameter("is_cnt_ex_yn2");
if( is_cnt_ex_yn2 == null){
	System.out.println(this.toString+" : is_cnt_ex_yn2 is null" );
}else{
	System.out.println(this.toString+" : is_cnt_ex_yn2 is "+is_cnt_ex_yn2 );
}
String is_qty_inc_yn2 = req.getParameter("is_qty_inc_yn2");
if( is_qty_inc_yn2 == null){
	System.out.println(this.toString+" : is_qty_inc_yn2 is null" );
}else{
	System.out.println(this.toString+" : is_qty_inc_yn2 is "+is_qty_inc_yn2 );
}
String remk2 = req.getParameter("remk2");
if( remk2 == null){
	System.out.println(this.toString+" : remk2 is null" );
}else{
	System.out.println(this.toString+" : remk2 is "+remk2 );
}
String gubun3 = req.getParameter("gubun3");
if( gubun3 == null){
	System.out.println(this.toString+" : gubun3 is null" );
}else{
	System.out.println(this.toString+" : gubun3 is "+gubun3 );
}
String occr_dt3 = req.getParameter("occr_dt3");
if( occr_dt3 == null){
	System.out.println(this.toString+" : occr_dt3 is null" );
}else{
	System.out.println(this.toString+" : occr_dt3 is "+occr_dt3 );
}
String seq3 = req.getParameter("seq3");
if( seq3 == null){
	System.out.println(this.toString+" : seq3 is null" );
}else{
	System.out.println(this.toString+" : seq3 is "+seq3 );
}
String issu_dt3 = req.getParameter("issu_dt3");
if( issu_dt3 == null){
	System.out.println(this.toString+" : issu_dt3 is null" );
}else{
	System.out.println(this.toString+" : issu_dt3 is "+issu_dt3 );
}
String prt_dt3 = req.getParameter("prt_dt3");
if( prt_dt3 == null){
	System.out.println(this.toString+" : prt_dt3 is null" );
}else{
	System.out.println(this.toString+" : prt_dt3 is "+prt_dt3 );
}
String fac_clsf3 = req.getParameter("fac_clsf3");
if( fac_clsf3 == null){
	System.out.println(this.toString+" : fac_clsf3 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf3 is "+fac_clsf3 );
}
String medi_cd3 = req.getParameter("medi_cd3");
if( medi_cd3 == null){
	System.out.println(this.toString+" : medi_cd3 is null" );
}else{
	System.out.println(this.toString+" : medi_cd3 is "+medi_cd3 );
}
String sect_cd3 = req.getParameter("sect_cd3");
if( sect_cd3 == null){
	System.out.println(this.toString+" : sect_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_cd3 is "+sect_cd3 );
}
String prt_clsf3 = req.getParameter("prt_clsf3");
if( prt_clsf3 == null){
	System.out.println(this.toString+" : prt_clsf3 is null" );
}else{
	System.out.println(this.toString+" : prt_clsf3 is "+prt_clsf3 );
}
String pap_std3 = req.getParameter("pap_std3");
if( pap_std3 == null){
	System.out.println(this.toString+" : pap_std3 is null" );
}else{
	System.out.println(this.toString+" : pap_std3 is "+pap_std3 );
}
String papcmpy_cd3 = req.getParameter("papcmpy_cd3");
if( papcmpy_cd3 == null){
	System.out.println(this.toString+" : papcmpy_cd3 is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd3 is "+papcmpy_cd3 );
}
String issu_pcnt3 = req.getParameter("issu_pcnt3");
if( issu_pcnt3 == null){
	System.out.println(this.toString+" : issu_pcnt3 is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt3 is "+issu_pcnt3 );
}
String bw_pcnt3 = req.getParameter("bw_pcnt3");
if( bw_pcnt3 == null){
	System.out.println(this.toString+" : bw_pcnt3 is null" );
}else{
	System.out.println(this.toString+" : bw_pcnt3 is "+bw_pcnt3 );
}
String clr_pcnt3 = req.getParameter("clr_pcnt3");
if( clr_pcnt3 == null){
	System.out.println(this.toString+" : clr_pcnt3 is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt3 is "+clr_pcnt3 );
}
String slip_qty3 = req.getParameter("slip_qty3");
if( slip_qty3 == null){
	System.out.println(this.toString+" : slip_qty3 is null" );
}else{
	System.out.println(this.toString+" : slip_qty3 is "+slip_qty3 );
}
String is_cnt_ex_yn3 = req.getParameter("is_cnt_ex_yn3");
if( is_cnt_ex_yn3 == null){
	System.out.println(this.toString+" : is_cnt_ex_yn3 is null" );
}else{
	System.out.println(this.toString+" : is_cnt_ex_yn3 is "+is_cnt_ex_yn3 );
}
String is_qty_inc_yn3 = req.getParameter("is_qty_inc_yn3");
if( is_qty_inc_yn3 == null){
	System.out.println(this.toString+" : is_qty_inc_yn3 is null" );
}else{
	System.out.println(this.toString+" : is_qty_inc_yn3 is "+is_qty_inc_yn3 );
}
String add_prt_seq3 = req.getParameter("add_prt_seq3");
if( add_prt_seq3 == null){
	System.out.println(this.toString+" : add_prt_seq3 is null" );
}else{
	System.out.println(this.toString+" : add_prt_seq3 is "+add_prt_seq3 );
}
String dual_out_clsf3 = req.getParameter("dual_out_clsf3");
if( dual_out_clsf3 == null){
	System.out.println(this.toString+" : dual_out_clsf3 is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf3 is "+dual_out_clsf3 );
}
String duty_ovt_prt_yn3 = req.getParameter("duty_ovt_prt_yn3");
if( duty_ovt_prt_yn3 == null){
	System.out.println(this.toString+" : duty_ovt_prt_yn3 is null" );
}else{
	System.out.println(this.toString+" : duty_ovt_prt_yn3 is "+duty_ovt_prt_yn3 );
}
String remk3 = req.getParameter("remk3");
if( remk3 == null){
	System.out.println(this.toString+" : remk3 is null" );
}else{
	System.out.println(this.toString+" : remk3 is "+remk3 );
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

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
String pap_std = Util.checkString(req.getParameter("pap_std"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String slip_qty = Util.checkString(req.getParameter("slip_qty"));
String is_cnt_ex_yn = Util.checkString(req.getParameter("is_cnt_ex_yn"));
String is_qty_inc_yn = Util.checkString(req.getParameter("is_qty_inc_yn"));
String add_prt_seq = Util.checkString(req.getParameter("add_prt_seq"));
String dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
String duty_ovt_prt_yn = Util.checkString(req.getParameter("duty_ovt_prt_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String gubun2 = Util.checkString(req.getParameter("gubun2"));
String occr_dt2 = Util.checkString(req.getParameter("occr_dt2"));
String seq2 = Util.checkString(req.getParameter("seq2"));
String issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
String prt_dt2 = Util.checkString(req.getParameter("prt_dt2"));
String fac_clsf2 = Util.checkString(req.getParameter("fac_clsf2"));
String medi_cd2 = Util.checkString(req.getParameter("medi_cd2"));
String sect_cd2 = Util.checkString(req.getParameter("sect_cd2"));
String prt_clsf2 = Util.checkString(req.getParameter("prt_clsf2"));
String pap_std2 = Util.checkString(req.getParameter("pap_std2"));
String issu_pcnt2 = Util.checkString(req.getParameter("issu_pcnt2"));
String bw_pcnt2 = Util.checkString(req.getParameter("bw_pcnt2"));
String clr_pcnt2 = Util.checkString(req.getParameter("clr_pcnt2"));
String slip_qty2 = Util.checkString(req.getParameter("slip_qty2"));
String is_cnt_ex_yn2 = Util.checkString(req.getParameter("is_cnt_ex_yn2"));
String is_qty_inc_yn2 = Util.checkString(req.getParameter("is_qty_inc_yn2"));
String remk2 = Util.checkString(req.getParameter("remk2"));
String gubun3 = Util.checkString(req.getParameter("gubun3"));
String occr_dt3 = Util.checkString(req.getParameter("occr_dt3"));
String seq3 = Util.checkString(req.getParameter("seq3"));
String issu_dt3 = Util.checkString(req.getParameter("issu_dt3"));
String prt_dt3 = Util.checkString(req.getParameter("prt_dt3"));
String fac_clsf3 = Util.checkString(req.getParameter("fac_clsf3"));
String medi_cd3 = Util.checkString(req.getParameter("medi_cd3"));
String sect_cd3 = Util.checkString(req.getParameter("sect_cd3"));
String prt_clsf3 = Util.checkString(req.getParameter("prt_clsf3"));
String pap_std3 = Util.checkString(req.getParameter("pap_std3"));
String papcmpy_cd3 = Util.checkString(req.getParameter("papcmpy_cd3"));
String issu_pcnt3 = Util.checkString(req.getParameter("issu_pcnt3"));
String bw_pcnt3 = Util.checkString(req.getParameter("bw_pcnt3"));
String clr_pcnt3 = Util.checkString(req.getParameter("clr_pcnt3"));
String slip_qty3 = Util.checkString(req.getParameter("slip_qty3"));
String is_cnt_ex_yn3 = Util.checkString(req.getParameter("is_cnt_ex_yn3"));
String is_qty_inc_yn3 = Util.checkString(req.getParameter("is_qty_inc_yn3"));
String add_prt_seq3 = Util.checkString(req.getParameter("add_prt_seq3"));
String dual_out_clsf3 = Util.checkString(req.getParameter("dual_out_clsf3"));
String duty_ovt_prt_yn3 = Util.checkString(req.getParameter("duty_ovt_prt_yn3"));
String remk3 = Util.checkString(req.getParameter("remk3"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String prt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf")));
String pap_std = Util.Uni2Ksc(Util.checkString(req.getParameter("pap_std")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String slip_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty")));
String is_cnt_ex_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("is_cnt_ex_yn")));
String is_qty_inc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("is_qty_inc_yn")));
String add_prt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("add_prt_seq")));
String dual_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf")));
String duty_ovt_prt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_ovt_prt_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String gubun2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun2")));
String occr_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt2")));
String seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq2")));
String issu_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt2")));
String prt_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt2")));
String fac_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf2")));
String medi_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd2")));
String sect_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd2")));
String prt_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf2")));
String pap_std2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pap_std2")));
String issu_pcnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt2")));
String bw_pcnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt2")));
String clr_pcnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt2")));
String slip_qty2 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty2")));
String is_cnt_ex_yn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("is_cnt_ex_yn2")));
String is_qty_inc_yn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("is_qty_inc_yn2")));
String remk2 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk2")));
String gubun3 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun3")));
String occr_dt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt3")));
String seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq3")));
String issu_dt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt3")));
String prt_dt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt3")));
String fac_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf3")));
String medi_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd3")));
String sect_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd3")));
String prt_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf3")));
String pap_std3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pap_std3")));
String papcmpy_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd3")));
String issu_pcnt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt3")));
String bw_pcnt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt3")));
String clr_pcnt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt3")));
String slip_qty3 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty3")));
String is_cnt_ex_yn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("is_cnt_ex_yn3")));
String is_qty_inc_yn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("is_qty_inc_yn3")));
String add_prt_seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_prt_seq3")));
String dual_out_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf3")));
String duty_ovt_prt_yn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_ovt_prt_yn3")));
String remk3 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk3")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIssu_dt(issu_dt);
dm.setPrt_dt(prt_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setPrt_clsf(prt_clsf);
dm.setPap_std(pap_std);
dm.setIssu_pcnt(issu_pcnt);
dm.setBw_pcnt(bw_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setSlip_qty(slip_qty);
dm.setIs_cnt_ex_yn(is_cnt_ex_yn);
dm.setIs_qty_inc_yn(is_qty_inc_yn);
dm.setAdd_prt_seq(add_prt_seq);
dm.setDual_out_clsf(dual_out_clsf);
dm.setDuty_ovt_prt_yn(duty_ovt_prt_yn);
dm.setRemk(remk);
dm.setGubun2(gubun2);
dm.setOccr_dt2(occr_dt2);
dm.setSeq2(seq2);
dm.setIssu_dt2(issu_dt2);
dm.setPrt_dt2(prt_dt2);
dm.setFac_clsf2(fac_clsf2);
dm.setMedi_cd2(medi_cd2);
dm.setSect_cd2(sect_cd2);
dm.setPrt_clsf2(prt_clsf2);
dm.setPap_std2(pap_std2);
dm.setIssu_pcnt2(issu_pcnt2);
dm.setBw_pcnt2(bw_pcnt2);
dm.setClr_pcnt2(clr_pcnt2);
dm.setSlip_qty2(slip_qty2);
dm.setIs_cnt_ex_yn2(is_cnt_ex_yn2);
dm.setIs_qty_inc_yn2(is_qty_inc_yn2);
dm.setRemk2(remk2);
dm.setGubun3(gubun3);
dm.setOccr_dt3(occr_dt3);
dm.setSeq3(seq3);
dm.setIssu_dt3(issu_dt3);
dm.setPrt_dt3(prt_dt3);
dm.setFac_clsf3(fac_clsf3);
dm.setMedi_cd3(medi_cd3);
dm.setSect_cd3(sect_cd3);
dm.setPrt_clsf3(prt_clsf3);
dm.setPap_std3(pap_std3);
dm.setPapcmpy_cd3(papcmpy_cd3);
dm.setIssu_pcnt3(issu_pcnt3);
dm.setBw_pcnt3(bw_pcnt3);
dm.setClr_pcnt3(clr_pcnt3);
dm.setSlip_qty3(slip_qty3);
dm.setIs_cnt_ex_yn3(is_cnt_ex_yn3);
dm.setIs_qty_inc_yn3(is_qty_inc_yn3);
dm.setAdd_prt_seq3(add_prt_seq3);
dm.setDual_out_clsf3(dual_out_clsf3);
dm.setDuty_ovt_prt_yn3(duty_ovt_prt_yn3);
dm.setRemk3(remk3);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 03 16:03:32 KST 2009 */