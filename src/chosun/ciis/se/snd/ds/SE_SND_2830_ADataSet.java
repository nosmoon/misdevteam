/***************************************************************************************************
* 파일명 : SE_SND_2830_ADataSet.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-26
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


public class SE_SND_2830_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList hlist 	= new ArrayList();
	public ArrayList dlist 	= new ArrayList();
	public ArrayList slist 	= new ArrayList();
	public ArrayList plist 	= new ArrayList();
	public String issu_dt;
	public String errcode;
	public String errmsg;

	public SE_SND_2830_ADataSet(){}
	public SE_SND_2830_ADataSet(String errcode, String errmsg){
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
		this.errcode 				= Util.checkString(cstmt.getString(1));
		this.errmsg 				= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 			= (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			SE_SND_2830_AHLISTRecord rec = new SE_SND_2830_AHLISTRecord();
			rec.col 				= Util.checkString(rset0.getString("col"			));
			
			this.hlist.add(rec);
		}
		
		rset0 						= (ResultSet) cstmt.getObject(24);
		while(rset0.next()){
			SE_SND_2830_ADLISTRecord rec = new SE_SND_2830_ADLISTRecord();
			rec.col 				= Util.checkString(rset0.getString("col"			));
			
			this.dlist.add(rec);
		}
		
		rset0 						= (ResultSet) cstmt.getObject(25);
		while(rset0.next()){
			SE_SND_2830_ASLISTRecord rec = new SE_SND_2830_ASLISTRecord();
			rec.col 				= Util.checkString(rset0.getString("col"			));
			
			this.slist.add(rec);
		}
		
		rset0 						= (ResultSet) cstmt.getObject(26);
		while(rset0.next()){
			SE_SND_2830_APLISTRecord rec = new SE_SND_2830_APLISTRecord();
			rec.col 				= Util.checkString(rset0.getString("col"			));
			
			this.plist.add(rec);
		}
		this.issu_dt				= Util.checkString(cstmt.getString(27));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2820_LDataSet ds = (SE_SND_2820_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2820_LCURLISTRecord curlistRec = (SE_SND_2820_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.issu_dt%>
<%= curlistRec.clos_tms%>
<%= curlistRec.route_clsf%>
<%= curlistRec.prt_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pcnt%>
<%= curlistRec.clr_pcnt%>
<%= curlistRec.add_prt_seq%>
<%= curlistRec.qty%>
<%= curlistRec.send_yn%>
<%= curlistRec.send_medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 15:04:40 KST 2009 */