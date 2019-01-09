/***************************************************************************************************
* ���ϸ� : SS_L_MIGLBASIDataSet.java
* ��� : ������-���ϸ���-���ޱ���-����� ���� DataSet
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-���ϸ���-���ޱ���-����� ���� DataSet
 */

public class SS_L_MIGLBASIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MIGLBASIDataSet(){}
	public SS_L_MIGLBASIDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_MIGLBASICURCOMMLISTRecord rec = new SS_L_MIGLBASICURCOMMLISTRecord();
			rec.cmpy = Util.checkString(rset0.getString("cmpy"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.payclsf = Util.checkString(rset0.getString("payclsf"));
			rec.paybasi = Util.checkString(rset0.getString("paybasi"));
			rec.pont = Util.checkString(rset0.getString("pont"));
			rec.pontrate = Util.checkString(rset0.getString("pontrate"));
			rec.hdqtallmratio = Util.checkString(rset0.getString("hdqtallmratio"));
			rec.boallmratio = Util.checkString(rset0.getString("boallmratio"));
			rec.adjmexchrate = Util.checkString(rset0.getString("adjmexchrate"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.payclsfcd = Util.checkString(rset0.getString("payclsfcd"));
			rec.paybasicd = Util.checkString(rset0.getString("paybasicd"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(10);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASICURCOMMLISTRecord rec = (SS_L_MIGLBASICURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cmpy;
			String name = rec.medinm;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASICURCOMMLISTRecord rec = (SS_L_MIGLBASICURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cmpy;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("cmpy");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASICURCOMMLISTRecord rec = (SS_L_MIGLBASICURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cmpy;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("cmpy");
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_MIGLBASIDataSet ds = (SS_L_MIGLBASIDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGLBASICURCOMMLISTRecord curcommlistRec = (SS_L_MIGLBASICURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.cmpy%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.payclsf%>
<%= curcommlistRec.paybasi%>
<%= curcommlistRec.pont%>
<%= curcommlistRec.pontrate%>
<%= curcommlistRec.hdqtallmratio%>
<%= curcommlistRec.boallmratio%>
<%= curcommlistRec.adjmexchrate%>
<%= curcommlistRec.cmpycd%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.payclsfcd%>
<%= curcommlistRec.paybasicd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 20 21:44:49 KST 2004 */