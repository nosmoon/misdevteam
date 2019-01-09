/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 원가
* 작성일자 : 2010-07-07
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_6100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList factlist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bgn_yymm;
	public String end_yymm;

	public MT_CLOSE_6100_MDataSet(){}
	public MT_CLOSE_6100_MDataSet(String errcode, String errmsg, String bgn_yymm, String end_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bgn_yymm = bgn_yymm;
		this.end_yymm = end_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBgn_yymm(String bgn_yymm){
		this.bgn_yymm = bgn_yymm;
	}

	public void setEnd_yymm(String end_yymm){
		this.end_yymm = end_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBgn_yymm(){
		return this.bgn_yymm;
	}

	public String getEnd_yymm(){
		return this.end_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bgn_yymm = Util.checkString(cstmt.getString(6));
		this.end_yymm = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_CLOSE_6100_MMEDILISTRecord rec = new MT_CLOSE_6100_MMEDILISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medilist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_CLOSE_6100_MFACTLISTRecord rec = new MT_CLOSE_6100_MFACTLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.factlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_6100_MDataSet ds = (MT_CLOSE_6100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		MT_CLOSE_6100_MMEDILISTRecord medilistRec = (MT_CLOSE_6100_MMEDILISTRecord)ds.medilist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.factlist.size(); i++){
		MT_CLOSE_6100_MFACTLISTRecord factlistRec = (MT_CLOSE_6100_MFACTLISTRecord)ds.factlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBgn_yymm()%>
<%= ds.getEnd_yymm()%>
<%= ds.getMedilist()%>
<%= ds.getFactlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= factlistRec.cd%>
<%= factlistRec.cdnm%>
<%= factlistRec.cd_abrv_nm%>
<%= factlistRec.cdnm_cd%>
<%= factlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 07 14:50:01 KST 2010 */