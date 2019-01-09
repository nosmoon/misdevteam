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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_5060_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_5060_LDataSet(){}
	public PR_PRTEXEC_5060_LDataSet(String errcode, String errmsg){
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
			PR_PRTEXEC_5060_LCURLISTRecord rec = new PR_PRTEXEC_5060_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.chg_yn = Util.checkString(rset0.getString("chg_yn"));
			rec.gnr_qty = Util.checkString(rset0.getString("gnr_qty"));
			rec.spsl_qty = Util.checkString(rset0.getString("spsl_qty"));
			rec.gnr_add_qty = Util.checkString(rset0.getString("gnr_add_qty"));
			rec.spsl_add_qty = Util.checkString(rset0.getString("spsl_add_qty"));
			rec.add_prt_seq = Util.checkString(rset0.getString("add_prt_seq"));
			rec.dual_out_clsf = Util.checkString(rset0.getString("dual_out_clsf"));
			rec.dual_out_nm = Util.checkString(rset0.getString("dual_out_nm"));
			rec.duty_ovt_prt_yn = Util.checkString(rset0.getString("duty_ovt_prt_yn"));
			rec.send_clos_point_clsf = Util.checkString(rset0.getString("send_clos_point_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_5060_LDataSet ds = (PR_PRTEXEC_5060_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_5060_LCURLISTRecord curlistRec = (PR_PRTEXEC_5060_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.issu_dt%>
<%= curlistRec.prt_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pap_std%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.slip_qty%>
<%= curlistRec.chg_yn%>
<%= curlistRec.gnr_qty%>
<%= curlistRec.spsl_qty%>
<%= curlistRec.gnr_add_qty%>
<%= curlistRec.spsl_add_qty%>
<%= curlistRec.add_prt_seq%>
<%= curlistRec.dual_out_clsf%>
<%= curlistRec.dual_out_nm%>
<%= curlistRec.duty_ovt_prt_yn%>
<%= curlistRec.send_clos_point_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 08 17:25:51 KST 2009 */