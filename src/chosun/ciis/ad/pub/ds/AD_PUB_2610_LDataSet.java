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
import chosun.ciis.ad.pub.rec.AD_PUB_2610_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sec_no;

	public AD_PUB_2610_LDataSet(){}
	public AD_PUB_2610_LDataSet(String errcode, String errmsg, String sec_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sec_no = sec_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSec_no(String sec_no){
		this.sec_no = sec_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSec_no(){
		return this.sec_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.sec_no = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_PUB_2610_LCURLISTRecord rec = new AD_PUB_2610_LCURLISTRecord();
			rec.dt = Util.checkString(rset0.getString("dt"));
			rec.yoil = Util.checkString(rset0.getString("yoil"));
			rec.day_tot = Util.checkString(rset0.getString("day_tot"));
			rec.day_myun = Util.checkString(rset0.getString("day_myun"));
			rec.prv_dt = Util.checkString(rset0.getString("prv_dt"));
			rec.prv_yoil = Util.checkString(rset0.getString("prv_yoil"));
			rec.prv_day_tot = Util.checkString(rset0.getString("prv_day_tot"));
			rec.prv_day_myun = Util.checkString(rset0.getString("prv_day_myun"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2610_LDataSet ds = (AD_PUB_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2610_LCURLISTRecord curlistRec = (AD_PUB_2610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSec_no()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dt%>
<%= curlistRec.yoil%>
<%= curlistRec.day_tot%>
<%= curlistRec.day_myun%>
<%= curlistRec.prv_dt%>
<%= curlistRec.prv_yoil%>
<%= curlistRec.prv_day_tot%>
<%= curlistRec.prv_day_myun%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 19:29:17 KST 2009 */