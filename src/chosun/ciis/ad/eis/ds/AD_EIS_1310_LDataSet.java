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
import chosun.ciis.ad.eis.rec.AD_EIS_1310_LCURLISTRecord;

/**
 * 
 */


public class AD_EIS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_EIS_1310_LDataSet(){}
	public AD_EIS_1310_LDataSet(String errcode, String errmsg){
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
			AD_EIS_1310_LCURLISTRecord rec = new AD_EIS_1310_LCURLISTRecord();
			rec.pubc_yymm = Util.checkString(rset0.getString("pubc_yymm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.self_advt_tot = Util.checkString(rset0.getString("self_advt_tot"));
			rec.bef_advt_fee = Util.checkString(rset0.getString("bef_advt_fee"));
			rec.bef_tot_pcnt = Util.checkString(rset0.getString("bef_tot_pcnt"));
			rec.bef_self_advt_tot = Util.checkString(rset0.getString("bef_self_advt_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_EIS_1310_LDataSet ds = (AD_EIS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_EIS_1310_LCURLISTRecord curlistRec = (AD_EIS_1310_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.advt_fee%>
<%= curlistRec.tot_pcnt%>
<%= curlistRec.self_advt_tot%>
<%= curlistRec.bef_advt_fee%>
<%= curlistRec.bef_tot_pcnt%>
<%= curlistRec.bef_self_advt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 09:56:19 KST 2009 */