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


package chosun.ciis.ad.brn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.brn.dm.*;
import chosun.ciis.ad.brn.rec.*;

/**
 * 
 */


public class AD_BRN_1900_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String preng_advt_bo;
	public String dlco_nm;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;

	public AD_BRN_1900_MDataSet(){}
	public AD_BRN_1900_MDataSet(String errcode, String errmsg, String preng_advt_bo, String dlco_nm, String slcrg_pers, String slcrg_pers_nm, String mchrg_pers, String mchrg_pers_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.preng_advt_bo = preng_advt_bo;
		this.dlco_nm = dlco_nm;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPreng_advt_bo(String preng_advt_bo){
		this.preng_advt_bo = preng_advt_bo;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPreng_advt_bo(){
		return this.preng_advt_bo;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.preng_advt_bo = Util.checkString(cstmt.getString(4));
		this.dlco_nm = Util.checkString(cstmt.getString(5));
		this.slcrg_pers = Util.checkString(cstmt.getString(6));
		this.slcrg_pers_nm = Util.checkString(cstmt.getString(7));
		this.mchrg_pers = Util.checkString(cstmt.getString(8));
		this.mchrg_pers_nm = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_BRN_1900_MCURLISTRecord rec = new AD_BRN_1900_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BRN_1900_MDataSet ds = (AD_BRN_1900_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BRN_1900_MCURLISTRecord curlistRec = (AD_BRN_1900_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPreng_advt_bo()%>
<%= ds.getDlco_nm()%>
<%= ds.getSlcrg_pers()%>
<%= ds.getSlcrg_pers_nm()%>
<%= ds.getMchrg_pers()%>
<%= ds.getMchrg_pers_nm()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 10 16:37:37 KST 2009 */