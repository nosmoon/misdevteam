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


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_2010_LDataSet(){}
	public SE_RCP_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_RCP_2010_LCURLISTRecord rec = new SE_RCP_2010_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.cyov_bal = Util.checkString(rset0.getString("cyov_bal"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.sale_tot = Util.checkString(rset0.getString("sale_tot"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.bo_trans_amt = Util.checkString(rset0.getString("bo_trans_amt"));
			rec.aft_rcpm_amt = Util.checkString(rset0.getString("aft_rcpm_amt"));
			rec.clracct_amt = Util.checkString(rset0.getString("clracct_amt"));
			rec.aft_clos_amt = Util.checkString(rset0.getString("aft_clos_amt"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.fpymt_dt = Util.checkString(rset0.getString("fpymt_dt"));
			rec.pdlv_altn_amt = Util.checkString(rset0.getString("pdlv_altn_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_2010_LDataSet ds = (SE_RCP_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_2010_LCURLISTRecord curlistRec = (SE_RCP_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.cyov_bal%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.sale_tot%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.bo_trans_amt%>
<%= curlistRec.aft_rcpm_amt%>
<%= curlistRec.clracct_amt%>
<%= curlistRec.aft_clos_amt%>
<%= curlistRec.rcpm_rate%>
<%= curlistRec.fpymt_dt%>
<%= curlistRec.pdlv_altn_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 29 11:35:48 KST 2012 */