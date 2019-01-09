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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2720_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_2720_SDataSet(){}
	public SE_BOI_2720_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_BOI_2720_SCURLISTRecord rec = new SE_BOI_2720_SCURLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.oprenvclsf = Util.checkString(rset0.getString("oprenvclsf"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.clamtmthd = Util.checkString(rset0.getString("clamtmthd"));
			rec.rdr_extntype1 = Util.checkString(rset0.getString("rdr_extntype1"));
			rec.rdr_extntype2 = Util.checkString(rset0.getString("rdr_extntype2"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.aplcpath = Util.checkString(rset0.getString("aplcpath"));
			rec.resitype = Util.checkString(rset0.getString("resitype"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_2720_SDataSet ds = (SE_BOI_2720_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BOI_2720_SCURLISTRecord curlistRec = (SE_BOI_2720_SCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.deptnm%>
<%= curlistRec.partnm%>
<%= curlistRec.areanm%>
<%= curlistRec.bocd%>
<%= curlistRec.bonm%>
<%= curlistRec.oprenvclsf%>
<%= curlistRec.rdrnm%>
<%= curlistRec.rdr_no%>
<%= curlistRec.qty%>
<%= curlistRec.addr%>
<%= curlistRec.telno%>
<%= curlistRec.ptphno%>
<%= curlistRec.rdr_extndt%>
<%= curlistRec.suspdt%>
<%= curlistRec.valmm%>
<%= curlistRec.clamtmthd%>
<%= curlistRec.rdr_extntype1%>
<%= curlistRec.rdr_extntype2%>
<%= curlistRec.extnnm%>
<%= curlistRec.aplcpath%>
<%= curlistRec.resitype%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Dec 07 18:18:02 KST 2014 */