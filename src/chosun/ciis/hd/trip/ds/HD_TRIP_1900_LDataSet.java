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


public class HD_TRIP_1900_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_proc_clsf_010;
	public String xx_proc_clsf_020;
	public String xx_proc_clsf_030;
	public String xx_proc_clsf_040;
	public String xx_proc_clsf_050;
	public String xx_proc_clsf_060;
	public String xx_proc_clsf_070;
	public String xx_rptv_posi_cd_010;
	public String xx_rptv_posi_cd_020;
	public String xx_rptv_posi_cd_030;
	public String xx_pay_basi_clsf_010;
	public String xx_pay_basi_clsf_020;
	public String xx_pay_basi_clsf_030;
	public String xx_dspch_clsf_010;
	public String xx_dspch_clsf_020;
	public String xx_stay_clsf_010;
	public String xx_mode_gubun_010;

	public HD_TRIP_1900_LDataSet(){}
	public HD_TRIP_1900_LDataSet(String errcode, String errmsg, String xx_proc_clsf_010, String xx_proc_clsf_020, String xx_proc_clsf_030, String xx_proc_clsf_040, String xx_proc_clsf_050, String xx_proc_clsf_060, String xx_proc_clsf_070, String xx_rptv_posi_cd_010, String xx_rptv_posi_cd_020, String xx_rptv_posi_cd_030, String xx_pay_basi_clsf_010, String xx_pay_basi_clsf_020, String xx_pay_basi_clsf_030, String xx_dspch_clsf_010, String xx_dspch_clsf_020, String xx_stay_clsf_010, String xx_mode_gubun_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
		this.xx_proc_clsf_050 = xx_proc_clsf_050;
		this.xx_proc_clsf_060 = xx_proc_clsf_060;
		this.xx_proc_clsf_070 = xx_proc_clsf_070;
		this.xx_rptv_posi_cd_010 = xx_rptv_posi_cd_010;
		this.xx_rptv_posi_cd_020 = xx_rptv_posi_cd_020;
		this.xx_rptv_posi_cd_030 = xx_rptv_posi_cd_030;
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

	public void setXx_proc_clsf_050(String xx_proc_clsf_050){
		this.xx_proc_clsf_050 = xx_proc_clsf_050;
	}

	public void setXx_proc_clsf_060(String xx_proc_clsf_060){
		this.xx_proc_clsf_060 = xx_proc_clsf_060;
	}

	public void setXx_proc_clsf_070(String xx_proc_clsf_070){
		this.xx_proc_clsf_070 = xx_proc_clsf_070;
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

	public String getXx_proc_clsf_050(){
		return this.xx_proc_clsf_050;
	}

	public String getXx_proc_clsf_060(){
		return this.xx_proc_clsf_060;
	}

	public String getXx_proc_clsf_070(){
		return this.xx_proc_clsf_070;
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_TRIP_1900_LCURLISTRecord rec = new HD_TRIP_1900_LCURLISTRecord();
			rec.cd_type = Util.checkString(rset0.getString("cd_type"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_TRIP_1900_LCURLIST2Record rec = new HD_TRIP_1900_LCURLIST2Record();
			rec.pay_basi_clsf = Util.checkString(rset1.getString("pay_basi_clsf"));
			rec.dspch_clsf = Util.checkString(rset1.getString("dspch_clsf"));
			rec.base_alon = Util.checkString(rset1.getString("base_alon"));
			this.curlist2.add(rec);
		}
		this.xx_proc_clsf_010 = Util.checkString(cstmt.getString(7));
		this.xx_proc_clsf_020 = Util.checkString(cstmt.getString(8));
		this.xx_proc_clsf_030 = Util.checkString(cstmt.getString(9));
		this.xx_proc_clsf_040 = Util.checkString(cstmt.getString(10));
		this.xx_proc_clsf_050 = Util.checkString(cstmt.getString(11));
		this.xx_proc_clsf_060 = Util.checkString(cstmt.getString(12));
		this.xx_proc_clsf_070 = Util.checkString(cstmt.getString(13));
		this.xx_rptv_posi_cd_010 = Util.checkString(cstmt.getString(14));
		this.xx_rptv_posi_cd_020 = Util.checkString(cstmt.getString(15));
		this.xx_rptv_posi_cd_030 = Util.checkString(cstmt.getString(16));
		this.xx_pay_basi_clsf_010 = Util.checkString(cstmt.getString(17));
		this.xx_pay_basi_clsf_020 = Util.checkString(cstmt.getString(18));
		this.xx_pay_basi_clsf_030 = Util.checkString(cstmt.getString(19));
		this.xx_dspch_clsf_010 = Util.checkString(cstmt.getString(20));
		this.xx_dspch_clsf_020 = Util.checkString(cstmt.getString(21));
		this.xx_stay_clsf_010 = Util.checkString(cstmt.getString(22));
		this.xx_mode_gubun_010 = Util.checkString(cstmt.getString(23));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1900_LDataSet ds = (HD_TRIP_1900_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1900_LCURLISTRecord curlistRec = (HD_TRIP_1900_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_TRIP_1900_LCURLIST2Record curlist2Rec = (HD_TRIP_1900_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getXx_proc_clsf_010()%>
<%= ds.getXx_proc_clsf_020()%>
<%= ds.getXx_proc_clsf_030()%>
<%= ds.getXx_proc_clsf_040()%>
<%= ds.getXx_proc_clsf_050()%>
<%= ds.getXx_proc_clsf_060()%>
<%= ds.getXx_proc_clsf_070()%>
<%= ds.getXx_rptv_posi_cd_010()%>
<%= ds.getXx_rptv_posi_cd_020()%>
<%= ds.getXx_rptv_posi_cd_030()%>
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

<%= curlistRec.cd_type%>
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlist2Rec.pay_basi_clsf%>
<%= curlist2Rec.dspch_clsf%>
<%= curlist2Rec.base_alon%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 07 17:52:03 KST 2012 */