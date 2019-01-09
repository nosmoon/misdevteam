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


public class PR_PRTEXEC_7010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String prt_dt;
	public String fac_clsf;
	public String medi_cd;
	public String ecnt;
	public String advt_clr_pcnt;
	public String advt_bw_pcnt;
	public String atic_clr_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String prv_side_advt_clr_pcnt;
	public String prv_side_advt_bw_pcnt;
	public String wht_pj_qty;
	public String blk_pj_qty;
	public String sect_nm;
	public String sect_cnt;
	public String sect_pcnt;
	public String sect_clr_pcnt;
	public String sect_bw_pcnt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public PR_PRTEXEC_7010_ADM(){}
	public PR_PRTEXEC_7010_ADM(String gubun, String cmpy_cd, String occr_dt, String seq, String prt_dt, String fac_clsf, String medi_cd, String ecnt, String advt_clr_pcnt, String advt_bw_pcnt, String atic_clr_pcnt, String clr_pcnt, String bw_pcnt, String prv_side_advt_clr_pcnt, String prv_side_advt_bw_pcnt, String wht_pj_qty, String blk_pj_qty, String sect_nm, String sect_cnt, String sect_pcnt, String sect_clr_pcnt, String sect_bw_pcnt, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.prt_dt = prt_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.ecnt = ecnt;
		this.advt_clr_pcnt = advt_clr_pcnt;
		this.advt_bw_pcnt = advt_bw_pcnt;
		this.atic_clr_pcnt = atic_clr_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.bw_pcnt = bw_pcnt;
		this.prv_side_advt_clr_pcnt = prv_side_advt_clr_pcnt;
		this.prv_side_advt_bw_pcnt = prv_side_advt_bw_pcnt;
		this.wht_pj_qty = wht_pj_qty;
		this.blk_pj_qty = blk_pj_qty;
		this.sect_nm = sect_nm;
		this.sect_cnt = sect_cnt;
		this.sect_pcnt = sect_pcnt;
		this.sect_clr_pcnt = sect_clr_pcnt;
		this.sect_bw_pcnt = sect_bw_pcnt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
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

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setAdvt_clr_pcnt(String advt_clr_pcnt){
		this.advt_clr_pcnt = advt_clr_pcnt;
	}

	public void setAdvt_bw_pcnt(String advt_bw_pcnt){
		this.advt_bw_pcnt = advt_bw_pcnt;
	}

	public void setAtic_clr_pcnt(String atic_clr_pcnt){
		this.atic_clr_pcnt = atic_clr_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setPrv_side_advt_clr_pcnt(String prv_side_advt_clr_pcnt){
		this.prv_side_advt_clr_pcnt = prv_side_advt_clr_pcnt;
	}

	public void setPrv_side_advt_bw_pcnt(String prv_side_advt_bw_pcnt){
		this.prv_side_advt_bw_pcnt = prv_side_advt_bw_pcnt;
	}

	public void setWht_pj_qty(String wht_pj_qty){
		this.wht_pj_qty = wht_pj_qty;
	}

	public void setBlk_pj_qty(String blk_pj_qty){
		this.blk_pj_qty = blk_pj_qty;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setSect_cnt(String sect_cnt){
		this.sect_cnt = sect_cnt;
	}

	public void setSect_pcnt(String sect_pcnt){
		this.sect_pcnt = sect_pcnt;
	}

	public void setSect_clr_pcnt(String sect_clr_pcnt){
		this.sect_clr_pcnt = sect_clr_pcnt;
	}

	public void setSect_bw_pcnt(String sect_bw_pcnt){
		this.sect_bw_pcnt = sect_bw_pcnt;
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

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getAdvt_clr_pcnt(){
		return this.advt_clr_pcnt;
	}

	public String getAdvt_bw_pcnt(){
		return this.advt_bw_pcnt;
	}

	public String getAtic_clr_pcnt(){
		return this.atic_clr_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getPrv_side_advt_clr_pcnt(){
		return this.prv_side_advt_clr_pcnt;
	}

	public String getPrv_side_advt_bw_pcnt(){
		return this.prv_side_advt_bw_pcnt;
	}

	public String getWht_pj_qty(){
		return this.wht_pj_qty;
	}

	public String getBlk_pj_qty(){
		return this.blk_pj_qty;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getSect_cnt(){
		return this.sect_cnt;
	}

	public String getSect_pcnt(){
		return this.sect_pcnt;
	}

	public String getSect_clr_pcnt(){
		return this.sect_clr_pcnt;
	}

	public String getSect_bw_pcnt(){
		return this.sect_bw_pcnt;
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
		 return "{ call MISMAT.SP_PR_PRTEXEC_7010_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_7010_ADM dm = (PR_PRTEXEC_7010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.prt_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.ecnt);
		cstmt.setString(11, dm.advt_clr_pcnt);
		cstmt.setString(12, dm.advt_bw_pcnt);
		cstmt.setString(13, dm.atic_clr_pcnt);
		cstmt.setString(14, dm.clr_pcnt);
		cstmt.setString(15, dm.bw_pcnt);
		cstmt.setString(16, dm.prv_side_advt_clr_pcnt);
		cstmt.setString(17, dm.prv_side_advt_bw_pcnt);
		cstmt.setString(18, dm.wht_pj_qty);
		cstmt.setString(19, dm.blk_pj_qty);
		cstmt.setString(20, dm.sect_nm);
		cstmt.setString(21, dm.sect_cnt);
		cstmt.setString(22, dm.sect_pcnt);
		cstmt.setString(23, dm.sect_clr_pcnt);
		cstmt.setString(24, dm.sect_bw_pcnt);
		cstmt.setString(25, dm.incmg_pers_ipaddr);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.setString(27, dm.incmg_dt_tm);
		cstmt.setString(28, dm.chg_pers);
		cstmt.setString(29, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_7010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("ecnt = [" + getEcnt() + "]");
		System.out.println("advt_clr_pcnt = [" + getAdvt_clr_pcnt() + "]");
		System.out.println("advt_bw_pcnt = [" + getAdvt_bw_pcnt() + "]");
		System.out.println("atic_clr_pcnt = [" + getAtic_clr_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("bw_pcnt = [" + getBw_pcnt() + "]");
		System.out.println("prv_side_advt_clr_pcnt = [" + getPrv_side_advt_clr_pcnt() + "]");
		System.out.println("prv_side_advt_bw_pcnt = [" + getPrv_side_advt_bw_pcnt() + "]");
		System.out.println("wht_pj_qty = [" + getWht_pj_qty() + "]");
		System.out.println("blk_pj_qty = [" + getBlk_pj_qty() + "]");
		System.out.println("sect_nm = [" + getSect_nm() + "]");
		System.out.println("sect_cnt = [" + getSect_cnt() + "]");
		System.out.println("sect_pcnt = [" + getSect_pcnt() + "]");
		System.out.println("sect_clr_pcnt = [" + getSect_clr_pcnt() + "]");
		System.out.println("sect_bw_pcnt = [" + getSect_bw_pcnt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
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
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String advt_clr_pcnt = req.getParameter("advt_clr_pcnt");
if( advt_clr_pcnt == null){
	System.out.println(this.toString+" : advt_clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : advt_clr_pcnt is "+advt_clr_pcnt );
}
String advt_bw_pcnt = req.getParameter("advt_bw_pcnt");
if( advt_bw_pcnt == null){
	System.out.println(this.toString+" : advt_bw_pcnt is null" );
}else{
	System.out.println(this.toString+" : advt_bw_pcnt is "+advt_bw_pcnt );
}
String atic_clr_pcnt = req.getParameter("atic_clr_pcnt");
if( atic_clr_pcnt == null){
	System.out.println(this.toString+" : atic_clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : atic_clr_pcnt is "+atic_clr_pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
String bw_pcnt = req.getParameter("bw_pcnt");
if( bw_pcnt == null){
	System.out.println(this.toString+" : bw_pcnt is null" );
}else{
	System.out.println(this.toString+" : bw_pcnt is "+bw_pcnt );
}
String prv_side_advt_clr_pcnt = req.getParameter("prv_side_advt_clr_pcnt");
if( prv_side_advt_clr_pcnt == null){
	System.out.println(this.toString+" : prv_side_advt_clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : prv_side_advt_clr_pcnt is "+prv_side_advt_clr_pcnt );
}
String prv_side_advt_bw_pcnt = req.getParameter("prv_side_advt_bw_pcnt");
if( prv_side_advt_bw_pcnt == null){
	System.out.println(this.toString+" : prv_side_advt_bw_pcnt is null" );
}else{
	System.out.println(this.toString+" : prv_side_advt_bw_pcnt is "+prv_side_advt_bw_pcnt );
}
String wht_pj_qty = req.getParameter("wht_pj_qty");
if( wht_pj_qty == null){
	System.out.println(this.toString+" : wht_pj_qty is null" );
}else{
	System.out.println(this.toString+" : wht_pj_qty is "+wht_pj_qty );
}
String blk_pj_qty = req.getParameter("blk_pj_qty");
if( blk_pj_qty == null){
	System.out.println(this.toString+" : blk_pj_qty is null" );
}else{
	System.out.println(this.toString+" : blk_pj_qty is "+blk_pj_qty );
}
String sect_nm = req.getParameter("sect_nm");
if( sect_nm == null){
	System.out.println(this.toString+" : sect_nm is null" );
}else{
	System.out.println(this.toString+" : sect_nm is "+sect_nm );
}
String sect_cnt = req.getParameter("sect_cnt");
if( sect_cnt == null){
	System.out.println(this.toString+" : sect_cnt is null" );
}else{
	System.out.println(this.toString+" : sect_cnt is "+sect_cnt );
}
String sect_pcnt = req.getParameter("sect_pcnt");
if( sect_pcnt == null){
	System.out.println(this.toString+" : sect_pcnt is null" );
}else{
	System.out.println(this.toString+" : sect_pcnt is "+sect_pcnt );
}
String sect_clr_pcnt = req.getParameter("sect_clr_pcnt");
if( sect_clr_pcnt == null){
	System.out.println(this.toString+" : sect_clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : sect_clr_pcnt is "+sect_clr_pcnt );
}
String sect_bw_pcnt = req.getParameter("sect_bw_pcnt");
if( sect_bw_pcnt == null){
	System.out.println(this.toString+" : sect_bw_pcnt is null" );
}else{
	System.out.println(this.toString+" : sect_bw_pcnt is "+sect_bw_pcnt );
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

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String advt_clr_pcnt = Util.checkString(req.getParameter("advt_clr_pcnt"));
String advt_bw_pcnt = Util.checkString(req.getParameter("advt_bw_pcnt"));
String atic_clr_pcnt = Util.checkString(req.getParameter("atic_clr_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
String prv_side_advt_clr_pcnt = Util.checkString(req.getParameter("prv_side_advt_clr_pcnt"));
String prv_side_advt_bw_pcnt = Util.checkString(req.getParameter("prv_side_advt_bw_pcnt"));
String wht_pj_qty = Util.checkString(req.getParameter("wht_pj_qty"));
String blk_pj_qty = Util.checkString(req.getParameter("blk_pj_qty"));
String sect_nm = Util.checkString(req.getParameter("sect_nm"));
String sect_cnt = Util.checkString(req.getParameter("sect_cnt"));
String sect_pcnt = Util.checkString(req.getParameter("sect_pcnt"));
String sect_clr_pcnt = Util.checkString(req.getParameter("sect_clr_pcnt"));
String sect_bw_pcnt = Util.checkString(req.getParameter("sect_bw_pcnt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String advt_clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clr_pcnt")));
String advt_bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_bw_pcnt")));
String atic_clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("atic_clr_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt")));
String prv_side_advt_clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_side_advt_clr_pcnt")));
String prv_side_advt_bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_side_advt_bw_pcnt")));
String wht_pj_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("wht_pj_qty")));
String blk_pj_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("blk_pj_qty")));
String sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm")));
String sect_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cnt")));
String sect_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_pcnt")));
String sect_clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clr_pcnt")));
String sect_bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_bw_pcnt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setPrt_dt(prt_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setEcnt(ecnt);
dm.setAdvt_clr_pcnt(advt_clr_pcnt);
dm.setAdvt_bw_pcnt(advt_bw_pcnt);
dm.setAtic_clr_pcnt(atic_clr_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setBw_pcnt(bw_pcnt);
dm.setPrv_side_advt_clr_pcnt(prv_side_advt_clr_pcnt);
dm.setPrv_side_advt_bw_pcnt(prv_side_advt_bw_pcnt);
dm.setWht_pj_qty(wht_pj_qty);
dm.setBlk_pj_qty(blk_pj_qty);
dm.setSect_nm(sect_nm);
dm.setSect_cnt(sect_cnt);
dm.setSect_pcnt(sect_pcnt);
dm.setSect_clr_pcnt(sect_clr_pcnt);
dm.setSect_bw_pcnt(sect_bw_pcnt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 10:55:47 KST 2009 */