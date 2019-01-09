/***************************************************************************************************
* 파일명 : .java
* 기능 :  원가관리 - 매체별 손익현황
* 작성일자 : 2011-07-12
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 원가관리 - 매체별 손익현황
 */

public class MC_COST_3163_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_3163_LDataSet(){}
	public MC_COST_3163_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_COST_3163_LCURLISTRecord rec = new MC_COST_3163_LCURLISTRecord();
			rec.gubun1 = Util.checkString(rset0.getString("gubun1"));
			rec.sort_key1 = Util.checkString(rset0.getString("sort_key1"));
			rec.gubun2 = Util.checkString(rset0.getString("gubun2"));
			rec.gubun3 = Util.checkString(rset0.getString("gubun3"));
			rec.ajsumamt_m01 = Util.checkString(rset0.getString("ajsumamt_m01"));
			rec.aj11amt_m01 = Util.checkString(rset0.getString("aj11amt_m01"));
			rec.aj13amt_m01 = Util.checkString(rset0.getString("aj13amt_m01"));
			rec.aj19amt_m01 = Util.checkString(rset0.getString("aj19amt_m01"));
			rec.ajsub1sum_m01 = Util.checkString(rset0.getString("ajsub1sum_m01"));
			rec.aj21amt_m01 = Util.checkString(rset0.getString("aj21amt_m01"));
			rec.aj22amt_m01 = Util.checkString(rset0.getString("aj22amt_m01"));
			rec.aj23amt_m01 = Util.checkString(rset0.getString("aj23amt_m01"));
			rec.aj24amt_m01 = Util.checkString(rset0.getString("aj24amt_m01"));
			rec.aj27amt_m01 = Util.checkString(rset0.getString("aj27amt_m01"));
			rec.aj31amt_m01 = Util.checkString(rset0.getString("aj31amt_m01"));
			rec.aj41amt_m01 = Util.checkString(rset0.getString("aj41amt_m01"));
			rec.aj42amt_m01 = Util.checkString(rset0.getString("aj42amt_m01"));
			rec.aj49amt_m01 = Util.checkString(rset0.getString("aj49amt_m01"));
			rec.ajsub2sum_m01 = Util.checkString(rset0.getString("ajsub2sum_m01"));
			rec.aj61amt_m01 = Util.checkString(rset0.getString("aj61amt_m01"));
			rec.aj71amt_m01 = Util.checkString(rset0.getString("aj71amt_m01"));
			rec.aj81amt_m01 = Util.checkString(rset0.getString("aj81amt_m01"));
			rec.ajexamt_m01 = Util.checkString(rset0.getString("ajexamt_m01"));
			rec.aj11amt_m02 = Util.checkString(rset0.getString("aj11amt_m02"));
			rec.aj13amt_m02 = Util.checkString(rset0.getString("aj13amt_m02"));
			rec.aj19amt_m02 = Util.checkString(rset0.getString("aj19amt_m02"));
			rec.ajsub1sum_m02 = Util.checkString(rset0.getString("ajsub1sum_m02"));
			rec.aj21amt_m02 = Util.checkString(rset0.getString("aj21amt_m02"));
			rec.aj22amt_m02 = Util.checkString(rset0.getString("aj22amt_m02"));
			rec.aj23amt_m02 = Util.checkString(rset0.getString("aj23amt_m02"));
			rec.aj24amt_m02 = Util.checkString(rset0.getString("aj24amt_m02"));
			rec.aj27amt_m02 = Util.checkString(rset0.getString("aj27amt_m02"));
			rec.aj31amt_m02 = Util.checkString(rset0.getString("aj31amt_m02"));
			rec.aj41amt_m02 = Util.checkString(rset0.getString("aj41amt_m02"));
			rec.aj42amt_m02 = Util.checkString(rset0.getString("aj42amt_m02"));
			rec.aj49amt_m02 = Util.checkString(rset0.getString("aj49amt_m02"));
			rec.ajsub2sum_m02 = Util.checkString(rset0.getString("ajsub2sum_m02"));
			rec.aj61amt_m02 = Util.checkString(rset0.getString("aj61amt_m02"));
			rec.aj71amt_m02 = Util.checkString(rset0.getString("aj71amt_m02"));
			rec.aj81amt_m02 = Util.checkString(rset0.getString("aj81amt_m02"));
			rec.ajexamt_m02 = Util.checkString(rset0.getString("ajexamt_m02"));
			rec.aj11amt_m03 = Util.checkString(rset0.getString("aj11amt_m03"));
			rec.aj13amt_m03 = Util.checkString(rset0.getString("aj13amt_m03"));
			rec.aj19amt_m03 = Util.checkString(rset0.getString("aj19amt_m03"));
			rec.ajsub1sum_m03 = Util.checkString(rset0.getString("ajsub1sum_m03"));
			rec.aj21amt_m03 = Util.checkString(rset0.getString("aj21amt_m03"));
			rec.aj22amt_m03 = Util.checkString(rset0.getString("aj22amt_m03"));
			rec.aj23amt_m03 = Util.checkString(rset0.getString("aj23amt_m03"));
			rec.aj24amt_m03 = Util.checkString(rset0.getString("aj24amt_m03"));
			rec.aj27amt_m03 = Util.checkString(rset0.getString("aj27amt_m03"));
			rec.aj31amt_m03 = Util.checkString(rset0.getString("aj31amt_m03"));
			rec.aj41amt_m03 = Util.checkString(rset0.getString("aj41amt_m03"));
			rec.aj42amt_m03 = Util.checkString(rset0.getString("aj42amt_m03"));
			rec.aj49amt_m03 = Util.checkString(rset0.getString("aj49amt_m03"));
			rec.ajsub2sum_m03 = Util.checkString(rset0.getString("ajsub2sum_m03"));
			rec.aj61amt_m03 = Util.checkString(rset0.getString("aj61amt_m03"));
			rec.aj71amt_m03 = Util.checkString(rset0.getString("aj71amt_m03"));
			rec.aj81amt_m03 = Util.checkString(rset0.getString("aj81amt_m03"));
			rec.ajexamt_m03 = Util.checkString(rset0.getString("ajexamt_m03"));
			rec.aj11amt_m04 = Util.checkString(rset0.getString("aj11amt_m04"));
			rec.aj13amt_m04 = Util.checkString(rset0.getString("aj13amt_m04"));
			rec.aj19amt_m04 = Util.checkString(rset0.getString("aj19amt_m04"));
			rec.ajsub1sum_m04 = Util.checkString(rset0.getString("ajsub1sum_m04"));
			rec.aj21amt_m04 = Util.checkString(rset0.getString("aj21amt_m04"));
			rec.aj22amt_m04 = Util.checkString(rset0.getString("aj22amt_m04"));
			rec.aj23amt_m04 = Util.checkString(rset0.getString("aj23amt_m04"));
			rec.aj24amt_m04 = Util.checkString(rset0.getString("aj24amt_m04"));
			rec.aj27amt_m04 = Util.checkString(rset0.getString("aj27amt_m04"));
			rec.aj31amt_m04 = Util.checkString(rset0.getString("aj31amt_m04"));
			rec.aj41amt_m04 = Util.checkString(rset0.getString("aj41amt_m04"));
			rec.aj42amt_m04 = Util.checkString(rset0.getString("aj42amt_m04"));
			rec.aj49amt_m04 = Util.checkString(rset0.getString("aj49amt_m04"));
			rec.ajsub2sum_m04 = Util.checkString(rset0.getString("ajsub2sum_m04"));
			rec.aj61amt_m04 = Util.checkString(rset0.getString("aj61amt_m04"));
			rec.aj71amt_m04 = Util.checkString(rset0.getString("aj71amt_m04"));
			rec.aj81amt_m04 = Util.checkString(rset0.getString("aj81amt_m04"));
			rec.ajexamt_m04 = Util.checkString(rset0.getString("ajexamt_m04"));
			rec.aj11amt_m05 = Util.checkString(rset0.getString("aj11amt_m05"));
			rec.aj13amt_m05 = Util.checkString(rset0.getString("aj13amt_m05"));
			rec.aj19amt_m05 = Util.checkString(rset0.getString("aj19amt_m05"));
			rec.ajsub1sum_m05 = Util.checkString(rset0.getString("ajsub1sum_m05"));
			rec.aj21amt_m05 = Util.checkString(rset0.getString("aj21amt_m05"));
			rec.aj22amt_m05 = Util.checkString(rset0.getString("aj22amt_m05"));
			rec.aj23amt_m05 = Util.checkString(rset0.getString("aj23amt_m05"));
			rec.aj24amt_m05 = Util.checkString(rset0.getString("aj24amt_m05"));
			rec.aj27amt_m05 = Util.checkString(rset0.getString("aj27amt_m05"));
			rec.aj31amt_m05 = Util.checkString(rset0.getString("aj31amt_m05"));
			rec.aj41amt_m05 = Util.checkString(rset0.getString("aj41amt_m05"));
			rec.aj42amt_m05 = Util.checkString(rset0.getString("aj42amt_m05"));
			rec.aj49amt_m05 = Util.checkString(rset0.getString("aj49amt_m05"));
			rec.ajsub2sum_m05 = Util.checkString(rset0.getString("ajsub2sum_m05"));
			rec.aj61amt_m05 = Util.checkString(rset0.getString("aj61amt_m05"));
			rec.aj71amt_m05 = Util.checkString(rset0.getString("aj71amt_m05"));
			rec.aj81amt_m05 = Util.checkString(rset0.getString("aj81amt_m05"));
			rec.ajexamt_m05 = Util.checkString(rset0.getString("ajexamt_m05"));
			rec.aj11amt_m06 = Util.checkString(rset0.getString("aj11amt_m06"));
			rec.aj13amt_m06 = Util.checkString(rset0.getString("aj13amt_m06"));
			rec.aj19amt_m06 = Util.checkString(rset0.getString("aj19amt_m06"));
			rec.ajsub1sum_m06 = Util.checkString(rset0.getString("ajsub1sum_m06"));
			rec.aj21amt_m06 = Util.checkString(rset0.getString("aj21amt_m06"));
			rec.aj22amt_m06 = Util.checkString(rset0.getString("aj22amt_m06"));
			rec.aj23amt_m06 = Util.checkString(rset0.getString("aj23amt_m06"));
			rec.aj24amt_m06 = Util.checkString(rset0.getString("aj24amt_m06"));
			rec.aj27amt_m06 = Util.checkString(rset0.getString("aj27amt_m06"));
			rec.aj31amt_m06 = Util.checkString(rset0.getString("aj31amt_m06"));
			rec.aj41amt_m06 = Util.checkString(rset0.getString("aj41amt_m06"));
			rec.aj42amt_m06 = Util.checkString(rset0.getString("aj42amt_m06"));
			rec.aj49amt_m06 = Util.checkString(rset0.getString("aj49amt_m06"));
			rec.ajsub2sum_m06 = Util.checkString(rset0.getString("ajsub2sum_m06"));
			rec.aj61amt_m06 = Util.checkString(rset0.getString("aj61amt_m06"));
			rec.aj71amt_m06 = Util.checkString(rset0.getString("aj71amt_m06"));
			rec.aj81amt_m06 = Util.checkString(rset0.getString("aj81amt_m06"));
			rec.ajexamt_m06 = Util.checkString(rset0.getString("ajexamt_m06"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_3163_LDataSet ds = (MC_COST_3163_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_3163_LCURLISTRecord curlistRec = (MC_COST_3163_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.gubun1%>
<%= curlistRec.sort_key1%>
<%= curlistRec.gubun2%>
<%= curlistRec.gubun3%>
<%= curlistRec.ajsumamt_m01%>
<%= curlistRec.aj11amt_m01%>
<%= curlistRec.aj13amt_m01%>
<%= curlistRec.aj19amt_m01%>
<%= curlistRec.ajsub1sum_m01%>
<%= curlistRec.aj21amt_m01%>
<%= curlistRec.aj22amt_m01%>
<%= curlistRec.aj23amt_m01%>
<%= curlistRec.aj24amt_m01%>
<%= curlistRec.aj27amt_m01%>
<%= curlistRec.aj31amt_m01%>
<%= curlistRec.aj41amt_m01%>
<%= curlistRec.aj42amt_m01%>
<%= curlistRec.aj49amt_m01%>
<%= curlistRec.ajsub2sum_m01%>
<%= curlistRec.aj61amt_m01%>
<%= curlistRec.aj71amt_m01%>
<%= curlistRec.aj81amt_m01%>
<%= curlistRec.ajexamt_m01%>
<%= curlistRec.aj11amt_m02%>
<%= curlistRec.aj13amt_m02%>
<%= curlistRec.aj19amt_m02%>
<%= curlistRec.ajsub1sum_m02%>
<%= curlistRec.aj21amt_m02%>
<%= curlistRec.aj22amt_m02%>
<%= curlistRec.aj23amt_m02%>
<%= curlistRec.aj24amt_m02%>
<%= curlistRec.aj27amt_m02%>
<%= curlistRec.aj31amt_m02%>
<%= curlistRec.aj41amt_m02%>
<%= curlistRec.aj42amt_m02%>
<%= curlistRec.aj49amt_m02%>
<%= curlistRec.ajsub2sum_m02%>
<%= curlistRec.aj61amt_m02%>
<%= curlistRec.aj71amt_m02%>
<%= curlistRec.aj81amt_m02%>
<%= curlistRec.ajexamt_m02%>
<%= curlistRec.aj11amt_m03%>
<%= curlistRec.aj13amt_m03%>
<%= curlistRec.aj19amt_m03%>
<%= curlistRec.ajsub1sum_m03%>
<%= curlistRec.aj21amt_m03%>
<%= curlistRec.aj22amt_m03%>
<%= curlistRec.aj23amt_m03%>
<%= curlistRec.aj24amt_m03%>
<%= curlistRec.aj27amt_m03%>
<%= curlistRec.aj31amt_m03%>
<%= curlistRec.aj41amt_m03%>
<%= curlistRec.aj42amt_m03%>
<%= curlistRec.aj49amt_m03%>
<%= curlistRec.ajsub2sum_m03%>
<%= curlistRec.aj61amt_m03%>
<%= curlistRec.aj71amt_m03%>
<%= curlistRec.aj81amt_m03%>
<%= curlistRec.ajexamt_m03%>
<%= curlistRec.aj11amt_m04%>
<%= curlistRec.aj13amt_m04%>
<%= curlistRec.aj19amt_m04%>
<%= curlistRec.ajsub1sum_m04%>
<%= curlistRec.aj21amt_m04%>
<%= curlistRec.aj22amt_m04%>
<%= curlistRec.aj23amt_m04%>
<%= curlistRec.aj24amt_m04%>
<%= curlistRec.aj27amt_m04%>
<%= curlistRec.aj31amt_m04%>
<%= curlistRec.aj41amt_m04%>
<%= curlistRec.aj42amt_m04%>
<%= curlistRec.aj49amt_m04%>
<%= curlistRec.ajsub2sum_m04%>
<%= curlistRec.aj61amt_m04%>
<%= curlistRec.aj71amt_m04%>
<%= curlistRec.aj81amt_m04%>
<%= curlistRec.ajexamt_m04%>
<%= curlistRec.aj11amt_m05%>
<%= curlistRec.aj13amt_m05%>
<%= curlistRec.aj19amt_m05%>
<%= curlistRec.ajsub1sum_m05%>
<%= curlistRec.aj21amt_m05%>
<%= curlistRec.aj22amt_m05%>
<%= curlistRec.aj23amt_m05%>
<%= curlistRec.aj24amt_m05%>
<%= curlistRec.aj27amt_m05%>
<%= curlistRec.aj31amt_m05%>
<%= curlistRec.aj41amt_m05%>
<%= curlistRec.aj42amt_m05%>
<%= curlistRec.aj49amt_m05%>
<%= curlistRec.ajsub2sum_m05%>
<%= curlistRec.aj61amt_m05%>
<%= curlistRec.aj71amt_m05%>
<%= curlistRec.aj81amt_m05%>
<%= curlistRec.ajexamt_m05%>
<%= curlistRec.aj11amt_m06%>
<%= curlistRec.aj13amt_m06%>
<%= curlistRec.aj19amt_m06%>
<%= curlistRec.ajsub1sum_m06%>
<%= curlistRec.aj21amt_m06%>
<%= curlistRec.aj22amt_m06%>
<%= curlistRec.aj23amt_m06%>
<%= curlistRec.aj24amt_m06%>
<%= curlistRec.aj27amt_m06%>
<%= curlistRec.aj31amt_m06%>
<%= curlistRec.aj41amt_m06%>
<%= curlistRec.aj42amt_m06%>
<%= curlistRec.aj49amt_m06%>
<%= curlistRec.ajsub2sum_m06%>
<%= curlistRec.aj61amt_m06%>
<%= curlistRec.aj71amt_m06%>
<%= curlistRec.aj81amt_m06%>
<%= curlistRec.ajexamt_m06%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 28 15:34:38 KST 2012 */