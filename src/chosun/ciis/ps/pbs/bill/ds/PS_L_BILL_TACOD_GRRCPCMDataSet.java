/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_TACOD_GRRCPCM.java
* 수금-일괄입금 상세조회화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-일괄입금 상세조회화면
 *
 */



public class PS_L_BILL_TACOD_GRRCPCMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_BILL_TACOD_GRRCPCMDataSet(){}
	public PS_L_BILL_TACOD_GRRCPCMDataSet(String errcode, String errmsg, long totalcnt){
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
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord rec = new PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.amt = rset0.getInt("amt");
			rec.recpbrchcd = Util.checkString(rset0.getString("recpbrchcd"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.rcpmrflyn = Util.checkString(rset0.getString("rcpmrflyn"));
			rec.recpclsf = Util.checkString(rset0.getString("recpclsf"));
			rec.tbstprocclsf = Util.checkString(rset0.getString("tbstprocclsf"));
			rec.rcpmrflclsf = Util.checkString(rset0.getString("rcpmrflclsf"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			this.curcommlist.add(rec);
		}
	}


}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_L_BILL_TACOD_GRRCPCMDataSet ds = (PS_L_BILL_TACOD_GRRCPCMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord curcommlistRec = (PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.seq%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.recpbrchcd%>
<%= curcommlistRec.recpdt%>
<%= curcommlistRec.rcpmrflyn%>
<%= curcommlistRec.recpclsf%>
<%= curcommlistRec.tbstprocclsf%>
<%= curcommlistRec.rcpmrflclsf%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.rdrnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 31 18:01:32 KST 2004 */