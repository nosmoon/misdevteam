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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_4100_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mode;
	public String make_un_norm_occr_dt;
	public String fac_clsf;
	public String now_trad_cd;
	public String medi_cd;
	public String pj_rate;
	public String rela_dept;
	public String caus_prd;
	public String caus_midl;
	public String caus_dtls;
	public String remk;
	public String seq;
	public String occr_dt;

	public MT_PAPINOUT_4100_ADM(){}
	public MT_PAPINOUT_4100_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String mode, String make_un_norm_occr_dt, String fac_clsf, String now_trad_cd, String medi_cd, String pj_rate, String rela_dept, String caus_prd, String caus_midl, String caus_dtls, String remk, String seq, String occr_dt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.make_un_norm_occr_dt = make_un_norm_occr_dt;
		this.fac_clsf = fac_clsf;
		this.now_trad_cd = now_trad_cd;
		this.medi_cd = medi_cd;
		this.pj_rate = pj_rate;
		this.rela_dept = rela_dept;
		this.caus_prd = caus_prd;
		this.caus_midl = caus_midl;
		this.caus_dtls = caus_dtls;
		this.remk = remk;
		this.seq = seq;
		this.occr_dt = occr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMake_un_norm_occr_dt(String make_un_norm_occr_dt){
		this.make_un_norm_occr_dt = make_un_norm_occr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setNow_trad_cd(String now_trad_cd){
		this.now_trad_cd = now_trad_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPj_rate(String pj_rate){
		this.pj_rate = pj_rate;
	}

	public void setRela_dept(String rela_dept){
		this.rela_dept = rela_dept;
	}

	public void setCaus_prd(String caus_prd){
		this.caus_prd = caus_prd;
	}

	public void setCaus_midl(String caus_midl){
		this.caus_midl = caus_midl;
	}

	public void setCaus_dtls(String caus_dtls){
		this.caus_dtls = caus_dtls;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMake_un_norm_occr_dt(){
		return this.make_un_norm_occr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getNow_trad_cd(){
		return this.now_trad_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPj_rate(){
		return this.pj_rate;
	}

	public String getRela_dept(){
		return this.rela_dept;
	}

	public String getCaus_prd(){
		return this.caus_prd;
	}

	public String getCaus_midl(){
		return this.caus_midl;
	}

	public String getCaus_dtls(){
		return this.caus_dtls;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_4100_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_4100_ADM dm = (MT_PAPINOUT_4100_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.make_un_norm_occr_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.now_trad_cd);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.pj_rate);
		cstmt.setString(12, dm.rela_dept);
		cstmt.setString(13, dm.caus_prd);
		cstmt.setString(14, dm.caus_midl);
		cstmt.setString(15, dm.caus_dtls);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.seq);
		cstmt.setString(18, dm.occr_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_4100_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("make_un_norm_occr_dt = [" + getMake_un_norm_occr_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("now_trad_cd = [" + getNow_trad_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pj_rate = [" + getPj_rate() + "]");
		System.out.println("rela_dept = [" + getRela_dept() + "]");
		System.out.println("caus_prd = [" + getCaus_prd() + "]");
		System.out.println("caus_midl = [" + getCaus_midl() + "]");
		System.out.println("caus_dtls = [" + getCaus_dtls() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String make_un_norm_occr_dt = req.getParameter("make_un_norm_occr_dt");
if( make_un_norm_occr_dt == null){
	System.out.println(this.toString+" : make_un_norm_occr_dt is null" );
}else{
	System.out.println(this.toString+" : make_un_norm_occr_dt is "+make_un_norm_occr_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String now_trad_cd = req.getParameter("now_trad_cd");
if( now_trad_cd == null){
	System.out.println(this.toString+" : now_trad_cd is null" );
}else{
	System.out.println(this.toString+" : now_trad_cd is "+now_trad_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pj_rate = req.getParameter("pj_rate");
if( pj_rate == null){
	System.out.println(this.toString+" : pj_rate is null" );
}else{
	System.out.println(this.toString+" : pj_rate is "+pj_rate );
}
String rela_dept = req.getParameter("rela_dept");
if( rela_dept == null){
	System.out.println(this.toString+" : rela_dept is null" );
}else{
	System.out.println(this.toString+" : rela_dept is "+rela_dept );
}
String caus_prd = req.getParameter("caus_prd");
if( caus_prd == null){
	System.out.println(this.toString+" : caus_prd is null" );
}else{
	System.out.println(this.toString+" : caus_prd is "+caus_prd );
}
String caus_midl = req.getParameter("caus_midl");
if( caus_midl == null){
	System.out.println(this.toString+" : caus_midl is null" );
}else{
	System.out.println(this.toString+" : caus_midl is "+caus_midl );
}
String caus_dtls = req.getParameter("caus_dtls");
if( caus_dtls == null){
	System.out.println(this.toString+" : caus_dtls is null" );
}else{
	System.out.println(this.toString+" : caus_dtls is "+caus_dtls );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String make_un_norm_occr_dt = Util.checkString(req.getParameter("make_un_norm_occr_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String now_trad_cd = Util.checkString(req.getParameter("now_trad_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pj_rate = Util.checkString(req.getParameter("pj_rate"));
String rela_dept = Util.checkString(req.getParameter("rela_dept"));
String caus_prd = Util.checkString(req.getParameter("caus_prd"));
String caus_midl = Util.checkString(req.getParameter("caus_midl"));
String caus_dtls = Util.checkString(req.getParameter("caus_dtls"));
String remk = Util.checkString(req.getParameter("remk"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String make_un_norm_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_un_norm_occr_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String now_trad_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("now_trad_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pj_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_rate")));
String rela_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_dept")));
String caus_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("caus_prd")));
String caus_midl = Util.Uni2Ksc(Util.checkString(req.getParameter("caus_midl")));
String caus_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("caus_dtls")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setMake_un_norm_occr_dt(make_un_norm_occr_dt);
dm.setFac_clsf(fac_clsf);
dm.setNow_trad_cd(now_trad_cd);
dm.setMedi_cd(medi_cd);
dm.setPj_rate(pj_rate);
dm.setRela_dept(rela_dept);
dm.setCaus_prd(caus_prd);
dm.setCaus_midl(caus_midl);
dm.setCaus_dtls(caus_dtls);
dm.setRemk(remk);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 17:54:55 KST 2009 */