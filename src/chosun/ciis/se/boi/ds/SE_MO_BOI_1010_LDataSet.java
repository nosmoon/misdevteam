/***************************************************************************************************
* 파일명 : SE_MO_BOI_1010_LDataSet.java_모바일용
* 기능 : 센터관리-센터정보관리-리스트
* 작성일자 : 2017-02-07
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 *
 */


public class SE_MO_BOI_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_MO_BOI_1010_LDataSet(){}
	public SE_MO_BOI_1010_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SE_MO_BOI_1010_LCURLISTRecord rec = new SE_MO_BOI_1010_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.bo_head_prn = Util.checkString(rset0.getString("bo_head_prn"));
			rec.chrg_flnm = Util.checkString(rset0.getString("chrg_flnm"));
			rec.bo_telno = Util.checkString(rset0.getString("bo_telno"));
			rec.bo_cntr_dt = Util.checkString(rset0.getString("bo_cntr_dt"));
			rec.cntr_statnm = Util.checkString(rset0.getString("cntr_statnm"));
			rec.bo_reg_clsf = Util.checkString(rset0.getString("bo_reg_clsf"));
			rec.bo_reg_clsf_nm = Util.checkString(rset0.getString("bo_reg_clsf_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			this.curlist.add(rec);
		}
	}

	public String curlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_BOI_1010_LCURLISTRecord rec = (SE_MO_BOI_1010_LCURLISTRecord)curlist.get(i);


			String code = rec.dept_nm;
			String name = rec.part_nm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String curlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_BOI_1010_LCURLISTRecord rec = (SE_MO_BOI_1010_LCURLISTRecord)curlist.get(i);


			String code = rec.dept_nm;
			String name = rec.part_nm;

			sb.append("<input name=\"");
			sb.append("dept_nm");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String curlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_BOI_1010_LCURLISTRecord rec = (SE_MO_BOI_1010_LCURLISTRecord)curlist.get(i);


			String code = rec.dept_nm;
			String name = rec.part_nm;

			sb.append("<input name=\"");
			sb.append("dept_nm");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_MO_BOI_1010_LDataSet ds = (SE_MO_BOI_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_MO_BOI_1010_LCURLISTRecord curlistRec = (SE_MO_BOI_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.bo_cd%>
<%= curlistRec.bo_seq%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_head_prn%>
<%= curlistRec.chrg_flnm%>
<%= curlistRec.bo_telno%>
<%= curlistRec.bo_cntr_dt%>
<%= curlistRec.cntr_statnm%>
<%= curlistRec.bo_reg_clsf%>
<%= curlistRec.bo_reg_clsf_nm%>
<%= curlistRec.ern%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 07 14:46:04 KST 2017 */