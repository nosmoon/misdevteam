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


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList uprclist = new ArrayList();
	public ArrayList decidlist = new ArrayList();
	public ArrayList routelist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList qtylist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String col_cnt;

	public SE_SND_2400_MDataSet(){}
	public SE_SND_2400_MDataSet(String errcode, String errmsg, String medi_cd, String medi_nm, String sect_cd, String sect_nm, String col_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.medi_nm = medi_nm;
		this.sect_cd = sect_cd;
		this.sect_nm = sect_nm;
		this.col_cnt = col_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setCol_cnt(String col_cnt){
		this.col_cnt = col_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getCol_cnt(){
		return this.col_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_cd = Util.checkString(cstmt.getString(5));
		this.medi_nm = Util.checkString(cstmt.getString(6));
		this.sect_cd = Util.checkString(cstmt.getString(7));
		this.sect_nm = Util.checkString(cstmt.getString(8));
		this.col_cnt = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SND_2400_MCURLISTRecord rec = new SE_SND_2400_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SE_SND_2400_MROUTELISTRecord rec = new SE_SND_2400_MROUTELISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.routelist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			SE_SND_2400_MQTYLISTRecord rec = new SE_SND_2400_MQTYLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.qtylist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(13);
		while(rset3.next()){
			SE_SND_2400_MUPRCLISTRecord rec = new SE_SND_2400_MUPRCLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.uprclist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(14);
		while(rset4.next()){
			SE_SND_2400_MDECIDLISTRecord rec = new SE_SND_2400_MDECIDLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.decidlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2400_MDataSet ds = (SE_SND_2400_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2400_MCURLISTRecord curlistRec = (SE_SND_2400_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_2400_MROUTELISTRecord routelistRec = (SE_SND_2400_MROUTELISTRecord)ds.routelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.qtylist.size(); i++){
		SE_SND_2400_MQTYLISTRecord qtylistRec = (SE_SND_2400_MQTYLISTRecord)ds.qtylist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.uprclist.size(); i++){
		SE_SND_2400_MUPRCLISTRecord uprclistRec = (SE_SND_2400_MUPRCLISTRecord)ds.uprclist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.decidlist.size(); i++){
		SE_SND_2400_MDECIDLISTRecord decidlistRec = (SE_SND_2400_MDECIDLISTRecord)ds.decidlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getMedi_nm()%>
<%= ds.getSect_cd()%>
<%= ds.getSect_nm()%>
<%= ds.getCol_cnt()%>
<%= ds.getCurlist()%>
<%= ds.getRoutelist()%>
<%= ds.getQtylist()%>
<%= ds.getUprclist()%>
<%= ds.getDecidlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
<%= qtylistRec.cd%>
<%= qtylistRec.cdnm%>
<%= qtylistRec.cd_abrv_nm%>
<%= uprclistRec.cd%>
<%= uprclistRec.cdnm%>
<%= uprclistRec.cd_abrv_nm%>
<%= decidlistRec.cd%>
<%= decidlistRec.cdnm%>
<%= decidlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 12:48:07 KST 2009 */