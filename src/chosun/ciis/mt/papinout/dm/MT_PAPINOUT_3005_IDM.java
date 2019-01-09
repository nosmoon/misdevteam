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


public class MT_PAPINOUT_3005_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String issu_dt;
	public String pj_kind_dtls;
	public String medi_cd_dtls;
	public String sect_cd_dtls;
	public String m_pj_wgt_dtls;
	public String m_pj_qunt_dtls;
	public String m_pj_prt_dt_dtls;
	public String paper_clsf_head;
	public String issu_pcnt_head;
	public String prt_clsf_head;
	public String slip_qty_head;
	public String somo_wgt_head;
	public String somo_paji_head;
	public String avgynag_head;
	public String medi_cd_head;
	public String sect_cd_head;
	public String prt_dt;
	public String gita_pj_wgt;
	public String etc_pj_resn_cd;
	public String remk;
	public String prt_clsf_dtls;
	public String paper_clsf_dtls;
	public String totprtwgt;
	public String pers_ipaddr;
	public String pers;

	public MT_PAPINOUT_3005_IDM(){}
	public MT_PAPINOUT_3005_IDM(String cmpy_cd, String fac_clsf, String issu_dt, String pj_kind_dtls, String medi_cd_dtls, String sect_cd_dtls, String m_pj_wgt_dtls, String m_pj_qunt_dtls, String m_pj_prt_dt_dtls, String paper_clsf_head, String issu_pcnt_head, String prt_clsf_head, String slip_qty_head, String somo_wgt_head, String somo_paji_head, String avgynag_head, String medi_cd_head, String sect_cd_head, String prt_dt, String gita_pj_wgt, String etc_pj_resn_cd, String remk, String prt_clsf_dtls, String paper_clsf_dtls, String totprtwgt, String pers_ipaddr, String pers){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.issu_dt = issu_dt;
		this.pj_kind_dtls = pj_kind_dtls;
		this.medi_cd_dtls = medi_cd_dtls;
		this.sect_cd_dtls = sect_cd_dtls;
		this.m_pj_wgt_dtls = m_pj_wgt_dtls;
		this.m_pj_qunt_dtls = m_pj_qunt_dtls;
		this.m_pj_prt_dt_dtls = m_pj_prt_dt_dtls;
		this.paper_clsf_head = paper_clsf_head;
		this.issu_pcnt_head = issu_pcnt_head;
		this.prt_clsf_head = prt_clsf_head;
		this.slip_qty_head = slip_qty_head;
		this.somo_wgt_head = somo_wgt_head;
		this.somo_paji_head = somo_paji_head;
		this.avgynag_head = avgynag_head;
		this.medi_cd_head = medi_cd_head;
		this.sect_cd_head = sect_cd_head;
		this.prt_dt = prt_dt;
		this.gita_pj_wgt = gita_pj_wgt;
		this.etc_pj_resn_cd = etc_pj_resn_cd;
		this.remk = remk;
		this.prt_clsf_dtls = prt_clsf_dtls;
		this.paper_clsf_dtls	= paper_clsf_dtls;
		this.totprtwgt = totprtwgt;
		this.pers_ipaddr = pers_ipaddr;
		this.pers = pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setPj_kind_dtls(String pj_kind_dtls){
		this.pj_kind_dtls = pj_kind_dtls;
	}

	public void setMedi_cd_dtls(String medi_cd_dtls){
		this.medi_cd_dtls = medi_cd_dtls;
	}

	public void setSect_cd_dtls(String sect_cd_dtls){
		this.sect_cd_dtls = sect_cd_dtls;
	}

	public void setM_pj_wgt_dtls(String m_pj_wgt_dtls){
		this.m_pj_wgt_dtls = m_pj_wgt_dtls;
	}

	public void setM_pj_qunt_dtls(String m_pj_qunt_dtls){
		this.m_pj_qunt_dtls = m_pj_qunt_dtls;
	}

	public void setM_pj_prt_dt_dtls(String m_pj_prt_dt_dtls){
		this.m_pj_prt_dt_dtls = m_pj_prt_dt_dtls;
	}

	public void setPaper_clsf_head(String paper_clsf_head){
		this.paper_clsf_head = paper_clsf_head;
	}
	
	public void setIssu_pcnt_head(String issu_pcnt_head){
		this.issu_pcnt_head = issu_pcnt_head;
	}

	public void setPrt_clsf_head(String prt_clsf_head){
		this.prt_clsf_head = prt_clsf_head;
	}

	public void setSlip_qty_head(String slip_qty_head){
		this.slip_qty_head = slip_qty_head;
	}

	public void setSomo_wgt_head(String somo_wgt_head){
		this.somo_wgt_head = somo_wgt_head;
	}

	public void setSomo_paji_head(String somo_paji_head){
		this.somo_paji_head = somo_paji_head;
	}

	public void setAvgynag_head(String avgynag_head){
		this.avgynag_head = avgynag_head;
	}

	public void setMedi_cd_head(String medi_cd_head){
		this.medi_cd_head = medi_cd_head;
	}

	public void setSect_cd_head(String sect_cd_head){
		this.sect_cd_head = sect_cd_head;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setGita_pj_wgt(String gita_pj_wgt){
		this.gita_pj_wgt = gita_pj_wgt;
	}

	public void setEtc_pj_resn_cd(String etc_pj_resn_cd){
		this.etc_pj_resn_cd = etc_pj_resn_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPrt_clsf_dtls(String prt_clsf_dtls){
		this.prt_clsf_dtls = prt_clsf_dtls;
	}

	public void setPaper_clsf_dtls(String paper_clsf_dtls){
		this.paper_clsf_dtls = paper_clsf_dtls;
	}
	
	public void setTotprtwgt(String totprtwgt){
		this.totprtwgt = totprtwgt;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers(String pers){
		this.pers = pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getPj_kind_dtls(){
		return this.pj_kind_dtls;
	}

	public String getMedi_cd_dtls(){
		return this.medi_cd_dtls;
	}

	public String getSect_cd_dtls(){
		return this.sect_cd_dtls;
	}

	public String getM_pj_wgt_dtls(){
		return this.m_pj_wgt_dtls;
	}

	public String getM_pj_qunt_dtls(){
		return this.m_pj_qunt_dtls;
	}

	public String getM_pj_prt_dt_dtls(){
		return this.m_pj_prt_dt_dtls;
	}

	public String getPaper_clsf_head(){
		return this.paper_clsf_head;
	}

	public String getIssu_pcnt_head(){
		return this.issu_pcnt_head;
	}

	public String getPrt_clsf_head(){
		return this.prt_clsf_head;
	}
	
	public String getSlip_qty_head(){
		return this.slip_qty_head;
	}

	public String getSomo_wgt_head(){
		return this.somo_wgt_head;
	}

	public String getSomo_paji_head(){
		return this.somo_paji_head;
	}

	public String getAvgynag_head(){
		return this.avgynag_head;
	}

	public String getMedi_cd_head(){
		return this.medi_cd_head;
	}

	public String getSect_cd_head(){
		return this.sect_cd_head;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getGita_pj_wgt(){
		return this.gita_pj_wgt;
	}

	public String getEtc_pj_resn_cd(){
		return this.etc_pj_resn_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPrt_clsf_dtls(){
		return this.prt_clsf_dtls;
	}
	
	public String getPaper_clsf_dtls(){
		return this.paper_clsf_dtls;
	}

	public String getTotprtwgt(){
		return this.totprtwgt;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers(){
		return this.pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_3005_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_3005_IDM dm = (MT_PAPINOUT_3005_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.pj_kind_dtls);
		cstmt.setString(7, dm.medi_cd_dtls);
		cstmt.setString(8, dm.sect_cd_dtls);
		cstmt.setString(9, dm.m_pj_wgt_dtls);
		cstmt.setString(10, dm.m_pj_qunt_dtls);
		cstmt.setString(11, dm.m_pj_prt_dt_dtls);
		cstmt.setString(12, dm.paper_clsf_head);
		cstmt.setString(13, dm.issu_pcnt_head);
		cstmt.setString(14, dm.prt_clsf_head);
		cstmt.setString(15, dm.slip_qty_head);
		cstmt.setString(16, dm.somo_wgt_head);
		cstmt.setString(17, dm.somo_paji_head);
		cstmt.setString(18, dm.avgynag_head);
		cstmt.setString(19, dm.medi_cd_head);
		cstmt.setString(20, dm.sect_cd_head);
		cstmt.setString(21, dm.prt_dt);
		cstmt.setString(22, dm.gita_pj_wgt);
		cstmt.setString(23, dm.etc_pj_resn_cd);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.prt_clsf_dtls);
		cstmt.setString(26, dm.paper_clsf_dtls);
		cstmt.setString(27, dm.totprtwgt);
		cstmt.setString(28, dm.pers_ipaddr);
		cstmt.setString(29, dm.pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_3005_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("pj_kind_dtls = [" + getPj_kind_dtls() + "]");
		System.out.println("medi_cd_dtls = [" + getMedi_cd_dtls() + "]");
		System.out.println("sect_cd_dtls = [" + getSect_cd_dtls() + "]");
		System.out.println("m_pj_wgt_dtls = [" + getM_pj_wgt_dtls() + "]");
		System.out.println("m_pj_qunt_dtls = [" + getM_pj_qunt_dtls() + "]");
		System.out.println("m_pj_prt_dt_dtls = [" + getM_pj_prt_dt_dtls() + "]");
		System.out.println("paper_clsf_head = [" + getPaper_clsf_head() + "]");
		System.out.println("issu_pcnt_head = [" + getIssu_pcnt_head() + "]");
		System.out.println("prt_clsf_head = [" + getPrt_clsf_head() + "]");
		System.out.println("slip_qty_head = [" + getSlip_qty_head() + "]");
		System.out.println("somo_wgt_head = [" + getSomo_wgt_head() + "]");
		System.out.println("somo_paji_head = [" + getSomo_paji_head() + "]");
		System.out.println("avgynag_head = [" + getAvgynag_head() + "]");
		System.out.println("medi_cd_head = [" + getMedi_cd_head() + "]");
		System.out.println("sect_cd_head = [" + getSect_cd_head() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("gita_pj_wgt = [" + getGita_pj_wgt() + "]");
		System.out.println("etc_pj_resn_cd = [" + getEtc_pj_resn_cd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("prt_clsf_dtls = [" + getPrt_clsf_dtls() + "]");
		System.out.println("paper_clsf_dtls = [" + getPaper_clsf_dtls() + "]");
		System.out.println("totprtwgt = [" + getTotprtwgt() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers = [" + getPers() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String pj_kind_dtls = req.getParameter("pj_kind_dtls");
if( pj_kind_dtls == null){
	System.out.println(this.toString+" : pj_kind_dtls is null" );
}else{
	System.out.println(this.toString+" : pj_kind_dtls is "+pj_kind_dtls );
}
String medi_cd_dtls = req.getParameter("medi_cd_dtls");
if( medi_cd_dtls == null){
	System.out.println(this.toString+" : medi_cd_dtls is null" );
}else{
	System.out.println(this.toString+" : medi_cd_dtls is "+medi_cd_dtls );
}
String sect_cd_dtls = req.getParameter("sect_cd_dtls");
if( sect_cd_dtls == null){
	System.out.println(this.toString+" : sect_cd_dtls is null" );
}else{
	System.out.println(this.toString+" : sect_cd_dtls is "+sect_cd_dtls );
}
String m_pj_wgt_dtls = req.getParameter("m_pj_wgt_dtls");
if( m_pj_wgt_dtls == null){
	System.out.println(this.toString+" : m_pj_wgt_dtls is null" );
}else{
	System.out.println(this.toString+" : m_pj_wgt_dtls is "+m_pj_wgt_dtls );
}
String m_pj_qunt_dtls = req.getParameter("m_pj_qunt_dtls");
if( m_pj_qunt_dtls == null){
	System.out.println(this.toString+" : m_pj_qunt_dtls is null" );
}else{
	System.out.println(this.toString+" : m_pj_qunt_dtls is "+m_pj_qunt_dtls );
}
String m_pj_prt_dt_dtls = req.getParameter("m_pj_prt_dt_dtls");
if( m_pj_prt_dt_dtls == null){
	System.out.println(this.toString+" : m_pj_prt_dt_dtls is null" );
}else{
	System.out.println(this.toString+" : m_pj_prt_dt_dtls is "+m_pj_prt_dt_dtls );
}
String paper_clsf_head = req.getParameter("paper_clsf_head");
if( paper_clsf_head == null){
	System.out.println(this.toString+" : paper_clsf_head is null" );
}else{
	System.out.println(this.toString+" : paper_clsf_head is "+paper_clsf_head );
}
String issu_pcnt_head = req.getParameter("issu_pcnt_head");
if( issu_pcnt_head == null){
	System.out.println(this.toString+" : issu_pcnt_head is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt_head is "+issu_pcnt_head );
}
String prt_clsf_head = req.getParameter("prt_clsf_head");
if( prt_clsf_head == null){
	System.out.println(this.toString+" : prt_clsf_head is null" );
}else{
	System.out.println(this.toString+" : prt_clsf_head is "+prt_clsf_head );
}
String slip_qty_head = req.getParameter("slip_qty_head");
if( slip_qty_head == null){
	System.out.println(this.toString+" : slip_qty_head is null" );
}else{
	System.out.println(this.toString+" : slip_qty_head is "+slip_qty_head );
}
String somo_wgt_head = req.getParameter("somo_wgt_head");
if( somo_wgt_head == null){
	System.out.println(this.toString+" : somo_wgt_head is null" );
}else{
	System.out.println(this.toString+" : somo_wgt_head is "+somo_wgt_head );
}
String somo_paji_head = req.getParameter("somo_paji_head");
if( somo_paji_head == null){
	System.out.println(this.toString+" : somo_paji_head is null" );
}else{
	System.out.println(this.toString+" : somo_paji_head is "+somo_paji_head );
}
String avgynag_head = req.getParameter("avgynag_head");
if( avgynag_head == null){
	System.out.println(this.toString+" : avgynag_head is null" );
}else{
	System.out.println(this.toString+" : avgynag_head is "+avgynag_head );
}
String medi_cd_head = req.getParameter("medi_cd_head");
if( medi_cd_head == null){
	System.out.println(this.toString+" : medi_cd_head is null" );
}else{
	System.out.println(this.toString+" : medi_cd_head is "+medi_cd_head );
}
String sect_cd_head = req.getParameter("sect_cd_head");
if( sect_cd_head == null){
	System.out.println(this.toString+" : sect_cd_head is null" );
}else{
	System.out.println(this.toString+" : sect_cd_head is "+sect_cd_head );
}
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String gita_pj_wgt = req.getParameter("gita_pj_wgt");
if( gita_pj_wgt == null){
	System.out.println(this.toString+" : gita_pj_wgt is null" );
}else{
	System.out.println(this.toString+" : gita_pj_wgt is "+gita_pj_wgt );
}
String etc_pj_resn_cd = req.getParameter("etc_pj_resn_cd");
if( etc_pj_resn_cd == null){
	System.out.println(this.toString+" : etc_pj_resn_cd is null" );
}else{
	System.out.println(this.toString+" : etc_pj_resn_cd is "+etc_pj_resn_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String prt_clsf_dtls = req.getParameter("prt_clsf_dtls");
if( prt_clsf_dtls == null){
	System.out.println(this.toString+" : prt_clsf_dtls is null" );
}else{
	System.out.println(this.toString+" : prt_clsf_dtls is "+prt_clsf_dtls );
}
String totprtwgt = req.getParameter("totprtwgt");
if( totprtwgt == null){
	System.out.println(this.toString+" : totprtwgt is null" );
}else{
	System.out.println(this.toString+" : totprtwgt is "+totprtwgt );
}
String pers_ipaddr = req.getParameter("pers_ipaddr");
if( pers_ipaddr == null){
	System.out.println(this.toString+" : pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : pers_ipaddr is "+pers_ipaddr );
}
String pers = req.getParameter("pers");
if( pers == null){
	System.out.println(this.toString+" : pers is null" );
}else{
	System.out.println(this.toString+" : pers is "+pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String pj_kind_dtls = Util.checkString(req.getParameter("pj_kind_dtls"));
String medi_cd_dtls = Util.checkString(req.getParameter("medi_cd_dtls"));
String sect_cd_dtls = Util.checkString(req.getParameter("sect_cd_dtls"));
String m_pj_wgt_dtls = Util.checkString(req.getParameter("m_pj_wgt_dtls"));
String m_pj_qunt_dtls = Util.checkString(req.getParameter("m_pj_qunt_dtls"));
String m_pj_prt_dt_dtls = Util.checkString(req.getParameter("m_pj_prt_dt_dtls"));
String paper_clsf_head = Util.checkString(req.getParameter("paper_clsf_head"));
String issu_pcnt_head = Util.checkString(req.getParameter("issu_pcnt_head"));
String prt_clsf_head = Util.checkString(req.getParameter("prt_clsf_head"));
String slip_qty_head = Util.checkString(req.getParameter("slip_qty_head"));
String somo_wgt_head = Util.checkString(req.getParameter("somo_wgt_head"));
String somo_paji_head = Util.checkString(req.getParameter("somo_paji_head"));
String avgynag_head = Util.checkString(req.getParameter("avgynag_head"));
String medi_cd_head = Util.checkString(req.getParameter("medi_cd_head"));
String sect_cd_head = Util.checkString(req.getParameter("sect_cd_head"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String gita_pj_wgt = Util.checkString(req.getParameter("gita_pj_wgt"));
String etc_pj_resn_cd = Util.checkString(req.getParameter("etc_pj_resn_cd"));
String remk = Util.checkString(req.getParameter("remk"));
String prt_clsf_dtls = Util.checkString(req.getParameter("prt_clsf_dtls"));
String totprtwgt = Util.checkString(req.getParameter("totprtwgt"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers = Util.checkString(req.getParameter("pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String pj_kind_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind_dtls")));
String medi_cd_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_dtls")));
String sect_cd_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_dtls")));
String m_pj_wgt_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("m_pj_wgt_dtls")));
String m_pj_qunt_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("m_pj_qunt_dtls")));
String m_pj_prt_dt_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("m_pj_prt_dt_dtls")));
String paper_clsf_head = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_clsf_head")));
String issu_pcnt_head = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt_head")));
String prt_clsf_head = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf_head")));
String slip_qty_head = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty_head")));
String somo_wgt_head = Util.Uni2Ksc(Util.checkString(req.getParameter("somo_wgt_head")));
String somo_paji_head = Util.Uni2Ksc(Util.checkString(req.getParameter("somo_paji_head")));
String avgynag_head = Util.Uni2Ksc(Util.checkString(req.getParameter("avgynag_head")));
String medi_cd_head = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_head")));
String sect_cd_head = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_head")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String gita_pj_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("gita_pj_wgt")));
String etc_pj_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_pj_resn_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String prt_clsf_dtls = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf_dtls")));
String totprtwgt = Util.Uni2Ksc(Util.checkString(req.getParameter("totprtwgt")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers = Util.Uni2Ksc(Util.checkString(req.getParameter("pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setIssu_dt(issu_dt);
dm.setPj_kind_dtls(pj_kind_dtls);
dm.setMedi_cd_dtls(medi_cd_dtls);
dm.setSect_cd_dtls(sect_cd_dtls);
dm.setM_pj_wgt_dtls(m_pj_wgt_dtls);
dm.setM_pj_qunt_dtls(m_pj_qunt_dtls);
dm.setM_pj_prt_dt_dtls(m_pj_prt_dt_dtls);
dm.setPaper_clsf_head(paper_clsf_head);
dm.setIssu_pcnt_head(issu_pcnt_head);
dm.setPrt_clsf_head(prt_clsf_head);
dm.setSlip_qty_head(slip_qty_head);
dm.setSomo_wgt_head(somo_wgt_head);
dm.setSomo_paji_head(somo_paji_head);
dm.setAvgynag_head(avgynag_head);
dm.setMedi_cd_head(medi_cd_head);
dm.setSect_cd_head(sect_cd_head);
dm.setPrt_dt(prt_dt);
dm.setGita_pj_wgt(gita_pj_wgt);
dm.setEtc_pj_resn_cd(etc_pj_resn_cd);
dm.setRemk(remk);
dm.setPrt_clsf_dtls(prt_clsf_dtls);
dm.setTotprtwgt(totprtwgt);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers(pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 15:56:01 KST 2009 */