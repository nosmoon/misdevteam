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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_2330_LCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2330_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2330_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String start_dt;
	public String pubc_dt;

	public AD_DEP_2330_LDataSet(){}
	public AD_DEP_2330_LDataSet(String errcode, String errmsg, String start_dt, String pubc_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.start_dt = start_dt;
		this.pubc_dt = pubc_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.start_dt = Util.checkString(cstmt.getString(6));
		this.pubc_dt = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_DEP_2330_LCURLISTRecord rec = new AD_DEP_2330_LCURLISTRecord();
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			AD_DEP_2330_LCURLIST2Record rec = new AD_DEP_2330_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.pubc_amt = Util.checkString(rset1.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset1.getString("rcpm_amt"));
			rec.tot_rcpm_amt = Util.checkString(rset1.getString("tot_rcpm_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2330_LDataSet ds = (AD_DEP_2330_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2330_LCURLISTRecord curlistRec = (AD_DEP_2330_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_2330_LCURLIST2Record curlist2Rec = (AD_DEP_2330_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStart_dt()%>
<%= ds.getPubc_dt()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.mchrg_pers%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.pubc_amt%>
<%= curlist2Rec.rcpm_amt%>
<%= curlist2Rec.tot_rcpm_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 19:07:28 KST 2009 */