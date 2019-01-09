/***************************************************************************************************
* 파일명 : SS_MO_L_LOGINAPLC_APRVDataSet.java
* 기능 : 관리자-모바일관리-로그인승인신청리스트를 위한 DS
* 작성일자 : 2016-09-22
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 컬럼명변경으로인한 수정 및 센터명으로 조회할 수 있도록 추가
* 수정자 : 장선희
* 수정일자 : 2017-01-20 마감 42분전!!
* 백업 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 현임여부, ciis휴대번호(센터대표일때만) 추가
* 수정자 : 장선희
* 수정일자 : 2017-07-05
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *
 */


public class SS_MO_L_LOGINAPLC_APRVDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aplclist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_MO_L_LOGINAPLC_APRVDataSet(){}
	public SS_MO_L_LOGINAPLC_APRVDataSet(String errcode, String errmsg, long totalcnt){
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

		this.totalcnt = cstmt.getLong(16);
		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord rec = new SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.dutycd = Util.checkString(rset0.getString("dutycd"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.boemp_id = Util.checkString(rset0.getString("boemp_id"));
			rec.crm_ptph = Util.checkString(rset0.getString("crm_ptph"));
			rec.ciis_ptph = Util.checkString(rset0.getString("ciis_ptph"));
			rec.crm_boheadprn = Util.checkString(rset0.getString("crm_boheadprn"));
			rec.ciis_boheadprn = Util.checkString(rset0.getString("ciis_boheadprn"));
			rec.maprvstatcd = Util.checkString(rset0.getString("maprvstatcd"));
			rec.maprvstatnm = Util.checkString(rset0.getString("maprvstatnm"));
			rec.nowboheadyn = Util.checkString(rset0.getString("nowboheadyn"));
			rec.mblockyn = Util.checkString(rset0.getString("mblockyn"));
			this.aplclist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.aplclist.size(); i++){
		SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord aplclistRec = (SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord)ds.aplclist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getAplclist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= aplclistRec.deptcd%>
<%= aplclistRec.deptnm%>
<%= aplclistRec.partcd%>
<%= aplclistRec.partnm%>
<%= aplclistRec.areacd%>
<%= aplclistRec.areanm%>
<%= aplclistRec.bocd%>
<%= aplclistRec.bonm%>
<%= aplclistRec.boemp_no%>
<%= aplclistRec.dutycd%>
<%= aplclistRec.dutynm%>
<%= aplclistRec.flnm%>
<%= aplclistRec.boemp_id%>
<%= aplclistRec.crm_ptph%>
<%= aplclistRec.ciis_ptph%>
<%= aplclistRec.crm_boheadprn%>
<%= aplclistRec.ciis_boheadprn%>
<%= aplclistRec.maprvstatcd%>
<%= aplclistRec.maprvstatnm%>
<%= aplclistRec.nowboheadyn%>
<%= aplclistRec.mblockyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 13 11:08:57 KST 2017 */