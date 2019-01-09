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


package chosun.ciis.hd.prz.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_PRZ_1301_LDataSet(){}
	public HD_PRZ_1301_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			HD_PRZ_1301_LCURLISTRecord rec = new HD_PRZ_1301_LCURLISTRecord();
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.aplc_clsf_nm = Util.checkString(rset0.getString("aplc_clsf_nm"));
			rec.obj_clsf_nm = Util.checkString(rset0.getString("obj_clsf_nm"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.req_pers_flnm = Util.checkString(rset0.getString("req_pers_flnm"));
			rec.req_pers_dept_nm = Util.checkString(rset0.getString("req_pers_dept_nm"));
			rec.case_nm = Util.checkString(rset0.getString("case_nm"));
			rec.atic_pubc_dt = Util.checkString(rset0.getString("atic_pubc_dt"));
			rec.atic_pubc_side = Util.checkString(rset0.getString("atic_pubc_side"));
			rec.clas_clsf_nm = Util.checkString(rset0.getString("clas_clsf_nm"));
			rec.dtls_cont = Util.checkString(rset0.getString("dtls_cont"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.superdept_nm = Util.checkString(rset0.getString("superdept_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.prv_insp_dt = Util.checkString(rset0.getString("prv_insp_dt"));
			rec.prv_insp_ocom = Util.checkString(rset0.getString("prv_insp_ocom"));
			rec.prv_insp_resn = Util.checkString(rset0.getString("prv_insp_resn"));
			rec.main_insp_dt = Util.checkString(rset0.getString("main_insp_dt"));
			rec.main_insp_ocom = Util.checkString(rset0.getString("main_insp_ocom"));
			rec.prz_pnsh_cd_nm = Util.checkString(rset0.getString("prz_pnsh_cd_nm"));
			rec.prz_grad = Util.checkString(rset0.getString("prz_grad"));
			rec.prz_amt = Util.checkString(rset0.getString("prz_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRZ_1301_LDataSet ds = (HD_PRZ_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRZ_1301_LCURLISTRecord curlistRec = (HD_PRZ_1301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.aplc_clsf_nm%>
<%= curlistRec.obj_clsf_nm%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.req_pers_flnm%>
<%= curlistRec.req_pers_dept_nm%>
<%= curlistRec.case_nm%>
<%= curlistRec.atic_pubc_dt%>
<%= curlistRec.atic_pubc_side%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.tms%>
<%= curlistRec.prv_insp_dt%>
<%= curlistRec.prv_insp_ocom%>
<%= curlistRec.prv_insp_resn%>
<%= curlistRec.main_insp_dt%>
<%= curlistRec.main_insp_ocom%>
<%= curlistRec.prz_pnsh_cd_nm%>
<%= curlistRec.prz_grad%>
<%= curlistRec.prz_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */