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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1003_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon;
	public String lgl_hody_alon;
	public String nissu_dd_alon;
	public String erl_prsnt_alon;
	public String vgl_fee;
	public String etc_duty_alon;
	public String prvmm_mstk_alon;
	public String etc_alon_saly;
	public String bns_saly;
	public String hody_duty_alon;
	public String congr_fee;
	public String welfare_fee;
	public String adpay_amt;
	public String xx_col_caption_010;

	public HD_SALY_1003_MDataSet(){}
	public HD_SALY_1003_MDataSet(String errcode, String errmsg, String week_hody_base_alon, String week_hody_cmpn_alon, String lgl_hody_alon, String nissu_dd_alon, String erl_prsnt_alon, String vgl_fee, String etc_duty_alon, String prvmm_mstk_alon, String etc_alon_saly, String bns_saly, String hody_duty_alon, String congr_fee, String welfare_fee, String adpay_amt, String xx_col_caption_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.week_hody_base_alon = week_hody_base_alon;
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
		this.lgl_hody_alon = lgl_hody_alon;
		this.nissu_dd_alon = nissu_dd_alon;
		this.erl_prsnt_alon = erl_prsnt_alon;
		this.vgl_fee = vgl_fee;
		this.etc_duty_alon = etc_duty_alon;
		this.prvmm_mstk_alon = prvmm_mstk_alon;
		this.etc_alon_saly = etc_alon_saly;
		this.bns_saly = bns_saly;
		this.hody_duty_alon = hody_duty_alon;
		this.congr_fee = congr_fee;
		this.welfare_fee = welfare_fee;
		this.adpay_amt = adpay_amt;
		this.xx_col_caption_010 = xx_col_caption_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWeek_hody_base_alon(String week_hody_base_alon){
		this.week_hody_base_alon = week_hody_base_alon;
	}

	public void setWeek_hody_cmpn_alon(String week_hody_cmpn_alon){
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
	}

	public void setLgl_hody_alon(String lgl_hody_alon){
		this.lgl_hody_alon = lgl_hody_alon;
	}

	public void setNissu_dd_alon(String nissu_dd_alon){
		this.nissu_dd_alon = nissu_dd_alon;
	}

	public void setErl_prsnt_alon(String erl_prsnt_alon){
		this.erl_prsnt_alon = erl_prsnt_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setEtc_duty_alon(String etc_duty_alon){
		this.etc_duty_alon = etc_duty_alon;
	}

	public void setPrvmm_mstk_alon(String prvmm_mstk_alon){
		this.prvmm_mstk_alon = prvmm_mstk_alon;
	}

	public void setEtc_alon_saly(String etc_alon_saly){
		this.etc_alon_saly = etc_alon_saly;
	}

	public void setBns_saly(String bns_saly){
		this.bns_saly = bns_saly;
	}

	public void setHody_duty_alon(String hody_duty_alon){
		this.hody_duty_alon = hody_duty_alon;
	}

	public void setCongr_fee(String congr_fee){
		this.congr_fee = congr_fee;
	}

	public void setWelfare_fee(String welfare_fee){
		this.welfare_fee = welfare_fee;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setXx_col_caption_010(String xx_col_caption_010){
		this.xx_col_caption_010 = xx_col_caption_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWeek_hody_base_alon(){
		return this.week_hody_base_alon;
	}

	public String getWeek_hody_cmpn_alon(){
		return this.week_hody_cmpn_alon;
	}

	public String getLgl_hody_alon(){
		return this.lgl_hody_alon;
	}

	public String getNissu_dd_alon(){
		return this.nissu_dd_alon;
	}

	public String getErl_prsnt_alon(){
		return this.erl_prsnt_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getEtc_duty_alon(){
		return this.etc_duty_alon;
	}

	public String getPrvmm_mstk_alon(){
		return this.prvmm_mstk_alon;
	}

	public String getEtc_alon_saly(){
		return this.etc_alon_saly;
	}

	public String getBns_saly(){
		return this.bns_saly;
	}

	public String getHody_duty_alon(){
		return this.hody_duty_alon;
	}

	public String getCongr_fee(){
		return this.congr_fee;
	}

	public String getWelfare_fee(){
		return this.welfare_fee;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getXx_col_caption_010(){
		return this.xx_col_caption_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.week_hody_base_alon = Util.checkString(cstmt.getString(5));
		this.week_hody_cmpn_alon = Util.checkString(cstmt.getString(6));
		this.lgl_hody_alon = Util.checkString(cstmt.getString(7));
		this.nissu_dd_alon = Util.checkString(cstmt.getString(8));
		this.erl_prsnt_alon = Util.checkString(cstmt.getString(9));
		this.vgl_fee = Util.checkString(cstmt.getString(10));
		this.etc_duty_alon = Util.checkString(cstmt.getString(11));
		this.prvmm_mstk_alon = Util.checkString(cstmt.getString(12));
		this.etc_alon_saly = Util.checkString(cstmt.getString(13));
		this.bns_saly = Util.checkString(cstmt.getString(14));
		this.hody_duty_alon = Util.checkString(cstmt.getString(15));
		this.congr_fee = Util.checkString(cstmt.getString(16));
		this.welfare_fee = Util.checkString(cstmt.getString(17));
		this.adpay_amt = Util.checkString(cstmt.getString(18));
		this.xx_col_caption_010 = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1003_MDataSet ds = (HD_SALY_1003_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getWeek_hody_base_alon()%>
<%= ds.getWeek_hody_cmpn_alon()%>
<%= ds.getLgl_hody_alon()%>
<%= ds.getNissu_dd_alon()%>
<%= ds.getErl_prsnt_alon()%>
<%= ds.getVgl_fee()%>
<%= ds.getEtc_duty_alon()%>
<%= ds.getPrvmm_mstk_alon()%>
<%= ds.getEtc_alon_saly()%>
<%= ds.getBns_saly()%>
<%= ds.getHody_duty_alon()%>
<%= ds.getCongr_fee()%>
<%= ds.getWelfare_fee()%>
<%= ds.getAdpay_amt()%>
<%= ds.getXx_col_caption_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 15 09:43:42 KST 2014 */