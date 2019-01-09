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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9708_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9708_LDataSet(){}
	public HD_AFFR_9708_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			System.out.println("222222222");
			HD_AFFR_9708_LCURLISTRecord rec = new HD_AFFR_9708_LCURLISTRecord();
			rec.prstlm_desty = Util.checkString(rset0.getString("prstlm_desty"));
			System.out.println(Util.checkString(rset0.getString("prstlm_desty")));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRZ_1301_LDataSet ds = (HD_PRZ_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRZ_1301_LCURLISTRecord curlistRec = (HD_PRZ_1301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rnum%>
<%= curlistRec.aplc_clsf_nm%>
<%= curlistRec.obj_clsf_nm%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.req_pers_flnm%>
<%= curlistRec.req_pers_dept_nm%>
<%= curlistRec.case_nm%>
<%= curlistRec.atic_pubc_dt%>
<%= curlistRec.atic_pubc_side%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.tms%>
<%= curlistRec.prv_insp_dt%>
<%= curlistRec.prv_insp_ocom%>
<%= curlistRec.prv_insp_resn%>
<%= curlistRec.main_insp_dt%>
<%= curlistRec.main_insp_ocom%>
<%= curlistRec.prz_pnsh_cd_nm%>
<%= curlistRec.prz_grad%>
<%= curlistRec.prz_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */