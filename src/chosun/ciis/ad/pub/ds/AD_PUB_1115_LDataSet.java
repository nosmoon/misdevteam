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

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_1115_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_1115_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_1115_LDataSet(){}
	public AD_PUB_1115_LDataSet(String errcode, String errmsg){
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
			AD_PUB_1115_LCURLISTRecord rec = new AD_PUB_1115_LCURLISTRecord();
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.eps_clsf_cd = Util.checkString(rset0.getString("eps_clsf_cd"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.arow = Util.checkString(rset0.getString("arow"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.coms_rate = Util.checkString(rset0.getString("coms_rate"));
			rec.guid_sec_kind_cd = Util.checkString(rset0.getString("guid_sec_kind_cd"));
			rec.guid_sec_kind_nm = Util.checkString(rset0.getString("guid_sec_kind_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1115_LDataSet ds = (AD_PUB_1115_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1115_LCURLISTRecord curlistRec = (AD_PUB_1115_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.eps_clsf_cd%>
<%= curlistRec.pubc_side%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.arow%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.coms_rate%>
<%= curlistRec.guid_sec_kind_cd%>
<%= curlistRec.guid_sec_kind_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.mchrg_pers_nm%>
<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 21 13:56:58 KST 2009 */