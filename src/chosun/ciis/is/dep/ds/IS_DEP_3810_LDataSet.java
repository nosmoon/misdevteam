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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_3810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_3810_LDataSet(){}
	public IS_DEP_3810_LDataSet(String errcode, String errmsg){
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
			IS_DEP_3810_LCURLISTRecord rec = new IS_DEP_3810_LCURLISTRecord();
			rec.bill_no = Util.checkString(rset0.getString("bill_no"));
			rec.acwr_reg_dt_seq = Util.checkString(rset0.getString("acwr_reg_dt_seq"));
			rec.bddb_proc_clsf = Util.checkString(rset0.getString("bddb_proc_clsf"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.unrcp_vat_amt = Util.checkString(rset0.getString("unrcp_vat_amt"));
			rec.sale_proc_dt = Util.checkString(rset0.getString("sale_proc_dt"));
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.sale_dlco_li_seq = Util.checkString(rset0.getString("sale_dlco_li_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.bddb_proc_yn = Util.checkString(rset0.getString("bddb_proc_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_3810_LDataSet ds = (IS_DEP_3810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_3810_LCURLISTRecord curlistRec = (IS_DEP_3810_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bill_no%>
<%= curlistRec.acwr_reg_dt_seq%>
<%= curlistRec.bddb_proc_clsf%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.unrcp_vat_amt%>
<%= curlistRec.sale_proc_dt%>
<%= curlistRec.acwr_reg_dt%>
<%= curlistRec.acwr_reg_seq%>
<%= curlistRec.sale_dlco_li_seq%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.bddb_proc_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 22 19:35:34 KST 2012 */