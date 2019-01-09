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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_9501_LDataSet(){}
	public MT_ETCCAR_9501_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_9501_LCURLISTRecord rec = new MT_ETCCAR_9501_LCURLISTRecord();
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.cd01 = Util.checkString(rset0.getString("cd01"));
			rec.cd02 = Util.checkString(rset0.getString("cd02"));
			rec.cd03 = Util.checkString(rset0.getString("cd03"));
			rec.cd04 = Util.checkString(rset0.getString("cd04"));
			rec.cd05 = Util.checkString(rset0.getString("cd05"));
			rec.cd06 = Util.checkString(rset0.getString("cd06"));
			rec.cd07 = Util.checkString(rset0.getString("cd07"));
			rec.cd08 = Util.checkString(rset0.getString("cd08"));
			rec.cd09 = Util.checkString(rset0.getString("cd09"));
			rec.cd10 = Util.checkString(rset0.getString("cd10"));
			rec.cd11 = Util.checkString(rset0.getString("cd11"));
			rec.cd12 = Util.checkString(rset0.getString("cd12"));
			rec.cd13 = Util.checkString(rset0.getString("cd13"));
			rec.cd14 = Util.checkString(rset0.getString("cd14"));
			rec.cd15 = Util.checkString(rset0.getString("cd15"));
			rec.cd16 = Util.checkString(rset0.getString("cd16"));
			rec.cd17 = Util.checkString(rset0.getString("cd17"));
			rec.cd18 = Util.checkString(rset0.getString("cd18"));
			rec.cd19 = Util.checkString(rset0.getString("cd19"));
			rec.cd20 = Util.checkString(rset0.getString("cd20"));
			rec.cd21 = Util.checkString(rset0.getString("cd21"));
			rec.cd22 = Util.checkString(rset0.getString("cd22"));
			rec.cd23 = Util.checkString(rset0.getString("cd23"));
			rec.cd24 = Util.checkString(rset0.getString("cd24"));
			rec.cd25 = Util.checkString(rset0.getString("cd25"));
			rec.cd26 = Util.checkString(rset0.getString("cd26"));
			rec.cd27 = Util.checkString(rset0.getString("cd27"));
			rec.cd28 = Util.checkString(rset0.getString("cd28"));
			rec.cd29 = Util.checkString(rset0.getString("cd29"));
			rec.cd30 = Util.checkString(rset0.getString("cd30"));
			rec.cd31 = Util.checkString(rset0.getString("cd31"));
			rec.cd00 = Util.checkString(rset0.getString("cd00"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_9501_LDataSet ds = (MT_ETCCAR_9501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_9501_LCURLISTRecord curlistRec = (MT_ETCCAR_9501_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.drvr_nm%>
<%= curlistRec.cd01%>
<%= curlistRec.cd02%>
<%= curlistRec.cd03%>
<%= curlistRec.cd04%>
<%= curlistRec.cd05%>
<%= curlistRec.cd06%>
<%= curlistRec.cd07%>
<%= curlistRec.cd08%>
<%= curlistRec.cd09%>
<%= curlistRec.cd10%>
<%= curlistRec.cd11%>
<%= curlistRec.cd12%>
<%= curlistRec.cd13%>
<%= curlistRec.cd14%>
<%= curlistRec.cd15%>
<%= curlistRec.cd16%>
<%= curlistRec.cd17%>
<%= curlistRec.cd18%>
<%= curlistRec.cd19%>
<%= curlistRec.cd20%>
<%= curlistRec.cd21%>
<%= curlistRec.cd22%>
<%= curlistRec.cd23%>
<%= curlistRec.cd24%>
<%= curlistRec.cd25%>
<%= curlistRec.cd26%>
<%= curlistRec.cd27%>
<%= curlistRec.cd28%>
<%= curlistRec.cd29%>
<%= curlistRec.cd30%>
<%= curlistRec.cd31%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 13 11:05:19 KST 2012 */