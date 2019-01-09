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


package chosun.ciis.pl.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1800_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rate_basicur = new ArrayList();
	public ArrayList issu_cmpycur = new ArrayList();
	public ArrayList hndlmedi_clsfcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_BAS_1800_MDataSet(){}
	public PL_BAS_1800_MDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			PL_BAS_1800_MISSU_CMPYCURRecord rec = new PL_BAS_1800_MISSU_CMPYCURRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.issu_cmpycur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			PL_BAS_1800_MHNDLMEDI_CLSFCURRecord rec = new PL_BAS_1800_MHNDLMEDI_CLSFCURRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.hndlmedi_clsfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			PL_BAS_1800_MRATE_BASICURRecord rec = new PL_BAS_1800_MRATE_BASICURRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.rate_basicur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PL_BAS_1800_MDataSet ds = (PL_BAS_1800_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.issu_cmpycur.size(); i++){
		PL_BAS_1800_MISSU_CMPYCURRecord issu_cmpycurRec = (PL_BAS_1800_MISSU_CMPYCURRecord)ds.issu_cmpycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hndlmedi_clsfcur.size(); i++){
		PL_BAS_1800_MHNDLMEDI_CLSFCURRecord hndlmedi_clsfcurRec = (PL_BAS_1800_MHNDLMEDI_CLSFCURRecord)ds.hndlmedi_clsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rate_basicur.size(); i++){
		PL_BAS_1800_MRATE_BASICURRecord rate_basicurRec = (PL_BAS_1800_MRATE_BASICURRecord)ds.rate_basicur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_cmpycur()%>
<%= ds.getHndlmedi_clsfcur()%>
<%= ds.getRate_basicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= issu_cmpycurRec.cd%>
<%= issu_cmpycurRec.cdnm%>
<%= issu_cmpycurRec.cd_abrv_nm%>
<%= issu_cmpycurRec.cdnm_cd%>
<%= issu_cmpycurRec.cdabrvnm_cd%>
<%= hndlmedi_clsfcurRec.cd%>
<%= hndlmedi_clsfcurRec.cdnm%>
<%= hndlmedi_clsfcurRec.cd_abrv_nm%>
<%= hndlmedi_clsfcurRec.cdnm_cd%>
<%= hndlmedi_clsfcurRec.cdabrvnm_cd%>
<%= rate_basicurRec.cd%>
<%= rate_basicurRec.cdnm%>
<%= rate_basicurRec.cd_abrv_nm%>
<%= rate_basicurRec.cdnm_cd%>
<%= rate_basicurRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 15:04:08 KST 2009 */