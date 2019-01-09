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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3012_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3012_LDataSet(){}
	public AD_PUB_3012_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			AD_PUB_3012_LCURLISTRecord rec = new AD_PUB_3012_LCURLISTRecord();
			rec.type_cd = Util.checkString(rset0.getString("type_cd"));
			rec.type_nm = Util.checkString(rset0.getString("type_nm"));
			rec.advt_fee_1 = Util.checkString(rset0.getString("advt_fee_1"));
			rec.vat_1 = Util.checkString(rset0.getString("vat_1"));
			rec.pubc_tot_amt_1 = Util.checkString(rset0.getString("pubc_tot_amt_1"));
			rec.cnt_1 = Util.checkString(rset0.getString("cnt_1"));
			rec.advt_fee_2 = Util.checkString(rset0.getString("advt_fee_2"));
			rec.vat_2 = Util.checkString(rset0.getString("vat_2"));
			rec.pubc_tot_amt_2 = Util.checkString(rset0.getString("pubc_tot_amt_2"));
			rec.cnt_2 = Util.checkString(rset0.getString("cnt_2"));
			rec.advt_fee_3 = Util.checkString(rset0.getString("advt_fee_3"));
			rec.vat_3 = Util.checkString(rset0.getString("vat_3"));
			rec.pubc_tot_amt_3 = Util.checkString(rset0.getString("pubc_tot_amt_3"));
			rec.cnt_3 = Util.checkString(rset0.getString("cnt_3"));
			rec.diff_1 = Util.checkString(rset0.getString("diff_1"));
			rec.diff_2 = Util.checkString(rset0.getString("diff_2"));
			rec.diff_ratio_1 = Util.checkString(rset0.getString("diff_ratio_1"));
			rec.diff_ratio_2 = Util.checkString(rset0.getString("diff_ratio_2"));
			rec.max_pubc_dt = Util.checkString(rset0.getString("max_pubc_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3012_LDataSet ds = (AD_PUB_3012_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3012_LCURLISTRecord curlistRec = (AD_PUB_3012_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.type_cd%>
<%= curlistRec.type_nm%>
<%= curlistRec.advt_fee_1%>
<%= curlistRec.vat_1%>
<%= curlistRec.pubc_tot_amt_1%>
<%= curlistRec.cnt_1%>
<%= curlistRec.advt_fee_2%>
<%= curlistRec.vat_2%>
<%= curlistRec.pubc_tot_amt_2%>
<%= curlistRec.cnt_2%>
<%= curlistRec.advt_fee_3%>
<%= curlistRec.vat_3%>
<%= curlistRec.pubc_tot_amt_3%>
<%= curlistRec.cnt_3%>
<%= curlistRec.diff_1%>
<%= curlistRec.diff_2%>
<%= curlistRec.diff_ratio_1%>
<%= curlistRec.diff_ratio_2%>
<%= curlistRec.max_pubc_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 22 17:49:09 KST 2012 */