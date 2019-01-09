/***************************************************************************************************
* 파일명 : SS_L_QTYAPLC_ILGYEDataSet.java
* 기능 : 지국경영 - 부수증감 - 본지(담당) - 지역단위 부수현황 조회
* 작성일자 : 2009-04-30
* 작성자 : 황성진
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


public class SS_L_QTYAPLC_ILGYEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bo_yymm;

	public SS_L_QTYAPLC_ILGYEDataSet(){}
	public SS_L_QTYAPLC_ILGYEDataSet(String errcode, String errmsg, String bo_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bo_yymm = bo_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBo_yymm(String bo_yymm){
		this.bo_yymm = bo_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBo_yymm(){
		return this.bo_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bo_yymm = Util.checkString(cstmt.getString(4));
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_QTYAPLC_ILGYECURCOMMLISTRecord rec = new SS_L_QTYAPLC_ILGYECURCOMMLISTRecord();
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.iygwygbs = rset0.getInt("iygwygbs");
			rec.iygwmgbs = rset0.getInt("iygwmgbs");
			rec.iytot = rset0.getInt("iytot");
			rec.thmmvalqty = rset0.getInt("thmmvalqty");
			rec.aftcnt_tot = rset0.getInt("aftcnt_tot");
			rec.realtot = rset0.getInt("realtot");
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_QTYAPLC_ILGYEDataSet ds = (SS_L_QTYAPLC_ILGYEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_QTYAPLC_ILGYECURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_ILGYECURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBo_yymm()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.iygwygbs%>
<%= curcommlistRec.iygwmgbs%>
<%= curcommlistRec.iytot%>
<%= curcommlistRec.thmmvalqty%>
<%= curcommlistRec.aftcnt_tot%>
<%= curcommlistRec.realtot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 17:41:27 KST 2009 */