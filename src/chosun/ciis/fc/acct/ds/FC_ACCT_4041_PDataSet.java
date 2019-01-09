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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_4041_PDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_4041_PDataSet(){}
	public FC_ACCT_4041_PDataSet(String errcode, String errmsg){
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
			FC_ACCT_4041_PCURLISTRecord rec = new FC_ACCT_4041_PCURLISTRecord();
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.compcd = Util.checkString(rset0.getString("compcd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.jpcd = Util.checkString(rset0.getString("jpcd"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.occr_acct_cd = Util.checkString(rset0.getString("occr_acct_cd"));
			rec.occr_acct_nm = Util.checkString(rset0.getString("occr_acct_nm"));
			rec.extnc_acct_cd = Util.checkString(rset0.getString("extnc_acct_cd"));
			rec.extnc_acct_nm = Util.checkString(rset0.getString("extnc_acct_nm"));
			rec.sjamt = Util.checkString(rset0.getString("sjamt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			FC_ACCT_4041_PCURLIST2Record rec = new FC_ACCT_4041_PCURLIST2Record();
			rec.seq_1 = Util.checkString(rset1.getString("seq_1"));
			rec.compnm_1 = Util.checkString(rset1.getString("compnm_1"));
			rec.amt1_1 = Util.checkString(rset1.getString("amt1_1"));
			rec.amt2_1 = Util.checkString(rset1.getString("amt2_1"));
			rec.amt3_1 = Util.checkString(rset1.getString("amt3_1"));
			rec.seq_2 = Util.checkString(rset1.getString("seq_2"));
			rec.compnm_2 = Util.checkString(rset1.getString("compnm_2"));
			rec.amt1_2 = Util.checkString(rset1.getString("amt1_2"));
			rec.amt2_2 = Util.checkString(rset1.getString("amt2_2"));
			rec.amt3_2 = Util.checkString(rset1.getString("amt3_2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_4041_PDataSet ds = (FC_ACCT_4041_PDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_4041_PCURLISTRecord curlistRec = (FC_ACCT_4041_PCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_4041_PCURLIST2Record curlist2Rec = (FC_ACCT_4041_PCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fisc_dt%>
<%= curlistRec.compcd%>
<%= curlistRec.compnm%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.jpcd%>
<%= curlistRec.occr_amt%>
<%= curlistRec.occr_acct_cd%>
<%= curlistRec.occr_acct_nm%>
<%= curlistRec.extnc_acct_cd%>
<%= curlistRec.extnc_acct_nm%>
<%= curlistRec.sjamt%>
<%= curlist2Rec.seq_1%>
<%= curlist2Rec.compnm_1%>
<%= curlist2Rec.amt1_1%>
<%= curlist2Rec.amt2_1%>
<%= curlist2Rec.amt3_1%>
<%= curlist2Rec.seq_2%>
<%= curlist2Rec.compnm_2%>
<%= curlist2Rec.amt1_2%>
<%= curlist2Rec.amt2_2%>
<%= curlist2Rec.amt3_2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 06 18:08:40 KST 2009 */