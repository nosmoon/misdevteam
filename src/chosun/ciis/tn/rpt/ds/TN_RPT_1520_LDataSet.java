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


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1520_LDataSet(){}
	public TN_RPT_1520_LDataSet(String errcode, String errmsg){
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
			TN_RPT_1520_LCURLIST1Record rec = new TN_RPT_1520_LCURLIST1Record();
			rec.his_memberidx = Util.checkString(rset0.getString("his_memberidx"));
			rec.his_promiseprice = Util.checkString(rset0.getString("his_promiseprice"));
			rec.his_useoriginal = Util.checkString(rset0.getString("his_useoriginal"));
			rec.his_paymethodcode = Util.checkString(rset0.getString("his_paymethodcode"));
			rec.his_bankaccountcode = Util.checkString(rset0.getString("his_bankaccountcode"));
			rec.his_partitiontype = Util.checkString(rset0.getString("his_partitiontype"));
			rec.his_paystartdate = Util.checkString(rset0.getString("his_paystartdate"));
			rec.his_payenddate = Util.checkString(rset0.getString("his_payenddate"));
			rec.his_partitioncount = Util.checkString(rset0.getString("his_partitioncount"));
			rec.his_monthlypayday = Util.checkString(rset0.getString("his_monthlypayday"));
			rec.his_monthlypayprice = Util.checkString(rset0.getString("his_monthlypayprice"));
			rec.his_excludenopay = Util.checkString(rset0.getString("his_excludenopay"));
			rec.his_paystopped = Util.checkString(rset0.getString("his_paystopped"));
			rec.his_contributormemo = Util.checkString(rset0.getString("his_contributormemo"));
			rec.his_promisememo = Util.checkString(rset0.getString("his_promisememo"));
			rec.his_fundtype = Util.checkString(rset0.getString("his_fundtype"));
			rec.his_fundidx = Util.checkString(rset0.getString("his_fundidx"));
			rec.his_supporttype = Util.checkString(rset0.getString("his_supporttype"));
			rec.his_supportidx = Util.checkString(rset0.getString("his_supportidx"));
			rec.his_purposememo = Util.checkString(rset0.getString("his_purposememo"));
			rec.his_itemname = Util.checkString(rset0.getString("his_itemname"));
			rec.his_itemqty = Util.checkString(rset0.getString("his_itemqty"));
			rec.his_itemprice = Util.checkString(rset0.getString("his_itemprice"));
			rec.his_itemremk = Util.checkString(rset0.getString("his_itemremk"));
			rec.his_stopdate = Util.checkString(rset0.getString("his_stopdate"));
			rec.his_stopresn = Util.checkString(rset0.getString("his_stopresn"));
			rec.his_bankcode = Util.checkString(rset0.getString("his_bankcode"));
			rec.his_bankaccount = Util.checkString(rset0.getString("his_bankaccount"));
			rec.his_bankaccountowner = Util.checkString(rset0.getString("his_bankaccountowner"));
			rec.his_bankowneridentity = Util.checkString(rset0.getString("his_bankowneridentity"));
			rec.his_bankownerclsf = Util.checkString(rset0.getString("his_bankownerclsf"));
			rec.his_cardcmpy = Util.checkString(rset0.getString("his_cardcmpy"));
			rec.his_cardnumber = Util.checkString(rset0.getString("his_cardnumber"));
			rec.his_cardyymm = Util.checkString(rset0.getString("his_cardyymm"));
			rec.his_mobiaprvname = Util.checkString(rset0.getString("his_mobiaprvname"));
			rec.his_mobiaprvcmpy = Util.checkString(rset0.getString("his_mobiaprvcmpy"));
			rec.his_mobiaprvnumber = Util.checkString(rset0.getString("his_mobiaprvnumber"));
			rec.his_mobiaprvprn = Util.checkString(rset0.getString("his_mobiaprvprn"));
			rec.his_cmsstopped = Util.checkString(rset0.getString("his_cmsstopped"));
			rec.his_cmsstopdate = Util.checkString(rset0.getString("his_cmsstopdate"));
			rec.his_cmsstatus = Util.checkString(rset0.getString("his_cmsstatus"));
			rec.his_cmsupdatedate = Util.checkString(rset0.getString("his_cmsupdatedate"));
			rec.his_cardidentity = Util.checkString(rset0.getString("his_cardidentity"));
			rec.his_cardowner = Util.checkString(rset0.getString("his_cardowner"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			TN_RPT_1520_LCURLIST2Record rec = new TN_RPT_1520_LCURLIST2Record();
			rec.memberidx = Util.checkString(rset1.getString("memberidx"));
			rec.promiseprice = Util.checkString(rset1.getString("promiseprice"));
			rec.useoriginal = Util.checkString(rset1.getString("useoriginal"));
			rec.paymethodcode = Util.checkString(rset1.getString("paymethodcode"));
			rec.bankaccountcode = Util.checkString(rset1.getString("bankaccountcode"));
			rec.partitiontype = Util.checkString(rset1.getString("partitiontype"));
			rec.paystartdate = Util.checkString(rset1.getString("paystartdate"));
			rec.payenddate = Util.checkString(rset1.getString("payenddate"));
			rec.partitioncount = Util.checkString(rset1.getString("partitioncount"));
			rec.monthlypayday = Util.checkString(rset1.getString("monthlypayday"));
			rec.monthlypayprice = Util.checkString(rset1.getString("monthlypayprice"));
			rec.excludenopay = Util.checkString(rset1.getString("excludenopay"));
			rec.paystopped = Util.checkString(rset1.getString("paystopped"));
			rec.contributormemo = Util.checkString(rset1.getString("contributormemo"));
			rec.promisememo = Util.checkString(rset1.getString("promisememo"));
			rec.fundtype = Util.checkString(rset1.getString("fundtype"));
			rec.fundidx = Util.checkString(rset1.getString("fundidx"));
			rec.supporttype = Util.checkString(rset1.getString("supporttype"));
			rec.supportidx = Util.checkString(rset1.getString("supportidx"));
			rec.purposememo = Util.checkString(rset1.getString("purposememo"));
			rec.itemname = Util.checkString(rset1.getString("itemname"));
			rec.itemqty = Util.checkString(rset1.getString("itemqty"));
			rec.itemprice = Util.checkString(rset1.getString("itemprice"));
			rec.itemremk = Util.checkString(rset1.getString("itemremk"));
			rec.stopdate = Util.checkString(rset1.getString("stopdate"));
			rec.stopresn = Util.checkString(rset1.getString("stopresn"));
			rec.bankcode = Util.checkString(rset1.getString("bankcode"));
			rec.bankaccount = Util.checkString(rset1.getString("bankaccount"));
			rec.bankaccountowner = Util.checkString(rset1.getString("bankaccountowner"));
			rec.bankowneridentity = Util.checkString(rset1.getString("bankowneridentity"));
			rec.bankownerclsf = Util.checkString(rset1.getString("bankownerclsf"));
			rec.cardcmpy = Util.checkString(rset1.getString("cardcmpy"));
			rec.cardnumber = Util.checkString(rset1.getString("cardnumber"));
			rec.cardyymm = Util.checkString(rset1.getString("cardyymm"));
			rec.mobiaprvname = Util.checkString(rset1.getString("mobiaprvname"));
			rec.mobiaprvcmpy = Util.checkString(rset1.getString("mobiaprvcmpy"));
			rec.mobiaprvnumber = Util.checkString(rset1.getString("mobiaprvnumber"));
			rec.mobiaprvprn = Util.checkString(rset1.getString("mobiaprvprn"));
			rec.cmsstopped = Util.checkString(rset1.getString("cmsstopped"));
			rec.cmsstopdate = Util.checkString(rset1.getString("cmsstopdate"));
			rec.cmsstatus = Util.checkString(rset1.getString("cmsstatus"));
			rec.cmsupdatedate = Util.checkString(rset1.getString("cmsupdatedate"));
			rec.cardidentity = Util.checkString(rset1.getString("cardidentity"));
			rec.cardowner = Util.checkString(rset1.getString("cardowner"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1520_LDataSet ds = (TN_RPT_1520_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_RPT_1520_LCURLIST1Record curlist1Rec = (TN_RPT_1520_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_RPT_1520_LCURLIST2Record curlist2Rec = (TN_RPT_1520_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.his_memberidx%>
<%= curlist1Rec.his_promiseprice%>
<%= curlist1Rec.his_useoriginal%>
<%= curlist1Rec.his_paymethodcode%>
<%= curlist1Rec.his_bankaccountcode%>
<%= curlist1Rec.his_partitiontype%>
<%= curlist1Rec.his_paystartdate%>
<%= curlist1Rec.his_payenddate%>
<%= curlist1Rec.his_partitioncount%>
<%= curlist1Rec.his_monthlypayday%>
<%= curlist1Rec.his_monthlypayprice%>
<%= curlist1Rec.his_excludenopay%>
<%= curlist1Rec.his_paystopped%>
<%= curlist1Rec.his_contributormemo%>
<%= curlist1Rec.his_promisememo%>
<%= curlist1Rec.his_fundtype%>
<%= curlist1Rec.his_fundidx%>
<%= curlist1Rec.his_supporttype%>
<%= curlist1Rec.his_supportidx%>
<%= curlist1Rec.his_purposememo%>
<%= curlist1Rec.his_itemname%>
<%= curlist1Rec.his_itemqty%>
<%= curlist1Rec.his_itemprice%>
<%= curlist1Rec.his_itemremk%>
<%= curlist1Rec.his_stopdate%>
<%= curlist1Rec.his_stopresn%>
<%= curlist1Rec.his_bankcode%>
<%= curlist1Rec.his_bankaccount%>
<%= curlist1Rec.his_bankaccountowner%>
<%= curlist1Rec.his_bankowneridentity%>
<%= curlist1Rec.his_bankownerclsf%>
<%= curlist1Rec.his_cardcmpy%>
<%= curlist1Rec.his_cardnumber%>
<%= curlist1Rec.his_cardyymm%>
<%= curlist1Rec.his_mobiaprvname%>
<%= curlist1Rec.his_mobiaprvcmpy%>
<%= curlist1Rec.his_mobiaprvnumber%>
<%= curlist1Rec.his_mobiaprvprn%>
<%= curlist1Rec.his_cmsstopped%>
<%= curlist1Rec.his_cmsstopdate%>
<%= curlist1Rec.his_cmsstatus%>
<%= curlist1Rec.his_cmsupdatedate%>
<%= curlist1Rec.his_cardidentity%>
<%= curlist1Rec.his_cardowner%>
<%= curlist2Rec.memberidx%>
<%= curlist2Rec.promiseprice%>
<%= curlist2Rec.useoriginal%>
<%= curlist2Rec.paymethodcode%>
<%= curlist2Rec.bankaccountcode%>
<%= curlist2Rec.partitiontype%>
<%= curlist2Rec.paystartdate%>
<%= curlist2Rec.payenddate%>
<%= curlist2Rec.partitioncount%>
<%= curlist2Rec.monthlypayday%>
<%= curlist2Rec.monthlypayprice%>
<%= curlist2Rec.excludenopay%>
<%= curlist2Rec.paystopped%>
<%= curlist2Rec.contributormemo%>
<%= curlist2Rec.promisememo%>
<%= curlist2Rec.fundtype%>
<%= curlist2Rec.fundidx%>
<%= curlist2Rec.supporttype%>
<%= curlist2Rec.supportidx%>
<%= curlist2Rec.purposememo%>
<%= curlist2Rec.itemname%>
<%= curlist2Rec.itemqty%>
<%= curlist2Rec.itemprice%>
<%= curlist2Rec.itemremk%>
<%= curlist2Rec.stopdate%>
<%= curlist2Rec.stopresn%>
<%= curlist2Rec.paymethodcode%>
<%= curlist2Rec.bankcode%>
<%= curlist2Rec.bankaccount%>
<%= curlist2Rec.bankaccountowner%>
<%= curlist2Rec.bankowneridentity%>
<%= curlist2Rec.bankownerclsf%>
<%= curlist2Rec.cardcmpy%>
<%= curlist2Rec.cardnumber%>
<%= curlist2Rec.cardyymm%>
<%= curlist2Rec.mobiaprvname%>
<%= curlist2Rec.mobiaprvcmpy%>
<%= curlist2Rec.mobiaprvnumber%>
<%= curlist2Rec.mobiaprvprn%>
<%= curlist2Rec.cmsstopped%>
<%= curlist2Rec.cmsstopdate%>
<%= curlist2Rec.cmsstatus%>
<%= curlist2Rec.cmsupdatedate%>
<%= curlist2Rec.cardidentity%>
<%= curlist2Rec.cardowner%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 10 16:08:51 KST 2016 */