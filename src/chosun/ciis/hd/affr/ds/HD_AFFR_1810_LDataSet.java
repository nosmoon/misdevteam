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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1810_LDataSet(){}
	public HD_AFFR_1810_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_1810_LCURLISTRecord rec = new HD_AFFR_1810_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_clsf_cd = Util.checkString(rset0.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.emp_dtls_clsf = Util.checkString(rset0.getString("emp_dtls_clsf"));
			rec.emp_dtls_clsf_nm = Util.checkString(rset0.getString("emp_dtls_clsf_nm"));
			rec.pay_plac_clsf = Util.checkString(rset0.getString("pay_plac_clsf"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_AFFR_1810_LCURLIST1Record rec = new HD_AFFR_1810_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset1.getString("faml_seq"));
			rec.faml_rshp_cd = Util.checkString(rset1.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset1.getString("faml_rshp_nm"));
			rec.faml_flnm = Util.checkString(rset1.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset1.getString("faml_prn"));
			rec.ocpn_cd = Util.checkString(rset1.getString("ocpn_cd"));
			rec.ocpn_nm = Util.checkString(rset1.getString("ocpn_nm"));
			rec.offi_nm = Util.checkString(rset1.getString("offi_nm"));
			rec.posi = Util.checkString(rset1.getString("posi"));
			rec.schir_cd = Util.checkString(rset1.getString("schir_cd"));
			rec.schir_nm = Util.checkString(rset1.getString("schir_nm"));
			rec.nmat_yn = Util.checkString(rset1.getString("nmat_yn"));
			rec.dth_dt = Util.checkString(rset1.getString("dth_dt"));
			rec.spos_dduc_obj_yn = Util.checkString(rset1.getString("spos_dduc_obj_yn"));
			rec.child_dduc_obj_yn = Util.checkString(rset1.getString("child_dduc_obj_yn"));
			rec.oldg_dduc_obj_yn = Util.checkString(rset1.getString("oldg_dduc_obj_yn"));
			rec.obcl_pers_dduc_obj_yn = Util.checkString(rset1.getString("obcl_pers_dduc_obj_yn"));
			rec.rspc_dduc_obj_yn = Util.checkString(rset1.getString("rspc_dduc_obj_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset1.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset1.getString("care_fee_dduc_yn"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1810_LDataSet ds = (HD_AFFR_1810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1810_LCURLISTRecord curlistRec = (HD_AFFR_1810_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_1810_LCURLIST1Record curlist1Rec = (HD_AFFR_1810_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_clsf_cd%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.emp_dtls_clsf%>
<%= curlistRec.emp_dtls_clsf_nm%>
<%= curlistRec.pay_plac_clsf%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.faml_seq%>
<%= curlist1Rec.faml_rshp_cd%>
<%= curlist1Rec.faml_rshp_nm%>
<%= curlist1Rec.faml_flnm%>
<%= curlist1Rec.faml_prn%>
<%= curlist1Rec.ocpn_cd%>
<%= curlist1Rec.ocpn_nm%>
<%= curlist1Rec.offi_nm%>
<%= curlist1Rec.posi%>
<%= curlist1Rec.schir_cd%>
<%= curlist1Rec.schir_nm%>
<%= curlist1Rec.nmat_yn%>
<%= curlist1Rec.dth_dt%>
<%= curlist1Rec.spos_dduc_obj_yn%>
<%= curlist1Rec.child_dduc_obj_yn%>
<%= curlist1Rec.oldg_dduc_obj_yn%>
<%= curlist1Rec.obcl_pers_dduc_obj_yn%>
<%= curlist1Rec.rspc_dduc_obj_yn%>
<%= curlist1Rec.fml_hshd_dduc_yn%>
<%= curlist1Rec.care_fee_dduc_yn%>
<%= curlist1Rec.flnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 13:16:45 KST 2009 */