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


public class HD_TRIP_1902_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1902_LDataSet(){}
	public HD_TRIP_1902_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_TRIP_1902_LCURLISTRecord rec = new HD_TRIP_1902_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.busi_trip_frdt = Util.checkString(rset0.getString("busi_trip_frdt"));
			rec.busi_trip_todt = Util.checkString(rset0.getString("busi_trip_todt"));
			rec.busi_trip_clsf = Util.checkString(rset0.getString("busi_trip_clsf"));
			rec.busi_trip_purp = Util.checkString(rset0.getString("busi_trip_purp"));
			rec.dd_fee = Util.checkString(rset0.getString("dd_fee"));
			rec.busi_trip_dds = Util.checkString(rset0.getString("busi_trip_dds"));
			rec.busi_trip_fee_stot = Util.checkString(rset0.getString("busi_trip_fee_stot"));
			rec.stay_clsf = Util.checkString(rset0.getString("stay_clsf"));
			rec.stay_clsf_nm = Util.checkString(rset0.getString("stay_clsf_nm"));
			rec.stay_area = Util.checkString(rset0.getString("stay_area"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.slip_proc_mang_seq_num = Util.checkString(rset0.getString("slip_proc_mang_seq_num"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			rec.proc_clsf_nm = Util.checkString(rset0.getString("proc_clsf_nm"));
			rec.rptv_posi_cd = Util.checkString(rset0.getString("rptv_posi_cd"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.tmp_crdt_amt = Util.checkString(rset0.getString("tmp_crdt_amt"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.titl2 = Util.checkString(rset0.getString("titl2"));
			rec.cost_fix_clsf = Util.checkString(rset0.getString("cost_fix_clsf"));
			rec.cost_fix_clsf_chk = Util.checkString(rset0.getString("cost_fix_clsf_chk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1902_LDataSet ds = (HD_TRIP_1902_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1902_LCURLISTRecord curlistRec = (HD_TRIP_1902_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.busi_trip_clsf%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.dd_fee%>
<%= curlistRec.busi_trip_dds%>
<%= curlistRec.busi_trip_fee_stot%>
<%= curlistRec.stay_clsf%>
<%= curlistRec.stay_clsf_nm%>
<%= curlistRec.stay_area%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.slip_proc_mang_seq_num%>
<%= curlistRec.proc_clsf%>
<%= curlistRec.proc_clsf_nm%>
<%= curlistRec.rptv_posi_cd%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.tmp_crdt_amt%>
<%= curlistRec.titl%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.titl2%>
<%= curlistRec.cost_fix_clsf%>
<%= curlistRec.cost_fix_clsf_chk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 10 16:37:29 KST 2009 */