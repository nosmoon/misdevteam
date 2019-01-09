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


public class PR_PRTEXEC_5090_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String gubun_s;
	public String occr_dt_s;
	public String seq_s;
	public String slip_qty_s;
	public String is_cnt_ex_yn_s;
	public String is_qty_inc_yn_s;
	public String remk_s;
	public String endgbn_s;
	public String gubun_h;
	public String occr_dt_h;
	public String seq_h;
	public String issu_dt_h;
	public String fac_clsf_h;
	public String medi_cd_h;
	public String sect_cd_h;
	public String hdqt_paper_clsf_h;
	public String pap_std_h;
	public String issu_pcnt_h;
	public String bw_pcnt_h;
	public String clr_pcnt_h;
	public String slip_qty_h;
	public String remk_h;
	public String endgbn_h;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public PR_PRTEXEC_5090_ADM(){}
	public PR_PRTEXEC_5090_ADM(String cmpy_cd, String gubun_s, String occr_dt_s, String seq_s, String slip_qty_s, String is_cnt_ex_yn_s, String is_qty_inc_yn_s, String remk_s, String endgbn_s, String gubun_h, String occr_dt_h, String seq_h, String issu_dt_h, String fac_clsf_h, String medi_cd_h, String sect_cd_h, String hdqt_paper_clsf_h, String pap_std_h, String issu_pcnt_h, String bw_pcnt_h, String clr_pcnt_h, String slip_qty_h, String remk_h, String endgbn_h, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.cmpy_cd = cmpy_cd;
		this.gubun_s = gubun_s;
		this.occr_dt_s = occr_dt_s;
		this.seq_s = seq_s;
		this.slip_qty_s = slip_qty_s;
		this.is_cnt_ex_yn_s = is_cnt_ex_yn_s;
		this.is_qty_inc_yn_s = is_qty_inc_yn_s;
		this.remk_s = remk_s;
		this.endgbn_s = endgbn_s;
		this.gubun_h = gubun_h;
		this.occr_dt_h = occr_dt_h;
		this.seq_h = seq_h;
		this.issu_dt_h = issu_dt_h;
		this.fac_clsf_h = fac_clsf_h;
		this.medi_cd_h = medi_cd_h;
		this.sect_cd_h = sect_cd_h;
		this.hdqt_paper_clsf_h = hdqt_paper_clsf_h;
		this.pap_std_h = pap_std_h;
		this.issu_pcnt_h = issu_pcnt_h;
		this.bw_pcnt_h = bw_pcnt_h;
		this.clr_pcnt_h = clr_pcnt_h;
		this.slip_qty_h = slip_qty_h;
		this.remk_h = remk_h;
		this.endgbn_h = endgbn_h;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setGubun_s(String gubun_s){
		this.gubun_s = gubun_s;
	}

	public void setOccr_dt_s(String occr_dt_s){
		this.occr_dt_s = occr_dt_s;
	}

	public void setSeq_s(String seq_s){
		this.seq_s = seq_s;
	}

	public void setSlip_qty_s(String slip_qty_s){
		this.slip_qty_s = slip_qty_s;
	}

	public void setIs_cnt_ex_yn_s(String is_cnt_ex_yn_s){
		this.is_cnt_ex_yn_s = is_cnt_ex_yn_s;
	}

	public void setIs_qty_inc_yn_s(String is_qty_inc_yn_s){
		this.is_qty_inc_yn_s = is_qty_inc_yn_s;
	}

	public void setRemk_s(String remk_s){
		this.remk_s = remk_s;
	}

	public void setEndgbn_s(String endgbn_s){
		this.endgbn_s = endgbn_s;
	}

	public void setGubun_h(String gubun_h){
		this.gubun_h = gubun_h;
	}

	public void setOccr_dt_h(String occr_dt_h){
		this.occr_dt_h = occr_dt_h;
	}

	public void setSeq_h(String seq_h){
		this.seq_h = seq_h;
	}

	public void setIssu_dt_h(String issu_dt_h){
		this.issu_dt_h = issu_dt_h;
	}

	public void setFac_clsf_h(String fac_clsf_h){
		this.fac_clsf_h = fac_clsf_h;
	}

	public void setMedi_cd_h(String medi_cd_h){
		this.medi_cd_h = medi_cd_h;
	}

	public void setSect_cd_h(String sect_cd_h){
		this.sect_cd_h = sect_cd_h;
	}

	public void setHdqt_paper_clsf_h(String hdqt_paper_clsf_h){
		this.hdqt_paper_clsf_h = hdqt_paper_clsf_h;
	}

	public void setPap_std_h(String pap_std_h){
		this.pap_std_h = pap_std_h;
	}

	public void setIssu_pcnt_h(String issu_pcnt_h){
		this.issu_pcnt_h = issu_pcnt_h;
	}

	public void setBw_pcnt_h(String bw_pcnt_h){
		this.bw_pcnt_h = bw_pcnt_h;
	}

	public void setClr_pcnt_h(String clr_pcnt_h){
		this.clr_pcnt_h = clr_pcnt_h;
	}

	public void setSlip_qty_h(String slip_qty_h){
		this.slip_qty_h = slip_qty_h;
	}

	public void setRemk_h(String remk_h){
		this.remk_h = remk_h;
	}

	public void setEndgbn_h(String endgbn_h){
		this.endgbn_h = endgbn_h;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getGubun_s(){
		return this.gubun_s;
	}

	public String getOccr_dt_s(){
		return this.occr_dt_s;
	}

	public String getSeq_s(){
		return this.seq_s;
	}

	public String getSlip_qty_s(){
		return this.slip_qty_s;
	}

	public String getIs_cnt_ex_yn_s(){
		return this.is_cnt_ex_yn_s;
	}

	public String getIs_qty_inc_yn_s(){
		return this.is_qty_inc_yn_s;
	}

	public String getRemk_s(){
		return this.remk_s;
	}

	public String getEndgbn_s(){
		return this.endgbn_s;
	}

	public String getGubun_h(){
		return this.gubun_h;
	}

	public String getOccr_dt_h(){
		return this.occr_dt_h;
	}

	public String getSeq_h(){
		return this.seq_h;
	}

	public String getIssu_dt_h(){
		return this.issu_dt_h;
	}

	public String getFac_clsf_h(){
		return this.fac_clsf_h;
	}

	public String getMedi_cd_h(){
		return this.medi_cd_h;
	}

	public String getSect_cd_h(){
		return this.sect_cd_h;
	}

	public String getHdqt_paper_clsf_h(){
		return this.hdqt_paper_clsf_h;
	}

	public String getPap_std_h(){
		return this.pap_std_h;
	}

	public String getIssu_pcnt_h(){
		return this.issu_pcnt_h;
	}

	public String getBw_pcnt_h(){
		return this.bw_pcnt_h;
	}

	public String getClr_pcnt_h(){
		return this.clr_pcnt_h;
	}

	public String getSlip_qty_h(){
		return this.slip_qty_h;
	}

	public String getRemk_h(){
		return this.remk_h;
	}

	public String getEndgbn_h(){
		return this.endgbn_h;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_5090_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_5090_ADM dm = (PR_PRTEXEC_5090_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.gubun_s);
		cstmt.setString(5, dm.occr_dt_s);
		cstmt.setString(6, dm.seq_s);
		cstmt.setString(7, dm.slip_qty_s);
		cstmt.setString(8, dm.is_cnt_ex_yn_s);
		cstmt.setString(9, dm.is_qty_inc_yn_s);
		cstmt.setString(10, dm.remk_s);
		cstmt.setString(11, dm.endgbn_s);
		cstmt.setString(12, dm.gubun_h);
		cstmt.setString(13, dm.occr_dt_h);
		cstmt.setString(14, dm.seq_h);
		cstmt.setString(15, dm.issu_dt_h);
		cstmt.setString(16, dm.fac_clsf_h);
		cstmt.setString(17, dm.medi_cd_h);
		cstmt.setString(18, dm.sect_cd_h);
		cstmt.setString(19, dm.hdqt_paper_clsf_h);
		cstmt.setString(20, dm.pap_std_h);
		cstmt.setString(21, dm.issu_pcnt_h);
		cstmt.setString(22, dm.bw_pcnt_h);
		cstmt.setString(23, dm.clr_pcnt_h);
		cstmt.setString(24, dm.slip_qty_h);
		cstmt.setString(25, dm.remk_h);
		cstmt.setString(26, dm.endgbn_h);
		cstmt.setString(27, dm.incmg_pers_ipaddr);
		cstmt.setString(28, dm.incmg_pers);
		cstmt.setString(29, dm.incmg_dt_tm);
		cstmt.setString(30, dm.chg_pers);
		cstmt.setString(31, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_5090_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("gubun_s = [" + getGubun_s() + "]");
		System.out.println("occr_dt_s = [" + getOccr_dt_s() + "]");
		System.out.println("seq_s = [" + getSeq_s() + "]");
		System.out.println("slip_qty_s = [" + getSlip_qty_s() + "]");
		System.out.println("is_cnt_ex_yn_s = [" + getIs_cnt_ex_yn_s() + "]");
		System.out.println("is_qty_inc_yn_s = [" + getIs_qty_inc_yn_s() + "]");
		System.out.println("remk_s = [" + getRemk_s() + "]");
		System.out.println("endgbn_s = [" + getEndgbn_s() + "]");
		System.out.println("gubun_h = [" + getGubun_h() + "]");
		System.out.println("occr_dt_h = [" + getOccr_dt_h() + "]");
		System.out.println("seq_h = [" + getSeq_h() + "]");
		System.out.println("issu_dt_h = [" + getIssu_dt_h() + "]");
		System.out.println("fac_clsf_h = [" + getFac_clsf_h() + "]");
		System.out.println("medi_cd_h = [" + getMedi_cd_h() + "]");
		System.out.println("sect_cd_h = [" + getSect_cd_h() + "]");
		System.out.println("hdqt_paper_clsf_h = [" + getHdqt_paper_clsf_h() + "]");
		System.out.println("pap_std_h = [" + getPap_std_h() + "]");
		System.out.println("issu_pcnt_h = [" + getIssu_pcnt_h() + "]");
		System.out.println("bw_pcnt_h = [" + getBw_pcnt_h() + "]");
		System.out.println("clr_pcnt_h = [" + getClr_pcnt_h() + "]");
		System.out.println("slip_qty_h = [" + getSlip_qty_h() + "]");
		System.out.println("remk_h = [" + getRemk_h() + "]");
		System.out.println("endgbn_h = [" + getEndgbn_h() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
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
String gubun_s = req.getParameter("gubun_s");
if( gubun_s == null){
	System.out.println(this.toString+" : gubun_s is null" );
}else{
	System.out.println(this.toString+" : gubun_s is "+gubun_s );
}
String occr_dt_s = req.getParameter("occr_dt_s");
if( occr_dt_s == null){
	System.out.println(this.toString+" : occr_dt_s is null" );
}else{
	System.out.println(this.toString+" : occr_dt_s is "+occr_dt_s );
}
String seq_s = req.getParameter("seq_s");
if( seq_s == null){
	System.out.println(this.toString+" : seq_s is null" );
}else{
	System.out.println(this.toString+" : seq_s is "+seq_s );
}
String slip_qty_s = req.getParameter("slip_qty_s");
if( slip_qty_s == null){
	System.out.println(this.toString+" : slip_qty_s is null" );
}else{
	System.out.println(this.toString+" : slip_qty_s is "+slip_qty_s );
}
String is_cnt_ex_yn_s = req.getParameter("is_cnt_ex_yn_s");
if( is_cnt_ex_yn_s == null){
	System.out.println(this.toString+" : is_cnt_ex_yn_s is null" );
}else{
	System.out.println(this.toString+" : is_cnt_ex_yn_s is "+is_cnt_ex_yn_s );
}
String is_qty_inc_yn_s = req.getParameter("is_qty_inc_yn_s");
if( is_qty_inc_yn_s == null){
	System.out.println(this.toString+" : is_qty_inc_yn_s is null" );
}else{
	System.out.println(this.toString+" : is_qty_inc_yn_s is "+is_qty_inc_yn_s );
}
String remk_s = req.getParameter("remk_s");
if( remk_s == null){
	System.out.println(this.toString+" : remk_s is null" );
}else{
	System.out.println(this.toString+" : remk_s is "+remk_s );
}
String endgbn_s = req.getParameter("endgbn_s");
if( endgbn_s == null){
	System.out.println(this.toString+" : endgbn_s is null" );
}else{
	System.out.println(this.toString+" : endgbn_s is "+endgbn_s );
}
String gubun_h = req.getParameter("gubun_h");
if( gubun_h == null){
	System.out.println(this.toString+" : gubun_h is null" );
}else{
	System.out.println(this.toString+" : gubun_h is "+gubun_h );
}
String occr_dt_h = req.getParameter("occr_dt_h");
if( occr_dt_h == null){
	System.out.println(this.toString+" : occr_dt_h is null" );
}else{
	System.out.println(this.toString+" : occr_dt_h is "+occr_dt_h );
}
String seq_h = req.getParameter("seq_h");
if( seq_h == null){
	System.out.println(this.toString+" : seq_h is null" );
}else{
	System.out.println(this.toString+" : seq_h is "+seq_h );
}
String issu_dt_h = req.getParameter("issu_dt_h");
if( issu_dt_h == null){
	System.out.println(this.toString+" : issu_dt_h is null" );
}else{
	System.out.println(this.toString+" : issu_dt_h is "+issu_dt_h );
}
String fac_clsf_h = req.getParameter("fac_clsf_h");
if( fac_clsf_h == null){
	System.out.println(this.toString+" : fac_clsf_h is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_h is "+fac_clsf_h );
}
String medi_cd_h = req.getParameter("medi_cd_h");
if( medi_cd_h == null){
	System.out.println(this.toString+" : medi_cd_h is null" );
}else{
	System.out.println(this.toString+" : medi_cd_h is "+medi_cd_h );
}
String sect_cd_h = req.getParameter("sect_cd_h");
if( sect_cd_h == null){
	System.out.println(this.toString+" : sect_cd_h is null" );
}else{
	System.out.println(this.toString+" : sect_cd_h is "+sect_cd_h );
}
String hdqt_paper_clsf_h = req.getParameter("hdqt_paper_clsf_h");
if( hdqt_paper_clsf_h == null){
	System.out.println(this.toString+" : hdqt_paper_clsf_h is null" );
}else{
	System.out.println(this.toString+" : hdqt_paper_clsf_h is "+hdqt_paper_clsf_h );
}
String pap_std_h = req.getParameter("pap_std_h");
if( pap_std_h == null){
	System.out.println(this.toString+" : pap_std_h is null" );
}else{
	System.out.println(this.toString+" : pap_std_h is "+pap_std_h );
}
String issu_pcnt_h = req.getParameter("issu_pcnt_h");
if( issu_pcnt_h == null){
	System.out.println(this.toString+" : issu_pcnt_h is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt_h is "+issu_pcnt_h );
}
String bw_pcnt_h = req.getParameter("bw_pcnt_h");
if( bw_pcnt_h == null){
	System.out.println(this.toString+" : bw_pcnt_h is null" );
}else{
	System.out.println(this.toString+" : bw_pcnt_h is "+bw_pcnt_h );
}
String clr_pcnt_h = req.getParameter("clr_pcnt_h");
if( clr_pcnt_h == null){
	System.out.println(this.toString+" : clr_pcnt_h is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt_h is "+clr_pcnt_h );
}
String slip_qty_h = req.getParameter("slip_qty_h");
if( slip_qty_h == null){
	System.out.println(this.toString+" : slip_qty_h is null" );
}else{
	System.out.println(this.toString+" : slip_qty_h is "+slip_qty_h );
}
String remk_h = req.getParameter("remk_h");
if( remk_h == null){
	System.out.println(this.toString+" : remk_h is null" );
}else{
	System.out.println(this.toString+" : remk_h is "+remk_h );
}
String endgbn_h = req.getParameter("endgbn_h");
if( endgbn_h == null){
	System.out.println(this.toString+" : endgbn_h is null" );
}else{
	System.out.println(this.toString+" : endgbn_h is "+endgbn_h );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String gubun_s = Util.checkString(req.getParameter("gubun_s"));
String occr_dt_s = Util.checkString(req.getParameter("occr_dt_s"));
String seq_s = Util.checkString(req.getParameter("seq_s"));
String slip_qty_s = Util.checkString(req.getParameter("slip_qty_s"));
String is_cnt_ex_yn_s = Util.checkString(req.getParameter("is_cnt_ex_yn_s"));
String is_qty_inc_yn_s = Util.checkString(req.getParameter("is_qty_inc_yn_s"));
String remk_s = Util.checkString(req.getParameter("remk_s"));
String endgbn_s = Util.checkString(req.getParameter("endgbn_s"));
String gubun_h = Util.checkString(req.getParameter("gubun_h"));
String occr_dt_h = Util.checkString(req.getParameter("occr_dt_h"));
String seq_h = Util.checkString(req.getParameter("seq_h"));
String issu_dt_h = Util.checkString(req.getParameter("issu_dt_h"));
String fac_clsf_h = Util.checkString(req.getParameter("fac_clsf_h"));
String medi_cd_h = Util.checkString(req.getParameter("medi_cd_h"));
String sect_cd_h = Util.checkString(req.getParameter("sect_cd_h"));
String hdqt_paper_clsf_h = Util.checkString(req.getParameter("hdqt_paper_clsf_h"));
String pap_std_h = Util.checkString(req.getParameter("pap_std_h"));
String issu_pcnt_h = Util.checkString(req.getParameter("issu_pcnt_h"));
String bw_pcnt_h = Util.checkString(req.getParameter("bw_pcnt_h"));
String clr_pcnt_h = Util.checkString(req.getParameter("clr_pcnt_h"));
String slip_qty_h = Util.checkString(req.getParameter("slip_qty_h"));
String remk_h = Util.checkString(req.getParameter("remk_h"));
String endgbn_h = Util.checkString(req.getParameter("endgbn_h"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String gubun_s = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_s")));
String occr_dt_s = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_s")));
String seq_s = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_s")));
String slip_qty_s = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty_s")));
String is_cnt_ex_yn_s = Util.Uni2Ksc(Util.checkString(req.getParameter("is_cnt_ex_yn_s")));
String is_qty_inc_yn_s = Util.Uni2Ksc(Util.checkString(req.getParameter("is_qty_inc_yn_s")));
String remk_s = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_s")));
String endgbn_s = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_s")));
String gubun_h = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_h")));
String occr_dt_h = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_h")));
String seq_h = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_h")));
String issu_dt_h = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_h")));
String fac_clsf_h = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_h")));
String medi_cd_h = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_h")));
String sect_cd_h = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_h")));
String hdqt_paper_clsf_h = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_paper_clsf_h")));
String pap_std_h = Util.Uni2Ksc(Util.checkString(req.getParameter("pap_std_h")));
String issu_pcnt_h = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt_h")));
String bw_pcnt_h = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt_h")));
String clr_pcnt_h = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt_h")));
String slip_qty_h = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty_h")));
String remk_h = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_h")));
String endgbn_h = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_h")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setGubun_s(gubun_s);
dm.setOccr_dt_s(occr_dt_s);
dm.setSeq_s(seq_s);
dm.setSlip_qty_s(slip_qty_s);
dm.setIs_cnt_ex_yn_s(is_cnt_ex_yn_s);
dm.setIs_qty_inc_yn_s(is_qty_inc_yn_s);
dm.setRemk_s(remk_s);
dm.setEndgbn_s(endgbn_s);
dm.setGubun_h(gubun_h);
dm.setOccr_dt_h(occr_dt_h);
dm.setSeq_h(seq_h);
dm.setIssu_dt_h(issu_dt_h);
dm.setFac_clsf_h(fac_clsf_h);
dm.setMedi_cd_h(medi_cd_h);
dm.setSect_cd_h(sect_cd_h);
dm.setHdqt_paper_clsf_h(hdqt_paper_clsf_h);
dm.setPap_std_h(pap_std_h);
dm.setIssu_pcnt_h(issu_pcnt_h);
dm.setBw_pcnt_h(bw_pcnt_h);
dm.setClr_pcnt_h(clr_pcnt_h);
dm.setSlip_qty_h(slip_qty_h);
dm.setRemk_h(remk_h);
dm.setEndgbn_h(endgbn_h);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 21:15:43 KST 2009 */