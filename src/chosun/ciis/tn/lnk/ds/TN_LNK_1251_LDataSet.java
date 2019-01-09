/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1251_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_cnt;
	public String tot_amt;
	public String start_dt;
	public String end_dt;
	public String bzno;
	public String rcpt_rpt_idx;
	public String filenm;
	public String rec_b;

	public TN_LNK_1251_LDataSet(){}
	public TN_LNK_1251_LDataSet(String errcode, String errmsg, String tot_cnt, String tot_amt, String start_dt, String end_dt, String bzno, String rcpt_rpt_idx, String filenm, String rec_b){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_cnt = tot_cnt;
		this.tot_amt = tot_amt;
		this.start_dt = start_dt;
		this.end_dt = end_dt;
		this.bzno = bzno;
		this.rcpt_rpt_idx = rcpt_rpt_idx;
		this.filenm = filenm;
		this.rec_b = rec_b;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setBzno(String bzno){
		this.bzno = bzno;
	}

	public void setRcpt_rpt_idx(String rcpt_rpt_idx){
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setRec_b(String rec_b){
		this.rec_b = rec_b;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getBzno(){
		return this.bzno;
	}

	public String getRcpt_rpt_idx(){
		return this.rcpt_rpt_idx;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getRec_b(){
		return this.rec_b;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_cnt = Util.checkString(cstmt.getString(15));
		this.tot_amt = Util.checkString(cstmt.getString(16));
		this.start_dt = Util.checkString(cstmt.getString(17));
		this.end_dt = Util.checkString(cstmt.getString(18));
		this.bzno = Util.checkString(cstmt.getString(19));
		this.rcpt_rpt_idx = Util.checkString(cstmt.getString(20));
		this.filenm = Util.checkString(cstmt.getString(21));
		this.rec_b = Util.checkString(cstmt.getString(22));
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			TN_LNK_1251_LCURLISTRecord rec = new TN_LNK_1251_LCURLISTRecord();
			rec.paymentidx = Util.checkString(rset0.getString("paymentidx"));
			rec.receiptidx = Util.checkString(rset0.getString("receiptidx"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.pay_cd = Util.checkString(rset0.getString("pay_cd"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.pay_methd_type = Util.checkString(rset0.getString("pay_methd_type"));
			rec.filedata = Util.checkString(rset0.getString("filedata"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1251_LDataSet ds = (TN_LNK_1251_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_1251_LCURLISTRecord curlistRec = (TN_LNK_1251_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_cnt()%>
<%= ds.getTot_amt()%>
<%= ds.getStart_dt()%>
<%= ds.getEnd_dt()%>
<%= ds.getBzno()%>
<%= ds.getRcpt_rpt_idx()%>
<%= ds.getFilenm()%>
<%= ds.getRec_b()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.paymentidx%>
<%= curlistRec.receiptidx%>
<%= curlistRec.memberidx%>
<%= curlistRec.name%>
<%= curlistRec.regno%>
<%= curlistRec.pay_cd%>
<%= curlistRec.payprice%>
<%= curlistRec.paydate%>
<%= curlistRec.pay_methd_type%>
<%= curlistRec.filedata%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 18:36:01 KST 2017 */