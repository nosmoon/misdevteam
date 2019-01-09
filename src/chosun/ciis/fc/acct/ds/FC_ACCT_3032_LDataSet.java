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


public class FC_ACCT_3032_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curinsrfeelist = new ArrayList();
	public ArrayList curtotallist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_3032_LDataSet(){}
	public FC_ACCT_3032_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			FC_ACCT_3032_LCURINSRFEELISTRecord rec = new FC_ACCT_3032_LCURINSRFEELISTRecord();
			rec.x = Util.checkString(rset2.getString("x"));
			rec.pch_shggbnm = Util.checkString(rset2.getString("pch_shggbnm"));
			rec.pch_gwgbnm = Util.checkString(rset2.getString("pch_gwgbnm"));
			rec.mang_no = Util.checkString(rset2.getString("mang_no"));
			rec.insr_nm = Util.checkString(rset2.getString("insr_nm"));
			rec.mang_no2 = Util.checkString(rset2.getString("mang_no2"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.won_amt = Util.checkString(rset2.getString("won_amt"));
			rec.dds = Util.checkString(rset2.getString("dds"));
			rec.pch_totilsu = Util.checkString(rset2.getString("pch_totilsu"));
			rec.prvmm_bal = Util.checkString(rset2.getString("prvmm_bal"));
			rec.thmm_dr = Util.checkString(rset2.getString("thmm_dr"));
			rec.thmm_crdt = Util.checkString(rset2.getString("thmm_crdt"));
			rec.thmm_bal = Util.checkString(rset2.getString("thmm_bal"));
			rec.mang_clsf_cd = Util.checkString(rset2.getString("mang_clsf_cd"));
			this.curinsrfeelist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			FC_ACCT_3032_LCURTOTALLISTRecord rec = new FC_ACCT_3032_LCURTOTALLISTRecord();
			rec.tot_prvmm_bal = Util.checkString(rset3.getString("tot_prvmm_bal"));
			rec.tot_thmm_dr = Util.checkString(rset3.getString("tot_thmm_dr"));
			rec.tot_thmm_crdt = Util.checkString(rset3.getString("tot_thmm_crdt"));
			rec.tot_thmm_bal = Util.checkString(rset3.getString("tot_thmm_bal"));
			this.curtotallist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_3032_LDataSet ds = (FC_ACCT_3032_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curinsrfeelist.size(); i++){
		FC_ACCT_3032_LCURINSRFEELISTRecord curinsrfeelistRec = (FC_ACCT_3032_LCURINSRFEELISTRecord)ds.curinsrfeelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curtotallist.size(); i++){
		FC_ACCT_3032_LCURTOTALLISTRecord curtotallistRec = (FC_ACCT_3032_LCURTOTALLISTRecord)ds.curtotallist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurinsrfeelist()%>
<%= ds.getCurtotallist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curinsrfeelistRec.x%>
<%= curinsrfeelistRec.pch_shggbnm%>
<%= curinsrfeelistRec.pch_gwgbnm%>
<%= curinsrfeelistRec.mang_no%>
<%= curinsrfeelistRec.insr_nm%>
<%= curinsrfeelistRec.mang_no2%>
<%= curinsrfeelistRec.mtry_dt%>
<%= curinsrfeelistRec.won_amt%>
<%= curinsrfeelistRec.dds%>
<%= curinsrfeelistRec.pch_totilsu%>
<%= curinsrfeelistRec.prvmm_bal%>
<%= curinsrfeelistRec.thmm_dr%>
<%= curinsrfeelistRec.thmm_crdt%>
<%= curinsrfeelistRec.thmm_bal%>
<%= curinsrfeelistRec.mang_clsf_cd%>
<%= curtotallistRec.tot_prvmm_bal%>
<%= curtotallistRec.tot_thmm_dr%>
<%= curtotallistRec.tot_thmm_crdt%>
<%= curtotallistRec.tot_thmm_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 10:37:49 KST 2009 */