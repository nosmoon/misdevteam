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


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_2710_LCURLIST2Record;
import chosun.ciis.ad.pub.rec.AD_PUB_2710_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pubc_cnt;
	public String plane;

	public AD_PUB_2710_LDataSet(){}
	public AD_PUB_2710_LDataSet(String errcode, String errmsg, String pubc_cnt, String plane){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pubc_cnt = pubc_cnt;
		this.plane = plane;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPubc_cnt(String pubc_cnt){
		this.pubc_cnt = pubc_cnt;
	}

	public void setPlane(String plane){
		this.plane = plane;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPubc_cnt(){
		return this.pubc_cnt;
	}

	public String getPlane(){
		return this.plane;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.pubc_cnt = Util.checkString(cstmt.getString(14));
		this.plane = Util.checkString(cstmt.getString(15));
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			AD_PUB_2710_LCURLISTRecord rec = new AD_PUB_2710_LCURLISTRecord();
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.cgjavfee = Util.checkString(rset0.getString("cgjavfee"));
			rec.bgjavfee = Util.checkString(rset0.getString("bgjavfee"));
			rec.gjavfee = Util.checkString(rset0.getString("gjavfee"));
			rec.pubc_cnt = Util.checkString(rset0.getString("pubc_cnt"));
			rec.cplane = Util.checkString(rset0.getString("cplane"));
			rec.bplane = Util.checkString(rset0.getString("bplane"));
			rec.plane = Util.checkString(rset0.getString("plane"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(17);
		while(rset1.next()){
			AD_PUB_2710_LCURLIST2Record rec = new AD_PUB_2710_LCURLIST2Record();
			rec.yoil = Util.checkString(rset1.getString("yoil"));
			rec.cgjavfee = Util.checkString(rset1.getString("cgjavfee"));
			rec.bgjavfee = Util.checkString(rset1.getString("bgjavfee"));
			rec.gjavfee = Util.checkString(rset1.getString("gjavfee"));
			rec.pubc_cnt = Util.checkString(rset1.getString("pubc_cnt"));
			rec.cplane = Util.checkString(rset1.getString("cplane"));
			rec.bplane = Util.checkString(rset1.getString("bplane"));
			rec.plane = Util.checkString(rset1.getString("plane"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2710_LDataSet ds = (AD_PUB_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2710_LCURLISTRecord curlistRec = (AD_PUB_2710_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_2710_LCURLIST2Record curlist2Rec = (AD_PUB_2710_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPubc_cnt()%>
<%= ds.getPlane()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yoil%>
<%= curlistRec.cgjavfee%>
<%= curlistRec.bgjavfee%>
<%= curlistRec.gjavfee%>
<%= curlistRec.pubc_cnt%>
<%= curlistRec.cplane%>
<%= curlistRec.bplane%>
<%= curlistRec.plane%>
<%= curlist2Rec.yoil%>
<%= curlist2Rec.cgjavfee%>
<%= curlist2Rec.bgjavfee%>
<%= curlist2Rec.gjavfee%>
<%= curlist2Rec.pubc_cnt%>
<%= curlist2Rec.cplane%>
<%= curlist2Rec.bplane%>
<%= curlist2Rec.plane%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 15:48:23 KST 2009 */