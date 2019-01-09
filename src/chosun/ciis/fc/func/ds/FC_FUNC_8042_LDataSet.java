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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8042_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8042_LDataSet(){}
	public FC_FUNC_8042_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_8042_LCURLIST1Record rec = new FC_FUNC_8042_LCURLIST1Record();
			rec.pymt_plan_dt = Util.checkString(rset0.getString("pymt_plan_dt"));
			rec.pymt_plan_prcp = Util.checkString(rset0.getString("pymt_plan_prcp"));
			rec.pymt_plan_int = Util.checkString(rset0.getString("pymt_plan_int"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			rec.pymt_yn = Util.checkString(rset0.getString("pymt_yn"));
			rec.pymt_dt = Util.checkString(rset0.getString("pymt_dt"));
			rec.pymt_prcp = Util.checkString(rset0.getString("pymt_prcp"));
			rec.pymt_int = Util.checkString(rset0.getString("pymt_int"));
			rec.pay_cost_clsf = Util.checkString(rset0.getString("pay_cost_clsf"));
			rec.hsty_seq = Util.checkString(rset0.getString("hsty_seq"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8042_LDataSet ds = (FC_FUNC_8042_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8042_LCURLIST1Record curlist1Rec = (FC_FUNC_8042_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.pymt_plan_dt%>
<%= curlist1Rec.pymt_plan_prcp%>
<%= curlist1Rec.pymt_plan_int%>
<%= curlist1Rec.bal%>
<%= curlist1Rec.pymt_yn%>
<%= curlist1Rec.pymt_dt%>
<%= curlist1Rec.pymt_prcp%>
<%= curlist1Rec.pymt_int%>
<%= curlist1Rec.pay_cost_clsf%>
<%= curlist1Rec.hsty_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 16:58:52 KST 2009 */