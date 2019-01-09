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


public class PR_OTHCNSM_2311_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String aply_dt;
	public String prt_basi_qty;
	public String pj_basi_qty;
	public String prt_uprc_bw;
	public String prt_uprc_clr;
	public String prt_pj_rate_bw;
	public String prt_pj_rate_clr;
	public String film_make_fee;
	public String pack_fee;
	public String base_leas_fee;
	public String real_leas_fee;
	public String dest_fee;
	public String etc_matr_fee_bw;
	public String etc_matr_fee_clr;
	public String leas_use_fee_bw;
	public String leas_use_fee_clr;
	public String paper_wgt;
	public String prt_pj_rate;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public PR_OTHCNSM_2311_ADM(){}
	public PR_OTHCNSM_2311_ADM(String cmpy_cd, String fac_clsf, String medi_cd, String sect_cd, String aply_dt, String prt_basi_qty, String pj_basi_qty, String prt_uprc_bw, String prt_uprc_clr, String prt_pj_rate_bw, String prt_pj_rate_clr, String film_make_fee, String pack_fee, String base_leas_fee, String real_leas_fee, String dest_fee, String etc_matr_fee_bw, String etc_matr_fee_clr, String leas_use_fee_bw, String leas_use_fee_clr, String paper_wgt, String prt_pj_rate, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.aply_dt = aply_dt;
		this.prt_basi_qty = prt_basi_qty;
		this.pj_basi_qty = pj_basi_qty;
		this.prt_uprc_bw = prt_uprc_bw;
		this.prt_uprc_clr = prt_uprc_clr;
		this.prt_pj_rate_bw = prt_pj_rate_bw;
		this.prt_pj_rate_clr = prt_pj_rate_clr;
		this.film_make_fee = film_make_fee;
		this.pack_fee = pack_fee;
		this.base_leas_fee = base_leas_fee;
		this.real_leas_fee = real_leas_fee;
		this.dest_fee = dest_fee;
		this.etc_matr_fee_bw = etc_matr_fee_bw;
		this.etc_matr_fee_clr = etc_matr_fee_clr;
		this.leas_use_fee_bw = leas_use_fee_bw;
		this.leas_use_fee_clr = leas_use_fee_clr;
		this.paper_wgt = paper_wgt;
		this.prt_pj_rate = prt_pj_rate;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPrt_basi_qty(String prt_basi_qty){
		this.prt_basi_qty = prt_basi_qty;
	}

	public void setPj_basi_qty(String pj_basi_qty){
		this.pj_basi_qty = pj_basi_qty;
	}

	public void setPrt_uprc_bw(String prt_uprc_bw){
		this.prt_uprc_bw = prt_uprc_bw;
	}

	public void setPrt_uprc_clr(String prt_uprc_clr){
		this.prt_uprc_clr = prt_uprc_clr;
	}

	public void setPrt_pj_rate_bw(String prt_pj_rate_bw){
		this.prt_pj_rate_bw = prt_pj_rate_bw;
	}

	public void setPrt_pj_rate_clr(String prt_pj_rate_clr){
		this.prt_pj_rate_clr = prt_pj_rate_clr;
	}

	public void setFilm_make_fee(String film_make_fee){
		this.film_make_fee = film_make_fee;
	}

	public void setPack_fee(String pack_fee){
		this.pack_fee = pack_fee;
	}

	public void setBase_leas_fee(String base_leas_fee){
		this.base_leas_fee = base_leas_fee;
	}

	public void setReal_leas_fee(String real_leas_fee){
		this.real_leas_fee = real_leas_fee;
	}

	public void setDest_fee(String dest_fee){
		this.dest_fee = dest_fee;
	}

	public void setEtc_matr_fee_bw(String etc_matr_fee_bw){
		this.etc_matr_fee_bw = etc_matr_fee_bw;
	}

	public void setEtc_matr_fee_clr(String etc_matr_fee_clr){
		this.etc_matr_fee_clr = etc_matr_fee_clr;
	}

	public void setLeas_use_fee_bw(String leas_use_fee_bw){
		this.leas_use_fee_bw = leas_use_fee_bw;
	}

	public void setLeas_use_fee_clr(String leas_use_fee_clr){
		this.leas_use_fee_clr = leas_use_fee_clr;
	}

	public void setPaper_wgt(String paper_wgt){
		this.paper_wgt = paper_wgt;
	}

	public void setPrt_pj_rate(String prt_pj_rate){
		this.prt_pj_rate = prt_pj_rate;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPrt_basi_qty(){
		return this.prt_basi_qty;
	}

	public String getPj_basi_qty(){
		return this.pj_basi_qty;
	}

	public String getPrt_uprc_bw(){
		return this.prt_uprc_bw;
	}

	public String getPrt_uprc_clr(){
		return this.prt_uprc_clr;
	}

	public String getPrt_pj_rate_bw(){
		return this.prt_pj_rate_bw;
	}

	public String getPrt_pj_rate_clr(){
		return this.prt_pj_rate_clr;
	}

	public String getFilm_make_fee(){
		return this.film_make_fee;
	}

	public String getPack_fee(){
		return this.pack_fee;
	}

	public String getBase_leas_fee(){
		return this.base_leas_fee;
	}

	public String getReal_leas_fee(){
		return this.real_leas_fee;
	}

	public String getDest_fee(){
		return this.dest_fee;
	}

	public String getEtc_matr_fee_bw(){
		return this.etc_matr_fee_bw;
	}

	public String getEtc_matr_fee_clr(){
		return this.etc_matr_fee_clr;
	}

	public String getLeas_use_fee_bw(){
		return this.leas_use_fee_bw;
	}

	public String getLeas_use_fee_clr(){
		return this.leas_use_fee_clr;
	}

	public String getPaper_wgt(){
		return this.paper_wgt;
	}

	public String getPrt_pj_rate(){
		return this.prt_pj_rate;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_OTHCNSM_2311_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_OTHCNSM_2311_ADM dm = (PR_OTHCNSM_2311_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.sect_cd);
		cstmt.setString(7, dm.aply_dt);
		cstmt.setString(8, dm.prt_basi_qty);
		cstmt.setString(9, dm.pj_basi_qty);
		cstmt.setString(10, dm.prt_uprc_bw);
		cstmt.setString(11, dm.prt_uprc_clr);
		cstmt.setString(12, dm.prt_pj_rate_bw);
		cstmt.setString(13, dm.prt_pj_rate_clr);
		cstmt.setString(14, dm.film_make_fee);
		cstmt.setString(15, dm.pack_fee);
		cstmt.setString(16, dm.base_leas_fee);
		cstmt.setString(17, dm.real_leas_fee);
		cstmt.setString(18, dm.dest_fee);
		cstmt.setString(19, dm.etc_matr_fee_bw);
		cstmt.setString(20, dm.etc_matr_fee_clr);
		cstmt.setString(21, dm.leas_use_fee_bw);
		cstmt.setString(22, dm.leas_use_fee_clr);
		cstmt.setString(23, dm.paper_wgt);
		cstmt.setString(24, dm.prt_pj_rate);
		cstmt.setString(25, dm.incmg_pers_ipaddr);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.setString(27, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_OTHCNSM_2311_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("prt_basi_qty = [" + getPrt_basi_qty() + "]");
		System.out.println("pj_basi_qty = [" + getPj_basi_qty() + "]");
		System.out.println("prt_uprc_bw = [" + getPrt_uprc_bw() + "]");
		System.out.println("prt_uprc_clr = [" + getPrt_uprc_clr() + "]");
		System.out.println("prt_pj_rate_bw = [" + getPrt_pj_rate_bw() + "]");
		System.out.println("prt_pj_rate_clr = [" + getPrt_pj_rate_clr() + "]");
		System.out.println("film_make_fee = [" + getFilm_make_fee() + "]");
		System.out.println("pack_fee = [" + getPack_fee() + "]");
		System.out.println("base_leas_fee = [" + getBase_leas_fee() + "]");
		System.out.println("real_leas_fee = [" + getReal_leas_fee() + "]");
		System.out.println("dest_fee = [" + getDest_fee() + "]");
		System.out.println("etc_matr_fee_bw = [" + getEtc_matr_fee_bw() + "]");
		System.out.println("etc_matr_fee_clr = [" + getEtc_matr_fee_clr() + "]");
		System.out.println("leas_use_fee_bw = [" + getLeas_use_fee_bw() + "]");
		System.out.println("leas_use_fee_clr = [" + getLeas_use_fee_clr() + "]");
		System.out.println("paper_wgt = [" + getPaper_wgt() + "]");
		System.out.println("prt_pj_rate = [" + getPrt_pj_rate() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String prt_basi_qty = req.getParameter("prt_basi_qty");
if( prt_basi_qty == null){
	System.out.println(this.toString+" : prt_basi_qty is null" );
}else{
	System.out.println(this.toString+" : prt_basi_qty is "+prt_basi_qty );
}
String pj_basi_qty = req.getParameter("pj_basi_qty");
if( pj_basi_qty == null){
	System.out.println(this.toString+" : pj_basi_qty is null" );
}else{
	System.out.println(this.toString+" : pj_basi_qty is "+pj_basi_qty );
}
String prt_uprc_bw = req.getParameter("prt_uprc_bw");
if( prt_uprc_bw == null){
	System.out.println(this.toString+" : prt_uprc_bw is null" );
}else{
	System.out.println(this.toString+" : prt_uprc_bw is "+prt_uprc_bw );
}
String prt_uprc_clr = req.getParameter("prt_uprc_clr");
if( prt_uprc_clr == null){
	System.out.println(this.toString+" : prt_uprc_clr is null" );
}else{
	System.out.println(this.toString+" : prt_uprc_clr is "+prt_uprc_clr );
}
String prt_pj_rate_bw = req.getParameter("prt_pj_rate_bw");
if( prt_pj_rate_bw == null){
	System.out.println(this.toString+" : prt_pj_rate_bw is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate_bw is "+prt_pj_rate_bw );
}
String prt_pj_rate_clr = req.getParameter("prt_pj_rate_clr");
if( prt_pj_rate_clr == null){
	System.out.println(this.toString+" : prt_pj_rate_clr is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate_clr is "+prt_pj_rate_clr );
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
String base_leas_fee = req.getParameter("base_leas_fee");
if( base_leas_fee == null){
	System.out.println(this.toString+" : base_leas_fee is null" );
}else{
	System.out.println(this.toString+" : base_leas_fee is "+base_leas_fee );
}
String real_leas_fee = req.getParameter("real_leas_fee");
if( real_leas_fee == null){
	System.out.println(this.toString+" : real_leas_fee is null" );
}else{
	System.out.println(this.toString+" : real_leas_fee is "+real_leas_fee );
}
String dest_fee = req.getParameter("dest_fee");
if( dest_fee == null){
	System.out.println(this.toString+" : dest_fee is null" );
}else{
	System.out.println(this.toString+" : dest_fee is "+dest_fee );
}
String etc_matr_fee_bw = req.getParameter("etc_matr_fee_bw");
if( etc_matr_fee_bw == null){
	System.out.println(this.toString+" : etc_matr_fee_bw is null" );
}else{
	System.out.println(this.toString+" : etc_matr_fee_bw is "+etc_matr_fee_bw );
}
String etc_matr_fee_clr = req.getParameter("etc_matr_fee_clr");
if( etc_matr_fee_clr == null){
	System.out.println(this.toString+" : etc_matr_fee_clr is null" );
}else{
	System.out.println(this.toString+" : etc_matr_fee_clr is "+etc_matr_fee_clr );
}
String leas_use_fee_bw = req.getParameter("leas_use_fee_bw");
if( leas_use_fee_bw == null){
	System.out.println(this.toString+" : leas_use_fee_bw is null" );
}else{
	System.out.println(this.toString+" : leas_use_fee_bw is "+leas_use_fee_bw );
}
String leas_use_fee_clr = req.getParameter("leas_use_fee_clr");
if( leas_use_fee_clr == null){
	System.out.println(this.toString+" : leas_use_fee_clr is null" );
}else{
	System.out.println(this.toString+" : leas_use_fee_clr is "+leas_use_fee_clr );
}
String paper_wgt = req.getParameter("paper_wgt");
if( paper_wgt == null){
	System.out.println(this.toString+" : paper_wgt is null" );
}else{
	System.out.println(this.toString+" : paper_wgt is "+paper_wgt );
}
String prt_pj_rate = req.getParameter("prt_pj_rate");
if( prt_pj_rate == null){
	System.out.println(this.toString+" : prt_pj_rate is null" );
}else{
	System.out.println(this.toString+" : prt_pj_rate is "+prt_pj_rate );
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
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String prt_basi_qty = Util.checkString(req.getParameter("prt_basi_qty"));
String pj_basi_qty = Util.checkString(req.getParameter("pj_basi_qty"));
String prt_uprc_bw = Util.checkString(req.getParameter("prt_uprc_bw"));
String prt_uprc_clr = Util.checkString(req.getParameter("prt_uprc_clr"));
String prt_pj_rate_bw = Util.checkString(req.getParameter("prt_pj_rate_bw"));
String prt_pj_rate_clr = Util.checkString(req.getParameter("prt_pj_rate_clr"));
String film_make_fee = Util.checkString(req.getParameter("film_make_fee"));
String pack_fee = Util.checkString(req.getParameter("pack_fee"));
String base_leas_fee = Util.checkString(req.getParameter("base_leas_fee"));
String real_leas_fee = Util.checkString(req.getParameter("real_leas_fee"));
String dest_fee = Util.checkString(req.getParameter("dest_fee"));
String etc_matr_fee_bw = Util.checkString(req.getParameter("etc_matr_fee_bw"));
String etc_matr_fee_clr = Util.checkString(req.getParameter("etc_matr_fee_clr"));
String leas_use_fee_bw = Util.checkString(req.getParameter("leas_use_fee_bw"));
String leas_use_fee_clr = Util.checkString(req.getParameter("leas_use_fee_clr"));
String paper_wgt = Util.checkString(req.getParameter("paper_wgt"));
String prt_pj_rate = Util.checkString(req.getParameter("prt_pj_rate"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String prt_basi_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_basi_qty")));
String pj_basi_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_basi_qty")));
String prt_uprc_bw = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_uprc_bw")));
String prt_uprc_clr = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_uprc_clr")));
String prt_pj_rate_bw = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate_bw")));
String prt_pj_rate_clr = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate_clr")));
String film_make_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("film_make_fee")));
String pack_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("pack_fee")));
String base_leas_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("base_leas_fee")));
String real_leas_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("real_leas_fee")));
String dest_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("dest_fee")));
String etc_matr_fee_bw = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_matr_fee_bw")));
String etc_matr_fee_clr = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_matr_fee_clr")));
String leas_use_fee_bw = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_use_fee_bw")));
String leas_use_fee_clr = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_use_fee_clr")));
String paper_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_wgt")));
String prt_pj_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_pj_rate")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setAply_dt(aply_dt);
dm.setPrt_basi_qty(prt_basi_qty);
dm.setPj_basi_qty(pj_basi_qty);
dm.setPrt_uprc_bw(prt_uprc_bw);
dm.setPrt_uprc_clr(prt_uprc_clr);
dm.setPrt_pj_rate_bw(prt_pj_rate_bw);
dm.setPrt_pj_rate_clr(prt_pj_rate_clr);
dm.setFilm_make_fee(film_make_fee);
dm.setPack_fee(pack_fee);
dm.setBase_leas_fee(base_leas_fee);
dm.setReal_leas_fee(real_leas_fee);
dm.setDest_fee(dest_fee);
dm.setEtc_matr_fee_bw(etc_matr_fee_bw);
dm.setEtc_matr_fee_clr(etc_matr_fee_clr);
dm.setLeas_use_fee_bw(leas_use_fee_bw);
dm.setLeas_use_fee_clr(leas_use_fee_clr);
dm.setPaper_wgt(paper_wgt);
dm.setPrt_pj_rate(prt_pj_rate);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 16:29:13 KST 2009 */