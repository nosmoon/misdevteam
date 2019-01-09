/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmodlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_4620_LDataSet(){}
	public SS_SLS_EXTN_4620_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_SLS_EXTN_4620_LCURMODLISTRecord rec = new SS_SLS_EXTN_4620_LCURMODLISTRecord();
			rec.dncomp = Util.checkString(rset0.getString("dncomp"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.refaddr = Util.checkString(rset0.getString("refaddr"));
			rec.telno1 = Util.checkString(rset0.getString("telno1"));
			rec.telno2 = Util.checkString(rset0.getString("telno2"));
			rec.telno3 = Util.checkString(rset0.getString("telno3"));
			rec.ptphno1 = Util.checkString(rset0.getString("ptphno1"));
			rec.ptphno2 = Util.checkString(rset0.getString("ptphno2"));
			rec.ptphno3 = Util.checkString(rset0.getString("ptphno3"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.fr_yymm = Util.checkString(rset0.getString("fr_yymm"));
			rec.to_yymm = Util.checkString(rset0.getString("to_yymm"));
			rec.subsuprc = Util.checkString(rset0.getString("subsuprc"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.bldmngnn = Util.checkString(rset0.getString("bldmngnn"));
			rec.extngb = Util.checkString(rset0.getString("extngb"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			rec.closdt = Util.checkString(rset0.getString("closdt"));
			this.curmodlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_4620_LDataSet ds = (SS_SLS_EXTN_4620_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmodlist.size(); i++){
		SS_SLS_EXTN_4620_LCURMODLISTRecord curmodlistRec = (SS_SLS_EXTN_4620_LCURMODLISTRecord)ds.curmodlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmodlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmodlistRec.dncomp%>
<%= curmodlistRec.dncompnm%>
<%= curmodlistRec.empseq%>
<%= curmodlistRec.deptnm%>
<%= curmodlistRec.extnnm%>
<%= curmodlistRec.rdrnm%>
<%= curmodlistRec.bocd%>
<%= curmodlistRec.bonm%>
<%= curmodlistRec.zip%>
<%= curmodlistRec.addr%>
<%= curmodlistRec.dtlsaddr%>
<%= curmodlistRec.refaddr%>
<%= curmodlistRec.telno1%>
<%= curmodlistRec.telno2%>
<%= curmodlistRec.telno3%>
<%= curmodlistRec.ptphno1%>
<%= curmodlistRec.ptphno2%>
<%= curmodlistRec.ptphno3%>
<%= curmodlistRec.qty%>
<%= curmodlistRec.fr_yymm%>
<%= curmodlistRec.to_yymm%>
<%= curmodlistRec.subsuprc%>
<%= curmodlistRec.remk%>
<%= curmodlistRec.bldmngnn%>
<%= curmodlistRec.extngb%>
<%= curmodlistRec.aplcdt%>
<%= curmodlistRec.aplcno%>
<%= curmodlistRec.closdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 10 11:34:17 KST 2017 */