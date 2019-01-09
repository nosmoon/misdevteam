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


public class PR_PRTEXEC_2005_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String occr_yy;
	public String occr_seq;
	public String occr_dt;
	public String seq;
	public String mode;
	public String cmpy_cd;
	public String issu_dt;
	public String medi_cd;
	public String sect_cd;
	public String fac_clsf;
	public String prt_dt;
	public String prt_tm;
	public String tm_in_yn;
	public String add_prt_seq;
	public String pcnt;
	public String clr_pcnt;
	public String std;
	public String dual_out_clsf;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTEXEC_2005_ADM(){}
	public PR_PRTEXEC_2005_ADM(String occr_yy, String occr_seq, String occr_dt, String seq, String mode, String cmpy_cd, String issu_dt, String medi_cd, String sect_cd, String fac_clsf, String prt_dt, String prt_tm, String tm_in_yn, String add_prt_seq, String pcnt, String clr_pcnt, String std, String dual_out_clsf, String remk, String incmg_pers_ipaddr, String incmg_pers){
		this.occr_yy = occr_yy;
		this.occr_seq = occr_seq;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.fac_clsf = fac_clsf;
		this.prt_dt = prt_dt;
		this.prt_tm = prt_tm;
		this.tm_in_yn = tm_in_yn;
		this.add_prt_seq = add_prt_seq;
		this.pcnt = pcnt;
		this.clr_pcnt = clr_pcnt;
		this.std = std;
		this.dual_out_clsf = dual_out_clsf;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
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

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setPrt_tm(String prt_tm){
		this.prt_tm = prt_tm;
	}

	public void setTm_in_yn(String tm_in_yn){
		this.tm_in_yn = tm_in_yn;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getOccr_seq(){
		return this.occr_seq;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getPrt_tm(){
		return this.prt_tm;
	}

	public String getTm_in_yn(){
		return this.tm_in_yn;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getStd(){
		return this.std;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_2005_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_2005_ADM dm = (PR_PRTEXEC_2005_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.occr_yy);
		cstmt.setString(4, dm.occr_seq);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.mode);
		cstmt.setString(8, dm.cmpy_cd);
		cstmt.setString(9, dm.issu_dt);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.sect_cd);
		cstmt.setString(12, dm.fac_clsf);
		cstmt.setString(13, dm.prt_dt);
		cstmt.setString(14, dm.prt_tm);
		cstmt.setString(15, dm.tm_in_yn);
		cstmt.setString(16, dm.add_prt_seq);
		cstmt.setString(17, dm.pcnt);
		cstmt.setString(18, dm.clr_pcnt);
		cstmt.setString(19, dm.std);
		cstmt.setString(20, dm.dual_out_clsf);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.incmg_pers_ipaddr);
		cstmt.setString(23, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_2005_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("occr_yy = [" + getOccr_yy() + "]");
		System.out.println("occr_seq = [" + getOccr_seq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("prt_tm = [" + getPrt_tm() + "]");
		System.out.println("tm_in_yn = [" + getTm_in_yn() + "]");
		System.out.println("add_prt_seq = [" + getAdd_prt_seq() + "]");
		System.out.println("pcnt = [" + getPcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("std = [" + getStd() + "]");
		System.out.println("dual_out_clsf = [" + getDual_out_clsf() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String occr_yy = req.getParameter("occr_yy");
if( occr_yy == null){
	System.out.println(this.toString+" : occr_yy is null" );
}else{
	System.out.println(this.toString+" : occr_yy is "+occr_yy );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String prt_tm = req.getParameter("prt_tm");
if( prt_tm == null){
	System.out.println(this.toString+" : prt_tm is null" );
}else{
	System.out.println(this.toString+" : prt_tm is "+prt_tm );
}
String tm_in_yn = req.getParameter("tm_in_yn");
if( tm_in_yn == null){
	System.out.println(this.toString+" : tm_in_yn is null" );
}else{
	System.out.println(this.toString+" : tm_in_yn is "+tm_in_yn );
}
String add_prt_seq = req.getParameter("add_prt_seq");
if( add_prt_seq == null){
	System.out.println(this.toString+" : add_prt_seq is null" );
}else{
	System.out.println(this.toString+" : add_prt_seq is "+add_prt_seq );
}
String pcnt = req.getParameter("pcnt");
if( pcnt == null){
	System.out.println(this.toString+" : pcnt is null" );
}else{
	System.out.println(this.toString+" : pcnt is "+pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
}
String dual_out_clsf = req.getParameter("dual_out_clsf");
if( dual_out_clsf == null){
	System.out.println(this.toString+" : dual_out_clsf is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf is "+dual_out_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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

String occr_yy = Util.checkString(req.getParameter("occr_yy"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String prt_tm = Util.checkString(req.getParameter("prt_tm"));
String tm_in_yn = Util.checkString(req.getParameter("tm_in_yn"));
String add_prt_seq = Util.checkString(req.getParameter("add_prt_seq"));
String pcnt = Util.checkString(req.getParameter("pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String std = Util.checkString(req.getParameter("std"));
String dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String occr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_yy")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String prt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_tm")));
String tm_in_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tm_in_yn")));
String add_prt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("add_prt_seq")));
String pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String dual_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setOccr_yy(occr_yy);
dm.setOccr_seq(occr_seq);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setFac_clsf(fac_clsf);
dm.setPrt_dt(prt_dt);
dm.setPrt_tm(prt_tm);
dm.setTm_in_yn(tm_in_yn);
dm.setAdd_prt_seq(add_prt_seq);
dm.setPcnt(pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setStd(std);
dm.setDual_out_clsf(dual_out_clsf);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 22:04:27 KST 2009 */