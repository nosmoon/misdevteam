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


package chosun.ciis.hd.trip.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1705_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_proc_clsf_010;
	public String xx_proc_clsf_020;
	public String xx_proc_clsf_030;
	public String xx_proc_clsf_040;
	public String xx_rptv_posi_cd_010;
	public String xx_rptv_posi_cd_020;
	public String xx_rptv_posi_cd_030;
	public String xx_rptv_posi_cd_040;
	public String xx_pay_basi_clsf_010;
	public String xx_pay_basi_clsf_020;
	public String xx_pay_basi_clsf_030;
	public String xx_dspch_clsf_010;
	public String xx_dspch_clsf_020;
	public String xx_stay_clsf_010;
	public String xx_mode_gubun_010;

	public HD_TRIP_1705_MDataSet(){}
	public HD_TRIP_1705_MDataSet(String errcode, String errmsg, String xx_proc_clsf_010, String xx_proc_clsf_020, String xx_proc_clsf_030, String xx_proc_clsf_040, String xx_rptv_posi_cd_010, String xx_rptv_posi_cd_020, String xx_rptv_posi_cd_030, String xx_rptv_posi_cd_040, String xx_pay_basi_clsf_010, String xx_pay_basi_clsf_020, String xx_pay_basi_clsf_030, String xx_dspch_clsf_010, String xx_dspch_clsf_020, String xx_stay_clsf_010, String xx_mode_gubun_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
		this.xx_rptv_posi_cd_010 = xx_rptv_posi_cd_010;
		this.xx_rptv_posi_cd_020 = xx_rptv_posi_cd_020;
		this.xx_rptv_posi_cd_030 = xx_rptv_posi_cd_030;
		this.xx_rptv_posi_cd_040 = xx_rptv_posi_cd_040;
		this.xx_pay_basi_clsf_010 = xx_pay_basi_clsf_010;
		this.xx_pay_basi_clsf_020 = xx_pay_basi_clsf_020;
		this.xx_pay_basi_clsf_030 = xx_pay_basi_clsf_030;
		this.xx_dspch_clsf_010 = xx_dspch_clsf_010;
		this.xx_dspch_clsf_020 = xx_dspch_clsf_020;
		this.xx_stay_clsf_010 = xx_stay_clsf_010;
		this.xx_mode_gubun_010 = xx_mode_gubun_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_proc_clsf_010(String xx_proc_clsf_010){
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
	}

	public void setXx_proc_clsf_020(String xx_proc_clsf_020){
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
	}

	public void setXx_proc_clsf_030(String xx_proc_clsf_030){
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
	}

	public void setXx_proc_clsf_040(String xx_proc_clsf_040){
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
	}

	public void setXx_rptv_posi_cd_010(String xx_rptv_posi_cd_010){
		this.xx_rptv_posi_cd_010 = xx_rptv_posi_cd_010;
	}

	public void setXx_rptv_posi_cd_020(String xx_rptv_posi_cd_020){
		this.xx_rptv_posi_cd_020 = xx_rptv_posi_cd_020;
	}

	public void setXx_rptv_posi_cd_030(String xx_rptv_posi_cd_030){
		this.xx_rptv_posi_cd_030 = xx_rptv_posi_cd_030;
	}

	public void setXx_rptv_posi_cd_040(String xx_rptv_posi_cd_040){
		this.xx_rptv_posi_cd_040 = xx_rptv_posi_cd_040;
	}

	public void setXx_pay_basi_clsf_010(String xx_pay_basi_clsf_010){
		this.xx_pay_basi_clsf_010 = xx_pay_basi_clsf_010;
	}

	public void setXx_pay_basi_clsf_020(String xx_pay_basi_clsf_020){
		this.xx_pay_basi_clsf_020 = xx_pay_basi_clsf_020;
	}

	public void setXx_pay_basi_clsf_030(String xx_pay_basi_clsf_030){
		this.xx_pay_basi_clsf_030 = xx_pay_basi_clsf_030;
	}

	public void setXx_dspch_clsf_010(String xx_dspch_clsf_010){
		this.xx_dspch_clsf_010 = xx_dspch_clsf_010;
	}

	public void setXx_dspch_clsf_020(String xx_dspch_clsf_020){
		this.xx_dspch_clsf_020 = xx_dspch_clsf_020;
	}

	public void setXx_stay_clsf_010(String xx_stay_clsf_010){
		this.xx_stay_clsf_010 = xx_stay_clsf_010;
	}

	public void setXx_mode_gubun_010(String xx_mode_gubun_010){
		this.xx_mode_gubun_010 = xx_mode_gubun_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_proc_clsf_010(){
		return this.xx_proc_clsf_010;
	}

	public String getXx_proc_clsf_020(){
		return this.xx_proc_clsf_020;
	}

	public String getXx_proc_clsf_030(){
		return this.xx_proc_clsf_030;
	}

	public String getXx_proc_clsf_040(){
		return this.xx_proc_clsf_040;
	}

	public String getXx_rptv_posi_cd_010(){
		return this.xx_rptv_posi_cd_010;
	}

	public String getXx_rptv_posi_cd_020(){
		return this.xx_rptv_posi_cd_020;
	}

	public String getXx_rptv_posi_cd_030(){
		return this.xx_rptv_posi_cd_030;
	}

	public String getXx_rptv_posi_cd_040(){
		return this.xx_rptv_posi_cd_040;
	}

	public String getXx_pay_basi_clsf_010(){
		return this.xx_pay_basi_clsf_010;
	}

	public String getXx_pay_basi_clsf_020(){
		return this.xx_pay_basi_clsf_020;
	}

	public String getXx_pay_basi_clsf_030(){
		return this.xx_pay_basi_clsf_030;
	}

	public String getXx_dspch_clsf_010(){
		return this.xx_dspch_clsf_010;
	}

	public String getXx_dspch_clsf_020(){
		return this.xx_dspch_clsf_020;
	}

	public String getXx_stay_clsf_010(){
		return this.xx_stay_clsf_010;
	}

	public String getXx_mode_gubun_010(){
		return this.xx_mode_gubun_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_proc_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_proc_clsf_020 = Util.checkString(cstmt.getString(6));
		this.xx_proc_clsf_030 = Util.checkString(cstmt.getString(7));
		this.xx_proc_clsf_040 = Util.checkString(cstmt.getString(8));
		this.xx_rptv_posi_cd_010 = Util.checkString(cstmt.getString(9));
		this.xx_rptv_posi_cd_020 = Util.checkString(cstmt.getString(10));
		this.xx_rptv_posi_cd_030 = Util.checkString(cstmt.getString(11));
		this.xx_rptv_posi_cd_040 = Util.checkString(cstmt.getString(12));
		this.xx_pay_basi_clsf_010 = Util.checkString(cstmt.getString(13));
		this.xx_pay_basi_clsf_020 = Util.checkString(cstmt.getString(14));
		this.xx_pay_basi_clsf_030 = Util.checkString(cstmt.getString(15));
		this.xx_dspch_clsf_010 = Util.checkString(cstmt.getString(16));
		this.xx_dspch_clsf_020 = Util.checkString(cstmt.getString(17));
		this.xx_stay_clsf_010 = Util.checkString(cstmt.getString(18));
		this.xx_mode_gubun_010 = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1705_MDataSet ds = (HD_TRIP_1705_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_proc_clsf_010()%>
<%= ds.getXx_proc_clsf_020()%>
<%= ds.getXx_proc_clsf_030()%>
<%= ds.getXx_proc_clsf_040()%>
<%= ds.getXx_rptv_posi_cd_010()%>
<%= ds.getXx_rptv_posi_cd_020()%>
<%= ds.getXx_rptv_posi_cd_030()%>
<%= ds.getXx_rptv_posi_cd_040()%>
<%= ds.getXx_pay_basi_clsf_010()%>
<%= ds.getXx_pay_basi_clsf_020()%>
<%= ds.getXx_pay_basi_clsf_030()%>
<%= ds.getXx_dspch_clsf_010()%>
<%= ds.getXx_dspch_clsf_020()%>
<%= ds.getXx_stay_clsf_010()%>
<%= ds.getXx_mode_gubun_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 07 14:46:32 KST 2012 */