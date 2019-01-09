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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1602_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1602_LDataSet(){}
	public HD_SALY_1602_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1602_LCURLISTRecord rec = new HD_SALY_1602_LCURLISTRecord();
			rec.now_impt_stot = Util.checkString(rset0.getString("now_impt_stot"));
			rec.prv_impt_stot = Util.checkString(rset0.getString("prv_impt_stot"));
			rec.impt_stot = Util.checkString(rset0.getString("impt_stot"));
			rec.non_tax_jrnst = Util.checkString(rset0.getString("non_tax_jrnst"));
			rec.prv_non_tax_prod = Util.checkString(rset0.getString("prv_non_tax_prod"));
			rec.non_tax_jrnst_stot = Util.checkString(rset0.getString("non_tax_jrnst_stot"));
			rec.non_tax_frnc = Util.checkString(rset0.getString("non_tax_frnc"));
			rec.prv_non_tax_frnc = Util.checkString(rset0.getString("prv_non_tax_frnc"));
			rec.non_tax_frnc_stot = Util.checkString(rset0.getString("non_tax_frnc_stot"));
			rec.now_stot = Util.checkString(rset0.getString("now_stot"));
			rec.prv_stot = Util.checkString(rset0.getString("prv_stot"));
			rec.stot = Util.checkString(rset0.getString("stot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1602_LDataSet ds = (HD_SALY_1602_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1602_LCURLISTRecord curlistRec = (HD_SALY_1602_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.now_impt_stot%>
<%= curlistRec.prv_impt_stot%>
<%= curlistRec.impt_stot%>
<%= curlistRec.non_tax_jrnst%>
<%= curlistRec.prv_non_tax_prod%>
<%= curlistRec.non_tax_jrnst_stot%>
<%= curlistRec.non_tax_frnc%>
<%= curlistRec.prv_non_tax_frnc%>
<%= curlistRec.non_tax_frnc_stot%>
<%= curlistRec.now_stot%>
<%= curlistRec.prv_stot%>
<%= curlistRec.stot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 15:52:47 KST 2009 */