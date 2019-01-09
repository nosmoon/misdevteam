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


public class TN_LNK_5085_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
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

	public TN_LNK_5085_ADataSet(){}
	public TN_LNK_5085_ADataSet(String errcode, String errmsg, String datacnt, String dataamt, String reqcnt, String reqamt, String acptcnt, String acptamt, String tailresult, String tailresultmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			TN_LNK_5085_ACURLISTRecord rec = new TN_LNK_5085_ACURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.data_clsf = Util.checkString(rset0.getString("data_clsf"));
			rec.pymt_cd = Util.checkString(rset0.getString("pymt_cd"));
			rec.memb_nm = Util.checkString(rset0.getString("memb_nm"));
			rec.sdsipaymentidx = Util.checkString(rset0.getString("sdsipaymentidx"));
			rec.cardcmpy = Util.checkString(rset0.getString("cardcmpy"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.yyyy = Util.checkString(rset0.getString("yyyy"));
			rec.mm = Util.checkString(rset0.getString("mm"));
			rec.cardowner = Util.checkString(rset0.getString("cardowner"));
			rec.reqprice = Util.checkString(rset0.getString("reqprice"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.acptdate = Util.checkString(rset0.getString("acptdate"));
			rec.acptprice = Util.checkString(rset0.getString("acptprice"));
			rec.fees = Util.checkString(rset0.getString("fees"));
			rec.acptno = Util.checkString(rset0.getString("acptno"));
			rec.pymtmm = Util.checkString(rset0.getString("pymtmm"));
			rec.cnclokdate = Util.checkString(rset0.getString("cnclokdate"));
			rec.result = Util.checkString(rset0.getString("result"));
			rec.resultcode = Util.checkString(rset0.getString("resultcode"));
			rec.resultmsg = Util.checkString(rset0.getString("resultmsg"));
			rec.result_stat = Util.checkString(rset0.getString("result_stat"));
			rec.pymtdd = Util.checkString(rset0.getString("pymtdd"));
			rec.paymentidx = Util.checkString(rset0.getString("paymentidx"));
			rec.isdelete = Util.checkString(rset0.getString("isdelete"));
			rec.support = Util.checkString(rset0.getString("support"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.sdsiidx = Util.checkString(rset0.getString("sdsiidx"));
			this.curlist.add(rec);
		}
		this.datacnt = Util.checkString(cstmt.getString(8));
		this.dataamt = Util.checkString(cstmt.getString(9));
		this.reqcnt = Util.checkString(cstmt.getString(10));
		this.reqamt = Util.checkString(cstmt.getString(11));
		this.acptcnt = Util.checkString(cstmt.getString(12));
		this.acptamt = Util.checkString(cstmt.getString(13));
		this.tailresult = Util.checkString(cstmt.getString(14));
		this.tailresultmsg = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_5085_ADataSet ds = (TN_LNK_5085_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_5085_ACURLISTRecord curlistRec = (TN_LNK_5085_ACURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pymt_cd%>
<%= curlistRec.memb_nm%>
<%= curlistRec.sdsipaymentidx%>
<%= curlistRec.cardcmpy%>
<%= curlistRec.cardno%>
<%= curlistRec.yyyy%>
<%= curlistRec.mm%>
<%= curlistRec.cardowner%>
<%= curlistRec.reqprice%>
<%= curlistRec.telno%>
<%= curlistRec.email%>
<%= curlistRec.acptdate%>
<%= curlistRec.acptprice%>
<%= curlistRec.fees%>
<%= curlistRec.acptno%>
<%= curlistRec.pymtmm%>
<%= curlistRec.cnclokdate%>
<%= curlistRec.result%>
<%= curlistRec.resultcode%>
<%= curlistRec.resultmsg%>
<%= curlistRec.result_stat%>
<%= curlistRec.pymtdd%>
<%= curlistRec.paymentidx%>
<%= curlistRec.isdelete%>
<%= curlistRec.support%>
<%= curlistRec.memb_cd%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
<%= curlistRec.sdsiidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 22 11:12:44 KST 2016 */