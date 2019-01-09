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


public class MT_ETCPC_1303_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_1303_LDataSet(){}
	public MT_ETCPC_1303_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_ETCPC_1303_LCURLIST1Record rec = new MT_ETCPC_1303_LCURLIST1Record();
			rec.modl_nm = Util.checkString(rset0.getString("modl_nm"));
			rec.buy_dt = Util.checkString(rset0.getString("buy_dt"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.use_usag_nm = Util.checkString(rset0.getString("use_usag_nm"));
			rec.buy_cnt = rset0.getInt("buy_cnt");
			rec.draft_deptcd = Util.checkString(rset0.getString("draft_deptcd"));
			rec.draft_deptnm = Util.checkString(rset0.getString("draft_deptnm"));
			rec.draft_no = Util.checkString(rset0.getString("draft_no"));
			rec.nocompen_mant_frdt = Util.checkString(rset0.getString("nocompen_mant_frdt"));
			rec.nocompen_mant_todt = Util.checkString(rset0.getString("nocompen_mant_todt"));
			rec.compen_mant_frdt = Util.checkString(rset0.getString("compen_mant_frdt"));
			rec.compen_mant_todt = Util.checkString(rset0.getString("compen_mant_todt"));
			rec.compen_mant_cmpy = Util.checkString(rset0.getString("compen_mant_cmpy"));
			rec.modl_mang_no = Util.checkString(rset0.getString("modl_mang_no"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.use_term = Util.checkString(rset0.getString("use_term"));
			rec.draft_kind = Util.checkString(rset0.getString("draft_kind"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_1303_LDataSet ds = (MT_ETCPC_1303_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_1303_LCURLIST1Record curlist1Rec = (MT_ETCPC_1303_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.modl_nm%>
<%= curlist1Rec.buy_dt%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.use_usag_nm%>
<%= curlist1Rec.buy_cnt%>
<%= curlist1Rec.draft_deptcd%>
<%= curlist1Rec.draft_deptnm%>
<%= curlist1Rec.draft_no%>
<%= curlist1Rec.nocompen_mant_frdt%>
<%= curlist1Rec.nocompen_mant_todt%>
<%= curlist1Rec.compen_mant_frdt%>
<%= curlist1Rec.compen_mant_todt%>
<%= curlist1Rec.compen_mant_cmpy%>
<%= curlist1Rec.modl_mang_no%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.use_term%>
<%= curlist1Rec.draft_kind%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 10:20:58 KST 2009 */