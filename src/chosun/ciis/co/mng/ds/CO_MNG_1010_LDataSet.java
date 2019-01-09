/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.mng.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.mng.dm.*;
import chosun.ciis.co.mng.rec.*;
import chosun.ciis.co.base.util.*;

/**
 * 
 */


public class CO_MNG_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist 	= new ArrayList();
	public String errcode;
	public String errmsg;
	public String menuId;
	public String menuNm;
	
	public CO_MNG_1010_LDataSet(){}
	public CO_MNG_1010_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
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
		this.errcode 	= Util.checkString(cstmt.getString(1));
		this.errmsg 	= Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_MNG_1010_LCURLISTRecord rec = new CO_MNG_1010_LCURLISTRecord();
			rec.acct_cd 		= Util.checkString(rset0.getString("acct_cd"      ));
			rec.menu_id	     	= Util.checkString(rset0.getString("menu_id"      ));
			rec.exctl_catl   	= Util.checkString(rset0.getString("exctl_catl"   ));
			rec.supr_menu_id 	= Util.checkString(rset0.getString("supr_menu_id" ));
			rec.menu_levl    	= Util.checkString(rset0.getString("menu_levl"    ));
			rec.menu_seqo    	= Util.checkString(rset0.getString("menu_seqo"    ));
			rec.menu_nm      	= Util.checkString(rset0.getString("menu_nm"      ));
			rec.exec_url     	= Util.checkString(rset0.getString("exec_url"     ));
			rec.role_id      	= Util.checkString(rset0.getString("role_id"      ));
			
			rec.menu_nm			= StringUtil.replaceToXml(rec.menu_nm);
			rec.exec_url		= StringUtil.replaceToXml(rec.exec_url);
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_SND_1000_MDataSet ds = (SE_SND_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_1000_MCURLISTRecord curlistRec = (SE_SND_1000_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.routelist.size(); i++){
		SE_SND_1000_MROUTELISTRecord routelistRec = (SE_SND_1000_MROUTELISTRecord)ds.routelist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getRoutelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= routelistRec.cd%>
<%= routelistRec.cdnm%>
<%= routelistRec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 02 12:10:07 KST 2009 */