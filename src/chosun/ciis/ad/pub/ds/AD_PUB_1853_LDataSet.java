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


public class AD_PUB_1853_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1853_LDataSet(){}
	public AD_PUB_1853_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			AD_PUB_1853_LCURLISTRecord rec = new AD_PUB_1853_LCURLISTRecord();
			rec.sale_issu_yn = Util.checkString(rset0.getString("sale_issu_yn"));
			rec.pubc_ym = Util.checkString(rset0.getString("pubc_ym"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sum_advt = Util.checkString(rset0.getString("sum_advt"));
			rec.sum_vat = Util.checkString(rset0.getString("sum_vat"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.rslt_dept = Util.checkString(rset0.getString("rslt_dept"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.sum_fee = Util.checkString(rset0.getString("sum_fee"));
			rec.sum_fee_vat = Util.checkString(rset0.getString("sum_fee_vat"));
			rec.misu_tot_amt = Util.checkString(rset0.getString("misu_tot_amt"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1853_LDataSet ds = (AD_PUB_1853_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1853_LCURLISTRecord curlistRec = (AD_PUB_1853_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sale_issu_yn%>
<%= curlistRec.pubc_ym%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.sum_advt%>
<%= curlistRec.sum_vat%>
<%= curlistRec.cnt%>
<%= curlistRec.rslt_dept%>
<%= curlistRec.agn_nm%>
<%= curlistRec.sum_fee%>
<%= curlistRec.sum_fee_vat%>
<%= curlistRec.misu_tot_amt%>
<%= curlistRec.clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 14:39:53 KST 2015 */