/***************************************************************************************************
* 파일명 : SS_MO_SLS_BRMGR_2512_LDataSet.java
* 기능 : 센터종합관리-센터관리-센터건전도-매출_모바일용
* 작성일자 : 2016-12-19
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 센터정렬순으로 정렬, 팀,파트,지역으로 조건 넣을 수 있도록 추가.
* 수정자 : 장 선 희
* 수정일자 : 2017-03-15
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


public class SS_MO_SLS_BRMGR_2512_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_SLS_BRMGR_2512_LDataSet(){}
	public SS_MO_SLS_BRMGR_2512_LDataSet(String errcode, String errmsg){
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
			SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord rec = new SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord();
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
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.net_sale_amt_110 = Util.checkString(rset0.getString("net_sale_amt_110"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.now_bal = Util.checkString(rset0.getString("now_bal"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			rec.acct_tot_amt = Util.checkString(rset0.getString("acct_tot_amt"));
			rec.pdlv_altn_amt = Util.checkString(rset0.getString("pdlv_altn_amt"));
			rec.vitl_acct_no = Util.checkString(rset0.getString("vitl_acct_no"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_SLS_BRMGR_2512_LDataSet ds = (SS_MO_SLS_BRMGR_2512_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord curcommlistRec = (SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.net_sale_amt%>
<%= curcommlistRec.net_sale_amt_110%>
<%= curcommlistRec.rcpm_amt%>
<%= curcommlistRec.rcpm_rate%>
<%= curcommlistRec.now_bal%>
<%= curcommlistRec.bal%>
<%= curcommlistRec.acct_tot_amt%>
<%= curcommlistRec.pdlv_altn_amt%>
<%= curcommlistRec.vitl_acct_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 24 16:35:33 KST 2017 */