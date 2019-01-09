/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2007-05-22
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sellnetclsflist = new ArrayList();
	public ArrayList valaplybasiclsflist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long rownum;

	public SE_QTY_1000_MDataSet(){}
	public SE_QTY_1000_MDataSet(String errcode, String errmsg, long rownum){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rownum = rownum;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRownum(long rownum){
		this.rownum = rownum;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getRownum(){
		return this.rownum;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rownum = cstmt.getLong(5);
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_QTY_1000_MMEDILISTRecord rec = new SE_QTY_1000_MMEDILISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medilist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SE_QTY_1000_MSELLNETCLSFLISTRecord rec = new SE_QTY_1000_MSELLNETCLSFLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.sellnetclsflist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SE_QTY_1000_MVALAPLYBASICLSFLISTRecord rec = new SE_QTY_1000_MVALAPLYBASICLSFLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.valaplybasiclsflist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_1000_MDataSet ds = (SE_QTY_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_QTY_1000_MMEDILISTRecord medilistRec = (SE_QTY_1000_MMEDILISTRecord)ds.medilist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sellnetclsflist.size(); i++){
		SE_QTY_1000_MSELLNETCLSFLISTRecord sellnetclsflistRec = (SE_QTY_1000_MSELLNETCLSFLISTRecord)ds.sellnetclsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.valaplybasiclsflist.size(); i++){
		SE_QTY_1000_MVALAPLYBASICLSFLISTRecord valaplybasiclsflistRec = (SE_QTY_1000_MVALAPLYBASICLSFLISTRecord)ds.valaplybasiclsflist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRownum()%>
<%= ds.getMedilist()%>
<%= ds.getSellnetclsflist()%>
<%= ds.getValaplybasiclsflist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= sellnetclsflistRec.cd%>
<%= sellnetclsflistRec.cdnm%>
<%= sellnetclsflistRec.cd_abrv_nm%>
<%= sellnetclsflistRec.cdnm_cd%>
<%= sellnetclsflistRec.cdabrvnm_cd%>
<%= valaplybasiclsflistRec.cd%>
<%= valaplybasiclsflistRec.cdnm%>
<%= valaplybasiclsflistRec.cd_abrv_nm%>
<%= valaplybasiclsflistRec.cdnm_cd%>
<%= valaplybasiclsflistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 15:11:49 KST 2009 */