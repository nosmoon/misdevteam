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


public class HD_TRIP_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1500_LDataSet(){}
	public HD_TRIP_1500_LDataSet(String errcode, String errmsg){
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
			HD_TRIP_1500_LCURLISTRecord rec = new HD_TRIP_1500_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			rec.busi_trip_dest = Util.checkString(rset0.getString("busi_trip_dest"));
			rec.via_area = Util.checkString(rset0.getString("via_area"));
			rec.busi_trip_frdt = Util.checkString(rset0.getString("busi_trip_frdt"));
			rec.busi_trip_todt = Util.checkString(rset0.getString("busi_trip_todt"));
			rec.invit_dds = Util.checkString(rset0.getString("invit_dds"));
			rec.busi_trip_dds = Util.checkString(rset0.getString("busi_trip_dds"));
			rec.busi_trip_purp = Util.checkString(rset0.getString("busi_trip_purp"));
			rec.fix_dd_fee = Util.checkString(rset0.getString("fix_dd_fee"));
			rec.fix_stay_fee = Util.checkString(rset0.getString("fix_stay_fee"));
			rec.fix_aviat_fee = Util.checkString(rset0.getString("fix_aviat_fee"));
			rec.fix_etc_cost = Util.checkString(rset0.getString("fix_etc_cost"));
			rec.fix_cost_tot = Util.checkString(rset0.getString("fix_cost_tot"));
			rec.adpay_no = Util.checkString(rset0.getString("adpay_no"));
			rec.adpay_amt = Util.checkString(rset0.getString("adpay_amt"));
			rec.expn_reso_no = Util.checkString(rset0.getString("expn_reso_no"));
			rec.adjm_dd_fee = Util.checkString(rset0.getString("adjm_dd_fee"));
			rec.adjm_stay_fee = Util.checkString(rset0.getString("adjm_stay_fee"));
			rec.adjm_aviat_fee = Util.checkString(rset0.getString("adjm_aviat_fee"));
			rec.adjm_etc_cost = Util.checkString(rset0.getString("adjm_etc_cost"));
			rec.adjm_cost_tot = Util.checkString(rset0.getString("adjm_cost_tot"));
			rec.minus_cost_tot = Util.checkString(rset0.getString("minus_cost_tot"));
			rec.ceph_use_yn = Util.checkString(rset0.getString("ceph_use_yn"));
			rec.ceph_use_nm = Util.checkString(rset0.getString("ceph_use_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.with_seq = Util.checkString(rset0.getString("with_seq"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aviat_fee = Util.checkString(rset0.getString("aviat_fee"));
			rec.stay_fee = Util.checkString(rset0.getString("stay_fee"));
			rec.dd_fee = Util.checkString(rset0.getString("dd_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1500_LDataSet ds = (HD_TRIP_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1500_LCURLISTRecord curlistRec = (HD_TRIP_1500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.natn_nm%>
<%= curlistRec.busi_trip_dest%>
<%= curlistRec.via_area%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.invit_dds%>
<%= curlistRec.busi_trip_dds%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.fix_dd_fee%>
<%= curlistRec.fix_stay_fee%>
<%= curlistRec.fix_aviat_fee%>
<%= curlistRec.fix_etc_cost%>
<%= curlistRec.fix_cost_tot%>
<%= curlistRec.adpay_no%>
<%= curlistRec.adpay_amt%>
<%= curlistRec.expn_reso_no%>
<%= curlistRec.adjm_dd_fee%>
<%= curlistRec.adjm_stay_fee%>
<%= curlistRec.adjm_aviat_fee%>
<%= curlistRec.adjm_etc_cost%>
<%= curlistRec.adjm_cost_tot%>
<%= curlistRec.minus_cost_tot%>
<%= curlistRec.ceph_use_yn%>
<%= curlistRec.ceph_use_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.with_seq%>
<%= curlistRec.seq%>
<%= curlistRec.aviat_fee%>
<%= curlistRec.stay_fee%>
<%= curlistRec.dd_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 14:16:37 KST 2009 */