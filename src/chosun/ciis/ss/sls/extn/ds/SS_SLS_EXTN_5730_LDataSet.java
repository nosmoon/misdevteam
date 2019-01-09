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


public class SS_SLS_EXTN_5730_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long qty_100y;
	public long qty_100n;
	public long qty_00;
	public long totqty;

	public SS_SLS_EXTN_5730_LDataSet(){}
	public SS_SLS_EXTN_5730_LDataSet(String errcode, String errmsg, long qty_100y, long qty_100n, long qty_00, long totqty){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			SS_SLS_EXTN_5730_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_5730_LCURCOMMLISTRecord();
			rec.subscrpt_cd = Util.checkString(rset0.getString("subscrpt_cd"));
			rec.subscrpt_gb = Util.checkString(rset0.getString("subscrpt_gb"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.subscnfmstat = Util.checkString(rset0.getString("subscnfmstat"));
			rec.subsyn = Util.checkString(rset0.getString("subsyn"));
			rec.fr_yymm = Util.checkString(rset0.getString("fr_yymm"));
			rec.to_yymm = Util.checkString(rset0.getString("to_yymm"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			this.curcommlist.add(rec);
		}
		this.qty_100y = cstmt.getLong(21);
		this.qty_100n = cstmt.getLong(22);
		this.qty_00 = cstmt.getLong(23);
		this.totqty = cstmt.getLong(24);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_5730_LDataSet ds = (SS_SLS_EXTN_5730_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_5730_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_5730_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getQty_100y()%>
<%= ds.getQty_100n()%>
<%= ds.getQty_00()%>
<%= ds.getTotqty()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.subscrpt_cd%>
<%= curcommlistRec.subscrpt_gb%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.qty%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.rdr_extndt%>
<%= curcommlistRec.subscnfmstat%>
<%= curcommlistRec.subsyn%>
<%= curcommlistRec.fr_yymm%>
<%= curcommlistRec.to_yymm%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.telno%>
<%= curcommlistRec.ptphno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 10 17:10:34 KST 2018 */