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


public class HD_TRIP_1502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1502_LDataSet(){}
	public HD_TRIP_1502_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_TRIP_1502_LCURLIST3Record rec = new HD_TRIP_1502_LCURLIST3Record();
			rec.d_cmpy_cd = Util.checkString(rset0.getString("d_cmpy_cd"));
			rec.d_emp_no = Util.checkString(rset0.getString("d_emp_no"));
			rec.d_occr_dt = Util.checkString(rset0.getString("d_occr_dt"));
			rec.d_seq = Util.checkString(rset0.getString("d_seq"));
			rec.d_sub_seq = Util.checkString(rset0.getString("d_sub_seq"));
			rec.d_with_seq = Util.checkString(rset0.getString("d_with_seq"));
			rec.d_start_area = Util.checkString(rset0.getString("d_start_area"));
			rec.d_midl_start_dt = Util.checkString(rset0.getString("d_midl_start_dt"));
			rec.d_dest = Util.checkString(rset0.getString("d_dest"));
			rec.d_busi_trip_cont = Util.checkString(rset0.getString("d_busi_trip_cont"));
			this.curlist3.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			HD_TRIP_1502_LCURLIST4Record rec = new HD_TRIP_1502_LCURLIST4Record();
			rec.e_cmpy_cd = Util.checkString(rset1.getString("e_cmpy_cd"));
			rec.e_emp_no = Util.checkString(rset1.getString("e_emp_no"));
			rec.e_occr_dt = Util.checkString(rset1.getString("e_occr_dt"));
			rec.e_seq = Util.checkString(rset1.getString("e_seq"));
			rec.e_sub_seq = Util.checkString(rset1.getString("e_sub_seq"));
			rec.e_with_seq = Util.checkString(rset1.getString("e_with_seq"));
			rec.e_etc_cost_ptcr = Util.checkString(rset1.getString("e_etc_cost_ptcr"));
			rec.e_etc_cost = Util.checkString(rset1.getString("e_etc_cost"));
			rec.e_fix_etc_cost = Util.checkString(rset1.getString("e_fix_etc_cost"));
			rec.e_adjm_etc_cost = Util.checkString(rset1.getString("e_adjm_etc_cost"));
			rec.e_etc_cost_neces = Util.checkString(rset1.getString("e_etc_cost_neces"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1502_LDataSet ds = (HD_TRIP_1502_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_TRIP_1502_LCURLIST3Record curlist3Rec = (HD_TRIP_1502_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_TRIP_1502_LCURLIST4Record curlist4Rec = (HD_TRIP_1502_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist3Rec.d_cmpy_cd%>
<%= curlist3Rec.d_emp_no%>
<%= curlist3Rec.d_occr_dt%>
<%= curlist3Rec.d_seq%>
<%= curlist3Rec.d_sub_seq%>
<%= curlist3Rec.d_with_seq%>
<%= curlist3Rec.d_start_area%>
<%= curlist3Rec.d_midl_start_dt%>
<%= curlist3Rec.d_dest%>
<%= curlist3Rec.d_busi_trip_cont%>
<%= curlist4Rec.e_cmpy_cd%>
<%= curlist4Rec.e_emp_no%>
<%= curlist4Rec.e_occr_dt%>
<%= curlist4Rec.e_seq%>
<%= curlist4Rec.e_sub_seq%>
<%= curlist4Rec.e_with_seq%>
<%= curlist4Rec.e_etc_cost_ptcr%>
<%= curlist4Rec.e_etc_cost%>
<%= curlist4Rec.e_fix_etc_cost%>
<%= curlist4Rec.e_adjm_etc_cost%>
<%= curlist4Rec.e_etc_cost_neces%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 10:09:00 KST 2009 */