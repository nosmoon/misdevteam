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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_2001_LDataSet(){}
	public FC_FUNC_2001_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_2001_LCURLISTRecord rec = new FC_FUNC_2001_LCURLISTRecord();
			rec.seci_nm = Util.checkString(rset0.getString("seci_nm"));
			rec.face_val_amt = Util.checkString(rset0.getString("face_val_amt"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.int_rate = Util.checkString(rset0.getString("int_rate"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.defr_yys = Util.checkString(rset0.getString("defr_yys"));
			rec.repay_yys = Util.checkString(rset0.getString("repay_yys"));
			rec.div_repay_tms = Util.checkString(rset0.getString("div_repay_tms"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.pay_bank_cd = Util.checkString(rset0.getString("pay_bank_cd"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.jpno = Util.checkString(rset0.getString("jpno"));
			rec.acntsist = Util.checkString(rset0.getString("acntsist"));
			rec.yugast = Util.checkString(rset0.getString("yugast"));
			rec.preint = Util.checkString(rset0.getString("preint"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_2001_LDataSet ds = (FC_FUNC_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_2001_LCURLISTRecord curlistRec = (FC_FUNC_2001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seci_nm%>
<%= curlistRec.face_val_amt%>
<%= curlistRec.purc_amt%>
<%= curlistRec.int_rate%>
<%= curlistRec.issu_dt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.compnm%>
<%= curlistRec.defr_yys%>
<%= curlistRec.repay_yys%>
<%= curlistRec.div_repay_tms%>
<%= curlistRec.rmks%>
<%= curlistRec.pay_bank_cd%>
<%= curlistRec.banknm%>
<%= curlistRec.jpno%>
<%= curlistRec.acntsist%>
<%= curlistRec.yugast%>
<%= curlistRec.preint%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 14:43:28 KST 2009 */