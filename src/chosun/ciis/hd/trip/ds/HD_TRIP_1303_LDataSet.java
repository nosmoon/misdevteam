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


public class HD_TRIP_1303_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_TRIP_1303_LDataSet(){}
	public HD_TRIP_1303_LDataSet(String errcode, String errmsg){
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
			HD_TRIP_1303_LCURLISTRecord rec = new HD_TRIP_1303_LCURLISTRecord();
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
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1303_LDataSet ds = (HD_TRIP_1303_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1303_LCURLISTRecord curlistRec = (HD_TRIP_1303_LCURLISTRecord)ds.curlist.get(i);%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 13:24:49 KST 2009 */