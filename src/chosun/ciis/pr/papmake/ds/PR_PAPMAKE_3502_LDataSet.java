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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_3502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_3502_LDataSet(){}
	public PR_PAPMAKE_3502_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_3502_LCURLISTRecord rec = new PR_PAPMAKE_3502_LCURLISTRecord();
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.psplat_2p = Util.checkString(rset0.getString("psplat_2p"));
			rec.psplat_4p = Util.checkString(rset0.getString("psplat_4p"));
			rec.prt_fee = Util.checkString(rset0.getString("prt_fee"));
			rec.paper_wgt = Util.checkString(rset0.getString("paper_wgt"));
			rec.paper_amt = Util.checkString(rset0.getString("paper_amt"));
			rec.psplat_use_amt = Util.checkString(rset0.getString("psplat_use_amt"));
			rec.gnaw_fee = Util.checkString(rset0.getString("gnaw_fee"));
			rec.film_make_fee = Util.checkString(rset0.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset0.getString("pack_fee"));
			rec.paper_portage = Util.checkString(rset0.getString("paper_portage"));
			rec.total = Util.checkString(rset0.getString("total"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_3502_LDataSet ds = (PR_PAPMAKE_3502_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_3502_LCURLISTRecord curlistRec = (PR_PAPMAKE_3502_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.psplat_2p%>
<%= curlistRec.psplat_4p%>
<%= curlistRec.prt_fee%>
<%= curlistRec.paper_wgt%>
<%= curlistRec.paper_amt%>
<%= curlistRec.psplat_use_amt%>
<%= curlistRec.gnaw_fee%>
<%= curlistRec.film_make_fee%>
<%= curlistRec.pack_fee%>
<%= curlistRec.paper_portage%>
<%= curlistRec.total%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 26 11:40:14 KST 2016 */