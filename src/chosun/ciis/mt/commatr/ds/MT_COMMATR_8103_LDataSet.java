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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_8103_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_8103_LDataSet(){}
	public MT_COMMATR_8103_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_8103_LCURLISTRecord rec = new MT_COMMATR_8103_LCURLISTRecord();
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.bccgcnt_0 = Util.checkString(rset0.getString("bccgcnt_0"));
			rec.bccgwgt_0 = Util.checkString(rset0.getString("bccgwgt_0"));
			rec.bccgwgt1_0 = Util.checkString(rset0.getString("bccgwgt1_0"));
			rec.bccgamt_0 = Util.checkString(rset0.getString("bccgamt_0"));
			rec.bccgcnt_1 = Util.checkString(rset0.getString("bccgcnt_1"));
			rec.bccgwgt_1 = Util.checkString(rset0.getString("bccgwgt_1"));
			rec.bccgwgt1_1 = Util.checkString(rset0.getString("bccgwgt1_1"));
			rec.bccgamt_1 = Util.checkString(rset0.getString("bccgamt_1"));
			rec.bccgcnt_3 = Util.checkString(rset0.getString("bccgcnt_3"));
			rec.bccgwgt_3 = Util.checkString(rset0.getString("bccgwgt_3"));
			rec.bccgwgt1_3 = Util.checkString(rset0.getString("bccgwgt1_3"));
			rec.bccgamt_3 = Util.checkString(rset0.getString("bccgamt_3"));
			rec.bccgcnt_4 = Util.checkString(rset0.getString("bccgcnt_4"));
			rec.bccgwgt_4 = Util.checkString(rset0.getString("bccgwgt_4"));
			rec.bccgwgt1_4 = Util.checkString(rset0.getString("bccgwgt1_4"));
			rec.bccgamt_4 = Util.checkString(rset0.getString("bccgamt_4"));
			rec.bccgwgt = Util.checkString(rset0.getString("bccgwgt"));
			rec.bccgamt = Util.checkString(rset0.getString("bccgamt"));
			rec.bccgvat = Util.checkString(rset0.getString("bccgvat"));
			rec.bccgtot = Util.checkString(rset0.getString("bccgtot"));
			this.curlist.add(rec);
		}
		
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_COMMATR_8103_LCURLIST2Record rec = new MT_COMMATR_8103_LCURLIST2Record();
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.titl = Util.checkString(rset1.getString("titl"));
			rec.reso_amt = Util.checkString(rset1.getString("reso_amt"));
			rec.adpay_amt = Util.checkString(rset1.getString("adpay_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_8103_LDataSet ds = (MT_COMMATR_8103_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_8103_LCURLISTRecord curlistRec = (MT_COMMATR_8103_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.bccgcnt_0%>
<%= curlistRec.bccgwgt_0%>
<%= curlistRec.bccgamt_0%>
<%= curlistRec.bccgcnt_1%>
<%= curlistRec.bccgwgt_1%>
<%= curlistRec.bccgamt_1%>
<%= curlistRec.bccgwgt%>
<%= curlistRec.bccgamt%>
<%= curlistRec.bccgvat%>
<%= curlistRec.bccgtot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 22 14:44:28 KST 2013 */