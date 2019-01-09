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


public class TN_RPT_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1510_LDataSet(){}
	public TN_RPT_1510_LDataSet(String errcode, String errmsg){
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
			TN_RPT_1510_LCURLIST1Record rec = new TN_RPT_1510_LCURLIST1Record();
			rec.his_memberidx = Util.checkString(rset0.getString("his_memberidx"));
			rec.his_membertype = Util.checkString(rset0.getString("his_membertype"));
			rec.his_membercategorycode = Util.checkString(rset0.getString("his_membercategorycode"));
			rec.his_name = Util.checkString(rset0.getString("his_name"));
			rec.his_isanonymous = Util.checkString(rset0.getString("his_isanonymous"));
			rec.his_memo = Util.checkString(rset0.getString("his_memo"));
			rec.his_promiseconfirmno = Util.checkString(rset0.getString("his_promiseconfirmno"));
			rec.his_chgdt = Util.checkString(rset0.getString("his_chgdt"));
			rec.his_memberidxinfo = Util.checkString(rset0.getString("his_memberidxinfo"));
			rec.his_isforeigner = Util.checkString(rset0.getString("his_isforeigner"));
			rec.his_regno = Util.checkString(rset0.getString("his_regno"));
			rec.his_unknownregno = Util.checkString(rset0.getString("his_unknownregno"));
			rec.his_birthdayorigin = Util.checkString(rset0.getString("his_birthdayorigin"));
			rec.his_birthdaytype = Util.checkString(rset0.getString("his_birthdaytype"));
			rec.his_birthday = Util.checkString(rset0.getString("his_birthday"));
			rec.his_businessno = Util.checkString(rset0.getString("his_businessno"));
			rec.his_president = Util.checkString(rset0.getString("his_president"));
			rec.his_partycode = Util.checkString(rset0.getString("his_partycode"));
			rec.his_memberidxaddr = Util.checkString(rset0.getString("his_memberidxaddr"));
			rec.his_useaddress = Util.checkString(rset0.getString("his_useaddress"));
			rec.his_addressname = Util.checkString(rset0.getString("his_addressname"));
			rec.his_dept = Util.checkString(rset0.getString("his_dept"));
			rec.his_title = Util.checkString(rset0.getString("his_title"));
			rec.his_phone1 = Util.checkString(rset0.getString("his_phone1"));
			rec.his_cellphone = Util.checkString(rset0.getString("his_cellphone"));
			rec.his_fax = Util.checkString(rset0.getString("his_fax"));
			rec.his_email = Util.checkString(rset0.getString("his_email"));
			rec.his_zipcode1 = Util.checkString(rset0.getString("his_zipcode1"));
			rec.his_address1 = Util.checkString(rset0.getString("his_address1"));
			rec.his_addressdetail1 = Util.checkString(rset0.getString("his_addressdetail1"));
			rec.his_zipcode2 = Util.checkString(rset0.getString("his_zipcode2"));
			rec.his_address2 = Util.checkString(rset0.getString("his_address2"));
			rec.his_addressdetail2 = Util.checkString(rset0.getString("his_addressdetail2"));
			rec.his_postaddress = Util.checkString(rset0.getString("his_postaddress"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			TN_RPT_1510_LCURLIST2Record rec = new TN_RPT_1510_LCURLIST2Record();
			rec.memberidx = Util.checkString(rset1.getString("memberidx"));
			rec.membertype = Util.checkString(rset1.getString("membertype"));
			rec.membercategorycode = Util.checkString(rset1.getString("membercategorycode"));
			rec.name = Util.checkString(rset1.getString("name"));
			rec.isanonymous = Util.checkString(rset1.getString("isanonymous"));
			rec.memo = Util.checkString(rset1.getString("memo"));
			rec.promiseconfirmno = Util.checkString(rset1.getString("promiseconfirmno"));
			rec.chgdt = Util.checkString(rset1.getString("chgdt"));
			rec.memberidxinfo = Util.checkString(rset1.getString("memberidxinfo"));
			rec.isforeigner = Util.checkString(rset1.getString("isforeigner"));
			rec.regno = Util.checkString(rset1.getString("regno"));
			rec.unknownregno = Util.checkString(rset1.getString("unknownregno"));
			rec.birthdayorigin = Util.checkString(rset1.getString("birthdayorigin"));
			rec.birthdaytype = Util.checkString(rset1.getString("birthdaytype"));
			rec.birthday = Util.checkString(rset1.getString("birthday"));
			rec.businessno = Util.checkString(rset1.getString("businessno"));
			rec.president = Util.checkString(rset1.getString("president"));
			rec.partycode = Util.checkString(rset1.getString("partycode"));
			rec.memberidxaddr = Util.checkString(rset1.getString("memberidxaddr"));
			rec.useaddress = Util.checkString(rset1.getString("useaddress"));
			rec.addressname = Util.checkString(rset1.getString("addressname"));
			rec.dept = Util.checkString(rset1.getString("dept"));
			rec.title = Util.checkString(rset1.getString("title"));
			rec.phone1 = Util.checkString(rset1.getString("phone1"));
			rec.cellphone = Util.checkString(rset1.getString("cellphone"));
			rec.fax = Util.checkString(rset1.getString("fax"));
			rec.email = Util.checkString(rset1.getString("email"));
			rec.zipcode1 = Util.checkString(rset1.getString("zipcode1"));
			rec.address1 = Util.checkString(rset1.getString("address1"));
			rec.addressdetail1 = Util.checkString(rset1.getString("addressdetail1"));
			rec.zipcode2 = Util.checkString(rset1.getString("zipcode2"));
			rec.address2 = Util.checkString(rset1.getString("address2"));
			rec.addressdetail2 = Util.checkString(rset1.getString("addressdetail2"));
			rec.postaddress = Util.checkString(rset1.getString("postaddress"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1510_LDataSet ds = (TN_RPT_1510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_RPT_1510_LCURLIST1Record curlist1Rec = (TN_RPT_1510_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_RPT_1510_LCURLIST2Record curlist2Rec = (TN_RPT_1510_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.his_membertype%>
<%= curlist1Rec.his_membercategorycode%>
<%= curlist1Rec.his_name%>
<%= curlist1Rec.his_isanonymous%>
<%= curlist1Rec.his_memo%>
<%= curlist1Rec.his_promiseconfirmno%>
<%= curlist1Rec.his_chgdt%>
<%= curlist1Rec.his_memberidxinfo%>
<%= curlist1Rec.his_isforeigner%>
<%= curlist1Rec.his_regno%>
<%= curlist1Rec.his_unknownregno%>
<%= curlist1Rec.his_birthdayorigin%>
<%= curlist1Rec.his_birthdaytype%>
<%= curlist1Rec.his_birthday%>
<%= curlist1Rec.his_businessno%>
<%= curlist1Rec.his_president%>
<%= curlist1Rec.his_partycode%>
<%= curlist1Rec.his_memberidxaddr%>
<%= curlist1Rec.his_useaddress%>
<%= curlist1Rec.his_addressname%>
<%= curlist1Rec.his_dept%>
<%= curlist1Rec.his_title%>
<%= curlist1Rec.his_phone1%>
<%= curlist1Rec.his_cellphone%>
<%= curlist1Rec.his_fax%>
<%= curlist1Rec.his_email%>
<%= curlist1Rec.his_zipcode1%>
<%= curlist1Rec.his_address1%>
<%= curlist1Rec.his_addressdetail1%>
<%= curlist1Rec.his_zipcode2%>
<%= curlist1Rec.his_address2%>
<%= curlist1Rec.his_addressdetail2%>
<%= curlist1Rec.his_postaddress%>
<%= curlist2Rec.memberidx%>
<%= curlist2Rec.membertype%>
<%= curlist2Rec.membercategorycode%>
<%= curlist2Rec.name%>
<%= curlist2Rec.isanonymous%>
<%= curlist2Rec.memo%>
<%= curlist2Rec.promiseconfirmno%>
<%= curlist2Rec.chgdt%>
<%= curlist2Rec.memberidxinfo%>
<%= curlist2Rec.isforeigner%>
<%= curlist2Rec.regno%>
<%= curlist2Rec.unknownregno%>
<%= curlist2Rec.birthdayorigin%>
<%= curlist2Rec.birthdaytype%>
<%= curlist2Rec.birthday%>
<%= curlist2Rec.businessno%>
<%= curlist2Rec.president%>
<%= curlist2Rec.partycode%>
<%= curlist2Rec.memberidxaddr%>
<%= curlist2Rec.useaddress%>
<%= curlist2Rec.addressname%>
<%= curlist2Rec.dept%>
<%= curlist2Rec.title%>
<%= curlist2Rec.phone1%>
<%= curlist2Rec.cellphone%>
<%= curlist2Rec.fax%>
<%= curlist2Rec.email%>
<%= curlist2Rec.zipcode1%>
<%= curlist2Rec.address1%>
<%= curlist2Rec.addressdetail1%>
<%= curlist2Rec.zipcode2%>
<%= curlist2Rec.address2%>
<%= curlist2Rec.addressdetail2%>
<%= curlist2Rec.postaddress%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 10 15:56:00 KST 2016 */