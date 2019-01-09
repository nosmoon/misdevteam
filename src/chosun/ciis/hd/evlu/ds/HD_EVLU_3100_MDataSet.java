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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_evlu_step_clsf;

	public HD_EVLU_3100_MDataSet(){}
	public HD_EVLU_3100_MDataSet(String errcode, String errmsg, String xx_evlu_step_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_evlu_step_clsf = xx_evlu_step_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_evlu_step_clsf(String xx_evlu_step_clsf){
		this.xx_evlu_step_clsf = xx_evlu_step_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_evlu_step_clsf(){
		return this.xx_evlu_step_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_EVLU_3100_MCURLISTRecord rec = new HD_EVLU_3100_MCURLISTRecord();
			rec.evlu_grad_cd = Util.checkString(rset0.getString("evlu_grad_cd"));
			rec.evlu_grad_nm = Util.checkString(rset0.getString("evlu_grad_nm"));
			this.curlist.add(rec);
		}
		this.xx_evlu_step_clsf = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3100_MDataSet ds = (HD_EVLU_3100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3100_MCURLISTRecord curlistRec = (HD_EVLU_3100_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_evlu_step_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.evlu_grad_cd%>
<%= curlistRec.evlu_grad_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 21 16:01:50 KST 2012 */