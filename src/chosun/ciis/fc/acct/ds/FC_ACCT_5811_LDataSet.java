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


public class FC_ACCT_5811_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5811_LDataSet(){}
	public FC_ACCT_5811_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_5811_LCURLISTRecord rec = new FC_ACCT_5811_LCURLISTRecord();
			rec.supr_acct_cd = Util.checkString(rset0.getString("supr_acct_cd"));
			rec.insd_acct_nm = Util.checkString(rset0.getString("insd_acct_nm"));
			rec.acctcdacct_abrvnm = Util.checkString(rset0.getString("acctcdacct_abrvnm"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			rec.medi_190 = Util.checkString(rset0.getString("medi_190"));
			rec.medi_210 = Util.checkString(rset0.getString("medi_210"));
			rec.medi_220 = Util.checkString(rset0.getString("medi_220"));
			rec.medi_230 = Util.checkString(rset0.getString("medi_230"));
			rec.medi_270 = Util.checkString(rset0.getString("medi_270"));
			rec.medi_320 = Util.checkString(rset0.getString("medi_320"));
			rec.medi_424 = Util.checkString(rset0.getString("medi_424"));
			rec.medi_426 = Util.checkString(rset0.getString("medi_426"));
			rec.medi_610 = Util.checkString(rset0.getString("medi_610"));
			rec.medi_620 = Util.checkString(rset0.getString("medi_620"));
			rec.medi_625 = Util.checkString(rset0.getString("medi_625"));
			rec.medi_630 = Util.checkString(rset0.getString("medi_630"));
			rec.medi_635 = Util.checkString(rset0.getString("medi_635"));
			rec.medi_640 = Util.checkString(rset0.getString("medi_640"));
			rec.medi_645 = Util.checkString(rset0.getString("medi_645"));
			rec.medi_646 = Util.checkString(rset0.getString("medi_646"));
			rec.medi_650 = Util.checkString(rset0.getString("medi_650"));
			rec.medi_655 = Util.checkString(rset0.getString("medi_655"));
			rec.medi_660 = Util.checkString(rset0.getString("medi_660"));
			rec.medi_665 = Util.checkString(rset0.getString("medi_665"));
			rec.medi_671 = Util.checkString(rset0.getString("medi_671"));
			rec.medi_680 = Util.checkString(rset0.getString("medi_680"));
			rec.medi_685 = Util.checkString(rset0.getString("medi_685"));
			rec.medi_700 = Util.checkString(rset0.getString("medi_700"));
			rec.medi_701 = Util.checkString(rset0.getString("medi_701"));
			rec.medi_702 = Util.checkString(rset0.getString("medi_702"));
			rec.medi_703 = Util.checkString(rset0.getString("medi_703"));
			rec.medi_704 = Util.checkString(rset0.getString("medi_704"));
			rec.medi_705 = Util.checkString(rset0.getString("medi_705"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5811_LDataSet ds = (FC_ACCT_5811_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5811_LCURLISTRecord curlistRec = (FC_ACCT_5811_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.supr_acct_cd%>
<%= curlistRec.insd_acct_nm%>
<%= curlistRec.acctcdacct_abrvnm%>
<%= curlistRec.acct_levl%>
<%= curlistRec.etc%>
<%= curlistRec.medi_190%>
<%= curlistRec.medi_210%>
<%= curlistRec.medi_220%>
<%= curlistRec.medi_230%>
<%= curlistRec.medi_270%>
<%= curlistRec.medi_320%>
<%= curlistRec.medi_424%>
<%= curlistRec.medi_426%>
<%= curlistRec.medi_610%>
<%= curlistRec.medi_620%>
<%= curlistRec.medi_625%>
<%= curlistRec.medi_630%>
<%= curlistRec.medi_635%>
<%= curlistRec.medi_640%>
<%= curlistRec.medi_645%>
<%= curlistRec.medi_646%>
<%= curlistRec.medi_650%>
<%= curlistRec.medi_655%>
<%= curlistRec.medi_660%>
<%= curlistRec.medi_665%>
<%= curlistRec.medi_671%>
<%= curlistRec.medi_680%>
<%= curlistRec.medi_685%>
<%= curlistRec.medi_700%>
<%= curlistRec.medi_701%>
<%= curlistRec.medi_702%>
<%= curlistRec.medi_703%>
<%= curlistRec.medi_704%>
<%= curlistRec.medi_705%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 21 11:12:40 KST 2016 */