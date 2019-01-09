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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1110_LDataSet(){}
	public SP_SAL_1110_LDataSet(String errcode, String errmsg){
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
			SP_SAL_1110_LCURLIST1Record rec = new SP_SAL_1110_LCURLIST1Record();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_item = Util.checkString(rset0.getString("sale_item"));
			rec.sale_cost = Util.checkString(rset0.getString("sale_cost"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.clamt_mthd = Util.checkString(rset0.getString("clamt_mthd"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.ordr_amt = Util.checkString(rset0.getString("ordr_amt"));
			rec.ipln_amt = Util.checkString(rset0.getString("ipln_amt"));
			rec.ipln_meda_amt = Util.checkString(rset0.getString("ipln_meda_amt"));
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.suply_pers_ern = Util.checkString(rset0.getString("suply_pers_ern"));
			rec.gds_no = Util.checkString(rset0.getString("gds_no"));
			rec.gds_nm = Util.checkString(rset0.getString("gds_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1110_LDataSet ds = (SP_SAL_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_1110_LCURLIST1Record curlist1Rec = (SP_SAL_1110_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.seq%>
<%= curlist1Rec.sale_yymm%>
<%= curlist1Rec.dlco_no%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.sale_item%>
<%= curlist1Rec.sale_cost%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.clamt_mthd%>
<%= curlist1Rec.suply_amt%>
<%= curlist1Rec.vat_amt%>
<%= curlist1Rec.ordr_amt%>
<%= curlist1Rec.ipln_amt%>
<%= curlist1Rec.ipln_meda_amt%>
<%= curlist1Rec.ordr_dt%>
<%= curlist1Rec.suply_pers_ern%>
<%= curlist1Rec.gds_no%>
<%= curlist1Rec.gds_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 20:30:19 KST 2012 */