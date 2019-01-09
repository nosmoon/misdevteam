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


package chosun.ciis.hd.appmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1009_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_caption40;
	public String xx_job_clsf_01;
	public String xx_cd_clsf_010;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_cd_030;
	public String xx_cd_040;
	public String xx_cd_050;
	public String xx_mang_cd_5;

	public HD_APPMT_1009_MDataSet(){}
	public HD_APPMT_1009_MDataSet(String errcode, String errmsg, String xx_caption40, String xx_job_clsf_01, String xx_cd_clsf_010, String xx_cd_010, String xx_cd_020, String xx_cd_030, String xx_cd_040, String xx_cd_050, String xx_mang_cd_5){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_caption40 = xx_caption40;
		this.xx_job_clsf_01 = xx_job_clsf_01;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_cd_030 = xx_cd_030;
		this.xx_cd_040 = xx_cd_040;
		this.xx_cd_050 = xx_cd_050;
		this.xx_mang_cd_5 = xx_mang_cd_5;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_caption40(String xx_caption40){
		this.xx_caption40 = xx_caption40;
	}

	public void setXx_job_clsf_01(String xx_job_clsf_01){
		this.xx_job_clsf_01 = xx_job_clsf_01;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_cd_030(String xx_cd_030){
		this.xx_cd_030 = xx_cd_030;
	}

	public void setXx_cd_040(String xx_cd_040){
		this.xx_cd_040 = xx_cd_040;
	}

	public void setXx_cd_050(String xx_cd_050){
		this.xx_cd_050 = xx_cd_050;
	}

	public void setXx_mang_cd_5(String xx_mang_cd_5){
		this.xx_mang_cd_5 = xx_mang_cd_5;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_caption40(){
		return this.xx_caption40;
	}

	public String getXx_job_clsf_01(){
		return this.xx_job_clsf_01;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_cd_030(){
		return this.xx_cd_030;
	}

	public String getXx_cd_040(){
		return this.xx_cd_040;
	}

	public String getXx_cd_050(){
		return this.xx_cd_050;
	}

	public String getXx_mang_cd_5(){
		return this.xx_mang_cd_5;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			HD_APPMT_1009_MCURLISTRecord rec = new HD_APPMT_1009_MCURLISTRecord();
			rec.cd_type = Util.checkString(rset0.getString("cd_type"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist.add(rec);
		}
		this.xx_caption40 = Util.checkString(cstmt.getString(6));
		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(7));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(8));
		this.xx_cd_010 = Util.checkString(cstmt.getString(9));
		this.xx_cd_020 = Util.checkString(cstmt.getString(10));
		this.xx_cd_030 = Util.checkString(cstmt.getString(11));
		this.xx_cd_040 = Util.checkString(cstmt.getString(12));
		this.xx_cd_050 = Util.checkString(cstmt.getString(13));
		this.xx_mang_cd_5 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_APPMT_1009_MDataSet ds = (HD_APPMT_1009_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_APPMT_1009_MCURLISTRecord curlistRec = (HD_APPMT_1009_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_caption40()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_cd_030()%>
<%= ds.getXx_cd_040()%>
<%= ds.getXx_cd_050()%>
<%= ds.getXx_mang_cd_5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd_type%>
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 12 11:39:30 KST 2014 */