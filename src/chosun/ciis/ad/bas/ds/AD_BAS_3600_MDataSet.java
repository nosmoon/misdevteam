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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_3 = new ArrayList();
	public ArrayList curlist_2 = new ArrayList();
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_medi_clsf_001;

	public AD_BAS_3600_MDataSet(){}
	public AD_BAS_3600_MDataSet(String errcode, String errmsg, String xx_medi_clsf_001){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_medi_clsf_001 = xx_medi_clsf_001;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_medi_clsf_001(String xx_medi_clsf_001){
		this.xx_medi_clsf_001 = xx_medi_clsf_001;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_medi_clsf_001(){
		return this.xx_medi_clsf_001;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_medi_clsf_001 = Util.checkString(cstmt.getString(4));
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_BAS_3600_MCURLIST_1Record rec = new AD_BAS_3600_MCURLIST_1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist_1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_BAS_3600_MCURLIST_2Record rec = new AD_BAS_3600_MCURLIST_2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist_2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_BAS_3600_MCURLIST_3Record rec = new AD_BAS_3600_MCURLIST_3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.curlist_3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3600_MDataSet ds = (AD_BAS_3600_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		AD_BAS_3600_MCURLIST_1Record curlist_1Rec = (AD_BAS_3600_MCURLIST_1Record)ds.curlist_1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_2.size(); i++){
		AD_BAS_3600_MCURLIST_2Record curlist_2Rec = (AD_BAS_3600_MCURLIST_2Record)ds.curlist_2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_3.size(); i++){
		AD_BAS_3600_MCURLIST_3Record curlist_3Rec = (AD_BAS_3600_MCURLIST_3Record)ds.curlist_3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_medi_clsf_001()%>
<%= ds.getCurlist_1()%>
<%= ds.getCurlist_2()%>
<%= ds.getCurlist_3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_1Rec.cd%>
<%= curlist_1Rec.cdnm%>
<%= curlist_1Rec.cd_abrv_nm%>
<%= curlist_2Rec.cd%>
<%= curlist_2Rec.cdnm%>
<%= curlist_2Rec.cd_abrv_nm%>
<%= curlist_3Rec.cd%>
<%= curlist_3Rec.cdnm%>
<%= curlist_3Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 19 15:38:53 KST 2012 */