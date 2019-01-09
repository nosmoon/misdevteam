/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-확장관리-사원확장통계
* 작성일자 : 2011-12-05
* 작성자 : 이기영
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


public class SS_L_EXTN_RDR_STATSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curextnstatlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long fixbef;
	public long fixaft;
	public long totqty;
	public long parempcnt;
	public long totempcnt;
	public long parempper;

	public SS_L_EXTN_RDR_STATSDataSet(){}
	public SS_L_EXTN_RDR_STATSDataSet(String errcode, String errmsg, long fixbef, long fixaft, long totqty, long parempcnt, long totempcnt, long parempper){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.fixbef = fixbef;
		this.fixaft = fixaft;
		this.totqty = totqty;
		this.parempcnt = parempcnt;
		this.totempcnt = totempcnt;
		this.parempper = parempper;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFixbef(long fixbef){
		this.fixbef = fixbef;
	}

	public void setFixaft(long fixaft){
		this.fixaft = fixaft;
	}

	public void setTotqty(long totqty){
		this.totqty = totqty;
	}

	public void setParempcnt(long parempcnt){
		this.parempcnt = parempcnt;
	}

	public void setTotempcnt(long totempcnt){
		this.totempcnt = totempcnt;
	}

	public void setParempper(long parempper){
		this.parempper = parempper;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getFixbef(){
		return this.fixbef;
	}

	public long getFixaft(){
		return this.fixaft;
	}

	public long getTotqty(){
		return this.totqty;
	}

	public long getParempcnt(){
		return this.parempcnt;
	}

	public long getTotempcnt(){
		return this.totempcnt;
	}

	public long getParempper(){
		return this.parempper;
	}
	
	public void getValues(CallableStatement cstmt) throws SQLException{		
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.fixbef = cstmt.getLong(14);
		this.fixaft = cstmt.getLong(15);
		this.totqty = cstmt.getLong(16);
		this.parempcnt = cstmt.getLong(17);
		this.totempcnt = cstmt.getLong(18);
		this.parempper = cstmt.getLong(19);
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord rec = new SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord();
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.offinm = Util.checkString(rset0.getString("offinm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.empcd = Util.checkString(rset0.getString("empcd"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			rec.fixbef = Util.checkString(rset0.getString("fixbef"));
			rec.fixaft = Util.checkString(rset0.getString("fixaft"));
			rec.totqty = Util.checkString(rset0.getString("totqty"));
			rec.totempcnt = Util.checkString(rset0.getString("totempcnt"));
			rec.parempcnt = Util.checkString(rset0.getString("parempcnt"));
			rec.parempper = Util.checkString(rset0.getString("parempper"));
			this.curextnstatlist.add(rec);
		}		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EXTN_RDR_STATSDataSet ds = (SS_L_EXTN_RDR_STATSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextnstatlist.size(); i++){
		SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord curextnstatlistRec = (SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord)ds.curextnstatlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFixbef()%>
<%= ds.getFixaft()%>
<%= ds.getTotqty()%>
<%= ds.getParempcnt()%>
<%= ds.getTotempcnt()%>
<%= ds.getParempper()%>
<%= ds.getCurextnstatlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextnstatlistRec.cmpynm%>
<%= curextnstatlistRec.offinm%>
<%= curextnstatlistRec.deptnm%>
<%= curextnstatlistRec.empcd%>
<%= curextnstatlistRec.empnm%>
<%= curextnstatlistRec.fixbef%>
<%= curextnstatlistRec.fixaft%>
<%= curextnstatlistRec.totqty%>
<%= curextnstatlistRec.totempcnt%>
<%= curextnstatlistRec.parempcnt%>
<%= curextnstatlistRec.parempper%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 15 11:43:54 KST 2012 */