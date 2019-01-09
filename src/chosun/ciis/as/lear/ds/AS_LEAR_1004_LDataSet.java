/***************************************************************************************************
* 파일명 : .java
* 기능 : 자산-임대사업-임대사업조회
* 작성일자 : 2009-10-09
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.lear.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 자산-임대사업-임대사업조회
 */


public class AS_LEAR_1004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAR_1004_LDataSet(){}
	public AS_LEAR_1004_LDataSet(String errcode, String errmsg){
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
			AS_LEAR_1004_LCURLISTRecord rec = new AS_LEAR_1004_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.rcpm_tot_amt = Util.checkString(rset0.getString("rcpm_tot_amt"));
			rec.clam_dt = Util.checkString(rset0.getString("clam_dt"));
			rec.gurt_rcpm_amt = Util.checkString(rset0.getString("gurt_rcpm_amt"));
			rec.leas_rcpm_amt = Util.checkString(rset0.getString("leas_rcpm_amt"));
			rec.mang_rcpm_amt = Util.checkString(rset0.getString("mang_rcpm_amt"));
			rec.vat_rcpm_amt = Util.checkString(rset0.getString("vat_rcpm_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAR_1004_LDataSet ds = (AS_LEAR_1004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAR_1004_LCURLISTRecord curlistRec = (AS_LEAR_1004_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.bldg_nm%>
<%= curlistRec.cntr_no%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.rcpm_tot_amt%>
<%= curlistRec.clam_dt%>
<%= curlistRec.gurt_rcpm_amt%>
<%= curlistRec.leas_rcpm_amt%>
<%= curlistRec.mang_rcpm_amt%>
<%= curlistRec.vat_rcpm_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 09 11:56:50 KST 2009 */