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


public class TN_LNK_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String memb_cnt;
	public String prms_cnt;
	public String pmnt_cnt;
	public String memb_0_cnt;
	public String memb_1_cnt;
	public String memb_3_cnt;
	public String prms_0_cnt;
	public String prms_1_cnt;
	public String prms_3_cnt;
	public String pmnt_0_cnt;
	public String pmnt_1_cnt;
	public String pmnt_3_cnt;

	public TN_LNK_1010_LDataSet(){}
	public TN_LNK_1010_LDataSet(String errcode, String errmsg, String memb_cnt, String prms_cnt, String pmnt_cnt, String memb_0_cnt, String memb_1_cnt, String memb_3_cnt, String prms_0_cnt, String prms_1_cnt, String prms_3_cnt, String pmnt_0_cnt, String pmnt_1_cnt, String pmnt_3_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.memb_cnt = memb_cnt;
		this.prms_cnt = prms_cnt;
		this.pmnt_cnt = pmnt_cnt;
		this.memb_0_cnt = memb_0_cnt;
		this.memb_1_cnt = memb_1_cnt;
		this.memb_3_cnt = memb_3_cnt;
		this.prms_0_cnt = prms_0_cnt;
		this.prms_1_cnt = prms_1_cnt;
		this.prms_3_cnt = prms_3_cnt;
		this.pmnt_0_cnt = pmnt_0_cnt;
		this.pmnt_1_cnt = pmnt_1_cnt;
		this.pmnt_3_cnt = pmnt_3_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMemb_cnt(String memb_cnt){
		this.memb_cnt = memb_cnt;
	}

	public void setPrms_cnt(String prms_cnt){
		this.prms_cnt = prms_cnt;
	}

	public void setPmnt_cnt(String pmnt_cnt){
		this.pmnt_cnt = pmnt_cnt;
	}

	public void setMemb_0_cnt(String memb_0_cnt){
		this.memb_0_cnt = memb_0_cnt;
	}

	public void setMemb_1_cnt(String memb_1_cnt){
		this.memb_1_cnt = memb_1_cnt;
	}

	public void setMemb_3_cnt(String memb_3_cnt){
		this.memb_3_cnt = memb_3_cnt;
	}

	public void setPrms_0_cnt(String prms_0_cnt){
		this.prms_0_cnt = prms_0_cnt;
	}

	public void setPrms_1_cnt(String prms_1_cnt){
		this.prms_1_cnt = prms_1_cnt;
	}

	public void setPrms_3_cnt(String prms_3_cnt){
		this.prms_3_cnt = prms_3_cnt;
	}

	public void setPmnt_0_cnt(String pmnt_0_cnt){
		this.pmnt_0_cnt = pmnt_0_cnt;
	}

	public void setPmnt_1_cnt(String pmnt_1_cnt){
		this.pmnt_1_cnt = pmnt_1_cnt;
	}

	public void setPmnt_3_cnt(String pmnt_3_cnt){
		this.pmnt_3_cnt = pmnt_3_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMemb_cnt(){
		return this.memb_cnt;
	}

	public String getPrms_cnt(){
		return this.prms_cnt;
	}

	public String getPmnt_cnt(){
		return this.pmnt_cnt;
	}

	public String getMemb_0_cnt(){
		return this.memb_0_cnt;
	}

	public String getMemb_1_cnt(){
		return this.memb_1_cnt;
	}

	public String getMemb_3_cnt(){
		return this.memb_3_cnt;
	}

	public String getPrms_0_cnt(){
		return this.prms_0_cnt;
	}

	public String getPrms_1_cnt(){
		return this.prms_1_cnt;
	}

	public String getPrms_3_cnt(){
		return this.prms_3_cnt;
	}

	public String getPmnt_0_cnt(){
		return this.pmnt_0_cnt;
	}

	public String getPmnt_1_cnt(){
		return this.pmnt_1_cnt;
	}

	public String getPmnt_3_cnt(){
		return this.pmnt_3_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.memb_cnt = Util.checkString(cstmt.getString(9));
		this.prms_cnt = Util.checkString(cstmt.getString(10));
		this.pmnt_cnt = Util.checkString(cstmt.getString(11));
		this.memb_0_cnt = Util.checkString(cstmt.getString(12));
		this.memb_1_cnt = Util.checkString(cstmt.getString(13));
		this.memb_3_cnt = Util.checkString(cstmt.getString(14));
		this.prms_0_cnt = Util.checkString(cstmt.getString(15));
		this.prms_1_cnt = Util.checkString(cstmt.getString(16));
		this.prms_3_cnt = Util.checkString(cstmt.getString(17));
		this.pmnt_0_cnt = Util.checkString(cstmt.getString(18));
		this.pmnt_1_cnt = Util.checkString(cstmt.getString(19));
		this.pmnt_3_cnt = Util.checkString(cstmt.getString(20));
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			TN_LNK_1010_LCURLISTRecord rec = new TN_LNK_1010_LCURLISTRecord();
			rec.onl_memb_idx = Util.checkString(rset0.getString("onl_memb_idx"));
			rec.onl_memb_cd = Util.checkString(rset0.getString("onl_memb_cd"));
			rec.onl_prms_idx = Util.checkString(rset0.getString("onl_prms_idx"));
			rec.onl_prms_cd = Util.checkString(rset0.getString("onl_prms_cd"));
			rec.onl_pmnt_idx = Util.checkString(rset0.getString("onl_pmnt_idx"));
			rec.onl_pmnt_cd = Util.checkString(rset0.getString("onl_pmnt_cd"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.req_dt = Util.checkString(rset0.getString("req_dt"));
			rec.regi_dt = Util.checkString(rset0.getString("regi_dt"));
			rec.fund_nm = Util.checkString(rset0.getString("fund_nm"));
			rec.pmnt_clsf_cd = Util.checkString(rset0.getString("pmnt_clsf_cd"));
			rec.prms_amt = Util.checkString(rset0.getString("prms_amt"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.memb_cd = Util.checkString(rset0.getString("memb_cd"));
			rec.prms_cd = Util.checkString(rset0.getString("prms_cd"));
			rec.pmnt_cd = Util.checkString(rset0.getString("pmnt_cd"));
			rec.memb_idx = Util.checkString(rset0.getString("memb_idx"));
			rec.prms_idx = Util.checkString(rset0.getString("prms_idx"));
			rec.pmnt_idx = Util.checkString(rset0.getString("pmnt_idx"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1010_LDataSet ds = (TN_LNK_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_1010_LCURLISTRecord curlistRec = (TN_LNK_1010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMemb_cnt()%>
<%= ds.getPrms_cnt()%>
<%= ds.getPmnt_cnt()%>
<%= ds.getMemb_0_cnt()%>
<%= ds.getMemb_1_cnt()%>
<%= ds.getMemb_3_cnt()%>
<%= ds.getPrms_0_cnt()%>
<%= ds.getPrms_1_cnt()%>
<%= ds.getPrms_3_cnt()%>
<%= ds.getPmnt_0_cnt()%>
<%= ds.getPmnt_1_cnt()%>
<%= ds.getPmnt_3_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.onl_memb_idx%>
<%= curlistRec.onl_memb_cd%>
<%= curlistRec.onl_prms_idx%>
<%= curlistRec.onl_prms_cd%>
<%= curlistRec.onl_pmnt_idx%>
<%= curlistRec.onl_pmnt_cd%>
<%= curlistRec.name%>
<%= curlistRec.tel_no%>
<%= curlistRec.req_dt%>
<%= curlistRec.regi_dt%>
<%= curlistRec.fund_nm%>
<%= curlistRec.pmnt_clsf_cd%>
<%= curlistRec.prms_amt%>
<%= curlistRec.pay_amt%>
<%= curlistRec.status%>
<%= curlistRec.memb_cd%>
<%= curlistRec.prms_cd%>
<%= curlistRec.pmnt_cd%>
<%= curlistRec.memb_idx%>
<%= curlistRec.prms_idx%>
<%= curlistRec.pmnt_idx%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 28 19:18:03 KST 2016 */