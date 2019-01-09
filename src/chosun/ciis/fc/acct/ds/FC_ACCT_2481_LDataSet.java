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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2481_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2481_LDataSet(){}
	public FC_ACCT_2481_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(30);
		while(rset0.next()){
			FC_ACCT_2481_LCURLISTRecord rec = new FC_ACCT_2481_LCURLISTRecord();
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cd_nm = Util.checkString(rset0.getString("budg_cd_nm"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_clsf_cd_nm = Util.checkString(rset0.getString("mang_clsf_cd_nm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_clsf_cd_nm = Util.checkString(rset0.getString("dlco_clsf_cd_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			rec.prop_equip_cd = Util.checkString(rset0.getString("prop_equip_cd"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_cd_nm = Util.checkString(rset0.getString("evnt_cd_nm"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.clam_dept_cd_nm = Util.checkString(rset0.getString("clam_dept_cd_nm"));
			rec.obj_acct_cd_nm = Util.checkString(rset0.getString("obj_acct_cd_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_cdnm = Util.checkString(rset0.getString("dtls_medi_cdnm"));
			rec.incm_clsf_cd_nm = Util.checkString(rset0.getString("incm_clsf_cd_nm"));
			rec.chnl_clsf_cd = Util.checkString(rset0.getString("chnl_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2481_LDataSet ds = (FC_ACCT_2481_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2481_LCURLISTRecord curlistRec = (FC_ACCT_2481_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cd_nm%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_clsf_cd_nm%>
<%= curlistRec.mang_no%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_clsf_cd_nm%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cd_nm%>
<%= curlistRec.prop_equip_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_cd_nm%>
<%= curlistRec.obj_amt%>
<%= curlistRec.clam_dept_cd_nm%>
<%= curlistRec.obj_acct_cd_nm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_cdnm%>
<%= curlistRec.incm_clsf_cd_nm%>
<%= curlistRec.chnl_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 24 17:55:47 KST 2017 */