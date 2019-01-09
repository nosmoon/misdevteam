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


package chosun.ciis.sp.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.rec.*;

/**
 * 
 */


public class SP_DEP_1520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_DEP_1520_LDataSet(){}
	public SP_DEP_1520_LDataSet(String errcode, String errmsg){
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
			SP_DEP_1520_LCURLISTRecord rec = new SP_DEP_1520_LCURLISTRecord();
			rec.dtls_seq = Util.checkString(rset0.getString("dtls_seq"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.occr_slip_clsf = Util.checkString(rset0.getString("occr_slip_clsf"));
			rec.occr_slip = Util.checkString(rset0.getString("occr_slip"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sale_yymm = Util.checkString(rset0.getString("sale_yymm"));
			rec.sale_item_cd = Util.checkString(rset0.getString("sale_item_cd"));
			rec.sale_item_cd_nm = Util.checkString(rset0.getString("sale_item_cd_nm"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_proc_amt = Util.checkString(rset0.getString("rcpm_proc_amt"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_DEP_1520_LDataSet ds = (SP_DEP_1520_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_DEP_1520_LCURLISTRecord curlistRec = (SP_DEP_1520_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dtls_seq%>
<%= curlistRec.budg_cd%>
<%= curlistRec.occr_slip_clsf%>
<%= curlistRec.occr_slip%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.sale_yymm%>
<%= curlistRec.sale_item_cd%>
<%= curlistRec.sale_item_cd_nm%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.rcpm_proc_amt%>
<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 07 14:09:25 KST 2013 */