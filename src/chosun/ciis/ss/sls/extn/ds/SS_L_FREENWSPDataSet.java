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


public class SS_L_FREENWSPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList freelist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_FREENWSPDataSet(){}
	public SS_L_FREENWSPDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_FREENWSPFREELISTRecord rec = new SS_L_FREENWSPFREELISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.head_cnt = Util.checkString(rset0.getString("head_cnt"));
			rec.brnc_cnt = Util.checkString(rset0.getString("brnc_cnt"));
			rec.publ_cnt = Util.checkString(rset0.getString("publ_cnt"));
			rec.double_cnt = Util.checkString(rset0.getString("double_cnt"));
			rec.thrw_cnt = Util.checkString(rset0.getString("thrw_cnt"));
			rec.camp_cnt = Util.checkString(rset0.getString("camp_cnt"));
			rec.set_cnt = Util.checkString(rset0.getString("set_cnt"));
			rec.all_cnt = Util.checkString(rset0.getString("all_cnt"));
			rec.tactic_cnt = Util.checkString(rset0.getString("tactic_cnt"));
			rec.shop_cnt = Util.checkString(rset0.getString("shop_cnt"));
			rec.center_cnt = Util.checkString(rset0.getString("center_cnt"));
			this.freelist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_FREENWSPDataSet ds = (SS_L_FREENWSPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.freelist.size(); i++){
		SS_L_FREENWSPFREELISTRecord freelistRec = (SS_L_FREENWSPFREELISTRecord)ds.freelist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFreelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= freelistRec.deptnm%>
<%= freelistRec.deptcd%>
<%= freelistRec.partnm%>
<%= freelistRec.partcd%>
<%= freelistRec.areanm%>
<%= freelistRec.areacd%>
<%= freelistRec.bonm%>
<%= freelistRec.bocd%>
<%= freelistRec.head_cnt%>
<%= freelistRec.brnc_cnt%>
<%= freelistRec.publ_cnt%>
<%= freelistRec.double_cnt%>
<%= freelistRec.thrw_cnt%>
<%= freelistRec.camp_cnt%>
<%= freelistRec.set_cnt%>
<%= freelistRec.all_cnt%>
<%= freelistRec.tactic_cnt%>
<%= freelistRec.shop_cnt%>
<%= freelistRec.center_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 30 16:03:17 KST 2017 */