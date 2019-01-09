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


public class HD_AFFR_1614_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1614_MDataSet(){}
	public HD_AFFR_1614_MDataSet(String errcode, String errmsg){
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
			HD_AFFR_1614_MCURLIST1Record rec = new HD_AFFR_1614_MCURLIST1Record();
			rec.scl_exps_clsf = Util.checkString(rset0.getString("scl_exps_clsf"));
			rec.fix_rate_clsf = Util.checkString(rset0.getString("fix_rate_clsf"));
			rec.pay_ratio_emp = Util.checkString(rset0.getString("pay_ratio_emp"));
			rec.pay_ratio_ofcr = Util.checkString(rset0.getString("pay_ratio_ofcr"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1614_MDataSet ds = (HD_AFFR_1614_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_1614_MCURLIST1Record curlist1Rec = (HD_AFFR_1614_MCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.scl_exps_clsf%>
<%= curlist1Rec.fix_rate_clsf%>
<%= curlist1Rec.pay_ratio_emp%>
<%= curlist1Rec.pay_ratio_ofcr%>
<%= curlist1Rec.pay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 10 17:19:56 KST 2012 */