/***************************************************************************************************
* 파일명 : .java
* 기능 : 발송관리 - 발송비청구
* 작성일자 : 2009-11-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2535_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_2535_LDataSet(){}
	public SE_SAL_2535_LDataSet(String errcode, String errmsg){
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
			SE_SAL_2535_LCURLISTRecord rec = new SE_SAL_2535_LCURLISTRecord();
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.occr_slip_occr_dt = Util.checkString(rset0.getString("occr_slip_occr_dt"));
			rec.occr_slip_clsf_cd = Util.checkString(rset0.getString("occr_slip_clsf_cd"));
			rec.occr_slip_seq = Util.checkString(rset0.getString("occr_slip_seq"));
			rec.occr_slip_sub_seq = Util.checkString(rset0.getString("occr_slip_sub_seq"));
			rec.occr_slip_arow_no = Util.checkString(rset0.getString("occr_slip_arow_no"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.corp_clsf = Util.checkString(rset0.getString("corp_clsf"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.elec_tax_bill_yn = Util.checkString(rset0.getString("elec_tax_bill_yn"));
			rec.elec_tax_issu_dt = Util.checkString(rset0.getString("elec_tax_issu_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2535_LDataSet ds = (SE_SAL_2535_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SAL_2535_LCURLISTRecord curlistRec = (SE_SAL_2535_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.occr_slip_occr_dt%>
<%= curlistRec.occr_slip_clsf_cd%>
<%= curlistRec.occr_slip_seq%>
<%= curlistRec.occr_slip_sub_seq%>
<%= curlistRec.occr_slip_arow_no%>
<%= curlistRec.make_dt%>
<%= curlistRec.dlco_no%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.corp_clsf%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.remk%>
<%= curlistRec.elec_tax_bill_yn%>
<%= curlistRec.elec_tax_issu_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 15 10:22:33 KST 2010 */