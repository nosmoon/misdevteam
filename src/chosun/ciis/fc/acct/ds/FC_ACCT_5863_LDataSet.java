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


public class FC_ACCT_5863_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5863_LDataSet(){}
	public FC_ACCT_5863_LDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_ACCT_5863_LCURLISTRecord rec = new FC_ACCT_5863_LCURLISTRecord();
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.pch_amt1 = Util.checkString(rset2.getString("pch_amt1"));
			rec.pch_amt2 = Util.checkString(rset2.getString("pch_amt2"));
			rec.pch_amt3 = Util.checkString(rset2.getString("pch_amt3"));
			rec.pch_amt4 = Util.checkString(rset2.getString("pch_amt4"));
			rec.pch_amt5 = Util.checkString(rset2.getString("pch_amt5"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5863_LDataSet ds = (FC_ACCT_5863_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5863_LCURLISTRecord curlistRec = (FC_ACCT_5863_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.pch_amt1%>
<%= curlistRec.pch_amt2%>
<%= curlistRec.pch_amt3%>
<%= curlistRec.pch_amt4%>
<%= curlistRec.pch_amt5%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 12:06:55 KST 2009 */