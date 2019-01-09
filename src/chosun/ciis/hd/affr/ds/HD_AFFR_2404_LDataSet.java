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


public class HD_AFFR_2404_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2404_LDataSet(){}
	public HD_AFFR_2404_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_2404_LCURLISTRecord rec = new HD_AFFR_2404_LCURLISTRecord();
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
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2404_LDataSet ds = (HD_AFFR_2404_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2404_LCURLISTRecord curlistRec = (HD_AFFR_2404_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.faml_seq%>
<%= curlistRec.faml_rshp_cd%>
<%= curlistRec.faml_rshp_nm%>
<%= curlistRec.faml_flnm%>
<%= curlistRec.faml_prn%>
<%= curlistRec.ocpn_cd%>
<%= curlistRec.ocpn_nm%>
<%= curlistRec.offi_nm%>
<%= curlistRec.posi%>
<%= curlistRec.schir_cd%>
<%= curlistRec.schir_nm%>
<%= curlistRec.nmat_yn%>
<%= curlistRec.dth_dt%>
<%= curlistRec.spos_dduc_obj_yn%>
<%= curlistRec.child_dduc_obj_yn%>
<%= curlistRec.oldg_dduc_obj_yn%>
<%= curlistRec.obcl_pers_dduc_obj_yn%>
<%= curlistRec.rspc_dduc_obj_yn%>
<%= curlistRec.fml_hshd_dduc_yn%>
<%= curlistRec.care_fee_dduc_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 17:44:19 KST 2009 */