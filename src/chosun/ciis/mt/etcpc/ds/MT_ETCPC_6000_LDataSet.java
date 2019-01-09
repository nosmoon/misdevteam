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


public class MT_ETCPC_6000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_6000_LDataSet(){}
	public MT_ETCPC_6000_LDataSet(String errcode, String errmsg){
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
			MT_ETCPC_6000_LCURLIST1Record rec = new MT_ETCPC_6000_LCURLIST1Record();
			rec.modl_mang_no = Util.checkString(rset0.getString("modl_mang_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.modl_kind_nm = Util.checkString(rset0.getString("modl_kind_nm"));
			rec.modl_nm = Util.checkString(rset0.getString("modl_nm"));
			rec.use_usag_sw = Util.checkString(rset0.getString("use_usag_sw"));
			rec.buy_cnt = Util.checkString(rset0.getString("buy_cnt"));
			rec.gs1 = Util.checkString(rset0.getString("gs1"));
			rec.gs2 = Util.checkString(rset0.getString("gs2"));
			rec.gs3 = Util.checkString(rset0.getString("gs3"));
			rec.gs4 = Util.checkString(rset0.getString("gs4"));
			rec.gs5 = Util.checkString(rset0.getString("gs5"));
			rec.gs6 = Util.checkString(rset0.getString("gs6"));
			rec.gs7 = Util.checkString(rset0.getString("gs7"));
			rec.gs8 = Util.checkString(rset0.getString("gs8"));
			rec.gs9 = Util.checkString(rset0.getString("gs9"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_6000_LDataSet ds = (MT_ETCPC_6000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_6000_LCURLIST1Record curlist1Rec = (MT_ETCPC_6000_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.modl_mang_no%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.modl_kind_nm%>
<%= curlist1Rec.modl_nm%>
<%= curlist1Rec.use_usag_sw%>
<%= curlist1Rec.buy_cnt%>
<%= curlist1Rec.gs1%>
<%= curlist1Rec.gs2%>
<%= curlist1Rec.gs3%>
<%= curlist1Rec.gs4%>
<%= curlist1Rec.gs5%>
<%= curlist1Rec.gs6%>
<%= curlist1Rec.gs7%>
<%= curlist1Rec.gs8%>
<%= curlist1Rec.gs9%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 15:58:20 KST 2009 */