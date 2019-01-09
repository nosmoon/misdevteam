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


public class HD_TRIP_1200_344_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1200_344_LDataSet(){}
	public HD_TRIP_1200_344_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_TRIP_1200_344_LCURLISTRecord rec = new HD_TRIP_1200_344_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.busi_trip_frdt = Util.checkString(rset0.getString("busi_trip_frdt"));
			rec.start_tm = Util.checkString(rset0.getString("start_tm"));
			rec.ariv_tm = Util.checkString(rset0.getString("ariv_tm"));
			rec.busi_trip_todt = Util.checkString(rset0.getString("busi_trip_todt"));
			rec.busi_trip_clsf = Util.checkString(rset0.getString("busi_trip_clsf"));
			rec.busi_trip_nm = Util.checkString(rset0.getString("busi_trip_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.busi_trip_purp = Util.checkString(rset0.getString("busi_trip_purp"));
			rec.trff_means_cd = Util.checkString(rset0.getString("trff_means_cd"));
			rec.trff_means_nm = Util.checkString(rset0.getString("trff_means_nm"));
			rec.trff_means_etc = Util.checkString(rset0.getString("trff_means_etc"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.busi_trip_fee_stot = Util.checkString(rset0.getString("busi_trip_fee_stot"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1200_344_LDataSet ds = (HD_TRIP_1200_344_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1200_344_LCURLISTRecord curlistRec = (HD_TRIP_1200_344_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.occr_dt%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.start_tm%>
<%= curlistRec.ariv_tm%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.busi_trip_clsf%>
<%= curlistRec.busi_trip_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.flnm%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.trff_means_cd%>
<%= curlistRec.trff_means_nm%>
<%= curlistRec.trff_means_etc%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.busi_trip_fee_stot%>
<%= curlistRec.emp_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dtls_medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 14:56:40 KST 2012 */