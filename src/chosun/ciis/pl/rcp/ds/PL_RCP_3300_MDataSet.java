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


package chosun.ciis.pl.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_3300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList colt_clsfcur = new ArrayList();
	public ArrayList setup_statcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3300_MDataSet(){}
	public PL_RCP_3300_MDataSet(String errcode, String errmsg){
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

		ResultSet rset6 = (ResultSet) cstmt.getObject(5);
		while(rset6.next()){
			PL_RCP_3300_MCOLT_CLSFCURRecord rec = new PL_RCP_3300_MCOLT_CLSFCURRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.colt_clsfcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(6);
		while(rset7.next()){
			PL_RCP_3300_MSETUP_STATCURRecord rec = new PL_RCP_3300_MSETUP_STATCURRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.setup_statcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_RCP_3300_MDataSet ds = (PL_RCP_3300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.colt_clsfcur.size(); i++){
		PL_RCP_3300_MCOLT_CLSFCURRecord colt_clsfcurRec = (PL_RCP_3300_MCOLT_CLSFCURRecord)ds.colt_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.setup_statcur.size(); i++){
		PL_RCP_3300_MSETUP_STATCURRecord setup_statcurRec = (PL_RCP_3300_MSETUP_STATCURRecord)ds.setup_statcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getColt_clsfcur()%>
<%= ds.getSetup_statcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= colt_clsfcurRec.cd%>
<%= colt_clsfcurRec.cdnm%>
<%= colt_clsfcurRec.cd_abrv_nm%>
<%= colt_clsfcurRec.cdnm_cd%>
<%= colt_clsfcurRec.cdabrvnm_cd%>
<%= setup_statcurRec.cd%>
<%= setup_statcurRec.cdnm%>
<%= setup_statcurRec.cd_abrv_nm%>
<%= setup_statcurRec.cdnm_cd%>
<%= setup_statcurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */