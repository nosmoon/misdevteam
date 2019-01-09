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


public class FC_FUNC_8043_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8043_LDataSet(){}
	public FC_FUNC_8043_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_8043_LCURLIST1Record rec = new FC_FUNC_8043_LCURLIST1Record();
			rec.pymt_dt = Util.checkString(rset0.getString("pymt_dt"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.libo_int_rate = Util.checkString(rset0.getString("libo_int_rate"));
			rec.dedu_int_rate = Util.checkString(rset0.getString("dedu_int_rate"));
			rec.pymt_prcp = Util.checkString(rset0.getString("pymt_prcp"));
			rec.pymt_int = Util.checkString(rset0.getString("pymt_int"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.nomach_adpay_bal = Util.checkString(rset0.getString("nomach_adpay_bal"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset0.getString("slip_arow_no"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8043_LDataSet ds = (FC_FUNC_8043_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8043_LCURLIST1Record curlist1Rec = (FC_FUNC_8043_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.pymt_dt%>
<%= curlist1Rec.exrate%>
<%= curlist1Rec.libo_int_rate%>
<%= curlist1Rec.dedu_int_rate%>
<%= curlist1Rec.pymt_prcp%>
<%= curlist1Rec.pymt_int%>
<%= curlist1Rec.won_amt%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.nomach_adpay_bal%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.slip_sub_seq%>
<%= curlist1Rec.slip_arow_no%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 15:11:08 KST 2009 */