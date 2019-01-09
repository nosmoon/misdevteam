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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2720_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_2720_LDataSet(){}
	public IS_DEP_2720_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			IS_DEP_2720_LCURLISTRecord rec = new IS_DEP_2720_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_proc_ym = Util.checkString(rset0.getString("sale_proc_ym"));
			rec.tot_rvord_amt = Util.checkString(rset0.getString("tot_rvord_amt"));
			rec.setoff_amt_m0 = Util.checkString(rset0.getString("setoff_amt_m0"));
			rec.setoff_amt_m1 = Util.checkString(rset0.getString("setoff_amt_m1"));
			rec.setoff_amt_m2 = Util.checkString(rset0.getString("setoff_amt_m2"));
			rec.setoff_amt_m3 = Util.checkString(rset0.getString("setoff_amt_m3"));
			rec.setoff_amt_m4 = Util.checkString(rset0.getString("setoff_amt_m4"));
			rec.setoff_amt_m5 = Util.checkString(rset0.getString("setoff_amt_m5"));
			rec.setoff_amt_m6 = Util.checkString(rset0.getString("setoff_amt_m6"));
			rec.setoff_amt_m7 = Util.checkString(rset0.getString("setoff_amt_m7"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.setoff_amt_rate_m0 = Util.checkString(rset0.getString("setoff_amt_rate_m0"));
			rec.setoff_amt_rate_m1 = Util.checkString(rset0.getString("setoff_amt_rate_m1"));
			rec.setoff_amt_rate_m2 = Util.checkString(rset0.getString("setoff_amt_rate_m2"));
			rec.setoff_amt_rate_m3 = Util.checkString(rset0.getString("setoff_amt_rate_m3"));
			rec.setoff_amt_rate_m4 = Util.checkString(rset0.getString("setoff_amt_rate_m4"));
			rec.setoff_amt_rate_m5 = Util.checkString(rset0.getString("setoff_amt_rate_m5"));
			rec.setoff_amt_rate_m6 = Util.checkString(rset0.getString("setoff_amt_rate_m6"));
			rec.setoff_amt_rate_m7 = Util.checkString(rset0.getString("setoff_amt_rate_m7"));
			rec.misu_amt_rate = Util.checkString(rset0.getString("misu_amt_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_2720_LDataSet ds = (IS_DEP_2720_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_2720_LCURLISTRecord curlistRec = (IS_DEP_2720_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.sale_proc_ym%>
<%= curlistRec.tot_rvord_amt%>
<%= curlistRec.setoff_amt_m0%>
<%= curlistRec.setoff_amt_m1%>
<%= curlistRec.setoff_amt_m2%>
<%= curlistRec.setoff_amt_m3%>
<%= curlistRec.setoff_amt_m4%>
<%= curlistRec.setoff_amt_m5%>
<%= curlistRec.setoff_amt_m6%>
<%= curlistRec.setoff_amt_m7%>
<%= curlistRec.misu_amt%>
<%= curlistRec.setoff_amt_rate_m0%>
<%= curlistRec.setoff_amt_rate_m1%>
<%= curlistRec.setoff_amt_rate_m2%>
<%= curlistRec.setoff_amt_rate_m3%>
<%= curlistRec.setoff_amt_rate_m4%>
<%= curlistRec.setoff_amt_rate_m5%>
<%= curlistRec.setoff_amt_rate_m6%>
<%= curlistRec.setoff_amt_rate_m7%>
<%= curlistRec.misu_amt_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 23 16:50:37 KST 2012 */