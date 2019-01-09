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


public class SS_L_KYOBO_EVENTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curextnlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalqty;
	public long totalcnt;

	public SS_L_KYOBO_EVENTDataSet(){}
	public SS_L_KYOBO_EVENTDataSet(String errcode, String errmsg, long totalqty, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalqty = totalqty;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalqty(long totalqty){
		this.totalqty = totalqty;
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

	public long getTotalqty(){
		return this.totalqty;
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

		this.totalqty = cstmt.getLong(8);
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_KYOBO_EVENTCUREXTNLISTRecord rec = new SS_L_KYOBO_EVENTCUREXTNLISTRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.subscnfmstat = Util.checkString(rset0.getString("subscnfmstat"));
			rec.bns1 = Util.checkString(rset0.getString("bns1"));
			rec.bns2 = Util.checkString(rset0.getString("bns2"));
			rec.bns3 = Util.checkString(rset0.getString("bns3"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cntrno = Util.checkString(rset0.getString("cntrno"));
			rec.mangno = Util.checkString(rset0.getString("mangno"));
			this.curextnlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_KYOBO_EVENTDataSet ds = (SS_L_KYOBO_EVENTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextnlist.size(); i++){
		SS_L_KYOBO_EVENTCUREXTNLISTRecord curextnlistRec = (SS_L_KYOBO_EVENTCUREXTNLISTRecord)ds.curextnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalqty()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurextnlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextnlistRec.rdr_extndt%>
<%= curextnlistRec.bocd%>
<%= curextnlistRec.bonm%>
<%= curextnlistRec.rdr_no%>
<%= curextnlistRec.rdrnm%>
<%= curextnlistRec.medinm%>
<%= curextnlistRec.telno%>
<%= curextnlistRec.ptphno%>
<%= curextnlistRec.addr%>
<%= curextnlistRec.subscnfmstat%>
<%= curextnlistRec.bns1%>
<%= curextnlistRec.bns2%>
<%= curextnlistRec.bns3%>
<%= curextnlistRec.rdr_extnno%>
<%= curextnlistRec.medicd%>
<%= curextnlistRec.cntrno%>
<%= curextnlistRec.mangno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 13 06:49:49 GMT 2014 */