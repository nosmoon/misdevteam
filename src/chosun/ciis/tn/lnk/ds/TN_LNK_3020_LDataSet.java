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


public class TN_LNK_3020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totcount;
	public long totprice;
	public long okcount;
	public long okprice;
	public long errorcount;
	public long errorprice;
	public long fee;

	public TN_LNK_3020_LDataSet(){}
	public TN_LNK_3020_LDataSet(String errcode, String errmsg, long totcount, long totprice, long okcount, long okprice, long errorcount, long errorprice, long fee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totcount = totcount;
		this.totprice = totprice;
		this.okcount = okcount;
		this.okprice = okprice;
		this.errorcount = errorcount;
		this.errorprice = errorprice;
		this.fee = fee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotcount(long totcount){
		this.totcount = totcount;
	}

	public void setTotprice(long totprice){
		this.totprice = totprice;
	}

	public void setOkcount(long okcount){
		this.okcount = okcount;
	}

	public void setOkprice(long okprice){
		this.okprice = okprice;
	}

	public void setErrorcount(long errorcount){
		this.errorcount = errorcount;
	}

	public void setErrorprice(long errorprice){
		this.errorprice = errorprice;
	}

	public void setFee(long fee){
		this.fee = fee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotcount(){
		return this.totcount;
	}

	public long getTotprice(){
		return this.totprice;
	}

	public long getOkcount(){
		return this.okcount;
	}

	public long getOkprice(){
		return this.okprice;
	}

	public long getErrorcount(){
		return this.errorcount;
	}

	public long getErrorprice(){
		return this.errorprice;
	}

	public long getFee(){
		return this.fee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totcount = cstmt.getLong(12);
		this.totprice = cstmt.getLong(13);
		this.okcount = cstmt.getLong(14);
		this.okprice = cstmt.getLong(15);
		this.errorcount = cstmt.getLong(16);
		this.errorprice = cstmt.getLong(17);
		this.fee = cstmt.getLong(18);
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			TN_LNK_3020_LCURLISTRecord rec = new TN_LNK_3020_LCURLISTRecord();
			rec.pymtmm = Util.checkString(rset0.getString("pymtmm"));
			rec.pymtdd = Util.checkString(rset0.getString("pymtdd"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.memb_nm = Util.checkString(rset0.getString("memb_nm"));
			rec.pymt_cd = Util.checkString(rset0.getString("pymt_cd"));
			rec.bankaccountowner = Util.checkString(rset0.getString("bankaccountowner"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.bankaccount = Util.checkString(rset0.getString("bankaccount"));
			rec.support = Util.checkString(rset0.getString("support"));
			rec.isdelete = Util.checkString(rset0.getString("isdelete"));
			rec.scheduleprice = rset0.getInt("scheduleprice");
			rec.payprice = rset0.getInt("payprice");
			rec.result_stat = Util.checkString(rset0.getString("result_stat"));
			rec.paymentcode = Util.checkString(rset0.getString("paymentcode"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			rec.cmspaymentidx = Util.checkString(rset0.getString("cmspaymentidx"));
			rec.paymentidx = Util.checkString(rset0.getString("paymentidx"));
			rec.cmsidx = Util.checkString(rset0.getString("cmsidx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_3020_LDataSet ds = (TN_LNK_3020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_3020_LCURLISTRecord curlistRec = (TN_LNK_3020_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotcount()%>
<%= ds.getTotprice()%>
<%= ds.getOkcount()%>
<%= ds.getOkprice()%>
<%= ds.getErrorcount()%>
<%= ds.getErrorprice()%>
<%= ds.getFee()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pymtmm%>
<%= curlistRec.pymtdd%>
<%= curlistRec.memb_cd%>
<%= curlistRec.memb_nm%>
<%= curlistRec.pymt_cd%>
<%= curlistRec.bankaccountowner%>
<%= curlistRec.banknm%>
<%= curlistRec.bankaccount%>
<%= curlistRec.support%>
<%= curlistRec.isdelete%>
<%= curlistRec.scheduleprice%>
<%= curlistRec.payprice%>
<%= curlistRec.result_stat%>
<%= curlistRec.paymentcode%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
<%= curlistRec.cmspaymentidx%>
<%= curlistRec.paymentidx%>
<%= curlistRec.cmsidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 19 11:34:02 KST 2016 */