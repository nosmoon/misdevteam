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


package chosun.ciis.ad.eis.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.eis.rec.AD_EIS_1440_LCURLISTRecord;

/**
 * 
 */


public class AD_EIS_1440_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EIS_1440_LDataSet(){}
	public AD_EIS_1440_LDataSet(String errcode, String errmsg){
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
			AD_EIS_1440_LCURLISTRecord rec = new AD_EIS_1440_LCURLISTRecord();
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.pre_pubc_amt = Util.checkString(rset0.getString("pre_pubc_amt"));
			rec.icdc_amt = Util.checkString(rset0.getString("icdc_amt"));
			rec.icdc_rate = Util.checkString(rset0.getString("icdc_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EIS_1440_LDataSet ds = (AD_EIS_1440_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EIS_1440_LCURLISTRecord curlistRec = (AD_EIS_1440_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.agn_nm%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.pre_pubc_amt%>
<%= curlistRec.icdc_amt%>
<%= curlistRec.icdc_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 19:15:42 KST 2009 */