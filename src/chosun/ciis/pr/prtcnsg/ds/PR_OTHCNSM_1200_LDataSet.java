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


package chosun.ciis.pr.prtcnsg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_OTHCNSM_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_OTHCNSM_1200_LDataSet(){}
	public PR_OTHCNSM_1200_LDataSet(String errcode, String errmsg){
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
			PR_OTHCNSM_1200_LCURLISTRecord rec = new PR_OTHCNSM_1200_LCURLISTRecord();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_qty = Util.checkString(rset0.getString("issu_qty"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.film_use_qunt = Util.checkString(rset0.getString("film_use_qunt"));
			rec.u_1 = Util.checkString(rset0.getString("u_1"));
			rec.n_1 = Util.checkString(rset0.getString("n_1"));
			rec.u_2 = Util.checkString(rset0.getString("u_2"));
			rec.n_2 = Util.checkString(rset0.getString("n_2"));
			rec.u_4 = Util.checkString(rset0.getString("u_4"));
			rec.n_4 = Util.checkString(rset0.getString("n_4"));
			rec.u_m2 = Util.checkString(rset0.getString("u_m2"));
			rec.n_m2 = Util.checkString(rset0.getString("n_m2"));
			rec.u_m4 = Util.checkString(rset0.getString("u_m4"));
			rec.n_m4 = Util.checkString(rset0.getString("n_m4"));
			rec.prt_fee = Util.checkString(rset0.getString("prt_fee"));
			rec.paper_wgt = Util.checkString(rset0.getString("paper_wgt"));
			rec.paper_amt = Util.checkString(rset0.getString("paper_amt"));
			rec.psplat_use_amt = Util.checkString(rset0.getString("psplat_use_amt"));
			rec.gnaw_fee = Util.checkString(rset0.getString("gnaw_fee"));
			rec.film_make_fee = Util.checkString(rset0.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset0.getString("pack_fee"));
			rec.paper_portage = Util.checkString(rset0.getString("paper_portage"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.total = Util.checkString(rset0.getString("total"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_OTHCNSM_1200_LDataSet ds = (PR_OTHCNSM_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_OTHCNSM_1200_LCURLISTRecord curlistRec = (PR_OTHCNSM_1200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.issu_qty%>
<%= curlistRec.bw_pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.film_use_qunt%>
<%= curlistRec.u_1%>
<%= curlistRec.n_1%>
<%= curlistRec.u_2%>
<%= curlistRec.n_2%>
<%= curlistRec.u_4%>
<%= curlistRec.n_4%>
<%= curlistRec.u_m2%>
<%= curlistRec.n_m2%>
<%= curlistRec.u_m4%>
<%= curlistRec.n_m4%>
<%= curlistRec.prt_fee%>
<%= curlistRec.paper_wgt%>
<%= curlistRec.paper_amt%>
<%= curlistRec.psplat_use_amt%>
<%= curlistRec.gnaw_fee%>
<%= curlistRec.film_make_fee%>
<%= curlistRec.pack_fee%>
<%= curlistRec.paper_portage%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.total%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 21:43:45 KST 2009 */