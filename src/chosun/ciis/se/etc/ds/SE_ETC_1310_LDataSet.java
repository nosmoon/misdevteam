/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String trmrd_qty;
	public String dncn_qty;
	public String month_qty;
	public String aft_qty;
	public String real_qty;
	public String avg_qty;
	public String rate;
	public String totclos_yn;
	public String areaclos_yn;
	public String fix_msg;
	public String fix_dt;

	public SE_ETC_1310_LDataSet(){}
	public SE_ETC_1310_LDataSet(String errcode, String errmsg, String trmrd_qty, String dncn_qty, String month_qty, String aft_qty, String real_qty, String avg_qty, String rate, String totclos_yn, String areaclos_yn, String fix_msg, String fix_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.trmrd_qty = trmrd_qty;
		this.dncn_qty = dncn_qty;
		this.month_qty = month_qty;
		this.aft_qty = aft_qty;
		this.real_qty = real_qty;
		this.avg_qty = avg_qty;
		this.rate = rate;
		this.totclos_yn = totclos_yn;
		this.areaclos_yn = areaclos_yn;
		this.fix_msg = fix_msg;
		this.fix_dt = fix_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTrmrd_qty(String trmrd_qty){
		this.trmrd_qty = trmrd_qty;
	}

	public void setDncn_qty(String dncn_qty){
		this.dncn_qty = dncn_qty;
	}

	public void setMonth_qty(String month_qty){
		this.month_qty = month_qty;
	}

	public void setAft_qty(String aft_qty){
		this.aft_qty = aft_qty;
	}

	public void setReal_qty(String real_qty){
		this.real_qty = real_qty;
	}

	public void setAvg_qty(String avg_qty){
		this.avg_qty = avg_qty;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setTotclos_yn(String totclos_yn){
		this.totclos_yn = totclos_yn;
	}

	public void setAreaclos_yn(String areaclos_yn){
		this.areaclos_yn = areaclos_yn;
	}

	public void setFix_msg(String fix_msg){
		this.fix_msg = fix_msg;
	}

	public void setFix_dt(String fix_dt){
		this.fix_dt = fix_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTrmrd_qty(){
		return this.trmrd_qty;
	}

	public String getDncn_qty(){
		return this.dncn_qty;
	}

	public String getMonth_qty(){
		return this.month_qty;
	}

	public String getAft_qty(){
		return this.aft_qty;
	}

	public String getReal_qty(){
		return this.real_qty;
	}

	public String getAvg_qty(){
		return this.avg_qty;
	}

	public String getRate(){
		return this.rate;
	}

	public String getTotclos_yn(){
		return this.totclos_yn;
	}

	public String getAreaclos_yn(){
		return this.areaclos_yn;
	}

	public String getFix_msg(){
		return this.fix_msg;
	}

	public String getFix_dt(){
		return this.fix_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_ETC_1310_LCURLISTRecord rec = new SE_ETC_1310_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.trmrd_qty_0 = Util.checkString(rset0.getString("trmrd_qty_0"));
			rec.dscn_rdr_qty_0 = Util.checkString(rset0.getString("dscn_rdr_qty_0"));
			rec.month_aft_qty_1 = Util.checkString(rset0.getString("month_aft_qty_1"));
			rec.month_aft_qty_2 = Util.checkString(rset0.getString("month_aft_qty_2"));
			rec.month_aft_qty_3 = Util.checkString(rset0.getString("month_aft_qty_3"));
			rec.month_aft_qty_4 = Util.checkString(rset0.getString("month_aft_qty_4"));
			rec.month_aft_qty_5 = Util.checkString(rset0.getString("month_aft_qty_5"));
			rec.month_aft_qty_6 = Util.checkString(rset0.getString("month_aft_qty_6"));
			rec.month_aft_qty_7 = Util.checkString(rset0.getString("month_aft_qty_7"));
			rec.aft_qty = Util.checkString(rset0.getString("aft_qty"));
			rec.dnt_qty = Util.checkString(rset0.getString("dnt_qty"));
			rec.avg_send_qty = Util.checkString(rset0.getString("avg_send_qty"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
		this.trmrd_qty = Util.checkString(cstmt.getString(12));
		this.dncn_qty = Util.checkString(cstmt.getString(13));
		this.month_qty = Util.checkString(cstmt.getString(14));
		this.aft_qty = Util.checkString(cstmt.getString(15));
		this.real_qty = Util.checkString(cstmt.getString(16));
		this.avg_qty = Util.checkString(cstmt.getString(17));
		this.rate = Util.checkString(cstmt.getString(18));
		this.totclos_yn = Util.checkString(cstmt.getString(19));
		this.areaclos_yn = Util.checkString(cstmt.getString(20));
		this.fix_msg = Util.checkString(cstmt.getString(21));
		this.fix_dt = Util.checkString(cstmt.getString(22));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_ETC_1310_LDataSet ds = (SE_ETC_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_ETC_1310_LCURLISTRecord curlistRec = (SE_ETC_1310_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getTrmrd_qty()%>
<%= ds.getDncn_qty()%>
<%= ds.getMonth_qty()%>
<%= ds.getAft_qty()%>
<%= ds.getReal_qty()%>
<%= ds.getAvg_qty()%>
<%= ds.getRate()%>
<%= ds.getTotclos_yn()%>
<%= ds.getAreaclos_yn()%>
<%= ds.getFix_msg()%>
<%= ds.getFix_dt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.trmrd_qty_0%>
<%= curlistRec.dscn_rdr_qty_0%>
<%= curlistRec.month_aft_qty_1%>
<%= curlistRec.month_aft_qty_2%>
<%= curlistRec.month_aft_qty_3%>
<%= curlistRec.month_aft_qty_4%>
<%= curlistRec.month_aft_qty_5%>
<%= curlistRec.month_aft_qty_6%>
<%= curlistRec.month_aft_qty_7%>
<%= curlistRec.aft_qty%>
<%= curlistRec.dnt_qty%>
<%= curlistRec.avg_send_qty%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 15:08:49 KST 2015 */