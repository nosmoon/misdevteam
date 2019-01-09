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


public class SS_L_RDR_EXTN_ISSTAF_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String frdt;

	public SS_L_RDR_EXTN_ISSTAF_PRINTDataSet(){}
	public SS_L_RDR_EXTN_ISSTAF_PRINTDataSet(String errcode, String errmsg, String frdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.frdt = frdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.frdt = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.a1 = rset0.getInt("a1");
			rec.a2 = rset0.getInt("a2");
			rec.a3 = rset0.getInt("a3");
			rec.a4 = rset0.getInt("a4");
			rec.a5 = rset0.getInt("a5");
			rec.h1 = rset0.getInt("h1");
			rec.h2 = rset0.getInt("h2");
			rec.h3 = rset0.getInt("h3");
			rec.h4 = rset0.getInt("h4");
			rec.h5 = rset0.getInt("h5");
			rec.s1 = rset0.getInt("s1");
			rec.s2 = rset0.getInt("s2");
			rec.s3 = rset0.getInt("s3");
			rec.s4 = rset0.getInt("s4");
			rec.s5 = rset0.getInt("s5");
			rec.corr_qty = rset0.getInt("corr_qty");
			rec.tot_qty = rset0.getInt("tot_qty");
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_EXTN_ISSTAF_PRINTDataSet ds = (SS_L_RDR_EXTN_ISSTAF_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFrdt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.a1%>
<%= curcommlistRec.a2%>
<%= curcommlistRec.a3%>
<%= curcommlistRec.a4%>
<%= curcommlistRec.a5%>
<%= curcommlistRec.h1%>
<%= curcommlistRec.h2%>
<%= curcommlistRec.h3%>
<%= curcommlistRec.h4%>
<%= curcommlistRec.h5%>
<%= curcommlistRec.s1%>
<%= curcommlistRec.s2%>
<%= curcommlistRec.s3%>
<%= curcommlistRec.s4%>
<%= curcommlistRec.s5%>
<%= curcommlistRec.corr_qty%>
<%= curcommlistRec.tot_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 09:45:18 KST 2015 */