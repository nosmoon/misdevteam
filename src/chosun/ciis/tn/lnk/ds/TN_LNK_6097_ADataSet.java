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


public class TN_LNK_6097_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String datacnt;
	public String dataamt;
	public String reqcnt;
	public String reqamt;
	public String acptcnt;
	public String acptamt;
	public String tailresult;
	public String tailresultmsg;

	public TN_LNK_6097_ADataSet(){}
	public TN_LNK_6097_ADataSet(String errcode, String errmsg, String datacnt, String dataamt, String reqcnt, String reqamt, String acptcnt, String acptamt, String tailresult, String tailresultmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.datacnt = datacnt;
		this.dataamt = dataamt;
		this.reqcnt = reqcnt;
		this.reqamt = reqamt;
		this.acptcnt = acptcnt;
		this.acptamt = acptamt;
		this.tailresult = tailresult;
		this.tailresultmsg = tailresultmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDatacnt(String datacnt){
		this.datacnt = datacnt;
	}

	public void setDataamt(String dataamt){
		this.dataamt = dataamt;
	}

	public void setReqcnt(String reqcnt){
		this.reqcnt = reqcnt;
	}

	public void setReqamt(String reqamt){
		this.reqamt = reqamt;
	}

	public void setAcptcnt(String acptcnt){
		this.acptcnt = acptcnt;
	}

	public void setAcptamt(String acptamt){
		this.acptamt = acptamt;
	}

	public void setTailresult(String tailresult){
		this.tailresult = tailresult;
	}

	public void setTailresultmsg(String tailresultmsg){
		this.tailresultmsg = tailresultmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDatacnt(){
		return this.datacnt;
	}

	public String getDataamt(){
		return this.dataamt;
	}

	public String getReqcnt(){
		return this.reqcnt;
	}

	public String getReqamt(){
		return this.reqamt;
	}

	public String getAcptcnt(){
		return this.acptcnt;
	}

	public String getAcptamt(){
		return this.acptamt;
	}

	public String getTailresult(){
		return this.tailresult;
	}

	public String getTailresultmsg(){
		return this.tailresultmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			TN_LNK_6097_ACURLISTRecord rec = new TN_LNK_6097_ACURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.data_clsf = Util.checkString(rset0.getString("data_clsf"));
			rec.pymtmm = Util.checkString(rset0.getString("pymtmm"));
			rec.pymtdd = Util.checkString(rset0.getString("pymtdd"));
			rec.support = Util.checkString(rset0.getString("support"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.memb_nm = Util.checkString(rset0.getString("memb_nm"));
			rec.pymt_cd = Util.checkString(rset0.getString("pymt_cd"));
			rec.mobiaprvname = Util.checkString(rset0.getString("mobiaprvname"));
			rec.mobiaprvcmpy = Util.checkString(rset0.getString("mobiaprvcmpy"));
			rec.mobiaprvnumber = Util.checkString(rset0.getString("mobiaprvnumber"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.result_stat = Util.checkString(rset0.getString("result_stat"));
			rec.paymentidx = Util.checkString(rset0.getString("paymentidx"));
			rec.cnclokdate = Util.checkString(rset0.getString("cnclokdate"));
			rec.cncldate = Util.checkString(rset0.getString("cncldate"));
			rec.cncl_stat = Util.checkString(rset0.getString("cncl_stat"));
			rec.acptdate = Util.checkString(rset0.getString("acptdate"));
			rec.acptno = Util.checkString(rset0.getString("acptno"));
			rec.acptprice = Util.checkString(rset0.getString("acptprice"));
			rec.acptlimit = Util.checkString(rset0.getString("acptlimit"));
			rec.reqprice = Util.checkString(rset0.getString("reqprice"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.result = Util.checkString(rset0.getString("result"));
			rec.resultcode = Util.checkString(rset0.getString("resultcode"));
			rec.resultmsg = Util.checkString(rset0.getString("resultmsg"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.sdsipaymentidx = Util.checkString(rset0.getString("sdsipaymentidx"));
			rec.sdsiidx = Util.checkString(rset0.getString("sdsiidx"));
			this.curlist.add(rec);
		}
		this.datacnt = Util.checkString(cstmt.getString(9));
		this.dataamt = Util.checkString(cstmt.getString(10));
		this.reqcnt = Util.checkString(cstmt.getString(11));
		this.reqamt = Util.checkString(cstmt.getString(12));
		this.acptcnt = Util.checkString(cstmt.getString(13));
		this.acptamt = Util.checkString(cstmt.getString(14));
		this.tailresult = Util.checkString(cstmt.getString(15));
		this.tailresultmsg = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6097_ADataSet ds = (TN_LNK_6097_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_6097_ACURLISTRecord curlistRec = (TN_LNK_6097_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getDatacnt()%>
<%= ds.getDataamt()%>
<%= ds.getReqcnt()%>
<%= ds.getReqamt()%>
<%= ds.getAcptcnt()%>
<%= ds.getAcptamt()%>
<%= ds.getTailresult()%>
<%= ds.getTailresultmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.data_clsf%>
<%= curlistRec.pymtmm%>
<%= curlistRec.pymtdd%>
<%= curlistRec.support%>
<%= curlistRec.memb_cd%>
<%= curlistRec.memb_nm%>
<%= curlistRec.pymt_cd%>
<%= curlistRec.mobiaprvname%>
<%= curlistRec.mobiaprvcmpy%>
<%= curlistRec.mobiaprvnumber%>
<%= curlistRec.payprice%>
<%= curlistRec.result_stat%>
<%= curlistRec.paymentidx%>
<%= curlistRec.cnclokdate%>
<%= curlistRec.cncldate%>
<%= curlistRec.cncl_stat%>
<%= curlistRec.acptdate%>
<%= curlistRec.acptno%>
<%= curlistRec.acptprice%>
<%= curlistRec.acptlimit%>
<%= curlistRec.reqprice%>
<%= curlistRec.paydate%>
<%= curlistRec.result%>
<%= curlistRec.resultcode%>
<%= curlistRec.resultmsg%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
<%= curlistRec.sdsipaymentidx%>
<%= curlistRec.sdsiidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 23 10:39:52 KST 2016 */