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


public class TN_LNK_6020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long requestcount;
	public long requestprice;
	public long acptcount;
	public long acptprice;
	public long paycount;
	public long payprice;
	public long errorcount;
	public long errorpayprice;
	public long taxfee;
	public long fee;
	public long delcount;
	public long delprice;
	public long cnclcount;
	public long cnclprice;

	public TN_LNK_6020_LDataSet(){}
	public TN_LNK_6020_LDataSet(String errcode, String errmsg, long requestcount, long requestprice, long acptcount, long acptprice, long paycount, long payprice, long errorcount, long errorpayprice, long taxfee, long fee, long delcount, long delprice, long cnclcount, long cnclprice){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.requestcount = requestcount;
		this.requestprice = requestprice;
		this.acptcount = acptcount;
		this.acptprice = acptprice;
		this.paycount = paycount;
		this.payprice = payprice;
		this.errorcount = errorcount;
		this.errorpayprice = errorpayprice;
		this.taxfee = taxfee;
		this.fee = fee;
		this.delcount = delcount;
		this.delprice = delprice;
		this.cnclcount = cnclcount;
		this.cnclprice = cnclprice;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRequestcount(long requestcount){
		this.requestcount = requestcount;
	}

	public void setRequestprice(long requestprice){
		this.requestprice = requestprice;
	}

	public void setAcptcount(long acptcount){
		this.acptcount = acptcount;
	}

	public void setAcptprice(long acptprice){
		this.acptprice = acptprice;
	}

	public void setPaycount(long paycount){
		this.paycount = paycount;
	}

	public void setPayprice(long payprice){
		this.payprice = payprice;
	}

	public void setErrorcount(long errorcount){
		this.errorcount = errorcount;
	}

	public void setErrorpayprice(long errorpayprice){
		this.errorpayprice = errorpayprice;
	}

	public void setTaxfee(long taxfee){
		this.taxfee = taxfee;
	}

	public void setFee(long fee){
		this.fee = fee;
	}

	public void setDelcount(long delcount){
		this.delcount = delcount;
	}

	public void setDelprice(long delprice){
		this.delprice = delprice;
	}

	public void setCnclcount(long cnclcount){
		this.cnclcount = cnclcount;
	}

	public void setCnclprice(long cnclprice){
		this.cnclprice = cnclprice;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getRequestcount(){
		return this.requestcount;
	}

	public long getRequestprice(){
		return this.requestprice;
	}

	public long getAcptcount(){
		return this.acptcount;
	}

	public long getAcptprice(){
		return this.acptprice;
	}

	public long getPaycount(){
		return this.paycount;
	}

	public long getPayprice(){
		return this.payprice;
	}

	public long getErrorcount(){
		return this.errorcount;
	}

	public long getErrorpayprice(){
		return this.errorpayprice;
	}

	public long getTaxfee(){
		return this.taxfee;
	}

	public long getFee(){
		return this.fee;
	}

	public long getDelcount(){
		return this.delcount;
	}

	public long getDelprice(){
		return this.delprice;
	}

	public long getCnclcount(){
		return this.cnclcount;
	}

	public long getCnclprice(){
		return this.cnclprice;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.requestcount = cstmt.getLong(14);
		this.requestprice = cstmt.getLong(15);
		this.acptcount = cstmt.getLong(16);
		this.acptprice = cstmt.getLong(17);
		this.paycount = cstmt.getLong(18);
		this.payprice = cstmt.getLong(19);
		this.errorcount = cstmt.getLong(20);
		this.errorpayprice = cstmt.getLong(21);
		this.taxfee = cstmt.getLong(22);
		this.fee = cstmt.getLong(23);
		this.delcount = cstmt.getLong(24);
		this.delprice = cstmt.getLong(25);
		this.cnclcount = cstmt.getLong(26);
		this.cnclprice = cstmt.getLong(27);
		ResultSet rset0 = (ResultSet) cstmt.getObject(28);
		while(rset0.next()){
			TN_LNK_6020_LCURLISTRecord rec = new TN_LNK_6020_LCURLISTRecord();
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
			rec.reqprice = Util.checkString(rset0.getString("reqprice"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.sdsipaymentidx = Util.checkString(rset0.getString("sdsipaymentidx"));
			rec.sdsiidx = Util.checkString(rset0.getString("sdsiidx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6020_LDataSet ds = (TN_LNK_6020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_6020_LCURLISTRecord curlistRec = (TN_LNK_6020_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRequestcount()%>
<%= ds.getRequestprice()%>
<%= ds.getAcptcount()%>
<%= ds.getAcptprice()%>
<%= ds.getPaycount()%>
<%= ds.getPayprice()%>
<%= ds.getErrorcount()%>
<%= ds.getErrorpayprice()%>
<%= ds.getTaxfee()%>
<%= ds.getFee()%>
<%= ds.getDelcount()%>
<%= ds.getDelprice()%>
<%= ds.getCnclcount()%>
<%= ds.getCnclprice()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

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
<%= curlistRec.reqprice%>
<%= curlistRec.paydate%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
<%= curlistRec.sdsipaymentidx%>
<%= curlistRec.sdsiidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 30 14:35:11 KST 2016 */