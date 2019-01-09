/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2100_MCURLIST2Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2100_MCURLIST3Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2100_MCURLIST4Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2100_MCURLIST5Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2100_MCURLIST6Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2100_MCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2100_MDataSet(){}
	public AD_BAS_2100_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			AD_BAS_2100_MCURLISTRecord rec = new AD_BAS_2100_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			AD_BAS_2100_MCURLIST2Record rec = new AD_BAS_2100_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			AD_BAS_2100_MCURLIST3Record rec = new AD_BAS_2100_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			AD_BAS_2100_MCURLIST4Record rec = new AD_BAS_2100_MCURLIST4Record();
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			AD_BAS_2100_MCURLIST5Record rec = new AD_BAS_2100_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			AD_BAS_2100_MCURLIST6Record rec = new AD_BAS_2100_MCURLIST6Record();
			rec.chrg_pers = Util.checkString(rset5.getString("chrg_pers"));
			this.curlist6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2100_MDataSet ds = (AD_BAS_2100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2100_MCURLISTRecord curlistRec = (AD_BAS_2100_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_2100_MCURLIST2Record curlist2Rec = (AD_BAS_2100_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_2100_MCURLIST3Record curlist3Rec = (AD_BAS_2100_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_2100_MCURLIST4Record curlist4Rec = (AD_BAS_2100_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_2100_MCURLIST5Record curlist5Rec = (AD_BAS_2100_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_BAS_2100_MCURLIST6Record curlist6Rec = (AD_BAS_2100_MCURLIST6Record)ds.curlist6.get(i);%>
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
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist4Rec.cdnm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cd_abrv_nm%>
<%= curlist6Rec.chrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 11:38:39 KST 2009 */