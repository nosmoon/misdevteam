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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_1110_LDataSet(){}
	public TN_LNK_1110_LDataSet(String errcode, String errmsg){
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
			TN_LNK_1110_LCURLISTRecord rec = new TN_LNK_1110_LCURLISTRecord();
			rec.excl_pmnt_idx = Util.checkString(rset0.getString("excl_pmnt_idx"));
			rec.excl_type_nm = Util.checkString(rset0.getString("excl_type_nm"));
			rec.dept_idx_nm = Util.checkString(rset0.getString("dept_idx_nm"));
			rec.title = Util.checkString(rset0.getString("title"));
			rec.dtl_cnt = Util.checkString(rset0.getString("dtl_cnt"));
			rec.insrt_dt = Util.checkString(rset0.getString("insrt_dt"));
			rec.adminidx = Util.checkString(rset0.getString("adminidx"));
			rec.excl_type = Util.checkString(rset0.getString("excl_type"));
			rec.dept_idx = Util.checkString(rset0.getString("dept_idx"));
			rec.isupload = Util.checkString(rset0.getString("isupload"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1110_LDataSet ds = (TN_LNK_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_1110_LCURLISTRecord curlistRec = (TN_LNK_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.excl_pmnt_idx%>
<%= curlistRec.excl_type_nm%>
<%= curlistRec.dept_idx_nm%>
<%= curlistRec.title%>
<%= curlistRec.dtl_cnt%>
<%= curlistRec.insrt_dt%>
<%= curlistRec.adminidx%>
<%= curlistRec.excl_type%>
<%= curlistRec.dept_idx%>
<%= curlistRec.isupload%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 28 16:49:19 KST 2016 */