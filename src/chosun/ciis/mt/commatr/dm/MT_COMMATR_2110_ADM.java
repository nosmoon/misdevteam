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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_2110_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String matr_cd;
	public String purc_uprc;
	public String uprc_meda_dt;
	public String dlco_eps_no;
	public String setl_cond;
	public String remk;
	public String occr_dt;
	public String seq;
	public String mode;
	public String medi_cd;
	public String rela_yn;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public MT_COMMATR_2110_ADM(){}
	public MT_COMMATR_2110_ADM(String gubun, String cmpy_cd, String matr_cd, String purc_uprc, String uprc_meda_dt, String dlco_eps_no, String setl_cond, String remk, String occr_dt, String seq, String mode, String medi_cd, String rela_yn, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.matr_cd = matr_cd;
		this.purc_uprc = purc_uprc;
		this.uprc_meda_dt = uprc_meda_dt;
		this.dlco_eps_no = dlco_eps_no;
		this.setl_cond = setl_cond;
		this.remk = remk;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.rela_yn = rela_yn;
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

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setUprc_meda_dt(String uprc_meda_dt){
		this.uprc_meda_dt = uprc_meda_dt;
	}

	public void setDlco_eps_no(String dlco_eps_no){
		this.dlco_eps_no = dlco_eps_no;
	}

	public void setSetl_cond(String setl_cond){
		this.setl_cond = setl_cond;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
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

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getUprc_meda_dt(){
		return this.uprc_meda_dt;
	}

	public String getDlco_eps_no(){
		return this.dlco_eps_no;
	}

	public String getSetl_cond(){
		return this.setl_cond;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRela_yn(){
		return this.rela_yn;
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
		 return "{ call MISMAT.SP_MT_COMMATR_2110_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_2110_ADM dm = (MT_COMMATR_2110_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.matr_cd);
		cstmt.setString(6, dm.purc_uprc);
		cstmt.setString(7, dm.uprc_meda_dt);
		cstmt.setString(8, dm.dlco_eps_no);
		cstmt.setString(9, dm.setl_cond);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.occr_dt);
		cstmt.setString(12, dm.seq);
		cstmt.setString(13, dm.mode);
		cstmt.setString(14, dm.medi_cd);
		cstmt.setString(15, dm.rela_yn);
		cstmt.setString(16, dm.incmg_pers_ipaddr);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_dt_tm);
		cstmt.setString(19, dm.chg_pers);
		cstmt.setString(20, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_2110_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("purc_uprc = [" + getPurc_uprc() + "]");
		System.out.println("uprc_meda_dt = [" + getUprc_meda_dt() + "]");
		System.out.println("dlco_eps_no = [" + getDlco_eps_no() + "]");
		System.out.println("setl_cond = [" + getSetl_cond() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("rela_yn = [" + getRela_yn() + "]");
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
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String purc_uprc = req.getParameter("purc_uprc");
if( purc_uprc == null){
	System.out.println(this.toString+" : purc_uprc is null" );
}else{
	System.out.println(this.toString+" : purc_uprc is "+purc_uprc );
}
String uprc_meda_dt = req.getParameter("uprc_meda_dt");
if( uprc_meda_dt == null){
	System.out.println(this.toString+" : uprc_meda_dt is null" );
}else{
	System.out.println(this.toString+" : uprc_meda_dt is "+uprc_meda_dt );
}
String dlco_eps_no = req.getParameter("dlco_eps_no");
if( dlco_eps_no == null){
	System.out.println(this.toString+" : dlco_eps_no is null" );
}else{
	System.out.println(this.toString+" : dlco_eps_no is "+dlco_eps_no );
}
String setl_cond = req.getParameter("setl_cond");
if( setl_cond == null){
	System.out.println(this.toString+" : setl_cond is null" );
}else{
	System.out.println(this.toString+" : setl_cond is "+setl_cond );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rela_yn = req.getParameter("rela_yn");
if( rela_yn == null){
	System.out.println(this.toString+" : rela_yn is null" );
}else{
	System.out.println(this.toString+" : rela_yn is "+rela_yn );
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
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
String uprc_meda_dt = Util.checkString(req.getParameter("uprc_meda_dt"));
String dlco_eps_no = Util.checkString(req.getParameter("dlco_eps_no"));
String setl_cond = Util.checkString(req.getParameter("setl_cond"));
String remk = Util.checkString(req.getParameter("remk"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rela_yn = Util.checkString(req.getParameter("rela_yn"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String purc_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_uprc")));
String uprc_meda_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_meda_dt")));
String dlco_eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_eps_no")));
String setl_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("setl_cond")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rela_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_yn")));
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
dm.setMatr_cd(matr_cd);
dm.setPurc_uprc(purc_uprc);
dm.setUprc_meda_dt(uprc_meda_dt);
dm.setDlco_eps_no(dlco_eps_no);
dm.setSetl_cond(setl_cond);
dm.setRemk(remk);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setRela_yn(rela_yn);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 17:26:14 KST 2009 */