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


public class TN_LNK_6087_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totcnt;
	public long totamt;
	public long totfee;

	public TN_LNK_6087_ADataSet(){}
	public TN_LNK_6087_ADataSet(String errcode, String errmsg, long totcnt, long totamt, long totfee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totcnt = totcnt;
		this.totamt = totamt;
		this.totfee = totfee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotcnt(long totcnt){
		this.totcnt = totcnt;
	}

	public void setTotamt(long totamt){
		this.totamt = totamt;
	}

	public void setTotfee(long totfee){
		this.totfee = totfee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotcnt(){
		return this.totcnt;
	}

	public long getTotamt(){
		return this.totamt;
	}

	public long getTotfee(){
		return this.totfee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totcnt = cstmt.getLong(4);
		this.totamt = cstmt.getLong(5);
		this.totfee = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			TN_LNK_6087_ACURLISTRecord rec = new TN_LNK_6087_ACURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.data_clsf = Util.checkString(rset0.getString("data_clsf"));
			rec.pymt_cd = Util.checkString(rset0.getString("pymt_cd"));
			rec.promisecode = Util.checkString(rset0.getString("promisecode"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.memb_nm = Util.checkString(rset0.getString("memb_nm"));
			rec.acptno = Util.checkString(rset0.getString("acptno"));
			rec.reqprice = Util.checkString(rset0.getString("reqprice"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.paytype = Util.checkString(rset0.getString("paytype"));
			rec.fmsseq = Util.checkString(rset0.getString("fmsseq"));
			rec.result = Util.checkString(rset0.getString("result"));
			rec.resultcode = Util.checkString(rset0.getString("resultcode"));
			rec.resultmsg = Util.checkString(rset0.getString("resultmsg"));
			rec.file_data = Util.checkString(rset0.getString("file_data"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.promiseidx = Util.checkString(rset0.getString("promiseidx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6087_ADataSet ds = (TN_LNK_6087_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_6087_ACURLISTRecord curlistRec = (TN_LNK_6087_ACURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotcnt()%>
<%= ds.getTotamt()%>
<%= ds.getTotfee()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.seq%>
<%= curlistRec.data_clsf%>
<%= curlistRec.pymt_cd%>
<%= curlistRec.promisecode%>
<%= curlistRec.memb_cd%>
<%= curlistRec.memb_nm%>
<%= curlistRec.acptno%>
<%= curlistRec.reqprice%>
<%= curlistRec.paydate%>
<%= curlistRec.payprice%>
<%= curlistRec.paytype%>
<%= curlistRec.fmsseq%>
<%= curlistRec.result%>
<%= curlistRec.resultcode%>
<%= curlistRec.resultmsg%>
<%= curlistRec.file_data%>
<%= curlistRec.memberidx%>
<%= curlistRec.promiseidx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 19 13:48:30 KST 2017 */