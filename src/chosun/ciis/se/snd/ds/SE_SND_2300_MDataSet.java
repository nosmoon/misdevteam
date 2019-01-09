/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class SE_SND_2300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cmpylist = new ArrayList();
	public ArrayList setl_banklist = new ArrayList();
	public ArrayList routelist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList tran_uprclist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2300_MDataSet(){}
	public SE_SND_2300_MDataSet(String errcode, String errmsg){
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
			SE_SND_2300_MCURLISTRecord rec = new SE_SND_2300_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_SND_2300_MROUTELISTRecord rec = new SE_SND_2300_MROUTELISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.routelist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_SND_2300_MCMPYLISTRecord rec = new SE_SND_2300_MCMPYLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.cmpylist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			SE_SND_2300_MTRAN_UPRCLISTRecord rec = new SE_SND_2300_MTRAN_UPRCLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.tran_uprclist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			SE_SND_2300_MSETL_BANKLISTRecord rec = new SE_SND_2300_MSETL_BANKLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.setl_banklist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2300_MDataSet ds = (SE_SND_2300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2300_MCURLISTRecord curlistRec = (SE_SND_2300_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_2300_MROUTELISTRecord routelistRec = (SE_SND_2300_MROUTELISTRecord)ds.routelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cmpylist.size(); i++){
		SE_SND_2300_MCMPYLISTRecord cmpylistRec = (SE_SND_2300_MCMPYLISTRecord)ds.cmpylist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.tran_uprclist.size(); i++){
		SE_SND_2300_MTRAN_UPRCLISTRecord tran_uprclistRec = (SE_SND_2300_MTRAN_UPRCLISTRecord)ds.tran_uprclist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.setl_banklist.size(); i++){
		SE_SND_2300_MSETL_BANKLISTRecord setl_banklistRec = (SE_SND_2300_MSETL_BANKLISTRecord)ds.setl_banklist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRoutelist()%>
<%= ds.getCmpylist()%>
<%= ds.getTran_uprclist()%>
<%= ds.getSetl_banklist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
<%= cmpylistRec.cd%>
<%= cmpylistRec.cdnm%>
<%= cmpylistRec.cd_abrv_nm%>
<%= tran_uprclistRec.cd%>
<%= tran_uprclistRec.cdnm%>
<%= tran_uprclistRec.cd_abrv_nm%>
<%= setl_banklistRec.cd%>
<%= setl_banklistRec.cdnm%>
<%= setl_banklistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 18 20:01:13 KST 2009 */