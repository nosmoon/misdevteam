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


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_DLCO_LDataSet(){}
	public CO_DLCO_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_DLCO_LCURLISTRecord rec = new CO_DLCO_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.sys_clsf_cd = Util.checkString(rset0.getString("sys_clsf_cd"));
			rec.sys_clsf_nm = Util.checkString(rset0.getString("sys_clsf_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			rec.frnc_addr = Util.checkString(rset0.getString("frnc_addr"));
			rec.natn_tel_no = Util.checkString(rset0.getString("natn_tel_no"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.mang_no_2 = Util.checkString(rset0.getString("mang_no_2"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.presi_prn = Util.checkString(rset0.getString("presi_prn"));
			rec.presi_zip_1 = Util.checkString(rset0.getString("presi_zip_1"));
			rec.presi_zip_2 = Util.checkString(rset0.getString("presi_zip_2"));
			rec.presi_addr = Util.checkString(rset0.getString("presi_addr"));
			rec.presi_dtls_addr = Util.checkString(rset0.getString("presi_dtls_addr"));
			rec.presi_tel_no = Util.checkString(rset0.getString("presi_tel_no"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.setl_bank = Util.checkString(rset0.getString("setl_bank"));
			rec.setl_bank_nm = Util.checkString(rset0.getString("setl_bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.elec_tax_stmt_yn = Util.checkString(rset0.getString("elec_tax_stmt_yn"));
			rec.corp_clsf = Util.checkString(rset0.getString("corp_clsf"));
			rec.err_eps_no_aprv_yn = Util.checkString(rset0.getString("err_eps_no_aprv_yn"));
			rec.err_eps_no_aprv_dt = Util.checkString(rset0.getString("err_eps_no_aprv_dt"));
			rec.err_eps_no_aprv_pers = Util.checkString(rset0.getString("err_eps_no_aprv_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_cmpy_cd = Util.checkString(rset0.getString("incmg_pers_cmpy_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DLCO_LDataSet ds = (CO_DLCO_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DLCO_LCURLISTRecord curlistRec = (CO_DLCO_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.ern%>
<%= curlistRec.sys_clsf_cd%>
<%= curlistRec.sys_clsf_nm%>
<%= curlistRec.dlco_abrv_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.natn_cd%>
<%= curlistRec.natn_nm%>
<%= curlistRec.frnc_addr%>
<%= curlistRec.natn_tel_no%>
<%= curlistRec.tel_no%>
<%= curlistRec.fax_no%>
<%= curlistRec.mang_no_2%>
<%= curlistRec.presi_nm%>
<%= curlistRec.presi_prn%>
<%= curlistRec.presi_zip_1%>
<%= curlistRec.presi_zip_2%>
<%= curlistRec.presi_addr%>
<%= curlistRec.presi_dtls_addr%>
<%= curlistRec.presi_tel_no%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.setl_bank%>
<%= curlistRec.setl_bank_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.email%>
<%= curlistRec.elec_tax_stmt_yn%>
<%= curlistRec.corp_clsf%>
<%= curlistRec.err_eps_no_aprv_yn%>
<%= curlistRec.err_eps_no_aprv_dt%>
<%= curlistRec.err_eps_no_aprv_pers%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_cmpy_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 24 11:35:58 KST 2009 */