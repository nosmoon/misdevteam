/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_2130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_2130_LDataSet(){}
	public SE_BNS_2130_LDataSet(String errcode, String errmsg){
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

		ResultSet rset10 = (ResultSet) cstmt.getObject(8);
		while(rset10.next()){
			SE_BNS_2130_LCURLISTRecord rec = new SE_BNS_2130_LCURLISTRecord();
			rec.bo_cd = Util.checkString(rset10.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset10.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset10.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset10.getString("bo_head_nm"));
			rec.chrg_pers = Util.checkString(rset10.getString("chrg_pers"));
			rec.bns_item_cd = Util.checkString(rset10.getString("bns_item_cd"));
			rec.bns_item_nm = Util.checkString(rset10.getString("bns_item_nm"));
			rec.divn_dt = Util.checkString(rset10.getString("divn_dt"));
			rec.ewh_seq = Util.checkString(rset10.getString("ewh_seq"));
			rec.bal = Util.checkString(rset10.getString("bal"));
			rec.acct_rcpm_rem_amt = Util.checkString(rset10.getString("acct_rcpm_rem_amt"));
			rec.acpt_rcpm_reg_tot_amt = Util.checkString(rset10.getString("acpt_rcpm_reg_tot_amt"));
			rec.rmtt_dt = Util.checkString(rset10.getString("rmtt_dt"));
			rec.rmtt_plac = Util.checkString(rset10.getString("rmtt_plac"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_2130_LDataSet ds = (SE_BNS_2130_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_2130_LCURLISTRecord curlistRec = (SE_BNS_2130_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.bns_item_cd%>
<%= curlistRec.bns_item_nm%>
<%= curlistRec.divn_dt%>
<%= curlistRec.ewh_seq%>
<%= curlistRec.bal%>
<%= curlistRec.acct_rcpm_rem_amt%>
<%= curlistRec.acpt_rcpm_reg_tot_amt%>
<%= curlistRec.rmtt_dt%>
<%= curlistRec.rmtt_plac%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */