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


package chosun.ciis.tn.dns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_1020_LDataSet(){}
	public TN_DNS_1020_LDataSet(String errcode, String errmsg){
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
			TN_DNS_1020_LCURLIST1Record rec = new TN_DNS_1020_LCURLIST1Record();
			rec.membertype = Util.checkString(rset0.getString("membertype"));
			rec.membercode = Util.checkString(rset0.getString("membercode"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.mbr_name = Util.checkString(rset0.getString("mbr_name"));
			rec.isanonymous = Util.checkString(rset0.getString("isanonymous"));
			rec.mbr_regno = Util.checkString(rset0.getString("mbr_regno"));
			rec.isforeigner = Util.checkString(rset0.getString("isforeigner"));
			rec.unknownregno = Util.checkString(rset0.getString("unknownregno"));
			rec.president = Util.checkString(rset0.getString("president"));
			rec.businessno = Util.checkString(rset0.getString("businessno"));
			rec.birthdayorigin = Util.checkString(rset0.getString("birthdayorigin"));
			rec.birthday = Util.checkString(rset0.getString("birthday"));
			rec.birthdaytype = Util.checkString(rset0.getString("birthdaytype"));
			rec.membercategorycode = Util.checkString(rset0.getString("membercategorycode"));
			rec.partycode = Util.checkString(rset0.getString("partycode"));
			rec.writedate = Util.checkString(rset0.getString("writedate"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.adrs_name = Util.checkString(rset0.getString("adrs_name"));
			rec.dept = Util.checkString(rset0.getString("dept"));
			rec.title = Util.checkString(rset0.getString("title"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.phone1 = Util.checkString(rset0.getString("phone1"));
			rec.phone2 = Util.checkString(rset0.getString("phone2"));
			rec.cellphone = Util.checkString(rset0.getString("cellphone"));
			rec.fax = Util.checkString(rset0.getString("fax"));
			rec.zipcode1 = Util.checkString(rset0.getString("zipcode1"));
			rec.address1 = Util.checkString(rset0.getString("address1"));
			rec.addressdetail1 = Util.checkString(rset0.getString("addressdetail1"));
			rec.zipcode2 = Util.checkString(rset0.getString("zipcode2"));
			rec.address2 = Util.checkString(rset0.getString("address2"));
			rec.addressdetail2 = Util.checkString(rset0.getString("addressdetail2"));
			rec.postaddress = Util.checkString(rset0.getString("postaddress"));
			rec.useaddress = Util.checkString(rset0.getString("useaddress"));
			rec.password = Util.checkString(rset0.getString("password"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.donatorcategory = Util.checkString(rset0.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset0.getString("receiptcategory"));
			rec.rcp_name = Util.checkString(rset0.getString("rcp_name"));
			rec.rcp_regno = Util.checkString(rset0.getString("rcp_regno"));
			rec.relation = Util.checkString(rset0.getString("relation"));
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.address = Util.checkString(rset0.getString("address"));
			rec.addressdetail = Util.checkString(rset0.getString("addressdetail"));
			rec.receiptconfigmemo = Util.checkString(rset0.getString("receiptconfigmemo"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			TN_DNS_1020_LCURLIST2Record rec = new TN_DNS_1020_LCURLIST2Record();
			rec.promisecode = Util.checkString(rset1.getString("promisecode"));
			rec.promisedate = Util.checkString(rset1.getString("promisedate"));
			rec.promise_status = Util.checkString(rset1.getString("promise_status"));
			rec.fundidx_nm = Util.checkString(rset1.getString("fundidx_nm"));
			rec.useoriginal_nm = Util.checkString(rset1.getString("useoriginal_nm"));
			rec.paymethodcode_nm = Util.checkString(rset1.getString("paymethodcode_nm"));
			rec.promiseprice = Util.checkString(rset1.getString("promiseprice"));
			rec.payprice = Util.checkString(rset1.getString("payprice"));
			rec.payrate = Util.checkString(rset1.getString("payrate"));
			rec.promiseidx = Util.checkString(rset1.getString("promiseidx"));
			rec.memberidx = Util.checkString(rset1.getString("memberidx"));
			rec.paystopped = Util.checkString(rset1.getString("paystopped"));
			rec.contributormemo = Util.checkString(rset1.getString("contributormemo"));
			rec.promisememo = Util.checkString(rset1.getString("promisememo"));
			rec.fundidx = Util.checkString(rset1.getString("fundidx"));
			rec.supportidx_nm = Util.checkString(rset1.getString("supportidx_nm"));
			rec.supportidx = Util.checkString(rset1.getString("supportidx"));
			rec.useoriginal = Util.checkString(rset1.getString("useoriginal"));
			rec.purposememo = Util.checkString(rset1.getString("purposememo"));
			rec.paymethod = Util.checkString(rset1.getString("paymethod"));
			rec.paymethodcode = Util.checkString(rset1.getString("paymethodcode"));
			rec.bankaccountcode = Util.checkString(rset1.getString("bankaccountcode"));
			rec.partitiontype = Util.checkString(rset1.getString("partitiontype"));
			rec.paystartdate = Util.checkString(rset1.getString("paystartdate"));
			rec.payenddate = Util.checkString(rset1.getString("payenddate"));
			rec.partitioncount = Util.checkString(rset1.getString("partitioncount"));
			rec.monthlypayday = Util.checkString(rset1.getString("monthlypayday"));
			rec.monthlypayprice = Util.checkString(rset1.getString("monthlypayprice"));
			rec.excludenopay = Util.checkString(rset1.getString("excludenopay"));
			rec.ispromiseanonymous = Util.checkString(rset1.getString("ispromiseanonymous"));
			rec.itemname = Util.checkString(rset1.getString("itemname"));
			rec.itemqty = Util.checkString(rset1.getString("itemqty"));
			rec.itemprice = Util.checkString(rset1.getString("itemprice"));
			rec.itemremk = Util.checkString(rset1.getString("itemremk"));
			rec.bankcode = Util.checkString(rset1.getString("bankcode"));
			rec.bankaccount = Util.checkString(rset1.getString("bankaccount"));
			rec.bankaccountowner = Util.checkString(rset1.getString("bankaccountowner"));
			rec.bankownerclsf = Util.checkString(rset1.getString("bankownerclsf"));
			rec.bankowneridentity = Util.checkString(rset1.getString("bankowneridentity"));
			rec.cmsstatus = Util.checkString(rset1.getString("cmsstatus"));
			rec.proofname = Util.checkString(rset1.getString("proofname"));
			rec.prooftype = Util.checkString(rset1.getString("prooftype"));
			rec.stopdate = Util.checkString(rset1.getString("stopdate"));
			rec.stopresn = Util.checkString(rset1.getString("stopresn"));
			rec.cardcmpy = Util.checkString(rset1.getString("cardcmpy"));
			rec.cardnumber = Util.checkString(rset1.getString("cardnumber"));
			rec.cardyymm = Util.checkString(rset1.getString("cardyymm"));
			rec.mobiaprvname = Util.checkString(rset1.getString("mobiaprvname"));
			rec.mobiaprvcmpy = Util.checkString(rset1.getString("mobiaprvcmpy"));
			rec.mobiaprvnumber = Util.checkString(rset1.getString("mobiaprvnumber"));
			rec.mobiaprvprn = Util.checkString(rset1.getString("mobiaprvprn"));
			rec.cmsstopped = Util.checkString(rset1.getString("cmsstopped"));
			rec.cmsstopdate = Util.checkString(rset1.getString("cmsstopdate"));
			rec.cmsupdatedate = Util.checkString(rset1.getString("cmsupdatedate"));
			rec.cardidentity = Util.checkString(rset1.getString("cardidentity"));
			rec.cardowner = Util.checkString(rset1.getString("cardowner"));
			rec.cms_payment_status = Util.checkString(rset1.getString("cms_payment_status"));
			rec.cms_status = Util.checkString(rset1.getString("cms_status"));
			rec.proofidx = Util.checkString(rset1.getString("proofidx"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			TN_DNS_1020_LCURLIST3Record rec = new TN_DNS_1020_LCURLIST3Record();
			rec.chk = Util.checkString(rset2.getString("chk"));
			rec.paymentidx = Util.checkString(rset2.getString("paymentidx"));
			rec.paymentcode = Util.checkString(rset2.getString("paymentcode"));
			rec.paydate = Util.checkString(rset2.getString("paydate"));
			rec.promisecode = Util.checkString(rset2.getString("promisecode"));
			rec.fundidx = Util.checkString(rset2.getString("fundidx"));
			rec.supportidx = Util.checkString(rset2.getString("supportidx"));
			rec.paymethodcode = Util.checkString(rset2.getString("paymethodcode"));
			rec.promiseprice = Util.checkString(rset2.getString("promiseprice"));
			rec.payprice = Util.checkString(rset2.getString("payprice"));
			rec.sumpayprice = Util.checkString(rset2.getString("sumpayprice"));
			rec.receiptissue = Util.checkString(rset2.getString("receiptissue"));
			rec.receiptcount = Util.checkString(rset2.getString("receiptcount"));
			rec.paymentmemo = Util.checkString(rset2.getString("paymentmemo"));
			rec.bank_id = Util.checkString(rset2.getString("bank_id"));
			rec.acct_num = Util.checkString(rset2.getString("acct_num"));
			rec.tran_date = Util.checkString(rset2.getString("tran_date"));
			rec.tran_date_seq = Util.checkString(rset2.getString("tran_date_seq"));
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			TN_DNS_1020_LCURLIST4Record rec = new TN_DNS_1020_LCURLIST4Record();
			rec.memberidx = Util.checkString(rset3.getString("memberidx"));
			rec.fundidx = Util.checkString(rset3.getString("fundidx"));
			rec.supportidx = Util.checkString(rset3.getString("supportidx"));
			rec.scheduleprice = Util.checkString(rset3.getString("scheduleprice"));
			rec.payprice = Util.checkString(rset3.getString("payprice"));
			rec.bankcode = Util.checkString(rset3.getString("bankcode"));
			rec.bankaccount = Util.checkString(rset3.getString("bankaccount"));
			rec.bankaccountowner = Util.checkString(rset3.getString("bankaccountowner"));
			rec.his_type = Util.checkString(rset3.getString("his_type"));
			rec.status = Util.checkString(rset3.getString("status"));
			rec.errorcode = Util.checkString(rset3.getString("errorcode"));
			rec.isdelete = Util.checkString(rset3.getString("isdelete"));
			rec.paydate = Util.checkString(rset3.getString("paydate"));
			rec.writedate = Util.checkString(rset3.getString("writedate"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			TN_DNS_1020_LCURLIST5Record rec = new TN_DNS_1020_LCURLIST5Record();
			rec.receiptidx = Util.checkString(rset4.getString("receiptidx"));
			rec.memberidx = Util.checkString(rset4.getString("memberidx"));
			rec.deptidx = Util.checkString(rset4.getString("deptidx"));
			rec.receiptcode = Util.checkString(rset4.getString("receiptcode"));
			rec.name = Util.checkString(rset4.getString("name"));
			rec.issuecategory = Util.checkString(rset4.getString("issuecategory"));
			rec.issuedate = Util.checkString(rset4.getString("issuedate"));
			rec.donatorcategory = Util.checkString(rset4.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset4.getString("receiptcategory"));
			rec.price = Util.checkString(rset4.getString("price"));
			rec.membername = Util.checkString(rset4.getString("membername"));
			rec.paymentissue = Util.checkString(rset4.getString("paymentissue"));
			rec.issuecount = Util.checkString(rset4.getString("issuecount"));
			rec.isdeleted = Util.checkString(rset4.getString("isdeleted"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			TN_DNS_1020_LCURLIST6Record rec = new TN_DNS_1020_LCURLIST6Record();
			rec.receiverinfo = Util.checkString(rset5.getString("receiverinfo"));
			rec.status = Util.checkString(rset5.getString("status"));
			rec.sendtype = Util.checkString(rset5.getString("sendtype"));
			rec.senddate = Util.checkString(rset5.getString("senddate"));
			rec.failreason = Util.checkString(rset5.getString("failreason"));
			rec.umsidx = Util.checkString(rset5.getString("umsidx"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			TN_DNS_1020_LCURLIST7Record rec = new TN_DNS_1020_LCURLIST7Record();
			rec.memberidx = Util.checkString(rset6.getString("memberidx"));
			rec.fundidx = Util.checkString(rset6.getString("fundidx"));
			rec.supportidx = Util.checkString(rset6.getString("supportidx"));
			rec.scheduleprice = Util.checkString(rset6.getString("scheduleprice"));
			rec.payprice = Util.checkString(rset6.getString("payprice"));
			rec.acptprice = Util.checkString(rset6.getString("acptprice"));
			rec.status = Util.checkString(rset6.getString("status"));
			rec.errorcode = Util.checkString(rset6.getString("errorcode"));
			rec.isdelete = Util.checkString(rset6.getString("isdelete"));
			rec.paydate = Util.checkString(rset6.getString("paydate"));
			rec.cardcmpy = Util.checkString(rset6.getString("cardcmpy"));
			rec.cardno = Util.checkString(rset6.getString("cardno"));
			rec.cardyymm = Util.checkString(rset6.getString("cardyymm"));
			rec.ownername = Util.checkString(rset6.getString("ownername"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(13);
		while(rset7.next()){
			TN_DNS_1020_LCURLIST8Record rec = new TN_DNS_1020_LCURLIST8Record();
			rec.memberidx = Util.checkString(rset7.getString("memberidx"));
			rec.fundidx = Util.checkString(rset7.getString("fundidx"));
			rec.supportidx = Util.checkString(rset7.getString("supportidx"));
			rec.reqprice = Util.checkString(rset7.getString("reqprice"));
			rec.payprice = Util.checkString(rset7.getString("payprice"));
			rec.status = Util.checkString(rset7.getString("status"));
			rec.errorcode = Util.checkString(rset7.getString("errorcode"));
			rec.isdelete = Util.checkString(rset7.getString("isdelete"));
			rec.paydate = Util.checkString(rset7.getString("paydate"));
			rec.moblcmpy = Util.checkString(rset7.getString("moblcmpy"));
			rec.moblno = Util.checkString(rset7.getString("moblno"));
			rec.ownername = Util.checkString(rset7.getString("ownername"));
			this.curlist8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(14);
		while(rset8.next()){
			TN_DNS_1020_LCURLIST9Record rec = new TN_DNS_1020_LCURLIST9Record();
			rec.promiseidx = Util.checkString(rset8.getString("promiseidx"));
			rec.promisecode = Util.checkString(rset8.getString("promisecode"));
			this.curlist9.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_1020_LDataSet ds = (TN_DNS_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_DNS_1020_LCURLIST1Record curlist1Rec = (TN_DNS_1020_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_DNS_1020_LCURLIST2Record curlist2Rec = (TN_DNS_1020_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		TN_DNS_1020_LCURLIST3Record curlist3Rec = (TN_DNS_1020_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		TN_DNS_1020_LCURLIST4Record curlist4Rec = (TN_DNS_1020_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		TN_DNS_1020_LCURLIST5Record curlist5Rec = (TN_DNS_1020_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		TN_DNS_1020_LCURLIST6Record curlist6Rec = (TN_DNS_1020_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		TN_DNS_1020_LCURLIST7Record curlist7Rec = (TN_DNS_1020_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		TN_DNS_1020_LCURLIST8Record curlist8Rec = (TN_DNS_1020_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		TN_DNS_1020_LCURLIST9Record curlist9Rec = (TN_DNS_1020_LCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.membertype%>
<%= curlist1Rec.membercode%>
<%= curlist1Rec.memberidx%>
<%= curlist1Rec.mbr_name%>
<%= curlist1Rec.isanonymous%>
<%= curlist1Rec.mbr_regno%>
<%= curlist1Rec.isforeigner%>
<%= curlist1Rec.unknownregno%>
<%= curlist1Rec.president%>
<%= curlist1Rec.businessno%>
<%= curlist1Rec.birthdayorigin%>
<%= curlist1Rec.birthday%>
<%= curlist1Rec.birthdaytype%>
<%= curlist1Rec.membercategorycode%>
<%= curlist1Rec.partycode%>
<%= curlist1Rec.writedate%>
<%= curlist1Rec.memo%>
<%= curlist1Rec.adrs_name%>
<%= curlist1Rec.dept%>
<%= curlist1Rec.title%>
<%= curlist1Rec.email%>
<%= curlist1Rec.phone1%>
<%= curlist1Rec.phone2%>
<%= curlist1Rec.cellphone%>
<%= curlist1Rec.fax%>
<%= curlist1Rec.zipcode1%>
<%= curlist1Rec.address1%>
<%= curlist1Rec.addressdetail1%>
<%= curlist1Rec.zipcode2%>
<%= curlist1Rec.address2%>
<%= curlist1Rec.addressdetail2%>
<%= curlist1Rec.postaddress%>
<%= curlist1Rec.useaddress%>
<%= curlist1Rec.password%>
<%= curlist1Rec.deptidx%>
<%= curlist1Rec.donatorcategory%>
<%= curlist1Rec.receiptcategory%>
<%= curlist1Rec.rcp_name%>
<%= curlist1Rec.rcp_regno%>
<%= curlist1Rec.relation%>
<%= curlist1Rec.zipcode%>
<%= curlist1Rec.address%>
<%= curlist1Rec.addressdetail%>
<%= curlist1Rec.receiptconfigmemo%>
<%= curlist2Rec.promisecode%>
<%= curlist2Rec.promisedate%>
<%= curlist2Rec.promise_status%>
<%= curlist2Rec.fundidx_nm%>
<%= curlist2Rec.useoriginal_nm%>
<%= curlist2Rec.paymethodcode_nm%>
<%= curlist2Rec.promiseprice%>
<%= curlist2Rec.payprice%>
<%= curlist2Rec.payrate%>
<%= curlist2Rec.promiseidx%>
<%= curlist2Rec.memberidx%>
<%= curlist2Rec.paystopped%>
<%= curlist2Rec.contributormemo%>
<%= curlist2Rec.promisememo%>
<%= curlist2Rec.fundidx%>
<%= curlist2Rec.supportidx_nm%>
<%= curlist2Rec.supportidx%>
<%= curlist2Rec.useoriginal%>
<%= curlist2Rec.purposememo%>
<%= curlist2Rec.paymethod%>
<%= curlist2Rec.paymethodcode%>
<%= curlist2Rec.bankaccountcode%>
<%= curlist2Rec.partitiontype%>
<%= curlist2Rec.paystartdate%>
<%= curlist2Rec.payenddate%>
<%= curlist2Rec.partitioncount%>
<%= curlist2Rec.monthlypayday%>
<%= curlist2Rec.monthlypayprice%>
<%= curlist2Rec.excludenopay%>
<%= curlist2Rec.ispromiseanonymous%>
<%= curlist2Rec.itemname%>
<%= curlist2Rec.itemqty%>
<%= curlist2Rec.itemprice%>
<%= curlist2Rec.itemremk%>
<%= curlist2Rec.bankcode%>
<%= curlist2Rec.bankaccount%>
<%= curlist2Rec.bankaccountowner%>
<%= curlist2Rec.bankownerclsf%>
<%= curlist2Rec.bankowneridentity%>
<%= curlist2Rec.cmsstatus%>
<%= curlist2Rec.proofname%>
<%= curlist2Rec.prooftype%>
<%= curlist2Rec.stopdate%>
<%= curlist2Rec.stopresn%>
<%= curlist2Rec.cardcmpy%>
<%= curlist2Rec.cardnumber%>
<%= curlist2Rec.cardyymm%>
<%= curlist2Rec.mobiaprvname%>
<%= curlist2Rec.mobiaprvcmpy%>
<%= curlist2Rec.mobiaprvnumber%>
<%= curlist2Rec.mobiaprvprn%>
<%= curlist2Rec.cmsstopped%>
<%= curlist2Rec.cmsstopdate%>
<%= curlist2Rec.cmsupdatedate%>
<%= curlist2Rec.cardidentity%>
<%= curlist2Rec.cardowner%>
<%= curlist2Rec.cms_payment_status%>
<%= curlist2Rec.cms_status%>
<%= curlist2Rec.proofidx%>
<%= curlist3Rec.chk%>
<%= curlist3Rec.paymentidx%>
<%= curlist3Rec.paymentcode%>
<%= curlist3Rec.paydate%>
<%= curlist3Rec.promisecode%>
<%= curlist3Rec.fundidx%>
<%= curlist3Rec.supportidx%>
<%= curlist3Rec.paymethodcode%>
<%= curlist3Rec.promiseprice%>
<%= curlist3Rec.payprice%>
<%= curlist3Rec.sumpayprice%>
<%= curlist3Rec.receiptissue%>
<%= curlist3Rec.receiptcount%>
<%= curlist3Rec.paymentmemo%>
<%= curlist3Rec.bank_id%>
<%= curlist3Rec.acct_num%>
<%= curlist3Rec.tran_date%>
<%= curlist3Rec.tran_date_seq%>
<%= curlist3Rec.slip_no%>
<%= curlist4Rec.memberidx%>
<%= curlist4Rec.fundidx%>
<%= curlist4Rec.supportidx%>
<%= curlist4Rec.scheduleprice%>
<%= curlist4Rec.payprice%>
<%= curlist4Rec.bankcode%>
<%= curlist4Rec.bankaccount%>
<%= curlist4Rec.bankaccountowner%>
<%= curlist4Rec.his_type%>
<%= curlist4Rec.status%>
<%= curlist4Rec.errorcode%>
<%= curlist4Rec.isdelete%>
<%= curlist4Rec.paydate%>
<%= curlist4Rec.writedate%>
<%= curlist5Rec.receiptidx%>
<%= curlist5Rec.memberidx%>
<%= curlist5Rec.deptidx%>
<%= curlist5Rec.receiptcode%>
<%= curlist5Rec.name%>
<%= curlist5Rec.issuecategory%>
<%= curlist5Rec.issuedate%>
<%= curlist5Rec.donatorcategory%>
<%= curlist5Rec.receiptcategory%>
<%= curlist5Rec.price%>
<%= curlist5Rec.membername%>
<%= curlist5Rec.paymentissue%>
<%= curlist5Rec.issuecount%>
<%= curlist5Rec.isdeleted%>
<%= curlist6Rec.receiverinfo%>
<%= curlist6Rec.status%>
<%= curlist6Rec.sendtype%>
<%= curlist6Rec.senddate%>
<%= curlist6Rec.failreason%>
<%= curlist6Rec.umsidx%>
<%= curlist7Rec.memberidx%>
<%= curlist7Rec.fundidx%>
<%= curlist7Rec.supportidx%>
<%= curlist7Rec.scheduleprice%>
<%= curlist7Rec.payprice%>
<%= curlist7Rec.acptprice%>
<%= curlist7Rec.status%>
<%= curlist7Rec.errorcode%>
<%= curlist7Rec.isdelete%>
<%= curlist7Rec.paydate%>
<%= curlist7Rec.cardcmpy%>
<%= curlist7Rec.cardno%>
<%= curlist7Rec.cardyymm%>
<%= curlist7Rec.ownername%>
<%= curlist8Rec.memberidx%>
<%= curlist8Rec.fundidx%>
<%= curlist8Rec.supportidx%>
<%= curlist8Rec.reqprice%>
<%= curlist8Rec.payprice%>
<%= curlist8Rec.status%>
<%= curlist8Rec.errorcode%>
<%= curlist8Rec.isdelete%>
<%= curlist8Rec.paydate%>
<%= curlist8Rec.moblcmpy%>
<%= curlist8Rec.moblno%>
<%= curlist8Rec.ownername%>
<%= curlist9Rec.promiseidx%>
<%= curlist9Rec.promisecode%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */