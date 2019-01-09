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


package chosun.ciis.hd.corr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.rec.*;

/**
 * 
 */


public class HD_CORR_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_CORR_1020_LDataSet(){}
	public HD_CORR_1020_LDataSet(String errcode, String errmsg){
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
			HD_CORR_1020_LCURLISTRecord rec = new HD_CORR_1020_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.pay_yymm = Util.checkString(rset0.getString("pay_yymm"));
			rec.istt_cost_cd = Util.checkString(rset0.getString("istt_cost_cd"));
			rec.istt_cost_nm = Util.checkString(rset0.getString("istt_cost_nm"));
			rec.istt_cost_ptcr = Util.checkString(rset0.getString("istt_cost_ptcr"));
			rec.frex_clsf = Util.checkString(rset0.getString("frex_clsf"));
			rec.frex_clsf_nm = Util.checkString(rset0.getString("frex_clsf_nm"));
			rec.aplc_frex = Util.checkString(rset0.getString("aplc_frex"));
			rec.aplc_won = Util.checkString(rset0.getString("aplc_won"));
			rec.adjm_frex = Util.checkString(rset0.getString("adjm_frex"));
			rec.adjm_won = Util.checkString(rset0.getString("adjm_won"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_CORR_1020_LDataSet ds = (HD_CORR_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_CORR_1020_LCURLISTRecord curlistRec = (HD_CORR_1020_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.sub_seq%>
<%= curlistRec.pay_yymm%>
<%= curlistRec.istt_cost_cd%>
<%= curlistRec.istt_cost_nm%>
<%= curlistRec.istt_cost_ptcr%>
<%= curlistRec.frex_clsf%>
<%= curlistRec.frex_clsf_nm%>
<%= curlistRec.aplc_frex%>
<%= curlistRec.aplc_won%>
<%= curlistRec.adjm_frex%>
<%= curlistRec.adjm_won%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 15:20:13 KST 2009 */