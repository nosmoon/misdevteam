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


package chosun.ciis.ad.brn.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.brn.rec.AD_BRN_1610_LCURLISTRecord;

/**
 * 
 */


public class AD_BRN_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BRN_1610_LDataSet(){}
	public AD_BRN_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_BRN_1610_LCURLISTRecord rec = new AD_BRN_1610_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.upd_prv_amt = Util.checkString(rset0.getString("upd_prv_amt"));
			rec.upd_aft_amt = Util.checkString(rset0.getString("upd_aft_amt"));
			rec.icdc_amt = Util.checkString(rset0.getString("icdc_amt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.icdc_clsf = Util.checkString(rset0.getString("icdc_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BRN_1610_LDataSet ds = (AD_BRN_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BRN_1610_LCURLISTRecord curlistRec = (AD_BRN_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.seq%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.upd_prv_amt%>
<%= curlistRec.upd_aft_amt%>
<%= curlistRec.icdc_amt%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.make_dt%>
<%= curlistRec.icdc_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 19:39:15 KST 2009 */