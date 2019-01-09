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


package chosun.ciis.mt.submatrstok.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrstok.ds.*;
import chosun.ciis.mt.submatrstok.rec.*;

/**
 * 
 */


public class MT_SUBMATRSTOK_1120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String sect_cd;
	public String issu_pcnt;
	public String bw_pcnt;
	public String clr_pcnt;
	public String slip_qty;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String real_prt_qty;
	public String err_tms;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	
	public String gubun2;
	public String cmpy_cd2;
	public String occr_dt2;
	public String seq2;
	public String fac_clsf2;

	public String ewh_wgt;
	public String jego_wgt;
	public String ewh_roll;
	public String jego_roll;
	public String matr_cd;

	public MT_SUBMATRSTOK_1120_ADM(){}
	public MT_SUBMATRSTOK_1120_ADM(String gubun, String cmpy_cd, String occr_dt, String seq, String fac_clsf, String sect_cd, String issu_pcnt, String bw_pcnt, String clr_pcnt, String slip_qty, String prt_bgn_tm, String prt_end_tm, String real_prt_qty, String err_tms, String incmg_pers_ipaddr, String incmg_pers, String gubun2, String cmpy_cd2, String occr_dt2, String seq2, String fac_clsf2, String ewh_wgt, String jego_wgt, String ewh_roll, String jego_roll, String matr_cd){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.fac_clsf = fac_clsf;
		this.sect_cd = sect_cd;
		this.issu_pcnt = issu_pcnt;
		this.bw_pcnt = bw_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.slip_qty = slip_qty;
		this.prt_bgn_tm = prt_bgn_tm;
		this.prt_end_tm = prt_end_tm;
		this.real_prt_qty = real_prt_qty;
		this.err_tms = err_tms;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		
		this.gubun2 = gubun2;
		this.cmpy_cd2 = cmpy_cd2;
		this.occr_dt2 = occr_dt2;
		this.seq2 = seq2;
		this.fac_clsf2 = fac_clsf2;
		this.ewh_wgt = ewh_wgt;
		this.jego_wgt = jego_wgt;
		this.ewh_roll = ewh_roll;
		this.jego_roll = jego_roll;
		this.matr_cd = matr_cd;
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

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
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

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setReal_prt_qty(String real_prt_qty){
		this.real_prt_qty = real_prt_qty;
	}

	public void setErr_tms(String err_tms){
		this.err_tms = err_tms;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	
	public void setGubun2(String gubun2){
		this.gubun2 = gubun2;
	}

	public void setCmpy_cd2(String cmpy_cd2){
		this.cmpy_cd2 = cmpy_cd2;
	}

	public void setOccr_dt2(String occr_dt2){
		this.occr_dt2 = occr_dt2;
	}

	public void setSeq2(String seq2){
		this.seq2 = seq2;
	}

	public void setFac_clsf2(String fac_clsf2){
		this.fac_clsf2 = fac_clsf2;
	}
	
	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setJego_wgt(String jego_wgt){
		this.jego_wgt = jego_wgt;
	}
	
	public void setEwh_roll(String ewh_roll){
		this.ewh_roll = ewh_roll;
	}

	public void setJego_roll(String jego_roll){
		this.jego_roll = jego_roll;
	}
	
	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
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

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSect_cd(){
		return this.sect_cd;
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

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getReal_prt_qty(){
		return this.real_prt_qty;
	}

	public String getErr_tms(){
		return this.err_tms;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
	
	public String getGubun2(){
		return this.gubun2;
	}

	public String getCmpy_cd2(){
		return this.cmpy_cd2;
	}

	public String getOccr_dt2(){
		return this.occr_dt2;
	}

	public String getSeq2(){
		return this.seq2;
	}

	public String getFac_clsf2(){
		return this.fac_clsf2;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getJego_wgt(){
		return this.jego_wgt;
	}

	public String getEwh_roll(){
		return this.ewh_roll;
	}

	public String getJego_roll(){
		return this.jego_roll;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}
	

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRSTOK_1120_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRSTOK_1120_ADM dm = (MT_SUBMATRSTOK_1120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.sect_cd);
		cstmt.setString(9, dm.issu_pcnt);
		cstmt.setString(10, dm.bw_pcnt);
		cstmt.setString(11, dm.clr_pcnt);
		cstmt.setString(12, dm.slip_qty);
		cstmt.setString(13, dm.prt_bgn_tm);
		cstmt.setString(14, dm.prt_end_tm);
		cstmt.setString(15, dm.real_prt_qty);
		cstmt.setString(16, dm.err_tms);
		cstmt.setString(17, dm.incmg_pers_ipaddr);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.gubun2);
		cstmt.setString(20, dm.cmpy_cd2);
		cstmt.setString(21, dm.occr_dt2);
		cstmt.setString(22, dm.seq2);
		cstmt.setString(23, dm.fac_clsf2);
		cstmt.setString(24, dm.ewh_wgt);
		cstmt.setString(25, dm.jego_wgt);
		cstmt.setString(26, dm.ewh_roll);
		cstmt.setString(27, dm.jego_roll);
		cstmt.setString(28, dm.matr_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrstok.ds.MT_SUBMATRSTOK_1120_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("bw_pcnt = [" + getBw_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("slip_qty = [" + getSlip_qty() + "]");
		System.out.println("prt_bgn_tm = [" + getPrt_bgn_tm() + "]");
		System.out.println("prt_end_tm = [" + getPrt_end_tm() + "]");
		System.out.println("real_prt_qty = [" + getReal_prt_qty() + "]");
		System.out.println("err_tms = [" + getErr_tms() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun2 = [" + getGubun2() + "]");
		System.out.println("cmpy_cd2 = [" + getCmpy_cd2() + "]");
		System.out.println("occr_dt2 = [" + getOccr_dt2() + "]");
		System.out.println("seq2 = [" + getSeq2() + "]");
		System.out.println("fac_clsf2 = [" + getFac_clsf2() + "]");
		System.out.println("ewh_wgt = [" + getEwh_wgt() + "]");
		System.out.println("jego_wgt = [" + getJego_wgt() + "]");
		System.out.println("ewh_wgt = [" + getEwh_roll() + "]");
		System.out.println("jego_wgt = [" + getJego_roll() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
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
String prt_bgn_tm = req.getParameter("prt_bgn_tm");
if( prt_bgn_tm == null){
	System.out.println(this.toString+" : prt_bgn_tm is null" );
}else{
	System.out.println(this.toString+" : prt_bgn_tm is "+prt_bgn_tm );
}
String prt_end_tm = req.getParameter("prt_end_tm");
if( prt_end_tm == null){
	System.out.println(this.toString+" : prt_end_tm is null" );
}else{
	System.out.println(this.toString+" : prt_end_tm is "+prt_end_tm );
}
String real_prt_qty = req.getParameter("real_prt_qty");
if( real_prt_qty == null){
	System.out.println(this.toString+" : real_prt_qty is null" );
}else{
	System.out.println(this.toString+" : real_prt_qty is "+real_prt_qty );
}
String err_tms = req.getParameter("err_tms");
if( err_tms == null){
	System.out.println(this.toString+" : err_tms is null" );
}else{
	System.out.println(this.toString+" : err_tms is "+err_tms );
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
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String slip_qty = Util.checkString(req.getParameter("slip_qty"));
String prt_bgn_tm = Util.checkString(req.getParameter("prt_bgn_tm"));
String prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
String real_prt_qty = Util.checkString(req.getParameter("real_prt_qty"));
String err_tms = Util.checkString(req.getParameter("err_tms"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String slip_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty")));
String prt_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_bgn_tm")));
String prt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_end_tm")));
String real_prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("real_prt_qty")));
String err_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("err_tms")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFac_clsf(fac_clsf);
dm.setSect_cd(sect_cd);
dm.setIssu_pcnt(issu_pcnt);
dm.setBw_pcnt(bw_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setSlip_qty(slip_qty);
dm.setPrt_bgn_tm(prt_bgn_tm);
dm.setPrt_end_tm(prt_end_tm);
dm.setReal_prt_qty(real_prt_qty);
dm.setErr_tms(err_tms);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 08 10:46:03 KST 2013 */