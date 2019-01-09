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


public class HD_AFFR_2412_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2412_LDataSet(){}
	public HD_AFFR_2412_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_AFFR_2412_LCURLISTRecord rec = new HD_AFFR_2412_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.chk_dt = Util.checkString(rset0.getString("chk_dt"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.chk_obj_pers_rshp = Util.checkString(rset0.getString("chk_obj_pers_rshp"));
			rec.faml_rshp_nm = Util.checkString(rset0.getString("faml_rshp_nm"));
			rec.chk_pers_nm = Util.checkString(rset0.getString("chk_pers_nm"));
			rec.chk_hosp_nm = Util.checkString(rset0.getString("chk_hosp_nm"));
			rec.real_chk_fee = Util.checkString(rset0.getString("real_chk_fee"));
			rec.sply_chk_fee = Util.checkString(rset0.getString("sply_chk_fee"));
			rec.ocom_subm_yn = Util.checkString(rset0.getString("ocom_subm_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.cmpy_welf_fund_clsf = Util.checkString(rset0.getString("cmpy_welf_fund_clsf"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2412_LDataSet ds = (HD_AFFR_2412_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2412_LCURLISTRecord curlistRec = (HD_AFFR_2412_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.chk_dt%>
<%= curlistRec.prn%>
<%= curlistRec.chk_obj_pers_rshp%>
<%= curlistRec.faml_rshp_nm%>
<%= curlistRec.chk_pers_nm%>
<%= curlistRec.chk_hosp_nm%>
<%= curlistRec.real_chk_fee%>
<%= curlistRec.sply_chk_fee%>
<%= curlistRec.ocom_subm_yn%>
<%= curlistRec.remk%>
<%= curlistRec.cmpy_welf_fund_clsf%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 10 15:12:35 KST 2012 */