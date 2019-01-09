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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_2101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String clos_yymm;
	public String ecnt;
	public String clr_clsf;
	public String re_off_plat;
	public String re_re_off_plat;
	public String film_num_shet;
	public String psplat_cnt;
	public String occr_dt;
	public String seq;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public PR_PAPMAKE_2101_ADM(){}
	public PR_PAPMAKE_2101_ADM(String gubun, String cmpy_cd, String clos_yymm, String ecnt, String clr_clsf, String re_off_plat, String re_re_off_plat, String film_num_shet, String psplat_cnt, String occr_dt, String seq, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.clos_yymm = clos_yymm;
		this.ecnt = ecnt;
		this.clr_clsf = clr_clsf;
		this.re_off_plat = re_off_plat;
		this.re_re_off_plat = re_re_off_plat;
		this.film_num_shet = film_num_shet;
		this.psplat_cnt = psplat_cnt;
		this.occr_dt = occr_dt;
		this.seq = seq;
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

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setClr_clsf(String clr_clsf){
		this.clr_clsf = clr_clsf;
	}

	public void setRe_off_plat(String re_off_plat){
		this.re_off_plat = re_off_plat;
	}

	public void setRe_re_off_plat(String re_re_off_plat){
		this.re_re_off_plat = re_re_off_plat;
	}

	public void setFilm_num_shet(String film_num_shet){
		this.film_num_shet = film_num_shet;
	}

	public void setPsplat_cnt(String psplat_cnt){
		this.psplat_cnt = psplat_cnt;
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

	public String getClos_yymm(){
		return this.clos_yymm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getClr_clsf(){
		return this.clr_clsf;
	}

	public String getRe_off_plat(){
		return this.re_off_plat;
	}

	public String getRe_re_off_plat(){
		return this.re_re_off_plat;
	}

	public String getFilm_num_shet(){
		return this.film_num_shet;
	}

	public String getPsplat_cnt(){
		return this.psplat_cnt;
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
		 return "{ call MISMAT.SP_PR_PAPMAKE_2101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_2101_ADM dm = (PR_PAPMAKE_2101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.clos_yymm);
		cstmt.setString(6, dm.ecnt);
		cstmt.setString(7, dm.clr_clsf);
		cstmt.setString(8, dm.re_off_plat);
		cstmt.setString(9, dm.re_re_off_plat);
		cstmt.setString(10, dm.film_num_shet);
		cstmt.setString(11, dm.psplat_cnt);
		cstmt.setString(12, dm.occr_dt);
		cstmt.setString(13, dm.seq);
		cstmt.setString(14, dm.incmg_pers_ipaddr);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_dt_tm);
		cstmt.setString(17, dm.chg_pers);
		cstmt.setString(18, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_2101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_yymm = [" + getClos_yymm() + "]");
		System.out.println("ecnt = [" + getEcnt() + "]");
		System.out.println("clr_clsf = [" + getClr_clsf() + "]");
		System.out.println("re_off_plat = [" + getRe_off_plat() + "]");
		System.out.println("re_re_off_plat = [" + getRe_re_off_plat() + "]");
		System.out.println("film_num_shet = [" + getFilm_num_shet() + "]");
		System.out.println("psplat_cnt = [" + getPsplat_cnt() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
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
String clos_yymm = req.getParameter("clos_yymm");
if( clos_yymm == null){
	System.out.println(this.toString+" : clos_yymm is null" );
}else{
	System.out.println(this.toString+" : clos_yymm is "+clos_yymm );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String clr_clsf = req.getParameter("clr_clsf");
if( clr_clsf == null){
	System.out.println(this.toString+" : clr_clsf is null" );
}else{
	System.out.println(this.toString+" : clr_clsf is "+clr_clsf );
}
String re_off_plat = req.getParameter("re_off_plat");
if( re_off_plat == null){
	System.out.println(this.toString+" : re_off_plat is null" );
}else{
	System.out.println(this.toString+" : re_off_plat is "+re_off_plat );
}
String re_re_off_plat = req.getParameter("re_re_off_plat");
if( re_re_off_plat == null){
	System.out.println(this.toString+" : re_re_off_plat is null" );
}else{
	System.out.println(this.toString+" : re_re_off_plat is "+re_re_off_plat );
}
String film_num_shet = req.getParameter("film_num_shet");
if( film_num_shet == null){
	System.out.println(this.toString+" : film_num_shet is null" );
}else{
	System.out.println(this.toString+" : film_num_shet is "+film_num_shet );
}
String psplat_cnt = req.getParameter("psplat_cnt");
if( psplat_cnt == null){
	System.out.println(this.toString+" : psplat_cnt is null" );
}else{
	System.out.println(this.toString+" : psplat_cnt is "+psplat_cnt );
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
String clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String clr_clsf = Util.checkString(req.getParameter("clr_clsf"));
String re_off_plat = Util.checkString(req.getParameter("re_off_plat"));
String re_re_off_plat = Util.checkString(req.getParameter("re_re_off_plat"));
String film_num_shet = Util.checkString(req.getParameter("film_num_shet"));
String psplat_cnt = Util.checkString(req.getParameter("psplat_cnt"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yymm")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String clr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_clsf")));
String re_off_plat = Util.Uni2Ksc(Util.checkString(req.getParameter("re_off_plat")));
String re_re_off_plat = Util.Uni2Ksc(Util.checkString(req.getParameter("re_re_off_plat")));
String film_num_shet = Util.Uni2Ksc(Util.checkString(req.getParameter("film_num_shet")));
String psplat_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("psplat_cnt")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
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
dm.setClos_yymm(clos_yymm);
dm.setEcnt(ecnt);
dm.setClr_clsf(clr_clsf);
dm.setRe_off_plat(re_off_plat);
dm.setRe_re_off_plat(re_re_off_plat);
dm.setFilm_num_shet(film_num_shet);
dm.setPsplat_cnt(psplat_cnt);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Oct 31 13:29:18 KST 2009 */