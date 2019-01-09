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


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1010_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String preng_cnt;

	public AD_RES_1010_SDataSet(){}
	public AD_RES_1010_SDataSet(String errcode, String errmsg, String preng_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.preng_cnt = preng_cnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPreng_cnt(String preng_cnt){
		this.preng_cnt = preng_cnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPreng_cnt(){
		return this.preng_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.preng_cnt = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_RES_1010_SCURLISTRecord rec = new AD_RES_1010_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.sect_clas_cd = Util.checkString(rset0.getString("sect_clas_cd"));
			rec.sect_nm_cd = Util.checkString(rset0.getString("sect_nm_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.edt_clsf = Util.checkString(rset0.getString("edt_clsf"));
			rec.bgn_side = Util.checkString(rset0.getString("bgn_side"));
			rec.end_side = Util.checkString(rset0.getString("end_side"));
			rec.issu_size = Util.checkString(rset0.getString("issu_size"));
			rec.issu_cnt = Util.checkString(rset0.getString("issu_cnt"));
			rec.tabl_clsf = Util.checkString(rset0.getString("tabl_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1010_SDataSet ds = (AD_RES_1010_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1010_SCURLISTRecord curlistRec = (AD_RES_1010_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPreng_cnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.issu_dt%>
<%= curlistRec.sect_clas_cd%>
<%= curlistRec.sect_nm_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.edt_clsf%>
<%= curlistRec.bgn_side%>
<%= curlistRec.end_side%>
<%= curlistRec.issu_size%>
<%= curlistRec.issu_cnt%>
<%= curlistRec.tabl_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 28 18:11:10 KST 2017 */