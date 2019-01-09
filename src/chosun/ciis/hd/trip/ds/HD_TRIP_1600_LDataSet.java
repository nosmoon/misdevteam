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


public class HD_TRIP_1600_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1600_LDataSet(){}
	public HD_TRIP_1600_LDataSet(String errcode, String errmsg){
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
			HD_TRIP_1600_LCURLISTRecord rec = new HD_TRIP_1600_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.with_seq = Util.checkString(rset0.getString("with_seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
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
			rec.draft_dt = Util.checkString(rset0.getString("draft_dt"));
			rec.adpay_no = Util.checkString(rset0.getString("adpay_no"));
			rec.adpay_amt = Util.checkString(rset0.getString("adpay_amt"));
			rec.adpay_plan_dt = Util.checkString(rset0.getString("adpay_plan_dt"));
			rec.actu_pay_dt = Util.checkString(rset0.getString("actu_pay_dt"));
			rec.expn_reso_no = Util.checkString(rset0.getString("expn_reso_no"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			rec.invit_dds = Util.checkString(rset0.getString("invit_dds"));
			rec.fix_aviat_fee = Util.checkString(rset0.getString("fix_aviat_fee"));
			rec.adjm_aviat_fee = Util.checkString(rset0.getString("adjm_aviat_fee"));
			rec.fix_stay_fee = Util.checkString(rset0.getString("fix_stay_fee"));
			rec.adjm_stay_fee = Util.checkString(rset0.getString("adjm_stay_fee"));
			rec.fix_dd_fee = Util.checkString(rset0.getString("fix_dd_fee"));
			rec.adjm_dd_fee = Util.checkString(rset0.getString("adjm_dd_fee"));
			rec.fix_etc_cost = Util.checkString(rset0.getString("fix_etc_cost"));
			rec.adjm_etc_cost = Util.checkString(rset0.getString("adjm_etc_cost"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1600_LDataSet ds = (HD_TRIP_1600_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1600_LCURLISTRecord curlistRec = (HD_TRIP_1600_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.with_seq%>
<%= curlistRec.flnm%>
<%= curlistRec.cd_nm%>
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
<%= curlistRec.draft_dt%>
<%= curlistRec.adpay_no%>
<%= curlistRec.adpay_amt%>
<%= curlistRec.adpay_plan_dt%>
<%= curlistRec.actu_pay_dt%>
<%= curlistRec.expn_reso_no%>
<%= curlistRec.natn_cd%>
<%= curlistRec.natn_nm%>
<%= curlistRec.invit_dds%>
<%= curlistRec.fix_aviat_fee%>
<%= curlistRec.adjm_aviat_fee%>
<%= curlistRec.fix_stay_fee%>
<%= curlistRec.adjm_stay_fee%>
<%= curlistRec.fix_dd_fee%>
<%= curlistRec.adjm_dd_fee%>
<%= curlistRec.fix_etc_cost%>
<%= curlistRec.adjm_etc_cost%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 13:49:59 KST 2009 */