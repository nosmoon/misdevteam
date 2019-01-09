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


public class FC_FUNC_4041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4041_LDataSet(){}
	public FC_FUNC_4041_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_FUNC_4041_LCURLISTRecord rec = new FC_FUNC_4041_LCURLISTRecord();
			rec.eestnm = Util.checkString(rset0.getString("eestnm"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.pay_note_no = Util.checkString(rset0.getString("pay_note_no"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.ysnm = Util.checkString(rset0.getString("ysnm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.patr_budg_cd = Util.checkString(rset0.getString("patr_budg_cd"));
			rec.stat_cd = Util.checkString(rset0.getString("stat_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.total = Util.checkString(rset0.getString("total"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_4041_LDataSet ds = (FC_FUNC_4041_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_4041_LCURLISTRecord curlistRec = (FC_FUNC_4041_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.eestnm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.pay_note_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.compnm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.ysnm%>
<%= curlistRec.rmks%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.stat_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.total%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 19:34:22 KST 2009 */