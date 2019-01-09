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


public class SS_L_EXCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXCDDataSet(){}
	public SS_L_EXCDDataSet(String errcode, String errmsg){
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
			SS_L_EXCDCURCOMMLISTRecord rec = new SS_L_EXCDCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.extncdusagenm = Util.checkString(rset0.getString("extncdusagenm"));
			rec.resitypenm = Util.checkString(rset0.getString("resitypenm"));
			rec.bns1_00 = Util.checkString(rset0.getString("bns1_00"));
			rec.bns2_00 = Util.checkString(rset0.getString("bns2_00"));
			rec.bns3_00 = Util.checkString(rset0.getString("bns3_00"));
			rec.bns4_00 = Util.checkString(rset0.getString("bns4_00"));
			rec.bns5_00 = Util.checkString(rset0.getString("bns5_00"));
			rec.bns1_01 = Util.checkString(rset0.getString("bns1_01"));
			rec.bns2_01 = Util.checkString(rset0.getString("bns2_01"));
			rec.bns3_01 = Util.checkString(rset0.getString("bns3_01"));
			rec.bns4_01 = Util.checkString(rset0.getString("bns4_01"));
			rec.bns5_01 = Util.checkString(rset0.getString("bns5_01"));
			rec.medi1_00 = Util.checkString(rset0.getString("medi1_00"));
			rec.medi2_00 = Util.checkString(rset0.getString("medi2_00"));
			rec.medi3_00 = Util.checkString(rset0.getString("medi3_00"));
			rec.medi4_00 = Util.checkString(rset0.getString("medi4_00"));
			rec.medi5_00 = Util.checkString(rset0.getString("medi5_00"));
			rec.medi6_00 = Util.checkString(rset0.getString("medi6_00"));
			rec.medi7_00 = Util.checkString(rset0.getString("medi7_00"));
			rec.medi1_01 = Util.checkString(rset0.getString("medi1_01"));
			rec.medi2_01 = Util.checkString(rset0.getString("medi2_01"));
			rec.medi3_01 = Util.checkString(rset0.getString("medi3_01"));
			rec.medi4_01 = Util.checkString(rset0.getString("medi4_01"));
			rec.medi5_01 = Util.checkString(rset0.getString("medi5_01"));
			rec.medi6_01 = Util.checkString(rset0.getString("medi6_01"));
			rec.medi7_01 = Util.checkString(rset0.getString("medi7_01"));
			rec.giftcard_00 = Util.checkString(rset0.getString("giftcard_00"));
			rec.giftcard_01 = Util.checkString(rset0.getString("giftcard_01"));
			rec.servimm_00 = Util.checkString(rset0.getString("servimm_00"));
			rec.servimm_01 = Util.checkString(rset0.getString("servimm_01"));
			rec.rflyn00 = Util.checkString(rset0.getString("rflyn00"));
			rec.rflyn01 = Util.checkString(rset0.getString("rflyn01"));
			rec.extncdusage = Util.checkString(rset0.getString("extncdusage"));
			rec.resitype = Util.checkString(rset0.getString("resitype"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EXCDDataSet ds = (SS_L_EXCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_EXCDCURCOMMLISTRecord curcommlistRec = (SS_L_EXCDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.extncdusagenm%>
<%= curcommlistRec.resitypenm%>
<%= curcommlistRec.bns1_00%>
<%= curcommlistRec.bns2_00%>
<%= curcommlistRec.bns3_00%>
<%= curcommlistRec.bns4_00%>
<%= curcommlistRec.bns5_00%>
<%= curcommlistRec.bns1_01%>
<%= curcommlistRec.bns2_01%>
<%= curcommlistRec.bns3_01%>
<%= curcommlistRec.bns4_01%>
<%= curcommlistRec.bns5_01%>
<%= curcommlistRec.medi1_00%>
<%= curcommlistRec.medi2_00%>
<%= curcommlistRec.medi3_00%>
<%= curcommlistRec.medi4_00%>
<%= curcommlistRec.medi5_00%>
<%= curcommlistRec.medi6_00%>
<%= curcommlistRec.medi7_00%>
<%= curcommlistRec.medi1_01%>
<%= curcommlistRec.medi2_01%>
<%= curcommlistRec.medi3_01%>
<%= curcommlistRec.medi4_01%>
<%= curcommlistRec.medi5_01%>
<%= curcommlistRec.medi6_01%>
<%= curcommlistRec.medi7_01%>
<%= curcommlistRec.giftcard_00%>
<%= curcommlistRec.giftcard_01%>
<%= curcommlistRec.servimm_00%>
<%= curcommlistRec.servimm_01%>
<%= curcommlistRec.rflyn00%>
<%= curcommlistRec.rflyn01%>
<%= curcommlistRec.extncdusage%>
<%= curcommlistRec.resitype%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 13:27:20 KST 2015 */