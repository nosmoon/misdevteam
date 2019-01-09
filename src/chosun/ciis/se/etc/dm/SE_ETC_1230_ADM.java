/***************************************************************************************************
* 파일명 : SE_ETC_1230_ADM.java
* 기능 : 판매-기타관리-구독료 지급등록
* 작성일자 : 2009-03-05
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.dm;

import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_ETC_1230_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd			;
	public String mode				;
	public String yymm				;
	public String pay_seq			;
	public String dept_cd			;
	public String pay_descri        ;
	public String pay_mthd_clsf		;
	public String uprc				;
	public String draft_doc_no		;
	public String pay_dt			;
	public String decid_stat		;
	public String clos_yn			;
	public String mode_sub			;
	public String yymm_sub			;
	public String pay_seq_sub		;
	public String pay_ptcr_seq		;
	public String bo_cd				;
	public String bo_seq			;
	public String dept_cd_sub		;
	public String sub_dept_cd		;
	public String area_cd			;
	public String prn				;
	public String recp_pers_nm      ;
	public String medi_cd			;
	public String qty				;
	public String uprc_sub			;
	public String amt				;
	public String acct_no			;
	public String rmks				;
	public String incmg_pers_ip		;
	public String incmg_pers		;
	
	public SE_ETC_1230_ADM(){}
	public SE_ETC_1230_ADM(String cmpy_cd, String mode, String yymm, String pay_seq, String dept_cd, String pya_descri, String pay_mthd_clsf, String uprc, String draft_doc_no, String pay_dt, String decid_stat, String clos_yn, String mode_sub, String yymm_sub, String pay_seq_sub, String pay_ptcr_seq, String bo_cd, String bo_seq, String dept_cd_sub, String sub_dept_cd, String area_cd, String prn, String recp_pers_nm, String medi_cd, String qty, String uprc_sub, String amt, String acct_no, String rmks, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd			= cmpy_cd				;
		this.mode				= mode					;
		this.yymm				= yymm					;
		this.pay_seq			= pay_seq				;
		this.dept_cd			= dept_cd				;
		this.pay_mthd_clsf		= pay_mthd_clsf			;
		this.uprc				= uprc					;
		this.draft_doc_no		= draft_doc_no			;
		this.pay_dt				= pay_dt				;
		this.decid_stat			= decid_stat			;
		this.clos_yn			= clos_yn				;
		this.mode_sub			= mode_sub				;
		this.yymm_sub			= yymm_sub				;
		this.pay_seq_sub		= pay_seq_sub			;
		this.pay_ptcr_seq		= pay_ptcr_seq			;
		this.bo_cd				= bo_cd					;
		this.bo_seq				= bo_seq				;
		this.dept_cd_sub		= dept_cd_sub			;
		this.sub_dept_cd		= sub_dept_cd			;
		this.area_cd			= area_cd				;
		this.prn				= prn					;
		this.recp_pers_nm		= recp_pers_nm			;
		this.medi_cd			= medi_cd				;
		this.qty				= qty					;
		this.uprc_sub			= uprc_sub				;
		this.amt				= amt					;
		this.acct_no			= acct_no				;
		this.rmks				= rmks					;
		this.incmg_pers_ip		= incmg_pers_ip			;
		this.incmg_pers			= incmg_pers			;
	}

	public String getSQL(){
		 return "{ call SP_SE_ETC_1230_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_ETC_1230_ADM dm = (SE_ETC_1230_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, cmpy_cd			);
		cstmt.setString( 4, mode			);
		cstmt.setString( 5, yymm			);
		cstmt.setString( 6, pay_seq			);
		cstmt.setString( 7, dept_cd			);
		cstmt.setString( 8, pay_descri		);
		cstmt.setString( 9, pay_mthd_clsf   );
		cstmt.setString(10, uprc			);
		cstmt.setString(11, draft_doc_no	);
		cstmt.setString(12, pay_dt			);
		cstmt.setString(13, decid_stat		);
		cstmt.setString(14, clos_yn			);
		cstmt.setString(15, mode_sub		);
		cstmt.setString(16, yymm_sub		);
		cstmt.setString(17, pay_seq_sub	    );
		cstmt.setString(18, pay_ptcr_seq	);
		cstmt.setString(19, bo_cd			);
		cstmt.setString(20, bo_seq			);
		cstmt.setString(21, dept_cd_sub	    );
		cstmt.setString(22, sub_dept_cd	    );
		cstmt.setString(23, area_cd			);
		cstmt.setString(24, prn				);
		cstmt.setString(25, recp_pers_nm	);
		cstmt.setString(26, medi_cd			);
		cstmt.setString(27, qty				);
		cstmt.setString(28, uprc_sub		);
		cstmt.setString(29, amt				);
		cstmt.setString(30, acct_no			);
		cstmt.setString(31, rmks			);
		cstmt.setString(32, incmg_pers_ip   );
		cstmt.setString(33, incmg_pers		);
	}

	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.etc.ds.SE_ETC_1230_ADataSet();
	}
		
    public void print(){
    	System.out.println("cmpy_cd			= " + getCmpy_cd		());
    	System.out.println("mode			= " + getMode			());
    	System.out.println("yymm			= " + getYymm			());
    	System.out.println("pay_seq			= " + getPay_seq		());
    	System.out.println("dept_cd			= " + getDept_cd		());
    	System.out.println("pay_descri		= " + getPay_descri		());
    	System.out.println("pay_mthd_clsf   = " + getPay_mthd_clsf 	());
    	System.out.println("uprc			= " + getUprc			());
    	System.out.println("draft_doc_no	= " + getDraft_doc_no	());
    	System.out.println("pay_dt			= " + getPay_dt			());
    	System.out.println("decid_stat		= " + getDecid_stat		());
    	System.out.println("clos_yn			= " + getClos_yn		());
    	System.out.println("mode_sub		= " + getMode_sub		());
    	System.out.println("yymm_sub		= " + getYymm_sub		());
    	System.out.println("pay_seq_sub	    = " + getPay_seq_sub	());
    	System.out.println("pay_ptcr_seq	= " + getPay_ptcr_seq	());
    	System.out.println("bo_cd			= " + getBo_cd			());
    	System.out.println("bo_seq			= " + getBo_seq			());
    	System.out.println("dept_cd_sub	    = " + getDept_cd_sub	());
    	System.out.println("sub_dept_cd	    = " + getSub_dept_cd	());
    	System.out.println("area_cd			= " + getArea_cd		());
    	System.out.println("prn				= " + getPrn			());
    	System.out.println("recp_pers_nm	= " + getRecp_pers_nm	());
    	System.out.println("medi_cd			= " + getMedi_cd		());
    	System.out.println("qty				= " + getQty			());
    	System.out.println("uprc_sub		= " + getUprc_sub		());
    	System.out.println("amt				= " + getAmt			());
    	System.out.println("acct_no			= " + getAcct_no		());
    	System.out.println("rmks			= " + getRmks			());
    	System.out.println("incmg_pers_ip   = " + getIncmg_pers_ip	());
    	System.out.println("incmg_pers		= " + getIncmg_pers		());
    }
    
	public String getAcct_no() {
		return acct_no;
	}
	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getArea_cd() {
		return area_cd;
	}
	public void setArea_cd(String area_cd) {
		this.area_cd = area_cd;
	}
	public String getBo_cd() {
		return bo_cd;
	}
	public void setBo_cd(String bo_cd) {
		this.bo_cd = bo_cd;
	}
	public String getBo_seq() {
		return bo_seq;
	}
	public void setBo_seq(String bo_seq) {
		this.bo_seq = bo_seq;
	}
	public String getClos_yn() {
		return clos_yn;
	}
	public void setClos_yn(String clos_yn) {
		this.clos_yn = clos_yn;
	}
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getDecid_stat() {
		return decid_stat;
	}
	public void setDecid_stat(String decid_stat) {
		this.decid_stat = decid_stat;
	}
	public String getDept_cd() {
		return dept_cd;
	}
	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}
	public String getDept_cd_sub() {
		return dept_cd_sub;
	}
	public void setDept_cd_sub(String dept_cd_sub) {
		this.dept_cd_sub = dept_cd_sub;
	}
	public String getDraft_doc_no() {
		return draft_doc_no;
	}
	public void setDraft_doc_no(String draft_doc_no) {
		this.draft_doc_no = draft_doc_no;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMode_sub() {
		return mode_sub;
	}
	public void setMode_sub(String mode_sub) {
		this.mode_sub = mode_sub;
	}
	public String getPay_dt() {
		return pay_dt;
	}
	public void setPay_dt(String pay_dt) {
		this.pay_dt = pay_dt;
	}
	public String getPay_mthd_clsf() {
		return pay_mthd_clsf;
	}
	public void setPay_mthd_clsf(String pay_mthd_clsf) {
		this.pay_mthd_clsf = pay_mthd_clsf;
	}
	public String getPay_ptcr_seq() {
		return pay_ptcr_seq;
	}
	public void setPay_ptcr_seq(String pay_ptcr_seq) {
		this.pay_ptcr_seq = pay_ptcr_seq;
	}
	public String getPay_seq() {
		return pay_seq;
	}
	public void setPay_seq(String pay_seq) {
		this.pay_seq = pay_seq;
	}
	public String getPay_seq_sub() {
		return pay_seq_sub;
	}
	public void setPay_seq_sub(String pay_seq_sub) {
		this.pay_seq_sub = pay_seq_sub;
	}
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getRmks() {
		return rmks;
	}
	public void setRmks(String rmks) {
		this.rmks = rmks;
	}
	public String getSub_dept_cd() {
		return sub_dept_cd;
	}
	public void setSub_dept_cd(String sub_dept_cd) {
		this.sub_dept_cd = sub_dept_cd;
	}
	public String getUprc() {
		return uprc;
	}
	public void setUprc(String uprc) {
		this.uprc = uprc;
	}
	public String getUprc_sub() {
		return uprc_sub;
	}
	public void setUprc_sub(String uprc_sub) {
		this.uprc_sub = uprc_sub;
	}
	public String getYymm() {
		return yymm;
	}
	public void setYymm(String yymm) {
		this.yymm = yymm;
	}
	public String getYymm_sub() {
		return yymm_sub;
	}
	public void setYymm_sub(String yymm_sub) {
		this.yymm_sub = yymm_sub;
	}
	public String getRecp_pers_nm() {
		return recp_pers_nm;
	}
	public void setRecp_pers_nm(String recp_pers_nm) {
		this.recp_pers_nm = recp_pers_nm;
	}
	public String getPay_descri() {
		return pay_descri;
	}
	public void setPay_descri(String pay_descri) {
		this.pay_descri = pay_descri;
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
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 17:16:24 KST 2009 */