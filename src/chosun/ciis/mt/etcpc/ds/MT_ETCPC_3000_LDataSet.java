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


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_3000_LDataSet(){}
	public MT_ETCPC_3000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_ETCPC_3000_LCURLIST1Record rec = new MT_ETCPC_3000_LCURLIST1Record();
			rec.swmang_no = Util.checkString(rset0.getString("swmang_no"));
			rec.make_cmpy = Util.checkString(rset0.getString("make_cmpy"));
			rec.swnm = Util.checkString(rset0.getString("swnm"));
			rec.swkind = Util.checkString(rset0.getString("swkind"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.buy_dt = Util.checkString(rset0.getString("buy_dt"));
			rec.buy_draft_dept = Util.checkString(rset0.getString("buy_draft_dept"));
			rec.buy_draft_dept_nm = Util.checkString(rset0.getString("buy_draft_dept_nm"));
			rec.buy_draft_no = Util.checkString(rset0.getString("buy_draft_no"));
			rec.swlics_cnt = Util.checkString(rset0.getString("swlics_cnt"));
			rec.swlics_cnt2 = Util.checkString(rset0.getString("swlics_cnt2"));
			rec.gds_key = Util.checkString(rset0.getString("gds_key"));
			rec.lics_certi_no = Util.checkString(rset0.getString("lics_certi_no"));
			rec.swver = Util.checkString(rset0.getString("swver"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_3000_LDataSet ds = (MT_ETCPC_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_3000_LCURLIST1Record curlist1Rec = (MT_ETCPC_3000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.swmang_no%>
<%= curlist1Rec.make_cmpy%>
<%= curlist1Rec.swnm%>
<%= curlist1Rec.swkind%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.buy_dt%>
<%= curlist1Rec.buy_draft_dept%>
<%= curlist1Rec.buy_draft_dept_nm%>
<%= curlist1Rec.buy_draft_no%>
<%= curlist1Rec.swlics_cnt%>
<%= curlist1Rec.swlics_cnt2%>
<%= curlist1Rec.gds_key%>
<%= curlist1Rec.lics_certi_no%>
<%= curlist1Rec.swver%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 17:42:17 KST 2009 */