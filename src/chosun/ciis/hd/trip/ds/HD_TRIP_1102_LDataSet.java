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


public class HD_TRIP_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_trff_means_cd;
	public String xx_cost_clsf_010;
	public String xx_cost_clsf_020;
	public String xx_proc_stat_010;
	public String xx_proc_stat_020;
	public String xx_proc_stat_030;
	public String xx_proc_stat_040;
	public String xx_proc_stat_050;
	public String xx_proc_stat_060;
	public String xx_proc_stat_070;
	public String xx_proc_stat_080;
	public String xx_busi_trip_clsf_010;
	public String xx_busi_trip_clsf_020;
	public String xx_mode_gubun_010;
	public String xx_mode_gubun_020;

	public HD_TRIP_1102_LDataSet(){}
	public HD_TRIP_1102_LDataSet(String errcode, String errmsg, String xx_trff_means_cd, String xx_cost_clsf_010, String xx_cost_clsf_020, String xx_proc_stat_010, String xx_proc_stat_020, String xx_proc_stat_030, String xx_proc_stat_040, String xx_proc_stat_050, String xx_proc_stat_060, String xx_proc_stat_070, String xx_proc_stat_080, String xx_busi_trip_clsf_010, String xx_busi_trip_clsf_020, String xx_mode_gubun_010, String xx_mode_gubun_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_trff_means_cd = xx_trff_means_cd;
		this.xx_cost_clsf_010 = xx_cost_clsf_010;
		this.xx_cost_clsf_020 = xx_cost_clsf_020;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_proc_stat_030 = xx_proc_stat_030;
		this.xx_proc_stat_040 = xx_proc_stat_040;
		this.xx_proc_stat_050 = xx_proc_stat_050;
		this.xx_proc_stat_060 = xx_proc_stat_060;
		this.xx_proc_stat_070 = xx_proc_stat_070;
		this.xx_proc_stat_080 = xx_proc_stat_080;
		this.xx_busi_trip_clsf_010 = xx_busi_trip_clsf_010;
		this.xx_busi_trip_clsf_020 = xx_busi_trip_clsf_020;
		this.xx_mode_gubun_010 = xx_mode_gubun_010;
		this.xx_mode_gubun_020 = xx_mode_gubun_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_trff_means_cd(String xx_trff_means_cd){
		this.xx_trff_means_cd = xx_trff_means_cd;
	}

	public void setXx_cost_clsf_010(String xx_cost_clsf_010){
		this.xx_cost_clsf_010 = xx_cost_clsf_010;
	}

	public void setXx_cost_clsf_020(String xx_cost_clsf_020){
		this.xx_cost_clsf_020 = xx_cost_clsf_020;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_proc_stat_020(String xx_proc_stat_020){
		this.xx_proc_stat_020 = xx_proc_stat_020;
	}

	public void setXx_proc_stat_030(String xx_proc_stat_030){
		this.xx_proc_stat_030 = xx_proc_stat_030;
	}

	public void setXx_proc_stat_040(String xx_proc_stat_040){
		this.xx_proc_stat_040 = xx_proc_stat_040;
	}

	public void setXx_proc_stat_050(String xx_proc_stat_050){
		this.xx_proc_stat_050 = xx_proc_stat_050;
	}

	public void setXx_proc_stat_060(String xx_proc_stat_060){
		this.xx_proc_stat_060 = xx_proc_stat_060;
	}

	public void setXx_proc_stat_070(String xx_proc_stat_070){
		this.xx_proc_stat_070 = xx_proc_stat_070;
	}

	public void setXx_proc_stat_080(String xx_proc_stat_080){
		this.xx_proc_stat_080 = xx_proc_stat_080;
	}

	public void setXx_busi_trip_clsf_010(String xx_busi_trip_clsf_010){
		this.xx_busi_trip_clsf_010 = xx_busi_trip_clsf_010;
	}

	public void setXx_busi_trip_clsf_020(String xx_busi_trip_clsf_020){
		this.xx_busi_trip_clsf_020 = xx_busi_trip_clsf_020;
	}

	public void setXx_mode_gubun_010(String xx_mode_gubun_010){
		this.xx_mode_gubun_010 = xx_mode_gubun_010;
	}

	public void setXx_mode_gubun_020(String xx_mode_gubun_020){
		this.xx_mode_gubun_020 = xx_mode_gubun_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_trff_means_cd(){
		return this.xx_trff_means_cd;
	}

	public String getXx_cost_clsf_010(){
		return this.xx_cost_clsf_010;
	}

	public String getXx_cost_clsf_020(){
		return this.xx_cost_clsf_020;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_proc_stat_020(){
		return this.xx_proc_stat_020;
	}

	public String getXx_proc_stat_030(){
		return this.xx_proc_stat_030;
	}

	public String getXx_proc_stat_040(){
		return this.xx_proc_stat_040;
	}

	public String getXx_proc_stat_050(){
		return this.xx_proc_stat_050;
	}

	public String getXx_proc_stat_060(){
		return this.xx_proc_stat_060;
	}

	public String getXx_proc_stat_070(){
		return this.xx_proc_stat_070;
	}

	public String getXx_proc_stat_080(){
		return this.xx_proc_stat_080;
	}

	public String getXx_busi_trip_clsf_010(){
		return this.xx_busi_trip_clsf_010;
	}

	public String getXx_busi_trip_clsf_020(){
		return this.xx_busi_trip_clsf_020;
	}

	public String getXx_mode_gubun_010(){
		return this.xx_mode_gubun_010;
	}

	public String getXx_mode_gubun_020(){
		return this.xx_mode_gubun_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_TRIP_1102_LCURLIST1Record rec = new HD_TRIP_1102_LCURLIST1Record();
			rec.cd_type = Util.checkString(rset0.getString("cd_type"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_TRIP_1102_LCURLIST2Record rec = new HD_TRIP_1102_LCURLIST2Record();
			rec.cd_type = Util.checkString(rset1.getString("cd_type"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			HD_TRIP_1102_LCURLIST3Record rec = new HD_TRIP_1102_LCURLIST3Record();
			rec.cd_type = Util.checkString(rset2.getString("cd_type"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.curlist3.add(rec);
		}
		this.xx_trff_means_cd = Util.checkString(cstmt.getString(8));
		this.xx_cost_clsf_010 = Util.checkString(cstmt.getString(9));
		this.xx_cost_clsf_020 = Util.checkString(cstmt.getString(10));
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(11));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(12));
		this.xx_proc_stat_030 = Util.checkString(cstmt.getString(13));
		this.xx_proc_stat_040 = Util.checkString(cstmt.getString(14));
		this.xx_proc_stat_050 = Util.checkString(cstmt.getString(15));
		this.xx_proc_stat_060 = Util.checkString(cstmt.getString(16));
		this.xx_proc_stat_070 = Util.checkString(cstmt.getString(17));
		this.xx_proc_stat_080 = Util.checkString(cstmt.getString(18));
		this.xx_busi_trip_clsf_010 = Util.checkString(cstmt.getString(19));
		this.xx_busi_trip_clsf_020 = Util.checkString(cstmt.getString(20));
		this.xx_mode_gubun_010 = Util.checkString(cstmt.getString(21));
		this.xx_mode_gubun_020 = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1102_LDataSet ds = (HD_TRIP_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_TRIP_1102_LCURLIST1Record curlist1Rec = (HD_TRIP_1102_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_TRIP_1102_LCURLIST2Record curlist2Rec = (HD_TRIP_1102_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_TRIP_1102_LCURLIST3Record curlist3Rec = (HD_TRIP_1102_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getXx_trff_means_cd()%>
<%= ds.getXx_cost_clsf_010()%>
<%= ds.getXx_cost_clsf_020()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_proc_stat_030()%>
<%= ds.getXx_proc_stat_040()%>
<%= ds.getXx_proc_stat_050()%>
<%= ds.getXx_proc_stat_060()%>
<%= ds.getXx_proc_stat_070()%>
<%= ds.getXx_proc_stat_080()%>
<%= ds.getXx_busi_trip_clsf_010()%>
<%= ds.getXx_busi_trip_clsf_020()%>
<%= ds.getXx_mode_gubun_010()%>
<%= ds.getXx_mode_gubun_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd_type%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist2Rec.cd_type%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist3Rec.cd_type%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 06 17:48:19 KST 2012 */