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


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_L_ABCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList abccur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_ABCDataSet(){}
	public SS_L_ABCDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_L_ABCABCCURRecord rec = new SS_L_ABCABCCURRecord();
			rec.basiyymm = Util.checkString(rset0.getString("basiyymm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.valcnt = Util.checkString(rset0.getString("valcnt"));
			rec.aftcnt1 = Util.checkString(rset0.getString("aftcnt1"));
			rec.aftcnt2 = Util.checkString(rset0.getString("aftcnt2"));
			rec.aftcnt3 = Util.checkString(rset0.getString("aftcnt3"));
			rec.aftcnt4 = Util.checkString(rset0.getString("aftcnt4"));
			rec.aftcnt5 = Util.checkString(rset0.getString("aftcnt5"));
			rec.aftcnt6 = Util.checkString(rset0.getString("aftcnt6"));
			rec.excsaftcnt7 = Util.checkString(rset0.getString("excsaftcnt7"));
			rec.free_misu = Util.checkString(rset0.getString("free_misu"));
			rec.free_disc = Util.checkString(rset0.getString("free_disc"));
			rec.resv1 = Util.checkString(rset0.getString("resv1"));
			rec.resv2 = Util.checkString(rset0.getString("resv2"));
			rec.resv3 = Util.checkString(rset0.getString("resv3"));
			rec.thmmsendqty = Util.checkString(rset0.getString("thmmsendqty"));
			rec.per = Util.checkString(rset0.getString("per"));
			this.abccur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_ABCDataSet ds = (SS_L_ABCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.abccur.size(); i++){
		SS_L_ABCABCCURRecord abccurRec = (SS_L_ABCABCCURRecord)ds.abccur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAbccur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= abccurRec.basiyymm%>
<%= abccurRec.medicd%>
<%= abccurRec.deptcd%>
<%= abccurRec.deptnm%>
<%= abccurRec.partcd%>
<%= abccurRec.partnm%>
<%= abccurRec.areacd%>
<%= abccurRec.areanm%>
<%= abccurRec.bocd%>
<%= abccurRec.bonm%>
<%= abccurRec.valcnt%>
<%= abccurRec.aftcnt1%>
<%= abccurRec.aftcnt2%>
<%= abccurRec.aftcnt3%>
<%= abccurRec.aftcnt4%>
<%= abccurRec.aftcnt5%>
<%= abccurRec.aftcnt6%>
<%= abccurRec.excsaftcnt7%>
<%= abccurRec.free_misu%>
<%= abccurRec.free_disc%>
<%= abccurRec.resv1%>
<%= abccurRec.resv2%>
<%= abccurRec.resv3%>
<%= abccurRec.thmmsendqty%>
<%= abccurRec.per%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 09 22:43:25 KST 2009 */