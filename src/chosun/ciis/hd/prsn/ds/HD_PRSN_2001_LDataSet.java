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


package chosun.ciis.hd.prsn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_annc_clsf;

	public HD_PRSN_2001_LDataSet(){}
	public HD_PRSN_2001_LDataSet(String errcode, String errmsg, String xx_annc_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_annc_clsf(String xx_annc_clsf){
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_annc_clsf(){
		return this.xx_annc_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_PRSN_2001_LCURLISTRecord rec = new HD_PRSN_2001_LCURLISTRecord();
			rec.pgm_id = Util.checkString(rset0.getString("pgm_id"));
			rec.pgm_nm = Util.checkString(rset0.getString("pgm_nm"));
			rec.pgm_url = Util.checkString(rset0.getString("pgm_url"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.annc_link_clsf = Util.checkString(rset0.getString("annc_link_clsf"));
			this.curlist.add(rec);
		}
		this.xx_annc_clsf = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRSN_2001_LDataSet ds = (HD_PRSN_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRSN_2001_LCURLISTRecord curlistRec = (HD_PRSN_2001_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_annc_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pgm_id%>
<%= curlistRec.pgm_nm%>
<%= curlistRec.pgm_url%>
<%= curlistRec.job_clsf%>
<%= curlistRec.annc_link_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 20 18:10:43 KST 2012 */