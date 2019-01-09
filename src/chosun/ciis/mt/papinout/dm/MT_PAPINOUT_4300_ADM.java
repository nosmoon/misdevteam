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


public class MT_PAPINOUT_4300_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mode;
	public String occr_dt;
	public String seq;
	public String cut_err_occr_dt;
	public String fac_clsf;
	public String papcmpy_cd;
	public String cut_err_tms;
	public String cut_err_point;
	public String cut_err_caus_prd;
	public String cut_err_caus_midl;
	public String cut_err_caus_plac;
	public String remk;

	public MT_PAPINOUT_4300_ADM(){}
	public MT_PAPINOUT_4300_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String mode, String occr_dt, String seq, String cut_err_occr_dt, String fac_clsf, String papcmpy_cd, String cut_err_tms, String cut_err_point, String cut_err_caus_prd, String cut_err_caus_midl, String cut_err_caus_plac, String remk){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.cut_err_occr_dt = cut_err_occr_dt;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.cut_err_tms = cut_err_tms;
		this.cut_err_point = cut_err_point;
		this.cut_err_caus_prd = cut_err_caus_prd;
		this.cut_err_caus_midl = cut_err_caus_midl;
		this.cut_err_caus_plac = cut_err_caus_plac;
		this.remk = remk;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCut_err_occr_dt(String cut_err_occr_dt){
		this.cut_err_occr_dt = cut_err_occr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setCut_err_tms(String cut_err_tms){
		this.cut_err_tms = cut_err_tms;
	}

	public void setCut_err_point(String cut_err_point){
		this.cut_err_point = cut_err_point;
	}

	public void setCut_err_caus_prd(String cut_err_caus_prd){
		this.cut_err_caus_prd = cut_err_caus_prd;
	}

	public void setCut_err_caus_midl(String cut_err_caus_midl){
		this.cut_err_caus_midl = cut_err_caus_midl;
	}

	public void setCut_err_caus_plac(String cut_err_caus_plac){
		this.cut_err_caus_plac = cut_err_caus_plac;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCut_err_occr_dt(){
		return this.cut_err_occr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getCut_err_tms(){
		return this.cut_err_tms;
	}

	public String getCut_err_point(){
		return this.cut_err_point;
	}

	public String getCut_err_caus_prd(){
		return this.cut_err_caus_prd;
	}

	public String getCut_err_caus_midl(){
		return this.cut_err_caus_midl;
	}

	public String getCut_err_caus_plac(){
		return this.cut_err_caus_plac;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_4300_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_4300_ADM dm = (MT_PAPINOUT_4300_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.cut_err_occr_dt);
		cstmt.setString(10, dm.fac_clsf);
		cstmt.setString(11, dm.papcmpy_cd);
		cstmt.setString(12, dm.cut_err_tms);
		cstmt.setString(13, dm.cut_err_point);
		cstmt.setString(14, dm.cut_err_caus_prd);
		cstmt.setString(15, dm.cut_err_caus_midl);
		cstmt.setString(16, dm.cut_err_caus_plac);
		cstmt.setString(17, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_4300_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("cut_err_occr_dt = [" + getCut_err_occr_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("cut_err_tms = [" + getCut_err_tms() + "]");
		System.out.println("cut_err_point = [" + getCut_err_point() + "]");
		System.out.println("cut_err_caus_prd = [" + getCut_err_caus_prd() + "]");
		System.out.println("cut_err_caus_midl = [" + getCut_err_caus_midl() + "]");
		System.out.println("cut_err_caus_plac = [" + getCut_err_caus_plac() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String cut_err_occr_dt = req.getParameter("cut_err_occr_dt");
if( cut_err_occr_dt == null){
	System.out.println(this.toString+" : cut_err_occr_dt is null" );
}else{
	System.out.println(this.toString+" : cut_err_occr_dt is "+cut_err_occr_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String cut_err_tms = req.getParameter("cut_err_tms");
if( cut_err_tms == null){
	System.out.println(this.toString+" : cut_err_tms is null" );
}else{
	System.out.println(this.toString+" : cut_err_tms is "+cut_err_tms );
}
String cut_err_point = req.getParameter("cut_err_point");
if( cut_err_point == null){
	System.out.println(this.toString+" : cut_err_point is null" );
}else{
	System.out.println(this.toString+" : cut_err_point is "+cut_err_point );
}
String cut_err_caus_prd = req.getParameter("cut_err_caus_prd");
if( cut_err_caus_prd == null){
	System.out.println(this.toString+" : cut_err_caus_prd is null" );
}else{
	System.out.println(this.toString+" : cut_err_caus_prd is "+cut_err_caus_prd );
}
String cut_err_caus_midl = req.getParameter("cut_err_caus_midl");
if( cut_err_caus_midl == null){
	System.out.println(this.toString+" : cut_err_caus_midl is null" );
}else{
	System.out.println(this.toString+" : cut_err_caus_midl is "+cut_err_caus_midl );
}
String cut_err_caus_plac = req.getParameter("cut_err_caus_plac");
if( cut_err_caus_plac == null){
	System.out.println(this.toString+" : cut_err_caus_plac is null" );
}else{
	System.out.println(this.toString+" : cut_err_caus_plac is "+cut_err_caus_plac );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String cut_err_occr_dt = Util.checkString(req.getParameter("cut_err_occr_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String cut_err_tms = Util.checkString(req.getParameter("cut_err_tms"));
String cut_err_point = Util.checkString(req.getParameter("cut_err_point"));
String cut_err_caus_prd = Util.checkString(req.getParameter("cut_err_caus_prd"));
String cut_err_caus_midl = Util.checkString(req.getParameter("cut_err_caus_midl"));
String cut_err_caus_plac = Util.checkString(req.getParameter("cut_err_caus_plac"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cut_err_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_occr_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String cut_err_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_tms")));
String cut_err_point = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_point")));
String cut_err_caus_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_caus_prd")));
String cut_err_caus_midl = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_caus_midl")));
String cut_err_caus_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_caus_plac")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setCut_err_occr_dt(cut_err_occr_dt);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setCut_err_tms(cut_err_tms);
dm.setCut_err_point(cut_err_point);
dm.setCut_err_caus_prd(cut_err_caus_prd);
dm.setCut_err_caus_midl(cut_err_caus_midl);
dm.setCut_err_caus_plac(cut_err_caus_plac);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 15:28:46 KST 2009 */