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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1502_LDataSet(){}
	public AS_LEAS_1502_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1502_LCURLIST1Record rec = new AS_LEAS_1502_LCURLIST1Record();
			rec.leas_mm = Util.checkString(rset0.getString("leas_mm"));
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.leas_dlco_ern_nm = Util.checkString(rset0.getString("leas_dlco_ern_nm"));
			rec.leas_prd = Util.checkString(rset0.getString("leas_prd"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.cntr_leas_amt = Util.checkString(rset0.getString("cntr_leas_amt"));
			rec.cntr_mang_amt = Util.checkString(rset0.getString("cntr_mang_amt"));
			rec.cntr_gurt_amt = Util.checkString(rset0.getString("cntr_gurt_amt"));
			rec.incr_amt = Util.checkString(rset0.getString("incr_amt"));
			rec.gurt_int_amt = Util.checkString(rset0.getString("gurt_int_amt"));
			rec.impl_pfls = Util.checkString(rset0.getString("impl_pfls"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1502_LDataSet ds = (AS_LEAS_1502_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_LEAS_1502_LCURLIST1Record curlist1Rec = (AS_LEAS_1502_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.leas_mm%>
<%= curlist1Rec.bldg_nm%>
<%= curlist1Rec.aset_nm%>
<%= curlist1Rec.leas_dlco_ern_nm%>
<%= curlist1Rec.leas_prd%>
<%= curlist1Rec.cntr_no%>
<%= curlist1Rec.cntr_leas_amt%>
<%= curlist1Rec.cntr_mang_amt%>
<%= curlist1Rec.cntr_gurt_amt%>
<%= curlist1Rec.incr_amt%>
<%= curlist1Rec.gurt_int_amt%>
<%= curlist1Rec.impl_pfls%>
<%= curlist1Rec.cmpy_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 13:47:38 KST 2009 */