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


public class HD_TRIP_1304_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1304_LDataSet(){}
	public HD_TRIP_1304_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_TRIP_1304_LCURLISTRecord rec = new HD_TRIP_1304_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.with_seq = Util.checkString(rset0.getString("with_seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.busi_trip_purp = Util.checkString(rset0.getString("busi_trip_purp"));
			rec.busi_trip_dest = Util.checkString(rset0.getString("busi_trip_dest"));
			rec.busi_trip_frdt = Util.checkString(rset0.getString("busi_trip_frdt"));
			rec.busi_trip_todt = Util.checkString(rset0.getString("busi_trip_todt"));
			rec.busi_trip_dds = Util.checkString(rset0.getString("busi_trip_dds"));
			rec.invit_instt = Util.checkString(rset0.getString("invit_instt"));
			rec.busi_trip_fee_burd_clsf = Util.checkString(rset0.getString("busi_trip_fee_burd_clsf"));
			rec.busi_trip_neces = Util.checkString(rset0.getString("busi_trip_neces"));
			rec.aviat_fee = Util.checkString(rset0.getString("aviat_fee"));
			rec.stay_fee = Util.checkString(rset0.getString("stay_fee"));
			rec.dd_fee = Util.checkString(rset0.getString("dd_fee"));
			rec.ceph_use_yn = Util.checkString(rset0.getString("ceph_use_yn"));
			rec.busi_trip_fee_stot = Util.checkString(rset0.getString("busi_trip_fee_stot"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.genl_affrs_clsf = Util.checkString(rset0.getString("genl_affrs_clsf"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_TRIP_1304_LCURLIST2Record rec = new HD_TRIP_1304_LCURLIST2Record();
			rec.g_cmpy_cd = Util.checkString(rset1.getString("g_cmpy_cd"));
			rec.g_emp_no = Util.checkString(rset1.getString("g_emp_no"));
			rec.g_occr_dt = Util.checkString(rset1.getString("g_occr_dt"));
			rec.g_seq = Util.checkString(rset1.getString("g_seq"));
			rec.g_with_seq = Util.checkString(rset1.getString("g_with_seq"));
			rec.g_nm_korn = Util.checkString(rset1.getString("g_nm_korn"));
			rec.g_dept_cd = Util.checkString(rset1.getString("g_dept_cd"));
			rec.g_dept_nm = Util.checkString(rset1.getString("g_dept_nm"));
			rec.g_dty_cd = Util.checkString(rset1.getString("g_dty_cd"));
			rec.g_dty_nm = Util.checkString(rset1.getString("g_dty_nm"));
			rec.g_posi_cd = Util.checkString(rset1.getString("g_posi_cd"));
			rec.g_posi_nm = Util.checkString(rset1.getString("g_posi_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_TRIP_1304_LCURLIST3Record rec = new HD_TRIP_1304_LCURLIST3Record();
			rec.d_cmpy_cd = Util.checkString(rset2.getString("d_cmpy_cd"));
			rec.d_emp_no = Util.checkString(rset2.getString("d_emp_no"));
			rec.d_occr_dt = Util.checkString(rset2.getString("d_occr_dt"));
			rec.d_seq = Util.checkString(rset2.getString("d_seq"));
			rec.d_sub_seq = Util.checkString(rset2.getString("d_sub_seq"));
			rec.d_with_seq = Util.checkString(rset2.getString("d_with_seq"));
			rec.d_start_area = Util.checkString(rset2.getString("d_start_area"));
			rec.d_midl_start_dt = Util.checkString(rset2.getString("d_midl_start_dt"));
			rec.d_dest = Util.checkString(rset2.getString("d_dest"));
			rec.d_busi_trip_cont = Util.checkString(rset2.getString("d_busi_trip_cont"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			HD_TRIP_1304_LCURLIST4Record rec = new HD_TRIP_1304_LCURLIST4Record();
			rec.e_cmpy_cd = Util.checkString(rset3.getString("e_cmpy_cd"));
			rec.e_emp_no = Util.checkString(rset3.getString("e_emp_no"));
			rec.e_occr_dt = Util.checkString(rset3.getString("e_occr_dt"));
			rec.e_seq = Util.checkString(rset3.getString("e_seq"));
			rec.e_sub_seq = Util.checkString(rset3.getString("e_sub_seq"));
			rec.e_with_seq = Util.checkString(rset3.getString("e_with_seq"));
			rec.e_etc_cost_ptcr = Util.checkString(rset3.getString("e_etc_cost_ptcr"));
			rec.e_etc_cost = Util.checkString(rset3.getString("e_etc_cost"));
			rec.e_etc_cost_neces = Util.checkString(rset3.getString("e_etc_cost_neces"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1304_LDataSet ds = (HD_TRIP_1304_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1304_LCURLISTRecord curlistRec = (HD_TRIP_1304_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_TRIP_1304_LCURLIST2Record curlist2Rec = (HD_TRIP_1304_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_TRIP_1304_LCURLIST3Record curlist3Rec = (HD_TRIP_1304_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_TRIP_1304_LCURLIST4Record curlist4Rec = (HD_TRIP_1304_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.with_seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.busi_trip_dest%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.busi_trip_dds%>
<%= curlistRec.invit_instt%>
<%= curlistRec.busi_trip_fee_burd_clsf%>
<%= curlistRec.busi_trip_neces%>
<%= curlistRec.aviat_fee%>
<%= curlistRec.stay_fee%>
<%= curlistRec.dd_fee%>
<%= curlistRec.ceph_use_yn%>
<%= curlistRec.busi_trip_fee_stot%>
<%= curlistRec.remk%>
<%= curlistRec.proc_stat%>
<%= curlistRec.genl_affrs_clsf%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.natn_cd%>
<%= curlist2Rec.g_cmpy_cd%>
<%= curlist2Rec.g_emp_no%>
<%= curlist2Rec.g_occr_dt%>
<%= curlist2Rec.g_seq%>
<%= curlist2Rec.g_with_seq%>
<%= curlist2Rec.g_nm_korn%>
<%= curlist2Rec.g_dept_cd%>
<%= curlist2Rec.g_dept_nm%>
<%= curlist2Rec.g_dty_cd%>
<%= curlist2Rec.g_dty_nm%>
<%= curlist2Rec.g_posi_cd%>
<%= curlist2Rec.g_posi_nm%>
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
<%= curlist4Rec.e_etc_cost_neces%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 10:29:00 KST 2009 */