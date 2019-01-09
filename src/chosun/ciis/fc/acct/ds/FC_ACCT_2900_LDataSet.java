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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2900_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rmtt_pay_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2900_LDataSet(){}
	public FC_ACCT_2900_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2900_LRMTT_PAY_LISTRecord rec = new FC_ACCT_2900_LRMTT_PAY_LISTRecord();
			rec.check1 = Util.checkString(rset0.getString("check1"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.clam_dept = Util.checkString(rset0.getString("clam_dept"));
			rec.ptcr = Util.checkString(rset0.getString("ptcr"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.src_tax = Util.checkString(rset0.getString("src_tax"));
			rec.calc_amt = Util.checkString(rset0.getString("calc_amt"));
			rec.rmtt_cnt = Util.checkString(rset0.getString("rmtt_cnt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			this.rmtt_pay_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2900_LDataSet ds = (FC_ACCT_2900_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rmtt_pay_list.size(); i++){
		FC_ACCT_2900_LRMTT_PAY_LISTRecord rmtt_pay_listRec = (FC_ACCT_2900_LRMTT_PAY_LISTRecord)ds.rmtt_pay_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRmtt_pay_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rmtt_pay_listRec.check1%>
<%= rmtt_pay_listRec.slip_no%>
<%= rmtt_pay_listRec.slip_occr_dt%>
<%= rmtt_pay_listRec.slip_clsf_cd%>
<%= rmtt_pay_listRec.slip_seq%>
<%= rmtt_pay_listRec.slip_sub_seq%>
<%= rmtt_pay_listRec.clam_dept%>
<%= rmtt_pay_listRec.ptcr%>
<%= rmtt_pay_listRec.amt%>
<%= rmtt_pay_listRec.src_tax%>
<%= rmtt_pay_listRec.calc_amt%>
<%= rmtt_pay_listRec.rmtt_cnt%>
<%= rmtt_pay_listRec.cmpy_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 11:11:53 KST 2009 */