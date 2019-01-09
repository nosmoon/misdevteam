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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_3002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_3002_LDataSet(){}
	public HD_YADJM_3002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_YADJM_3002_LCURLISTRecord rec = new HD_YADJM_3002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset0.getString("faml_seq"));
			rec.faml_rshp_cd = Util.checkString(rset0.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset0.getString("faml_rshp_nm"));
			rec.faml_prn = Util.checkString(rset0.getString("faml_prn"));
			rec.faml_flnm = Util.checkString(rset0.getString("faml_flnm"));
			rec.spos_dduc_obj_yn = Util.checkString(rset0.getString("spos_dduc_obj_yn"));
			rec.child_dduc_obj_yn = Util.checkString(rset0.getString("child_dduc_obj_yn"));
			rec.oldg_dduc_obj_yn = Util.checkString(rset0.getString("oldg_dduc_obj_yn"));
			rec.rspc_dduc_obj_yn = Util.checkString(rset0.getString("rspc_dduc_obj_yn"));
			rec.obcl_pers_dduc_obj_yn = Util.checkString(rset0.getString("obcl_pers_dduc_obj_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset0.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset0.getString("care_fee_dduc_yn"));
			rec.ocpn_nm = Util.checkString(rset0.getString("ocpn_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.posi = Util.checkString(rset0.getString("posi"));
			rec.schir_cd = Util.checkString(rset0.getString("schir_cd"));
			rec.schir_nm = Util.checkString(rset0.getString("schir_nm"));
			rec.nmat_yn = Util.checkString(rset0.getString("nmat_yn"));
			rec.adopt_dt = Util.checkString(rset0.getString("adopt_dt"));
			rec.bwj_possible = Util.checkString(rset0.getString("bwj_possible"));
			rec.bnjsdj_possible = Util.checkString(rset0.getString("bnjsdj_possible"));
			rec.soin_possible = Util.checkString(rset0.getString("soin_possible"));
			rec.noin_possible = Util.checkString(rset0.getString("noin_possible"));
			rec.grwd_70_possible = Util.checkString(rset0.getString("grwd_70_possible"));
			rec.yyb_possible = Util.checkString(rset0.getString("yyb_possible"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_3002_LDataSet ds = (HD_YADJM_3002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_3002_LCURLISTRecord curlistRec = (HD_YADJM_3002_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.faml_prn%>
<%= curlistRec.faml_flnm%>
<%= curlistRec.spos_dduc_obj_yn%>
<%= curlistRec.child_dduc_obj_yn%>
<%= curlistRec.oldg_dduc_obj_yn%>
<%= curlistRec.rspc_dduc_obj_yn%>
<%= curlistRec.obcl_pers_dduc_obj_yn%>
<%= curlistRec.fml_hshd_dduc_yn%>
<%= curlistRec.care_fee_dduc_yn%>
<%= curlistRec.ocpn_nm%>
<%= curlistRec.offi_nm%>
<%= curlistRec.posi%>
<%= curlistRec.schir_cd%>
<%= curlistRec.schir_nm%>
<%= curlistRec.nmat_yn%>
<%= curlistRec.adopt_dt%>
<%= curlistRec.bwj_possible%>
<%= curlistRec.bnjsdj_possible%>
<%= curlistRec.soin_possible%>
<%= curlistRec.noin_possible%>
<%= curlistRec.grwd_70_possible%>
<%= curlistRec.yyb_possible%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 11 11:08:40 KST 2010 */