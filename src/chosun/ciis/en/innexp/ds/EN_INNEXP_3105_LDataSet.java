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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_3105_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_3105_LDataSet(){}
	public EN_INNEXP_3105_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			EN_INNEXP_3105_LCURLISTRecord rec = new EN_INNEXP_3105_LCURLISTRecord();
			rec.type_nm = Util.checkString(rset0.getString("type_nm"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.amt3 = Util.checkString(rset0.getString("amt3"));
			rec.stlm_dt = Util.checkString(rset0.getString("stlm_dt"));
			rec.evnt_frdt = Util.checkString(rset0.getString("evnt_frdt"));
			rec.evnt_todt = Util.checkString(rset0.getString("evnt_todt"));
			rec.evnt_dds = Util.checkString(rset0.getString("evnt_dds"));
			rec.entr_nops = Util.checkString(rset0.getString("entr_nops"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_3105_LDataSet ds = (EN_INNEXP_3105_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_3105_LCURLISTRecord curlistRec = (EN_INNEXP_3105_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.type_nm%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
<%= curlistRec.amt3%>
<%= curlistRec.stlm_dt%>
<%= curlistRec.evnt_frdt%>
<%= curlistRec.evnt_todt%>
<%= curlistRec.evnt_dds%>
<%= curlistRec.entr_nops%>
<%= curlistRec.chrg_pers_emp_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 17:32:09 KST 2009 */