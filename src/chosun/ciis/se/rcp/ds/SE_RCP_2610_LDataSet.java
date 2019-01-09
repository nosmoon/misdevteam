/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_2610_LDataSet(){}
	public SE_RCP_2610_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_RCP_2610_LCURLISTRecord rec = new SE_RCP_2610_LCURLISTRecord();
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.rcpm_no = Util.checkString(rset0.getString("rcpm_no"));
			rec.drcr_clsf = Util.checkString(rset0.getString("drcr_clsf"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.patr_budg_cd = Util.checkString(rset0.getString("patr_budg_cd"));
			rec.dtlremk = Util.checkString(rset0.getString("dtlremk"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SE_RCP_2610_LCURLIST2Record rec = new SE_RCP_2610_LCURLIST2Record();
			rec.cyov_bal = Util.checkString(rset1.getString("cyov_bal"));
			rec.net_sale_amt = Util.checkString(rset1.getString("net_sale_amt"));
			rec.rcpm_amt = Util.checkString(rset1.getString("rcpm_amt"));
			rec.bal = Util.checkString(rset1.getString("bal"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SE_RCP_2610_LCURLIST3Record rec = new SE_RCP_2610_LCURLIST3Record();
			rec.cyov_bal = Util.checkString(rset2.getString("cyov_bal"));
			rec.rcpm_amt = Util.checkString(rset2.getString("rcpm_amt"));
			rec.bal = Util.checkString(rset2.getString("bal"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_2610_LDataSet ds = (SE_RCP_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_2610_LCURLISTRecord curlistRec = (SE_RCP_2610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		SE_RCP_2610_LCURLIST2Record curlist2Rec = (SE_RCP_2610_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		SE_RCP_2610_LCURLIST3Record curlist3Rec = (SE_RCP_2610_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rcpm_dt%>
<%= curlistRec.rcpm_no%>
<%= curlistRec.drcr_clsf%>
<%= curlistRec.name%>
<%= curlistRec.amt%>
<%= curlistRec.budg_cd%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.dtlremk%>
<%= curlist2Rec.cyov_bal%>
<%= curlist2Rec.net_sale_amt%>
<%= curlist2Rec.rcpm_amt%>
<%= curlist2Rec.bal%>
<%= curlist3Rec.cyov_bal%>
<%= curlist3Rec.rcpm_amt%>
<%= curlist3Rec.bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 10:55:47 KST 2009 */