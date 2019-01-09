/***************************************************************************************************
* 파일명 : SS_MO_SLS_BRMGR_2510_LDataSet.java
* 기능 : 센터종합관리-센터관리-센터건전도-확장부수_모바일용
* 작성일자 : 2016-12-19
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 센터정렬순으로 정렬, 팀,파트,지역으로 조건 넣을 수 있도록 추가.
* 수정자 : 장 선 희
* 수정일자 : 2017-03-16
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


public class SS_MO_SLS_BRMGR_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_SLS_BRMGR_2510_LDataSet(){}
	public SS_MO_SLS_BRMGR_2510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord rec = new SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.srtseq = Util.checkString(rset0.getString("srtseq"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boclsf = Util.checkString(rset0.getString("boclsf"));
			rec.rdr_qty = Util.checkString(rset0.getString("rdr_qty"));
			rec.jm_qty = Util.checkString(rset0.getString("jm_qty"));
			rec.extn_qty = Util.checkString(rset0.getString("extn_qty"));
			rec.susp_qty = Util.checkString(rset0.getString("susp_qty"));
			rec.grow_qty = Util.checkString(rset0.getString("grow_qty"));
			rec.extn_rate = Util.checkString(rset0.getString("extn_rate"));
			rec.susp_rate = Util.checkString(rset0.getString("susp_rate"));
			rec.extn_qty2 = Util.checkString(rset0.getString("extn_qty2"));
			rec.susp_qty2 = Util.checkString(rset0.getString("susp_qty2"));
			rec.grow_qty2 = Util.checkString(rset0.getString("grow_qty2"));
			rec.extn_rate2 = Util.checkString(rset0.getString("extn_rate2"));
			rec.susp_rate2 = Util.checkString(rset0.getString("susp_rate2"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_SLS_BRMGR_2510_LDataSet ds = (SS_MO_SLS_BRMGR_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord curcommlistRec = (SS_MO_SLS_BRMGR_2510_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.srtseq%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.boclsf%>
<%= curcommlistRec.rdr_qty%>
<%= curcommlistRec.jm_qty%>
<%= curcommlistRec.extn_qty%>
<%= curcommlistRec.susp_qty%>
<%= curcommlistRec.grow_qty%>
<%= curcommlistRec.extn_rate%>
<%= curcommlistRec.susp_rate%>
<%= curcommlistRec.extn_qty2%>
<%= curcommlistRec.susp_qty2%>
<%= curcommlistRec.grow_qty2%>
<%= curcommlistRec.extn_rate2%>
<%= curcommlistRec.susp_rate2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 16 16:27:22 KST 2017 */