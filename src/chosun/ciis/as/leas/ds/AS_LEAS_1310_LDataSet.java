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


public class AS_LEAS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1310_LDataSet(){}
	public AS_LEAS_1310_LDataSet(String errcode, String errmsg){
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
			AS_LEAS_1310_LCURLISTRecord rec = new AS_LEAS_1310_LCURLISTRecord();
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.clam_yymm = Util.checkString(rset0.getString("clam_yymm"));
			rec.clam_seq = Util.checkString(rset0.getString("clam_seq"));
			rec.leas_clam_amt = Util.checkString(rset0.getString("leas_clam_amt"));
			rec.mang_clam_amt = Util.checkString(rset0.getString("mang_clam_amt"));
			rec.vat_clam_amt = Util.checkString(rset0.getString("vat_clam_amt"));
			rec.clam_tot_amt = Util.checkString(rset0.getString("clam_tot_amt"));
			rec.leas_rcpm_amt = Util.checkString(rset0.getString("leas_rcpm_amt"));
			rec.mang_rcpm_amt = Util.checkString(rset0.getString("mang_rcpm_amt"));
			rec.vat_rcpm_amt = Util.checkString(rset0.getString("vat_rcpm_amt"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1310_LDataSet ds = (AS_LEAS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAS_1310_LCURLISTRecord curlistRec = (AS_LEAS_1310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cntr_no%>
<%= curlistRec.clam_yymm%>
<%= curlistRec.clam_seq%>
<%= curlistRec.leas_clam_amt%>
<%= curlistRec.mang_clam_amt%>
<%= curlistRec.vat_clam_amt%>
<%= curlistRec.clam_tot_amt%>
<%= curlistRec.leas_rcpm_amt%>
<%= curlistRec.mang_rcpm_amt%>
<%= curlistRec.vat_rcpm_amt%>
<%= curlistRec.rcpm_tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 17:52:11 KST 2009 */