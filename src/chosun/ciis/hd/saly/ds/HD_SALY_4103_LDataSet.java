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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4103_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_4103_LDataSet(){}
	public HD_SALY_4103_LDataSet(String errcode, String errmsg){
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
			HD_SALY_4103_LCURLISTRecord rec = new HD_SALY_4103_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.lon_clsf_cd = Util.checkString(rset0.getString("lon_clsf_cd"));
			rec.lon_dt = Util.checkString(rset0.getString("lon_dt"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.bhbhyb = Util.checkString(rset0.getString("bhbhyb"));
			rec.bogaamt = Util.checkString(rset0.getString("bogaamt"));
			rec.bhnosabeon = Util.checkString(rset0.getString("bhnosabeon"));
			rec.add_bogaamt = Util.checkString(rset0.getString("add_bogaamt"));
			rec.add_bhnosabeon = Util.checkString(rset0.getString("add_bhnosabeon"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			HD_SALY_4103_LCURLIST1Record rec = new HD_SALY_4103_LCURLIST1Record();
			rec.saly_shft_bank_cd = Util.checkString(rset1.getString("saly_shft_bank_cd"));
			rec.saly_shft_bank_nm = Util.checkString(rset1.getString("saly_shft_bank_nm"));
			rec.saly_shft_acct_no = Util.checkString(rset1.getString("saly_shft_acct_no"));
			rec.alon_shft_bank_cd = Util.checkString(rset1.getString("alon_shft_bank_cd"));
			rec.alon_shft_bank_nm = Util.checkString(rset1.getString("alon_shft_bank_nm"));
			rec.alon_shft_acct_no = Util.checkString(rset1.getString("alon_shft_acct_no"));
			rec.encrg_amt_shft_bank_cd = Util.checkString(rset1.getString("encrg_amt_shft_bank_cd"));
			rec.encrg_amt_shft_bank_nm = Util.checkString(rset1.getString("encrg_amt_shft_bank_nm"));
			rec.encrg_amt_shft_acct_no = Util.checkString(rset1.getString("encrg_amt_shft_acct_no"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_4103_LDataSet ds = (HD_SALY_4103_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_4103_LCURLISTRecord curlistRec = (HD_SALY_4103_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SALY_4103_LCURLIST1Record curlist1Rec = (HD_SALY_4103_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.lon_clsf_cd%>
<%= curlistRec.lon_dt%>
<%= curlistRec.flnm%>
<%= curlistRec.bhbhyb%>
<%= curlistRec.bogaamt%>
<%= curlistRec.bhnosabeon%>
<%= curlistRec.add_bogaamt%>
<%= curlistRec.add_bhnosabeon%>
<%= curlist1Rec.saly_shft_bank_cd%>
<%= curlist1Rec.saly_shft_bank_nm%>
<%= curlist1Rec.saly_shft_acct_no%>
<%= curlist1Rec.alon_shft_bank_cd%>
<%= curlist1Rec.alon_shft_bank_nm%>
<%= curlist1Rec.alon_shft_acct_no%>
<%= curlist1Rec.encrg_amt_shft_bank_cd%>
<%= curlist1Rec.encrg_amt_shft_bank_nm%>
<%= curlist1Rec.encrg_amt_shft_acct_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 20:17:49 KST 2009 */