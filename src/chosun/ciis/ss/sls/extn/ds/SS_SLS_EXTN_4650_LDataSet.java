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


public class SS_SLS_EXTN_4650_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curextnlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long qty_100y;
	public long qty_100n;
	public long qty_00;
	public long totqty;

	public SS_SLS_EXTN_4650_LDataSet(){}
	public SS_SLS_EXTN_4650_LDataSet(String errcode, String errmsg, long qty_100y, long qty_100n, long qty_00, long totqty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.qty_100y = qty_100y;
		this.qty_100n = qty_100n;
		this.qty_00 = qty_00;
		this.totqty = totqty;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setQty_100y(long qty_100y){
		this.qty_100y = qty_100y;
	}

	public void setQty_100n(long qty_100n){
		this.qty_100n = qty_100n;
	}

	public void setQty_00(long qty_00){
		this.qty_00 = qty_00;
	}

	public void setTotqty(long totqty){
		this.totqty = totqty;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getQty_100y(){
		return this.qty_100y;
	}

	public long getQty_100n(){
		return this.qty_100n;
	}

	public long getQty_00(){
		return this.qty_00;
	}

	public long getTotqty(){
		return this.totqty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			SS_SLS_EXTN_4650_LCUREXTNLISTRecord rec = new SS_SLS_EXTN_4650_LCUREXTNLISTRecord();
			rec.dncomp = Util.checkString(rset0.getString("dncomp"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.teamnm = Util.checkString(rset0.getString("teamnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.fr_yymm = Util.checkString(rset0.getString("fr_yymm"));
			rec.to_yymm = Util.checkString(rset0.getString("to_yymm"));
			rec.subsuprc = Util.checkString(rset0.getString("subsuprc"));
			rec.extngb = Util.checkString(rset0.getString("extngb"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.closdt = Util.checkString(rset0.getString("closdt"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.subscnfmstat = Util.checkString(rset0.getString("subscnfmstat"));
			rec.subsyn = Util.checkString(rset0.getString("subsyn"));
			this.curextnlist.add(rec);
		}
		this.qty_100y = cstmt.getLong(24);
		this.qty_100n = cstmt.getLong(25);
		this.qty_00 = cstmt.getLong(26);
		this.totqty = cstmt.getLong(27);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_4650_LDataSet ds = (SS_SLS_EXTN_4650_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curextnlist.size(); i++){
		SS_SLS_EXTN_4650_LCUREXTNLISTRecord curextnlistRec = (SS_SLS_EXTN_4650_LCUREXTNLISTRecord)ds.curextnlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurextnlist()%>
<%= ds.getQty_100y()%>
<%= ds.getQty_100n()%>
<%= ds.getQty_00()%>
<%= ds.getTotqty()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curextnlistRec.dncomp%>
<%= curextnlistRec.dncompnm%>
<%= curextnlistRec.empseq%>
<%= curextnlistRec.deptnm%>
<%= curextnlistRec.extnnm%>
<%= curextnlistRec.rdrnm%>
<%= curextnlistRec.rdr_no%>
<%= curextnlistRec.teamnm%>
<%= curextnlistRec.partnm%>
<%= curextnlistRec.areanm%>
<%= curextnlistRec.bocd%>
<%= curextnlistRec.bonm%>
<%= curextnlistRec.addr%>
<%= curextnlistRec.telno%>
<%= curextnlistRec.ptphno%>
<%= curextnlistRec.qty%>
<%= curextnlistRec.fr_yymm%>
<%= curextnlistRec.to_yymm%>
<%= curextnlistRec.subsuprc%>
<%= curextnlistRec.extngb%>
<%= curextnlistRec.aplcdt%>
<%= curextnlistRec.closdt%>
<%= curextnlistRec.rdr_extndt%>
<%= curextnlistRec.subscnfmstat%>
<%= curextnlistRec.subsyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 14 17:46:41 KST 2017 */