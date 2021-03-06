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


public class FC_ACCT_3006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3006_LDataSet(){}
	public FC_ACCT_3006_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(5);
		while(rset3.next()){
			FC_ACCT_3006_LCURLISTRecord rec = new FC_ACCT_3006_LCURLISTRecord();
			rec.x = Util.checkString(rset3.getString("x"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset3.getString("prelae_pay_clsf_cd"));
			rec.mang_clsf_cd = Util.checkString(rset3.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset3.getString("mang_no"));
			rec.comp_dt = Util.checkString(rset3.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset3.getString("mtry_dt"));
			rec.tot_pymt_amt = Util.checkString(rset3.getString("tot_pymt_amt"));
			rec.dds = Util.checkString(rset3.getString("dds"));
			rec.int_rate = Util.checkString(rset3.getString("int_rate"));
			rec.prvmm_bal = Util.checkString(rset3.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset3.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset3.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset3.getString("thmm_bal"));
			rec.slip_no = Util.checkString(rset3.getString("slip_no"));
			rec.slip_sub_seq = Util.checkString(rset3.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset3.getString("slip_arow_no"));
			rec.prelae_pay_clsf_cd1 = Util.checkString(rset3.getString("prelae_pay_clsf_cd1"));
			rec.mang_clsf_cd1 = Util.checkString(rset3.getString("mang_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_3006_LDataSet ds = (FC_ACCT_3006_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_3006_LCURLISTRecord curlistRec = (FC_ACCT_3006_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.x%>
<%= curlistRec.prelae_pay_clsf_cd%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.dds%>
<%= curlistRec.int_rate%>
<%= curlistRec.prvmm_bal%>
<%= curlistRec.thmm_dr%>
<%= curlistRec.thmm_crdt%>
<%= curlistRec.thmm_bal%>
<%= curlistRec.slip_no%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
<%= curlistRec.prelae_pay_clsf_cd1%>
<%= curlistRec.mang_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 09:28:39 KST 2009 */