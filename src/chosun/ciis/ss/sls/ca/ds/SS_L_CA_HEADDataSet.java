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


package chosun.ciis.ss.sls.ca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 
 */


public class SS_L_CA_HEADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_CA_HEADDataSet(){}
	public SS_L_CA_HEADDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_L_CA_HEADCURCOMMLISTRecord rec = new SS_L_CA_HEADCURCOMMLISTRecord();
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ernno = Util.checkString(rset0.getString("ernno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.tel_no1 = Util.checkString(rset0.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset0.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset0.getString("tel_no3"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.empclsf = Util.checkString(rset0.getString("empclsf"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(13);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_CA_HEADDataSet ds = (SS_L_CA_HEADDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_CA_HEADCURCOMMLISTRecord curcommlistRec = (SS_L_CA_HEADCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.ernno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.tel_no1%>
<%= curcommlistRec.tel_no2%>
<%= curcommlistRec.tel_no3%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
<%= curcommlistRec.empseq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 03 14:20:16 KST 2015 */