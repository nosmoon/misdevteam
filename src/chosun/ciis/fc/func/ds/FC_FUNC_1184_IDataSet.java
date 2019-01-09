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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1184_IDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1184_IDataSet(){}
	public FC_FUNC_1184_IDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			FC_FUNC_1184_ICURLISTRecord rec = new FC_FUNC_1184_ICURLISTRecord();
			rec.rv_out_rv = Util.checkString(rset0.getString("rv_out_rv"));
			rec.rv_out_cashamt = Util.checkString(rset0.getString("rv_out_cashamt"));
			rec.rv_slip_no = Util.checkString(rset0.getString("rv_slip_no"));
			rec.rv_out_eecnt = Util.checkString(rset0.getString("rv_out_eecnt"));
			rec.rv_out_msg = Util.checkString(rset0.getString("rv_out_msg"));
			rec.rv_slip_occr_dt = Util.checkString(rset0.getString("rv_slip_occr_dt"));
			rec.rv_slip_clsf_cd = Util.checkString(rset0.getString("rv_slip_clsf_cd"));
			rec.rv_slip_seq = Util.checkString(rset0.getString("rv_slip_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1184_IDataSet ds = (FC_FUNC_1184_IDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1184_ICURLISTRecord curlistRec = (FC_FUNC_1184_ICURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rv_out_rv%>
<%= curlistRec.rv_out_cashamt%>
<%= curlistRec.rv_slip_no%>
<%= curlistRec.rv_out_eecnt%>
<%= curlistRec.rv_out_msg%>
<%= curlistRec.rv_slip_occr_dt%>
<%= curlistRec.rv_slip_clsf_cd%>
<%= curlistRec.rv_slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 12:53:08 KST 2009 */