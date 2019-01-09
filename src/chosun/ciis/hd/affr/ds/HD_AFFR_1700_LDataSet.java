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


public class HD_AFFR_1700_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1700_LDataSet(){}
	public HD_AFFR_1700_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_AFFR_1700_LCURLIST1Record rec = new HD_AFFR_1700_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset0.getString("faml_seq"));
			rec.faml_rshp_cd = Util.checkString(rset0.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset0.getString("faml_rshp_nm"));
			rec.faml_flnm = Util.checkString(rset0.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset0.getString("faml_prn"));
			rec.ocpn_cd = Util.checkString(rset0.getString("ocpn_cd"));
			rec.ocpn_nm = Util.checkString(rset0.getString("ocpn_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.posi = Util.checkString(rset0.getString("posi"));
			rec.schir_cd = Util.checkString(rset0.getString("schir_cd"));
			rec.schir_nm = Util.checkString(rset0.getString("schir_nm"));
			rec.nmat_yn = Util.checkString(rset0.getString("nmat_yn"));
			rec.dth_dt = Util.checkString(rset0.getString("dth_dt"));
			rec.spos_dduc_obj_yn = Util.checkString(rset0.getString("spos_dduc_obj_yn"));
			rec.child_dduc_obj_yn = Util.checkString(rset0.getString("child_dduc_obj_yn"));
			rec.oldg_dduc_obj_yn = Util.checkString(rset0.getString("oldg_dduc_obj_yn"));
			rec.obcl_pers_dduc_obj_yn = Util.checkString(rset0.getString("obcl_pers_dduc_obj_yn"));
			rec.rspc_dduc_obj_yn = Util.checkString(rset0.getString("rspc_dduc_obj_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset0.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset0.getString("care_fee_dduc_yn"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_AFFR_1700_LCURLIST2Record rec = new HD_AFFR_1700_LCURLIST2Record();
			rec.cd_type = Util.checkString(rset1.getString("cd_type"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1700_LDataSet ds = (HD_AFFR_1700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_1700_LCURLIST1Record curlist1Rec = (HD_AFFR_1700_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_AFFR_1700_LCURLIST2Record curlist2Rec = (HD_AFFR_1700_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

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
<%= curlist2Rec.cd_type%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 14:41:36 KST 2009 */