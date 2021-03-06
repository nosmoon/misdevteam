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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5521_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_5521_LDataSet(){}
	public HD_SRCH_5521_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_5521_LCURLIST1Record rec = new HD_SRCH_5521_LCURLIST1Record();
			rec.row_num = Util.checkString(rset0.getString("row_num"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.prv_mm = Util.checkString(rset0.getString("prv_mm"));
			rec.base_mm = Util.checkString(rset0.getString("base_mm"));
			rec.prvmm_cmpr = Util.checkString(rset0.getString("prvmm_cmpr"));
			rec.icdc_rate = Util.checkString(rset0.getString("icdc_rate"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5521_LDataSet ds = (HD_SRCH_5521_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5521_LCURLIST1Record curlist1Rec = (HD_SRCH_5521_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.row_num%>
<%= curlist1Rec.emp_clsf%>
<%= curlist1Rec.prv_mm%>
<%= curlist1Rec.base_mm%>
<%= curlist1Rec.prvmm_cmpr%>
<%= curlist1Rec.icdc_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 07 15:04:52 KST 2018 */