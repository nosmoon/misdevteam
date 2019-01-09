/***************************************************************************************************
* ���ϸ� : SE_MO_SND_1811_LDataSet.java
* ��� : �Ǹ� - �߼۰���-�뼱����-�뼱��ȸ_����Ͽ�
 * �ۼ����� : 2017-01-07
 * �ۼ��� :   �弱��
***************************************************************************************************
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 *
 */


public class SE_MO_SND_1811_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_MO_SND_1811_LDataSet(){}
	public SE_MO_SND_1811_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SE_MO_SND_1811_LCURLISTRecord rec = new SE_MO_SND_1811_LCURLISTRecord();
			rec.route_cd = Util.checkString(rset0.getString("route_cd"));
			rec.route_nm = Util.checkString(rset0.getString("route_nm"));
			rec.plac_nm = Util.checkString(rset0.getString("plac_nm"));
			rec.send_rank = Util.checkString(rset0.getString("send_rank"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.route_seq = Util.checkString(rset0.getString("route_seq"));
			this.curlist.add(rec);
		}
	}

	public String curlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curlist.size();
		for(int i=0; i<size; i++){
			SE_MO_SND_1811_LCURLISTRecord rec = (SE_MO_SND_1811_LCURLISTRecord)curlist.get(i);


			String code = rec.route_cd;
			String name = rec.route_nm;

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
			SE_MO_SND_1811_LCURLISTRecord rec = (SE_MO_SND_1811_LCURLISTRecord)curlist.get(i);


			String code = rec.route_cd;
			String name = rec.route_nm;

			sb.append("<input name=\"");
			sb.append("route_cd");
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
			SE_MO_SND_1811_LCURLISTRecord rec = (SE_MO_SND_1811_LCURLISTRecord)curlist.get(i);


			String code = rec.route_cd;
			String name = rec.route_nm;

			sb.append("<input name=\"");
			sb.append("route_cd");
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
	SE_MO_SND_1811_LDataSet ds = (SE_MO_SND_1811_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_MO_SND_1811_LCURLISTRecord curlistRec = (SE_MO_SND_1811_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.route_cd%>
<%= curlistRec.route_nm%>
<%= curlistRec.plac_nm%>
<%= curlistRec.send_rank%>
<%= curlistRec.addr%>
<%= curlistRec.route_seq%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 09 10:25:36 KST 2017 */