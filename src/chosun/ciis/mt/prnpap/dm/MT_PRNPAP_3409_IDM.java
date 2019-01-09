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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3409_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String issu_dt;
	public String wgt_clsf;
	public String issu_dt_ar;
	public String prt_dt_ar;
	public String medi_cd_ar;
	public String sect_cd_ar;
	public String pre_prt_clsf_ar;
	public String hdqt_paper_clsf_ar;
	public String pj_kind_ar;
	public String cnt_ar;
	public String wgt_ar;
	public String blk_cmpy_cd_ar;
	public String blk_occr_dt_ar;
	public String blk_seq_ar;
	public String bw_pj_wgt_ar;
	public String pers_ipaddr;
	public String pers_id;

	public MT_PRNPAP_3409_IDM(){}
	public MT_PRNPAP_3409_IDM(String cmpy_cd, String fac_clsf, String issu_dt, String wgt_clsf, String issu_dt_ar, String prt_dt_ar, String medi_cd_ar, String sect_cd_ar, String pre_prt_clsf_ar, String hdqt_paper_clsf_ar, String pj_kind_ar, String cnt_ar, String wgt_ar, String blk_cmpy_cd_ar, String blk_occr_dt_ar, String blk_seq_ar, String bw_pj_wgt_ar, String pers_ipaddr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.issu_dt = issu_dt;
		this.wgt_clsf = wgt_clsf;
		this.issu_dt_ar = issu_dt_ar;
		this.prt_dt_ar = prt_dt_ar;
		this.medi_cd_ar = medi_cd_ar;
		this.sect_cd_ar = sect_cd_ar;
		this.pre_prt_clsf_ar = pre_prt_clsf_ar;
		this.hdqt_paper_clsf_ar = hdqt_paper_clsf_ar;
		this.pj_kind_ar = pj_kind_ar;
		this.cnt_ar = cnt_ar;
		this.wgt_ar = wgt_ar;
		this.blk_cmpy_cd_ar = blk_cmpy_cd_ar;
		this.blk_occr_dt_ar = blk_occr_dt_ar;
		this.blk_seq_ar = blk_seq_ar;
		this.bw_pj_wgt_ar = bw_pj_wgt_ar;
		this.pers_ipaddr = pers_ipaddr;
		this.pers_id = pers_id;
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

	public void setWgt_clsf(String wgt_clsf){
		this.wgt_clsf = wgt_clsf;
	}

	public void setIssu_dt_ar(String issu_dt_ar){
		this.issu_dt_ar = issu_dt_ar;
	}

	public void setPrt_dt_ar(String prt_dt_ar){
		this.prt_dt_ar = prt_dt_ar;
	}

	public void setMedi_cd_ar(String medi_cd_ar){
		this.medi_cd_ar = medi_cd_ar;
	}

	public void setSect_cd_ar(String sect_cd_ar){
		this.sect_cd_ar = sect_cd_ar;
	}

	public void setPre_prt_clsf_ar(String pre_prt_clsf_ar){
		this.pre_prt_clsf_ar = pre_prt_clsf_ar;
	}

	public void setHdqt_paper_clsf_ar(String hdqt_paper_clsf_ar){
		this.hdqt_paper_clsf_ar = hdqt_paper_clsf_ar;
	}

	public void setPj_kind_ar(String pj_kind_ar){
		this.pj_kind_ar = pj_kind_ar;
	}

	public void setCnt_ar(String cnt_ar){
		this.cnt_ar = cnt_ar;
	}

	public void setWgt_ar(String wgt_ar){
		this.wgt_ar = wgt_ar;
	}

	public void setBlk_cmpy_cd_ar(String blk_cmpy_cd_ar){
		this.blk_cmpy_cd_ar = blk_cmpy_cd_ar;
	}

	public void setBlk_occr_dt_ar(String blk_occr_dt_ar){
		this.blk_occr_dt_ar = blk_occr_dt_ar;
	}

	public void setBlk_seq_ar(String blk_seq_ar){
		this.blk_seq_ar = blk_seq_ar;
	}

	public void setBw_pj_wgt_ar(String bw_pj_wgt_ar){
		this.bw_pj_wgt_ar = bw_pj_wgt_ar;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
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

	public String getWgt_clsf(){
		return this.wgt_clsf;
	}

	public String getIssu_dt_ar(){
		return this.issu_dt_ar;
	}

	public String getPrt_dt_ar(){
		return this.prt_dt_ar;
	}

	public String getMedi_cd_ar(){
		return this.medi_cd_ar;
	}

	public String getSect_cd_ar(){
		return this.sect_cd_ar;
	}

	public String getPre_prt_clsf_ar(){
		return this.pre_prt_clsf_ar;
	}

	public String getHdqt_paper_clsf_ar(){
		return this.hdqt_paper_clsf_ar;
	}

	public String getPj_kind_ar(){
		return this.pj_kind_ar;
	}

	public String getCnt_ar(){
		return this.cnt_ar;
	}

	public String getWgt_ar(){
		return this.wgt_ar;
	}

	public String getBlk_cmpy_cd_ar(){
		return this.blk_cmpy_cd_ar;
	}

	public String getBlk_occr_dt_ar(){
		return this.blk_occr_dt_ar;
	}

	public String getBlk_seq_ar(){
		return this.blk_seq_ar;
	}

	public String getBw_pj_wgt_ar(){
		return this.bw_pj_wgt_ar;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3409_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3409_IDM dm = (MT_PRNPAP_3409_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.wgt_clsf);
		cstmt.setString(7, dm.issu_dt_ar);
		cstmt.setString(8, dm.prt_dt_ar);
		cstmt.setString(9, dm.medi_cd_ar);
		cstmt.setString(10, dm.sect_cd_ar);
		cstmt.setString(11, dm.pre_prt_clsf_ar);
		cstmt.setString(12, dm.hdqt_paper_clsf_ar);
		cstmt.setString(13, dm.pj_kind_ar);
		cstmt.setString(14, dm.cnt_ar);
		cstmt.setString(15, dm.wgt_ar);
		cstmt.setString(16, dm.blk_cmpy_cd_ar);
		cstmt.setString(17, dm.blk_occr_dt_ar);
		cstmt.setString(18, dm.blk_seq_ar);
		cstmt.setString(19, dm.bw_pj_wgt_ar);
		cstmt.setString(20, dm.pers_ipaddr);
		cstmt.setString(21, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3409_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("wgt_clsf = [" + getWgt_clsf() + "]");
		System.out.println("issu_dt_ar = [" + getIssu_dt_ar() + "]");
		System.out.println("prt_dt_ar = [" + getPrt_dt_ar() + "]");
		System.out.println("medi_cd_ar = [" + getMedi_cd_ar() + "]");
		System.out.println("sect_cd_ar = [" + getSect_cd_ar() + "]");
		System.out.println("pre_prt_clsf_ar = [" + getPre_prt_clsf_ar() + "]");
		System.out.println("hdqt_paper_clsf_ar = [" + getHdqt_paper_clsf_ar() + "]");
		System.out.println("pj_kind_ar = [" + getPj_kind_ar() + "]");
		System.out.println("cnt_ar = [" + getCnt_ar() + "]");
		System.out.println("wgt_ar = [" + getWgt_ar() + "]");
		System.out.println("blk_cmpy_cd_ar = [" + getBlk_cmpy_cd_ar() + "]");
		System.out.println("blk_occr_dt_ar = [" + getBlk_occr_dt_ar() + "]");
		System.out.println("blk_seq_ar = [" + getBlk_seq_ar() + "]");
		System.out.println("bw_pj_wgt_ar = [" + getBw_pj_wgt_ar() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String wgt_clsf = req.getParameter("wgt_clsf");
if( wgt_clsf == null){
	System.out.println(this.toString+" : wgt_clsf is null" );
}else{
	System.out.println(this.toString+" : wgt_clsf is "+wgt_clsf );
}
String issu_dt_ar = req.getParameter("issu_dt_ar");
if( issu_dt_ar == null){
	System.out.println(this.toString+" : issu_dt_ar is null" );
}else{
	System.out.println(this.toString+" : issu_dt_ar is "+issu_dt_ar );
}
String prt_dt_ar = req.getParameter("prt_dt_ar");
if( prt_dt_ar == null){
	System.out.println(this.toString+" : prt_dt_ar is null" );
}else{
	System.out.println(this.toString+" : prt_dt_ar is "+prt_dt_ar );
}
String medi_cd_ar = req.getParameter("medi_cd_ar");
if( medi_cd_ar == null){
	System.out.println(this.toString+" : medi_cd_ar is null" );
}else{
	System.out.println(this.toString+" : medi_cd_ar is "+medi_cd_ar );
}
String sect_cd_ar = req.getParameter("sect_cd_ar");
if( sect_cd_ar == null){
	System.out.println(this.toString+" : sect_cd_ar is null" );
}else{
	System.out.println(this.toString+" : sect_cd_ar is "+sect_cd_ar );
}
String pre_prt_clsf_ar = req.getParameter("pre_prt_clsf_ar");
if( pre_prt_clsf_ar == null){
	System.out.println(this.toString+" : pre_prt_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : pre_prt_clsf_ar is "+pre_prt_clsf_ar );
}
String hdqt_paper_clsf_ar = req.getParameter("hdqt_paper_clsf_ar");
if( hdqt_paper_clsf_ar == null){
	System.out.println(this.toString+" : hdqt_paper_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : hdqt_paper_clsf_ar is "+hdqt_paper_clsf_ar );
}
String pj_kind_ar = req.getParameter("pj_kind_ar");
if( pj_kind_ar == null){
	System.out.println(this.toString+" : pj_kind_ar is null" );
}else{
	System.out.println(this.toString+" : pj_kind_ar is "+pj_kind_ar );
}
String cnt_ar = req.getParameter("cnt_ar");
if( cnt_ar == null){
	System.out.println(this.toString+" : cnt_ar is null" );
}else{
	System.out.println(this.toString+" : cnt_ar is "+cnt_ar );
}
String wgt_ar = req.getParameter("wgt_ar");
if( wgt_ar == null){
	System.out.println(this.toString+" : wgt_ar is null" );
}else{
	System.out.println(this.toString+" : wgt_ar is "+wgt_ar );
}
String blk_cmpy_cd_ar = req.getParameter("blk_cmpy_cd_ar");
if( blk_cmpy_cd_ar == null){
	System.out.println(this.toString+" : blk_cmpy_cd_ar is null" );
}else{
	System.out.println(this.toString+" : blk_cmpy_cd_ar is "+blk_cmpy_cd_ar );
}
String blk_occr_dt_ar = req.getParameter("blk_occr_dt_ar");
if( blk_occr_dt_ar == null){
	System.out.println(this.toString+" : blk_occr_dt_ar is null" );
}else{
	System.out.println(this.toString+" : blk_occr_dt_ar is "+blk_occr_dt_ar );
}
String blk_seq_ar = req.getParameter("blk_seq_ar");
if( blk_seq_ar == null){
	System.out.println(this.toString+" : blk_seq_ar is null" );
}else{
	System.out.println(this.toString+" : blk_seq_ar is "+blk_seq_ar );
}
String bw_pj_wgt_ar = req.getParameter("bw_pj_wgt_ar");
if( bw_pj_wgt_ar == null){
	System.out.println(this.toString+" : bw_pj_wgt_ar is null" );
}else{
	System.out.println(this.toString+" : bw_pj_wgt_ar is "+bw_pj_wgt_ar );
}
String pers_ipaddr = req.getParameter("pers_ipaddr");
if( pers_ipaddr == null){
	System.out.println(this.toString+" : pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : pers_ipaddr is "+pers_ipaddr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String wgt_clsf = Util.checkString(req.getParameter("wgt_clsf"));
String issu_dt_ar = Util.checkString(req.getParameter("issu_dt_ar"));
String prt_dt_ar = Util.checkString(req.getParameter("prt_dt_ar"));
String medi_cd_ar = Util.checkString(req.getParameter("medi_cd_ar"));
String sect_cd_ar = Util.checkString(req.getParameter("sect_cd_ar"));
String pre_prt_clsf_ar = Util.checkString(req.getParameter("pre_prt_clsf_ar"));
String hdqt_paper_clsf_ar = Util.checkString(req.getParameter("hdqt_paper_clsf_ar"));
String pj_kind_ar = Util.checkString(req.getParameter("pj_kind_ar"));
String cnt_ar = Util.checkString(req.getParameter("cnt_ar"));
String wgt_ar = Util.checkString(req.getParameter("wgt_ar"));
String blk_cmpy_cd_ar = Util.checkString(req.getParameter("blk_cmpy_cd_ar"));
String blk_occr_dt_ar = Util.checkString(req.getParameter("blk_occr_dt_ar"));
String blk_seq_ar = Util.checkString(req.getParameter("blk_seq_ar"));
String bw_pj_wgt_ar = Util.checkString(req.getParameter("bw_pj_wgt_ar"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String wgt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_clsf")));
String issu_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_ar")));
String prt_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt_ar")));
String medi_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_ar")));
String sect_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_ar")));
String pre_prt_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_prt_clsf_ar")));
String hdqt_paper_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_paper_clsf_ar")));
String pj_kind_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind_ar")));
String cnt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt_ar")));
String wgt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_ar")));
String blk_cmpy_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("blk_cmpy_cd_ar")));
String blk_occr_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("blk_occr_dt_ar")));
String blk_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("blk_seq_ar")));
String bw_pj_wgt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pj_wgt_ar")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setIssu_dt(issu_dt);
dm.setWgt_clsf(wgt_clsf);
dm.setIssu_dt_ar(issu_dt_ar);
dm.setPrt_dt_ar(prt_dt_ar);
dm.setMedi_cd_ar(medi_cd_ar);
dm.setSect_cd_ar(sect_cd_ar);
dm.setPre_prt_clsf_ar(pre_prt_clsf_ar);
dm.setHdqt_paper_clsf_ar(hdqt_paper_clsf_ar);
dm.setPj_kind_ar(pj_kind_ar);
dm.setCnt_ar(cnt_ar);
dm.setWgt_ar(wgt_ar);
dm.setBlk_cmpy_cd_ar(blk_cmpy_cd_ar);
dm.setBlk_occr_dt_ar(blk_occr_dt_ar);
dm.setBlk_seq_ar(blk_seq_ar);
dm.setBw_pj_wgt_ar(bw_pj_wgt_ar);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Sep 05 19:40:56 KST 2009 */