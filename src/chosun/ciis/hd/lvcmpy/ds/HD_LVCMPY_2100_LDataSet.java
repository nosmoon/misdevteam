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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2100_LDataSet(){}
	public HD_LVCMPY_2100_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_2100_LCURLIST1Record rec = new HD_LVCMPY_2100_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_LVCMPY_2100_LCURLIST2Record rec = new HD_LVCMPY_2100_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset1.getString("faml_seq"));
			rec.faml_rshp_cd = Util.checkString(rset1.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset1.getString("faml_rshp_nm"));
			rec.faml_flnm = Util.checkString(rset1.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset1.getString("faml_prn"));
			rec.nmat_yn = Util.checkString(rset1.getString("nmat_yn"));
			rec.dth_dt = Util.checkString(rset1.getString("dth_dt"));
			rec.spos_dduc_yn = Util.checkString(rset1.getString("spos_dduc_yn"));
			rec.child_dduc_yn = Util.checkString(rset1.getString("child_dduc_yn"));
			rec.oldg_dduc_yn = Util.checkString(rset1.getString("oldg_dduc_yn"));
			rec.obcl_pers_dduc_yn = Util.checkString(rset1.getString("obcl_pers_dduc_yn"));
			rec.rspc_dduc_yn = Util.checkString(rset1.getString("rspc_dduc_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset1.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset1.getString("care_fee_dduc_yn"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2100_LDataSet ds = (HD_LVCMPY_2100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_LVCMPY_2100_LCURLIST1Record curlist1Rec = (HD_LVCMPY_2100_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_LVCMPY_2100_LCURLIST2Record curlist2Rec = (HD_LVCMPY_2100_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.zip_1%>
<%= curlist1Rec.zip_2%>
<%= curlist1Rec.addr%>
<%= curlist1Rec.dtls_addr%>
<%= curlist1Rec.tel_no%>
<%= curlist1Rec.fax_no%>
<%= curlist1Rec.ptph_no%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.faml_seq%>
<%= curlist2Rec.faml_rshp_cd%>
<%= curlist2Rec.faml_rshp_nm%>
<%= curlist2Rec.faml_flnm%>
<%= curlist2Rec.faml_prn%>
<%= curlist2Rec.nmat_yn%>
<%= curlist2Rec.dth_dt%>
<%= curlist2Rec.spos_dduc_yn%>
<%= curlist2Rec.child_dduc_yn%>
<%= curlist2Rec.oldg_dduc_yn%>
<%= curlist2Rec.obcl_pers_dduc_yn%>
<%= curlist2Rec.rspc_dduc_yn%>
<%= curlist2Rec.fml_hshd_dduc_yn%>
<%= curlist2Rec.care_fee_dduc_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 17:35:43 KST 2009 */