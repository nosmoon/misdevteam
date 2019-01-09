/**
 * 
 * java file comment 한글
 *
 **/ 


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_1050_MCURLISTRecord;

/**
 * 
 * java clsss comment 한글
 *
 **/

public class AD_BAS_1050_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	
	public String errcode;
	public String errmsg;

	public AD_BAS_1050_MDataSet(){}
	public AD_BAS_1050_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode))			return;
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			AD_BAS_1050_MCURLISTRecord rec = new AD_BAS_1050_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			AD_BAS_1050_MCURLISTRecord rec = new AD_BAS_1050_MCURLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			AD_BAS_1050_MCURLISTRecord rec = new AD_BAS_1050_MCURLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			AD_BAS_1050_MCURLISTRecord rec = new AD_BAS_1050_MCURLISTRecord();
			rec.cd = Util.checkString(rset3.getString("acct_id"));
			rec.cdnm = Util.checkString(rset3.getString("acct_nm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			AD_BAS_1050_MCURLISTRecord rec = new AD_BAS_1050_MCURLISTRecord();
			rec.cd = Util.checkString(rset4.getString("acct_id"));
			rec.cdnm = Util.checkString(rset4.getString("acct_nm"));
			this.curlist5.add(rec);
		}
	}

	public String curlist1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist1.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist1.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
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

	public String curlist2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist2.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist2.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
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

	public String curlist3OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist3.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist3.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
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

	public String curlist4OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist4.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist4.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
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

	public String curlist5OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist5.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist5.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
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
	
	public String curlist1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist1.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist1.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist2.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist2.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist3ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist3.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist3.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist4ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist4.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist4.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist5ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist5.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist5.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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
	
	public String curlist1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist1.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist1.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist2.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist2.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist3RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist3.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist3.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist4RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist4.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist4.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String curlist5RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist5.size();
		for(int i=0; i<size; i++){
			AD_BAS_1050_MCURLISTRecord rec = (AD_BAS_1050_MCURLISTRecord)curlist5.get(i);
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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
	AD_BAS_1000_MDataSet ds = (AD_BAS_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1000_MCURLIST1Record curlist1Rec = (AD_BAS_1000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1000_MCURLIST2Record curlist2Rec = (AD_BAS_1000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_1000_MCURLIST3Record curlist3Rec = (AD_BAS_1000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_1000_MCURLIST4Record curlist4Rec = (AD_BAS_1000_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_1000_MCURLIST5Record curlist5Rec = (AD_BAS_1000_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 13 10:33:13 KST 2009 */