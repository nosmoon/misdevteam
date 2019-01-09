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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_7002_LDataSet(){}
	public HD_INFO_7002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_INFO_7002_LCURLISTRecord rec = new HD_INFO_7002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.frlc_no = Util.checkString(rset0.getString("frlc_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.chrg_posk_cd = Util.checkString(rset0.getString("chrg_posk_cd"));
			rec.thrw_pgm = Util.checkString(rset0.getString("thrw_pgm"));
			rec.pay_cycl = Util.checkString(rset0.getString("pay_cycl"));
			rec.servcost = Util.checkString(rset0.getString("servcost"));
			rec.serv_pay_cond = Util.checkString(rset0.getString("serv_pay_cond"));
			rec.fst_cntr_dt = Util.checkString(rset0.getString("fst_cntr_dt"));
			rec.last_cntr_dt = Util.checkString(rset0.getString("last_cntr_dt"));
			rec.cntr_expr_dt = Util.checkString(rset0.getString("cntr_expr_dt"));
			rec.draft_no = Util.checkString(rset0.getString("draft_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.medi_cd2 = Util.checkString(rset0.getString("medi_cd2"));
			rec.thrw_pgm2 = Util.checkString(rset0.getString("thrw_pgm2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_7002_LDataSet ds = (HD_INFO_7002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_7002_LCURLISTRecord curlistRec = (HD_INFO_7002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.frlc_no%>
<%= curlistRec.flnm%>
<%= curlistRec.prn%>
<%= curlistRec.tel_no%>
<%= curlistRec.addr%>
<%= curlistRec.chrg_posk_cd%>
<%= curlistRec.thrw_pgm%>
<%= curlistRec.pay_cycl%>
<%= curlistRec.servcost%>
<%= curlistRec.serv_pay_cond%>
<%= curlistRec.fst_cntr_dt%>
<%= curlistRec.last_cntr_dt%>
<%= curlistRec.cntr_expr_dt%>
<%= curlistRec.draft_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.acct_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.medi_cd2%>
<%= curlistRec.thrw_pgm2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 13 17:50:51 KST 2012 */