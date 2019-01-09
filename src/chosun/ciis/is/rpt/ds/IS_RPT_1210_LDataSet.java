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


package chosun.ciis.is.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_1210_LDataSet(){}
	public IS_RPT_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_RPT_1210_LCURLIST1Record rec = new IS_RPT_1210_LCURLIST1Record();
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dm_tgt_amt = Util.checkString(rset0.getString("dm_tgt_amt"));
			rec.dm_rst_amt = Util.checkString(rset0.getString("dm_rst_amt"));
			rec.dm_d_rate = Util.checkString(rset0.getString("dm_d_rate"));
			rec.dm_tgt_amt_s = Util.checkString(rset0.getString("dm_tgt_amt_s"));
			rec.dm_rst_amt_s = Util.checkString(rset0.getString("dm_rst_amt_s"));
			rec.dm_d_rate_s = Util.checkString(rset0.getString("dm_d_rate_s"));
			rec.ty_tgt_amt = Util.checkString(rset0.getString("ty_tgt_amt"));
			rec.ny_tgt_amt = Util.checkString(rset0.getString("ny_tgt_amt"));
			rec.ny_rst_amt = Util.checkString(rset0.getString("ny_rst_amt"));
			rec.ny_d_rate = Util.checkString(rset0.getString("ny_d_rate"));
			rec.pl_rst_amt = Util.checkString(rset0.getString("pl_rst_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_RPT_1210_LDataSet ds = (IS_RPT_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_1210_LCURLIST1Record curlist1Rec = (IS_RPT_1210_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.sale_clsf_nm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_cd_nm%>
<%= curlist1Rec.dm_tgt_amt%>
<%= curlist1Rec.dm_rst_amt%>
<%= curlist1Rec.dm_d_rate%>
<%= curlist1Rec.dm_tgt_amt_s%>
<%= curlist1Rec.dm_rst_amt_s%>
<%= curlist1Rec.dm_d_rate_s%>
<%= curlist1Rec.ty_tgt_amt%>
<%= curlist1Rec.ny_tgt_amt%>
<%= curlist1Rec.ny_rst_amt%>
<%= curlist1Rec.ny_d_rate%>
<%= curlist1Rec.pl_rst_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 14:59:41 KST 2012 */