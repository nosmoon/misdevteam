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


public class TN_RPT_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1101_LDataSet(){}
	public TN_RPT_1101_LDataSet(String errcode, String errmsg){
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
			TN_RPT_1101_LCURLISTRecord rec = new TN_RPT_1101_LCURLISTRecord();
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.bank_acct_no = Util.checkString(rset0.getString("bank_acct_no"));
			rec.bank_gb = Util.checkString(rset0.getString("bank_gb"));
			rec.mang_cd_3 = Util.checkString(rset0.getString("mang_cd_3"));
			rec.mang_cd_4 = Util.checkString(rset0.getString("mang_cd_4"));
			rec.mang_cd_5 = Util.checkString(rset0.getString("mang_cd_5"));
			rec.mang_cd_6 = Util.checkString(rset0.getString("mang_cd_6"));
			rec.mang_cd_7 = Util.checkString(rset0.getString("mang_cd_7"));
			rec.mang_cd_8 = Util.checkString(rset0.getString("mang_cd_8"));
			rec.mang_cd_9 = Util.checkString(rset0.getString("mang_cd_9"));
			rec.mang_cd_10 = Util.checkString(rset0.getString("mang_cd_10"));
			rec.mang_cd_11 = Util.checkString(rset0.getString("mang_cd_11"));
			rec.mang_cd_12 = Util.checkString(rset0.getString("mang_cd_12"));
			rec.tbl_nm = Util.checkString(rset0.getString("tbl_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.upd_yn = Util.checkString(rset0.getString("upd_yn"));
			rec.incmg_pers_ip = Util.checkString(rset0.getString("incmg_pers_ip"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1101_LDataSet ds = (TN_RPT_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1101_LCURLISTRecord curlistRec = (TN_RPT_1101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bank_cd%>
<%= curlistRec.use_yn%>
<%= curlistRec.bank_nm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.bank_acct_no%>
<%= curlistRec.bank_gb%>
<%= curlistRec.mang_cd_3%>
<%= curlistRec.mang_cd_4%>
<%= curlistRec.mang_cd_5%>
<%= curlistRec.mang_cd_6%>
<%= curlistRec.mang_cd_7%>
<%= curlistRec.mang_cd_8%>
<%= curlistRec.mang_cd_9%>
<%= curlistRec.mang_cd_10%>
<%= curlistRec.mang_cd_11%>
<%= curlistRec.mang_cd_12%>
<%= curlistRec.tbl_nm%>
<%= curlistRec.remk%>
<%= curlistRec.upd_yn%>
<%= curlistRec.incmg_pers_ip%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 23 11:21:35 KST 2016 */