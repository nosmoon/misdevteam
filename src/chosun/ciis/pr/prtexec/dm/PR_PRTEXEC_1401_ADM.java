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


public class PR_PRTEXEC_1401_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String medi_clsf;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String sep_prtn_pcnt;
	public String hdqt_paper_nm;
	public String pc_paper_nm;
	public String sn_paper_nm;
	public String bp_paper_nm;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTEXEC_1401_ADM(){}
	public PR_PRTEXEC_1401_ADM(String cmpy_cd, String mode, String occr_dt, String seq, String issu_dt, String medi_clsf, String issu_pcnt, String clr_pcnt, String bw_pcnt, String sep_prtn_pcnt, String hdqt_paper_nm, String pc_paper_nm, String sn_paper_nm, String bp_paper_nm, String remk, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.issu_dt = issu_dt;
		this.medi_clsf = medi_clsf;
		this.issu_pcnt = issu_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.bw_pcnt = bw_pcnt;
		this.sep_prtn_pcnt = sep_prtn_pcnt;
		this.hdqt_paper_nm = hdqt_paper_nm;
		this.pc_paper_nm = pc_paper_nm;
		this.sn_paper_nm = sn_paper_nm;
		this.bp_paper_nm = bp_paper_nm;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setSep_prtn_pcnt(String sep_prtn_pcnt){
		this.sep_prtn_pcnt = sep_prtn_pcnt;
	}

	public void setHdqt_paper_nm(String hdqt_paper_nm){
		this.hdqt_paper_nm = hdqt_paper_nm;
	}

	public void setPc_paper_nm(String pc_paper_nm){
		this.pc_paper_nm = pc_paper_nm;
	}

	public void setSn_paper_nm(String sn_paper_nm){
		this.sn_paper_nm = sn_paper_nm;
	}

	public void setBp_paper_nm(String bp_paper_nm){
		this.bp_paper_nm = bp_paper_nm;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getSep_prtn_pcnt(){
		return this.sep_prtn_pcnt;
	}

	public String getHdqt_paper_nm(){
		return this.hdqt_paper_nm;
	}

	public String getPc_paper_nm(){
		return this.pc_paper_nm;
	}

	public String getSn_paper_nm(){
		return this.sn_paper_nm;
	}

	public String getBp_paper_nm(){
		return this.bp_paper_nm;
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
		 return "{ call MISMAT.SP_PR_PRTEXEC_1401_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_1401_ADM dm = (PR_PRTEXEC_1401_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.medi_clsf);
		cstmt.setString(9, dm.issu_pcnt);
		cstmt.setString(10, dm.clr_pcnt);
		cstmt.setString(11, dm.bw_pcnt);
		cstmt.setString(12, dm.sep_prtn_pcnt);
		cstmt.setString(13, dm.hdqt_paper_nm);
		cstmt.setString(14, dm.pc_paper_nm);
		cstmt.setString(15, dm.sn_paper_nm);
		cstmt.setString(16, dm.bp_paper_nm);
		cstmt.setString(17, dm.remk);
		cstmt.setString(18, dm.incmg_pers_ipaddr);
		cstmt.setString(19, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_1401_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("bw_pcnt = [" + getBw_pcnt() + "]");
		System.out.println("sep_prtn_pcnt = [" + getSep_prtn_pcnt() + "]");
		System.out.println("hdqt_paper_nm = [" + getHdqt_paper_nm() + "]");
		System.out.println("pc_paper_nm = [" + getPc_paper_nm() + "]");
		System.out.println("sn_paper_nm = [" + getSn_paper_nm() + "]");
		System.out.println("bp_paper_nm = [" + getBp_paper_nm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
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
String sep_prtn_pcnt = req.getParameter("sep_prtn_pcnt");
if( sep_prtn_pcnt == null){
	System.out.println(this.toString+" : sep_prtn_pcnt is null" );
}else{
	System.out.println(this.toString+" : sep_prtn_pcnt is "+sep_prtn_pcnt );
}
String hdqt_paper_nm = req.getParameter("hdqt_paper_nm");
if( hdqt_paper_nm == null){
	System.out.println(this.toString+" : hdqt_paper_nm is null" );
}else{
	System.out.println(this.toString+" : hdqt_paper_nm is "+hdqt_paper_nm );
}
String pc_paper_nm = req.getParameter("pc_paper_nm");
if( pc_paper_nm == null){
	System.out.println(this.toString+" : pc_paper_nm is null" );
}else{
	System.out.println(this.toString+" : pc_paper_nm is "+pc_paper_nm );
}
String sn_paper_nm = req.getParameter("sn_paper_nm");
if( sn_paper_nm == null){
	System.out.println(this.toString+" : sn_paper_nm is null" );
}else{
	System.out.println(this.toString+" : sn_paper_nm is "+sn_paper_nm );
}
String bp_paper_nm = req.getParameter("bp_paper_nm");
if( bp_paper_nm == null){
	System.out.println(this.toString+" : bp_paper_nm is null" );
}else{
	System.out.println(this.toString+" : bp_paper_nm is "+bp_paper_nm );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String bw_pcnt = Util.checkString(req.getParameter("bw_pcnt"));
String sep_prtn_pcnt = Util.checkString(req.getParameter("sep_prtn_pcnt"));
String hdqt_paper_nm = Util.checkString(req.getParameter("hdqt_paper_nm"));
String pc_paper_nm = Util.checkString(req.getParameter("pc_paper_nm"));
String sn_paper_nm = Util.checkString(req.getParameter("sn_paper_nm"));
String bp_paper_nm = Util.checkString(req.getParameter("bp_paper_nm"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String bw_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pcnt")));
String sep_prtn_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_prtn_pcnt")));
String hdqt_paper_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_paper_nm")));
String pc_paper_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pc_paper_nm")));
String sn_paper_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sn_paper_nm")));
String bp_paper_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bp_paper_nm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIssu_dt(issu_dt);
dm.setMedi_clsf(medi_clsf);
dm.setIssu_pcnt(issu_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setBw_pcnt(bw_pcnt);
dm.setSep_prtn_pcnt(sep_prtn_pcnt);
dm.setHdqt_paper_nm(hdqt_paper_nm);
dm.setPc_paper_nm(pc_paper_nm);
dm.setSn_paper_nm(sn_paper_nm);
dm.setBp_paper_nm(bp_paper_nm);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 13:15:00 KST 2009 */