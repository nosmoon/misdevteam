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


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String totclos_yn;
	public String areaclos_yn;
	public String fix_msg;
	public String fix_dt;
	public String issu_dt_cnt;

	public SE_SAL_2710_LDataSet(){}
	public SE_SAL_2710_LDataSet(String errcode, String errmsg, String totclos_yn, String areaclos_yn, String fix_msg, String fix_dt, String issu_dt_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totclos_yn = totclos_yn;
		this.areaclos_yn = areaclos_yn;
		this.fix_msg = fix_msg;
		this.fix_dt = fix_dt;
		this.issu_dt_cnt = issu_dt_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setIssu_dt_cnt(String issu_dt_cnt){
		this.issu_dt_cnt = issu_dt_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public String getIssu_dt_cnt(){
		return this.issu_dt_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SE_SAL_2710_LCURLISTRecord rec = new SE_SAL_2710_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.bgn_mm = Util.checkString(rset0.getString("bgn_mm"));
			rec.end_mm = Util.checkString(rset0.getString("end_mm"));
			rec.months = Util.checkString(rset0.getString("months"));
			rec.src_months = Util.checkString(rset0.getString("src_months"));
			rec.damt_decid_amt = Util.checkString(rset0.getString("damt_decid_amt"));
			rec.result_amt = Util.checkString(rset0.getString("result_amt"));
			rec.widr_yn = Util.checkString(rset0.getString("widr_yn"));
			rec.widr_bgn_mm = Util.checkString(rset0.getString("widr_bgn_mm"));
			rec.widr_amt = Util.checkString(rset0.getString("widr_amt"));
			this.curlist.add(rec);
		}
		this.totclos_yn = Util.checkString(cstmt.getString(16));
		this.areaclos_yn = Util.checkString(cstmt.getString(17));
		this.fix_msg = Util.checkString(cstmt.getString(18));
		this.fix_dt = Util.checkString(cstmt.getString(19));
		this.issu_dt_cnt = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2710_LDataSet ds = (SE_SAL_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2710_LCURLISTRecord curlistRec = (SE_SAL_2710_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getTotclos_yn()%>
<%= ds.getAreaclos_yn()%>
<%= ds.getFix_msg()%>
<%= ds.getFix_dt()%>
<%= ds.getIssu_dt_cnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yymm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.bgn_mm%>
<%= curlistRec.end_mm%>
<%= curlistRec.months%>
<%= curlistRec.src_months%>
<%= curlistRec.damt_decid_amt%>
<%= curlistRec.result_amt%>
<%= curlistRec.widr_yn%>
<%= curlistRec.widr_bgn_mm%>
<%= curlistRec.widr_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 26 17:35:50 KST 2013 */