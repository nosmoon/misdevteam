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


public class TN_DNS_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList support_list = new ArrayList();
	public ArrayList moblcmpy_list = new ArrayList();
	public ArrayList prooftype_list = new ArrayList();
	public ArrayList paymethod_g_list = new ArrayList();
	public ArrayList useoriginal_list = new ArrayList();
	public ArrayList partitiontype_list = new ArrayList();
	public ArrayList bank_list = new ArrayList();
	public ArrayList fund_list = new ArrayList();
	public ArrayList receiptcategory_list = new ArrayList();
	public ArrayList donatorcategory_list = new ArrayList();
	public ArrayList account_list = new ArrayList();
	public ArrayList membercategorycode_list = new ArrayList();
	public ArrayList cms_status_list = new ArrayList();
	public ArrayList paymethod_list = new ArrayList();
	public ArrayList paymethod_m_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_1000_MDataSet(){}
	public TN_DNS_1000_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			TN_DNS_1000_MBANK_LISTRecord rec = new TN_DNS_1000_MBANK_LISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.bank_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_DNS_1000_MFUND_LISTRecord rec = new TN_DNS_1000_MFUND_LISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.fund_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			TN_DNS_1000_MSUPPORT_LISTRecord rec = new TN_DNS_1000_MSUPPORT_LISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.support_list.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			TN_DNS_1000_MPAYMETHOD_G_LISTRecord rec = new TN_DNS_1000_MPAYMETHOD_G_LISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.paymethod_g_list.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			TN_DNS_1000_MPAYMETHOD_M_LISTRecord rec = new TN_DNS_1000_MPAYMETHOD_M_LISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			this.paymethod_m_list.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			TN_DNS_1000_MACCOUNT_LISTRecord rec = new TN_DNS_1000_MACCOUNT_LISTRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			this.account_list.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			TN_DNS_1000_MCMS_STATUS_LISTRecord rec = new TN_DNS_1000_MCMS_STATUS_LISTRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			this.cms_status_list.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			TN_DNS_1000_MPROOFTYPE_LISTRecord rec = new TN_DNS_1000_MPROOFTYPE_LISTRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			this.prooftype_list.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(12);
		while(rset8.next()){
			TN_DNS_1000_MMEMBERCATEGORYCODE_LISTRecord rec = new TN_DNS_1000_MMEMBERCATEGORYCODE_LISTRecord();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			this.membercategorycode_list.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(13);
		while(rset9.next()){
			TN_DNS_1000_MDONATORCATEGORY_LISTRecord rec = new TN_DNS_1000_MDONATORCATEGORY_LISTRecord();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			this.donatorcategory_list.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(14);
		while(rset10.next()){
			TN_DNS_1000_MRECEIPTCATEGORY_LISTRecord rec = new TN_DNS_1000_MRECEIPTCATEGORY_LISTRecord();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			this.receiptcategory_list.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(15);
		while(rset11.next()){
			TN_DNS_1000_MPAYMETHOD_LISTRecord rec = new TN_DNS_1000_MPAYMETHOD_LISTRecord();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			this.paymethod_list.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(16);
		while(rset12.next()){
			TN_DNS_1000_MPARTITIONTYPE_LISTRecord rec = new TN_DNS_1000_MPARTITIONTYPE_LISTRecord();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			this.partitiontype_list.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(17);
		while(rset13.next()){
			TN_DNS_1000_MUSEORIGINAL_LISTRecord rec = new TN_DNS_1000_MUSEORIGINAL_LISTRecord();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			this.useoriginal_list.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(18);
		while(rset14.next()){
			TN_DNS_1000_MMOBLCMPY_LISTRecord rec = new TN_DNS_1000_MMOBLCMPY_LISTRecord();
			rec.cd = Util.checkString(rset14.getString("cd"));
			rec.cdnm = Util.checkString(rset14.getString("cdnm"));
			this.moblcmpy_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_1000_MDataSet ds = (TN_DNS_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bank_list.size(); i++){
		TN_DNS_1000_MBANK_LISTRecord bank_listRec = (TN_DNS_1000_MBANK_LISTRecord)ds.bank_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.fund_list.size(); i++){
		TN_DNS_1000_MFUND_LISTRecord fund_listRec = (TN_DNS_1000_MFUND_LISTRecord)ds.fund_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.support_list.size(); i++){
		TN_DNS_1000_MSUPPORT_LISTRecord support_listRec = (TN_DNS_1000_MSUPPORT_LISTRecord)ds.support_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paymethod_g_list.size(); i++){
		TN_DNS_1000_MPAYMETHOD_G_LISTRecord paymethod_g_listRec = (TN_DNS_1000_MPAYMETHOD_G_LISTRecord)ds.paymethod_g_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paymethod_m_list.size(); i++){
		TN_DNS_1000_MPAYMETHOD_M_LISTRecord paymethod_m_listRec = (TN_DNS_1000_MPAYMETHOD_M_LISTRecord)ds.paymethod_m_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.account_list.size(); i++){
		TN_DNS_1000_MACCOUNT_LISTRecord account_listRec = (TN_DNS_1000_MACCOUNT_LISTRecord)ds.account_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cms_status_list.size(); i++){
		TN_DNS_1000_MCMS_STATUS_LISTRecord cms_status_listRec = (TN_DNS_1000_MCMS_STATUS_LISTRecord)ds.cms_status_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.prooftype_list.size(); i++){
		TN_DNS_1000_MPROOFTYPE_LISTRecord prooftype_listRec = (TN_DNS_1000_MPROOFTYPE_LISTRecord)ds.prooftype_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.membercategorycode_list.size(); i++){
		TN_DNS_1000_MMEMBERCATEGORYCODE_LISTRecord membercategorycode_listRec = (TN_DNS_1000_MMEMBERCATEGORYCODE_LISTRecord)ds.membercategorycode_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.donatorcategory_list.size(); i++){
		TN_DNS_1000_MDONATORCATEGORY_LISTRecord donatorcategory_listRec = (TN_DNS_1000_MDONATORCATEGORY_LISTRecord)ds.donatorcategory_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.receiptcategory_list.size(); i++){
		TN_DNS_1000_MRECEIPTCATEGORY_LISTRecord receiptcategory_listRec = (TN_DNS_1000_MRECEIPTCATEGORY_LISTRecord)ds.receiptcategory_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paymethod_list.size(); i++){
		TN_DNS_1000_MPAYMETHOD_LISTRecord paymethod_listRec = (TN_DNS_1000_MPAYMETHOD_LISTRecord)ds.paymethod_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partitiontype_list.size(); i++){
		TN_DNS_1000_MPARTITIONTYPE_LISTRecord partitiontype_listRec = (TN_DNS_1000_MPARTITIONTYPE_LISTRecord)ds.partitiontype_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.useoriginal_list.size(); i++){
		TN_DNS_1000_MUSEORIGINAL_LISTRecord useoriginal_listRec = (TN_DNS_1000_MUSEORIGINAL_LISTRecord)ds.useoriginal_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.moblcmpy_list.size(); i++){
		TN_DNS_1000_MMOBLCMPY_LISTRecord moblcmpy_listRec = (TN_DNS_1000_MMOBLCMPY_LISTRecord)ds.moblcmpy_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBank_list()%>
<%= ds.getFund_list()%>
<%= ds.getSupport_list()%>
<%= ds.getPaymethod_g_list()%>
<%= ds.getPaymethod_m_list()%>
<%= ds.getAccount_list()%>
<%= ds.getCms_status_list()%>
<%= ds.getProoftype_list()%>
<%= ds.getMembercategorycode_list()%>
<%= ds.getDonatorcategory_list()%>
<%= ds.getReceiptcategory_list()%>
<%= ds.getPaymethod_list()%>
<%= ds.getPartitiontype_list()%>
<%= ds.getUseoriginal_list()%>
<%= ds.getMoblcmpy_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bank_listRec.cd%>
<%= bank_listRec.cdnm%>
<%= fund_listRec.cd%>
<%= fund_listRec.cdnm%>
<%= support_listRec.cd%>
<%= support_listRec.cdnm%>
<%= paymethod_g_listRec.cd%>
<%= paymethod_g_listRec.cdnm%>
<%= paymethod_m_listRec.cd%>
<%= paymethod_m_listRec.cdnm%>
<%= account_listRec.cd%>
<%= account_listRec.cdnm%>
<%= cms_status_listRec.cd%>
<%= cms_status_listRec.cdnm%>
<%= prooftype_listRec.cd%>
<%= prooftype_listRec.cdnm%>
<%= membercategorycode_listRec.cd%>
<%= membercategorycode_listRec.cdnm%>
<%= donatorcategory_listRec.cd%>
<%= donatorcategory_listRec.cdnm%>
<%= receiptcategory_listRec.cd%>
<%= receiptcategory_listRec.cdnm%>
<%= paymethod_listRec.cd%>
<%= paymethod_listRec.cdnm%>
<%= partitiontype_listRec.cd%>
<%= partitiontype_listRec.cdnm%>
<%= useoriginal_listRec.cd%>
<%= useoriginal_listRec.cdnm%>
<%= moblcmpy_listRec.cd%>
<%= moblcmpy_listRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 13 13:59:19 KST 2016 */