/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2016_5100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_2016_5100_LDataSet(){}
	public HD_YADJM_2016_5100_LDataSet(String errcode, String errmsg){
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
			HD_YADJM_2016_5100_LCURLISTRecord rec = new HD_YADJM_2016_5100_LCURLISTRecord();
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.hous_loan_amt_int_1 = Util.checkString(rset0.getString("hous_loan_amt_int_1"));
			rec.ltrm_hous_mogg_loan_amt_int_re = Util.checkString(rset0.getString("ltrm_hous_mogg_loan_amt_int_re"));
			rec.hous_loan_amt_int = Util.checkString(rset0.getString("hous_loan_amt_int"));
			rec.hous_loan_amt_int_2012_1 = Util.checkString(rset0.getString("hous_loan_amt_int_2012_1"));
			rec.hous_loan_amt_int_2012_2 = Util.checkString(rset0.getString("hous_loan_amt_int_2012_2"));
			rec.hous_loan_amt_int_2015_15y_fn = Util.checkString(rset0.getString("hous_loan_amt_int_2015_15y_fn"));
			rec.hous_loan_amt_int_2015_15y = Util.checkString(rset0.getString("hous_loan_amt_int_2015_15y"));
			rec.hous_loan_amt_int_2015_15y_etc = Util.checkString(rset0.getString("hous_loan_amt_int_2015_15y_etc"));
			rec.hous_loan_amt_int_2015_10y = Util.checkString(rset0.getString("hous_loan_amt_int_2015_10y"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_2015_5100_LDataSet ds = (HD_YADJM_2015_5100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_2015_5100_LCURLISTRecord curlistRec = (HD_YADJM_2015_5100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.hous_loan_amt_int_1%>
<%= curlistRec.ltrm_hous_mogg_loan_amt_int_re%>
<%= curlistRec.hous_loan_amt_int%>
<%= curlistRec.hous_loan_amt_int_2012_1%>
<%= curlistRec.hous_loan_amt_int_2012_2%>
<%= curlistRec.hous_loan_amt_int_2015_15y_fn%>
<%= curlistRec.hous_loan_amt_int_2015_15y%>
<%= curlistRec.hous_loan_amt_int_2015_15y_etc%>
<%= curlistRec.hous_loan_amt_int_2015_10y%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 24 16:13:34 KST 2015 */