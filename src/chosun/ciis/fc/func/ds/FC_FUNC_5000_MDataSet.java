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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_5000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_insr_clsf_cdlist = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_fisc_aprv_stat;
	public String xx_insr_stat_cd;

	public FC_FUNC_5000_MDataSet(){}
	public FC_FUNC_5000_MDataSet(String errcode, String errmsg, String xx_fisc_aprv_stat, String xx_insr_stat_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_fisc_aprv_stat = xx_fisc_aprv_stat;
		this.xx_insr_stat_cd = xx_insr_stat_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_fisc_aprv_stat(String xx_fisc_aprv_stat){
		this.xx_fisc_aprv_stat = xx_fisc_aprv_stat;
	}

	public void setXx_insr_stat_cd(String xx_insr_stat_cd){
		this.xx_insr_stat_cd = xx_insr_stat_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_fisc_aprv_stat(){
		return this.xx_fisc_aprv_stat;
	}

	public String getXx_insr_stat_cd(){
		return this.xx_insr_stat_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_5000_MCURLISTRecord rec = new FC_FUNC_5000_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_5000_MCURLIST2Record rec = new FC_FUNC_5000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_FUNC_5000_MXX_INSR_CLSF_CDLISTRecord rec = new FC_FUNC_5000_MXX_INSR_CLSF_CDLISTRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.xx_insr_clsf_cdlist.add(rec);
		}
		this.xx_fisc_aprv_stat = Util.checkString(cstmt.getString(8));
		this.xx_insr_stat_cd = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_5000_MDataSet ds = (FC_FUNC_5000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_5000_MCURLISTRecord curlistRec = (FC_FUNC_5000_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_5000_MCURLIST2Record curlist2Rec = (FC_FUNC_5000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_insr_clsf_cdlist.size(); i++){
		FC_FUNC_5000_MXX_INSR_CLSF_CDLISTRecord xx_insr_clsf_cdlistRec = (FC_FUNC_5000_MXX_INSR_CLSF_CDLISTRecord)ds.xx_insr_clsf_cdlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getXx_insr_clsf_cdlist()%>
<%= ds.getXx_fisc_aprv_stat()%>
<%= ds.getXx_insr_stat_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.cdnm_cd%>
<%= curlistRec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= xx_insr_clsf_cdlistRec.cd_nm%>
<%= xx_insr_clsf_cdlistRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 06 17:10:11 KST 2012 */