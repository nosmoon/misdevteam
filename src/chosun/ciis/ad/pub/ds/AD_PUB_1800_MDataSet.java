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
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1800_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{	
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist11 = new ArrayList();
	public ArrayList curlist12 = new ArrayList();
	public ArrayList curlist13 = new ArrayList();
	public ArrayList curlist14 = new ArrayList();
	public ArrayList curlist15 = new ArrayList();
	
	public String errcode;
	public String errmsg;

	public AD_PUB_1800_MDataSet(){}
	public AD_PUB_1800_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_PUB_1800_MCURLISTRecord rec = new AD_PUB_1800_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_PUB_1800_MCURLIST2Record rec = new AD_PUB_1800_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			AD_PUB_1800_MCURLIST3Record rec = new AD_PUB_1800_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			AD_PUB_1800_MCURLIST4Record rec = new AD_PUB_1800_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			AD_PUB_1800_MCURLIST5Record rec = new AD_PUB_1800_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			AD_PUB_1800_MCURLIST6Record rec = new AD_PUB_1800_MCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			AD_PUB_1800_MCURLIST7Record rec = new AD_PUB_1800_MCURLIST7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			AD_PUB_1800_MCURLIST8Record rec = new AD_PUB_1800_MCURLIST8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset7.getString("mang_cd_1"));
			this.curlist8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			AD_PUB_1800_MCURLIST9Record rec = new AD_PUB_1800_MCURLIST9Record();
			rec.sect_cd = Util.checkString(rset8.getString("sect_cd"));
			this.curlist9.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(16);
		while(rset9.next()){
			AD_PUB_1800_MCURLIST10Record rec = new AD_PUB_1800_MCURLIST10Record();
			rec.sect_cd = Util.checkString(rset9.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset9.getString("sect_seq"));
			this.curlist10.add(rec);
		}
		
		ResultSet rset10 = (ResultSet) cstmt.getObject(17);
		while(rset10.next()){
			AD_PUB_1800_MCURLIST11Record rec = new AD_PUB_1800_MCURLIST11Record();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset10.getString("mang_cd_1"));
			this.curlist11.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(18);
		while(rset11.next()){
			AD_PUB_1800_MCURLIST11Record rec = new AD_PUB_1800_MCURLIST11Record();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset11.getString("mang_cd_1"));
			this.curlist12.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(19);
		while(rset12.next()){
			AD_PUB_1800_MCURLIST11Record rec = new AD_PUB_1800_MCURLIST11Record();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset12.getString("mang_cd_1"));
			this.curlist13.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(20);
		while(rset13.next()){
			AD_PUB_1800_MCURLIST11Record rec = new AD_PUB_1800_MCURLIST11Record();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset13.getString("mang_cd_1"));
			this.curlist14.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(21);
		while(rset14.next()){
			AD_PUB_1800_MCURLIST5Record rec = new AD_PUB_1800_MCURLIST5Record();
			rec.cd = Util.checkString(rset14.getString("cd"));
			rec.cdnm = Util.checkString(rset14.getString("cdnm"));
			this.curlist15.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1800_MDataSet ds = (AD_PUB_1800_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_1800_MCURLISTRecord curlistRec = (AD_PUB_1800_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_1800_MCURLIST2Record curlist2Rec = (AD_PUB_1800_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_PUB_1800_MCURLIST3Record curlist3Rec = (AD_PUB_1800_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_PUB_1800_MCURLIST4Record curlist4Rec = (AD_PUB_1800_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_PUB_1800_MCURLIST5Record curlist5Rec = (AD_PUB_1800_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_PUB_1800_MCURLIST6Record curlist6Rec = (AD_PUB_1800_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		AD_PUB_1800_MCURLIST7Record curlist7Rec = (AD_PUB_1800_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		AD_PUB_1800_MCURLIST8Record curlist8Rec = (AD_PUB_1800_MCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		AD_PUB_1800_MCURLIST9Record curlist9Rec = (AD_PUB_1800_MCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		AD_PUB_1800_MCURLIST10Record curlist10Rec = (AD_PUB_1800_MCURLIST10Record)ds.curlist10.get(i);%>
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
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
<%= ds.getCurlist10()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.mang_cd_1%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist6Rec.cd_abrv_nm%>
<%= curlist7Rec.cd%>
<%= curlist7Rec.cd_abrv_nm%>
<%= curlist8Rec.cd%>
<%= curlist8Rec.cdnm%>
<%= curlist8Rec.mang_cd_1%>
<%= curlist9Rec.sect_cd%>
<%= curlist10Rec.sect_cd%>
<%= curlist10Rec.sect_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 16:40:24 KST 2009 */