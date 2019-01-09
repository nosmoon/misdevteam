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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2920_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2920_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2920_LDataSet(){}
	public AD_BAS_2920_LDataSet(String errcode, String errmsg){
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
			AD_BAS_2920_LCURLISTRecord rec = new AD_BAS_2920_LCURLISTRecord();
			rec.pubc_yymm = Util.checkString(rset0.getString("pubc_yymm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_noit = Util.checkString(rset0.getString("pubc_noit"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.prvmm_pubc_amt = Util.checkString(rset0.getString("prvmm_pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.prvmm_rcpm_amt = Util.checkString(rset0.getString("prvmm_rcpm_amt"));
			rec.medi_rcpm_icdc_rank = Util.checkString(rset0.getString("medi_rcpm_icdc_rank"));
			rec.dhon_amt = Util.checkString(rset0.getString("dhon_amt"));
			rec.medi_dhon_rank = Util.checkString(rset0.getString("medi_dhon_rank"));
			rec.dhon_bal = Util.checkString(rset0.getString("dhon_bal"));
			rec.medi_dhon_bal_rank = Util.checkString(rset0.getString("medi_dhon_bal_rank"));
			rec.dhon_fix_amt = Util.checkString(rset0.getString("dhon_fix_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2920_LDataSet ds = (AD_BAS_2920_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2920_LCURLISTRecord curlistRec = (AD_BAS_2920_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_yymm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_noit%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.prvmm_pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.prvmm_rcpm_amt%>
<%= curlistRec.medi_rcpm_icdc_rank%>
<%= curlistRec.dhon_amt%>
<%= curlistRec.medi_dhon_rank%>
<%= curlistRec.dhon_bal%>
<%= curlistRec.medi_dhon_bal_rank%>
<%= curlistRec.dhon_fix_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 17:06:16 KST 2009 */