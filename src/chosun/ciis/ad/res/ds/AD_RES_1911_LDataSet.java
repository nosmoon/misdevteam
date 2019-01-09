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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1911_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1911_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1911_LDataSet(){}
	public AD_RES_1911_LDataSet(String errcode, String errmsg){
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
			AD_RES_1911_LCURLISTRecord rec = new AD_RES_1911_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.coms_rate = Util.checkString(rset0.getString("coms_rate"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.coms_vat = Util.checkString(rset0.getString("coms_vat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1911_LDataSet ds = (AD_RES_1911_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1911_LCURLISTRecord curlistRec = (AD_RES_1911_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.coms_rate%>
<%= curlistRec.coms%>
<%= curlistRec.pubc_side%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 15:49:22 KST 2009 */