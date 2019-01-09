/***************************************************************************************************
* 파일명 : SE_SND_2500_MDataSet.java
* 기능 : 판매-발송관리-발송비청구
* 작성일자 : 2009-02-24
* 작성자 : 김대준
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


public class SE_SND_2500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist 	= new ArrayList();
	public ArrayList routelist	= new ArrayList();
	public ArrayList prtlist	= new ArrayList();
	public ArrayList medilist	= new ArrayList();
	public ArrayList cmpylist	= new ArrayList();
	public ArrayList stmtlist	= new ArrayList();
	public ArrayList rcptlist	= new ArrayList();
	public ArrayList mthdlist	= new ArrayList();
	public ArrayList sectlist	= new ArrayList();
	public ArrayList banklist	= new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2500_MDataSet(){}
	public SE_SND_2500_MDataSet(String errcode, String errmsg){
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_SND_2500_MCURLISTRecord rec = new SE_SND_2500_MCURLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.curlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_SND_2500_MROUTELISTRecord rec = new SE_SND_2500_MROUTELISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.routelist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SE_SND_2500_MPRTLISTRecord rec = new SE_SND_2500_MPRTLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.prtlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_SND_2500_MMEDILISTRecord rec = new SE_SND_2500_MMEDILISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.medilist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_SND_2500_MCMPYLISTRecord rec = new SE_SND_2500_MCMPYLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.cmpylist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SND_2500_MSTMTLISTRecord rec = new SE_SND_2500_MSTMTLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.stmtlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_SND_2500_MRCPTLISTRecord rec = new SE_SND_2500_MRCPTLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.rcptlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SE_SND_2500_MMTHDLISTRecord rec = new SE_SND_2500_MMTHDLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.mthdlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SE_SND_2500_MSECTLISTRecord rec = new SE_SND_2500_MSECTLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.mang_cd_1 	= Util.checkString(rset0.getString("mang_cd_1"	));
			this.sectlist.add(rec);
		}
		
		rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SE_SND_2500_MBANKLISTRecord rec = new SE_SND_2500_MBANKLISTRecord();
			rec.cd 			= Util.checkString(rset0.getString("cd"			));
			rec.cdnm 		= Util.checkString(rset0.getString("cdnm"		));
			rec.cd_abrv_nm 	= Util.checkString(rset0.getString("cd_abrv_nm"	));
			this.banklist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2500_MDataSet ds = (SE_SND_2500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2500_MCURLISTRecord curlistRec = (SE_SND_2500_MCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 19:54:16 KST 2009 */