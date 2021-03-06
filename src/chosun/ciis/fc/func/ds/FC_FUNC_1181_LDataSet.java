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


public class FC_FUNC_1181_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1181_LDataSet(){}
	public FC_FUNC_1181_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_FUNC_1181_LCURLISTRecord rec = new FC_FUNC_1181_LCURLISTRecord();
			rec.dlcocd = Util.checkString(rset1.getString("dlcocd"));
			rec.pch_compnm = Util.checkString(rset1.getString("pch_compnm"));
			rec.sbbsamt = Util.checkString(rset1.getString("sbbsamt"));
			rec.pch_amt2 = Util.checkString(rset1.getString("pch_amt2"));
			rec.cash_amt = Util.checkString(rset1.getString("cash_amt"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.pch_count = Util.checkString(rset1.getString("pch_count"));
			rec.out_msg = Util.checkString(rset1.getString("out_msg"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1181_LDataSet ds = (FC_FUNC_1181_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1181_LCURLISTRecord curlistRec = (FC_FUNC_1181_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlcocd%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.sbbsamt%>
<%= curlistRec.pch_amt2%>
<%= curlistRec.cash_amt%>
<%= curlistRec.slip_no%>
<%= curlistRec.pch_count%>
<%= curlistRec.out_msg%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 14:19:21 KST 2009 */