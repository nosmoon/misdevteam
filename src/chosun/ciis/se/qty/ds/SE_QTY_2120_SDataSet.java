/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2120_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sect_cd;

	public SE_QTY_2120_SDataSet(){}
	public SE_QTY_2120_SDataSet(String errcode, String errmsg, String sect_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sect_cd = sect_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sect_cd = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_QTY_2120_SCURLISTRecord rec = new SE_QTY_2120_SCURLISTRecord();
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.aplc_pers_nm = Util.checkString(rset0.getString("aplc_pers_nm"));
			rec.aplc_pers_tel_no_1 = Util.checkString(rset0.getString("aplc_pers_tel_no_1"));
			rec.aplc_pers_tel_no_2 = Util.checkString(rset0.getString("aplc_pers_tel_no_2"));
			rec.aplc_pers_tel_no_3 = Util.checkString(rset0.getString("aplc_pers_tel_no_3"));
			rec.aplc_pers_ptph_no_1 = Util.checkString(rset0.getString("aplc_pers_ptph_no_1"));
			rec.aplc_pers_ptph_no_2 = Util.checkString(rset0.getString("aplc_pers_ptph_no_2"));
			rec.aplc_pers_ptph_no_3 = Util.checkString(rset0.getString("aplc_pers_ptph_no_3"));
			rec.dlv_zip_1 = Util.checkString(rset0.getString("dlv_zip_1"));
			rec.dlv_zip_2 = Util.checkString(rset0.getString("dlv_zip_2"));
			rec.dlv_addr = Util.checkString(rset0.getString("dlv_addr"));
			rec.dlv_dtls_addr = Util.checkString(rset0.getString("dlv_dtls_addr"));
			rec.stmt_issu_req_yn = Util.checkString(rset0.getString("stmt_issu_req_yn"));
			rec.sell_clsf = Util.checkString(rset0.getString("sell_clsf"));
			rec.rcpm_pers = Util.checkString(rset0.getString("rcpm_pers"));
			rec.setl_acct_no = Util.checkString(rset0.getString("setl_acct_no"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.acpn_chrg_pers_nm = Util.checkString(rset0.getString("acpn_chrg_pers_nm"));
			rec.acpn_chrg_pers_cntc_plac = Util.checkString(rset0.getString("acpn_chrg_pers_cntc_plac"));
			rec.acpn_chrg_pers_dept_nm = Util.checkString(rset0.getString("acpn_chrg_pers_dept_nm"));
			rec.cnfm_stat_clsf_nm = Util.checkString(rset0.getString("cnfm_stat_clsf_nm"));
			rec.cnfm_msg = Util.checkString(rset0.getString("cnfm_msg"));
			rec.cnfm_chrg_flnm = Util.checkString(rset0.getString("cnfm_chrg_flnm"));
			rec.cnfm_dt = Util.checkString(rset0.getString("cnfm_dt"));
			rec.arvl_clsf = Util.checkString(rset0.getString("arvl_clsf"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2120_SDataSet ds = (SE_QTY_2120_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_QTY_2120_SCURLISTRecord curlistRec = (SE_QTY_2120_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSect_cd()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.reg_dt%>
<%= curlistRec.reg_seq%>
<%= curlistRec.medi_cd%>
<%= curlistRec.qty%>
<%= curlistRec.aplc_pers_nm%>
<%= curlistRec.aplc_pers_tel_no_1%>
<%= curlistRec.aplc_pers_tel_no_2%>
<%= curlistRec.aplc_pers_tel_no_3%>
<%= curlistRec.aplc_pers_ptph_no_1%>
<%= curlistRec.aplc_pers_ptph_no_2%>
<%= curlistRec.aplc_pers_ptph_no_3%>
<%= curlistRec.dlv_zip_1%>
<%= curlistRec.dlv_zip_2%>
<%= curlistRec.dlv_addr%>
<%= curlistRec.dlv_dtls_addr%>
<%= curlistRec.stmt_issu_req_yn%>
<%= curlistRec.sell_clsf%>
<%= curlistRec.rcpm_pers%>
<%= curlistRec.setl_acct_no%>
<%= curlistRec.amt%>
<%= curlistRec.acpn_chrg_pers_nm%>
<%= curlistRec.acpn_chrg_pers_cntc_plac%>
<%= curlistRec.acpn_chrg_pers_dept_nm%>
<%= curlistRec.cnfm_stat_clsf_nm%>
<%= curlistRec.cnfm_msg%>
<%= curlistRec.cnfm_chrg_flnm%>
<%= curlistRec.cnfm_dt%>
<%= curlistRec.arvl_clsf%>
<%= curlistRec.bo_cd%>
<%= curlistRec.send_plac_nm%>
<%= curlistRec.send_plac_seq%>
<%= curlistRec.clos_yn%>
<%= curlistRec.issu_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 20:44:50 KST 2009 */