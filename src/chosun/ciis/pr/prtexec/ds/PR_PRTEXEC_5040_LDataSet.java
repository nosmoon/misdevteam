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


public class PR_PRTEXEC_5040_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_5040_LDataSet(){}
	public PR_PRTEXEC_5040_LDataSet(String errcode, String errmsg){
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
			PR_PRTEXEC_5040_LCURLISTRecord rec = new PR_PRTEXEC_5040_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.hdqt_paper_clsf = Util.checkString(rset0.getString("hdqt_paper_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.is_cnt_ex_yn = Util.checkString(rset0.getString("is_cnt_ex_yn"));
			rec.is_qty_inc_yn = Util.checkString(rset0.getString("is_qty_inc_yn"));
			rec.add_prt_yn = Util.checkString(rset0.getString("add_prt_yn"));
			rec.qunt_out_yn = Util.checkString(rset0.getString("qunt_out_yn"));
			rec.duty_ovt_prt_yn = Util.checkString(rset0.getString("duty_ovt_prt_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_5040_LDataSet ds = (PR_PRTEXEC_5040_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_5040_LCURLISTRecord curlistRec = (PR_PRTEXEC_5040_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.occr_dt%>
<%= curlistRec.hdqt_paper_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.prt_dt%>
<%= curlistRec.issu_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.pap_std%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.slip_qty%>
<%= curlistRec.is_cnt_ex_yn%>
<%= curlistRec.is_qty_inc_yn%>
<%= curlistRec.add_prt_yn%>
<%= curlistRec.qunt_out_yn%>
<%= curlistRec.duty_ovt_prt_yn%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 17:15:51 KST 2009 */