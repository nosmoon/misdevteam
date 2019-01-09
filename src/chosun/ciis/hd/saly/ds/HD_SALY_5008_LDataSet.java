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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_5008_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_5008_LDataSet(){}
	public HD_SALY_5008_LDataSet(String errcode, String errmsg){
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
			HD_SALY_5008_LCURLISTRecord rec = new HD_SALY_5008_LCURLISTRecord();
			rec.emp_no_1 = Util.checkString(rset0.getString("emp_no_1"));
			rec.emp_impn_amt = Util.checkString(rset0.getString("emp_impn_amt"));
			rec.emp_slf_burd_amt = Util.checkString(rset0.getString("emp_slf_burd_amt"));
			rec.emp_adjm_obj_amt = Util.checkString(rset0.getString("emp_adjm_obj_amt"));
			rec.emp_ipymt_six_mm_amt = Util.checkString(rset0.getString("emp_ipymt_six_mm_amt"));
			rec.emp_mm_dduc_base_amt = Util.checkString(rset0.getString("emp_mm_dduc_base_amt"));
			rec.emp_ipymt_amt = Util.checkString(rset0.getString("emp_ipymt_amt"));
			rec.emp_mm_dduc_tot_amt = Util.checkString(rset0.getString("emp_mm_dduc_tot_amt"));
			rec.emp_befr_dduc_amt = Util.checkString(rset0.getString("emp_befr_dduc_amt"));
			rec.emp_no_2 = Util.checkString(rset0.getString("emp_no_2"));
			rec.hlth_impn_amt = Util.checkString(rset0.getString("hlth_impn_amt"));
			rec.hlth_slf_burd_amt = Util.checkString(rset0.getString("hlth_slf_burd_amt"));
			rec.hlth_adjm_obj_amt = Util.checkString(rset0.getString("hlth_adjm_obj_amt"));
			rec.hlth_ipymt_six_mm_amt = Util.checkString(rset0.getString("hlth_ipymt_six_mm_amt"));
			rec.hlth_mm_dduc_base_amt = Util.checkString(rset0.getString("hlth_mm_dduc_base_amt"));
			rec.hlth_ipymt_amt = Util.checkString(rset0.getString("hlth_ipymt_amt"));
			rec.hlth_mm_dduc_tot_amt = Util.checkString(rset0.getString("hlth_mm_dduc_tot_amt"));
			rec.hlth_befr_dduc_amt = Util.checkString(rset0.getString("hlth_befr_dduc_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_5008_LDataSet ds = (HD_SALY_5008_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_5008_LCURLISTRecord curlistRec = (HD_SALY_5008_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no_1%>
<%= curlistRec.emp_impn_amt%>
<%= curlistRec.emp_slf_burd_amt%>
<%= curlistRec.emp_adjm_obj_amt%>
<%= curlistRec.emp_ipymt_six_mm_amt%>
<%= curlistRec.emp_mm_dduc_base_amt%>
<%= curlistRec.emp_ipymt_amt%>
<%= curlistRec.emp_mm_dduc_tot_amt%>
<%= curlistRec.emp_befr_dduc_amt%>
<%= curlistRec.emp_no_2%>
<%= curlistRec.hlth_impn_amt%>
<%= curlistRec.hlth_slf_burd_amt%>
<%= curlistRec.hlth_adjm_obj_amt%>
<%= curlistRec.hlth_ipymt_six_mm_amt%>
<%= curlistRec.hlth_mm_dduc_base_amt%>
<%= curlistRec.hlth_ipymt_amt%>
<%= curlistRec.hlth_mm_dduc_tot_amt%>
<%= curlistRec.hlth_befr_dduc_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 19:17:40 KST 2015 */