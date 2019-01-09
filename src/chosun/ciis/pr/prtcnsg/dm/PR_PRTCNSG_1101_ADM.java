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


package chosun.ciis.pr.prtcnsg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.ds.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_PRTCNSG_1101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String prt_clsf;
	public String film_use_qunt;
	public String prt_fee;
	public String psplat_use_amt;
	public String gnaw_fee;
	public String film_make_fee;
	public String pack_fee;
	public String paper_portage;
	public String issu_qty;
	public String issu_pcnt;
	public String bw_pcnt;
	public String clr_pcnt;
	public String paper_wgt;
	public String clr_prt_fee;
	public String bw_prt_fee;
	public String sub_seq_1;
	public String papcmpy_cd;
	public String paper_amt;
	public String gubun;
	public String sub_seq_2;
	public String psplat_clsf;
	public String use_qunt;
	public String nul_plat_cnt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTCNSG_1101_ADM(){}
	public PR_PRTCNSG_1101_ADM(String mode, String cmpy_cd, String occr_dt, String seq, String prt_dt, String issu_dt, String fac_clsf, String medi_cd, String sect_cd, String prt_clsf, String film_use_qunt, String prt_fee, String psplat_use_amt, String gnaw_fee, String film_make_fee, String pack_fee, String paper_portage, String issu_qty, String issu_pcnt, String bw_pcnt, String clr_pcnt, String paper_wgt, String clr_prt_fee, String bw_prt_fee, String sub_seq_1, String papcmpy_cd, String paper_amt, String gubun, String sub_seq_2, String psplat_clsf, String use_qunt, String nul_plat_cnt, String incmg_pers_ipaddr, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.prt_dt = prt_dt;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.prt_clsf = prt_clsf;
		this.film_use_qunt = film_use_qunt;
		this.prt_fee = prt_fee;
		this.psplat_use_amt = psplat_use_amt;
		this.gnaw_fee = gnaw_fee;
		this.film_make_fee = film_make_fee;
		this.pack_fee = pack_fee;
		this.paper_portage = paper_portage;
		this.issu_qty = issu_qty;
		this.issu_pcnt = issu_pcnt;
		this.bw_pcnt = bw_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.paper_wgt = paper_wgt;
		this.clr_prt_fee = clr_prt_fee;
		this.bw_prt_fee = bw_prt_fee;
		this.sub_seq_1 = sub_seq_1;
		this.papcmpy_cd = papcmpy_cd;
		this.paper_amt = paper_amt;
		this.gubun = gubun;
		this.sub_seq_2 = sub_seq_2;
		this.psplat_clsf = psplat_clsf;
		this.use_qunt = use_qunt;
		this.nul_plat_cnt = nul_plat_cnt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
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

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
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

	public void setFilm_use_qunt(String film_use_qunt){
		this.film_use_qunt = film_use_qunt;
	}

	public void setPrt_fee(String prt_fee){
		this.prt_fee = prt_fee;
	}

	public void setPsplat_use_amt(String psplat_use_amt){
		this.psplat_use_amt = psplat_use_amt;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
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

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setClr_prt_fee(String clr_prt_fee){
		this.clr_prt_fee = clr_prt_fee;
	}

	public void setBw_prt_fee(String bw_prt_fee){
		this.bw_prt_fee = bw_prt_fee;
	}

	public void setSub_seq_1(String sub_seq_1){
		this.sub_seq_1 = sub_seq_1;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setSub_seq_2(String sub_seq_2){
		this.sub_seq_2 = sub_seq_2;
	}

	public void setPsplat_clsf(String psplat_clsf){
		this.psplat_clsf = psplat_clsf;
	}

	public void setUse_qunt(String use_qunt){
		this.use_qunt = use_qunt;
	}

	public void setNul_plat_cnt(String nul_plat_cnt){
		this.nul_plat_cnt = nul_plat_cnt;
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

	public String getIssu_dt(){
		return this.issu_dt;
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

	public String getFilm_use_qunt(){
		return this.film_use_qunt;
	}

	public String getPrt_fee(){
		return this.prt_fee;
	}

	public String getPsplat_use_amt(){
		return this.psplat_use_amt;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}

	public String getIssu_qty(){
		return this.issu_qty;
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

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getClr_prt_fee(){
		return this.clr_prt_fee;
	}

	public String getBw_prt_fee(){
		return this.bw_prt_fee;
	}

	public String getSub_seq_1(){
		return this.sub_seq_1;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSub_seq_2(){
		return this.sub_seq_2;
	}

	public String getPsplat_clsf(){
		return this.psplat_clsf;
	}

	public String getUse_qunt(){
		return this.use_qunt;
	}

	public String getNul_plat_cnt(){
		return this.nul_plat_cnt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTCNSG_1101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTCNSG_1101_ADM dm = (PR_PRTCNSG_1101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.prt_dt);
		cstmt.setString(8, dm.issu_dt);
		cstmt.setString(9, dm.fac_clsf);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.sect_cd);
		cstmt.setString(12, dm.prt_clsf);
		cstmt.setString(13, dm.film_use_qunt);
		cstmt.setString(14, dm.prt_fee);
		cstmt.setString(15, dm.psplat_use_amt);
		cstmt.setString(16, dm.gnaw_fee);
		cstmt.setString(17, dm.film_make_fee);
		cstmt.setString(18, dm.pack_fee);
		cstmt.setString(19, dm.paper_portage);
		cstmt.setString(20, dm.issu_qty);
		cstmt.setString(21, dm.issu_pcnt);
		cstmt.setString(22, dm.bw_pcnt);
		cstmt.setString(23, dm.clr_pcnt);
		cstmt.setString(24, dm.paper_wgt);
		cstmt.setString(25, dm.clr_prt_fee);
		cstmt.setString(26, dm.bw_prt_fee);
		cstmt.setString(27, dm.sub_seq_1);
		cstmt.setString(28, dm.papcmpy_cd);
		cstmt.setString(29, dm.paper_amt);
		cstmt.setString(30, dm.gubun);
		cstmt.setString(31, dm.sub_seq_2);
		cstmt.setString(32, dm.psplat_clsf);
		cstmt.setString(33, dm.use_qunt);
		cstmt.setString(34, dm.nul_plat_cnt);
		cstmt.setString(35, dm.incmg_pers_ipaddr);
		cstmt.setString(36, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_PRTCNSG_1101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("prt_clsf = [" + getPrt_clsf() + "]");
		System.out.println("film_use_qunt = [" + getFilm_use_qunt() + "]");
		System.out.println("prt_fee = [" + getPrt_fee() + "]");
		System.out.println("psplat_use_amt = [" + getPsplat_use_amt() + "]");
		System.out.println("gnaw_fee = [" + getGnaw_fee() + "]");
		System.out.println("film_make_fee = [" + getFilm_make_fee() + "]");
		System.out.println("pack_fee = [" + getPack_fee() + "]");
		System.out.println("paper_portage = [" + getPaper_portage() + "]");
		System.out.println("issu_qty = [" + getIssu_qty() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("bw_pcnt = [" + getBw_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("paper_wgt = [" + getPaper_wgt() + "]");
		System.out.println("clr_prt_fee = [" + getClr_prt_fee() + "]");
		System.out.println("bw_prt_fee = [" + getBw_prt_fee() + "]");
		System.out.println("sub_seq_1 = [" + getSub_seq_1() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("paper_amt = [" + getPaper_amt() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("sub_seq_2 = [" + getSub_seq_2() + "]");
		System.out.println("psplat_clsf = [" + getPsplat_clsf() + "]");
		System.out.println("use_qunt = [" + getUse_qunt() + "]");
		System.out.println("nul_plat_cnt = [" + getNul_plat_cnt() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
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
String film_use_qunt = req.getParameter("film_use_qunt");
if( film_use_qunt == null){
	System.out.println(this.toString+" : film_use_qunt is null" );
}else{
	System.out.println(this.toString+" : film_use_qunt is "+film_use_qunt );
}
String prt_fee = req.getParameter("prt_fee");
if( prt_fee == null){
	System.out.println(this.toString+" : prt_fee is null" );
}else{
	System.out.println(this.toString+" : prt_fee is "+prt_fee );
}
String psplat_use_amt = req.getParameter("psplat_use_amt");
if( psplat_use_amt == null){
	System.out.println(this.toString+" : psplat_use_amt is null" );
}else{
	System.out.println(this.toString+" : psplat_use_amt is "+psplat_use_amt );
}
String gnaw_fee = req.getParameter("gnaw_fee");
if( gnaw_fee == null){
	System.out.println(this.toString+" : gnaw_fee is null" );
}else{
	System.out.println(this.toString+" : gnaw_fee is "+gnaw_fee );
}
String film_make_fee = req.getParameter("film_make_fee");
if( film_make_fee == null){
	System.out.println(this.toString+" : film_make_fee is null" );
}else{
	System.out.println(this.toString+" : film_make_fee is "+film_make_fee );
}
String pack_fee = req.getParameter("pack_fee");
if( pack_fee == null){
	System.out.println(this.toString+" : pack_fee is null" );
}else{
	System.out.println(this.toString+" : pack_fee is "+pack_fee );
}
String paper_portage = req.getParameter("paper_portage");
if( paper_portage == null){
	System.out.println(this.toString+" : paper_portage is null" );
}else{
	System.out.println(this.toString+" : paper_portage is "+paper_portage );
}
String issu_qty = req.getParameter("issu_qty");
if( issu_qty == null){
	System.out.println(this.toString+" : issu_qty is null" );
}else{
	System.out.println(this.toString+" : issu_qty is "+issu_qty );
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
String paper_wgt = req.getParameter("paper_wgt");
if( paper_wgt == null){
	System.out.println(this.toString+" : paper_wgt is null" );
}else{
	System.out.println(this.toString+" : paper_wgt is "+paper_wgt );
}
String clr_prt_fee = req.getParameter("clr_prt_fee");
if( clr_prt_fee == null){
	System.out.println(this.toString+" : clr_prt_fee is null" );
}else{
	System.out.println(this.toString+" : clr_prt_fee is "+clr_prt_fee );
}
String bw_prt_fee = req.getParameter("bw_prt_fee");
if( bw_prt_fee == null){
	System.out.println(this.toString+" : bw_prt_fee is null" );
}else{
	System.out.println(this.toString+" : bw_prt_fee is "+bw_prt_fee );
}
String sub_seq_1 = req.getParameter("sub_seq_1");
if( sub_seq_1 == null){
	System.out.println(this.toString+" : sub_seq_1 is null" );
}else{
	System.out.println(this.toString+" : sub_seq_1 is "+sub_seq_1 );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String paper_amt = req.getParameter("paper_amt");
if( paper_amt == null){
	System.out.println(this.toString+" : paper_amt is null" );
}else{
	System.out.println(this.toString+" : paper_amt is "+paper_amt );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String sub_seq_2 = req.getParameter("sub_seq_2");
if( sub_seq_2 == null){
	System.out.println(this.toString+" : sub_seq_2 is null" );
}else{
	System.out.println(this.toString+" : sub_seq_2 is "+sub_seq_2 );
}
String psplat_clsf = req.getParameter("psplat_clsf");
if( psplat_clsf == null){
	System.out.println(this.toString+" : psplat_clsf is null" );
}else{
	System.out.println(this.toString+" : psplat_clsf is "+psplat_clsf );
}
String use_qunt = req.getParameter("use_qunt");
if( use_qunt == null){
	System.out.println(this.toString+" : use_qunt is null" );
}else{
	System.out.println(this.toString+" : use_qunt is "+use_qunt );
}
String nul_plat_cnt = req.getParameter("nul_plat_cnt");
if( nul_plat_cnt == null){
	System.out.println(this.toString+" : nul_plat_cnt is null" );
}else{
	System.out.println(this.toString+" : nul_plat_cnt is "+nul_plat_cnt );
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
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
String film_use_qunt = Util.checkString(req.getParameter("film_use_qunt"));
String prt_fee = Util.checkString(req.getParameter("prt_fee"));
String psplat_use_amt = Util.checkString(req.getParameter("psplat_use_amt"));
String gnaw_fee = Util.checkString(req.getParameter("gnaw_fee"));
String film_make_fee = Util.checkString(req.getParameter("film_make_fee"));
String pack_fee = Util.checkString(req.getParameter("pack_fee"));
String paper_portage = Util.checkString(req.getParameter("paper_portage"));
String issu_qty = Util.checkString(req.getParameter("issu_qty"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String paper_wgt = Util.checkString(req.getParameter("paper_wgt"));
String clr_prt_fee = Util.checkString(req.getParameter("clr_prt_fee"));
String bw_prt_fee = Util.checkString(req.getParameter("bw_prt_fee"));
String sub_seq_1 = Util.checkString(req.getParameter("sub_seq_1"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String paper_amt = Util.checkString(req.getParameter("paper_amt"));
String gubun = Util.checkString(req.getParameter("gubun"));
String sub_seq_2 = Util.checkString(req.getParameter("sub_seq_2"));
String psplat_clsf = Util.checkString(req.getParameter("psplat_clsf"));
String use_qunt = Util.checkString(req.getParameter("use_qunt"));
String nul_plat_cnt = Util.checkString(req.getParameter("nul_plat_cnt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String prt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf")));
String film_use_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("film_use_qunt")));
String prt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_fee")));
String psplat_use_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("psplat_use_amt")));
String gnaw_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("gnaw_fee")));
String film_make_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("film_make_fee")));
String pack_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("pack_fee")));
String paper_portage = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_portage")));
String issu_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_qty")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String paper_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_wgt")));
String clr_prt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_prt_fee")));
String bw_prt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_prt_fee")));
String sub_seq_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq_1")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String paper_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_amt")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String sub_seq_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq_2")));
String psplat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("psplat_clsf")));
String use_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt")));
String nul_plat_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("nul_plat_cnt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setPrt_dt(prt_dt);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setPrt_clsf(prt_clsf);
dm.setFilm_use_qunt(film_use_qunt);
dm.setPrt_fee(prt_fee);
dm.setPsplat_use_amt(psplat_use_amt);
dm.setGnaw_fee(gnaw_fee);
dm.setFilm_make_fee(film_make_fee);
dm.setPack_fee(pack_fee);
dm.setPaper_portage(paper_portage);
dm.setIssu_qty(issu_qty);
dm.setIssu_pcnt(issu_pcnt);
dm.setBw_pcnt(bw_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setPaper_wgt(paper_wgt);
dm.setClr_prt_fee(clr_prt_fee);
dm.setBw_prt_fee(bw_prt_fee);
dm.setSub_seq_1(sub_seq_1);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setPaper_amt(paper_amt);
dm.setGubun(gubun);
dm.setSub_seq_2(sub_seq_2);
dm.setPsplat_clsf(psplat_clsf);
dm.setUse_qunt(use_qunt);
dm.setNul_plat_cnt(nul_plat_cnt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 23:44:57 KST 2009 */